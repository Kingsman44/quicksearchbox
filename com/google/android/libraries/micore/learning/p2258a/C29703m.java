package com.google.android.libraries.micore.learning.p2258a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.micore.learning.a.m */
/* compiled from: PG */
public final class C29703m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C29703m f80444c;

    /* renamed from: d */
    private static volatile C63010eb f80445d;

    /* renamed from: a */
    public int f80446a;

    /* renamed from: b */
    public C62910ar f80447b;

    static {
        C29703m mVar = new C29703m();
        f80444c = mVar;
        C62942bv.registerDefaultInstance(C29703m.class, mVar);
    }

    private C29703m() {
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
                return newMessageInfo(f80444c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C29703m();
            case 4:
                return new C29701k();
            case 5:
                return f80444c;
            case 6:
                C63010eb ebVar = f80445d;
                if (ebVar == null) {
                    synchronized (C29703m.class) {
                        ebVar = f80445d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80444c);
                            f80445d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
