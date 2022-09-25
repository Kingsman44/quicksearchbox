package com.google.android.apps.gsa.search.shared.multiuser;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.gsa.shared.util.C91037g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.t */
/* compiled from: PG */
public final class C87617t extends C91037g {

    /* renamed from: a */
    final /* synthetic */ C87618u f236684a;

    protected C87617t(C87618u uVar) {
        this.f236684a = uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo81750a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataSource");
        return queryLocalInterface instanceof C87604g ? (C87604g) queryLocalInterface : new C87602e(iBinder);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C58976aa aaVar = C58975e.f156826a;
        this.f254285b.mo57356n(mo81750a(iBinder));
        synchronized (this.f236684a.f236686a) {
            this.f236684a.mo81754b();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f236684a.f236686a) {
            this.f236684a.mo81755c();
            this.f236684a.mo81754b();
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f254285b.isDone()) {
            this.f254285b.cancel(false);
        }
    }
}
