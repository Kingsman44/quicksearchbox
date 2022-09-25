package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.t */
/* compiled from: PG */
public final class C14630t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14630t f44214b;

    /* renamed from: c */
    private static volatile C63010eb f44215c;

    /* renamed from: a */
    public C14634x f44216a;

    static {
        C14630t tVar = new C14630t();
        f44214b = tVar;
        C62942bv.registerDefaultInstance(C14630t.class, tVar);
    }

    private C14630t() {
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
                return newMessageInfo(f44214b, "\u0000\u0001\u0000\u0000\u000b\u000b\u0001\u0000\u0000\u0000\u000b\t", new Object[]{"a"});
            case 3:
                return new C14630t();
            case 4:
                return new C14629s();
            case 5:
                return f44214b;
            case 6:
                C63010eb ebVar = f44215c;
                if (ebVar == null) {
                    synchronized (C14630t.class) {
                        ebVar = f44215c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44214b);
                            f44215c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
