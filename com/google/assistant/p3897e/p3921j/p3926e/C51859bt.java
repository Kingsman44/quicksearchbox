package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.bt */
/* compiled from: PG */
public final class C51859bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51859bt f136033c;

    /* renamed from: d */
    private static volatile C63010eb f136034d;

    /* renamed from: a */
    public int f136035a = 0;

    /* renamed from: b */
    public Object f136036b;

    static {
        C51859bt btVar = new C51859bt();
        f136033c = btVar;
        C62942bv.registerDefaultInstance(C51859bt.class, btVar);
    }

    private C51859bt() {
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
                return newMessageInfo(f136033c, "\u0001\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0003ဿ\u0000\u0004ျ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ဿ\u0000", new Object[]{"b", "a", C51858bs.class, C51850bk.f136018a, C51854bo.class, C51849bj.class, C51855bp.f136028a});
            case 3:
                return new C51859bt();
            case 4:
                return new C51845bf();
            case 5:
                return f136033c;
            case 6:
                C63010eb ebVar = f136034d;
                if (ebVar == null) {
                    synchronized (C51859bt.class) {
                        ebVar = f136034d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136033c);
                            f136034d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
