package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7460a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94771c;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.apps.gsa.staticplugins.opa.p8181ae.C106115e;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52434rp;
import com.google.assistant.p3897e.p3921j.C52437rs;
import com.google.assistant.p3897e.p3921j.C52438rt;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.a.m */
/* compiled from: PG */
public final class C94665m extends C22538o {

    /* renamed from: a */
    public static final /* synthetic */ int f264761a = 0;

    /* renamed from: b */
    private static final C59071e f264762b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.a.m");

    /* renamed from: c */
    private final Context f264763c;

    /* renamed from: d */
    private final C94771c f264764d;

    /* renamed from: e */
    private final C68214a f264765e;

    /* renamed from: f */
    private final C94785f f264766f;

    /* renamed from: g */
    private final C22871g f264767g;

    public C94665m(Context context, C94771c cVar, C68214a aVar, C94785f fVar, C22871g gVar) {
        this.f264763c = context;
        this.f264764d = cVar;
        this.f264765e = aVar;
        this.f264766f = fVar;
        this.f264767g = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        int a;
        C94771c cVar;
        if ("device.REQUEST_PERMISSION".equals(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52438rt rtVar = (C52438rt) m41992m(dwVar, "device_request_permission_args", C52438rt.f137645h.getParserForType());
            int i = rtVar.f137647a;
            if ((i & 1) != 0) {
                String str = rtVar.f137648b;
                if (!TextUtils.isEmpty(str)) {
                    if (((str.hashCode() == -2003032073 && str.equals("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS")) ? (char) 0 : 65535) != 0) {
                        return C60856cj.m92899h(new UnsupportedOperationException("Cannot request permission for: ".concat(String.valueOf(str))));
                    }
                    C83395k.m132733d(this.f264763c);
                    Intent b = C83395k.m132731b(this.f264763c);
                    if (!(b == null || (cVar = this.f264764d) == null)) {
                        cVar.mo65089a(b);
                    }
                    return C22538o.f62144n;
                }
                throw new C22534k();
            } else if ((i & 4) != 0) {
                if ((i & 8) == 0 || (a = C52437rs.m86632a(rtVar.f137650d)) == 0 || a != 3) {
                    return C60856cj.m92899h(new UnsupportedOperationException());
                }
                C106115e eVar2 = (C106115e) this.f264765e.mo27525b();
                C55912b a2 = C55912b.m87801a(rtVar.f137649c);
                if (a2 == null) {
                    a2 = C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN;
                }
                C60870cx g = C60922j.m93044g(eVar2.mo95287a(a2), C94663k.f264759a, C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
                return g;
            } else if ((i & 16) != 0) {
                C52434rp a3 = C52434rp.m86630a(rtVar.f137651e);
                if (a3 == null) {
                    a3 = C52434rp.UNKNOWN;
                }
                if (a3 == C52434rp.PERSONAL_READOUT) {
                    C59104x b2 = f264762b.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "BistoReqPermissionPerf");
                    ((C59052c) ((C59052c) b2).mo56372aa(16827)).mo56386p("Requesting PR notification");
                    C22871g gVar = this.f264767g;
                    C94785f fVar = this.f264766f;
                    Objects.requireNonNull(fVar);
                    gVar.mo28212l("bistoPrRequestPermissionEvent", new C94664l(fVar));
                }
                return C22538o.f62144n;
            } else {
                throw new C22534k();
            }
        } else {
            throw new C22428d(dyVar);
        }
    }
}
