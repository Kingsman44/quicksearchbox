package com.google.android.gms.reminders.model;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C143861a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.internal.C145810g;

/* renamed from: com.google.android.gms.reminders.model.x */
/* compiled from: PG */
public final class C145852x extends C143861a implements C143711ad {

    /* renamed from: b */
    private final Status f394398b;

    public C145852x(DataHolder dataHolder) {
        super(dataHolder);
        this.f394398b = new Status(1, dataHolder.f389965e, (String) null, (PendingIntent) null, (ConnectionResult) null);
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394398b;
    }

    /* renamed from: e */
    public final C145851w mo119329d(int i) {
        return new C145810g(this.f389971a, i);
    }
}
