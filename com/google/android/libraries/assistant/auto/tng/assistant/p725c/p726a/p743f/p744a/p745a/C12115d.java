package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.a.a.d */
/* compiled from: PG */
public final class C12115d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12115d f38733c;

    /* renamed from: d */
    private static volatile C63010eb f38734d;

    /* renamed from: a */
    public int f38735a;

    /* renamed from: b */
    public C63088z f38736b = C63088z.f170246b;

    static {
        C12115d dVar = new C12115d();
        f38733c = dVar;
        C62942bv.registerDefaultInstance(C12115d.class, dVar);
    }

    private C12115d() {
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
                return newMessageInfo(f38733c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C12115d();
            case 4:
                return new C12114c();
            case 5:
                return f38733c;
            case 6:
                C63010eb ebVar = f38734d;
                if (ebVar == null) {
                    synchronized (C12115d.class) {
                        ebVar = f38734d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38733c);
                            f38734d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
