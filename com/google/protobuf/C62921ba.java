package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.ba */
/* compiled from: PG */
public class C62921ba {

    /* renamed from: a */
    public static final C62921ba f169869a = new C62921ba((byte[]) null);

    /* renamed from: b */
    private static volatile boolean f169870b = false;

    /* renamed from: c */
    private static volatile C62921ba f169871c;

    /* renamed from: d */
    private final Map f169872d;

    public C62921ba() {
        this.f169872d = new HashMap();
    }

    /* renamed from: b */
    public C62921ba mo58829b() {
        return new C62921ba(this);
    }

    /* renamed from: c */
    public C62940bt mo58830c(MessageLite messageLite, int i) {
        return (C62940bt) this.f169872d.get(new C62918az(messageLite, i));
    }

    /* renamed from: d */
    public final void mo58831d(C62917ay ayVar) {
        if (C62940bt.class.isAssignableFrom(ayVar.getClass())) {
            mo58832e((C62940bt) ayVar);
        }
    }

    /* renamed from: e */
    public final void mo58832e(C62940bt btVar) {
        this.f169872d.put(new C62918az(btVar.f169968a, btVar.f169971d.f169964b), btVar);
    }

    public C62921ba(C62921ba baVar) {
        if (baVar == f169869a) {
            this.f169872d = Collections.emptyMap();
        } else {
            this.f169872d = Collections.unmodifiableMap(baVar.f169872d);
        }
    }

    /* renamed from: a */
    public static C62921ba m95368a() {
        C62921ba baVar = f169871c;
        if (baVar != null) {
            return baVar;
        }
        synchronized (C62921ba.class) {
            C62921ba baVar2 = f169871c;
            if (baVar2 != null) {
                return baVar2;
            }
            C62921ba b = C62932bl.m95423b(C62921ba.class);
            f169871c = b;
            return b;
        }
    }

    public C62921ba(byte[] bArr) {
        this.f169872d = Collections.emptyMap();
    }
}
