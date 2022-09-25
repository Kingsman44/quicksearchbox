package com.google.android.gms.car;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.car.ao */
/* compiled from: PG */
final class C143103ao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CarComponentActivity f388170a;

    public C143103ao(CarComponentActivity carComponentActivity) {
        this.f388170a = carComponentActivity;
    }

    public final void run() {
        try {
            this.f388170a.f388167g = false;
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
