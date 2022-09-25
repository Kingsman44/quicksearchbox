package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.C143594t;
import com.google.android.gms.cast.internal.C143600z;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.cast.v */
/* compiled from: PG */
public final /* synthetic */ class C143613v implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143354al f389383a;

    /* renamed from: b */
    public final /* synthetic */ String f389384b;

    /* renamed from: c */
    public final /* synthetic */ String f389385c;

    public /* synthetic */ C143613v(C143354al alVar, String str, String str2) {
        this.f389383a = alVar;
        this.f389384b = str;
        this.f389385c = str2;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143354al alVar = this.f389383a;
        String str = this.f389384b;
        String str2 = this.f389385c;
        C143594t tVar = (C143594t) obj;
        long incrementAndGet = alVar.f388785g.incrementAndGet();
        alVar.mo118491k();
        try {
            alVar.f388796r.put(Long.valueOf(incrementAndGet), obj2);
            C143600z zVar = (C143600z) tVar.mo119451G();
            Parcel gA = zVar.mo17260gA();
            gA.writeString(str);
            gA.writeString(str2);
            gA.writeLong(incrementAndGet);
            zVar.mo17263hf(9, gA);
        } catch (RemoteException e) {
            alVar.f388796r.remove(Long.valueOf(incrementAndGet));
            ((C146010af) obj2).f394698a.mo122507u(e);
        }
    }
}
