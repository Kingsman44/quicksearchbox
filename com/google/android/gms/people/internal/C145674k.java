package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.internal.C143784ce;

/* renamed from: com.google.android.gms.people.internal.k */
/* compiled from: PG */
public final class C145674k extends C145656a {

    /* renamed from: a */
    public final C143784ce f393913a;

    public C145674k(C143784ce ceVar) {
        this.f393913a = ceVar;
    }

    /* renamed from: c */
    public final void mo121713c(int i, Bundle bundle) {
        if (i == 0) {
            C143784ce ceVar = this.f393913a;
            bundle.getString("account");
            bundle.getString("pagegaiaid");
            bundle.getInt("scope");
            ceVar.mo119235a(new C145672i());
        } else if (Log.isLoggable("PeopleClient", 5)) {
            Log.w("PeopleClient", "Non-success data changed callback received.");
        }
    }
}
