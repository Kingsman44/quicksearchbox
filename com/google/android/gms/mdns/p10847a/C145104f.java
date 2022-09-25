package com.google.android.gms.mdns.p10847a;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143815di;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdns.a.f */
/* compiled from: PG */
public final class C145104f extends C143815di {

    /* renamed from: a */
    final /* synthetic */ C143784ce f392183a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145104f(C143782cc ccVar, C143784ce ceVar) {
        super(ccVar);
        this.f392183a = ceVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo119254a(C143717b bVar, C146010af afVar) {
        C145115q qVar = (C145115q) bVar;
        C143782cc ccVar = this.f392183a.f389806b;
        if (ccVar != null) {
            synchronized (qVar.f392197a) {
                C145114p pVar = (C145114p) qVar.f392197a.remove(ccVar);
                if (pVar != null) {
                    C145099a aVar = (C145099a) qVar.mo119451G();
                    Parcel gA = aVar.mo17260gA();
                    C8850c.m23499h(gA, pVar);
                    aVar.mo17262he(2, gA);
                } else {
                    Log.w("MdnsServiceBrowserImpl", "Tried to unregister nonexistent listener");
                }
            }
        }
        afVar.f394698a.mo122508v(true);
    }
}
