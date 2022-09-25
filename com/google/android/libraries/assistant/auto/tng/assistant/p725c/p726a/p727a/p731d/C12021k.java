package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.d.k */
/* compiled from: PG */
public final class C12021k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12021k f38547c;

    /* renamed from: d */
    private static volatile C63010eb f38548d;

    /* renamed from: a */
    public int f38549a;

    /* renamed from: b */
    public int f38550b;

    static {
        C12021k kVar = new C12021k();
        f38547c = kVar;
        C62942bv.registerDefaultInstance(C12021k.class, kVar);
    }

    private C12021k() {
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
                return newMessageInfo(f38547c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C12018h.f38546a});
            case 3:
                return new C12021k();
            case 4:
                return new C12020j();
            case 5:
                return f38547c;
            case 6:
                C63010eb ebVar = f38548d;
                if (ebVar == null) {
                    synchronized (C12021k.class) {
                        ebVar = f38548d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38547c);
                            f38548d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
