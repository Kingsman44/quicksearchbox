package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.app.assist.AssistContent;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.s.q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.t */
/* compiled from: PG */
public final class C77139t {

    /* renamed from: a */
    private static final C58974d f212897a = C58974d.m91136j();

    /* renamed from: b */
    private final C22871g f212898b;

    /* renamed from: c */
    private final C77089dg f212899c;

    public C77139t(C22871g gVar, C77089dg dgVar) {
        this.f212898b = gVar;
        this.f212899c = dgVar;
    }

    /* renamed from: b */
    public static Optional m123827b(af afVar, AssistContent assistContent) {
        if (!afVar.r()) {
            return afVar.n(assistContent.getIntent());
        }
        String structuredData = assistContent.getStructuredData();
        if (TextUtils.isEmpty(structuredData)) {
            ((C58970a) ((C58970a) f212897a.mo56225c()).mo56372aa(3801)).mo56386p("Missing contextual conversation data");
            return afVar.n(assistContent.getIntent());
        }
        try {
            return Optional.m71637of(new JSONObject(structuredData).getString("conversation_id"));
        } catch (JSONException e) {
            ((C58970a) ((C58970a) ((C58970a) f212897a.mo56225c()).mo56382g(e)).mo56372aa(3800)).mo56386p("Invalid contextual conversation data");
            return afVar.n(assistContent.getIntent());
        }
    }

    /* renamed from: a */
    public final C60870cx mo72447a(C77140u uVar) {
        if (!uVar.mo72407c().isPresent()) {
            ((C58970a) ((C58970a) f212897a.mo56224b()).mo56372aa(3799)).mo56386p("Empty assist content");
            uVar.mo72409e().ifPresent(new C77132m(uVar));
            return C60856cj.m92900i(Optional.empty());
        } else if (uVar.mo72410f().isPresent()) {
            Optional g = this.f212899c.mo72420g(uVar.mo72414j(), false);
            Optional flatMap = g.flatMap(new C77133n((AssistContent) uVar.mo72407c().get()));
            if (!flatMap.isPresent()) {
                return C60856cj.m92900i(Optional.empty());
            }
            af afVar = (af) g.get();
            C22871g gVar = this.f212898b;
            return gVar.mo28209i(q.a(gVar, afVar, ((df) uVar.mo72410f().get()).a(), (String) flatMap.get()), "[NGA] SendMessageFulfiller.getForegroundClientForContacts", new C77134o(afVar, flatMap));
        } else {
            AssistContent assistContent = (AssistContent) uVar.mo72407c().get();
            Optional g2 = this.f212899c.mo72420g(uVar.mo72414j(), false);
            if (!g2.isPresent()) {
                uVar.mo72409e().ifPresent(new C77135p(uVar));
                return C60856cj.m92900i(Optional.empty());
            }
            Optional flatMap2 = g2.flatMap(new C77136q(assistContent));
            if (!flatMap2.isPresent()) {
                uVar.mo72409e().ifPresent(new C77137r(uVar));
                return C60856cj.m92900i(Optional.empty());
            }
            return C60856cj.m92900i(Optional.m71637of(new C77082d(new C77128i((String) flatMap2.get(), (af) g2.get()))));
        }
    }
}
