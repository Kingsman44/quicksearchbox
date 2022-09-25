package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xj */
/* compiled from: PG */
public final class C7416xj implements C7286so {

    /* renamed from: a */
    public final long f24295a;

    /* renamed from: b */
    public final long f24296b;

    /* renamed from: c */
    public final long f24297c;

    /* renamed from: d */
    public final boolean f24298d;

    /* renamed from: e */
    public final long f24299e;

    /* renamed from: f */
    public final long f24300f;

    /* renamed from: g */
    public final long f24301g;

    /* renamed from: h */
    public final long f24302h;

    /* renamed from: i */
    public final C7437yd f24303i;

    /* renamed from: j */
    public final C7434ya f24304j;

    /* renamed from: k */
    public final Uri f24305k;

    /* renamed from: l */
    public final C7422xp f24306l;

    /* renamed from: m */
    private final List f24307m;

    public C7416xj(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C7422xp xpVar, C7437yd ydVar, C7434ya yaVar, Uri uri, List list) {
        this.f24295a = j;
        this.f24296b = j2;
        this.f24297c = j3;
        this.f24298d = z;
        this.f24299e = j4;
        this.f24300f = j5;
        this.f24301g = j6;
        this.f24302h = j7;
        this.f24306l = xpVar;
        this.f24303i = ydVar;
        this.f24305k = uri;
        this.f24304j = yaVar;
        this.f24307m = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16457a(List list) {
        C7416xj xjVar = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C7289sr());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        long j = 0;
        while (i < mo16761b()) {
            if (((C7289sr) linkedList.peek()).f23760a != i) {
                long d = xjVar.mo16763d(i);
                if (d != -9223372036854775807L) {
                    j += d;
                }
            } else {
                C7421xo c = xjVar.mo16762c(i);
                List list2 = c.f24329c;
                C7289sr srVar = (C7289sr) linkedList.poll();
                int i2 = srVar.f23760a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = srVar.f23761b;
                    C7415xi xiVar = (C7415xi) list2.get(i3);
                    List list3 = xiVar.f24291c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((C7426xt) list3.get(srVar.f23762c));
                        srVar = (C7289sr) linkedList.poll();
                        if (!(srVar.f23760a == i2 && srVar.f23761b == i3)) {
                            List list4 = list2;
                            arrayList2.add(new C7415xi(xiVar.f24289a, xiVar.f24290b, arrayList3, xiVar.f24292d, xiVar.f24293e, xiVar.f24294f));
                        }
                        arrayList3.add((C7426xt) list3.get(srVar.f23762c));
                        srVar = (C7289sr) linkedList.poll();
                        break;
                    } while (srVar.f23761b == i3);
                    List list42 = list2;
                    arrayList2.add(new C7415xi(xiVar.f24289a, xiVar.f24290b, arrayList3, xiVar.f24292d, xiVar.f24293e, xiVar.f24294f));
                    if (srVar.f23760a != i2) {
                        break;
                    }
                    list2 = list42;
                }
                linkedList.addFirst(srVar);
                arrayList.add(new C7421xo(c.f24327a, c.f24328b - j, arrayList2, c.f24330d));
            }
            i++;
            xjVar = this;
        }
        long j2 = xjVar.f24296b;
        return new C7416xj(xjVar.f24295a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, xjVar.f24297c, xjVar.f24298d, xjVar.f24299e, xjVar.f24300f, xjVar.f24301g, xjVar.f24302h, xjVar.f24306l, xjVar.f24303i, xjVar.f24304j, xjVar.f24305k, arrayList);
    }

    /* renamed from: b */
    public final int mo16761b() {
        return this.f24307m.size();
    }

    /* renamed from: c */
    public final C7421xo mo16762c(int i) {
        return (C7421xo) this.f24307m.get(i);
    }

    /* renamed from: d */
    public final long mo16763d(int i) {
        if (i != this.f24307m.size() - 1) {
            return ((C7421xo) this.f24307m.get(i + 1)).f24328b - ((C7421xo) this.f24307m.get(i)).f24328b;
        }
        long j = this.f24296b;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - ((C7421xo) this.f24307m.get(i)).f24328b;
    }

    /* renamed from: e */
    public final long mo16764e(int i) {
        return C6821bi.m19755b(mo16763d(i));
    }
}
