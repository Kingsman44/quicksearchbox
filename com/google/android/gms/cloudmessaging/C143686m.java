package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.cloudmessaging.m */
/* compiled from: PG */
public final class C143686m extends C143684k {
    public C143686m(int i, Bundle bundle) {
        super(i, bundle);
    }

    /* renamed from: b */
    public final void mo119055b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String valueOf = String.valueOf(bundle2);
            Log.d("MessengerIpcClient", "Finishing " + obj + " with " + valueOf);
        }
        this.f389541b.f394698a.mo122508v(bundle2);
    }

    /* renamed from: c */
    public final boolean mo119056c() {
        return false;
    }
}
