package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ls */
/* compiled from: PG */
public final class C51546ls extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51546ls f134354b;

    /* renamed from: d */
    private static volatile C63010eb f134355d;

    /* renamed from: a */
    public boolean f134356a;

    /* renamed from: c */
    private int f134357c;

    static {
        C51546ls lsVar = new C51546ls();
        f134354b = lsVar;
        C62942bv.registerDefaultInstance(C51546ls.class, lsVar);
    }

    private C51546ls() {
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
                return newMessageInfo(f134354b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51546ls();
            case 4:
                return new C51545lr();
            case 5:
                return f134354b;
            case 6:
                C63010eb ebVar = f134355d;
                if (ebVar == null) {
                    synchronized (C51546ls.class) {
                        ebVar = f134355d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134354b);
                            f134355d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
