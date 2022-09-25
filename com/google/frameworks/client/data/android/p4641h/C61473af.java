package com.google.frameworks.client.data.android.p4641h;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.protobuf.MessageLite;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p5488io.grpc.C70162az;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.h.af */
/* compiled from: PG */
final class C61473af extends C70162az {

    /* renamed from: a */
    private final C58485gu f166208a;

    /* renamed from: c */
    private final LinkedHashMap f166209c = new LinkedHashMap();

    /* renamed from: d */
    private final Queue f166210d = new ArrayDeque();

    /* renamed from: e */
    private final LinkedHashMap f166211e = new LinkedHashMap();

    /* renamed from: f */
    private final Set f166212f;

    /* renamed from: g */
    private int f166213g;

    /* renamed from: h */
    private boolean f166214h;

    /* renamed from: i */
    private boolean f166215i;

    /* renamed from: j */
    private boolean f166216j;

    /* renamed from: k */
    private C70334de f166217k;

    /* renamed from: l */
    private Status f166218l;

    /* renamed from: m */
    private C70334de f166219m;

    public C61473af(C70897l lVar, C58485gu guVar, Set set) {
        super(lVar);
        this.f166208a = guVar;
        this.f166213g = guVar.size();
        this.f166212f = set;
    }

    /* renamed from: e */
    private final void m94175e() {
        if (!m94178h() && this.f166210d.isEmpty() && this.f166216j && !this.f166214h) {
            m94177g();
        }
    }

    /* renamed from: f */
    private final void m94176f() {
        if (this.f166215i) {
            for (C61472ae aeVar : this.f166210d) {
                Iterator it = C58597ky.m90216g(this.f166208a.subList(0, aeVar.f166207c)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        for (C61485f fVar : C58597ky.m90216g((List) it.next())) {
                            if (this.f166212f.contains(fVar)) {
                                C58838bb.m90884s(aeVar.f166205a instanceof MessageLite, "Only MessageLite is supported");
                                new C61484e((MessageLite) aeVar.f166205a);
                                try {
                                    C61480am g = fVar.mo39489g();
                                    if (g.f166234c - 1 != 0) {
                                        C61474ag agVar = g.f166233b;
                                        this.f166218l = agVar.f166220a;
                                        this.f166219m = agVar.f166221b;
                                        m94177g();
                                        this.f166214h = true;
                                        return;
                                    }
                                } catch (Throwable th) {
                                    this.f166218l = Status.m102100d(th);
                                    this.f166219m = new C70334de();
                                    m94177g();
                                    this.f166214h = true;
                                    return;
                                }
                            }
                        }
                        if (!aeVar.mo58077a()) {
                            aeVar.f166207c--;
                        } else {
                            return;
                        }
                    }
                }
            }
            while (!this.f166210d.isEmpty()) {
                C61472ae aeVar2 = (C61472ae) this.f166210d.peek();
                if (aeVar2.mo58077a() || aeVar2.f166207c != 0) {
                    break;
                }
                this.f187015b.mo27487i(((C61472ae) this.f166210d.poll()).f166205a);
            }
            m94175e();
        }
    }

    /* renamed from: g */
    private final void m94177g() {
        for (List g : C58597ky.m90216g(this.f166208a)) {
            for (C61485f fVar : C58597ky.m90216g(g)) {
                C61467a aVar = new C61467a(this.f166218l, this.f166219m);
                if (this.f166212f.contains(fVar)) {
                    try {
                        C61480am c = fVar.mo39485c(aVar);
                        if (c.f166234c - 1 == 1) {
                            C61474ag agVar = c.f166233b;
                            this.f166218l = agVar.f166220a;
                            this.f166219m = agVar.f166221b;
                        }
                    } catch (Throwable th) {
                        this.f166218l = Status.m102100d(th);
                        this.f166219m = new C70334de();
                    }
                }
            }
        }
        if (this.f166211e.isEmpty()) {
            this.f187015b.mo27484b(this.f166218l, this.f166219m);
        }
    }

    /* renamed from: h */
    private final boolean m94178h() {
        return !this.f166209c.isEmpty();
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        this.f166218l = status;
        this.f166219m = deVar;
        this.f166216j = true;
        m94175e();
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
        this.f166217k = deVar;
        C61483d dVar = new C61483d(deVar);
        for (List g : C58597ky.m90216g(this.f166208a.subList(0, this.f166213g))) {
            this.f166213g--;
            for (C61485f fVar : C58597ky.m90216g(g)) {
                if (this.f166212f.contains(fVar)) {
                    try {
                        C61480am d = fVar.mo39486d(dVar);
                        if (d.f166234c - 1 != 0) {
                            C61474ag agVar = d.f166233b;
                            this.f166218l = agVar.f166220a;
                            this.f166219m = agVar.f166221b;
                            m94177g();
                            this.f166214h = true;
                            return;
                        }
                    } catch (Throwable th) {
                        this.f166218l = Status.m102100d(th);
                        this.f166219m = new C70334de();
                        m94177g();
                        return;
                    }
                }
            }
            if (m94178h()) {
                return;
            }
        }
        this.f187015b.mo27485c(this.f166217k);
        this.f166215i = true;
        m94176f();
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        this.f166210d.add(new C61472ae(obj, this.f166208a.size()));
        m94176f();
    }
}
