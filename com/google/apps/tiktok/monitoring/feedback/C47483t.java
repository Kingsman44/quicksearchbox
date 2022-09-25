package com.google.apps.tiktok.monitoring.feedback;

import android.accounts.Account;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.io.File;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.t */
/* compiled from: PG */
public final /* synthetic */ class C47483t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C47484u f123293a;

    /* renamed from: b */
    public final /* synthetic */ C47488y f123294b;

    /* renamed from: c */
    public final /* synthetic */ C47475l f123295c;

    public /* synthetic */ C47483t(C47484u uVar, C47488y yVar, C47475l lVar) {
        this.f123293a = uVar;
        this.f123294b = yVar;
        this.f123295c = lVar;
    }

    public final Object apply(Object obj) {
        C47484u uVar = this.f123293a;
        C47488y yVar = this.f123294b;
        C47475l lVar = this.f123295c;
        C47473j jVar = (C47473j) obj;
        GoogleHelp googleHelp = new GoogleHelp(yVar.mo51324c());
        googleHelp.f390767q = yVar.mo51322a();
        C58485gu b = yVar.mo51323b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C47487x xVar = (C47487x) b.get(i);
            googleHelp.f390768r.add(new OverflowMenuItem(xVar.mo51340a(), xVar.mo51342c(), xVar.mo51341b()));
        }
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.f390592a = 3;
        googleHelp.f390769s = themeSettings;
        if (jVar.mo51301a().mo56113h()) {
            googleHelp.f390753c = new Account((String) jVar.mo51301a().mo56107c(), "com.google");
        }
        googleHelp.mo119807b(uVar.f123297b.mo51337b(lVar, jVar), new File(uVar.f123296a.getCacheDir(), "feedback"));
        return googleHelp.mo119806a();
    }
}
