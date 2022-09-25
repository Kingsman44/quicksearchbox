package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.bq */
/* compiled from: PG */
public final /* synthetic */ class C146459bq implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f395659a;

    /* renamed from: b */
    public final /* synthetic */ String f395660b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f395661c;

    public /* synthetic */ C146459bq(String str, String str2, byte[] bArr) {
        this.f395659a = str;
        this.f395660b = str2;
        this.f395661c = bArr;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f395659a;
        String str2 = this.f395660b;
        byte[] bArr = this.f395661c;
        C146463bu buVar = new C146463bu((C146010af) obj2);
        C146452bj bjVar = (C146452bj) ((C146499dc) obj).mo119451G();
        C146497da daVar = new C146497da(buVar);
        Parcel gA = bjVar.mo17260gA();
        C8850c.m23499h(gA, daVar);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeByteArray(bArr);
        bjVar.mo17262he(58, gA);
    }
}
