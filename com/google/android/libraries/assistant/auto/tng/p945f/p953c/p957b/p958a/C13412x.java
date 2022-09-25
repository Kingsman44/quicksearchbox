package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35624aq;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35625ar;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35646g;
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
import com.google.assistant.p3897e.p3921j.afb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.x */
/* compiled from: PG */
public final class C13412x implements C35472h {

    /* renamed from: a */
    private final Executor f41210a;

    /* renamed from: b */
    private final C35624aq f41211b;

    /* renamed from: c */
    private final C37215b f41212c;

    /* renamed from: d */
    private final C12801n f41213d;

    /* renamed from: e */
    private final C35606g f41214e;

    /* renamed from: f */
    private final C13389aa f41215f;

    public C13412x(Executor executor, C35624aq aqVar, C12801n nVar, C37215b bVar, C35606g gVar, C13389aa aaVar) {
        this.f41210a = executor;
        this.f41211b = aqVar;
        this.f41212c = bVar;
        this.f41213d = nVar;
        this.f41214e = gVar;
        this.f41215f = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f41212c.mo19974a(C37179a.f97435aG);
        if (!dyVar.f135936b.equals("notification.REPLY")) {
            mo21069b(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92899h(new C35469e(dyVar.f135936b));
        }
        try {
            Optional c = C36183e.m64585c(dyVar, "notification_reply_args", afb.f134984e.getParserForType());
            if (c.isEmpty()) {
                mo21069b(C62722b.INVALID_ARGUMENT);
                return C60856cj.m92899h(new C35467c("notification_reply_args"));
            }
            afb afb = (afb) c.get();
            try {
                C35625ar a = this.f41215f.mo21062a(afb);
                C35624aq aqVar = this.f41211b;
                C35646g gVar = new C35646g();
                gVar.f93519a = this.f41214e;
                if (a != null) {
                    gVar.f93520b = a;
                    gVar.mo39752b(afb);
                    C60870cx b = aqVar.mo39757b(aqVar.mo39756a(gVar.mo39751a()));
                    C60870cx d = this.f41213d.mo20801d(b);
                    C13410v vVar = new C13410v(this);
                    return C47638k.m84751b(C60922j.m93044g(d, C47810es.m84963c(vVar), this.f41210a), b).mo51521b(new C13411w(b), this.f41210a);
                }
                throw new NullPointerException("Null replySenderProducer");
            } catch (C35471g e) {
                mo21069b(C62722b.INVALID_ARGUMENT);
                return C60856cj.m92899h(e);
            }
        } catch (C62974ct e2) {
            mo21069b(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92899h(e2);
        }
    }

    /* renamed from: b */
    public final void mo21069b(C62722b bVar) {
        C37215b bVar2 = this.f41212c;
        C37252a c = C37179a.f97438aJ.mo40779c();
        c.mo40781e(bVar);
        bVar2.mo19974a(c);
    }
}
