package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.p983b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13461c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13537m;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13540p;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13541q;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.C13547a;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.C34890k;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35600a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35601b;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35602c;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62995dn;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.b.b.a */
/* compiled from: PG */
public final class C13558a implements C35601b {

    /* renamed from: a */
    private static final C59071e f41533a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.d.b.b.a");

    /* renamed from: b */
    private final C15481g f41534b;

    /* renamed from: c */
    private final C58833ax f41535c;

    /* renamed from: d */
    private final C69464a f41536d;

    /* renamed from: e */
    private final C69464a f41537e;

    /* renamed from: f */
    private final C69464a f41538f;

    /* renamed from: g */
    private final C69464a f41539g;

    /* renamed from: h */
    private final C69464a f41540h;

    /* renamed from: i */
    private final C69464a f41541i;

    /* renamed from: j */
    private final C69464a f41542j;

    /* renamed from: k */
    private final C69464a f41543k;

    /* renamed from: l */
    private final C69464a f41544l;

    public C13558a(C58833ax axVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C15481g gVar) {
        this.f41535c = axVar;
        this.f41536d = aVar;
        this.f41537e = aVar2;
        this.f41538f = aVar3;
        this.f41539g = aVar4;
        this.f41540h = aVar8;
        this.f41541i = aVar9;
        this.f41542j = aVar5;
        this.f41543k = aVar6;
        this.f41544l = aVar7;
        this.f41534b = gVar;
    }

