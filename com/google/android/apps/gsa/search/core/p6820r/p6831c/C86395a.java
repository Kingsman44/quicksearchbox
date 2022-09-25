package com.google.android.apps.gsa.search.core.p6820r.p6831c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7053c.C89882e;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.shared.search.C90499g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60325oi;
import com.google.common.p4552o.C60329om;
import com.google.common.p4552o.C60528tf;
import com.google.common.p4552o.C60529tg;
import com.google.common.p4552o.C60530th;
import com.google.common.p4552o.C60531ti;
import com.google.common.p4552o.C60532tj;
import com.google.common.p4552o.C60534tl;
import com.google.common.p4552o.C60535tm;
import com.google.common.p4552o.C60537to;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60556ug;
import com.google.common.p4552o.C60557uh;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.r.c.a */
/* compiled from: PG */
public final class C86395a {

    /* renamed from: a */
    public C89882e f233509a;

    /* renamed from: b */
    public boolean f233510b;

    /* renamed from: c */
    private final C89859i f233511c;

    /* renamed from: d */
    private final C21370a f233512d;

    /* renamed from: e */
    private final C68214a f233513e;

    /* renamed from: f */
    private final AtomicBoolean f233514f = new AtomicBoolean();

    /* renamed from: g */
    private final EnumMap f233515g = new EnumMap(C60534tl.class);

    public C86395a(C89859i iVar, C21370a aVar, C68214a aVar2) {
        this.f233511c = iVar;
        this.f233512d = aVar;
        this.f233513e = aVar2;
    }

    /* renamed from: a */
    public final long mo80166a(C60534tl tlVar) {
        C58838bb.m90868c(this.f233515g.containsKey(tlVar));
        return ((Long) this.f233515g.get(tlVar)).longValue();
    }

