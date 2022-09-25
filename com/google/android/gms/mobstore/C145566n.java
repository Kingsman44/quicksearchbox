package com.google.android.gms.mobstore;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.mobstore.p10850a.C145553a;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mobstore.n */
/* compiled from: PG */
public final /* synthetic */ class C145566n implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ OpenFileDescriptorRequest f393606a;

    public /* synthetic */ C145566n(OpenFileDescriptorRequest openFileDescriptorRequest) {
        this.f393606a = openFileDescriptorRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        OpenFileDescriptorRequest openFileDescriptorRequest = this.f393606a;
        C145553a aVar = (C145553a) obj;
        C146010af afVar = (C146010af) obj2;
        C145568p pVar = new C145568p(afVar);
        try {
            C145562j jVar = (C145562j) aVar.mo119451G();
            Parcel gA = jVar.mo17260gA();
            C8850c.m23499h(gA, pVar);
            C8850c.m23497f(gA, openFileDescriptorRequest);
            jVar.mo17262he(1, gA);
        } catch (RemoteException unused) {
            C143811de.m233724a(Status.f389617c, (Object) null, afVar);
        }
    }
}
