package com.google.common.p4535g;

import com.google.common.base.C58838bb;
import java.util.PriorityQueue;

/* renamed from: com.google.common.g.af */
/* compiled from: PG */
final class C59113af implements C59112ae {

    /* renamed from: a */
    final PriorityQueue f157096a = new PriorityQueue();

    /* renamed from: b */
    C59116ai f157097b;

    /* renamed from: a */
    public final int mo56427a() {
        C58838bb.m90884s(!mo56428b(), "Cannot call nextEdge() on empty Edges.");
        int a = this.f157097b.mo56430a();
        while (!this.f157096a.isEmpty() && ((C59116ai) this.f157096a.peek()).mo56430a() == a) {
            C59116ai aiVar = (C59116ai) this.f157096a.poll();
            int i = aiVar.f157102a + 1;
            aiVar.f157102a = i;
            if (i != aiVar.f157103b.mo56559f()) {
                this.f157096a.add(aiVar);
            }
        }
        C59116ai aiVar2 = this.f157097b;
        int i2 = aiVar2.f157102a + 1;
        aiVar2.f157102a = i2;
        if (i2 == aiVar2.f157103b.mo56559f()) {
            this.f157097b = this.f157096a.isEmpty() ? null : (C59116ai) this.f157096a.poll();
        } else if (!this.f157096a.isEmpty() && this.f157097b.mo56430a() > ((C59116ai) this.f157096a.peek()).mo56430a()) {
            this.f157096a.add(this.f157097b);
            this.f157097b = (C59116ai) this.f157096a.poll();
        }
        return a;
    }

    /* renamed from: b */
    public final boolean mo56428b() {
        return this.f157097b == null;
    }

    /* renamed from: c */
    public final void mo56429c(C59200dl dlVar) {
        C59116ai aiVar = new C59116ai(dlVar);
        C59116ai aiVar2 = this.f157097b;
        if (aiVar2 == null) {
            this.f157097b = aiVar;
        } else if (aiVar2.mo56430a() <= aiVar.mo56430a()) {
            this.f157096a.add(aiVar);
        } else {
            this.f157096a.add(this.f157097b);
            this.f157097b = aiVar;
        }
    }
}
