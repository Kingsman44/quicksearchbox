package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ax */
/* compiled from: PG */
public final /* synthetic */ class C93013ax implements C91078e {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f259467a;

    public /* synthetic */ C93013ax(SettableFuture settableFuture) {
        this.f259467a = settableFuture;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        SettableFuture settableFuture = this.f259467a;
        if (iArr.length == 1 && iArr[0] == 0) {
            ((C59052c) ((C59052c) C93015az.f259469a.mo56224b()).mo56372aa(13204)).mo56386p("answer permission is granted.");
            settableFuture.mo57356n(true);
            return;
        }
        ((C59052c) ((C59052c) C93015az.f259469a.mo56224b()).mo56372aa(13203)).mo56386p("answer permission is rejected.");
        settableFuture.mo57356n(false);
    }
}