    /* renamed from: b */
    private static List m29841b(C69464a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : ((C65599b) aVar.mo17428b()).f178301a) {
            C13529e a = C13529e.m29814a(num.intValue());
            if (a != null) {
                arrayList.add(a);
                if (a == C13529e.SHARE_LOCATION) {
                    arrayList.add(C13529e.SHARE_ETA);
                }
                C58976aa aaVar = C58975e.f156826a;
            } else {
                C59104x d = f41533a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SmartActionSideEffect");
                ((C59052c) ((C59052c) d).mo56372aa(44897)).mo56389s("Unexpected supported smart action type value %d", num);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C60870cx mo21168a(C58833ax axVar, C35602c cVar) {
        if (!axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60866ct.f164955a;
        } else if (!this.f41535c.mo56113h()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C60866ct.f164955a;
        } else if (!((Boolean) this.f41536d.mo17428b()).booleanValue() && !((Boolean) this.f41539g.mo17428b()).booleanValue()) {
            C58976aa aaVar3 = C58975e.f156826a;
            return C60866ct.f164955a;
        } else if (!((Boolean) this.f41536d.mo17428b()).booleanValue() && ((Boolean) this.f41539g.mo17428b()).booleanValue()) {
            C58976aa aaVar4 = C58975e.f156826a;
            return ((C13547a) this.f41535c.mo56107c()).mo21165c();
        } else if (((C35600a) cVar).f93440a.booleanValue()) {
            C58976aa aaVar5 = C58975e.f156826a;
            this.f41534b.mo22352b(C37179a.f97530bw);
            C13547a aVar = (C13547a) this.f41535c.mo56107c();
            boolean booleanValue = ((Boolean) this.f41537e.mo17428b()).booleanValue();
            boolean booleanValue2 = ((Boolean) this.f41538f.mo17428b()).booleanValue();
            C69464a aVar2 = this.f41542j;
            C69464a aVar3 = this.f41543k;
            C58495hd r = C58495hd.m89904r(2, Float.valueOf(((Double) aVar2.mo17428b()).floatValue()), 4, Float.valueOf(((Double) aVar2.mo17428b()).floatValue()), 6, Float.valueOf(((Double) aVar3.mo17428b()).floatValue()), 7, Float.valueOf(((Double) aVar3.mo17428b()).floatValue()), 8, Float.valueOf(((Double) this.f41544l.mo17428b()).floatValue()));
            List<C13529e> b = m29841b(this.f41540h);
            List<C13529e> b2 = m29841b(this.f41541i);
            ArrayList arrayList = new ArrayList();
            C58485gu a = ((C34890k) axVar.mo56107c()).mo39602a();
            int size = a.size();
            int i = 0;
            while (i < size) {
                BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) a.get(i);
                C13537m mVar = (C13537m) C13543s.f41500j.createBuilder();
                if (booleanValue) {
                    mVar.mo21158c(C13461c.TC_LIB);
                    mVar.copyOnWrite();
                    C13543s sVar = (C13543s) mVar.instance;
                    sVar.mo21159a();
                    for (C13529e number : b) {
                        sVar.f41503b.mo58916g(number.getNumber());
                        a = a;
                    }
                }
                C58485gu guVar = a;
                if (booleanValue2) {
                    mVar.mo21158c(C13461c.HEURISTIC);
                    mVar.copyOnWrite();
                    C13543s sVar2 = (C13543s) mVar.instance;
                    C62961ch chVar = sVar2.f41504d;
                    if (!chVar.mo58948c()) {
                        sVar2.f41504d = C62942bv.mutableCopy(chVar);
                    }
                    for (C13529e number2 : b2) {
                        sVar2.f41504d.mo58916g(number2.getNumber());
                    }
                }
                C58800sl lA = r.entrySet().iterator();
                while (lA.hasNext()) {
                    Map.Entry entry = (Map.Entry) lA.next();
                    int intValue = ((Integer) entry.getKey()).intValue();
                    float floatValue = ((Float) entry.getValue()).floatValue();
                    mVar.copyOnWrite();
                    C13543s sVar3 = (C13543s) mVar.instance;
                    C58800sl slVar = lA;
                    C62995dn dnVar = sVar3.f41505f;
                    boolean z = booleanValue;
                    if (!dnVar.f170058b) {
                        sVar3.f41505f = dnVar.mo58980a();
                    }
                    sVar3.f41505f.put(Integer.valueOf(intValue), Float.valueOf(floatValue));
                    lA = slVar;
                    booleanValue = z;
                }
                boolean z2 = booleanValue;
                ArrayList arrayList2 = new ArrayList();
                C58485gu a2 = bundledMessageNotification.mo39538a();
                int size2 = a2.size();
                int i2 = 0;
                while (i2 < size2) {
                    MessageNotification messageNotification = (MessageNotification) a2.get(i2);
                    C13540p pVar = (C13540p) C13541q.f41491d.createBuilder();
                    C58485gu guVar2 = a2;
                    String obj = messageNotification.mo39562s().toString();
                    pVar.copyOnWrite();
                    boolean z3 = booleanValue2;
                    obj.getClass();
                    ((C13541q) pVar.instance).f41493a = obj;
                    String obj2 = ((CharSequence) messageNotification.mo39557n().orElse(BuildConfig.FLAVOR)).toString();
                    pVar.copyOnWrite();
                    obj2.getClass();
                    ((C13541q) pVar.instance).f41494b = obj2;
                    if (messageNotification.mo39561r().isPresent()) {
                        long longValue = ((Long) messageNotification.mo39561r().get()).longValue();
                        pVar.copyOnWrite();
                        ((C13541q) pVar.instance).f41495c = longValue;
                    }
                    arrayList2.add((C13541q) pVar.build());
                    i2++;
                    booleanValue2 = z3;
                    a2 = guVar2;
                }
                boolean z4 = booleanValue2;
                if (!arrayList2.isEmpty()) {
                    mVar.mo21156a(arrayList2);
                    arrayList.add((C13543s) mVar.build());
                }
                i++;
                a = guVar;
                booleanValue2 = z4;
                booleanValue = z2;
            }
            return aVar.mo21166d(C60856cj.m92900i(arrayList));
        } else {
            C58976aa aaVar6 = C58975e.f156826a;
            this.f41534b.mo22352b(C37179a.f97529bv);
            return ((C13547a) this.f41535c.mo56107c()).mo21163a();
        }
    }
}
