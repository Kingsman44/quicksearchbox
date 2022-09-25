package com.google.android.setupdesign.p3555d;

import com.google.android.setupcompat.p3549a.C45238a;

/* renamed from: com.google.android.setupdesign.d.e */
/* compiled from: PG */
public enum C45297e {
    CONFIG_DEFAULT(C45238a.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT),
    CONFIG_ACCOUNT(C45238a.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT),
    CONFIG_CONNECTION(C45238a.CONFIG_PROGRESS_ILLUSTRATION_CONNECTION),
    CONFIG_UPDATE(C45238a.CONFIG_PROGRESS_ILLUSTRATION_UPDATE);

    private C45297e(C45238a aVar) {
        if (aVar.f118156bs != 8) {
            throw new IllegalArgumentException("Illustration progress only allow illustration resource");
        }
    }
}
