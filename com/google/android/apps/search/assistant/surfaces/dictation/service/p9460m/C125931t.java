package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126311at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126321bb;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9484v.C126370c;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.t */
/* compiled from: PG */
public final class C125931t {

    /* renamed from: a */
    public final C125934w f347134a;

    /* renamed from: b */
    public final C125926o f347135b;

    /* renamed from: c */
    public final long f347136c;

    /* renamed from: d */
    public final long f347137d;

    /* renamed from: e */
    public final long f347138e;

    /* renamed from: f */
    public final long f347139f;

    /* renamed from: g */
    public final long f347140g;

    /* renamed from: h */
    private final C126370c f347141h;

    /* renamed from: i */
    private final C126311at f347142i;

    /* renamed from: j */
    private final boolean f347143j;

    /* renamed from: k */
    private final boolean f347144k;

    /* renamed from: l */
    private final long f347145l;

    public C125931t(C125934w wVar, C125926o oVar, C126370c cVar, C126311at atVar, boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, long j6) {
        C69664n.m101061g(wVar, "keyboardState");
        C69664n.m101061g(oVar, "eligibilityChecker");
        C69664n.m101061g(cVar, "workProfileChecker");
        this.f347134a = wVar;
        this.f347135b = oVar;
        this.f347141h = cVar;
        this.f347142i = atVar;
        this.f347143j = z;
        this.f347144k = z2;
        this.f347136c = j;
        this.f347145l = j2;
        this.f347137d = j3;
        this.f347138e = j4;
        this.f347139f = j5;
        this.f347140g = j6;
    }

    /* renamed from: a */
    public final long mo107182a() {
        return this.f347134a.f347148c.l;
    }

    /* renamed from: b */
    public final C125160i mo107183b() {
        return this.f347135b.mo107166a(this.f347134a.f347148c);
    }

    /* renamed from: c */
    public final C125930s mo107184c() {
        if (!C69664n.m101066l(mo107188g().getLanguage(), Locale.JAPANESE.getLanguage()) || (this.f347145l >= 0 && mo107182a() >= this.f347145l)) {
            return C125930s.FULL;
        }
        return C125930s.LAST_DICTATION_ONLY;
    }

    /* renamed from: d */
    public final C60870cx mo107185d() {
        C125926o oVar = this.f347135b;
        af afVar = this.f347134a.f347148c;
        C69664n.m101061g(afVar, "configurationData");
        return C71663i.m104692e(oVar.f347103a, (C71424ay) null, new C125922k(oVar, afVar, (C69577g) null), 3);
    }

    /* renamed from: e */
    public final C60870cx mo107186e(boolean z) {
        if (!z || this.f347134a.f347147b) {
            return this.f347135b.mo107168c(this.f347134a.f347148c);
        }
        return C60856cj.m92900i(C125160i.NON_ELIGIBLE_KEYBOARD_NOT_VISIBLE);
    }

    /* renamed from: f */
    public final String mo107187f() {
        String str = this.f347134a.f347148c.e;
        C69664n.m101060f(str, "keyboardState.keyboardCo…uration.foregroundPackage");
        return str;
    }

    /* renamed from: g */
    public final Locale mo107188g() {
        return this.f347142i.mo107522a(this.f347134a.f347148c);
    }

    /* renamed from: h */
    public final boolean mo107189h() {
        return C125932u.m205971c(this.f347134a.f347148c.d);
    }

    /* renamed from: i */
    public final boolean mo107190i() {
        return C125932u.m205972d(this.f347134a.f347148c.d);
    }

    /* renamed from: j */
    public final boolean mo107191j() {
        return C69664n.m101066l(mo107187f(), "com.google.android.gm");
    }

    /* renamed from: k */
    public final boolean mo107192k() {
        return C126321bb.f347984a.contains(mo107187f());
    }

    /* renamed from: l */
    public final boolean mo107193l() {
        return this.f347143j && C125932u.m205970b(this.f347134a.f347148c);
    }

    /* renamed from: m */
    public final boolean mo107194m() {
        if (C126321bb.f347988e.contains(mo107187f()) || C125932u.m205970b(this.f347134a.f347148c)) {
            return false;
        }
        if (mo107191j() && ((mo107189h() || mo107190i() || mo107197p()) && this.f347141h.f348068c.get())) {
            return false;
        }
        if (C126321bb.f347986c.contains(mo107187f()) || mo107195n() || this.f347134a.f347148c.h == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo107195n() {
        return C126321bb.f347985b.contains(mo107187f());
    }

    /* renamed from: o */
    public final boolean mo107196o() {
        if (!this.f347144k) {
            return true;
        }
        return !((C58759qy) C126321bb.f347987d).f156534a.equals(mo107187f());
    }

    /* renamed from: p */
    public final boolean mo107197p() {
        return C125932u.m205974f(this.f347134a.f347148c.d);
    }

    /* renamed from: q */
    public final boolean mo107198q(long j) {
        return j >= 0 && mo107182a() >= j;
    }
}
