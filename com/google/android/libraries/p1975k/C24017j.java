package com.google.android.libraries.p1975k;

import android.p023c.p024a.p025a.C0117a;
import android.util.LruCache;
import com.google.android.libraries.p1975k.p1976a.C23978a;
import com.google.android.libraries.p1975k.p1977b.C23985f;
import com.google.android.libraries.p1975k.p1977b.C23986g;
import com.google.android.libraries.p1975k.p1977b.C23989j;
import com.google.android.libraries.p1975k.p1977b.C23990k;
import com.google.android.libraries.p1975k.p1977b.C23994o;
import com.google.android.libraries.p1975k.p1978c.C23996a;
import com.google.android.libraries.p1975k.p1979d.C24001d;
import com.google.android.libraries.p1975k.p1980e.C24003a;
import com.google.android.libraries.p1975k.p1980e.C24010h;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.p4230bn.p4231a.p4232a.p4233a.C56114a;
import com.google.protobuf.C63070h;
import com.google.protos.p4972d.p4983c.C64633b;
import com.google.protos.p4972d.p4983c.C64639h;
import com.google.protos.p4972d.p4983c.C64641j;
import com.google.protos.p5066i.p5067a.C65472c;
import com.google.protos.p5066i.p5067a.C65473d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72755c;
import p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72757e;
import p5682q.p5683a.p5684a.p5685a.p5686a.p5687a.C72761i;

/* renamed from: com.google.android.libraries.k.j */
/* compiled from: PG */
public final class C24017j implements C24016i {

    /* renamed from: a */
    public static final int f65634a = C56114a.m87896a(C63070h.class.getName());

    /* renamed from: b */
    public static final Map f65635b = new HashMap();

    /* renamed from: c */
    public static final C24003a f65636c = new C24003a();

    /* renamed from: d */
    public final LruCache f65637d = new C23978a();

    /* renamed from: e */
    public final LruCache f65638e = new LruCache(100);

    /* renamed from: f */
    public final C24001d f65639f = new C24001d();

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(0, "WIRETYPE_VARINT");
        gzVar.mo55429h(1, "WIRETYPE_FIXED64");
        gzVar.mo55429h(2, "WIRETYPE_LENGTH_DELIMITED");
        gzVar.mo55429h(3, "WIRETYPE_START_GROUP");
        gzVar.mo55429h(4, "WIRETYPE_END_GROUP");
        gzVar.mo55429h(5, "WIRETYPE_FIXED32");
        gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public static C72757e m44612a(C72755c cVar, int i) {
        return (C72757e) Collections.unmodifiableMap(cVar.f193432c).get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public static C72757e m44613b(C72761i iVar, int i) {
        return (C72757e) Collections.unmodifiableMap(iVar.f193443a).get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public static boolean m44614c(C23995c cVar, C72757e eVar, C23997d dVar, C24010h hVar, C58833ax axVar) {
        C23985f fVar;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (eVar == null || i >= eVar.f193437b.size()) {
                return true;
            }
            int a = C64641j.m96422a(eVar.f193437b.mo58914d(i));
            if (a == 0) {
                a = 1;
            }
            C23989j jVar = dVar.f65599b;
            C64639h a2 = C0117a.m91a(a);
            if (a2.f175225a == 1) {
                C23986g gVar = ((C23990k) jVar).f65586b;
                int b = C64633b.m96411b(((Integer) a2.f175226b).intValue());
                if (b != 0) {
                    i2 = b;
                }
                fVar = gVar.mo29401a(i2, cVar);
            } else {
                fVar = new C23994o(((C23990k) jVar).f65586b, a2, cVar);
            }
            if (!fVar.mo29397a()) {
                if (C23996a.m44587a()) {
                    C65472c b2 = hVar.mo29414b(3);
                    b2.copyOnWrite();
                    C65473d dVar2 = (C65473d) b2.instance;
                    C65473d dVar3 = C65473d.f177963m;
                    dVar2.f177973i = a - 1;
                    dVar2.f177965a |= 128;
                    C64639h a3 = C0117a.m91a(a);
                    b2.copyOnWrite();
                    C65473d dVar4 = (C65473d) b2.instance;
                    a3.getClass();
                    dVar4.f177974j = a3;
                    dVar4.f177965a |= 512;
                    if (axVar.mo56113h()) {
                        b2.mo59378a((long) ((Integer) axVar.mo56107c()).intValue());
                    }
                    hVar.mo29413a(b2);
                }
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m44615d(C72757e eVar) {
        return (eVar == null || eVar.f193437b.size() == 0) ? false : true;
    }

    /* renamed from: e */
    public static boolean m44616e(int i, int i2) {
        return i == f65634a && i2 == 2;
    }
}
