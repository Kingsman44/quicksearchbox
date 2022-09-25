package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ex */
/* compiled from: PG */
public final class C51362ex extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51362ex f133780c;

    /* renamed from: d */
    private static volatile C63010eb f133781d;

    /* renamed from: a */
    public int f133782a;

    /* renamed from: b */
    public int f133783b;

    static {
        C51362ex exVar = new C51362ex();
        f133780c = exVar;
        C62942bv.registerDefaultInstance(C51362ex.class, exVar);
    }

    private C51362ex() {
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
                return newMessageInfo(f133780c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C51361ew.m86151b()});
            case 3:
                return new C51362ex();
            case 4:
                return new C51359eu();
            case 5:
                return f133780c;
            case 6:
                C63010eb ebVar = f133781d;
                if (ebVar == null) {
                    synchronized (C51362ex.class) {
                        ebVar = f133781d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133780c);
                            f133781d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
