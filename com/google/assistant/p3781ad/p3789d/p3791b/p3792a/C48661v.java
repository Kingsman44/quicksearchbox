package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.v */
/* compiled from: PG */
public final class C48661v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48661v f125758b;

    /* renamed from: c */
    private static volatile C63010eb f125759c;

    /* renamed from: a */
    public C62995dn f125760a = C62995dn.f170057a;

    static {
        C48661v vVar = new C48661v();
        f125758b = vVar;
        C62942bv.registerDefaultInstance(C48661v.class, vVar);
    }

    private C48661v() {
    }

    /* renamed from: a */
    public final boolean mo53165a(String str) {
        str.getClass();
        return this.f125760a.containsKey(str);
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
                return newMessageInfo(f125758b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C48660u.f125757a});
            case 3:
                return new C48661v();
            case 4:
                return new C48659t();
            case 5:
                return f125758b;
            case 6:
                C63010eb ebVar = f125759c;
                if (ebVar == null) {
                    synchronized (C48661v.class) {
                        ebVar = f125759c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125758b);
                            f125759c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
