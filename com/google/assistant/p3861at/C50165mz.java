package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mz */
/* compiled from: PG */
public final class C50165mz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50165mz f130411c;

    /* renamed from: d */
    private static volatile C63010eb f130412d;

    /* renamed from: a */
    public int f130413a;

    /* renamed from: b */
    public C50163mx f130414b;

    static {
        C50165mz mzVar = new C50165mz();
        f130411c = mzVar;
        C62942bv.registerDefaultInstance(C50165mz.class, mzVar);
    }

    private C50165mz() {
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
                return newMessageInfo(f130411c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50165mz();
            case 4:
                return new C50164my();
            case 5:
                return f130411c;
            case 6:
                C63010eb ebVar = f130412d;
                if (ebVar == null) {
                    synchronized (C50165mz.class) {
                        ebVar = f130412d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130411c);
                            f130412d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
