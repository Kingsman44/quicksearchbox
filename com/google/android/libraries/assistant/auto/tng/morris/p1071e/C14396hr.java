package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hr */
/* compiled from: PG */
public final class C14396hr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14396hr f43557b;

    /* renamed from: c */
    private static volatile C63010eb f43558c;

    /* renamed from: a */
    public int f43559a;

    static {
        C14396hr hrVar = new C14396hr();
        f43557b = hrVar;
        C62942bv.registerDefaultInstance(C14396hr.class, hrVar);
    }

    private C14396hr() {
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
                return newMessageInfo(f43557b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14396hr();
            case 4:
                return new C14395hq();
            case 5:
                return f43557b;
            case 6:
                C63010eb ebVar = f43558c;
                if (ebVar == null) {
                    synchronized (C14396hr.class) {
                        ebVar = f43558c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43557b);
                            f43558c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
