package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.bk */
/* compiled from: PG */
public final class C67307bk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67307bk f182951b;

    /* renamed from: d */
    private static volatile C63010eb f182952d;

    /* renamed from: a */
    public C67361y f182953a;

    /* renamed from: c */
    private int f182954c;

    static {
        C67307bk bkVar = new C67307bk();
        f182951b = bkVar;
        C62942bv.registerDefaultInstance(C67307bk.class, bkVar);
    }

    private C67307bk() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f182951b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67307bk();
            case 4:
                return new C67306bj();
            case 5:
                return f182951b;
            case 6:
                C63010eb ebVar = f182952d;
                if (ebVar == null) {
                    synchronized (C67307bk.class) {
                        ebVar = f182952d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182951b);
                            f182952d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
