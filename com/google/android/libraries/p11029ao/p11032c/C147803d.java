package com.google.android.libraries.p11029ao.p11032c;

import android.content.Context;

/* renamed from: com.google.android.libraries.ao.c.d */
/* compiled from: PG */
final class C147803d extends C147813n {

    /* renamed from: a */
    final /* synthetic */ String f398775a;

    public C147803d(String str) {
        this.f398775a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo124472a(Context context, C147812m mVar, boolean z) {
        if (context.getPackageName().equals(mVar.f398791a.packageName)) {
            return z ? 1 : 2;
        }
        if (z) {
            return 2;
        }
        if (this.f398775a.equals(mVar.f398791a.packageName)) {
            return 1;
        }
        return 3;
    }
}
