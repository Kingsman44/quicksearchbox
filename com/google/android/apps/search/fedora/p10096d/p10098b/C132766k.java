package com.google.android.apps.search.fedora.p10096d.p10098b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.d.b.k */
/* compiled from: PG */
public final class C132766k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132766k f362213c;

    /* renamed from: d */
    private static volatile C63010eb f362214d;

    /* renamed from: a */
    public int f362215a;

    /* renamed from: b */
    public boolean f362216b;

    static {
        C132766k kVar = new C132766k();
        f362213c = kVar;
        C62942bv.registerDefaultInstance(C132766k.class, kVar);
    }

    private C132766k() {
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
                return newMessageInfo(f362213c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C132766k();
            case 4:
                return new C132765j();
            case 5:
                return f362213c;
            case 6:
                C63010eb ebVar = f362214d;
                if (ebVar == null) {
                    synchronized (C132766k.class) {
                        ebVar = f362214d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362213c);
                            f362214d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
