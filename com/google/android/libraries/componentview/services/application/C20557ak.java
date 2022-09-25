package com.google.android.libraries.componentview.services.application;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.services.application.ak */
/* compiled from: PG */
public class C20557ak implements C20601ca {

    /* renamed from: d */
    public final C20579bf f57735d;

    /* renamed from: e */
    public final C60887da f57736e;

    public C20557ak(C20579bf bfVar, C60887da daVar) {
        this.f57735d = bfVar;
        this.f57736e = daVar;
    }

    /* renamed from: a */
    public void mo21037a(LogData logData) {
        if (TextUtils.isEmpty(logData.mo25464g())) {
            Log.e("DefaultLogger", "ved was null or empty");
            return;
        }
        C60870cx a = this.f57735d.mo25516a();
        C60870cx b = this.f57735d.mo25517b();
        C60922j.m93045h(C60856cj.m92895d(a, b).mo57334a(new C20553ag(b, a, logData), this.f57736e), new C20554ah(this), this.f57736e);
    }

    /* renamed from: b */
    public final void mo25487b(C20599bz bzVar) {
        Log.e("DefaultLogger", "Error Code is ".concat(String.valueOf(String.valueOf(bzVar.mo25537a()))));
    }

    /* renamed from: c */
    public final void mo25488c(String str) {
        Uri parse = Uri.parse(str);
        Log.d("DefaultLogger", "Click tracking url: ".concat(String.valueOf(str)));
        this.f57735d.mo25518c(parse, (Map) null, true);
    }

    /* renamed from: d */
    public final void mo25489d(String str, String str2, String str3, Map map) {
        C60870cx a = this.f57735d.mo25516a();
        C60870cx b = this.f57735d.mo25517b();
        C60922j.m93045h(C60856cj.m92895d(a, b).mo57334a(new C20555ai(b, a, str, str2, str3, map), this.f57736e), new C20556aj(this), this.f57736e);
    }

    /* renamed from: e */
    public final void mo25490e(C60321oe oeVar) {
        Log.e("DefaultLogger", "logVisualElements is not implemented.");
    }
}
