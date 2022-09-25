package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.f.c.m */
/* compiled from: PG */
public final class C17317m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17317m f50147c;

    /* renamed from: d */
    private static volatile C63010eb f50148d;

    /* renamed from: a */
    public int f50149a = 0;

    /* renamed from: b */
    public Object f50150b;

    static {
        C17317m mVar = new C17317m();
        f50147c = mVar;
        C62942bv.registerDefaultInstance(C17317m.class, mVar);
    }

    private C17317m() {
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
                return newMessageInfo(f50147c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", C17319o.class});
            case 3:
                return new C17317m();
            case 4:
                return new C17316l();
            case 5:
                return f50147c;
            case 6:
                C63010eb ebVar = f50148d;
                if (ebVar == null) {
                    synchronized (C17317m.class) {
                        ebVar = f50148d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50147c);
                            f50148d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
