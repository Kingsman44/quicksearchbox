package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.a.a.bq */
/* compiled from: PG */
public final class C48083bq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48083bq f124441b;

    /* renamed from: c */
    private static volatile C63010eb f124442c;

    /* renamed from: a */
    public C63088z f124443a = C63088z.f170246b;

    static {
        C48083bq bqVar = new C48083bq();
        f124441b = bqVar;
        C62942bv.registerDefaultInstance(C48083bq.class, bqVar);
    }

    private C48083bq() {
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
                return newMessageInfo(f124441b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"a"});
            case 3:
                return new C48083bq();
            case 4:
                return new C48082bp();
            case 5:
                return f124441b;
            case 6:
                C63010eb ebVar = f124442c;
                if (ebVar == null) {
                    synchronized (C48083bq.class) {
                        ebVar = f124442c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124441b);
                            f124442c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
