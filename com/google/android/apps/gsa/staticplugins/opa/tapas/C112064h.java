package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.h */
/* compiled from: PG */
public final class C112064h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C112064h f311238c;

    /* renamed from: e */
    private static volatile C63010eb f311239e;

    /* renamed from: a */
    public C62971cq f311240a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C111773f f311241b;

    /* renamed from: d */
    private int f311242d;

    static {
        C112064h hVar = new C112064h();
        f311238c = hVar;
        C62942bv.registerDefaultInstance(C112064h.class, hVar);
    }

    private C112064h() {
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
                return newMessageInfo(f311238c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"d", "a", "b"});
            case 3:
                return new C112064h();
            case 4:
                return new C112019g();
            case 5:
                return f311238c;
            case 6:
                C63010eb ebVar = f311239e;
                if (ebVar == null) {
                    synchronized (C112064h.class) {
                        ebVar = f311239e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f311238c);
                            f311239e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
