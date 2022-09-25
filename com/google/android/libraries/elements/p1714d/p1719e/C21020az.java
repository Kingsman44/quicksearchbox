package com.google.android.libraries.elements.p1714d.p1719e;

import android.util.SparseArray;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21269bl;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21271bn;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21322ab;
import com.google.android.libraries.elements.internal.C21362w;
import com.google.common.base.C58833ax;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.C66198dl;
import com.google.protos.youtube.elements.C66260r;
import com.google.protos.youtube.elements.p5166b.C66099d;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68045ah;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.e.az */
/* compiled from: PG */
public final class C21020az implements C21269bl {

    /* renamed from: a */
    private static final C58528ij f58911a = C58528ij.m90015O(224886694, 287553821, Integer.valueOf(C66099d.f179743d.f169971d.f169964b), Integer.valueOf(C66198dl.f180009c.f169971d.f169964b), 316055719, 268941992, 258411896, 338763089);

    /* renamed from: b */
    private final SparseArray f58912b = new SparseArray();

    /* renamed from: c */
    private final SparseArray f58913c = new SparseArray();

    /* renamed from: d */
    private final Map f58914d;

    /* renamed from: e */
    private final C58528ij f58915e;

    /* renamed from: f */
    private final C21259bb f58916f;

    /* renamed from: g */
    private final C58833ax f58917g;

    /* renamed from: h */
    private final boolean f58918h;

