package com.google.android.libraries.search.p2904c.p2942m.p2948e;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37623gb;
import com.google.android.libraries.search.p2904c.C37825m;
import com.google.android.libraries.search.p2904c.C37898n;
import com.google.android.libraries.search.p2904c.C37903o;
import com.google.android.libraries.search.p2904c.C37956r;
import com.google.android.libraries.search.p2904c.C37967s;
import com.google.android.libraries.search.p2904c.C38112u;
import com.google.android.libraries.search.p2904c.C38119v;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.m.e.a */
/* compiled from: PG */
public final class C37887a {

    /* renamed from: a */
    private static final C59071e f100463a = C59071e.m91331h();

    /* renamed from: b */
    private final int f100464b;

    /* renamed from: c */
    private final int f100465c;

    /* renamed from: d */
    private final AtomicReference f100466d;

    public C37887a(C37360ay ayVar) {
        C69664n.m101061g(ayVar, "audioLibInputParams");
        this.f100464b = C37329d.m66333a(ayVar.f99230e) * Integer.bitCount(ayVar.f99229d);
        this.f100465c = 1000000000 / ayVar.f99228c;
        C37825m mVar = (C37825m) C38119v.f100992c.createBuilder();
        C69664n.m101060f(mVar, "newBuilder()");
        C37623gb a = C69664n.m101061g(mVar, "builder");
        C37898n nVar = (C37898n) C37903o.f100481a.createBuilder();
        C69664n.m101060f(nVar, "newBuilder()");
        a.mo41036b(C69664n.m101061g(nVar, "builder").mo41037a());
        this.f100466d = new AtomicReference(a.mo41035a());
    }

    /* renamed from: a */
    public final C38119v mo41127a(long j, long j2) {
        if (j2 < j) {
            C59052c cVar = (C59052c) f100463a.mo56226d();
            cVar.mo56379ah(new C59094n(52853));
            cVar.mo56350C("#audio# getTimestampForByteRange called with invalid range [%d, %d]", j, j2);
            C37825m mVar = (C37825m) C38119v.f100992c.createBuilder();
            C69664n.m101060f(mVar, "newBuilder()");
            C37623gb a = C69664n.m101061g(mVar, "builder");
            C37898n nVar = (C37898n) C37903o.f100481a.createBuilder();
            C69664n.m101060f(nVar, "newBuilder()");
            a.mo41036b(C69664n.m101061g(nVar, "builder").mo41037a());
            return a.mo41035a();
        }
        C38119v vVar = (C38119v) this.f100466d.get();
        if (vVar.f100994a == 1) {
            long j3 = (long) this.f100464b;
            long j4 = j / j3;
            long j5 = j2 / j3;
            C37967s sVar = (C37967s) vVar.f100995b;
            long j6 = sVar.f100596c;
            if (j4 > j6 || j6 > j5) {
                C69664n.m101060f(sVar, "referenceTimestamp.timestamp");
                long j7 = sVar.f100596c;
                long j8 = sVar.f100595b;
                int i = this.f100465c;
                C37825m mVar2 = (C37825m) C38119v.f100992c.createBuilder();
                C69664n.m101060f(mVar2, "newBuilder()");
                C37623gb a2 = C69664n.m101061g(mVar2, "builder");
                C37956r rVar = (C37956r) C37967s.f100592e.createBuilder();
                C69664n.m101060f(rVar, "newBuilder()");
                C69664n.m101061g(rVar, "builder");
                rVar.copyOnWrite();
                C37967s sVar2 = (C37967s) rVar.instance;
                sVar2.f100594a |= 2;
                sVar2.f100596c = j4;
                rVar.copyOnWrite();
                C37967s sVar3 = (C37967s) rVar.instance;
                sVar3.f100594a |= 1;
                sVar3.f100595b = j8 + ((j4 - j7) * ((long) i));
                C38112u uVar = C38112u.EXTRAPOLATED_TIMESTAMP;
                C69664n.m101061g(uVar, "value");
                rVar.copyOnWrite();
                C37967s sVar4 = (C37967s) rVar.instance;
                sVar4.f100597d = uVar.f100989d;
                sVar4.f100594a |= 4;
                C62942bv build = rVar.build();
                C69664n.m101060f(build, "_builder.build()");
                C37967s sVar5 = (C37967s) build;
                C69664n.m101061g(sVar5, "value");
                C37825m mVar3 = a2.f99976a;
                mVar3.copyOnWrite();
                C38119v vVar2 = (C38119v) mVar3.instance;
                sVar5.getClass();
                vVar2.f100995b = sVar5;
                vVar2.f100994a = 1;
                return a2.mo41035a();
            }
            C69664n.m101060f(vVar, "referenceTimestamp");
            return vVar;
        }
        C69664n.m101060f(vVar, "referenceTimestamp");
        return vVar;
    }

    /* renamed from: b */
    public final void mo41128b(C38119v vVar) {
        C69664n.m101061g(vVar, "audioTimestamp");
        this.f100466d.set(vVar);
    }
}
