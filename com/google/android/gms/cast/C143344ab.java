package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.cast.internal.C143594t;
import com.google.android.gms.cast.internal.C143600z;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.cast.ab */
/* compiled from: PG */
public final /* synthetic */ class C143344ab implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143354al f388758a;

    /* renamed from: b */
    public final /* synthetic */ String f388759b;

    public /* synthetic */ C143344ab(C143354al alVar, String str) {
        this.f388758a = alVar;
        this.f388759b = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143354al alVar = this.f388758a;
        String str = this.f388759b;
        C143594t tVar = (C143594t) obj;
        alVar.mo118497q();
        ((C143600z) tVar.mo119451G()).mo118935f(str);
        C143600z zVar = (C143600z) tVar.mo119451G();
        Parcel gA = zVar.mo17260gA();
        gA.writeString(str);
        zVar.mo17263hf(11, gA);
        ((C146010af) obj2).f394698a.mo122508v((Object) null);
    }
}
