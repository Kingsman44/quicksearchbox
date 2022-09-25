package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.content.Intent;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101862c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.o */
/* compiled from: PG */
public final class C101706o {

    /* renamed from: a */
    public static final C59071e f283791a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.o");

    /* renamed from: b */
    public final C68214a f283792b;

    /* renamed from: c */
    public final C68214a f283793c;

    /* renamed from: d */
    public final C74555u f283794d;

    /* renamed from: e */
    public final C101860a f283795e;

    /* renamed from: f */
    public final C101862c f283796f;

    /* renamed from: g */
    final C101770j f283797g;

    /* renamed from: h */
    public final C101702k f283798h;

    /* renamed from: i */
    public final C92380d f283799i;

    /* renamed from: j */
    public final C101646aj f283800j;

    /* renamed from: k */
    public final String f283801k;

    /* renamed from: l */
    private final C22871g f283802l;

    public C101706o(C101702k kVar, C92380d dVar, C68214a aVar, C68214a aVar2, C74555u uVar, C101860a aVar3, C101862c cVar, C22871g gVar, C101770j jVar, C101646aj ajVar, String str) {
        this.f283794d = uVar;
        this.f283795e = aVar3;
        this.f283796f = cVar;
        this.f283793c = aVar;
        this.f283792b = aVar2;
        this.f283797g = jVar;
        this.f283802l = gVar;
        this.f283798h = kVar;
        this.f283799i = dVar;
        this.f283800j = ajVar;
        this.f283801k = str;
    }

    /* renamed from: a */
    public final void mo92514a(int i, Intent intent) {
        C92362c cVar;
        C89849ae aeVar;
        if (i == 2) {
            if (!(intent == null || (cVar = (C92362c) intent.getSerializableExtra("assistant_enrollment_error")) == null)) {
                C101773m mVar = C101773m.DEVICE_SCAN;
                if (cVar.ordinal() == 5) {
                    if (this.f283795e.f284134a.get()) {
                        aeVar = C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_FAILED;
                    } else {
                        aeVar = C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_FAILED;
                    }
                    ((C89859i) this.f283793c.mo27525b()).mo83702b(aeVar);
                }
            }
            i = 2;
        }
        this.f283797g.mo92569b(i, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo92515b() {
        this.f283802l.mo28212l("show next", C101873d.m168557b(new C101704m(this)));
    }

    /* renamed from: c */
    public final void mo92516c(C101773m mVar, boolean z) {
        this.f283797g.mo92572e(this.f283798h, mVar, z);
    }
}
