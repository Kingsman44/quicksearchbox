package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35599a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35648i;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35657r;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35467c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35469e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.assistant.p3897e.p3921j.aeu;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.l */
/* compiled from: PG */
public final class C13400l implements C35472h {

    /* renamed from: a */
    private final Executor f41178a;

    /* renamed from: b */
    private final C35657r f41179b;

    /* renamed from: c */
    private final C37215b f41180c;

    /* renamed from: d */
    private final C12801n f41181d;

    /* renamed from: e */
    private final C35606g f41182e;

    /* renamed from: f */
    private final C13406r f41183f;

    /* renamed from: g */
    private final C58833ax f41184g;

    /* renamed from: h */
    private final C34837a f41185h;

    public C13400l(Executor executor, C35657r rVar, C12801n nVar, C37215b bVar, C34837a aVar, C35606g gVar, C13406r rVar2, C58833ax axVar) {
        this.f41178a = executor;
        this.f41179b = rVar;
        this.f41180c = bVar;
        this.f41181d = nVar;
        this.f41185h = aVar;
        this.f41182e = gVar;
        this.f41183f = rVar2;
        this.f41184g = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f41180c.mo19974a(C37179a.f97478ax);
        if (!dyVar.f135936b.equals("notification.FETCH")) {
            mo21065b(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92899h(new C35469e(dyVar.f135936b));
        }
        try {
            Optional c = C36183e.m64585c(dyVar, "notification_fetch_args", aeu.f134959h.getParserForType());
            if (c.isEmpty()) {
                mo21065b(C62722b.INVALID_ARGUMENT);
                return C60856cj.m92899h(new C35467c("notification_fetch_args"));
            }
            aeu aeu = (aeu) c.get();
            try {
                C13406r rVar = this.f41183f;
                aet a = aet.m86300a(aeu.f134963c);
                if (a == null) {
                    a = aet.DEFAULT;
                }
                C35648i a2 = rVar.mo21061a(a, aeu.f134965e);
                C35657r rVar2 = this.f41179b;
                C35599a aVar = new C35599a();
                aVar.f93435a = this.f41182e;
                if (a2 != null) {
                    aVar.f93436b = a2;
                    aVar.mo39731b(aeu);
                    aVar.f93437c = this.f41184g;
                    aVar.f93438d = this.f41185h;
                    C60870cx a3 = rVar2.mo39782a(aVar.mo39730a());
                    C60870cx d = this.f41181d.mo20801d(a3);
                    C13398j jVar = new C13398j(this);
                    return C47638k.m84751b(C60922j.m93044g(d, C47810es.m84963c(jVar), this.f41178a), a3).mo51521b(new C13399k(a3), this.f41178a);
                }
                throw new NullPointerException("Null bundledMessageProvider");
            } catch (C35471g e) {
                mo21065b(C62722b.INVALID_ARGUMENT);
                return C60856cj.m92899h(e);
            }
        } catch (C62974ct e2) {
            mo21065b(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92899h(e2);
        }
    }

    /* renamed from: b */
    public final void mo21065b(C62722b bVar) {
        C37215b bVar2 = this.f41180c;
        C37252a c = C37179a.f97429aA.mo40779c();
        c.mo40781e(bVar);
        bVar2.mo19974a(c);
    }
}
