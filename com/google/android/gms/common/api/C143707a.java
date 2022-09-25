package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C143726aa;
import com.google.android.gms.common.api.internal.C143789cj;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.common.api.a */
/* compiled from: PG */
public class C143707a extends C143838j {
    /* renamed from: a */
    public C143839k mo117673a(Context context, Looper looper, C143944s sVar, Object obj, C143726aa aaVar, C143789cj cjVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    /* renamed from: b */
    public C143839k mo57743b(Context context, Looper looper, C143944s sVar, Object obj, C143849u uVar, C143850v vVar) {
        return mo117673a(context, looper, sVar, obj, uVar, vVar);
    }
}
