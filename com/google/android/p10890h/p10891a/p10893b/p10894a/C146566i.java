package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.p136b.C2602aa;
import androidx.media3.exoplayer.p137a.C2711b;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;

/* renamed from: com.google.android.h.a.b.a.i */
/* compiled from: PG */
public final class C146566i extends C146579j {

    /* renamed from: b */
    private final Context f395815b;

    /* renamed from: c */
    private int f395816c = 0;

    public C146566i(Context context) {
        this.f395815b = context.getApplicationContext();
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("conn");
    }

    /* renamed from: q */
    public final void mo123366q(C2711b bVar, boolean z) {
        int i;
        switch (C2602aa.m6836b(this.f395815b).mo6114a()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            default:
                i = 1;
                break;
        }
        if (i != this.f395816c) {
            C146580k kVar = this.f395862a;
            StringBuilder b = kVar.mo123372b(bVar.f7527a);
            b.append(i);
            kVar.mo123373c("conn", Uri.encode(b.toString(), ",:"));
            this.f395816c = i;
        }
    }
}
