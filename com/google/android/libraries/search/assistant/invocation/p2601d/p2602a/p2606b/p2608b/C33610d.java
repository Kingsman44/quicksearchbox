package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.d */
/* compiled from: PG */
public final class C33610d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33610d f89827b;

    /* renamed from: d */
    private static volatile C63010eb f89828d;

    /* renamed from: a */
    public C34053bp f89829a;

    /* renamed from: c */
    private byte f89830c = 2;

    static {
        C33610d dVar = new C33610d();
        f89827b = dVar;
        C62942bv.registerDefaultInstance(C33610d.class, dVar);
    }

    private C33610d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f89830c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f89830c = b;
                return null;
            case 2:
                return newMessageInfo(f89827b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C33610d();
            case 4:
                return new C33609c();
            case 5:
                return f89827b;
            case 6:
                C63010eb ebVar = f89828d;
                if (ebVar == null) {
                    synchronized (C33610d.class) {
                        ebVar = f89828d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89827b);
                            f89828d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
