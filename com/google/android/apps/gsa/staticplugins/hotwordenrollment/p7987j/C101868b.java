package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7987j;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.setupdesign.p3558f.C45315i;
import com.google.android.setupdesign.p3558f.C45316j;
import com.google.android.setupdesign.p3558f.C45317k;
import com.google.common.p4526f.C59052c;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.j.b */
/* compiled from: PG */
public final class C101868b implements C68220f {
    /* renamed from: a */
    public static Integer m168552a(C74555u uVar, Activity activity) {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 31) {
            if (C1888a.m5150d()) {
                ((C59052c) ((C59052c) C101867a.f284150a.mo56224b()).mo56372aa(20706)).mo56386p("provideSetupWizardTheme: GlifV4 Setup Wizard theme");
                i2 = true != C45315i.m80766a(activity) ? 2132150221 : 2132150220;
            } else {
                ((C59052c) ((C59052c) C101867a.f284150a.mo56224b()).mo56372aa(20704)).mo56386p("provideSetupWizardTheme: GlifV3 Setup Wizard theme");
                i2 = true != C45315i.m80766a(activity) ? 2132150218 : 2132150217;
            }
            C45317k c = C45317k.m80773c();
            int i3 = c.f118379a;
            String str = c.f118380b;
            boolean z = c.f118381c;
            C45317k a = C45316j.m80772a(i2);
            Intent intent = activity.getIntent();
            intent.getClass();
            int a2 = a.mo49238a(intent, !C45315i.m80766a(activity));
            ((C59052c) ((C59052c) C101867a.f284150a.mo56224b()).mo56372aa(20705)).mo56387q("provideSetupWizardTheme: themeResId is %d", a2);
            return Integer.valueOf(a2);
        }
        ((C59052c) ((C59052c) C101867a.f284150a.mo56224b()).mo56372aa(20703)).mo56387q("provideSetupWizardTheme: Sequence theme %s", uVar.mo70887e().mo70855c().mo70859a());
        int a3 = uVar.mo70887e().mo70855c().mo70859a();
        if (a3 == 0) {
            i = 2132150741;
        } else if (a3 == 1) {
            i = 2132149505;
        } else if (a3 == 2) {
            return 2132149506;
        } else {
            if (a3 == 5) {
                return Integer.valueOf(C45315i.m80766a(activity) ? 2132149508 : 2132149507);
            }
            int a4 = uVar.mo70887e().mo70855c().mo70859a();
            throw new IllegalArgumentException("Unknown sequenceTheme: " + a4);
        }
        return Integer.valueOf(i);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