    /* renamed from: b */
    public final void mo80167b(Query query, int i, C60537to toVar, C90456c cVar) {
        C89849ae aeVar;
        int i2;
        Query query2 = query;
        int i3 = i;
        C60537to toVar2 = toVar;
        if (this.f233514f.compareAndSet(false, true)) {
            if (i3 == 463) {
                aeVar = C89849ae.VBUS_ENDSTATE_SUCCESS;
            } else if (i3 == 465) {
                aeVar = C89849ae.VBUS_ENDSTATE_CANCEL;
            } else {
                aeVar = C89849ae.VBUS_ENDSTATE_FAILURE;
                i3 = 464;
            }
            C59582aj ajVar = (C59582aj) C90499g.m147581a(query2, ((SharedPreferences) this.f233513e.mo27525b()).getLong("last_missed_hotword_time_ms", -1)).toBuilder();
            int i4 = toVar2.f164013af;
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160062a |= 1;
            cbVar.f160124e = i4;
            C89882e eVar = this.f233509a;
            if (eVar != null) {
                C89059o a = eVar.mo83715a();
                if (a != null) {
                    C60325oi a2 = a.mo27426a();
                    ajVar.copyOnWrite();
                    C59687cb cbVar2 = (C59687cb) ajVar.instance;
                    a2.getClass();
                    cbVar2.f160137r = a2;
                    cbVar2.f160062a |= 32768;
                    C60329om b = a.mo27427b();
                    ajVar.copyOnWrite();
                    C59687cb cbVar3 = (C59687cb) ajVar.instance;
                    b.getClass();
                    cbVar3.f160138s = b;
                    cbVar3.f160062a |= 65536;
                }
                if (eVar.mo83717c()) {
                    ajVar.copyOnWrite();
                    C59687cb cbVar4 = (C59687cb) ajVar.instance;
                    cbVar4.f160114az = 2;
                    cbVar4.f160122c |= 4194304;
                } else if (eVar.mo83716b()) {
                    ajVar.copyOnWrite();
                    C59687cb cbVar5 = (C59687cb) ajVar.instance;
                    cbVar5.f160114az = 1;
                    cbVar5.f160122c |= 4194304;
                } else {
                    ajVar.copyOnWrite();
                    C59687cb cbVar6 = (C59687cb) ajVar.instance;
                    cbVar6.f160114az = 0;
                    cbVar6.f160122c |= 4194304;
                }
            }
            if (cVar != null) {
                ajVar.copyOnWrite();
                ((C59687cb) ajVar.instance).f160125f = C59687cb.emptyProtobufList();
                List d = C90454b.m147154d(cVar);
                ArrayList arrayList = new ArrayList(d.size());
                int size = d.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C90456c cVar2 = (C90456c) d.get(size);
                    C59742e eVar2 = (C59742e) C59770f.f161501d.createBuilder();
                    int b2 = cVar2.mo79844b();
                    eVar2.copyOnWrite();
                    C59770f fVar = (C59770f) eVar2.instance;
                    fVar.f161503a |= 1;
                    fVar.f161504b = b2;
                    int a3 = cVar2.mo79843a();
                    eVar2.copyOnWrite();
                    C59770f fVar2 = (C59770f) eVar2.instance;
                    fVar2.f161503a |= 2;
                    fVar2.f161505c = a3;
                    arrayList.add((C59770f) eVar2.build());
                }
                ajVar.mo57006c(arrayList);
            }
            C89859i iVar = this.f233511c;
            C89856f fVar3 = new C89856f();
            fVar3.f246201a = aeVar;
            fVar3.f246203c = (C59687cb) ajVar.build();
            fVar3.mo83701c("rId", Long.toString(query2.f252749G));
            iVar.mo74236a(fVar3.mo83699a());
            if (query.mo84420dA() && !query.mo84422dC() && !query.mo84380cM() && (query.mo84421dB() || query.mo84424dE())) {
                if (aeVar == C89849ae.VBUS_ENDSTATE_SUCCESS) {
                    aeVar = C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_SUCCESS;
                } else if (aeVar == C89849ae.VBUS_ENDSTATE_CANCEL) {
                    aeVar = C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_CANCEL;
                } else if (aeVar == C89849ae.VBUS_ENDSTATE_FAILURE) {
                    aeVar = C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_FAILURE;
                }
                if (aeVar == C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_SUCCESS || aeVar == C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_CANCEL || aeVar == C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_FAILURE) {
                    C89859i iVar2 = this.f233511c;
                    C89856f fVar4 = new C89856f();
                    fVar4.f246201a = aeVar;
                    fVar4.f246203c = (C59687cb) ajVar.build();
                    fVar4.mo83701c("rId", Long.toString(query2.f252749G));
                    iVar2.mo74236a(fVar4.mo83699a());
                }
            }
            C89882e eVar3 = this.f233509a;
            C89059o a4 = eVar3 != null ? eVar3.mo83715a() : null;
            long j = query2.f252749G;
            EnumMap enumMap = this.f233515g;
            long c = this.f233512d.mo26871c();
            ArrayList arrayList2 = new ArrayList(enumMap.size());
            for (Map.Entry entry : enumMap.entrySet()) {
                long min = Math.min(c - ((Long) entry.getValue()).longValue(), 2147483647L);
                C60532tj tjVar = (C60532tj) C60535tm.f163949d.createBuilder();
                tjVar.copyOnWrite();
                C60535tm tmVar = (C60535tm) tjVar.instance;
                tmVar.f163952b = ((C60534tl) entry.getKey()).f163948v;
                tmVar.f163951a |= 1;
                tjVar.copyOnWrite();
                C60535tm tmVar2 = (C60535tm) tjVar.instance;
                tmVar2.f163951a |= 2;
                tmVar2.f163953c = (int) min;
                arrayList2.add((C60535tm) tjVar.build());
                c = c;
            }
            C60530th thVar = (C60530th) C60531ti.f163912l.createBuilder();
            thVar.copyOnWrite();
            C60531ti tiVar = (C60531ti) thVar.instance;
            tiVar.f163915b = toVar2.f164013af;
            tiVar.f163914a |= 1;
            thVar.copyOnWrite();
            C60531ti tiVar2 = (C60531ti) thVar.instance;
            C62971cq cqVar = tiVar2.f163916c;
            if (!cqVar.mo58948c()) {
                tiVar2.f163916c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList2, (List) tiVar2.f163916c);
            if (a4 != null) {
                C60325oi a5 = a4.mo27426a();
                thVar.copyOnWrite();
                C60531ti tiVar3 = (C60531ti) thVar.instance;
                a5.getClass();
                tiVar3.f163924k = a5;
                tiVar3.f163914a |= 128;
                C60329om b3 = a4.mo27427b();
                thVar.copyOnWrite();
                C60531ti tiVar4 = (C60531ti) thVar.instance;
                b3.getClass();
                tiVar4.f163918e = b3;
                tiVar4.f163914a |= 2;
            }
            if (cVar != null) {
                List d2 = C90454b.m147154d(cVar);
                ArrayList arrayList3 = new ArrayList();
                for (C90456c cVar3 : C58597ky.m90216g(d2)) {
                    C60528tf tfVar = (C60528tf) C60529tg.f163907d.createBuilder();
                    int b4 = cVar3.mo79844b();
                    tfVar.copyOnWrite();
                    C60529tg tgVar = (C60529tg) tfVar.instance;
                    tgVar.f163909a |= 1;
                    tgVar.f163910b = b4;
                    int a6 = cVar3.mo79843a();
                    tfVar.copyOnWrite();
                    C60529tg tgVar2 = (C60529tg) tfVar.instance;
                    tgVar2.f163909a |= 2;
                    tgVar2.f163911c = a6;
                    arrayList3.add((C60529tg) tfVar.build());
                }
                thVar.copyOnWrite();
                C60531ti tiVar5 = (C60531ti) thVar.instance;
                C62971cq cqVar2 = tiVar5.f163917d;
                if (!cqVar2.mo58948c()) {
                    tiVar5.f163917d = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) arrayList3, (List) tiVar5.f163917d);
            }
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = i3;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C60531ti tiVar6 = (C60531ti) thVar.build();
            tiVar6.getClass();
            ufVar2.f164140au = tiVar6;
            ufVar2.f164249d |= C89885b.HTTP_VALUE;
            C60548tz tzVar2 = (C60548tz) ((C60555uf) tzVar.build()).toBuilder();
            String b5 = C39191a.m68623b(query2.f252749G);
            tzVar2.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar2.instance;
            b5.getClass();
            ufVar3.f164093a |= 4;
            ufVar3.f164259n = b5;
            C60531ti tiVar7 = ufVar3.f164140au;
            if (tiVar7 == null) {
                tiVar7 = C60531ti.f163912l;
            }
            C60530th thVar2 = (C60530th) tiVar7.toBuilder();
            boolean cd = query.mo84397cd();
            thVar2.copyOnWrite();
            C60531ti tiVar8 = (C60531ti) thVar2.instance;
            tiVar8.f163914a |= 32;
            tiVar8.f163922i = cd;
            boolean z = this.f233510b;
            thVar2.copyOnWrite();
            C60531ti tiVar9 = (C60531ti) thVar2.instance;
            tiVar9.f163914a |= 64;
            tiVar9.f163923j = z;
            if (query.mo84392cY()) {
                i2 = 160;
            } else if (query.mo84420dA()) {
                i2 = 161;
            } else {
                i2 = query.mo84369cB() ? query.mo84438dS() ? 581 : 173 : 273;
            }
            thVar2.copyOnWrite();
            C60531ti tiVar10 = (C60531ti) thVar2.instance;
            tiVar10.f163914a |= 16;
            tiVar10.f163921h = i2;
            if (query.mo84332bQ() || query.mo84415cv() || query2.f252784w != 0) {
                C60556ug ugVar = (C60556ug) C60557uh.f164272e.createBuilder();
                if (query.mo84332bQ()) {
                    ugVar.copyOnWrite();
                    C60557uh uhVar = (C60557uh) ugVar.instance;
                    uhVar.f164274a |= 1;
                    uhVar.f164275b = true;
                }
                if (query.mo84415cv()) {
                    ugVar.copyOnWrite();
                    C60557uh uhVar2 = (C60557uh) ugVar.instance;
                    uhVar2.f164274a |= 2;
                    uhVar2.f164276c = true;
                }
                int i5 = query2.f252784w;
                if (i5 != 0) {
                    ugVar.copyOnWrite();
                    C60557uh uhVar3 = (C60557uh) ugVar.instance;
                    uhVar3.f164274a |= 4;
                    uhVar3.f164277d = i5;
                }
                thVar2.copyOnWrite();
                C60531ti tiVar11 = (C60531ti) thVar2.instance;
                C60557uh uhVar4 = (C60557uh) ugVar.build();
                uhVar4.getClass();
                tiVar11.f163920g = uhVar4;
                tiVar11.f163914a |= 8;
            }
            long j2 = query2.f252753K;
            if (j2 != 0) {
                thVar2.copyOnWrite();
                C60531ti tiVar12 = (C60531ti) thVar2.instance;
                tiVar12.f163914a |= 4;
                tiVar12.f163919f = j2;
            }
            tzVar2.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar2.instance;
            C60531ti tiVar13 = (C60531ti) thVar2.build();
            tiVar13.getClass();
            ufVar4.f164140au = tiVar13;
            ufVar4.f164249d |= C89885b.HTTP_VALUE;
            C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }

    /* renamed from: c */
    public final void mo80168c(C60534tl tlVar, long j) {
        this.f233515g.put(tlVar, Long.valueOf(j));
    }
}
