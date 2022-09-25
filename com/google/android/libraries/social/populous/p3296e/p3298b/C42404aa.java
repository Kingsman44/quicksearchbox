package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.populous.core.C42306ce;
import com.google.android.libraries.social.populous.core.C42313cl;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.p4181bi.C55847i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.libraries.social.populous.e.b.aa */
/* compiled from: PG */
public final class C42404aa {

    /* renamed from: a */
    public C55847i f111218a;

    /* renamed from: b */
    public final C41932g f111219b;

    /* renamed from: c */
    public final EnumSet f111220c;

    /* renamed from: d */
    public String f111221d;

    /* renamed from: e */
    public final C55847i f111222e;

    /* renamed from: f */
    public final C41932g f111223f;

    /* renamed from: g */
    public final Map f111224g;

    /* renamed from: h */
    private final int f111225h;

    public C42404aa() {
        this.f111222e = null;
        this.f111218a = null;
        this.f111223f = null;
        this.f111219b = null;
        this.f111225h = 0;
        this.f111220c = EnumSet.noneOf(C42331dc.class);
        this.f111221d = null;
        this.f111224g = new HashMap();
    }

    /* renamed from: f */
    private final void m74670f(Object obj, Object obj2) {
        HashSet hashSet = new HashSet(C42405ab.m74676e(obj));
        hashSet.removeAll(C42405ab.m74676e(obj2));
        this.f111224g.keySet().removeAll(hashSet);
    }

    /* renamed from: a */
    public final C42405ab mo45394a() {
        C41932g gVar;
        C55847i iVar;
        boolean z = true;
        C58838bb.m90884s((this.f111218a != null) ^ (this.f111219b != null), "One of either Autocompletion or CustomResult is required.");
        if (this.f111221d != null) {
            if (this.f111218a == null) {
                z = false;
            }
            C58838bb.m90884s(z, "Cannot set a contextual candidate ID on a CustomResult.");
            mo45395b(this.f111218a).f110939a = this.f111221d;
        }
        Object obj = this.f111218a;
        if (obj == null) {
            obj = this.f111219b;
        }
        if (!this.f111220c.isEmpty()) {
            C58485gu e = C42405ab.m74676e(obj);
            int size = e.size();
            for (int i = 0; i < size; i++) {
                mo45395b(e.get(i)).mo45285i().f110936c.addAll(this.f111220c);
            }
        }
        C55847i iVar2 = this.f111222e;
        if (!(iVar2 == null || (iVar = this.f111218a) == null)) {
            m74670f(iVar2, iVar);
        }
        C41932g gVar2 = this.f111223f;
        if (!(gVar2 == null || (gVar = this.f111219b) == null)) {
            m74670f(gVar2, gVar);
        }
        return new C42405ab(this.f111218a, this.f111219b, this.f111225h, this.f111224g);
    }

    /* renamed from: b */
    public final C42306ce mo45395b(Object obj) {
        if (this.f111224g.containsKey(obj)) {
            C42313cl clVar = (C42313cl) this.f111224g.get(obj);
            if (clVar instanceof C42306ce) {
                return (C42306ce) clVar;
            }
            C42306ce j = clVar.mo45286j();
            this.f111224g.put(obj, j);
            return j;
        }
        C42306ce ceVar = new C42306ce();
        this.f111224g.put(obj, ceVar);
        return ceVar;
    }

    /* renamed from: c */
    public final void mo45396c(Object obj, Object obj2) {
        C42313cl clVar;
        if (obj != null && obj2 != null && (clVar = (C42313cl) this.f111224g.get(obj)) != null) {
            this.f111224g.remove(obj);
            this.f111224g.put(obj2, clVar);
        }
    }

    /* renamed from: d */
    public final void mo45397d(C55847i iVar) {
        C58838bb.m90884s(this.f111219b == null, "Cannot wrap both an Autocompletion and a CustomResult.");
        C55847i iVar2 = this.f111218a;
        if (iVar2 != null) {
            mo45396c(iVar2, iVar);
        }
        this.f111218a = iVar;
    }

    /* renamed from: e */
    public final void mo45398e(C63088z zVar) {
        mo45397d((C55847i) C62942bv.parseFrom((C62942bv) C55847i.f147358c, zVar, C62921ba.m95368a()));
    }

    public C42404aa(C42405ab abVar) {
        C58833ax axVar = abVar.f111226a;
        this.f111222e = (C55847i) axVar.mo56111f();
        this.f111218a = (C55847i) axVar.mo56111f();
        C58833ax axVar2 = abVar.f111227b;
        this.f111223f = (C41932g) axVar2.mo56111f();
        this.f111219b = (C41932g) axVar2.mo56111f();
        this.f111225h = abVar.f111229d;
        this.f111220c = EnumSet.noneOf(C42331dc.class);
        this.f111221d = null;
        this.f111224g = new HashMap(abVar.f111228c);
    }
}
