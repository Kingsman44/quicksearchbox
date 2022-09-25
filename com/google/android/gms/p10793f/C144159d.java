package com.google.android.gms.p10793f;

import android.os.RemoteException;
import com.google.android.gms.maps.model.C145023g;
import com.google.android.gms.maps.p10845a.C145000e;

/* renamed from: com.google.android.gms.f.d */
/* compiled from: PG */
public final class C144159d implements C144161f {

    /* renamed from: a */
    final /* synthetic */ C144162g f390472a;

    public C144159d(C144162g gVar) {
        this.f390472a = gVar;
    }

    /* renamed from: a */
    public final int mo119694a() {
        return 4;
    }

    /* renamed from: b */
    public final void mo119695b() {
        try {
            C145000e eVar = this.f390472a.f390475b.f391997c;
            eVar.mo17262he(12, eVar.mo17260gA());
        } catch (RemoteException e) {
            throw new C145023g(e);
        }
    }
}
