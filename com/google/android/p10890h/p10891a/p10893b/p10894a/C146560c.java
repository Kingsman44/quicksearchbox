package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;
import java.util.Locale;

/* renamed from: com.google.android.h.a.b.a.c */
/* compiled from: PG */
public final class C146560c extends C146579j {

    /* renamed from: b */
    private final Context f395803b;

    /* renamed from: c */
    private final IntentFilter f395804c = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public C146560c(Context context) {
        this.f395803b = context.getApplicationContext();
    }

    /* renamed from: u */
    private final void m238676u() {
        Intent B = C2612ak.m6919B(this.f395803b, (BroadcastReceiver) null, this.f395804c);
        if (B != null) {
            float intExtra = ((float) B.getIntExtra("level", -1)) / ((float) B.getIntExtra("scale", -1));
            int intExtra2 = B.getIntExtra("status", -1);
            int i = (intExtra2 == 2 || intExtra2 == 5) ? 1 : 0;
            C146580k kVar = this.f395862a;
            StringBuilder b = kVar.mo123372b(SystemClock.elapsedRealtime());
            b.append(String.format(Locale.US, "%.3f", new Object[]{Float.valueOf(intExtra)}));
            b.append(":");
            b.append(i);
            kVar.mo123373c("bat", Uri.encode(b.toString(), ",:"));
        }
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("bat");
        m238676u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo95070d() {
        m238676u();
    }

    /* renamed from: g */
    public final void mo123352g(long j, boolean z) {
        m238676u();
    }
}
