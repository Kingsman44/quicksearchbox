package com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.p1714d.p1724f.p1725a.C21081e;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.protobuf.C62934bn;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64252a;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64255d;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C70120l;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.h.i */
/* compiled from: PG */
public final class C40423i implements C21232ab {

    /* renamed from: e */
    private static final C59071e f106096e = C59071e.m91331h();

    /* renamed from: a */
    public final C21081e f106097a;

    /* renamed from: b */
    public final Object f106098b = new Object();

    /* renamed from: c */
    public C40432r f106099c;

    /* renamed from: d */
    public final C71643cp f106100d;

    /* renamed from: f */
    private final C57695ab f106101f;

    /* renamed from: g */
    private final C40434t f106102g;

    /* renamed from: h */
    private final C71422aw f106103h;

    /* renamed from: i */
    private final C40364q f106104i;

    /* renamed from: j */
    private final C40433s f106105j;

    /* renamed from: k */
    private final C40420f f106106k;

    public C40423i(C57695ab abVar, C40420f fVar, C40434t tVar, C71422aw awVar, C40364q qVar) {
        this.f106101f = abVar;
        this.f106106k = fVar;
        this.f106102g = tVar;
        this.f106103h = awVar;
        this.f106104i = qVar;
        C21081e eVar = new C21081e();
        this.f106097a = eVar;
        C71422aw awVar2 = (C71422aw) tVar.f106145a.mo17428b();
        awVar2.getClass();
        C40480q qVar2 = (C40480q) tVar.f106146b.mo17428b();
        qVar2.getClass();
        C40364q qVar3 = (C40364q) tVar.f106147c.mo17428b();
        qVar3.getClass();
        this.f106105j = new C40433s(abVar, eVar, awVar2, qVar2, qVar3);
        this.f106100d = C71803m.m105043d(awVar, (C69585o) null, C71424ay.LAZY, new C40422h(this, (C69577g) null), 1);
    }

    /* renamed from: f */
    private final void m70116f() {
        if (mo42431a()) {
            C59052c cVar = (C59052c) f106096e.mo56226d();
            C58976aa aaVar = C40364q.f106014a;
            C62934bn builder = this.f106104i.mo42422a().toBuilder();
            C69664n.m101060f(builder, "this.toBuilder()");
            C64255d a = C69664n.m101061g((C64252a) builder, "builder");
            a.mo59265b(this.f106101f);
            cVar.mo56378ag(aaVar, a.mo59264a());
            cVar.mo56379ah(new C59094n(53331));
            cVar.mo56386p("PersistentByteStore is not subscribed to a ByteStore before first access");
        }
    }

    /* renamed from: b */
    public final C70120l mo26139b(String str) {
        C69664n.m101061g(str, "key");
        m70116f();
        return this.f106097a.mo26139b(str);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo26140c(String str, byte[] bArr) {
        C69664n.m101061g(str, "key");
        C69664n.m101061g(bArr, "entity");
        m70116f();
        this.f106097a.mo26142e(str, bArr);
    }

    /* renamed from: d */
    public final void mo26141d(String str) {
        C69664n.m101061g(str, "key");
        m70116f();
        this.f106097a.mo26141d(str);
    }

    /* renamed from: e */
    public final void mo26142e(String str, byte[] bArr) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo42431a() {
        synchronized (this.f106098b) {
            if (this.f106099c != null) {
                return false;
            }
            C40433s sVar = this.f106105j;
            C40420f fVar = this.f106106k;
            ByteStore a = sVar.f106143f.mo26138a();
            C69664n.m101060f(a, "defaultStore.getByteStore()");
            C40432r rVar = new C40432r(sVar, a, fVar);
            rVar.f106129c = rVar.f106127a.subscribe((String) null, rVar.f106134h);
            rVar.f106130d = rVar.f106127a.subscribeToFaults(rVar.f106135i);
            this.f106099c = rVar;
            return true;
        }
    }
}
