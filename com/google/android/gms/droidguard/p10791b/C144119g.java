package com.google.android.gms.droidguard.p10791b;

import com.google.android.gms.common.util.C144006f;
import com.google.p4658k.p4659a.p4660a.C61727c;
import com.google.p4658k.p4659a.p4660a.C61728d;
import com.google.p4658k.p4659a.p4660a.C61730f;
import com.google.p4658k.p4659a.p4660a.C61731g;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.droidguard.b.g */
/* compiled from: PG */
public final class C144119g implements C144116d {

    /* renamed from: a */
    private final C144118f f390398a;

    /* renamed from: b */
    private final C61727c f390399b;

    /* renamed from: c */
    private long f390400c;

    /* renamed from: d */
    private final C144006f f390401d;

    public C144119g(C144118f fVar, C144006f fVar2) {
        this.f390398a = fVar;
        this.f390401d = fVar2;
        this.f390399b = (C61727c) C61731g.f166772b.createBuilder();
        this.f390400c = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C144116d mo119663a() {
        return new C144119g(this);
    }

    /* renamed from: b */
    public final C61731g mo119664b() {
        return (C61731g) this.f390399b.build();
    }

    /* renamed from: c */
    public final void mo119665c(int i, C144118f fVar) {
        if (fVar == C144118f.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        } else if (fVar.compareTo(this.f390398a) <= 0) {
            C61728d dVar = (C61728d) C61730f.f166767d.createBuilder();
            dVar.copyOnWrite();
            C61730f fVar2 = (C61730f) dVar.instance;
            fVar2.f166770b = i - 1;
            fVar2.f166769a |= 1;
            long nanoTime = System.nanoTime();
            if (this.f390400c >= 0) {
                long millis = TimeUnit.NANOSECONDS.toMillis(nanoTime - this.f390400c);
                dVar.copyOnWrite();
                C61730f fVar3 = (C61730f) dVar.instance;
                fVar3.f166769a |= 2;
                fVar3.f166771c = millis;
            }
            this.f390400c = nanoTime;
            C61727c cVar = this.f390399b;
            cVar.copyOnWrite();
            C61731g gVar = (C61731g) cVar.instance;
            C61730f fVar4 = (C61730f) dVar.build();
            C61731g gVar2 = C61731g.f166772b;
            fVar4.getClass();
            C62971cq cqVar = gVar.f166774a;
            if (!cqVar.mo58948c()) {
                gVar.f166774a = C62942bv.mutableCopy(cqVar);
            }
            gVar.f166774a.add(fVar4);
        }
    }

    public final /* synthetic */ Object clone() {
        return new C144119g(this);
    }

    private C144119g(C144119g gVar) {
        this.f390398a = gVar.f390398a;
        this.f390401d = gVar.f390401d;
        this.f390399b = (C61727c) gVar.f390399b.clone();
        this.f390400c = gVar.f390400c;
    }
}
