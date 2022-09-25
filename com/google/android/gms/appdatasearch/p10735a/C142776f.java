package com.google.android.gms.appdatasearch.p10735a;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.appdatasearch.C142805b;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.appdatasearch.a.f */
/* compiled from: PG */
public final class C142776f extends C143847s {
    public C142776f(Context context) {
        super(context, (Activity) null, C142805b.f387602b, (C143724i) null, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo117679a(UsageInfo... usageInfoArr) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389863d = 1;
        dcVar.f389860a = new C142775e(usageInfoArr);
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
