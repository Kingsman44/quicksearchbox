package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.internal.training.C144791ab;
import com.google.android.gms.learning.internal.training.C144796ag;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.play.core.p3538g.C45188w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.ao */
/* compiled from: PG */
public final class C100988ao extends C100982ai {

    /* renamed from: e */
    public static final C59071e f282061e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.ipc.service.ao");

    /* renamed from: f */
    public final AtomicBoolean f282062f = new AtomicBoolean(false);

    public C100988ao(Context context, Executor executor, C19435g gVar) {
        super(context, executor, gVar);
    }

    /* renamed from: c */
    private final boolean m167218c() {
        return C45188w.m80459a(this.f282053b).mo49000g().contains("fedora_brella_feature_module");
    }

    /* renamed from: a */
    public final C60870cx mo92127a() {
        this.f282055d.mo24621c("Fedora.Brella.SplitApkStatus.UnRegister", m167218c() ? 1 : 0);
        C146006ab a = C144791ab.m235321b(this.f282053b, this.f282054c).mo122482a(this.f282054c, C100976ac.f282046a);
        a.mo122499r(C100977ad.f282047a);
        a.mo122498q(C100978ae.f282048a);
        C60870cx b = C43205e.m76192b(a);
        C100979af afVar = C100979af.f282049a;
        return C60922j.m93044g(b, C47810es.m84963c(afVar), this.f282054c);
    }

    /* renamed from: b */
    public final C60870cx mo92128b(InAppTrainerOptions inAppTrainerOptions) {
        boolean c = m167218c();
        this.f282055d.mo24621c("Fedora.Brella.SplitApkStatus.Register", c ? 1 : 0);
        if (c) {
            this.f282055d.mo24619a("Fedora.Brella.NumRegisterTraining");
            C146006ab a = C144796ag.m235326b(this.f282053b, this.f282054c, inAppTrainerOptions).mo122482a(this.f282054c, C100980ag.f282050a);
            a.mo122499r(new C100981ah(inAppTrainerOptions));
            a.mo122498q(new C100974aa(inAppTrainerOptions));
            C60870cx b = C43205e.m76192b(a);
            C100975ab abVar = C100975ab.f282045a;
            return C60922j.m93044g(b, C47810es.m84963c(abVar), this.f282054c);
        } else if (this.f282062f.get()) {
            return C60866ct.f164955a;
        } else {
            C100742h a2 = C100742h.m166943a(new C100985al(this));
            a2.mo92039j(new C100986am(this));
            a2.mo92038i(C100987an.f282060a);
            return a2.f281631a;
        }
    }
}
