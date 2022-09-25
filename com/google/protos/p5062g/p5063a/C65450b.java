package com.google.protos.p5062g.p5063a;

import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4140ba.p4147b.p4148a.p4149a.C54937b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.g.a.b */
/* compiled from: PG */
public final class C65450b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65450b f177913c;

    /* renamed from: f */
    private static volatile C63010eb f177914f;

    /* renamed from: a */
    public int f177915a;

    /* renamed from: b */
    public C54937b f177916b;

    /* renamed from: d */
    private C61752n f177917d;

    /* renamed from: e */
    private byte f177918e = 2;

    static {
        C65450b bVar = new C65450b();
        f177913c = bVar;
        C62942bv.registerDefaultInstance(C65450b.class, bVar);
    }

    private C65450b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177918e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177918e = b;
                return null;
            case 2:
                return newMessageInfo(f177913c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", "d"});
            case 3:
                return new C65450b();
            case 4:
                return new C65449a();
            case 5:
                return f177913c;
            case 6:
                C63010eb ebVar = f177914f;
                if (ebVar == null) {
                    synchronized (C65450b.class) {
                        ebVar = f177914f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177913c);
                            f177914f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
