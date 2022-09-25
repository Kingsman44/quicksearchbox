package com.google.android.libraries.storage.protostore;

import android.util.Log;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.MessageLite;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4783b.C63134b;
import com.google.protos.p4874ap.p4877b.p4878a.C63691b;
import com.google.protos.p4874ap.p4877b.p4878a.C63698i;
import com.google.protos.p4874ap.p4877b.p4878a.C63699j;
import com.google.protos.p4874ap.p4877b.p4878a.C63700k;
import com.google.protos.p4874ap.p4877b.p4878a.C63701l;
import com.google.protos.p4874ap.p4877b.p4878a.C63702m;
import com.google.protos.p4874ap.p4877b.p4878a.C63703n;
import com.google.protos.p4874ap.p4877b.p4878a.C63704o;
import com.google.protos.p4874ap.p4877b.p4878a.C63705p;
import com.google.protos.p4874ap.p4877b.p4878a.C63706q;
import com.google.protos.p4874ap.p4877b.p4878a.C63710u;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.storage.protostore.au */
/* compiled from: PG */
public final /* synthetic */ class C42895au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112217a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f112218b;

    /* renamed from: c */
    public final /* synthetic */ AtomicLong f112219c;

    public /* synthetic */ C42895au(C42905ba baVar, AtomicBoolean atomicBoolean, AtomicLong atomicLong) {
        this.f112217a = baVar;
        this.f112218b = atomicBoolean;
        this.f112219c = atomicLong;
    }

    public final C60870cx apply(Object obj) {
        C62942bv bvVar;
        C42905ba baVar = this.f112217a;
        AtomicBoolean atomicBoolean = this.f112218b;
        AtomicLong atomicLong = this.f112219c;
        MessageLite messageLite = (MessageLite) obj;
        Log.v("ProtoDataStoreWithLams", "Calling syncSettings RPC");
        C63134b d = baVar.mo45988d(messageLite);
        C63042fg fgVar = d.f170491g;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        if (baVar.f112251f.mo56113h() && baVar.f112252g.mo56113h()) {
            long c = C62953e.m95478c(fgVar);
            if (c != 0 && baVar.f112250e.mo26870b() < c + TimeUnit.MILLISECONDS.convert(((Long) baVar.f112251f.mo56107c()).longValue(), (TimeUnit) baVar.f112252g.mo56107c())) {
                atomicBoolean.set(true);
                return C60856cj.m92900i(C63710u.f172252d);
            }
        }
        C63701l lVar = (C63701l) C63706q.f172241d.createBuilder();
        int i = baVar.f112256k;
        lVar.copyOnWrite();
        C63706q qVar = (C63706q) lVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            qVar.f172245c = i2;
            qVar.f172243a |= 2;
            HashSet<C63698i> hashSet = new HashSet<>(baVar.f112248c.mo41366a());
            if (d.f170489e) {
                for (Map.Entry entry : baVar.f112248c.mo41367b(d.f170490f, messageLite).entrySet()) {
                    C63702m mVar = (C63702m) C63705p.f172236d.createBuilder();
                    C63698i iVar = (C63698i) entry.getKey();
                    mVar.copyOnWrite();
                    C63705p pVar = (C63705p) mVar.instance;
                    iVar.getClass();
                    pVar.f172239b = iVar;
                    pVar.f172238a |= 1;
                    C58833ax axVar = (C58833ax) entry.getValue();
                    C63042fg fgVar2 = d.f170487c;
                    if (fgVar2 == null) {
                        fgVar2 = C63042fg.f170152c;
                    }
                    if (!axVar.mo56113h()) {
                        C63703n nVar = (C63703n) C63704o.f172232c.createBuilder();
                        nVar.copyOnWrite();
                        C63704o oVar = (C63704o) nVar.instance;
                        fgVar2.getClass();
                        oVar.f172235b = fgVar2;
                        oVar.f172234a = 2;
                        bvVar = nVar.build();
                    } else {
                        C63703n nVar2 = (C63703n) C63704o.f172232c.createBuilder();
                        C63699j jVar = (C63699j) ((C63700k) axVar.mo56107c()).toBuilder();
                        jVar.copyOnWrite();
                        C63700k kVar = (C63700k) jVar.instance;
                        fgVar2.getClass();
                        kVar.f172231d = fgVar2;
                        kVar.f172228a |= 32;
                        nVar2.copyOnWrite();
                        C63704o oVar2 = (C63704o) nVar2.instance;
                        C63700k kVar2 = (C63700k) jVar.build();
                        kVar2.getClass();
                        oVar2.f172235b = kVar2;
                        oVar2.f172234a = 1;
                        bvVar = nVar2.build();
                    }
                    C63704o oVar3 = (C63704o) bvVar;
                    mVar.copyOnWrite();
                    C63705p pVar2 = (C63705p) mVar.instance;
                    oVar3.getClass();
                    pVar2.f172240c = oVar3;
                    pVar2.f172238a |= 2;
                    lVar.mo59232b(mVar);
                    hashSet.remove(entry.getKey());
                }
            }
            for (C63698i iVar2 : hashSet) {
                C63702m mVar2 = (C63702m) C63705p.f172236d.createBuilder();
                mVar2.copyOnWrite();
                C63705p pVar3 = (C63705p) mVar2.instance;
                iVar2.getClass();
                pVar3.f172239b = iVar2;
                pVar3.f172238a |= 1;
                lVar.mo59232b(mVar2);
            }
            atomicLong.set(baVar.f112250e.mo26870b());
            return ((C63691b) baVar.f112247b.mo62575n(60, baVar.f112249d)).mo59230b((C63706q) lVar.build());
        }
        throw null;
    }
}
