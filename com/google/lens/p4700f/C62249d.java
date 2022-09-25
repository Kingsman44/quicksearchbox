package com.google.lens.p4700f;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.f.d */
/* compiled from: PG */
public final class C62249d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62249d f168055c;

    /* renamed from: d */
    private static volatile C63010eb f168056d;

    /* renamed from: a */
    public int f168057a;

    /* renamed from: b */
    public String f168058b = BuildConfig.FLAVOR;

    static {
        C62249d dVar = new C62249d();
        f168055c = dVar;
        C62942bv.registerDefaultInstance(C62249d.class, dVar);
    }

    private C62249d() {
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
                return newMessageInfo(f168055c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62249d();
            case 4:
                return new C62248c();
            case 5:
                return f168055c;
            case 6:
                C63010eb ebVar = f168056d;
                if (ebVar == null) {
                    synchronized (C62249d.class) {
                        ebVar = f168056d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168055c);
                            f168056d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
