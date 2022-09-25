package com.google.android.gms.mdns.p10847a;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143791cl;
import com.google.android.gms.mdns.MdnsSearchOptions;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdns.a.e */
/* compiled from: PG */
public final class C145103e extends C143791cl {

    /* renamed from: e */
    final /* synthetic */ C143784ce f392181e;

    /* renamed from: f */
    final /* synthetic */ MdnsSearchOptions f392182f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145103e(C143784ce ceVar, C143784ce ceVar2, MdnsSearchOptions mdnsSearchOptions) {
        super(ceVar, (Feature[]) null, false, 0);
        this.f392181e = ceVar2;
        this.f392182f = mdnsSearchOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo119252a(C143717b bVar, C146010af afVar) {
        C145115q qVar = (C145115q) bVar;
        C143784ce ceVar = this.f392181e;
        MdnsSearchOptions mdnsSearchOptions = this.f392182f;
        C143782cc ccVar = ceVar.f389806b;
        if (ccVar != null) {
            synchronized (qVar.f392197a) {
                C145114p pVar = (C145114p) qVar.f392197a.get(ccVar);
                if (pVar == null) {
                    pVar = new C145114p(ceVar);
                    qVar.f392197a.put(ccVar, pVar);
                }
                C145099a aVar = (C145099a) qVar.mo119451G();
                Parcel gA = aVar.mo17260gA();
                C8850c.m23499h(gA, pVar);
                C8850c.m23497f(gA, mdnsSearchOptions);
                aVar.mo17262he(1, gA);
            }
        }
        afVar.f394698a.mo122508v((Object) null);
    }
}
