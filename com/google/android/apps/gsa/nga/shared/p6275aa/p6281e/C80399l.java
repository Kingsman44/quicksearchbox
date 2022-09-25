package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e;

import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62995dn;
import com.google.protos.p4985f.p5030q.C65196fc;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.l */
/* compiled from: PG */
public final class C80399l extends C62934bn implements C80402o {
    public C80399l() {
        super(C80401n.f220656k);
    }

    /* renamed from: a */
    public final int mo74309a() {
        return ((C80401n) this.instance).f220658a.size();
    }

    /* renamed from: b */
    public final int mo74310b() {
        return ((C80401n) this.instance).f220659b.size();
    }

    /* renamed from: c */
    public final int mo74311c() {
        return Collections.unmodifiableMap(((C80401n) this.instance).f220661d).size();
    }

    /* renamed from: d */
    public final C65196fc mo74312d() {
        C65196fc fcVar = ((C80401n) this.instance).f220666i;
        return fcVar == null ? C65196fc.f176453l : fcVar;
    }

    /* renamed from: e */
    public final void mo74313e(Iterable iterable) {
        copyOnWrite();
        C80401n nVar = (C80401n) this.instance;
        C80401n nVar2 = C80401n.f220656k;
        nVar.mo74322f();
        C62947c.addAll(iterable, (List) nVar.f220659b);
    }

    /* renamed from: f */
    public final void mo74314f(Iterable iterable) {
        copyOnWrite();
        C80401n nVar = (C80401n) this.instance;
        C80401n nVar2 = C80401n.f220656k;
        nVar.mo74321e();
        C62947c.addAll(iterable, (List) nVar.f220658a);
    }

    @Deprecated
    /* renamed from: g */
    public final void mo74315g(Iterable iterable) {
        copyOnWrite();
        C80401n nVar = (C80401n) this.instance;
        C80401n nVar2 = C80401n.f220656k;
        nVar.mo74323g();
        C62947c.addAll(iterable, (List) nVar.f220660c);
    }

    /* renamed from: h */
    public final void mo74316h(C52231kb kbVar) {
        copyOnWrite();
        C80401n nVar = (C80401n) this.instance;
        C52232kc kcVar = (C52232kc) kbVar.build();
        C80401n nVar2 = C80401n.f220656k;
        kcVar.getClass();
        nVar.mo74322f();
        nVar.f220659b.add(kcVar);
    }

    /* renamed from: i */
    public final void mo74317i(C80392e eVar) {
        copyOnWrite();
        C80401n nVar = (C80401n) this.instance;
        C80394g gVar = (C80394g) eVar.build();
        C80401n nVar2 = C80401n.f220656k;
        gVar.getClass();
        nVar.mo74321e();
        nVar.f220658a.add(gVar);
    }

    /* renamed from: j */
    public final void mo74318j(C80394g gVar) {
        copyOnWrite();
        C80401n nVar = (C80401n) this.instance;
        C80401n nVar2 = C80401n.f220656k;
        gVar.getClass();
        nVar.mo74321e();
        nVar.f220658a.add(gVar);
    }

    @Deprecated
    /* renamed from: k */
    public final void mo74319k(int i) {
        copyOnWrite();
        C80401n nVar = (C80401n) this.instance;
        C80401n nVar2 = C80401n.f220656k;
        nVar.mo74323g();
        nVar.f220660c.mo58916g(i);
    }

    /* renamed from: l */
    public final void mo74320l(String str, C80401n nVar) {
        str.getClass();
        nVar.getClass();
        copyOnWrite();
        C80401n nVar2 = (C80401n) this.instance;
        C80401n nVar3 = C80401n.f220656k;
        C62995dn dnVar = nVar2.f220661d;
        if (!dnVar.f170058b) {
            nVar2.f220661d = dnVar.mo58980a();
        }
        nVar2.f220661d.put(str, nVar);
    }
}
