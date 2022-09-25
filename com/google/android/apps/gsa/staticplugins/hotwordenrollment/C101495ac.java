package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import com.google.android.apps.gsa.opaonboarding.p6459a.C83824ae;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83825af;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83829aj;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83831al;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92422b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.ac */
/* compiled from: PG */
public final class C101495ac {

    /* renamed from: a */
    public C92422b f283241a = null;

    /* renamed from: b */
    private final C58833ax f283242b;

    public C101495ac(C58833ax axVar) {
        this.f283242b = axVar;
    }

    /* renamed from: f */
    private static C83831al m167824f(String str) {
        C83829aj ajVar = (C83829aj) C83831al.f228455c.createBuilder();
        C83824ae aeVar = (C83824ae) C83825af.f228447c.createBuilder();
        aeVar.copyOnWrite();
        C83825af afVar = (C83825af) aeVar.instance;
        str.getClass();
        afVar.f228449a |= 1;
        afVar.f228450b = str;
        ajVar.copyOnWrite();
        C83831al alVar = (C83831al) ajVar.instance;
        C83825af afVar2 = (C83825af) aeVar.build();
        afVar2.getClass();
        alVar.f228458b = afVar2;
        alVar.f228457a = 1;
        return (C83831al) ajVar.build();
    }

    /* renamed from: a */
    public final C58833ax mo92322a(String str) {
        C58833ax axVar;
        if (C58833ax.m90833j(this.f283241a).mo56113h()) {
            return C58833ax.m90834k(m167824f(str));
        }
        if (mo92326e()) {
            axVar = C58833ax.m90834k(((C92391o) this.f283242b.mo56107c()).f257645c);
        } else {
            axVar = C58836b.f156633a;
        }
        return axVar.mo56106b(C101493aa.f283239a);
    }

    /* renamed from: b */
    public final C58833ax mo92323b(String str) {
        if (mo92326e()) {
            return C58833ax.m90834k(m167824f(str));
        }
        return mo92324c().mo56106b(C101493aa.f283239a);
    }

    /* renamed from: c */
    public final C58833ax mo92324c() {
        if (mo92326e()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90833j(this.f283241a).mo56106b(C101494ab.f283240a);
    }

    /* renamed from: d */
    public final boolean mo92325d() {
        return C58833ax.m90833j(this.f283241a).mo56113h();
    }

    /* renamed from: e */
    public final boolean mo92326e() {
        C58833ax axVar = this.f283242b;
        return axVar.mo56113h() && (((C92391o) axVar.mo56107c()).f257643a & 2) != 0;
    }
}
