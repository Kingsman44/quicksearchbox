package com.google.android.gms.reminders.model;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C143861a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.internal.C145814k;

/* renamed from: com.google.android.gms.reminders.model.aa */
/* compiled from: PG */
public final class C145821aa extends C143861a implements C143711ad {

    /* renamed from: b */
    private final Status f394340b;

    public C145821aa(DataHolder dataHolder) {
        super(dataHolder);
        this.f394340b = new Status(1, dataHolder.f389965e, (String) null, (PendingIntent) null, (ConnectionResult) null);
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394340b;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo119329d(int i) {
        return new C145814k(this.f389971a, i);
    }
}
