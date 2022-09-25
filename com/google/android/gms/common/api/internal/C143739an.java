package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.internal.C143898an;
import com.google.android.gms.common.internal.C143933h;
import com.google.android.gms.signin.C145993e;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.an */
/* compiled from: PG */
final class C143739an extends C143744as {

    /* renamed from: a */
    final /* synthetic */ C143745at f389664a;

    /* renamed from: c */
    private final Map f389665c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143739an(C143745at atVar, Map map) {
        super(atVar);
        this.f389664a = atVar;
        this.f389665c = map;
    }

    /* renamed from: a */
    public final void mo119146a() {
        C145993e eVar;
        C143898an anVar = new C143898an(this.f389664a.f389676d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C143839k kVar : this.f389665c.keySet()) {
            if (!kVar.mo119251z() || ((C143736ak) this.f389665c.get(kVar)).f389658a) {
                arrayList2.add(kVar);
            } else {
                arrayList.add(kVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = anVar.mo119414a(this.f389664a.f389675c, (C143839k) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = anVar.mo119414a(this.f389664a.f389675c, (C143839k) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(1, i, (PendingIntent) null, (String) null);
            C143745at atVar = this.f389664a;
            atVar.f389673a.mo119183j(new C143737al(this, atVar, connectionResult));
            return;
        }
        C143745at atVar2 = this.f389664a;
        if (atVar2.f389678f && (eVar = atVar2.f389677e) != null) {
            eVar.mo122463e();
        }
        for (C143839k kVar2 : this.f389665c.keySet()) {
            C143933h hVar = (C143933h) this.f389665c.get(kVar2);
            if (!kVar2.mo119251z() || anVar.mo119414a(this.f389664a.f389675c, kVar2) == 0) {
                kVar2.mo119247v(hVar);
            } else {
                C143745at atVar3 = this.f389664a;
                atVar3.f389673a.mo119183j(new C143738am(atVar3, hVar));
            }
        }
    }
}
