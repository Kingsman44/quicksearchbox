package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.gv */
/* compiled from: PG */
final class C145404gv implements C145494kd {

    /* renamed from: a */
    final /* synthetic */ C145416hg f393107a;

    public C145404gv(C145416hg hgVar) {
        this.f393107a = hgVar;
    }

    /* renamed from: a */
    public final void mo121066a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f393107a.mo121090G("_err", bundle, str);
        } else {
            this.f393107a.mo121099m("auto", "_err", bundle);
        }
    }
}
