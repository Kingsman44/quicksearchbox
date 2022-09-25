package com.google.android.gms.people;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.people.internal.C145679p;

/* renamed from: com.google.android.gms.people.m */
/* compiled from: PG */
final class C145684m extends C143707a {
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C143839k mo57743b(Context context, Looper looper, C143944s sVar, Object obj, C143849u uVar, C143850v vVar) {
        C145687p pVar = (C145687p) obj;
        C143919bh.m233971n(pVar, "Must provide valid PeopleOptions!");
        return new C145679p(context, looper, uVar, vVar, String.valueOf(pVar.f393928a), sVar);
    }
}
