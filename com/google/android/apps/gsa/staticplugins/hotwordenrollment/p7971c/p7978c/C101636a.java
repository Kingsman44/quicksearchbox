package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.adf;
import com.google.assistant.p3897e.p3929l.p3930a.C52702bh;
import com.google.assistant.p3897e.p3929l.p3930a.C52704bj;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.a */
/* compiled from: PG */
public final class C101636a {

    /* renamed from: a */
    private final ei f283611a;

    /* renamed from: b */
    private final String f283612b;

    public C101636a(ei eiVar, C74555u uVar) {
        this.f283611a = eiVar;
        this.f283612b = uVar.mo70888f().mo70864a();
    }

    /* renamed from: a */
    public final int mo92453a(int i) {
        int a;
        if (i == 2) {
            C49891cv cvVar = this.f283611a.a(this.f283612b).f129639j;
            if (cvVar == null) {
                cvVar = C49891cv.f129647N;
            }
            if (!cvVar.f129674l) {
                return 1;
            }
            i = 2;
        }
        String str = this.f283611a.a(this.f283612b).f129636g;
        if (str.isEmpty()) {
            return 1;
        }
        if (this.f283611a.r(str, i)) {
            return 2;
        }
        if (i == 3) {
            ei eiVar = this.f283611a;
            C49879cj a2 = eiVar.a(this.f283612b);
            C49891cv cvVar2 = a2.f129639j;
            if (cvVar2 == null) {
                cvVar2 = C49891cv.f129647N;
            }
            if (cvVar2.f129655F) {
                adf b = eiVar.b(a2.f129636g);
                int a3 = C52702bh.m86695a(b.f129038g);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (!ei.m(a2, 2) || (a = C52704bj.m86696a(b.f129035d)) == 0 || a != 4 ? a3 == 1 : a3 != 3) {
                    return 2;
                }
            }
        }
        C49879cj a4 = this.f283611a.a(this.f283612b);
        if (!ei.n(a4, i) || ei.m(a4, i)) {
            return 1;
        }
        return 3;
    }
}
