package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C101541w implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101510ae f283366a;

    public /* synthetic */ C101541w(C101510ae aeVar) {
        this.f283366a = aeVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101510ae aeVar = this.f283366a;
        Exception exc = (Exception) obj;
        C59104x c = C101510ae.f283274a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeEnrollTaskRunner");
        ((C59052c) ((C59052c) c).mo56372aa(20307)).mo56386p("#runVerifyEnrollment - at least one device failed enrollment; disable speaker ID for all devices");
        new C90873ag(aeVar.mo92372f(false), aeVar.f283279f, "disable speaker id", new C101538t(aeVar)).mo85223a(new C101539u(aeVar));
        Context context = aeVar.f283286m;
        Toast.makeText(context, context.getString(R.string.home_hotword_enrollment_not_complete_toast), 0).show();
    }
}
