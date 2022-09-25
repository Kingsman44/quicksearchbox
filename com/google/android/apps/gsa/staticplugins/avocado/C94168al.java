package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.shared.util.permissions.C91078e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.al */
/* compiled from: PG */
final class C94168al implements C91078e {

    /* renamed from: a */
    final /* synthetic */ C94170an f263045a;

    public C94168al(C94170an anVar) {
        this.f263045a = anVar;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        if (strArr.length != 1 || iArr.length != 1 || iArr[0] != 0 || !"android.permission.CAMERA".equals(strArr[0])) {
            this.f263045a.getActivity().finish();
        }
    }
}
