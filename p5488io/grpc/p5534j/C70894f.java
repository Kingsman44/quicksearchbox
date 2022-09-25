package p5488io.grpc.p5534j;

import com.google.common.base.C58838bb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import p5488io.grpc.C70132a;
import p5488io.grpc.C70137aa;
import p5488io.grpc.C70138ab;
import p5488io.grpc.C70158av;
import p5488io.grpc.C70163b;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70272ca;
import p5488io.grpc.C70275cd;
import p5488io.grpc.C70278cg;
import p5488io.grpc.C70279ch;
import p5488io.grpc.C70282ck;
import p5488io.grpc.Status;

/* renamed from: io.grpc.j.f */
/* compiled from: PG */
final class C70894f extends C70282ck {

    /* renamed from: b */
    static final C70163b f189085b = new C70163b("state-info");

    /* renamed from: e */
    private static final Status f189086e = Status.f186902OK.withDescription("no subchannels ready");

    /* renamed from: c */
    public final C70275cd f189087c;

    /* renamed from: d */
    public final Map f189088d = new HashMap();

    /* renamed from: f */
    private final Random f189089f;

    /* renamed from: g */
    private C70137aa f189090g;

    /* renamed from: h */
    private C70893e f189091h = new C70890b(f189086e);

    public C70894f(C70275cd cdVar) {
        this.f189087c = cdVar;
        this.f189089f = new Random();
    }

    /* renamed from: e */
    public static C70158av m103790e(C70158av avVar) {
        return new C70158av(avVar.f187011b, C70256c.f187254a);
    }

    /* renamed from: f */
    public static C70892d m103791f(C70279ch chVar) {
        C70256c a = chVar.mo61950a();
        C70892d dVar = (C70892d) a.f187256b.get(f189085b);
        C58838bb.m90866a(dVar, "STATE_INFO");
        return dVar;
    }

    /* renamed from: i */
    private final void m103792i(C70137aa aaVar, C70893e eVar) {
        if (aaVar != this.f189090g || !eVar.mo62584b(this.f189091h)) {
            this.f189087c.mo61943c(aaVar, eVar);
            this.f189090g = aaVar;
            this.f189091h = eVar;
        }
    }

    /* renamed from: j */
    private static final void m103793j(C70279ch chVar) {
        chVar.mo61954e();
        m103791f(chVar).f189084a = C70138ab.m102114a(C70137aa.SHUTDOWN);
    }

    /* renamed from: a */
    public final void mo61959a(Status status) {
        if (this.f189090g != C70137aa.READY) {
            m103792i(C70137aa.TRANSIENT_FAILURE, new C70890b(status));
        }
    }

    /* renamed from: b */
    public final void mo61960b(C70278cg cgVar) {
        List<C70158av> list = cgVar.f187351a;
        Set keySet = this.f189088d.keySet();
        int size = list.size();
        HashMap hashMap = new HashMap(size + size);
        for (C70158av avVar : list) {
            hashMap.put(m103790e(avVar), avVar);
        }
        Set keySet2 = hashMap.keySet();
        HashSet<C70158av> hashSet = new HashSet<>(keySet);
        hashSet.removeAll(keySet2);
        for (Map.Entry entry : hashMap.entrySet()) {
            C70158av avVar2 = (C70158av) entry.getKey();
            C70158av avVar3 = (C70158av) entry.getValue();
            C70279ch chVar = (C70279ch) this.f189088d.get(avVar2);
            if (chVar != null) {
                chVar.mo61956g(Collections.singletonList(avVar3));
            } else {
                C70132a a = C70256c.m102407a();
                a.mo61688b(f189085b, new C70892d(C70138ab.m102114a(C70137aa.IDLE)));
                List singletonList = Collections.singletonList(avVar3);
                C70256c a2 = a.mo61687a();
                C58838bb.m90866a(a2, "attrs");
                C70279ch a3 = this.f189087c.mo61941a(C70272ca.m102444a(singletonList, a2, (Object[][]) Array.newInstance(Object.class, new int[]{0, 2})));
                C58838bb.m90866a(a3, "subchannel");
                a3.mo61955f(new C70889a(this, a3));
                this.f189088d.put(avVar2, a3);
                a3.mo61953d();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C70158av remove : hashSet) {
            arrayList.add((C70279ch) this.f189088d.remove(remove));
        }
        mo62588h();
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            m103793j((C70279ch) arrayList.get(i));
        }
    }

    /* renamed from: c */
    public final void mo61961c() {
        for (C70279ch j : mo62587g()) {
            m103793j(j);
        }
        this.f189088d.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Collection mo62587g() {
        return this.f189088d.values();
    }

    /* renamed from: h */
    public final void mo62588h() {
        Collection<C70279ch> g = mo62587g();
        ArrayList arrayList = new ArrayList(g.size());
        for (C70279ch chVar : g) {
            if (((C70138ab) m103791f(chVar).f189084a).f186972a == C70137aa.READY) {
                arrayList.add(chVar);
            }
        }
        if (arrayList.isEmpty()) {
            Status status = f189086e;
            boolean z = false;
            for (C70279ch f : mo62587g()) {
                C70138ab abVar = (C70138ab) m103791f(f).f189084a;
                C70137aa aaVar = abVar.f186972a;
                if (aaVar == C70137aa.CONNECTING || aaVar == C70137aa.IDLE) {
                    z = true;
                }
                if (status == f189086e || !status.mo61679g()) {
                    status = abVar.f186973b;
                }
            }
            m103792i(z ? C70137aa.CONNECTING : C70137aa.TRANSIENT_FAILURE, new C70890b(status));
            return;
        }
        m103792i(C70137aa.READY, new C70891c(arrayList, this.f189089f.nextInt(arrayList.size())));
    }
}
