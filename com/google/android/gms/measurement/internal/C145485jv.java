package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.jv */
/* compiled from: PG */
final class C145485jv implements C145494kd {

    /* renamed from: a */
    final /* synthetic */ C145488jy f393338a;

    public C145485jv(C145488jy jyVar) {
        this.f393338a = jyVar;
    }

    /* renamed from: a */
    public final void mo121066a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C145361ff ffVar = this.f393338a.f393363k;
            if (ffVar != null) {
                ffVar.mo120965ar().f392795c.mo120895b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f393338a.mo120966as().mo120960h(new C145484ju(this, str, bundle));
    }
}
