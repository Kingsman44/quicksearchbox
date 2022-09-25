package com.google.android.apps.gsa.staticplugins.nga.p8092ui.account;

import android.app.KeyguardManager;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.account.e */
/* compiled from: PG */
final class C104145e extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ PrimaryAccountFixActivity f289700a;

    public C104145e(PrimaryAccountFixActivity primaryAccountFixActivity) {
        this.f289700a = primaryAccountFixActivity;
    }

    public final void onDismissCancelled() {
        ((C59052c) ((C59052c) PrimaryAccountFixActivity.f289688k.mo56224b()).mo56372aa(21820)).mo56386p("#onDismissCancelled.");
        this.f289700a.finish();
    }

    public final void onDismissError() {
        ((C59052c) ((C59052c) PrimaryAccountFixActivity.f289688k.mo56224b()).mo56372aa(21821)).mo56386p("#onDismissError.");
        this.f289700a.finish();
    }

    public final void onDismissSucceeded() {
        ((C59052c) ((C59052c) PrimaryAccountFixActivity.f289688k.mo56224b()).mo56372aa(21822)).mo56386p("#onDismissSucceeded.");
        this.f289700a.mo93962w();
        this.f289700a.finish();
    }
}
