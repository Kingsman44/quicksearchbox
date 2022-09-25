package com.google.p395al.p417d.p418a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.g */
/* compiled from: PG */
public final class C8580g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8580g f29703a;

    /* renamed from: c */
    private static volatile C63010eb f29704c;

    /* renamed from: b */
    private C62995dn f29705b = C62995dn.f170057a;

    static {
        C8580g gVar = new C8580g();
        f29703a = gVar;
        C62942bv.registerDefaultInstance(C8580g.class, gVar);
    }

    private C8580g() {
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
                return newMessageInfo(f29703a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C8579f.f29702a});
            case 3:
                return new C8580g();
            case 4:
                return new C8578e();
            case 5:
                return f29703a;
            case 6:
                C63010eb ebVar = f29704c;
                if (ebVar == null) {
                    synchronized (C8580g.class) {
                        ebVar = f29704c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29703a);
                            f29704c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
