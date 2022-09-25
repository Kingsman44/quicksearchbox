package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.internal.C143594t;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;

/* renamed from: com.google.android.gms.cast.ac */
/* compiled from: PG */
final class C143345ac extends C143707a {
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C143839k mo57743b(Context context, Looper looper, C143944s sVar, Object obj, C143849u uVar, C143850v vVar) {
        C143556g gVar = (C143556g) obj;
        C143919bh.m233971n(gVar, "Setting the API options is required.");
        CastDevice castDevice = gVar.f389245a;
        int i = gVar.f389248d;
        return new C143594t(context, looper, sVar, castDevice, gVar.f389247c, gVar.f389249e, uVar, vVar);
    }
}
