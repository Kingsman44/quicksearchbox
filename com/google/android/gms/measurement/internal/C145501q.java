package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* compiled from: PG */
public final class C145501q {

    /* renamed from: a */
    public final C145361ff f393402a;

    public C145501q(C145361ff ffVar) {
        this.f393402a = ffVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo121298a(String str, Bundle bundle) {
        String str2;
        this.f393402a.mo120966as().mo120904g();
        if (!this.f393402a.mo120980r()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f393402a.mo120971g().f392867t.mo120920b(str2);
                this.f393402a.mo120971g().f392868u.mo120916b(System.currentTimeMillis());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo121299b() {
        C145336eh ehVar = this.f393402a.mo120971g().f392868u;
        ehVar.mo120915a();
        return ehVar.f392834a > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo121300c() {
        if (mo121299b()) {
            long currentTimeMillis = System.currentTimeMillis();
            C145336eh ehVar = this.f393402a.mo120971g().f392868u;
            ehVar.mo120915a();
            if (currentTimeMillis - ehVar.f392834a > this.f393402a.f392937g.mo120771h((String) null, C145313dl.f392710Q)) {
                return true;
            }
        }
        return false;
    }
}
