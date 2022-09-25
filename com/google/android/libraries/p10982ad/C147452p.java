package com.google.android.libraries.p10982ad;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.libraries.ad.p */
/* compiled from: PG */
final class C147452p {

    /* renamed from: a */
    public C147451o f398017a;

    /* renamed from: b */
    public long f398018b = Long.MIN_VALUE;

    /* renamed from: c */
    private final LinkedList f398019c = new LinkedList();

    /* renamed from: d */
    private C147451o f398020d;

    /* renamed from: e */
    private long f398021e = Long.MAX_VALUE;

    public C147452p() {
        C147447k kVar = new C147447k(Long.MIN_VALUE, 0.0f);
        this.f398020d = kVar;
        this.f398017a = kVar;
        this.f398018b = kVar.f398014a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C147451o mo124197a(long j) {
        if (j < this.f398021e) {
            return this.f398020d;
        }
        Iterator it = this.f398019c.iterator();
        C147451o oVar = (C147451o) it.next();
        while (it.hasNext()) {
            C147451o oVar2 = (C147451o) it.next();
            if (j < oVar2.f398014a) {
                break;
            }
            oVar = oVar2;
        }
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C147451o mo124198b(long j) {
        while (!this.f398019c.isEmpty() && j >= this.f398021e) {
            this.f398020d = (C147451o) this.f398019c.removeFirst();
            if (this.f398019c.isEmpty()) {
                this.f398021e = Long.MAX_VALUE;
            } else {
                this.f398021e = ((C147451o) this.f398019c.getFirst()).f398014a;
            }
        }
        return this.f398020d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo124199c(C147451o oVar) {
        while (!this.f398019c.isEmpty() && oVar.f398014a <= ((C147451o) this.f398019c.getLast()).f398014a) {
            this.f398019c.removeLast();
        }
        if (oVar.f398014a <= this.f398020d.f398014a) {
            this.f398020d = oVar;
            this.f398021e = Long.MAX_VALUE;
        } else {
            this.f398019c.addLast(oVar);
            this.f398021e = ((C147451o) this.f398019c.getFirst()).f398014a;
        }
        this.f398018b = oVar.f398014a;
        this.f398017a = oVar;
    }
}
