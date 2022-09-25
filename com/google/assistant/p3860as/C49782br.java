package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.br */
/* compiled from: PG */
public final class C49782br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49782br f128547c;

    /* renamed from: e */
    private static volatile C63010eb f128548e;

    /* renamed from: a */
    public int f128549a;

    /* renamed from: b */
    public double f128550b;

    /* renamed from: d */
    private int f128551d;

    static {
        C49782br brVar = new C49782br();
        f128547c = brVar;
        C62942bv.registerDefaultInstance(C49782br.class, brVar);
    }

    private C49782br() {
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
                return newMessageInfo(f128547c, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003က\u0003\u0005င\u0000", new Object[]{"d", "b", "a"});
            case 3:
                return new C49782br();
            case 4:
                return new C49781bq();
            case 5:
                return f128547c;
            case 6:
                C63010eb ebVar = f128548e;
                if (ebVar == null) {
                    synchronized (C49782br.class) {
                        ebVar = f128548e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128547c);
                            f128548e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
