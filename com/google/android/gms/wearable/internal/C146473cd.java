package com.google.android.gms.wearable.internal;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.wearable.C146530m;
import com.google.android.gms.wearable.C146532o;

/* renamed from: com.google.android.gms.wearable.internal.cd */
/* compiled from: PG */
public final class C146473cd extends C146532o {
    public C146473cd(Context context, C143846r rVar) {
        super(context, rVar);
    }

    /* renamed from: a */
    public final C146006ab mo123263a() {
        C143851w wVar = this.f389929D;
        C146467by byVar = new C146467by(wVar);
        wVar.mo119159d(byVar);
        return C143918bg.m233957c(byVar, C146471cb.f395673a);
    }

    /* renamed from: b */
    public final C146006ab mo123264b(String str) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C146470ca(str);
        dcVar.f389862c = new Feature[]{C146530m.f395729i};
        dcVar.f389863d = 24025;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
