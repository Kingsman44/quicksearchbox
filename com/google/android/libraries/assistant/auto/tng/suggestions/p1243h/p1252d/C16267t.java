package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16064a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16169m;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16328ab;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16331ae;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16334ah;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3994s.p3995a.C53447of;
import com.google.assistant.p3994s.p3995a.C53448og;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.t */
/* compiled from: PG */
public final class C16267t {

    /* renamed from: a */
    public static final C59071e f47888a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.h.d.t");

    /* renamed from: b */
    static final C53448og f47889b;

    /* renamed from: c */
    public final C21370a f47890c;

    /* renamed from: d */
    public final C15973f f47891d;

    /* renamed from: e */
    public final C16002a f47892e;

    /* renamed from: f */
    public final C16850a f47893f;

    /* renamed from: g */
    public final C16269a f47894g;

    /* renamed from: h */
    public final Executor f47895h;

    /* renamed from: i */
    public final Executor f47896i;

    /* renamed from: j */
    public final C69464a f47897j;

    /* renamed from: k */
    public final C69464a f47898k;

    /* renamed from: l */
    public final C69464a f47899l;

    /* renamed from: m */
    public final Map f47900m;

    /* renamed from: n */
    private final C47632e f47901n = new C47632e();

    static {
        C53447of ofVar = (C53447of) C53448og.f140280h.createBuilder();
        ofVar.copyOnWrite();
        C53448og ogVar = (C53448og) ofVar.instance;
        C62961ch chVar = ogVar.f140287f;
        if (!chVar.mo58948c()) {
            ogVar.f140287f = C62942bv.mutableCopy(chVar);
        }
        ogVar.f140287f.mo58916g(3600);
        f47889b = (C53448og) ofVar.build();
    }

    public C16267t(C21370a aVar, C15973f fVar, C16002a aVar2, C16850a aVar3, C16269a aVar4, Executor executor, Executor executor2, C69464a aVar5, C69464a aVar6, C69464a aVar7) {
        this.f47890c = aVar;
        this.f47891d = fVar;
        this.f47892e = aVar2;
        this.f47893f = aVar3;
        this.f47894g = aVar4;
        this.f47895h = executor;
        this.f47896i = executor2;
        this.f47897j = aVar5;
        this.f47898k = aVar6;
        this.f47899l = aVar7;
        this.f47900m = new ConcurrentHashMap();
    }

    /* renamed from: b */
    public static List m33300b(List list, Optional optional, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C52560wg wgVar = (C52560wg) it.next();
            C52568wo woVar = wgVar.f137950f;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            String str3 = woVar.f137998e;
            C52568wo woVar2 = wgVar.f137950f;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            if (!woVar2.f138011r.isEmpty()) {
                C52568wo woVar3 = wgVar.f137950f;
                if (woVar3 == null) {
                    woVar3 = C52568wo.f137992v;
                }
                str2 = (String) woVar3.f138011r.get(0);
            } else {
                C52568wo woVar4 = wgVar.f137950f;
                if (((woVar4 == null ? C52568wo.f137992v : woVar4).f137994a & 32) != 0) {
                    if (woVar4 == null) {
                        woVar4 = C52568wo.f137992v;
                    }
                    str2 = woVar4.f138002i;
                } else {
                    str2 = null;
                }
            }
            C16169m mVar = C16169m.GENERATED_ON_DEVICE;
            C60948g gVar = C60948g.f165068a;
            long longValue = ((Long) optional.orElse(Long.valueOf(Instant.now().toEpochMilli()))).longValue();
            C52568wo woVar5 = wgVar.f137950f;
            if (woVar5 == null) {
                woVar5 = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar5.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            C16331ae aeVar = (C16331ae) C16333ag.f48074n.createBuilder();
            C16328ab abVar = (C16328ab) C16330ad.f48065f.createBuilder();
            abVar.copyOnWrite();
            C16330ad adVar = (C16330ad) abVar.instance;
            wgVar.getClass();
            adVar.f48069c = wgVar;
            adVar.f48068b = 7;
            aeVar.copyOnWrite();
            C16333ag agVar = (C16333ag) aeVar.instance;
            C16330ad adVar2 = (C16330ad) abVar.build();
            adVar2.getClass();
            agVar.f48082g = adVar2;
            agVar.f48076a |= 16;
            C16334ah ahVar = (C16334ah) C16335ai.f48090k.createBuilder();
            C52567wn wnVar = C52567wn.UNKNOWN;
            C52568wo woVar6 = wgVar.f137950f;
            if (woVar6 == null) {
                woVar6 = C52568wo.f137992v;
            }
            C52567wn b = C52567wn.m86649b(woVar6.f138003j);
            if (b == null) {
                b = C52567wn.UNKNOWN;
            }
            int ordinal = b.ordinal();
            int i = ordinal != 9 ? ordinal != 21 ? 157427 : 157428 : 157429;
            ahVar.copyOnWrite();
            C16335ai aiVar = (C16335ai) ahVar.instance;
            aiVar.f48092a |= 2;
            aiVar.f48094c = i;
            String str4 = dcVar.f132817c;
            ahVar.copyOnWrite();
            C16335ai aiVar2 = (C16335ai) ahVar.instance;
            str4.getClass();
            aiVar2.f48092a |= 4;
            aiVar2.f48095d = str4;
            ahVar.copyOnWrite();
            C16335ai aiVar3 = (C16335ai) ahVar.instance;
            dcVar.getClass();
            aiVar3.f48098g = dcVar;
            aiVar3.f48092a |= 16;
            aeVar.copyOnWrite();
            C16333ag agVar2 = (C16333ag) aeVar.instance;
            C16335ai aiVar4 = (C16335ai) ahVar.build();
            aiVar4.getClass();
            agVar2.f48084i = aiVar4;
            agVar2.f48076a |= 32;
            C16064a aVar = new C16064a();
            aVar.f47528a = C16170n.m33198i(str3, str, mVar);
            aVar.mo22676b(str3);
            aVar.f47529b = str2;
            aVar.mo22678d(str);
            aVar.mo22680f(mVar);
            aVar.f47530c = Long.valueOf(longValue);
            aVar.mo22679e((C16333ag) aeVar.build());
            arrayList.add(aVar.mo22675a());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C60870cx mo22866a(C16091aq aqVar, C11675af afVar) {
        return this.f47901n.mo51512b(new C16248a(this, aqVar, afVar), this.f47896i);
    }
}
