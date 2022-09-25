package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.p3663j.C47347e;
import com.google.apps.tiktok.p3663j.C47349g;
import com.google.apps.tiktok.p3663j.C47350h;
import com.google.apps.tiktok.p3663j.C47355m;
import com.google.apps.tiktok.p3663j.p3664a.C47279a;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.j.b.e */
/* compiled from: PG */
public final /* synthetic */ class C47315e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C47333w f122981a;

    /* renamed from: b */
    public final /* synthetic */ long f122982b;

    /* renamed from: c */
    public final /* synthetic */ long f122983c;

    /* renamed from: d */
    public final /* synthetic */ Map f122984d;

    /* renamed from: e */
    public final /* synthetic */ Map f122985e;

    public /* synthetic */ C47315e(C47333w wVar, long j, long j2, Map map, Map map2) {
        this.f122981a = wVar;
        this.f122982b = j;
        this.f122983c = j2;
        this.f122984d = map;
        this.f122985e = map2;
    }

    public final Object apply(Object obj) {
        long j;
        long j2;
        C47333w wVar = this.f122981a;
        long j3 = this.f122982b;
        long j4 = this.f122983c;
        Map map = this.f122984d;
        Map map2 = this.f122985e;
        Map map3 = (Map) obj;
        synchronized (wVar.f123024h) {
            synchronized (wVar.f123023g) {
                for (Map.Entry entry : wVar.f123023g.entrySet()) {
                    C47304al alVar = (C47304al) entry.getKey();
                    if (!wVar.f123024h.containsKey(alVar)) {
                        long longValue = wVar.f123025i.containsKey(alVar) ? ((Long) wVar.f123025i.get(alVar)).longValue() : j3;
                        if (map3.containsKey(alVar)) {
                            j2 = ((Long) map3.get(alVar)).longValue();
                            j = j3;
                        } else {
                            j = j3;
                            j2 = j;
                        }
                        long max = Math.max(longValue, j2);
                        C47347e a = ((C47355m) entry.getValue()).mo51211a();
                        if (a.mo51156a() + max <= j4) {
                            Iterator it = a.mo51158c().entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    SettableFuture settableFuture = new SettableFuture();
                                    wVar.f123024h.put(alVar, settableFuture);
                                    map2.put(alVar, settableFuture);
                                    break;
                                }
                                Map.Entry entry2 = (Map.Entry) it.next();
                                C47349g gVar = (C47349g) entry2.getValue();
                                long a2 = gVar.mo51163a();
                                long j5 = j4 - max;
                                long a3 = gVar.mo51163a() + a.mo51156a();
                                if (a2 == -1 || j5 <= a3) {
                                    C47350h hVar = (C47350h) entry2.getKey();
                                    if (!map.containsKey(hVar)) {
                                        map.put(hVar, Boolean.valueOf(((C47279a) ((C69464a) wVar.f123021e.get(hVar)).mo17428b()).mo51162a()));
                                    }
                                    if (!((Boolean) map.get(hVar)).booleanValue()) {
                                        break;
                                    }
                                }
                            }
                        }
                        j3 = j;
                    }
                }
            }
        }
        return map2;
    }
}
