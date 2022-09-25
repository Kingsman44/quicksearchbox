package com.google.android.libraries.assistant.auto.ondevice.utils;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85713a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11933a;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11937e;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11938f;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.base.C58833ax;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4152bb.p4153a.C55064en;
import com.google.p4152bb.p4153a.C55069es;
import com.google.p4152bb.p4153a.C55073ew;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.p4152bb.p4153a.C55097ft;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.p4855d.p4856a.C63442ab;
import com.google.protos.p4850an.p4855d.p4856a.C63446af;
import com.google.protos.p4850an.p4855d.p4856a.C63463p;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import com.google.protos.p4985f.p4988b.p4993d.C64784d;
import com.google.protos.p4985f.p4988b.p4993d.C64787g;
import com.google.protos.p4985f.p4988b.p4993d.C64788h;
import com.google.protos.p4985f.p4988b.p4993d.C64790j;
import com.google.protos.p4985f.p4988b.p4993d.C64791k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.e */
/* compiled from: PG */
public final class C11942e {

    /* renamed from: b */
    public static final /* synthetic */ int f38361b = 0;

    /* renamed from: c */
    private static final C58974d f38362c = C58974d.m91134h("ContactDisambiguation");

    /* renamed from: a */
    final List f38363a = new ArrayList();

    /* renamed from: d */
    private final b f38364d;

    /* renamed from: e */
    private final CommsNlgUtil f38365e;

    /* renamed from: f */
    private final C86124t f38366f;

    /* renamed from: g */
    private final C85713a f38367g;

    /* renamed from: h */
    private int f38368h = 0;

    /* renamed from: i */
    private C55093fp f38369i = C55093fp.f144965l;

    /* renamed from: j */
    private C64782b f38370j = C64782b.f175579d;

    /* renamed from: k */
    private C64782b f38371k = C64782b.f175579d;

    /* renamed from: l */
    private boolean f38372l;

    /* renamed from: m */
    private C63463p f38373m = C63463p.f171507e;

    /* renamed from: n */
    private C63442ab f38374n = C63442ab.f171454e;

    /* renamed from: o */
    private final C9309a f38375o;

    public C11942e(b bVar, CommsNlgUtil commsNlgUtil, C86124t tVar, C85713a aVar, C9309a aVar2) {
        this.f38364d = bVar;
        this.f38365e = commsNlgUtil;
        this.f38366f = tVar;
        this.f38367g = aVar;
        this.f38375o = aVar2;
    }

    /* renamed from: b */
    private final C11934b m27758b(List list) {
        C11933a aVar = (C11933a) C11934b.f38331c.createBuilder();
        C11937e eVar = (C11937e) C11938f.f38347e.createBuilder();
        eVar.copyOnWrite();
        C11938f fVar = (C11938f) eVar.instance;
        fVar.f38349a |= 2;
        fVar.f38351c = true;
        eVar.mo20314a(list);
        C64782b bVar = this.f38370j;
        eVar.copyOnWrite();
        C11938f fVar2 = (C11938f) eVar.instance;
        bVar.getClass();
        fVar2.f38350b = bVar;
        fVar2.f38349a |= 1;
        aVar.copyOnWrite();
        C11934b bVar2 = (C11934b) aVar.instance;
        C11938f fVar3 = (C11938f) eVar.build();
        fVar3.getClass();
        bVar2.f38334b = fVar3;
        bVar2.f38333a = 1;
        C11934b bVar3 = (C11934b) aVar.build();
        this.f38368h = 0;
        this.f38370j = C64782b.f175579d;
        this.f38369i = C55093fp.f144965l;
        this.f38373m = C63463p.f171507e;
        this.f38363a.clear();
        return bVar3;
    }

