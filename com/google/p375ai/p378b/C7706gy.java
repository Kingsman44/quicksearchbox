package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.gy */
/* compiled from: PG */
public final class C7706gy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7706gy f26889c;

    /* renamed from: e */
    private static volatile C63010eb f26890e;

    /* renamed from: a */
    public C62964ck f26891a = emptyLongList();

    /* renamed from: b */
    public int f26892b;

    /* renamed from: d */
    private int f26893d;

    static {
        C7706gy gyVar = new C7706gy();
        f26889c = gyVar;
        C62942bv.registerDefaultInstance(C7706gy.class, gyVar);
    }

    private C7706gy() {
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
                return newMessageInfo(f26889c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0014\u0002င\u0000", new Object[]{"d", "a", "b"});
            case 3:
                return new C7706gy();
            case 4:
                return new C7705gx();
            case 5:
                return f26889c;
            case 6:
                C63010eb ebVar = f26890e;
                if (ebVar == null) {
                    synchronized (C7706gy.class) {
                        ebVar = f26890e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26889c);
                            f26890e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
