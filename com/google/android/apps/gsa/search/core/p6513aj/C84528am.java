package com.google.android.apps.gsa.search.core.p6513aj;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.p6805i.C86113i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.aj.am */
/* compiled from: PG */
public final /* synthetic */ class C84528am implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C84531ap f230036a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f230037b;

    public /* synthetic */ C84528am(C84531ap apVar, C86124t tVar) {
        this.f230036a = apVar;
        this.f230037b = tVar;
    }

    public final void run() {
        C84531ap apVar = this.f230036a;
        C86124t tVar = this.f230037b;
        C84534as asVar = (C84534as) apVar.f230043c.mo27525b();
        C90476a aVar = C91018d.f254254a;
        Set<String> keySet = asVar.mo85400e().getAll().keySet();
        HashSet<Integer> hashSet = new HashSet<>();
        for (String next : keySet) {
            if (next != null && next.startsWith("flag.")) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(next.substring(5))));
                } catch (NumberFormatException e) {
                    ((C59052c) ((C59052c) ((C59052c) C91142g.f254468a.mo56225c()).mo56382g(e)).mo56372aa(11454)).mo56389s("Invalid flag key: %s", next);
                }
            }
        }
        C84533ar a = asVar.mo78241a();
        for (Integer intValue : (Set) apVar.f230044d.mo6453a()) {
            C86113i b = tVar.mo79744b(intValue.intValue());
            if (b != null) {
                String str = "flag." + b.f232755e;
                int i = b.f232752b;
                if (i == 2) {
                    a.f230052a.putBoolean(str, ((Boolean) b.f232753c).booleanValue());
                } else if (i == 4) {
                    a.f230052a.putLong(str, ((Long) b.f232753c).longValue());
                } else if (i == 3) {
                    a.f230052a.putString(str, (String) b.f232753c);
                } else if (i == 7) {
                    a.f230052a.putLong(str, Double.doubleToRawLongBits(((Double) b.f232753c).doubleValue()));
                } else if (i == 6) {
                    a.f230052a.putString(str, Base64.encodeToString(((C63088z) b.f232753c).mo59174N(), 2));
                }
                hashSet.remove(Integer.valueOf(b.f232755e));
            }
        }
        for (Integer intValue2 : hashSet) {
            int intValue3 = intValue2.intValue();
            a.f230052a.remove("flag." + intValue3);
        }
        for (Map.Entry entry : ((Map) apVar.f230045e.mo6453a()).entrySet()) {
            a.mo78237c((String) entry.getValue(), tVar.mo79746e((C90048d) entry.getKey()));
        }
        for (Map.Entry entry2 : ((Map) apVar.f230046f.mo6453a()).entrySet()) {
            a.mo78238d((String) entry2.getValue(), tVar.mo79743a((C90102f) entry2.getKey()));
        }
        for (Map.Entry entry3 : ((Map) apVar.f230047g.mo6453a()).entrySet()) {
            a.mo78239e((String) entry3.getValue(), tVar.mo79758x((C90129h) entry3.getKey()));
        }
        C58485gu guVar = C91142g.f254469b;
        int i2 = ((C58724pq) guVar).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            a.mo78240f((String) guVar.get(i3));
        }
        a.mo78236b();
    }
}
