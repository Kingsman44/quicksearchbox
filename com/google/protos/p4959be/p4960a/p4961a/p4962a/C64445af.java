package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.af */
/* compiled from: PG */
public final class C64445af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64445af f174818d;

    /* renamed from: e */
    private static volatile C63010eb f174819e;

    /* renamed from: a */
    public int f174820a;

    /* renamed from: b */
    public int f174821b;

    /* renamed from: c */
    public String f174822c = BuildConfig.FLAVOR;

    static {
        C64445af afVar = new C64445af();
        f174818d = afVar;
        C62942bv.registerDefaultInstance(C64445af.class, afVar);
    }

    private C64445af() {
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
                return newMessageInfo(f174818d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64445af();
            case 4:
                return new C64444ae();
            case 5:
                return f174818d;
            case 6:
                C63010eb ebVar = f174819e;
                if (ebVar == null) {
                    synchronized (C64445af.class) {
                        ebVar = f174819e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174818d);
                            f174819e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
