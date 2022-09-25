package com.google.android.libraries.search.assistant.p2704m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.m.m */
/* compiled from: PG */
public final class C34818m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34818m f92354c;

    /* renamed from: d */
    private static volatile C63010eb f92355d;

    /* renamed from: a */
    public int f92356a;

    /* renamed from: b */
    public int f92357b;

    static {
        C34818m mVar = new C34818m();
        f92354c = mVar;
        C62942bv.registerDefaultInstance(C34818m.class, mVar);
    }

    private C34818m() {
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
                return newMessageInfo(f92354c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C34807b.m63567b()});
            case 3:
                return new C34818m();
            case 4:
                return new C34817l();
            case 5:
                return f92354c;
            case 6:
                C63010eb ebVar = f92355d;
                if (ebVar == null) {
                    synchronized (C34818m.class) {
                        ebVar = f92355d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92354c);
                            f92355d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
