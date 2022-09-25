package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83927n;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83928o;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83929p;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1323a.C16833a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.w.c.ab */
/* compiled from: PG */
public final class C118744ab implements C16833a {

    /* renamed from: a */
    public static final C59071e f331219a = C59071e.m91332i("com.google.android.apps.gsa.w.c.ab");

    /* renamed from: b */
    public final C69464a f331220b;

    /* renamed from: c */
    public final C69464a f331221c;

    /* renamed from: d */
    public final List f331222d;

    /* renamed from: e */
    public final List f331223e;

    /* renamed from: f */
    public final boolean f331224f;

    /* renamed from: g */
    public final boolean f331225g;

    /* renamed from: h */
    public final Map f331226h;

    /* renamed from: i */
    public final Executor f331227i;

    /* renamed from: j */
    private final Map f331228j;

    public C118744ab(Map map, C69464a aVar, C69464a aVar2, List list, List list2, boolean z, boolean z2, Map map2, Executor executor) {
        this.f331228j = map;
        this.f331220b = aVar;
        this.f331221c = aVar2;
        this.f331222d = list;
        this.f331223e = list2;
        this.f331224f = z;
        this.f331225g = z2;
        this.f331226h = map2;
        this.f331227i = executor;
    }

    /* renamed from: a */
    public final C83929p mo103947a() {
        byte[] e = ((C86338r) this.f331220b.mo17428b()).mo80079e("oc:third_party_disclosures_acked", (byte[]) null);
        if (e == null) {
            return C83929p.f228585b;
        }
        try {
            return (C83929p) C62942bv.parseFrom((C62942bv) C83929p.f228585b, e, C62921ba.m95368a());
        } catch (Exception e2) {
            C59104x c = f331219a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AutoClassSetData");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(11479)).mo56386p("invalid OmniconsentProgressRecord for KEY_RECORD_THIRD_PARTY_DISCLOSURES_ACKNOWLEDGED");
            return C83929p.f228585b;
        }
    }

    /* renamed from: b */
    public final C60870cx mo23060b(String str) {
        C118768s sVar = new C118768s(this, str);
        return C60856cj.m92904m(C47810es.m84978r(sVar), this.f331227i);
    }

    /* renamed from: c */
    public final C60870cx mo23061c(String str, C16868c cVar) {
        C118743aa aaVar = new C118743aa(this, cVar, str);
        return C60856cj.m92903l(C47810es.m84977q(aaVar), this.f331227i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (com.google.common.base.C58890d.m90990e(r3, java.util.Locale.getDefault().toLanguageTag()) == false) goto L_0x002d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo103948d(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            java.util.Map r0 = r2.f331228j
            java.lang.String r1 = "primary-language"
            boolean r0 = r0.containsKey(r1)
            r1 = 1
            if (r1 == r0) goto L_0x000c
            r3 = 0
        L_0x000c:
            if (r3 == 0) goto L_0x002d
            boolean r0 = r2.f331224f
            if (r0 == 0) goto L_0x0037
            java.util.Map r0 = r2.f331228j
            java.lang.String r1 = "user-picked-assistant-locale"
            boolean r0 = r0.containsKey(r1)
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4 = r4 & r0
            if (r4 != 0) goto L_0x0037
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toLanguageTag()
            boolean r4 = com.google.common.base.C58890d.m90990e(r3, r4)
            if (r4 != 0) goto L_0x0037
        L_0x002d:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.toLanguageTag()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0037:
            boolean r4 = r2.f331224f
            if (r4 == 0) goto L_0x004b
            java.util.List r4 = r2.f331222d
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L_0x004b
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = r3.toLanguageTag()
        L_0x004b:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8867w.p8872c.C118744ab.mo103948d(java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: e */
    public final boolean mo103949e(String str, Consumer consumer) {
        if (!this.f331228j.containsKey(str)) {
            C59104x b = f331219a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AutoClassSetData");
            ((C59052c) ((C59052c) b).mo56372aa(11485)).mo56389s("No settings key found for %s", str);
            return false;
        }
        consumer.accept((C118750ah) this.f331228j.get(str));
        return true;
    }

    /* renamed from: f */
    public final boolean mo103950f(String str, int i) {
        C83929p a = mo103947a();
        C83927n nVar = (C83927n) C83928o.f228580d.createBuilder();
        nVar.copyOnWrite();
        C83928o oVar = (C83928o) nVar.instance;
        str.getClass();
        oVar.f228582a |= 1;
        oVar.f228583b = str;
        nVar.copyOnWrite();
        C83928o oVar2 = (C83928o) nVar.instance;
        oVar2.f228584c = i - 1;
        oVar2.f228582a |= 2;
        C83928o oVar3 = (C83928o) nVar.build();
        for (C83928o equals : a.f228587a) {
            if (equals.equals(oVar3)) {
                return true;
            }
        }
        return false;
    }
}
