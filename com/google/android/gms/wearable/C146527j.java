package com.google.android.gms.wearable;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.C143868h;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.C146423ah;

/* renamed from: com.google.android.gms.wearable.j */
/* compiled from: PG */
public final class C146527j extends C143868h implements C143711ad {

    /* renamed from: b */
    private final Status f395720b;

    public C146527j(DataHolder dataHolder) {
        super(dataHolder);
        this.f395720b = new Status(1, dataHolder.f389965e, (String) null, (PendingIntent) null, (ConnectionResult) null);
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f395720b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo119343f(int i, int i2) {
        return new C146423ah(this.f389971a, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo119344g() {
        return "path";
    }
}
