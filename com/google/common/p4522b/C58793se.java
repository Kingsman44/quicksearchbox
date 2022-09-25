package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.se */
/* compiled from: PG */
final class C58793se implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    C58795sg f156573a;

    /* renamed from: b */
    C58691ok f156574b;

    /* renamed from: c */
    final /* synthetic */ C58797si f156575c;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r6.range.mo55303c(r0.f156576a) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58793se(com.google.common.p4522b.C58797si r6) {
        /*
            r5 = this;
            r5.f156575c = r6
            r5.<init>()
            com.google.common.b.sh r0 = r6.rootReference
            java.lang.Object r0 = r0.f156585a
            r1 = 0
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r0 = r1
            goto L_0x004c
        L_0x000e:
            com.google.common.b.fj r2 = r6.range
            boolean r3 = r2.f156050d
            if (r3 == 0) goto L_0x0037
            java.lang.Object r2 = r2.f156051e
            java.util.Comparator r3 = r6.comparator
            com.google.common.b.sg r0 = (com.google.common.p4522b.C58795sg) r0
            com.google.common.b.sg r0 = r0.mo56011d(r3, r2)
            if (r0 != 0) goto L_0x0021
            goto L_0x000c
        L_0x0021:
            com.google.common.b.fj r3 = r6.range
            int r3 = r3.f156053g
            r4 = 1
            if (r3 != r4) goto L_0x003d
            java.util.Comparator r3 = r6.comparator
            java.lang.Object r4 = r0.f156576a
            int r2 = r3.compare(r2, r4)
            if (r2 != 0) goto L_0x003d
            com.google.common.b.sg r0 = r0.mo56012e()
            goto L_0x003d
        L_0x0037:
            com.google.common.b.sg r0 = r6.header
            com.google.common.b.sg r0 = r0.mo56012e()
        L_0x003d:
            com.google.common.b.sg r2 = r6.header
            if (r0 == r2) goto L_0x000c
            com.google.common.b.fj r6 = r6.range
            java.lang.Object r2 = r0.f156576a
            boolean r6 = r6.mo55303c(r2)
            if (r6 != 0) goto L_0x004c
            goto L_0x000c
        L_0x004c:
            r5.f156573a = r0
            r5.f156574b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58793se.<init>(com.google.common.b.si):void");
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        C58795sg sgVar = this.f156573a;
        if (sgVar == null) {
            return false;
        }
        if (!this.f156575c.range.mo55305e(sgVar.f156576a)) {
            return true;
        }
        this.f156573a = null;
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            Objects.requireNonNull(this.f156573a);
            C58797si siVar = this.f156575c;
            C58795sg sgVar = this.f156573a;
            C58791sc scVar = new C58791sc(siVar, sgVar);
            this.f156574b = scVar;
            if (sgVar.mo56012e() == this.f156575c.header) {
                this.f156573a = null;
            } else {
                this.f156573a = this.f156573a.mo56012e();
            }
            return scVar;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        C58838bb.m90884s(this.f156574b != null, "no calls to next() since the last call to remove()");
        this.f156575c.mo54928h(((C58791sc) this.f156574b).f156568a.f156576a, 0);
        this.f156574b = null;
    }
}
