package com.google.audio.p4107b.p4108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.b.a.b */
/* compiled from: PG */
public final class C54579b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54579b f143300b;

    /* renamed from: c */
    private static volatile C63010eb f143301c;

    /* renamed from: a */
    public C62960cg f143302a = emptyFloatList();

    static {
        C54579b bVar = new C54579b();
        f143300b = bVar;
        C62942bv.registerDefaultInstance(C54579b.class, bVar);
    }

    private C54579b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f143300b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new C54579b();
            case 4:
                return new C54578a();
            case 5:
                return f143300b;
            case 6:
                C63010eb ebVar = f143301c;
                if (ebVar == null) {
                    synchronized (C54579b.class) {
                        ebVar = f143301c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143300b);
                            f143301c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
