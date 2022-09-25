package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a;

import android.content.Intent;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101771k;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.j */
/* compiled from: PG */
public final class C101599j {

    /* renamed from: a */
    public static final C59071e f283494a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.j");

    /* renamed from: b */
    public final C68214a f283495b;

    /* renamed from: c */
    public final C68214a f283496c;

    /* renamed from: d */
    public final C74555u f283497d;

    /* renamed from: e */
    public final C101860a f283498e;

    /* renamed from: f */
    final C101770j f283499f;

    /* renamed from: g */
    public final C101595f f283500g;

    /* renamed from: h */
    public final C92380d f283501h;

    /* renamed from: i */
    public final C101771k f283502i;

    /* renamed from: j */
    private final C22871g f283503j;

    /* renamed from: k */
    private final String f283504k;

    public C101599j(C101595f fVar, C92380d dVar, C68214a aVar, C68214a aVar2, C74555u uVar, C101860a aVar3, C22871g gVar, C101770j jVar, C101580d dVar2, String str) {
        this.f283497d = uVar;
        this.f283498e = aVar3;
        this.f283496c = aVar;
        this.f283495b = aVar2;
        this.f283499f = jVar;
        this.f283503j = gVar;
        this.f283500g = fVar;
        this.f283501h = dVar;
        this.f283502i = dVar2;
        this.f283504k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo92416a(int i) {
        if (!this.f283504k.isEmpty()) {
            this.f283499f.mo92568a(this.f283504k);
            ((C89859i) this.f283496c.mo27525b()).mo83702b(C89849ae.DELETE_UTTERANCES_ON_ENROLLMENT_BAILOUT);
        }
        mo92417b(i, (Intent) null);
    }

    /* renamed from: b */
    public final void mo92417b(int i, Intent intent) {
        C92362c cVar;
        C89849ae aeVar;
        if (i == 2) {
            if (!(intent == null || (cVar = (C92362c) intent.getSerializableExtra("assistant_enrollment_error")) == null || cVar.ordinal() != 5)) {
                if (this.f283498e.f284134a.get()) {
                    aeVar = C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_FAILED;
                } else {
                    aeVar = C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_FAILED;
                }
                ((C89859i) this.f283496c.mo27525b()).mo83702b(aeVar);
            }
            i = 2;
        }
        this.f283499f.mo92569b(i, intent);
    }

    /* renamed from: c */
    public final void mo92418c() {
        WeakHashMap weakHashMap = C47831fm.f123851a;
        this.f283503j.mo28212l("show next", C101873d.m168557b(new C101597h(this)));
    }

    /* renamed from: d */
    public final void mo92419d(C101773m mVar, boolean z) {
        this.f283499f.mo92572e(this.f283500g, mVar, z);
    }
}