    public C21020az(Collection collection, Collection collection2, List list, C21259bb bbVar, C58833ax axVar, C58833ax axVar2) {
        this.f58916f = bbVar;
        this.f58917g = axVar;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C21271bn bnVar = (C21271bn) it.next();
            this.f58912b.put(bnVar.mo26066a(), bnVar);
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            C21271bn bnVar2 = (C21271bn) it2.next();
            this.f58913c.put(bnVar2.mo26066a(), bnVar2);
        }
        HashSet hashSet = new HashSet();
        C58526ih ihVar = new C58526ih();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            int a = ((C21270bm) it3.next()).mo25837a().mo58810a();
            Integer valueOf = Integer.valueOf(a);
            if (!hashSet.add(valueOf)) {
                ihVar.mo55373c(valueOf);
                C66260r rVar = C66260r.LOG_TYPE_CONFIGURATION_ERROR;
                bbVar.mo25782a(rVar, "Multiple property converters found and will be removed for extension " + a, C21319z.f59680u, (Throwable) null);
            }
        }
        C58528ij f = ihVar.mo55486f();
        this.f58915e = f;
        C58490gz gzVar = new C58490gz(4);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            C21270bm bmVar = (C21270bm) it4.next();
            Integer valueOf2 = Integer.valueOf(bmVar.mo25837a().mo58810a());
            if (!f.contains(valueOf2)) {
                gzVar.mo55429h(valueOf2, bmVar);
            }
        }
        this.f58914d = gzVar.mo55427f(true);
        this.f58918h = ((Boolean) axVar2.mo56109e(false)).booleanValue();
    }

    /* renamed from: c */
    private final Collection m39508c(C6411u uVar, C21319z zVar, String str, C68045ah ahVar, C21248ar arVar, SparseArray sparseArray, C68044ag agVar, C21310q qVar) {
        C68044ag agVar2 = agVar;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < ahVar.mo60108g(); i++) {
            ahVar.mo60110i(agVar2, i);
            if (agVar.mo60107j() == 1) {
                C21271bn bnVar = (C21271bn) sparseArray.get(agVar.mo60106i());
                if (bnVar != null) {
                    try {
                        bnVar.mo25838b(uVar, zVar, str, bnVar.mo26067d(agVar2.mo16918f(6)), arVar, qVar);
                    } catch (Exception e) {
                        m39509d(e, zVar);
                        if (this.f58918h) {
                            int i2 = agVar.mo60106i();
                            throw new RuntimeException("THIS IS NOT A PRODUCTION CRASH!\nConverter for property " + i2 + " threw an exception.", e);
                        }
                    }
                }
                C21319z zVar2 = zVar;
            } else {
                C21319z zVar3 = zVar;
                SparseArray sparseArray2 = sparseArray;
                if (agVar.mo60107j() != 2) {
                    hashSet.add(Integer.valueOf(agVar.mo60106i()));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: d */
    private final void m39509d(Exception exc, C21319z zVar) {
        this.f58916f.mo25782a(C66260r.LOG_TYPE_PROPERTY_RESOLUTION_ERROR, "Property error", zVar, exc);
    }

    /* renamed from: a */
    public final void mo26105a(C6411u uVar, C21319z zVar, String str, C68045ah ahVar, C21248ar arVar, C21310q qVar) {
        C62921ba baVar;
        C21319z zVar2 = zVar;
        C68044ag agVar = (C68044ag) C21362w.f59728a.mo5126a();
        HashSet hashSet = new HashSet();
        C6411u uVar2 = uVar;
        C21319z zVar3 = zVar;
        String str2 = str;
        C68045ah ahVar2 = ahVar;
        C21248ar arVar2 = arVar;
        C68044ag agVar2 = agVar;
        C21310q qVar2 = qVar;
        hashSet.addAll(m39508c(uVar2, zVar3, str2, ahVar2, arVar2, this.f58912b, agVar2, qVar2));
        hashSet.addAll(m39508c(uVar2, zVar3, str2, ahVar2, arVar2, this.f58913c, agVar2, qVar2));
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < ahVar.mo60108g(); i++) {
            ahVar.mo60110i(agVar, i);
            int i2 = agVar.mo60106i();
            if (agVar.mo60107j() != 1) {
                if (agVar.mo60107j() == 0) {
                    hashSet2.add(Integer.valueOf(i2));
                } else {
                    Map map = this.f58914d;
                    Integer valueOf = Integer.valueOf(i2);
                    C21270bm bmVar = (C21270bm) map.get(valueOf);
                    if (bmVar != null) {
                        try {
                            ByteBuffer f = agVar.mo16918f(6);
                            C63010eb parserForType = bmVar.mo25837a().mo58811b().getParserForType();
                            if (i2 == 168774585) {
                                baVar = C62921ba.f169869a;
                            } else {
                                baVar = C62921ba.m95368a();
                            }
                            bmVar.mo25838b(uVar, zVar, str, C21322ab.m40329a(f, parserForType, baVar), arVar, qVar);
                        } catch (C62974ct e) {
                            this.f58916f.mo25782a(C66260r.LOG_TYPE_WIRE_FORMAT_ERROR, "Failed to set PB Property Extension in PropertiesConverterFlat. Extension id: " + i2, zVar2, e);
                        } catch (Exception e2) {
                            m39509d(e2, zVar2);
                            if (this.f58918h) {
                                throw new RuntimeException("THIS IS NOT A PRODUCTION CRASH!\nConverter for property " + agVar.mo60106i() + " threw an exception.", e2);
                            }
                        }
                    } else if (!f58911a.contains(valueOf) && (!this.f58917g.mo56113h() || !((C58839bc) this.f58917g.mo56107c()).mo5941a(valueOf))) {
                        String str3 = "No proto converter found for extension " + i2;
                        if (this.f58915e.contains(valueOf)) {
                            str3 = str3.concat(" due to having duplicate converter bindings.");
                        }
                        this.f58916f.mo25782a(C66260r.LOG_TYPE_CONFIGURATION_ERROR, str3, zVar2, (Throwable) null);
                    }
                }
            }
        }
        hashSet.addAll(hashSet2);
        if (hashSet.isEmpty()) {
            C21362w.f59728a.mo5127b(agVar);
            return;
        }
        throw new C21260bc("Extensions with unknown format: ".concat(String.valueOf(hashSet.toString())));
    }

    /* renamed from: b */
    public final void mo26106b(C21248ar arVar) {
        for (int i = 0; i < this.f58912b.size(); i++) {
            ((C21271bn) this.f58912b.get(this.f58912b.keyAt(i))).mo25839c(arVar);
        }
    }
}
