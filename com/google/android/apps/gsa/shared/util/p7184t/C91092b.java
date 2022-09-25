package com.google.android.apps.gsa.shared.util.p7184t;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;

/* renamed from: com.google.android.apps.gsa.shared.util.t.b */
/* compiled from: PG */
final class C91092b extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Context f254382a;

    /* renamed from: b */
    final /* synthetic */ Intent f254383b;

    /* renamed from: c */
    final /* synthetic */ Bundle f254384c;

    public C91092b(Context context, Intent intent, Bundle bundle) {
        this.f254382a = context;
        this.f254383b = intent;
        this.f254384c = bundle;
    }

    public final void onDismissSucceeded() {
        super.onDismissSucceeded();
        Context context = this.f254382a;
        Intent intent = this.f254383b;
        Bundle bundle = this.f254384c;
        C90476a aVar = C91018d.f254254a;
        context.startActivity(intent, bundle);
    }
}
