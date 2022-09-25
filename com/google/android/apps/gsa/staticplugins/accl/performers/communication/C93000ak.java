package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ak */
/* compiled from: PG */
public final /* synthetic */ class C93000ak implements C91078e {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f259433a;

    public /* synthetic */ C93000ak(SettableFuture settableFuture) {
        this.f259433a = settableFuture;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        SettableFuture settableFuture = this.f259433a;
        if (iArr.length == 1 && iArr[0] == 0) {
            ((C59052c) ((C59052c) C93003an.f259442a.mo56224b()).mo56372aa(13195)).mo56386p("Read contacts permission is granted.");
            settableFuture.mo57356n(true);
            return;
        }
        ((C59052c) ((C59052c) C93003an.f259442a.mo56224b()).mo56372aa(13194)).mo56386p("Read contacts permission is rejected.");
        settableFuture.mo57356n(false);
    }
}
