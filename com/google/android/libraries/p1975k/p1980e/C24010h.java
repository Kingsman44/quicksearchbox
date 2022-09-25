package com.google.android.libraries.p1975k.p1980e;

import com.google.android.libraries.p1975k.C23977a;
import com.google.android.libraries.p1975k.C23995c;
import com.google.android.libraries.p1975k.C24018k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62947c;
import com.google.protos.p4972d.p4983c.C64641j;
import com.google.protos.p5066i.p5067a.C65471b;
import com.google.protos.p5066i.p5067a.C65472c;
import com.google.protos.p5066i.p5067a.C65473d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5304e.p5305a.p5306a.p5390n.p5395c.p5396a.C68841a;
import p5304e.p5305a.p5306a.p5390n.p5395c.p5396a.C68844d;

/* renamed from: com.google.android.libraries.k.e.h */
/* compiled from: PG */
public final class C24010h {

    /* renamed from: a */
    private final C24003a f65617a;

    /* renamed from: b */
    private final Map f65618b;

    /* renamed from: c */
    private final C24007e f65619c;

    /* renamed from: d */
    private final C23995c f65620d;

    /* renamed from: e */
    private final int f65621e;

    /* renamed from: f */
    private final int f65622f;

    /* renamed from: g */
    private final int f65623g;

    /* renamed from: h */
    private final ArrayDeque f65624h;

    public C24010h(C24003a aVar, Map map, C24007e eVar, C23995c cVar, int i, int i2, int i3, ArrayDeque arrayDeque) {
        this.f65617a = aVar;
        this.f65618b = map;
        this.f65619c = eVar;
        this.f65620d = cVar;
        this.f65621e = i;
        this.f65622f = i2;
        this.f65623g = i3;
        this.f65624h = arrayDeque;
    }

    /* renamed from: a */
    public final void mo29413a(C65472c cVar) {
        int a;
        int i = 2;
        if ((((C65473d) cVar.instance).f177965a & 64) == 0) {
            cVar.copyOnWrite();
            C65473d dVar = (C65473d) cVar.instance;
            dVar.f177972h = C65471b.m96686a(2);
            dVar.f177965a |= 64;
        }
        StringWriter stringWriter = new StringWriter();
        ((Throwable) ((C23977a) this.f65620d).f65578c.mo56109e(new Throwable())).printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int length = stringWriter2.length();
        C68844d.f185049a.mo6453a();
        long b = C68841a.f185038a.mo6453a().mo60636b();
        if (b < ((long) length) && b >= 0) {
            length = (int) b;
        }
        boolean z = false;
        String substring = stringWriter2.substring(0, length);
        cVar.copyOnWrite();
        C65473d dVar2 = (C65473d) cVar.instance;
        substring.getClass();
        dVar2.f177965a |= 2048;
        dVar2.f177976l = substring;
        C65473d dVar3 = (C65473d) cVar.build();
        C68844d.f185049a.mo6453a();
        if (!C68841a.f185038a.mo6453a().mo60641g()) {
            int b2 = C65471b.m96687b(dVar3.f177972h);
            if (b2 == 0) {
                b2 = 2;
            }
            if (C65471b.m96686a(b2) == 6) {
                return;
            }
        }
        C68844d.f185049a.mo6453a();
        if (C68841a.f185038a.mo6453a().mo60642h() || (a = C64641j.m96422a(dVar3.f177973i)) == 0 || a != 4) {
            Long valueOf = Long.valueOf(dVar3.f177968d);
            int b3 = C65471b.m96687b(dVar3.f177972h);
            if (b3 != 0) {
                i = b3;
            }
            C24004b bVar = new C24004b(valueOf, i);
            C68844d.f185049a.mo6453a();
            long a2 = C68841a.f185038a.mo6453a().mo60635a();
            synchronized (this.f65618b) {
                Long l = (Long) this.f65618b.get(bVar);
                long currentTimeMillis = System.currentTimeMillis();
                if (l == null || a2 <= 0 || l.longValue() + a2 < currentTimeMillis) {
                    z = true;
                }
                if (z) {
                    this.f65618b.put(bVar, Long.valueOf(currentTimeMillis));
                }
            }
            if (z) {
                this.f65619c.mo29410a(dVar3);
            }
        }
    }

    /* renamed from: b */
    public final C65472c mo29414b(int i) {
        C65472c cVar = (C65472c) C65473d.f177963m.createBuilder();
        String packageName = ((C23977a) this.f65620d).f65576a.getPackageName();
        cVar.copyOnWrite();
        C65473d dVar = (C65473d) cVar.instance;
        packageName.getClass();
        dVar.f177965a |= 1;
        dVar.f177966b = packageName;
        int a = this.f65617a.mo29404a(((C23977a) this.f65620d).f65576a);
        cVar.copyOnWrite();
        C65473d dVar2 = (C65473d) cVar.instance;
        dVar2.f177965a |= 2;
        dVar2.f177967c = a;
        int i2 = this.f65621e;
        cVar.copyOnWrite();
        C65473d dVar3 = (C65473d) cVar.instance;
        dVar3.f177965a |= 4;
        dVar3.f177968d = (long) i2;
        int i3 = this.f65622f;
        cVar.copyOnWrite();
        C65473d dVar4 = (C65473d) cVar.instance;
        dVar4.f177965a |= 8;
        dVar4.f177969e = (long) i3;
        int i4 = this.f65623g;
        cVar.copyOnWrite();
        C65473d dVar5 = (C65473d) cVar.instance;
        dVar5.f177965a |= 16;
        dVar5.f177970f = (long) i4;
        C58480gp e = C58485gu.m89837e();
        Iterator descendingIterator = this.f65624h.descendingIterator();
        while (descendingIterator.hasNext()) {
            e.mo55395g(Long.valueOf((long) ((C24018k) descendingIterator.next()).f65644e));
        }
        C58485gu f = e.mo55394f();
        cVar.copyOnWrite();
        C65473d dVar6 = (C65473d) cVar.instance;
        dVar6.mo59379a();
        C62947c.addAll((Iterable) f, (List) dVar6.f177975k);
        cVar.copyOnWrite();
        C65473d dVar7 = (C65473d) cVar.instance;
        dVar7.f177972h = C65471b.m96686a(i);
        dVar7.f177965a |= 64;
        return cVar;
    }
}
