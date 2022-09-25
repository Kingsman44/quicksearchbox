package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.k */
/* compiled from: PG */
public final class C33683k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33683k f89998b;

    /* renamed from: d */
    private static volatile C63010eb f89999d;

    /* renamed from: a */
    public C34053bp f90000a;

    /* renamed from: c */
    private byte f90001c = 2;

    static {
        C33683k kVar = new C33683k();
        f89998b = kVar;
        C62942bv.registerDefaultInstance(C33683k.class, kVar);
    }

    private C33683k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90001c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f90001c = b;
                return null;
            case 2:
                return newMessageInfo(f89998b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C33683k();
            case 4:
                return new C33682j();
            case 5:
                return f89998b;
            case 6:
                C63010eb ebVar = f89999d;
                if (ebVar == null) {
                    synchronized (C33683k.class) {
                        ebVar = f89999d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89998b);
                            f89999d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
