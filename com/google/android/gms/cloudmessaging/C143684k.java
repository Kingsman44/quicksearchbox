package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.cloudmessaging.k */
/* compiled from: PG */
abstract class C143684k {

    /* renamed from: a */
    final int f389540a;

    /* renamed from: b */
    final C146010af f389541b = new C146010af();

    /* renamed from: c */
    final Bundle f389542c;

    public C143684k(int i, Bundle bundle) {
        this.f389540a = i;
        this.f389542c = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo119054a(C143685l lVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = lVar.toString();
            Log.d("MessengerIpcClient", "Failing " + obj + " with " + obj2);
        }
        this.f389541b.f394698a.mo122507u(lVar);
    }

    /* renamed from: b */
    public abstract void mo119055b(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo119056c();

    public final String toString() {
        int i = this.f389540a;
        return "Request { what=1 id=" + i + " oneWay=" + mo119056c() + "}";
    }
}
