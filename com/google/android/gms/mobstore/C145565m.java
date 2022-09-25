package com.google.android.gms.mobstore;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.mobstore.p10850a.C145553a;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mobstore.m */
/* compiled from: PG */
public final /* synthetic */ class C145565m implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ RenameRequest f393605a;

    public /* synthetic */ C145565m(RenameRequest renameRequest) {
        this.f393605a = renameRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        RenameRequest renameRequest = this.f393605a;
        C145553a aVar = (C145553a) obj;
        C146010af afVar = (C146010af) obj2;
        C145570r rVar = new C145570r(afVar);
        try {
            C145562j jVar = (C145562j) aVar.mo119451G();
            Parcel gA = jVar.mo17260gA();
            C8850c.m23499h(gA, rVar);
            C8850c.m23497f(gA, renameRequest);
            jVar.mo17262he(3, gA);
        } catch (RemoteException unused) {
            C143811de.m233724a(Status.f389617c, (Object) null, afVar);
        }
    }
}
