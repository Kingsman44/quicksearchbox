package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ch */
/* compiled from: PG */
public final class C28793ch extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28793ch f78247c;

    /* renamed from: d */
    private static volatile C63010eb f78248d;

    /* renamed from: a */
    public int f78249a;

    /* renamed from: b */
    public C28728bf f78250b;

    static {
        C28793ch chVar = new C28793ch();
        f78247c = chVar;
        C62942bv.registerDefaultInstance(C28793ch.class, chVar);
    }

    private C28793ch() {
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
                return newMessageInfo(f78247c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C28793ch();
            case 4:
                return new C28792cg();
            case 5:
                return f78247c;
            case 6:
                C63010eb ebVar = f78248d;
                if (ebVar == null) {
                    synchronized (C28793ch.class) {
                        ebVar = f78248d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78247c);
                            f78248d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
