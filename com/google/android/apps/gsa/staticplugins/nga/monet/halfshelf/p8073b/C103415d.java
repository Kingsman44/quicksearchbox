package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.b.d */
/* compiled from: PG */
public final class C103415d implements C23113i {
    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("NgaHalfShelfContainerEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (!str.equals("onHalfShelfClicked")) {
                str.equals("onHalfShelfDismissed");
            }
        }
    }
}
