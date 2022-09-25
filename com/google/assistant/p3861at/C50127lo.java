package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.lo */
/* compiled from: PG */
public final class C50127lo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50127lo f130312c;

    /* renamed from: e */
    private static volatile C63010eb f130313e;

    /* renamed from: a */
    public boolean f130314a;

    /* renamed from: b */
    public boolean f130315b;

    /* renamed from: d */
    private int f130316d;

    static {
        C50127lo loVar = new C50127lo();
        f130312c = loVar;
        C62942bv.registerDefaultInstance(C50127lo.class, loVar);
    }

    private C50127lo() {
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
                return newMessageInfo(f130312c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C50127lo();
            case 4:
                return new C50126ln();
            case 5:
                return f130312c;
            case 6:
                C63010eb ebVar = f130313e;
                if (ebVar == null) {
                    synchronized (C50127lo.class) {
                        ebVar = f130313e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130312c);
                            f130313e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
