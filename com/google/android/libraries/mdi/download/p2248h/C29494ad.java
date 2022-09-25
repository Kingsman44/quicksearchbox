package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28703ai;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28709ao;
import com.google.android.libraries.mdi.download.C28712ar;
import com.google.android.libraries.mdi.download.C28717aw;
import com.google.android.libraries.mdi.download.C28718ax;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28727be;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.ad */
/* compiled from: PG */
public final class C29494ad {

    /* renamed from: a */
    public final C29409fd f79922a;

    /* renamed from: b */
    public final C58833ax f79923b;

    /* renamed from: c */
    public final List f79924c;

    public C29494ad(C29409fd fdVar, C58833ax axVar, List list) {
        this.f79922a = fdVar;
        this.f79923b = axVar;
        this.f79924c = list;
    }

    /* renamed from: a */
    public static C28728bf m54458a(C28728bf bfVar) {
        if ((bfVar.f78045a & 1) != 0) {
            C28727be beVar = bfVar.f78047c;
            if (beVar == null) {
                beVar = C28727be.f78039b;
            }
            if (!beVar.f78041a.isEmpty()) {
                C28727be beVar2 = bfVar.f78047c;
                if (beVar2 == null) {
                    beVar2 = C28727be.f78039b;
                }
                String str = beVar2.f78041a;
                C28717aw awVar = (C28717aw) bfVar.toBuilder();
                awVar.copyOnWrite();
                ((C28728bf) awVar.instance).f78046b = C28728bf.emptyProtobufList();
                for (C28725bc bcVar : bfVar.f78046b) {
                    C28708an anVar = bcVar.f78038c;
                    if (anVar == null) {
                        anVar = C28708an.f77994l;
                    }
                    C28707am amVar = (C28707am) anVar.toBuilder();
                    amVar.copyOnWrite();
                    ((C28708an) amVar.instance).f78003h = C28708an.emptyProtobufList();
                    C28708an anVar2 = bcVar.f78038c;
                    if (anVar2 == null) {
                        anVar2 = C28708an.f77994l;
                    }
                    for (C28706al alVar : anVar2.f78003h) {
                        C28703ai aiVar = (C28703ai) alVar.toBuilder();
                        aiVar.copyOnWrite();
                        ((C28706al) aiVar.instance).f77988k = C28706al.emptyProtobufList();
                        if (alVar.f77980c.isEmpty()) {
                            String replace = str.replace("{checksum}", alVar.f77983f);
                            aiVar.copyOnWrite();
                            C28706al alVar2 = (C28706al) aiVar.instance;
                            replace.getClass();
                            alVar2.f77978a |= 2;
                            alVar2.f77980c = replace;
                        }
                        for (C28712ar arVar : alVar.f77988k) {
                            if (arVar.f78011b.isEmpty()) {
                                C28709ao aoVar = (C28709ao) arVar.toBuilder();
                                String replace2 = str.replace("{checksum}", arVar.f78013d);
                                aoVar.copyOnWrite();
                                C28712ar arVar2 = (C28712ar) aoVar.instance;
                                replace2.getClass();
                                arVar2.f78010a |= 1;
                                arVar2.f78011b = replace2;
                                arVar = (C28712ar) aoVar.build();
                            }
                            aiVar.copyOnWrite();
                            C28706al alVar3 = (C28706al) aiVar.instance;
                            arVar.getClass();
                            C62971cq cqVar = alVar3.f77988k;
                            if (!cqVar.mo58948c()) {
                                alVar3.f77988k = C62942bv.mutableCopy(cqVar);
                            }
                            alVar3.f77988k.add(arVar);
                        }
                        amVar.mo34328b(aiVar);
                    }
                    C28718ax axVar = (C28718ax) bcVar.toBuilder();
                    axVar.copyOnWrite();
                    C28725bc bcVar2 = (C28725bc) axVar.instance;
                    C28708an anVar3 = (C28708an) amVar.build();
                    anVar3.getClass();
                    bcVar2.f78038c = anVar3;
                    bcVar2.f78036a |= 2;
                    awVar.copyOnWrite();
                    C28728bf bfVar2 = (C28728bf) awVar.instance;
                    C28725bc bcVar3 = (C28725bc) axVar.build();
                    bcVar3.getClass();
                    C62971cq cqVar2 = bfVar2.f78046b;
                    if (!cqVar2.mo58948c()) {
                        bfVar2.f78046b = C62942bv.mutableCopy(cqVar2);
                    }
                    bfVar2.f78046b.add(bcVar3);
                }
                return (C28728bf) awVar.build();
            }
        }
        for (C28725bc bcVar4 : bfVar.f78046b) {
            C28708an anVar4 = bcVar4.f78038c;
            if (anVar4 == null) {
                anVar4 = C28708an.f77994l;
            }
            Iterator it = anVar4.f78003h.iterator();
            while (true) {
                if (it.hasNext()) {
                    C28706al alVar4 = (C28706al) it.next();
                    if (!alVar4.f77980c.isEmpty()) {
                        Iterator it2 = alVar4.f77988k.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((C28712ar) it2.next()).f78011b.isEmpty()) {
                                    throw new IllegalArgumentException(String.format("DeltaFile for file %s url_to_download is missing.", new Object[]{alVar4.f77979b}));
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException(String.format("DataFile %s url_to_download is missing.", new Object[]{alVar4.f77979b}));
                    }
                }
            }
        }
        return bfVar;
    }

    /* renamed from: b */
    public static final void m54459b(C60870cx cxVar, String str, C58833ax axVar, C58833ax axVar2) {
        C29493ac acVar = new C29493ac(str, axVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(acVar), C60826bg.f164896a);
    }
}
