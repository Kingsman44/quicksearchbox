package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.C83909c;
import com.google.android.apps.gsa.p5855h.p5861s.C74549c;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.p5855h.p5861s.C74557x;
import com.google.android.apps.gsa.p5855h.p5861s.C74558y;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.a */
/* compiled from: PG */
public final class C94562a extends C83907bm {

    /* renamed from: b */
    public C94568e f264502b;

    /* renamed from: c */
    public C83893b f264503c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            C83909c.m133669a(getActivity());
            C58976aa aaVar = C58975e.f156826a;
            C94568e eVar = this.f264502b;
            eVar.f264519a = C83903bi.m133649e(i2, intent);
            C83903bi biVar = eVar.f264519a;
            mo77318iT().mo77312a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C58976aa aaVar = C58975e.f156826a;
        C74554t i = C74555u.m120572i();
        ((C74549c) i).f208696b = ((Account) this.f264503c.mo77278a().mo56107c()).name;
        i.mo70869c(C9439b.ASSISTANT_GOOGLE_HOME_OOBE);
        i.mo70868b(s.b);
        C74557x c = C74558y.m120591c();
        c.mo70875b(z.c);
        i.mo70870d(c.mo70874a());
        startActivityForResult(i.mo70882h(), 100);
        C83909c.m133669a(getActivity());
    }
}
