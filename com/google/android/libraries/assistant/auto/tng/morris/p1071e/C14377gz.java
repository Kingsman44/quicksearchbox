package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gz */
/* compiled from: PG */
public final class C14377gz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14377gz f43502b;

    /* renamed from: c */
    private static volatile C63010eb f43503c;

    /* renamed from: a */
    public C14528mo f43504a;

    static {
        C14377gz gzVar = new C14377gz();
        f43502b = gzVar;
        C62942bv.registerDefaultInstance(C14377gz.class, gzVar);
    }

    private C14377gz() {
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
                return newMessageInfo(f43502b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C14377gz();
            case 4:
                return new C14376gy();
            case 5:
                return f43502b;
            case 6:
                C63010eb ebVar = f43503c;
                if (ebVar == null) {
                    synchronized (C14377gz.class) {
                        ebVar = f43503c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43502b);
                            f43503c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
