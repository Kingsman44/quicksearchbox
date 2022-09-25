package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.b.n */
/* compiled from: PG */
public final class C13052n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13052n f40515d;

    /* renamed from: f */
    private static volatile C63010eb f40516f;

    /* renamed from: a */
    public int f40517a;

    /* renamed from: b */
    public int f40518b;

    /* renamed from: c */
    public C12986d f40519c;

    /* renamed from: e */
    private byte f40520e = 2;

    static {
        C13052n nVar = new C13052n();
        f40515d = nVar;
        C62942bv.registerDefaultInstance(C13052n.class, nVar);
    }

    private C13052n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40520e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40520e = b;
                return null;
            case 2:
                return newMessageInfo(f40515d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C13054p.m29248b(), C45240c.f118157a});
            case 3:
                return new C13052n();
            case 4:
                return new C13051m();
            case 5:
                return f40515d;
            case 6:
                C63010eb ebVar = f40516f;
                if (ebVar == null) {
                    synchronized (C13052n.class) {
                        ebVar = f40516f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40515d);
                            f40516f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
