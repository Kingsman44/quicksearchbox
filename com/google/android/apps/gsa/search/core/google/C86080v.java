package com.google.android.apps.gsa.search.core.google;

import android.util.Pair;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.search.shared.p6926d.C87539a;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.p6926d.C87542d;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4671b.C61818k;
import com.google.knowledge.p4682d.C61995f;
import com.google.protobuf.C63088z;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.v */
/* compiled from: PG */
public final class C86080v {

    /* renamed from: a */
    private final C86159h f232679a;

    /* renamed from: b */
    private final C86124t f232680b;

    public C86080v(C86159h hVar, C86124t tVar) {
        this.f232679a = hVar;
        this.f232680b = tVar;
    }

    /* renamed from: b */
    public static final Pair m138416b(C61818k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        return Pair.create("X-Client-Discourse-Context", C90734ar.m148201d(kVar.toByteArray()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo79716a(C85981c cVar, int i) {
        String str;
        C63088z f;
        if (i == 1) {
            C87541c cVar2 = (C87541c) this.f232679a.f232834c.mo27525b();
            synchronized (cVar2.f236439a) {
                C87539a aVar = cVar2.f236443e;
                if (aVar == null) {
                    str = null;
                } else {
                    str = aVar.f236434f;
                }
            }
            C58976aa aaVar = C58975e.f156826a;
            if (str != null) {
                cVar.mo79638d("ei", str);
            }
            Map map = cVar.f232498f;
            C61818k e = this.f232679a.mo79795e(true);
            if (e != null && e.getSerializedSize() != 0) {
                Pair b = m138416b(e);
                map.put((String) b.first, (byte[]) b.second);
            }
        } else if (i == 2) {
            C61995f fVar = ((C87541c) this.f232679a.f232834c.mo27525b()).mo81644f().f236464c;
            if (fVar != null) {
                cVar.mo79637c(cVar.f232498f, "AGSA-QBC", fVar.toByteArray());
            }
            String str2 = ((C87541c) this.f232679a.f232834c.mo27525b()).mo81644f().f236465d;
            if (str2 != null) {
                cVar.mo79638d("pq", str2);
                C86159h hVar = this.f232679a;
                C87542d f2 = ((C87541c) hVar.f232834c.mo27525b()).mo81644f();
                cVar.mo79638d("pq_sec", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(hVar.f232833b.mo26870b() - f2.f236466e)));
            }
        } else if (i != 3 && (f = this.f232679a.mo79796f()) != null) {
            if (((long) f.mo59031d()) > this.f232680b.mo79743a(C90014bt.f247671lZ)) {
                C58976aa aaVar2 = C58975e.f156826a;
                return;
            }
            cVar.mo79637c(cVar.f232498f, "X-Opa-Opaque-Token", f.mo59174N());
        }
    }
}
