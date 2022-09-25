package com.google.android.gms.location.reporting.p10843a;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.C144958a;
import com.google.android.gms.location.reporting.C144968f;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.reporting.a.d */
/* compiled from: PG */
public final class C144962d extends C144968f {

    /* renamed from: a */
    final /* synthetic */ Account f391932a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144962d(C143851w wVar, Account account) {
        super(wVar);
        this.f391932a = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        int i;
        C144960b bVar2 = (C144960b) bVar;
        Account account = this.f391932a;
        bVar2.mo119455M();
        C144959a aVar = (C144959a) bVar2.mo119451G();
        Parcel gA = aVar.mo17260gA();
        C8850c.m23497f(gA, account);
        Parcel gT = aVar.mo17261gT(2, gA);
        int readInt = gT.readInt();
        gT.recycle();
        switch (C144958a.m235600a(readInt)) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 3507;
                break;
            case 2:
            case 3:
                i = 5;
                break;
            case 4:
                i = 10;
                break;
            case 5:
                i = SimpleSnackbar.LENGTH_LONG;
                break;
            case 6:
                i = 3501;
                break;
            case 7:
                i = 3502;
                break;
            case 8:
                i = 3503;
                break;
            case 10:
                i = 3510;
                break;
            case 11:
                i = 3511;
                break;
            case 12:
                i = 3512;
                break;
            case 13:
                i = 3513;
                break;
            case 14:
                i = 3514;
                break;
            default:
                i = 8;
                break;
        }
        mo119112p(new Status(1, i, (String) null, (PendingIntent) null, (ConnectionResult) null));
    }
}
