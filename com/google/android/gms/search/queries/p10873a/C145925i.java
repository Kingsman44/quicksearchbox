package com.google.android.gms.search.queries.p10873a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.p10813i.C144352a;
import com.google.android.gms.search.C145915i;
import com.google.android.gms.search.p10865b.p10866a.C145862a;

/* renamed from: com.google.android.gms.search.queries.a.i */
/* compiled from: PG */
public final class C145925i extends C145862a {
    public C145925i(Context context, Looper looper, C143944s sVar, C143726aa aaVar, C143789cj cjVar, C145915i iVar) {
        super(context, looper, 32, sVar, aaVar, cjVar, iVar);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesService");
        return queryLocalInterface instanceof C145919c ? (C145919c) queryLocalInterface : new C145919c(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.search.queries.internal.ISearchQueriesService";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144352a.f390917i;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    public C145925i(Context context, C143944s sVar, C143726aa aaVar, C143789cj cjVar, C145915i iVar) {
        super(context, context.getMainLooper(), 32, sVar, aaVar, cjVar, iVar);
    }
}
