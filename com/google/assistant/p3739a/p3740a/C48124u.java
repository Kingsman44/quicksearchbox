package com.google.assistant.p3739a.p3740a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.u */
/* compiled from: PG */
public final class C48124u extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48124u f124543f;

    /* renamed from: g */
    private static volatile C63010eb f124544g;

    /* renamed from: a */
    public int f124545a;

    /* renamed from: b */
    public int f124546b = 0;

    /* renamed from: c */
    public Object f124547c;

    /* renamed from: d */
    public int f124548d;

    /* renamed from: e */
    public C48063ax f124549e;

    static {
        C48124u uVar = new C48124u();
        f124543f = uVar;
        C62942bv.registerDefaultInstance(C48124u.class, uVar);
    }

    private C48124u() {
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
                return newMessageInfo(f124543f, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u0004\u0006<\u0000\u0007ဉ\u0000", new Object[]{C45240c.f118157a, "b", "a", C48074bh.class, C48076bj.class, C48092bz.class, C48119p.class, "d", C48126w.class, "e"});
            case 3:
                return new C48124u();
            case 4:
                return new C48123t();
            case 5:
                return f124543f;
            case 6:
                C63010eb ebVar = f124544g;
                if (ebVar == null) {
                    synchronized (C48124u.class) {
                        ebVar = f124544g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124543f);
                            f124544g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
