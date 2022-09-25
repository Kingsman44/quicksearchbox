package com.google.android.libraries.search.assistant.p2828y.p2854o;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4433bz.p4434a.p4435a.p4436a.C57893d;
import com.google.p4433bz.p4434a.p4435a.p4436a.C57895f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.NoSuchElementException;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.libraries.search.assistant.y.o.m */
/* compiled from: PG */
final class C37051m {

    /* renamed from: a */
    public final C37047i f96530a;

    public C37051m(C37047i iVar) {
        this.f96530a = iVar;
    }

    /* renamed from: a */
    public static C37050l m65771a(C65768az azVar) {
        C63070h hVar = azVar.f178799e;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        C63088z zVar = hVar.f170218b;
        C62921ba a = C62921ba.m95368a();
        return new C37050l(azVar.f178798d, (C57895f) C62942bv.parseFrom((C62942bv) C57895f.f154863b, zVar, a));
    }

    /* renamed from: b */
    public final C58485gu mo40594b(C37050l lVar, String str) {
        C58485gu a = lVar.mo40591a(C37054p.m65785g(str, BuildConfig.FLAVOR));
        C58480gp e = C58485gu.m89837e();
        int size = a.size();
        int i = 0;
        while (i < size) {
            try {
                String str2 = ((C57893d) a.get(i)).f154858d;
                C65033ar a2 = this.f96530a.mo40589a(str2);
                if (!a2.f176113a.isEmpty()) {
                    e.mo55395g(m65771a((C65768az) a2.f176113a.get(0)));
                    i++;
                } else {
                    throw new NoSuchElementException("Attempted to read non-existent mid ".concat(String.valueOf(str2)));
                }
            } catch (C62974ct | NoSuchElementException e2) {
                throw new IllegalStateException(e2);
            }
        }
        return e.mo55394f();
    }

    /* renamed from: c */
    public final Optional mo40595c() {
        C65033ar a = this.f96530a.mo40589a("/t/264trdfqc8605");
        if (a.f176113a.isEmpty()) {
            return Optional.empty();
        }
        try {
            return Optional.m71637of(m65771a((C65768az) a.f176113a.get(0)));
        } catch (C62974ct e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public final OptionalLong mo40596d() {
        C65033ar a = this.f96530a.mo40589a("/t/264trdfqc8605");
        if (a.f176113a.isEmpty()) {
            return OptionalLong.empty();
        }
        C65139d dVar = ((C65768az) a.f176113a.get(0)).f178796b;
        if (dVar == null) {
            dVar = C65139d.f176307e;
        }
        return OptionalLong.m71641of(dVar.f176310b);
    }
}
