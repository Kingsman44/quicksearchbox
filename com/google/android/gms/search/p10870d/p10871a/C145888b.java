package com.google.android.gms.search.p10870d.p10871a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.search.C145915i;
import com.google.android.gms.search.p10865b.p10866a.C145862a;

/* renamed from: com.google.android.gms.search.d.a.b */
/* compiled from: PG */
public final class C145888b extends C145862a {
    public C145888b(Context context, C143944s sVar, C143726aa aaVar, C143789cj cjVar, C145915i iVar) {
        super(context, context.getMainLooper(), 78, sVar, aaVar, cjVar, iVar);
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12600000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiService");
        return queryLocalInterface instanceof C145887a ? (C145887a) queryLocalInterface : new C145887a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.search.nativeapi.internal.INativeApiService";
    }
}
