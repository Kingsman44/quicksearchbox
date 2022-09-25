package com.google.android.gms.common.internal.p10783a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.internal.a.b */
/* compiled from: PG */
public final /* synthetic */ class C143881b implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ TelemetryData f390053a;

    public /* synthetic */ C143881b(TelemetryData telemetryData) {
        this.f390053a = telemetryData;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        TelemetryData telemetryData = this.f390053a;
        int i = C143883d.f390054a;
        C143880a aVar = (C143880a) ((C143884e) obj).mo119451G();
        Parcel gA = aVar.mo17260gA();
        C8850c.m23497f(gA, telemetryData);
        aVar.mo17263hf(1, gA);
        ((C146010af) obj2).f394698a.mo122508v((Object) null);
    }
}
