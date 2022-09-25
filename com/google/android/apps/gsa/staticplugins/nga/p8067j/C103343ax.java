package com.google.android.apps.gsa.staticplugins.nga.p8067j;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.aa;
import com.google.android.apps.gsa.nga.api.ac;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.j.ax */
/* compiled from: PG */
public final /* synthetic */ class C103343ax implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C103345az f288132a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f288133b;

    public /* synthetic */ C103343ax(C103345az azVar, IBinder iBinder) {
        this.f288132a = azVar;
        this.f288133b = iBinder;
    }

    public final void run() {
        ac acVar;
        C103345az azVar = this.f288132a;
        IBinder iBinder = this.f288133b;
        if (iBinder == null) {
            acVar = null;
        } else {
            ac queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.nga.api.INgaService");
            acVar = queryLocalInterface instanceof ac ? queryLocalInterface : new aa(iBinder);
        }
        if (acVar != null) {
            C103347ba baVar = azVar.f288135a;
            if (baVar.f288142f == null) {
                baVar.f288142f = new Binder();
            }
            try {
                acVar.g(azVar.f288135a.f288142f);
                C103347ba baVar2 = azVar.f288135a;
                baVar2.f288143g = acVar;
                baVar2.f288144h = true;
                ((C103349bc) baVar2.f288141e.mo27525b()).mo93761t();
                azVar.f288135a.mo93767a(acVar);
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) C103347ba.f288137a.mo56225c()).mo56382g(e)).mo56372aa(21505)).mo56386p("Fail to set the process token.");
            }
        }
    }
}
