package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.e */
/* compiled from: PG */
public final class C62785e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62785e f169546a;

    /* renamed from: c */
    private static volatile C63010eb f169547c;

    /* renamed from: b */
    private C62995dn f169548b = C62995dn.f170057a;

    static {
        C62785e eVar = new C62785e();
        f169546a = eVar;
        C62942bv.registerDefaultInstance(C62785e.class, eVar);
    }

    private C62785e() {
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
                return newMessageInfo(f169546a, "\u0001\u0001\u0000\u0000\u000f\u000f\u0001\u0001\u0000\u0000\u000f2", new Object[]{"b", C62784d.f169545a});
            case 3:
                return new C62785e();
            case 4:
                return new C62729a();
            case 5:
                return f169546a;
            case 6:
                C63010eb ebVar = f169547c;
                if (ebVar == null) {
                    synchronized (C62785e.class) {
                        ebVar = f169547c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169546a);
                            f169547c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
