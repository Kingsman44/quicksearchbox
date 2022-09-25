package com.google.assistant.p3950h.p3951a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.h.a.b */
/* compiled from: PG */
public final class C52963b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52963b f138860b;

    /* renamed from: d */
    private static volatile C63010eb f138861d;

    /* renamed from: a */
    public boolean f138862a;

    /* renamed from: c */
    private int f138863c;

    static {
        C52963b bVar = new C52963b();
        f138860b = bVar;
        C62942bv.registerDefaultInstance(C52963b.class, bVar);
    }

    private C52963b() {
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
                return newMessageInfo(f138860b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52963b();
            case 4:
                return new C52962a();
            case 5:
                return f138860b;
            case 6:
                C63010eb ebVar = f138861d;
                if (ebVar == null) {
                    synchronized (C52963b.class) {
                        ebVar = f138861d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138860b);
                            f138861d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
