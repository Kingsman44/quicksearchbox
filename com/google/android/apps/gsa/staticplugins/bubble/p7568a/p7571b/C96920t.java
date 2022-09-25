package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6848e.C86695q;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88403aa;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.shared.p7066m.C90003bi;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.bubble.p7575b.C96947a;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40126e;
import com.google.android.libraries.search.rendering.xuikit.bubbles.activity.C40093a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.b.t */
/* compiled from: PG */
public final class C96920t implements C118549h {

    /* renamed from: a */
    private static final C59071e f270919a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.a.b.t");

    /* renamed from: b */
    private final Context f270920b;

    /* renamed from: c */
    private final C86695q f270921c;

    /* renamed from: d */
    private final C86124t f270922d;

    /* renamed from: e */
    private final C96947a f270923e;

    /* renamed from: f */
    private final C91097g f270924f;

    /* renamed from: g */
    private final C68214a f270925g;

    public C96920t(Context context, C86695q qVar, C86124t tVar, C96947a aVar, C91097g gVar, C68214a aVar2) {
        this.f270920b = context;
        this.f270921c = qVar;
        this.f270922d = tVar;
        this.f270923e = aVar;
        this.f270924f = gVar;
        this.f270925g = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        if (!this.f270922d.mo79746e(C90003bi.f246869e)) {
            return C118826c.f331423b;
        }
        C62940bt r0 = C62942bv.checkIsLite(C96917q.f270903d);
        akVar.mo58887l(r0);
        if (!akVar.f169962ag.mo58857o(r0.f169971d)) {
            ((C59052c) ((C59052c) f270919a.mo56225c()).mo56372aa(18318)).mo56386p("Task parameters without trigger bubble extension.");
            return C118826c.f331423b;
        }
        C62940bt r02 = C62942bv.checkIsLite(C96917q.f270903d);
        akVar.mo58887l(r02);
        Object l = akVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C96917q qVar = (C96917q) obj;
        if (((C84474e) this.f270925g.mo27525b()).mo78089ac()) {
            C96947a aVar = this.f270923e;
            C88474x xVar = qVar.f270906b;
            if (xVar == null) {
                xVar = C88474x.f239172h;
            }
            Optional a = aVar.mo65584a(xVar).mo90383a();
            if (a.isEmpty()) {
                ((C59052c) ((C59052c) f270919a.mo56225c()).mo56372aa(18317)).mo56386p("Unable to build Sports bubble launch params for autobubble");
                return C118826c.f331423b;
            }
            this.f270924f.mo65089a(C40093a.m69617a(this.f270920b, (C40126e) a.get()));
        } else {
            C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
            C62940bt btVar = C88403aa.f239030a;
            C88474x xVar2 = qVar.f270906b;
            if (xVar2 == null) {
                xVar2 = C88474x.f239172h;
            }
            baVar.mo58885m(btVar, xVar2);
            this.f270921c.mo80275j("bubble", (C88431bb) baVar.build());
        }
        return C118826c.f331423b;
    }
}
