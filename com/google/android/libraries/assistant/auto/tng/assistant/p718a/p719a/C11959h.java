package com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a;

import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13600b;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13601c;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a.C13595g;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a.C13596h;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a.C13598j;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a.C13599k;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16750bk;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16768r;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16783a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C11959h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C16750bk f38414a;

    public /* synthetic */ C11959h(C16750bk bkVar) {
        this.f38414a = bkVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C16750bk bkVar = this.f38414a;
        C13599k kVar = ((C13598j) obj).f41617a;
        kVar.f41622e.mo22352b(C37179a.f97650eJ);
        if ((bkVar.f48982a & 32768) != 0) {
            kVar.f41622e.mo22352b(C37179a.f97654eN);
            C16766p pVar = kVar.f41624g;
            C16766p pVar2 = bkVar.f48998q;
            if (pVar2 == null) {
                pVar2 = C16766p.f49064d;
            }
            if (!pVar.equals(pVar2)) {
                C16766p pVar3 = bkVar.f48998q;
                kVar.f41624g = pVar3 == null ? C16766p.f49064d : pVar3;
                C16783a aVar = kVar.f41621d;
                if (pVar3 == null) {
                    pVar3 = C16766p.f49064d;
                }
                Intent a = aVar.mo23010a(pVar3);
                C12991i iVar = bkVar.f48996o;
                if (iVar == null) {
                    iVar = C12991i.f40380k;
                }
                C13007y yVar = iVar.f40383b;
                if (yVar == null) {
                    yVar = C13007y.f40413d;
                }
                a.putExtra("handover-session-id", yVar.f40416b);
                C46459k.m82829b(kVar.f41620c.mo20101f(a), "failed to start activity", new Object[0]);
                C16766p pVar4 = bkVar.f48998q;
                if (pVar4 == null) {
                    pVar4 = C16766p.f49064d;
                }
                if (!pVar4.f49068c) {
                    kVar.f41619b.execute(C47810es.m84977q(new C13596h(kVar)));
                    return true;
                }
            }
        }
        C13600b bVar = (C13600b) C13601c.f41627e.createBuilder();
        long j = kVar.f41623f;
        bVar.copyOnWrite();
        C13601c cVar = (C13601c) bVar.instance;
        cVar.f41629a |= 4;
        cVar.f41632d = j;
        C16768r rVar = bkVar.f48994m;
        if (rVar == null) {
            rVar = C16768r.f49069c;
        }
        if ((rVar.f49071a & 1) != 0) {
            C16768r rVar2 = bkVar.f48994m;
            if (rVar2 == null) {
                rVar2 = C16768r.f49069c;
            }
            int i = rVar2.f49072b;
            bVar.copyOnWrite();
            C13601c cVar2 = (C13601c) bVar.instance;
            cVar2.f41629a |= 2;
            cVar2.f41631c = i;
        }
        if ((bkVar.f48982a & 1) == 0) {
            return false;
        }
        int i2 = bkVar.f48983b;
        if (i2 == 2) {
            C13595g gVar = kVar.f41618a;
            bVar.copyOnWrite();
            C13601c cVar3 = (C13601c) bVar.instance;
            cVar3.f41630b = 4;
            cVar3.f41629a = 1 | cVar3.f41629a;
            gVar.mo21183c((C13601c) bVar.build());
            return false;
        } else if (i2 != 14 && i2 != 10) {
            return false;
        } else {
            C13595g gVar2 = kVar.f41618a;
            bVar.copyOnWrite();
            C13601c cVar4 = (C13601c) bVar.instance;
            cVar4.f41630b = 5;
            cVar4.f41629a = 1 | cVar4.f41629a;
            gVar2.mo21183c((C13601c) bVar.build());
            return false;
        }
    }
}