    /* renamed from: c */
    private final C58485gu m27759c(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55073ew ewVar = (C55073ew) it.next();
            if (C11945h.m27791p(this.f38370j, "contact_type") == 4) {
                C55097ft ftVar = ewVar.f144884c;
                if (ftVar == null) {
                    ftVar = C55097ft.f144980d;
                }
                if (!C11943f.m27772f(ftVar, this.f38374n, z, this.f38375o.f32299a.mo79344b())) {
                }
            }
            arrayList.add(ewVar);
        }
        return C58485gu.m89842j(arrayList);
    }

    /* renamed from: d */
    private final C55082fe m27760d() {
        String h = C11945h.m27783h(this.f38370j, "client_entity_id");
        if (h == null) {
            ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43865)).mo56386p("#getConfirmedContact: contact id is not confirmed.");
            return null;
        }
        C55082fe a = C11943f.m27768a(this.f38369i, h);
        if (a == null) {
            ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43864)).mo56386p("#getConfirmedContact: contact id doesn't exist in ContactReference.");
        }
        return a;
    }

    /* renamed from: e */
    private final boolean m27761e() {
        C64784d dVar = this.f38370j.f175582b;
        if (dVar == null) {
            dVar = C64784d.f175584d;
        }
        return dVar.f175587b.equals("call.CONTACT") || C11945h.m27783h(this.f38370j, "provider").equals("SMS");
    }

    /* renamed from: f */
    private final int m27762f() {
        C55082fe d = m27760d();
        if (d == null) {
            ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43834)).mo56386p("#populateAppIdFromContact: failed to get confirmed contact.");
            return 2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String h = C11945h.m27783h(this.f38370j, "provider");
        if (!h.equals("hangout") && this.f38373m.f171511c.size() > 0) {
            String str = (String) this.f38373m.f171511c.get(0);
            for (C55064en enVar : d.f144929p) {
                if (enVar.f144861b.equals(str)) {
                    arrayList.add(enVar.f144864e);
                    arrayList2.add(enVar.f144863d);
                }
            }
        } else if (h.equals("hangout")) {
            for (C55069es esVar : d.f144927n) {
                arrayList.add(esVar.f144873b);
                arrayList2.add(esVar.f144874c);
            }
        }
        if (arrayList2.size() == 1) {
            this.f38370j = C11945h.m27782g(this.f38370j, "contact_number", (String) arrayList2.get(0));
            return 4;
        } else if (arrayList2.size() > 1) {
            this.f38370j = C11945h.m27789n(this.f38370j, arrayList2, arrayList);
            return 4;
        } else {
            ((C58970a) ((C58970a) f38362c.mo56225c()).mo56372aa(43833)).mo56386p("#populateAppNumberFromContact: cannot find any matched app account.");
            return 8;
        }
    }

    /* renamed from: g */
    private final int m27763g(C63446af afVar) {
        String d = C11943f.m27770d(afVar);
        if (this.f38369i.f144969c.size() <= 0) {
            return 2;
        }
        ArrayList arrayList = new ArrayList();
        if (C11945h.m27788m(this.f38370j, "client_entity_id")) {
            C55082fe a = C11943f.m27768a(this.f38369i, C11945h.m27783h(this.f38370j, "client_entity_id"));
            if (a != null) {
                arrayList.add(a);
            }
        } else {
            arrayList.addAll(this.f38369i.f144969c);
        }
        if (arrayList.isEmpty()) {
            return 2;
        }
        if (arrayList.size() == 1) {
            this.f38370j = C11945h.m27782g(this.f38370j, "client_entity_id", ((C55082fe) arrayList.get(0)).f144920g);
            return m27765i();
        }
        arrayList.size();
        C64782b o = C11945h.m27790o(this.f38370j, "client_entity_id", 2);
        this.f38370j = o;
        this.f38370j = C11945h.m27781f(o, "client_entity_id", d);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C55082fe feVar = (C55082fe) arrayList.get(i);
            C64790j jVar = (C64790j) C64791k.f175598d.createBuilder();
            C64787g gVar = (C64787g) C64788h.f175594c.createBuilder();
            String str = feVar.f144920g;
            gVar.copyOnWrite();
            C64788h hVar = (C64788h) gVar.instance;
            str.getClass();
            hVar.f175596a = 4;
            hVar.f175597b = str;
            jVar.copyOnWrite();
            C64791k kVar = (C64791k) jVar.instance;
            C64788h hVar2 = (C64788h) gVar.build();
            hVar2.getClass();
            kVar.f175601b = hVar2;
            kVar.f175600a |= 1;
            jVar.mo59312a(feVar.f144915b);
            arrayList2.add((C64791k) jVar.build());
        }
        this.f38370j = C11945h.m27780e(this.f38370j, "client_entity_id", arrayList2);
        return 4;
    }

    /* renamed from: h */
    private final int m27764h() {
        C55082fe d = m27760d();
        if (d == null) {
            ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43845)).mo56386p("#populatePhoneTypeFromContact: failed to get confirmed contact.");
            return 2;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f38363a.clear();
        C62971cq cqVar = d.f144921h;
        C58485gu<C55073ew> c = m27759c(cqVar, true);
        if (c.isEmpty()) {
            c = m27759c(cqVar, false);
        }
        for (C55073ew ewVar : c) {
            C55097ft ftVar = ewVar.f144884c;
            if (ftVar == null) {
                ftVar = C55097ft.f144980d;
            }
            if (!hashMap.containsKey(ftVar.f144984c)) {
                this.f38363a.add(ftVar);
                hashMap.put(ftVar.f144984c, new ArrayList());
                C64790j jVar = (C64790j) C64791k.f175598d.createBuilder();
                C64787g gVar = (C64787g) C64788h.f175594c.createBuilder();
                String str = ftVar.f144984c;
                gVar.copyOnWrite();
                C64788h hVar = (C64788h) gVar.instance;
                str.getClass();
                hVar.f175596a = 4;
                hVar.f175597b = str;
                jVar.copyOnWrite();
                C64791k kVar = (C64791k) jVar.instance;
                C64788h hVar2 = (C64788h) gVar.build();
                hVar2.getClass();
                kVar.f175601b = hVar2;
                kVar.f175600a |= 1;
                arrayList.add((C64791k) jVar.build());
            }
            List list = (List) hashMap.get(ftVar.f144984c);
            list.getClass();
            list.add(ewVar.f144883b);
        }
        if (hashMap.size() == 1) {
            Iterator it = hashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                this.f38370j = C11945h.m27782g(this.f38370j, "contact_type", (String) entry.getKey());
                List list2 = (List) entry.getValue();
                if (list2.size() == 1) {
                    this.f38370j = C11945h.m27782g(this.f38370j, "contact_number", (String) list2.get(0));
                } else {
                    this.f38370j = C11945h.m27776a(this.f38370j, "contact_number", list2);
                }
                return 4;
            }
        } else if (hashMap.size() > 1) {
            C64782b e = C11945h.m27780e(this.f38370j, "contact_type", arrayList);
            this.f38370j = e;
            this.f38370j = C11945h.m27790o(e, "contact_type", 2);
        } else {
            ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43841)).mo56386p("#populatePhoneTypeFromContact:No phone type in contact");
            return 2;
        }
        return 4;
    }

    /* renamed from: i */
    private final int m27765i() {
        C64784d dVar = this.f38370j.f175582b;
        if (dVar == null) {
            dVar = C64784d.f175584d;
        }
        if (dVar.f175587b.equals("call.CONTACT")) {
            return m27764h();
        }
        C55082fe d = m27760d();
        if (d == null) {
            ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43847)).mo56386p("#populateProviderFromContact: failed to get confirmed contact.");
            return 2;
        } else if (!C11945h.m27788m(this.f38370j, "provider")) {
            ArrayList arrayList = new ArrayList();
            if (d.f144921h.size() > 0) {
                arrayList.add("SMS");
            }
            if (d.f144927n.size() > 0) {
                arrayList.add("hangout");
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C55064en enVar : d.f144929p) {
                if ((enVar.f144860a & 2) != 0) {
                    linkedHashSet.add(enVar.f144862c);
                } else {
                    C58833ax a = this.f38367g.mo79363a(enVar.f144861b);
                    if (!a.mo56113h()) {
                        ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43851)).mo56389s("Unable to find this app on device. Its AppId is %s", enVar.f144861b);
                    } else {
                        String str = ((C51058ev) a.mo56107c()).f132948f;
                        if (!str.isEmpty()) {
                            linkedHashSet.add(str);
                        } else {
                            ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43850)).mo56389s("The app has no localized name. AppId is %s", enVar.f144861b);
                        }
                    }
                }
            }
            arrayList.addAll(linkedHashSet);
            if (arrayList.size() == 1) {
                C58485gu j = C58485gu.m89842j(arrayList);
                if (d.f144921h.size() > 0) {
                    this.f38370j = C11945h.m27782g(this.f38370j, "provider", "SMS");
                    return m27764h();
                } else if (!j.isEmpty()) {
                    if (j.size() > 1) {
                        ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43807)).mo56386p("#handleContactWithSingleTypeAccount: more than one providers are found. Only use the first one.");
                    }
                    C64782b g = C11945h.m27782g(this.f38370j, "provider", (String) j.get(0));
                    this.f38370j = g;
                    this.f38370j = C11945h.m27782g(g, "contact_type", (String) j.get(0));
                    return m27762f();
                } else {
                    ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43806)).mo56389s("#handleContactWithSingleTypeAccount: No contact info found from the contact %s", d.f144915b);
                    return 2;
                }
            } else if (arrayList.isEmpty()) {
                ((C58970a) ((C58970a) f38362c.mo56226d()).mo56372aa(43849)).mo56386p("#populateProvidersToIntentState: no provider is found");
                return 2;
            } else {
                this.f38370j = C11945h.m27776a(this.f38370j, "provider", arrayList);
                return 4;
            }
        } else if (C58890d.m90990e(C11945h.m27783h(this.f38370j, "provider"), "SMS")) {
            return m27764h();
        } else {
            return m27762f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0234, code lost:
        if (r12 == 4) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0328, code lost:
        if (r0.f38372l == false) goto L_0x0413;
     */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a A[LOOP:0: B:64:0x00ea->B:211:0x041a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x041f A[EDGE_INSN: B:242:0x041f->B:212:0x041f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b mo20315a(com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r1.f38333a
            r3 = 2
            if (r2 != r3) goto L_0x000e
            java.lang.Object r2 = r1.f38334b
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r2 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r2
            goto L_0x0010
        L_0x000e:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d.f38336i
        L_0x0010:
            com.google.bb.a.fp r2 = r2.f38339b
            if (r2 != 0) goto L_0x0016
            com.google.bb.a.fp r2 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x0016:
            r0.f38369i = r2
            int r2 = r1.f38333a
            if (r2 != r3) goto L_0x0021
            java.lang.Object r2 = r1.f38334b
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r2 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r2
            goto L_0x0023
        L_0x0021:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d.f38336i
        L_0x0023:
            com.google.protos.f.b.d.b r2 = r2.f38341d
            if (r2 != 0) goto L_0x0029
            com.google.protos.f.b.d.b r2 = com.google.protos.p4985f.p4988b.p4993d.C64782b.f175579d
        L_0x0029:
            r0.f38370j = r2
            int r2 = r1.f38333a
            if (r2 != r3) goto L_0x0034
            java.lang.Object r2 = r1.f38334b
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r2 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r2
            goto L_0x0036
        L_0x0034:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d.f38336i
        L_0x0036:
            com.google.protos.an.d.a.p r2 = r2.f38345h
            if (r2 != 0) goto L_0x003c
            com.google.protos.an.d.a.p r2 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
        L_0x003c:
            r0.f38373m = r2
            com.google.protos.f.b.d.b r2 = r0.f38370j
            r0.f38371k = r2
            int r2 = r1.f38333a
            if (r2 != r3) goto L_0x004b
            java.lang.Object r1 = r1.f38334b
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r1 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r1
            goto L_0x004d
        L_0x004b:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r1 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d.f38336i
        L_0x004d:
            com.google.bb.a.fp r2 = r1.f38339b
            if (r2 != 0) goto L_0x0053
            com.google.bb.a.fp r2 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x0053:
            com.google.protobuf.cq r2 = r2.f144969c
            int r2 = r2.size()
            r4 = 7
            r5 = 5
            r6 = 1
            r7 = 0
            r8 = 4
            if (r2 != r6) goto L_0x007d
            int r2 = r1.f38338a
            r2 = r2 & r3
            if (r2 == 0) goto L_0x007d
            com.google.bb.a.fp r2 = r1.f38339b
            if (r2 != 0) goto L_0x006b
            com.google.bb.a.fp r2 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x006b:
            com.google.protobuf.cq r2 = r2.f144969c
            java.lang.Object r2 = r2.get(r7)
            com.google.bb.a.fe r2 = (com.google.p4152bb.p4153a.C55082fe) r2
            com.google.protobuf.cq r2 = r2.f144921h
            int r2 = r2.size()
            if (r2 != 0) goto L_0x007d
            r2 = 6
            goto L_0x00cd
        L_0x007d:
            com.google.bb.a.fp r2 = r1.f38339b
            if (r2 != 0) goto L_0x0083
            com.google.bb.a.fp r2 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x0083:
            com.google.protobuf.cq r2 = r2.f144969c
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x008d
        L_0x008b:
            r2 = 4
            goto L_0x00cd
        L_0x008d:
            com.google.protobuf.cq r2 = r1.f38343f
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x008b
            com.google.protobuf.cq r2 = r1.f38343f
            java.lang.Object r2 = r2.get(r7)
            com.google.protos.an.d.a.af r2 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r2
            com.google.protos.an.d.g.b r2 = r2.f171464b
            if (r2 != 0) goto L_0x00a3
            com.google.protos.an.d.g.b r2 = com.google.protos.p4850an.p4855d.p4862g.C63565b.f171933j
        L_0x00a3:
            com.google.protobuf.cq r2 = r2.f171941g
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x008b
            com.google.protobuf.cq r2 = r1.f38343f
            java.lang.Object r2 = r2.get(r7)
            com.google.protos.an.d.a.af r2 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r2
            com.google.protos.an.d.g.b r2 = r2.f171464b
            if (r2 != 0) goto L_0x00b9
            com.google.protos.an.d.g.b r2 = com.google.protos.p4850an.p4855d.p4862g.C63565b.f171933j
        L_0x00b9:
            com.google.protobuf.cq r2 = r2.f171941g
            java.lang.Object r2 = r2.get(r7)
            com.google.bp.g.n r2 = (com.google.p4242bp.p4266g.C56364n) r2
            int r2 = r2.f150313b
            int r2 = com.google.p4242bp.p4266g.C56363m.m87979a(r2)
            if (r2 != 0) goto L_0x00ca
            goto L_0x008b
        L_0x00ca:
            if (r2 != r5) goto L_0x008b
            r2 = 7
        L_0x00cd:
            if (r2 != r8) goto L_0x04b2
            boolean r2 = r1.f38342e
            if (r2 != 0) goto L_0x04ad
            com.google.protobuf.cq r2 = r1.f38344g
            int r2 = r2.size()
            r9 = 8
            java.lang.String r10 = "provider"
            java.lang.String r11 = "contact_type"
            if (r2 <= 0) goto L_0x0422
            r0.f38372l = r7
            com.google.protobuf.cq r2 = r1.f38344g
            java.util.Iterator r2 = r2.iterator()
            r12 = 4
        L_0x00ea:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x041f
            java.lang.Object r13 = r2.next()
            com.google.protos.an.d.a.j r13 = (com.google.protos.p4850an.p4855d.p4856a.C63457j) r13
            int r14 = r13.f171492b
            int r14 = com.google.protos.p4850an.p4855d.p4856a.C63454g.m96239a(r14)
            if (r14 != 0) goto L_0x00ff
            r14 = 1
        L_0x00ff:
            r15 = -1
            int r14 = r14 + r15
            if (r14 == 0) goto L_0x039c
            java.lang.String r6 = "SMS"
            r7 = 3
            java.lang.String r3 = "client_entity_id"
            if (r14 == r7) goto L_0x01df
            if (r14 == r5) goto L_0x01dc
            if (r14 == r9) goto L_0x0110
            goto L_0x0414
        L_0x0110:
            int r7 = r13.f171494d
            int r7 = r7 + r15
            int r12 = r13.f171493c
            int r13 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r12)
            if (r13 != 0) goto L_0x011c
            goto L_0x0147
        L_0x011c:
            if (r13 != r4) goto L_0x0147
            com.google.protos.f.b.d.b r6 = r0.f38370j
            int r6 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27791p(r6, r3)
            if (r6 == r8) goto L_0x0144
            com.google.protos.f.b.d.b r6 = r0.f38370j
            com.google.protos.f.b.d.b r6 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27779d(r6, r3, r7)
            if (r6 != 0) goto L_0x0130
            goto L_0x0413
        L_0x0130:
            r0.f38370j = r6
            java.lang.String r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r6, r3)
            com.google.bb.a.fp r6 = r0.f38369i
            com.google.bb.a.fe r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27768a(r6, r3)
            if (r3 == 0) goto L_0x0413
            int r12 = r16.m27765i()
            goto L_0x0414
        L_0x0144:
            r12 = 4
            goto L_0x0414
        L_0x0147:
            int r3 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r12)
            if (r3 != 0) goto L_0x014e
            goto L_0x019f
        L_0x014e:
            if (r3 != r8) goto L_0x019f
            com.google.protos.f.b.d.b r3 = r0.f38370j
            int r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27791p(r3, r11)
            if (r3 == r8) goto L_0x0190
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27779d(r3, r11, r7)
            if (r3 != 0) goto L_0x0162
            goto L_0x0413
        L_0x0162:
            java.lang.String r6 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r3, r11)
            com.google.protos.an.d.a.ab r7 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protos.an.d.a.aa r7 = (com.google.protos.p4850an.p4855d.p4856a.C63441aa) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.an.d.a.ab r12 = (com.google.protos.p4850an.p4855d.p4856a.C63442ab) r12
            r6.getClass()
            int r13 = r12.f171456a
            r14 = 2
            r13 = r13 | r14
            r12.f171456a = r13
            r12.f171458c = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.protos.an.d.a.ab r6 = (com.google.protos.p4850an.p4855d.p4856a.C63442ab) r6
            r0.f38374n = r6
            r0.f38370j = r3
            int r12 = r16.m27764h()
            goto L_0x0414
        L_0x0190:
            com.google.protos.f.b.d.b r3 = r0.f38370j
            java.lang.String r6 = "contact_number"
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27779d(r3, r6, r7)
            if (r3 != 0) goto L_0x019c
            goto L_0x0413
        L_0x019c:
            r0.f38370j = r3
            goto L_0x0144
        L_0x019f:
            int r3 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r12)
            if (r3 != 0) goto L_0x01a6
            goto L_0x01cc
        L_0x01a6:
            if (r3 != r5) goto L_0x01cc
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27779d(r3, r10, r7)
            if (r3 != 0) goto L_0x01b2
            goto L_0x0413
        L_0x01b2:
            r0.f38370j = r3
            java.lang.String r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r3, r10)
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x01c6
            com.google.protos.f.b.d.b r6 = r0.f38370j
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r6, r11, r3)
            r0.f38370j = r3
        L_0x01c6:
            int r12 = r16.m27765i()
            goto L_0x0414
        L_0x01cc:
            com.google.common.f.a.d r3 = f38362c
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "#handleSetFromOrdinalDelta: Unknown delta type"
            r7 = 43828(0xab34, float:6.1416E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0413
        L_0x01dc:
            r12 = 3
            goto L_0x0414
        L_0x01df:
            int r7 = r13.f171493c
            int r12 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r7)
            if (r12 != 0) goto L_0x01e8
            goto L_0x0249
        L_0x01e8:
            if (r12 != r4) goto L_0x0249
            com.google.protobuf.cq r6 = r1.f38343f
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0239
            com.google.protos.f.b.d.b r6 = r0.f38370j
            com.google.protobuf.cq r7 = r1.f38343f
            r12 = 0
            java.lang.Object r7 = r7.get(r12)
            com.google.protos.an.d.a.af r7 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r7
            java.lang.String r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27770d(r7)
            com.google.android.apps.gsa.a.c.a r12 = r0.f38375o
            com.google.android.apps.gsa.search.core.carassistant.e.c r12 = r12.f32299a
            java.util.Locale r12 = r12.mo79344b()
            r13 = 1
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27777b(r6, r3, r7, r13, r12)
            if (r3 == 0) goto L_0x0413
            r0.f38372l = r13
            r0.f38370j = r3
            int r12 = r16.m27765i()
            if (r12 == r8) goto L_0x0414
            com.google.common.f.a.d r3 = f38362c
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "#handleSelectDeltaOnRecipient: wrong type information was provided!"
            r7 = 43822(0xab2e, float:6.1408E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r7)).mo56386p(r6)
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27790o(r3, r11, r13)
            r0.f38370j = r3
            int r12 = r16.m27765i()
            if (r12 != r8) goto L_0x0414
        L_0x0236:
            r12 = 1
            goto L_0x0414
        L_0x0239:
            com.google.common.f.a.d r3 = f38362c
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "#handleSelectDeltaOnRecipient: SELECT recipient Delta occurred without recipient information!"
            r7 = 43820(0xab2c, float:6.1405E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0413
        L_0x0249:
            int r3 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r7)
            if (r3 != 0) goto L_0x0251
            goto L_0x032c
        L_0x0251:
            if (r3 != r8) goto L_0x032c
            com.google.protos.an.d.a.ab r3 = r1.f38340c
            if (r3 != 0) goto L_0x0259
            com.google.protos.an.d.a.ab r3 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x0259:
            r0.f38374n = r3
            com.google.protos.f.b.d.b r3 = r0.f38370j
            boolean r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27787l(r3, r11)
            if (r3 == 0) goto L_0x02f5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = 0
        L_0x0269:
            java.util.List r7 = r0.f38363a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0294
            java.util.List r7 = r0.f38363a
            java.lang.Object r7 = r7.get(r6)
            com.google.bb.a.ft r7 = (com.google.p4152bb.p4153a.C55097ft) r7
            com.google.protos.an.d.a.ab r12 = r0.f38374n
            com.google.android.apps.gsa.a.c.a r13 = r0.f38375o
            com.google.android.apps.gsa.search.core.carassistant.e.c r13 = r13.f32299a
            java.util.Locale r13 = r13.mo79344b()
            r14 = 1
            boolean r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27772f(r7, r12, r14, r13)
            if (r7 == 0) goto L_0x0291
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r3.add(r7)
        L_0x0291:
            int r6 = r6 + 1
            goto L_0x0269
        L_0x0294:
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x02c6
            r6 = 0
        L_0x029b:
            java.util.List r7 = r0.f38363a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x02c6
            java.util.List r7 = r0.f38363a
            java.lang.Object r7 = r7.get(r6)
            com.google.bb.a.ft r7 = (com.google.p4152bb.p4153a.C55097ft) r7
            com.google.protos.an.d.a.ab r12 = r0.f38374n
            com.google.android.apps.gsa.a.c.a r13 = r0.f38375o
            com.google.android.apps.gsa.search.core.carassistant.e.c r13 = r13.f32299a
            java.util.Locale r13 = r13.mo79344b()
            r14 = 0
            boolean r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27772f(r7, r12, r14, r13)
            if (r7 == 0) goto L_0x02c3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r3.add(r7)
        L_0x02c3:
            int r6 = r6 + 1
            goto L_0x029b
        L_0x02c6:
            r3.size()
            int r6 = r3.size()
            r7 = 1
            if (r6 != r7) goto L_0x02db
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r15 = r3.intValue()
        L_0x02db:
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27779d(r3, r11, r15)
            if (r3 == 0) goto L_0x02eb
            r0.f38370j = r3
            int r12 = r16.m27764h()
            goto L_0x0414
        L_0x02eb:
            com.google.protos.an.d.a.ab r3 = r1.f38340c
            if (r3 != 0) goto L_0x02f1
            com.google.protos.an.d.a.ab r3 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x02f1:
            java.lang.String r3 = r3.f171458c
            goto L_0x0413
        L_0x02f5:
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.an.d.a.ab r6 = r1.f38340c
            if (r6 != 0) goto L_0x02fd
            com.google.protos.an.d.a.ab r6 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x02fd:
            java.lang.String r6 = r6.f171458c
            com.google.android.apps.gsa.a.c.a r7 = r0.f38375o
            com.google.android.apps.gsa.search.core.carassistant.e.c r7 = r7.f32299a
            java.util.Locale r7 = r7.mo79344b()
            r12 = 0
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27777b(r3, r11, r6, r12, r7)
            if (r3 == 0) goto L_0x0326
            com.google.protobuf.cq r6 = r1.f38343f
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0326
            r0.f38370j = r3
            com.google.protobuf.cq r3 = r1.f38343f
            java.lang.Object r3 = r3.get(r12)
            com.google.protos.an.d.a.af r3 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r3
            int r12 = r0.m27763g(r3)
            goto L_0x0414
        L_0x0326:
            boolean r3 = r0.f38372l
            if (r3 != 0) goto L_0x0236
            goto L_0x0413
        L_0x032c:
            int r3 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r7)
            if (r3 != 0) goto L_0x0333
            goto L_0x038c
        L_0x0333:
            if (r3 != r5) goto L_0x038c
            com.google.protos.f.b.d.b r3 = r0.f38370j
            boolean r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27787l(r3, r10)
            if (r3 == 0) goto L_0x037c
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.an.d.a.p r7 = r1.f38345h
            if (r7 != 0) goto L_0x0345
            com.google.protos.an.d.a.p r7 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
        L_0x0345:
            java.lang.String r7 = r7.f171510b
            com.google.android.apps.gsa.a.c.a r12 = r0.f38375o
            com.google.android.apps.gsa.search.core.carassistant.e.c r12 = r12.f32299a
            java.util.Locale r12 = r12.mo79344b()
            r13 = 0
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27777b(r3, r10, r7, r13, r12)
            if (r3 == 0) goto L_0x0413
            r0.f38370j = r3
            com.google.protos.an.d.a.p r3 = r1.f38345h
            if (r3 != 0) goto L_0x035e
            com.google.protos.an.d.a.p r3 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
        L_0x035e:
            java.lang.String r3 = r3.f171510b
            boolean r3 = com.google.common.base.C58890d.m90990e(r3, r6)
            if (r3 != 0) goto L_0x0376
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.an.d.a.p r6 = r1.f38345h
            if (r6 != 0) goto L_0x036e
            com.google.protos.an.d.a.p r6 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
        L_0x036e:
            java.lang.String r6 = r6.f171510b
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r3, r11, r6)
            r0.f38370j = r3
        L_0x0376:
            int r12 = r16.m27765i()
            goto L_0x0414
        L_0x037c:
            com.google.common.f.a.d r3 = f38362c
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "We don't support setting medium along with other deltas."
            r7 = 43811(0xab23, float:6.1392E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0144
        L_0x038c:
            com.google.common.f.a.d r3 = f38362c
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "#handleSelectDelta: Unexpected field type in delta"
            r7 = 43809(0xab21, float:6.139E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0413
        L_0x039c:
            int r3 = r13.f171493c
            int r3 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r3)
            if (r3 != 0) goto L_0x03a5
            goto L_0x03bd
        L_0x03a5:
            if (r3 != r4) goto L_0x03bd
            com.google.protobuf.cq r3 = r1.f38343f
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x03bd
            com.google.protobuf.cq r3 = r1.f38343f
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            com.google.protos.an.d.a.af r3 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r3
            int r12 = r0.m27763g(r3)
            goto L_0x0414
        L_0x03bd:
            int r3 = r13.f171493c
            int r3 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r3)
            if (r3 != 0) goto L_0x03c6
            goto L_0x0405
        L_0x03c6:
            if (r3 != r8) goto L_0x0405
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.an.d.a.ab r6 = r1.f38340c
            if (r6 != 0) goto L_0x03d0
            com.google.protos.an.d.a.ab r6 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x03d0:
            java.lang.String r6 = r6.f171458c
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r3, r11, r6)
            r0.f38370j = r3
            com.google.protos.an.d.a.ab r3 = r1.f38340c
            if (r3 != 0) goto L_0x03de
            com.google.protos.an.d.a.ab r3 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x03de:
            r0.f38374n = r3
            com.google.protobuf.cq r3 = r1.f38343f
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x03f6
            com.google.protobuf.cq r3 = r1.f38343f
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            com.google.protos.an.d.a.af r3 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r3
            int r12 = r0.m27763g(r3)
            goto L_0x0414
        L_0x03f6:
            com.google.common.f.a.d r3 = f38362c
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "Trying to set phone type without recipient which shouldn't happen."
            r7 = 43826(0xab32, float:6.1413E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0413
        L_0x0405:
            com.google.common.f.a.d r3 = f38362c
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "#handleSetDelta: Unexpected field type in delta"
            r7 = 43824(0xab30, float:6.141E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r7)).mo56386p(r6)
        L_0x0413:
            r12 = 2
        L_0x0414:
            if (r12 == r8) goto L_0x041a
            r3 = 1
            if (r12 == r3) goto L_0x041a
            goto L_0x041f
        L_0x041a:
            r3 = 2
            r6 = 1
            r7 = 0
            goto L_0x00ea
        L_0x041f:
            r8 = r12
            goto L_0x04a8
        L_0x0422:
            r2 = 0
            r0.f38368h = r2
            int r2 = r1.f38338a
            r3 = 2
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0443
            com.google.protos.an.d.a.ab r2 = r1.f38340c
            if (r2 != 0) goto L_0x0431
            com.google.protos.an.d.a.ab r2 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x0431:
            r0.f38374n = r2
            com.google.protos.f.b.d.b r2 = r0.f38370j
            com.google.protos.an.d.a.ab r3 = r1.f38340c
            if (r3 != 0) goto L_0x043b
            com.google.protos.an.d.a.ab r3 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x043b:
            java.lang.String r3 = r3.f171458c
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r2, r11, r3)
            r0.f38370j = r2
        L_0x0443:
            int r2 = r1.f38338a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x0486
            com.google.protos.an.d.a.p r2 = r1.f38345h
            if (r2 != 0) goto L_0x044f
            com.google.protos.an.d.a.p r2 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
        L_0x044f:
            java.lang.String r3 = r2.f171510b
            java.lang.String r4 = "hangout"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0474
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.protos.an.d.a.o r2 = (com.google.protos.p4850an.p4855d.p4856a.C63462o) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.protos.an.d.a.p r3 = (com.google.protos.p4850an.p4855d.p4856a.C63463p) r3
            int r5 = r3.f171509a
            r6 = 1
            r5 = r5 | r6
            r3.f171509a = r5
            r3.f171510b = r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.protos.an.d.a.p r2 = (com.google.protos.p4850an.p4855d.p4856a.C63463p) r2
        L_0x0474:
            com.google.protos.f.b.d.b r3 = r0.f38370j
            java.lang.String r4 = r2.f171510b
            com.google.protos.f.b.d.b r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r3, r10, r4)
            r0.f38370j = r3
            java.lang.String r2 = r2.f171510b
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r3, r11, r2)
            r0.f38370j = r2
        L_0x0486:
            com.google.protobuf.cq r2 = r1.f38343f
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x04a8
            com.google.protobuf.cq r2 = r1.f38343f
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.protos.an.d.a.af r2 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r2
            int r2 = r2.f171463a
            r2 = r2 & r9
            if (r2 == 0) goto L_0x04a8
            com.google.protobuf.cq r2 = r1.f38343f
            java.lang.Object r2 = r2.get(r3)
            com.google.protos.an.d.a.af r2 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r2
            int r8 = r0.m27763g(r2)
        L_0x04a8:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27766j(r8, r1)
            return r1
        L_0x04ad:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27766j(r5, r1)
            return r1
        L_0x04b2:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27766j(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.utils.C11942e.mo20315a(com.google.android.libraries.assistant.auto.ondevice.utils.a.b):com.google.android.libraries.assistant.auto.ondevice.utils.a.b");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b m27766j(int r19, com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int r3 = r1 + -1
            r4 = 0
            r5 = 2
            if (r3 == r5) goto L_0x0a15
            r6 = 6
            java.lang.String r7 = "SendMessage.CONTACT_CHAT"
            java.lang.String r8 = "SendMessage.CONTACT"
            r9 = 5
            java.lang.String r10 = "call.CONTACT"
            r11 = 3
            r12 = 0
            r13 = 1
            if (r3 == r11) goto L_0x012b
            if (r3 == r9) goto L_0x00f5
            if (r3 == r6) goto L_0x00bf
            r14 = 7
            if (r3 == r14) goto L_0x0073
            if (r1 == r13) goto L_0x0026
            com.google.protos.f.b.d.b r1 = r0.f38371k
            r0.f38370j = r1
        L_0x0026:
            int r1 = r0.f38368h
            int r1 = r1 + r13
            r0.f38368h = r1
            if (r1 <= r5) goto L_0x012d
            com.google.protos.f.b.d.b r1 = r0.f38370j
            com.google.protos.f.b.d.d r1 = r1.f175582b
            if (r1 != 0) goto L_0x0035
            com.google.protos.f.b.d.d r1 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x0035:
            java.lang.String r1 = r1.f175587b
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x005e
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f38366f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250297aV
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x005e
            com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil r1 = r0.f38365e
            java.lang.String r2 = "named_contact__BAIL_OUT"
            com.google.nlp.a.s r2 = com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil.m27744b(r2, r4)
            com.google.assistant.e.j.dy r1 = r1.mo20309a(r2)
            if (r1 == 0) goto L_0x005e
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27758b(r1)
            goto L_0x0072
        L_0x005e:
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27753f(r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r1)
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27758b(r1)
        L_0x0072:
            return r1
        L_0x0073:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.protobuf.cq r3 = r2.f38343f
            int r3 = r3.size()
            if (r3 != 0) goto L_0x008f
            com.google.common.f.a.d r2 = f38362c
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "#createDisambiguationResultForNoAccount: Something went wrong. No recipient in the input"
            r4 = 43859(0xab53, float:6.146E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            goto L_0x00ba
        L_0x008f:
            com.google.assistant.e.j.dy[] r1 = new com.google.assistant.p3897e.p3921j.C51809dy[r13]
            com.google.android.apps.gsa.a.c.a r3 = r0.f38375o
            android.content.Context r4 = r3.f32300b
            android.content.res.Resources r3 = r3.mo17491a(r4)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            com.google.protobuf.cq r2 = r2.f38343f
            java.lang.Object r2 = r2.get(r12)
            com.google.protos.an.d.a.af r2 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r2
            java.lang.String r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27770d(r2)
            r4[r12] = r2
            r2 = 2132090094(0x7f151cee, float:1.9820518E38)
            java.lang.String r2 = r3.getString(r2, r4)
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r2)
            r1[r12] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
        L_0x00ba:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27758b(r1)
            return r1
        L_0x00bf:
            com.google.protos.f.b.d.b r1 = r0.f38370j
            com.google.protos.f.b.d.d r1 = r1.f175582b
            if (r1 != 0) goto L_0x00c7
            com.google.protos.f.b.d.d r1 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x00c7:
            java.lang.String r1 = r1.f175587b
            boolean r2 = r1.equals(r8)
            r3 = 2132089380(0x7f151a24, float:1.981907E38)
            if (r2 != 0) goto L_0x00dc
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00d9
            goto L_0x00dc
        L_0x00d9:
            r3 = 2132085554(0x7f150b32, float:1.981131E38)
        L_0x00dc:
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            java.lang.String r1 = r1.getString(r3)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27758b(r1)
            return r1
        L_0x00f5:
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r3 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r3)
            com.google.protobuf.cq r3 = r2.f38343f
            java.lang.Object r3 = r3.get(r12)
            com.google.protos.an.d.a.af r3 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r3
            java.lang.String r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27770d(r3)
            com.google.protos.an.d.a.ab r2 = r2.f38340c
            if (r2 != 0) goto L_0x010f
            com.google.protos.an.d.a.ab r2 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x010f:
            java.lang.String r2 = r2.f171458c
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r12] = r2
            r4[r13] = r3
            r2 = 2132090115(0x7f151d03, float:1.982056E38)
            java.lang.String r1 = r1.getString(r2, r4)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27758b(r1)
            return r1
        L_0x012b:
            r0.f38368h = r12
        L_0x012d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.protos.f.b.d.b r2 = r0.f38370j
            com.google.protos.f.b.d.d r2 = r2.f175582b
            if (r2 != 0) goto L_0x013a
            com.google.protos.f.b.d.d r2 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x013a:
            java.lang.String r2 = r2.f175587b
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x014b
            com.google.protos.f.b.d.b r2 = r0.f38370j
            com.google.common.b.gu r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38353a
            java.lang.String r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27784i(r2, r3)
            goto L_0x0153
        L_0x014b:
            com.google.protos.f.b.d.b r2 = r0.f38370j
            com.google.common.b.gu r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38354b
            java.lang.String r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27784i(r2, r3)
        L_0x0153:
            if (r2 != 0) goto L_0x0157
            goto L_0x09d4
        L_0x0157:
            int r3 = r2.hashCode()
            java.lang.String r4 = "contact_number"
            java.lang.String r14 = "provider"
            java.lang.String r15 = "contact_type"
            java.lang.String r6 = "client_entity_id"
            r16 = -1
            switch(r3) {
                case -987494927: goto L_0x0181;
                case -442052536: goto L_0x0179;
                case 582339459: goto L_0x0171;
                case 1277933561: goto L_0x0169;
                default: goto L_0x0168;
            }
        L_0x0168:
            goto L_0x0189
        L_0x0169:
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x0189
            r2 = 2
            goto L_0x018a
        L_0x0171:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0189
            r2 = 0
            goto L_0x018a
        L_0x0179:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0189
            r2 = 3
            goto L_0x018a
        L_0x0181:
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x0189
            r2 = 1
            goto L_0x018a
        L_0x0189:
            r2 = -1
        L_0x018a:
            java.lang.String r3 = ", "
            r9 = 4
            java.lang.String r17 = ""
            if (r2 == 0) goto L_0x0767
            if (r2 == r13) goto L_0x05c4
            if (r2 == r5) goto L_0x0387
            if (r2 == r11) goto L_0x01a7
            com.google.common.f.a.d r2 = f38362c
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "getNextPrompt: Unexpected field name"
            r4 = 43881(0xab69, float:6.149E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            goto L_0x09d4
        L_0x01a7:
            com.google.protos.f.b.d.b r1 = r0.f38370j
            com.google.protos.f.b.d.b r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27792q(r1, r4)
            r0.f38370j = r1
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27785j(r1, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = r17
            r3 = 0
        L_0x01bb:
            int r6 = r1.size()
            if (r3 >= r6) goto L_0x022c
            boolean r6 = r18.m27761e()
            if (r6 == 0) goto L_0x01e2
            java.lang.Object r6 = r1.get(r3)
            com.google.protos.f.b.d.k r6 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r6
            com.google.protos.f.b.d.h r6 = r6.f175601b
            if (r6 != 0) goto L_0x01d3
            com.google.protos.f.b.d.h r6 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x01d3:
            int r7 = r6.f175596a
            if (r7 != r9) goto L_0x01dc
            java.lang.Object r6 = r6.f175597b
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x01de
        L_0x01dc:
            r6 = r17
        L_0x01de:
            r2.add(r6)
            goto L_0x0229
        L_0x01e2:
            java.lang.Object r6 = r1.get(r3)
            com.google.protos.f.b.d.k r6 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r6
            com.google.protobuf.cq r6 = r6.f175602c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x021b
            java.lang.Object r6 = r1.get(r3)
            com.google.protos.f.b.d.k r6 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r6
            com.google.protobuf.cq r6 = r6.f175602c
            java.lang.Object r6 = r6.get(r12)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r5]
            int r14 = r3 + 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r8[r12] = r14
            r8[r13] = r6
            java.lang.String r6 = "number %d %s "
            java.lang.String r6 = java.lang.String.format(r7, r6, r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r4 = r4.concat(r6)
            goto L_0x0229
        L_0x021b:
            com.google.common.f.a.d r6 = f38362c
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r7 = "value terms are not set in sending chat message flow"
            r8 = 43873(0xab61, float:6.1479E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r8)).mo56386p(r7)
        L_0x0229:
            int r3 = r3 + 1
            goto L_0x01bb
        L_0x022c:
            boolean r1 = r18.m27761e()
            if (r1 == 0) goto L_0x036a
            com.google.protos.f.b.d.b r1 = r0.f38370j
            java.lang.String r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r1, r15)
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.f.b.d.d r3 = r3.f175582b
            if (r3 != 0) goto L_0x0240
            com.google.protos.f.b.d.d r3 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x0240:
            java.lang.String r3 = r3.f175587b
            int r4 = r0.f38368h
            if (r4 != r13) goto L_0x0257
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            r2 = 2132085737(0x7f150be9, float:1.9811681E38)
            java.lang.String r17 = r1.getString(r2)
            goto L_0x0364
        L_0x0257:
            if (r4 == 0) goto L_0x026c
            if (r4 != r5) goto L_0x025c
            goto L_0x026c
        L_0x025c:
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "#createTtsStrForNumberSelection: #reprompt >=3. The dialogue should bailout"
            r3 = 43871(0xab5f, float:6.1476E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0364
        L_0x026c:
            int r4 = r2.size()
            if (r4 != r5) goto L_0x029d
            boolean r3 = r3.equals(r10)
            if (r13 == r3) goto L_0x027c
            r3 = 2132093118(0x7f1528be, float:1.9826652E38)
            goto L_0x027f
        L_0x027c:
            r3 = 2132093117(0x7f1528bd, float:1.982665E38)
        L_0x027f:
            com.google.android.apps.gsa.a.c.a r4 = r0.f38375o
            android.content.Context r6 = r4.f32300b
            android.content.res.Resources r4 = r4.mo17491a(r6)
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r6[r12] = r1
            java.lang.Object r1 = r2.get(r12)
            r6[r13] = r1
            java.lang.Object r1 = r2.get(r13)
            r6[r5] = r1
            java.lang.String r17 = r4.getString(r3, r6)
            goto L_0x0364
        L_0x029d:
            int r4 = r2.size()
            if (r4 != r11) goto L_0x02d4
            boolean r3 = r3.equals(r10)
            if (r13 == r3) goto L_0x02ad
            r3 = 2132092957(0x7f15281d, float:1.9826325E38)
            goto L_0x02b0
        L_0x02ad:
            r3 = 2132092956(0x7f15281c, float:1.9826323E38)
        L_0x02b0:
            com.google.android.apps.gsa.a.c.a r4 = r0.f38375o
            android.content.Context r6 = r4.f32300b
            android.content.res.Resources r4 = r4.mo17491a(r6)
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r12] = r1
            java.lang.Object r1 = r2.get(r12)
            r6[r13] = r1
            java.lang.Object r1 = r2.get(r13)
            r6[r5] = r1
            java.lang.Object r1 = r2.get(r5)
            r6[r11] = r1
            java.lang.String r17 = r4.getString(r3, r6)
            goto L_0x0364
        L_0x02d4:
            int r4 = r2.size()
            if (r4 != r9) goto L_0x0311
            boolean r3 = r3.equals(r10)
            if (r13 == r3) goto L_0x02e4
            r3 = 2132086931(0x7f151093, float:1.9814103E38)
            goto L_0x02e7
        L_0x02e4:
            r3 = 2132086930(0x7f151092, float:1.98141E38)
        L_0x02e7:
            com.google.android.apps.gsa.a.c.a r4 = r0.f38375o
            android.content.Context r6 = r4.f32300b
            android.content.res.Resources r4 = r4.mo17491a(r6)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r12] = r1
            java.lang.Object r1 = r2.get(r12)
            r6[r13] = r1
            java.lang.Object r1 = r2.get(r13)
            r6[r5] = r1
            java.lang.Object r1 = r2.get(r5)
            r6[r11] = r1
            java.lang.Object r1 = r2.get(r11)
            r6[r9] = r1
            java.lang.String r17 = r4.getString(r3, r6)
            goto L_0x0364
        L_0x0311:
            int r4 = r2.size()
            r6 = 5
            if (r4 < r6) goto L_0x0356
            boolean r3 = r3.equals(r10)
            if (r13 == r3) goto L_0x0322
            r3 = 2132086832(0x7f151030, float:1.9813902E38)
            goto L_0x0325
        L_0x0322:
            r3 = 2132086831(0x7f15102f, float:1.98139E38)
        L_0x0325:
            com.google.android.apps.gsa.a.c.a r4 = r0.f38375o
            android.content.Context r6 = r4.f32300b
            android.content.res.Resources r4 = r4.mo17491a(r6)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r12] = r1
            java.lang.Object r1 = r2.get(r12)
            r6[r13] = r1
            java.lang.Object r1 = r2.get(r13)
            r6[r5] = r1
            java.lang.Object r1 = r2.get(r5)
            r6[r11] = r1
            java.lang.Object r1 = r2.get(r11)
            r6[r9] = r1
            java.lang.Object r1 = r2.get(r9)
            r2 = 5
            r6[r2] = r1
            java.lang.String r17 = r4.getString(r3, r6)
            goto L_0x0364
        L_0x0356:
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "#createTtsStrForNumberSelection: only one phone number. No need for disambiguation"
            r3 = 43870(0xab5e, float:6.1475E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x0364:
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27754g(r17)
            goto L_0x09d4
        L_0x036a:
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r3 = r4.trim()
            r2[r12] = r3
            r3 = 2132090227(0x7f151d73, float:1.9820788E38)
            java.lang.String r1 = r1.getString(r3, r2)
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27754g(r1)
            goto L_0x09d4
        L_0x0387:
            com.google.protos.f.b.d.b r1 = r0.f38370j
            com.google.protos.f.b.d.b r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27792q(r1, r15)
            r0.f38370j = r1
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27785j(r1, r15)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x039c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03bd
            java.lang.Object r4 = r1.next()
            com.google.protos.f.b.d.k r4 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r4
            com.google.protos.f.b.d.h r4 = r4.f175601b
            if (r4 != 0) goto L_0x03ae
            com.google.protos.f.b.d.h r4 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x03ae:
            int r6 = r4.f175596a
            if (r6 != r9) goto L_0x03b7
            java.lang.Object r4 = r4.f175597b
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x03b9
        L_0x03b7:
            r4 = r17
        L_0x03b9:
            r2.add(r4)
            goto L_0x039c
        L_0x03bd:
            com.google.android.apps.gsa.g.c.b r1 = r0.f38364d
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89842j(r2)
            r1.d = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f38366f
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250297aV
            boolean r4 = r4.mo79746e(r6)
            if (r4 != 0) goto L_0x03d5
            goto L_0x0419
        L_0x03d5:
            com.google.bb.a.fp r4 = r0.f38369i
            com.google.protos.f.b.d.b r6 = r0.f38370j
            java.lang.String r4 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27771e(r4, r6)
            if (r4 != 0) goto L_0x03ee
            com.google.common.f.a.d r4 = f38362c
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r6 = "#createContactTypeSelectionClientOpsFromGenX: displayName is null."
            r9 = 43877(0xab65, float:6.1485E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r4).mo56372aa(r9)).mo56386p(r6)
            goto L_0x0419
        L_0x03ee:
            com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil r6 = r0.f38365e
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89842j(r2)
            int r14 = r0.f38368h
            com.google.nlp.a.s r4 = r6.mo20310c(r4, r9, r14)
            com.google.assistant.e.j.dy r4 = r6.mo20309a(r4)
            if (r4 == 0) goto L_0x040b
            r1.add(r4)
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27751d()
            r1.add(r4)
            goto L_0x0419
        L_0x040b:
            com.google.common.f.a.d r4 = f38362c
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r6 = "#createContactTypeSelectionClientOpsFromGenX: GenX realization failed"
            r9 = 43876(0xab64, float:6.1483E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r4).mo56372aa(r9)).mo56386p(r6)
        L_0x0419:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x09d4
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r4 = "createContactTypeSelectionClientOps: Fallback to short term solution"
            r6 = 43875(0xab63, float:6.1482E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r6)).mo56386p(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r2.iterator()
            r9 = 0
        L_0x043c:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x045c
            java.lang.Object r14 = r6.next()
            java.lang.String r14 = (java.lang.String) r14
            r1.append(r14)
            r4.add(r14)
            int r14 = r2.size()
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x0459
            r1.append(r3)
        L_0x0459:
            int r9 = r9 + 1
            goto L_0x043c
        L_0x045c:
            java.lang.String r1 = r1.toString()
            com.google.common.p4522b.C58485gu.m89845m()
            int r2 = r0.f38368h
            r3 = 2132085728(0x7f150be0, float:1.9811663E38)
            r6 = 2132085727(0x7f150bdf, float:1.981166E38)
            if (r2 != 0) goto L_0x0488
            r2 = 2132085735(0x7f150be7, float:1.9811677E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9 = 2132085731(0x7f150be3, float:1.981167E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89849q(r2, r9, r6, r3)
            goto L_0x04bd
        L_0x0488:
            if (r2 != r13) goto L_0x04a1
            com.google.android.libraries.assistant.auto.ondevice.utils.c r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11940c.f38359a
            j$.util.stream.Stream r2 = p3186j$.util.stream.Stream.CC.generate(r2)
            r14 = 4
            j$.util.stream.Stream r2 = r2.limit(r14)
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r2 = r2.collect(r3)
            java.util.List r2 = (java.util.List) r2
            goto L_0x04bd
        L_0x04a1:
            if (r2 != r5) goto L_0x05b0
            r2 = 2132085736(0x7f150be8, float:1.981168E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9 = 2132085732(0x7f150be4, float:1.9811671E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89849q(r2, r9, r6, r3)
        L_0x04bd:
            com.google.bb.a.fp r3 = r0.f38369i
            com.google.protos.f.b.d.b r6 = r0.f38370j
            java.lang.String r3 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27771e(r3, r6)
            if (r3 != 0) goto L_0x04d7
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "#createTtsForTypeDisambiguation: display name is null"
            r3 = 43869(0xab5d, float:6.1474E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x05be
        L_0x04d7:
            int r6 = r4.size()
            if (r6 != r5) goto L_0x0503
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r3 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r3)
            java.lang.Object r2 = r2.get(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Object r5 = r4.get(r12)
            r3[r12] = r5
            java.lang.Object r4 = r4.get(r13)
            r3[r13] = r4
            java.lang.String r17 = r1.getString(r2, r3)
            goto L_0x05be
        L_0x0503:
            int r6 = r4.size()
            if (r6 != r11) goto L_0x0535
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r3 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r3)
            java.lang.Object r2 = r2.get(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Object r6 = r4.get(r12)
            r3[r12] = r6
            java.lang.Object r6 = r4.get(r13)
            r3[r13] = r6
            java.lang.Object r4 = r4.get(r5)
            r3[r5] = r4
            java.lang.String r17 = r1.getString(r2, r3)
            goto L_0x05be
        L_0x0535:
            int r4 = r4.size()
            if (r4 <= r11) goto L_0x05a1
            com.google.protos.f.b.d.b r4 = r0.f38370j
            com.google.protos.f.b.d.d r4 = r4.f175582b
            if (r4 != 0) goto L_0x0543
            com.google.protos.f.b.d.d r4 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x0543:
            java.lang.String r4 = r4.f175587b
            boolean r6 = r4.equals(r10)
            if (r6 == 0) goto L_0x0568
            com.google.android.apps.gsa.a.c.a r4 = r0.f38375o
            android.content.Context r6 = r4.f32300b
            android.content.res.Resources r4 = r4.mo17491a(r6)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r12] = r3
            r5[r13] = r1
            java.lang.String r17 = r4.getString(r2, r5)
            goto L_0x05be
        L_0x0568:
            boolean r6 = r4.equals(r8)
            if (r6 != 0) goto L_0x0584
            boolean r6 = r4.equals(r7)
            if (r6 == 0) goto L_0x0575
            goto L_0x0584
        L_0x0575:
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "#createTtsForTypeDisambiguation: Unknown intent: %s"
            r3 = 43867(0xab5b, float:6.1471E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56389s(r2, r4)
            goto L_0x05be
        L_0x0584:
            com.google.android.apps.gsa.a.c.a r4 = r0.f38375o
            android.content.Context r6 = r4.f32300b
            android.content.res.Resources r4 = r4.mo17491a(r6)
            java.lang.Object r2 = r2.get(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r12] = r3
            r5[r13] = r1
            java.lang.String r17 = r4.getString(r2, r5)
            goto L_0x05be
        L_0x05a1:
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "#createTtsBasedOnNumberOfPhoneTypesAndIntent: doing type disambiguation when phone type size is 1."
            r3 = 43866(0xab5a, float:6.147E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x05be
        L_0x05b0:
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "#createTtsForTypeDisambiguation: #reprompt >=3. Shouldn't be here (the dialogue should have bailed out.)"
            r3 = 43868(0xab5c, float:6.1472E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x05be:
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27754g(r17)
            goto L_0x09d4
        L_0x05c4:
            com.google.protos.f.b.d.b r1 = r0.f38370j
            com.google.protos.f.b.d.b r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27792q(r1, r14)
            r0.f38370j = r1
            com.google.bb.a.fp r2 = r0.f38369i
            java.lang.String r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27771e(r2, r1)
            if (r1 != 0) goto L_0x05db
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x09d4
        L_0x05db:
            com.google.protos.f.b.d.b r2 = r0.f38370j
            java.util.List r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27785j(r2, r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r2.size()
            if (r6 > r13) goto L_0x05fc
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "#createProviderSelectionClientOps: Something went wrong. There should be more than one candidates"
            r3 = 43878(0xab66, float:6.1486E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x075d
        L_0x05fc:
            if (r6 != r5) goto L_0x0649
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r3 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r3)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Object r5 = r2.get(r12)
            com.google.protos.f.b.d.k r5 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r5
            com.google.protos.f.b.d.h r5 = r5.f175601b
            if (r5 != 0) goto L_0x0614
            com.google.protos.f.b.d.h r5 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x0614:
            int r6 = r5.f175596a
            if (r6 != r9) goto L_0x061d
            java.lang.Object r5 = r5.f175597b
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x061f
        L_0x061d:
            r5 = r17
        L_0x061f:
            r3[r12] = r5
            java.lang.Object r2 = r2.get(r13)
            com.google.protos.f.b.d.k r2 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r2
            com.google.protos.f.b.d.h r2 = r2.f175601b
            if (r2 != 0) goto L_0x062d
            com.google.protos.f.b.d.h r2 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x062d:
            int r5 = r2.f175596a
            if (r5 != r9) goto L_0x0637
            java.lang.Object r2 = r2.f175597b
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
        L_0x0637:
            r3[r13] = r17
            r2 = 2132085713(0x7f150bd1, float:1.9811633E38)
            java.lang.String r1 = r1.getString(r2, r3)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            r4.add(r1)
            goto L_0x075d
        L_0x0649:
            if (r6 != r11) goto L_0x06af
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r3 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r3)
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Object r6 = r2.get(r12)
            com.google.protos.f.b.d.k r6 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r6
            com.google.protos.f.b.d.h r6 = r6.f175601b
            if (r6 != 0) goto L_0x0661
            com.google.protos.f.b.d.h r6 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x0661:
            int r7 = r6.f175596a
            if (r7 != r9) goto L_0x066a
            java.lang.Object r6 = r6.f175597b
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x066c
        L_0x066a:
            r6 = r17
        L_0x066c:
            r3[r12] = r6
            java.lang.Object r6 = r2.get(r13)
            com.google.protos.f.b.d.k r6 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r6
            com.google.protos.f.b.d.h r6 = r6.f175601b
            if (r6 != 0) goto L_0x067a
            com.google.protos.f.b.d.h r6 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x067a:
            int r7 = r6.f175596a
            if (r7 != r9) goto L_0x0683
            java.lang.Object r6 = r6.f175597b
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0685
        L_0x0683:
            r6 = r17
        L_0x0685:
            r3[r13] = r6
            java.lang.Object r2 = r2.get(r5)
            com.google.protos.f.b.d.k r2 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r2
            com.google.protos.f.b.d.h r2 = r2.f175601b
            if (r2 != 0) goto L_0x0693
            com.google.protos.f.b.d.h r2 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x0693:
            int r6 = r2.f175596a
            if (r6 != r9) goto L_0x069d
            java.lang.Object r2 = r2.f175597b
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
        L_0x069d:
            r3[r5] = r17
            r2 = 2132085714(0x7f150bd2, float:1.9811635E38)
            java.lang.String r1 = r1.getString(r2, r3)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            r4.add(r1)
            goto L_0x075d
        L_0x06af:
            if (r6 != r9) goto L_0x072d
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r3 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r3)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Object r6 = r2.get(r12)
            com.google.protos.f.b.d.k r6 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r6
            com.google.protos.f.b.d.h r6 = r6.f175601b
            if (r6 != 0) goto L_0x06c7
            com.google.protos.f.b.d.h r6 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x06c7:
            int r7 = r6.f175596a
            if (r7 != r9) goto L_0x06d0
            java.lang.Object r6 = r6.f175597b
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x06d2
        L_0x06d0:
            r6 = r17
        L_0x06d2:
            r3[r12] = r6
            java.lang.Object r6 = r2.get(r13)
            com.google.protos.f.b.d.k r6 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r6
            com.google.protos.f.b.d.h r6 = r6.f175601b
            if (r6 != 0) goto L_0x06e0
            com.google.protos.f.b.d.h r6 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x06e0:
            int r7 = r6.f175596a
            if (r7 != r9) goto L_0x06e9
            java.lang.Object r6 = r6.f175597b
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x06eb
        L_0x06e9:
            r6 = r17
        L_0x06eb:
            r3[r13] = r6
            java.lang.Object r6 = r2.get(r5)
            com.google.protos.f.b.d.k r6 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r6
            com.google.protos.f.b.d.h r6 = r6.f175601b
            if (r6 != 0) goto L_0x06f9
            com.google.protos.f.b.d.h r6 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x06f9:
            int r7 = r6.f175596a
            if (r7 != r9) goto L_0x0702
            java.lang.Object r6 = r6.f175597b
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0704
        L_0x0702:
            r6 = r17
        L_0x0704:
            r3[r5] = r6
            java.lang.Object r2 = r2.get(r11)
            com.google.protos.f.b.d.k r2 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r2
            com.google.protos.f.b.d.h r2 = r2.f175601b
            if (r2 != 0) goto L_0x0712
            com.google.protos.f.b.d.h r2 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x0712:
            int r5 = r2.f175596a
            if (r5 != r9) goto L_0x071c
            java.lang.Object r2 = r2.f175597b
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
        L_0x071c:
            r3[r11] = r17
            r2 = 2132085715(0x7f150bd3, float:1.9811637E38)
            java.lang.String r1 = r1.getString(r2, r3)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            r4.add(r1)
            goto L_0x075d
        L_0x072d:
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.libraries.assistant.auto.ondevice.utils.d r6 = com.google.android.libraries.assistant.auto.ondevice.utils.C11941d.f38360a
            j$.util.stream.Stream r2 = r2.map(r6)
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.joining(r3)
            java.lang.Object r2 = r2.collect(r3)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.apps.gsa.a.c.a r3 = r0.f38375o
            android.content.Context r6 = r3.f32300b
            android.content.res.Resources r3 = r3.mo17491a(r6)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r12] = r1
            r5[r13] = r2
            r1 = 2132085716(0x7f150bd4, float:1.9811639E38)
            java.lang.String r1 = r3.getString(r1, r5)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            r4.add(r1)
        L_0x075d:
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27751d()
            r4.add(r1)
            r1 = r4
            goto L_0x09d4
        L_0x0767:
            com.google.protos.f.b.d.b r1 = r0.f38370j
            boolean r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27786k(r1, r6)
            if (r1 == 0) goto L_0x08c0
            com.google.protos.f.b.d.b r1 = r0.f38370j
            com.google.protos.f.b.d.b r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27792q(r1, r6)
            r0.f38370j = r1
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27785j(r1, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
        L_0x0786:
            int r14 = r1.size()
            if (r6 >= r14) goto L_0x07c2
            com.google.bb.a.fp r14 = r0.f38369i
            java.lang.Object r15 = r1.get(r6)
            com.google.protos.f.b.d.k r15 = (com.google.protos.p4985f.p4988b.p4993d.C64791k) r15
            com.google.protos.f.b.d.h r15 = r15.f175601b
            if (r15 != 0) goto L_0x079a
            com.google.protos.f.b.d.h r15 = com.google.protos.p4985f.p4988b.p4993d.C64788h.f175594c
        L_0x079a:
            int r12 = r15.f175596a
            if (r12 != r9) goto L_0x07a3
            java.lang.Object r12 = r15.f175597b
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x07a5
        L_0x07a3:
            r12 = r17
        L_0x07a5:
            com.google.bb.a.fe r12 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27768a(r14, r12)
            if (r12 == 0) goto L_0x07be
            java.lang.String r12 = r12.f144915b
            r2.append(r12)
            r4.add(r12)
            int r12 = r1.size()
            int r12 = r12 + -1
            if (r6 >= r12) goto L_0x07be
            r2.append(r3)
        L_0x07be:
            int r6 = r6 + 1
            r12 = 0
            goto L_0x0786
        L_0x07c2:
            com.google.android.apps.gsa.g.c.b r1 = r0.f38364d
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89842j(r4)
            r1.d = r3
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.protos.f.b.d.b r3 = r0.f38370j
            com.google.protos.f.b.d.d r3 = r3.f175582b
            if (r3 != 0) goto L_0x07d6
            com.google.protos.f.b.d.d r3 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x07d6:
            java.lang.String r3 = r3.f175587b
            boolean r6 = r3.equals(r10)
            if (r6 == 0) goto L_0x07f8
            r1 = 2132085733(0x7f150be5, float:1.9811673E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2132085729(0x7f150be1, float:1.9811665E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2132085726(0x7f150bde, float:1.9811659E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89848p(r1, r3, r6)
            goto L_0x081d
        L_0x07f8:
            boolean r6 = r3.equals(r8)
            if (r6 != 0) goto L_0x0804
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x081d
        L_0x0804:
            r1 = 2132085734(0x7f150be6, float:1.9811675E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2132085730(0x7f150be2, float:1.9811667E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2132085725(0x7f150bdd, float:1.9811657E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89848p(r1, r3, r6)
        L_0x081d:
            int r3 = r4.size()
            r6 = r1
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6
            int r6 = r6.f156474d
            if (r6 != r11) goto L_0x08ba
            int r6 = r0.f38368h
            if (r6 != r13) goto L_0x083d
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            r2 = 2132085738(0x7f150bea, float:1.9811683E38)
            java.lang.String r17 = r1.getString(r2)
            goto L_0x08b4
        L_0x083d:
            if (r3 != r5) goto L_0x0865
            com.google.android.apps.gsa.a.c.a r2 = r0.f38375o
            android.content.Context r3 = r2.f32300b
            android.content.res.Resources r2 = r2.mo17491a(r3)
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object r6 = r4.get(r3)
            r5[r3] = r6
            java.lang.Object r3 = r4.get(r13)
            r5[r13] = r3
            java.lang.String r17 = r2.getString(r1, r5)
            goto L_0x08b4
        L_0x0865:
            if (r3 != r11) goto L_0x0893
            com.google.android.apps.gsa.a.c.a r2 = r0.f38375o
            android.content.Context r3 = r2.f32300b
            android.content.res.Resources r2 = r2.mo17491a(r3)
            java.lang.Object r1 = r1.get(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r6 = 0
            java.lang.Object r7 = r4.get(r6)
            r3[r6] = r7
            java.lang.Object r6 = r4.get(r13)
            r3[r13] = r6
            java.lang.Object r4 = r4.get(r5)
            r3[r5] = r4
            java.lang.String r17 = r2.getString(r1, r3)
            goto L_0x08b4
        L_0x0893:
            if (r3 <= r11) goto L_0x08b4
            com.google.android.apps.gsa.a.c.a r3 = r0.f38375o
            android.content.Context r4 = r3.f32300b
            android.content.res.Resources r3 = r3.mo17491a(r4)
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r2 = r2.toString()
            r5 = 0
            r4[r5] = r2
            java.lang.String r17 = r3.getString(r1, r4)
        L_0x08b4:
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27754g(r17)
            goto L_0x09d4
        L_0x08ba:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x09d4
        L_0x08c0:
            com.google.protos.f.b.d.b r1 = r0.f38370j
            com.google.protos.f.b.d.b r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27792q(r1, r6)
            r0.f38370j = r1
            com.google.protos.f.b.d.d r1 = r1.f175582b
            if (r1 != 0) goto L_0x08ce
            com.google.protos.f.b.d.d r1 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x08ce:
            java.lang.String r1 = r1.f175587b
            boolean r2 = r1.equals(r10)
            if (r2 == 0) goto L_0x099a
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f38366f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250297aV
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0972
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil r2 = r0.f38365e
            int r3 = r0.f38368h
            com.google.nlp.a.ba r4 = com.google.nlp.p4730a.C62782ba.f169539b
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.nlp.a.ap r4 = (com.google.nlp.p4730a.C62752ap) r4
            com.google.nlp.a.at r5 = com.google.nlp.p4730a.C62756at.f169482e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.nlp.a.as r5 = (com.google.nlp.p4730a.C62755as) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.nlp.a.at r6 = (com.google.nlp.p4730a.C62756at) r6
            int r7 = r6.f169484a
            r7 = r7 | r13
            r6.f169484a = r7
            java.lang.String r7 = "count"
            r6.f169487d = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.nlp.a.at r6 = (com.google.nlp.p4730a.C62756at) r6
            r7 = 9
            r6.f169485b = r7
            int r3 = r3 + r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.f169486c = r3
            r4.mo58631a(r5)
            com.google.nlp.a.at r3 = com.google.nlp.p4730a.C62756at.f169482e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.nlp.a.as r3 = (com.google.nlp.p4730a.C62755as) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.nlp.a.at r5 = (com.google.nlp.p4730a.C62756at) r5
            int r6 = r5.f169484a
            r6 = r6 | r13
            r5.f169484a = r6
            java.lang.String r6 = "action_name"
            r5.f169487d = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.nlp.a.at r5 = (com.google.nlp.p4730a.C62756at) r5
            r5.f169485b = r9
            java.lang.String r6 = "call"
            r5.f169486c = r6
            r4.mo58631a(r3)
            com.google.protobuf.bv r3 = r4.build()
            com.google.nlp.a.ba r3 = (com.google.nlp.p4730a.C62782ba) r3
            java.lang.String r4 = "named_contact__FLF_INFO_REQUEST"
            com.google.nlp.a.s r3 = com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil.m27744b(r4, r3)
            com.google.assistant.e.j.dy r2 = r2.mo20309a(r3)
            if (r2 == 0) goto L_0x0964
            r1.add(r2)
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27751d()
            r1.add(r2)
            goto L_0x09d4
        L_0x0964:
            com.google.common.f.a.d r1 = f38362c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "GenX failed to generate TTS."
            r3 = 43872(0xab60, float:6.1478E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x0972:
            int r1 = r0.f38368h
            if (r1 <= 0) goto L_0x0986
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            r2 = 2132085561(0x7f150b39, float:1.9811324E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0995
        L_0x0986:
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            r2 = 2132085560(0x7f150b38, float:1.9811322E38)
            java.lang.String r1 = r1.getString(r2)
        L_0x0995:
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27754g(r1)
            goto L_0x09d4
        L_0x099a:
            boolean r2 = r1.equals(r8)
            if (r2 != 0) goto L_0x09ad
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x09a7
            goto L_0x09ad
        L_0x09a7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x09d4
        L_0x09ad:
            int r1 = r0.f38368h
            if (r1 <= 0) goto L_0x09c1
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            r2 = 2132092254(0x7f15255e, float:1.98249E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x09d0
        L_0x09c1:
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            r2 = 2132089385(0x7f151a29, float:1.981908E38)
            java.lang.String r1 = r1.getString(r2)
        L_0x09d0:
            java.util.List r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11932a.m27754g(r1)
        L_0x09d4:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b.f38331c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.ondevice.utils.a.a r2 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11933a) r2
            com.google.android.libraries.assistant.auto.ondevice.utils.a.f r3 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11938f.f38347e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.assistant.auto.ondevice.utils.a.e r3 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11937e) r3
            r3.mo20314a(r1)
            com.google.protos.f.b.d.b r1 = r0.f38370j
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.assistant.auto.ondevice.utils.a.f r4 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11938f) r4
            r1.getClass()
            r4.f38350b = r1
            int r1 = r4.f38349a
            r1 = r1 | r13
            r4.f38349a = r1
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b) r1
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.assistant.auto.ondevice.utils.a.f r3 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11938f) r3
            r3.getClass()
            r1.f38334b = r3
            r1.f38333a = r13
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b) r1
            return r1
        L_0x0a15:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f38366f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250297aV
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0a36
            com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil r1 = r0.f38365e
            java.lang.String r2 = "FLF_CONVENTIONAL_CLOSING_closing_type_cancelled"
            com.google.nlp.a.s r2 = com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil.m27744b(r2, r4)
            com.google.assistant.e.j.dy r1 = r1.mo20309a(r2)
            if (r1 == 0) goto L_0x0a36
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27758b(r1)
            goto L_0x0a51
        L_0x0a36:
            com.google.android.apps.gsa.a.c.a r1 = r0.f38375o
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            r2 = 2132090350(0x7f151dee, float:1.9821038E38)
            java.lang.String r1 = r1.getString(r2)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r1 = r0.m27758b(r1)
        L_0x0a51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.utils.C11942e.m27766j(int, com.google.android.libraries.assistant.auto.ondevice.utils.a.d):com.google.android.libraries.assistant.auto.ondevice.utils.a.b");
    }
}
