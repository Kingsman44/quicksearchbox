package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.i */
/* compiled from: PG */
public final class C101619i {

    /* renamed from: a */
    public static final C59071e f283558a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.i");

    /* renamed from: b */
    public final C89994f f283559b;

    /* renamed from: c */
    public final SharedPreferences f283560c;

    /* renamed from: d */
    final C101770j f283561d;

    /* renamed from: e */
    public final C101616f f283562e;

    /* renamed from: f */
    public final C92380d f283563f;

    /* renamed from: g */
    public final C101614d f283564g;

    /* renamed from: h */
    public final String f283565h;

    /* renamed from: i */
    SpeakerIdModel f283566i;

    /* renamed from: j */
    private final C22871g f283567j;

    /* renamed from: k */
    private final C74555u f283568k;

    /* renamed from: l */
    private final C68214a f283569l;

    /* renamed from: m */
    private final C68214a f283570m;

    public C101619i(C101616f fVar, C92380d dVar, C101614d dVar2, C89994f fVar2, SharedPreferences sharedPreferences, C68214a aVar, C68214a aVar2, C74555u uVar, C22871g gVar, C101770j jVar, String str) {
        this.f283559b = fVar2;
        this.f283568k = uVar;
        this.f283560c = sharedPreferences;
        this.f283569l = aVar;
        this.f283570m = aVar2;
        this.f283561d = jVar;
        this.f283567j = gVar;
        this.f283562e = fVar;
        this.f283563f = dVar;
        this.f283564g = dVar2;
        this.f283565h = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo92442a(int i) {
        SpeakerIdModel speakerIdModel;
        if (this.f283566i == null && !this.f283565h.isEmpty()) {
            this.f283559b.mo83843F(this.f283565h, EventForDump.m147676e(8, "Exiting enrollment"));
            this.f283561d.mo92568a(this.f283565h);
            ((C89859i) this.f283570m.mo27525b()).mo83702b(C89849ae.DELETE_UTTERANCES_ON_ENROLLMENT_BAILOUT);
        } else if (!(this.f283566i == null || this.f283565h.isEmpty() || (speakerIdModel = this.f283566i) == null)) {
            this.f283559b.mo83845H(speakerIdModel, true, EventForDump.m147676e(8, "Restoring old speaker model"));
        }
        mo92443b(i, (Intent) null);
    }

    /* renamed from: b */
    public final void mo92443b(int i, Intent intent) {
        int T;
        if (this.f283568k.mo70883a().equals(C9439b.INCOMPLETE_STATE_ONBOARDING) && i != -1) {
            C92486a aVar = (C92486a) this.f283569l.mo27525b();
            if (aVar.f258089c.mo79746e(C90082eg.f249858A)) {
                synchronized (aVar) {
                    T = aVar.f258088b.mo83857T() + 1;
                    aVar.f258088b.mo83905ay(T);
                }
                if (((long) T) >= aVar.f258089c.mo79743a(C90082eg.f249953bP)) {
                    ((C59052c) ((C59052c) C92486a.f258085a.mo56224b()).mo56372aa(12623)).mo56386p("Skip threshold exceeded, disabling hotword.");
                    aVar.mo87237k(false, EventForDump.m147675d(22));
                }
            }
        }
        this.f283561d.mo92569b(i, intent);
    }

    /* renamed from: c */
    public final void mo92444c() {
        WeakHashMap weakHashMap = C47831fm.f123851a;
        this.f283567j.mo28212l("show next", C101873d.m168557b(new C101618h(this)));
    }

    /* renamed from: d */
    public final void mo92445d(C101773m mVar, boolean z) {
        this.f283561d.mo92572e(this.f283562e, mVar, z);
    }
}
