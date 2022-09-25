package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.f */
/* compiled from: PG */
public final class C83654f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83654f f228032c;

    /* renamed from: d */
    private static volatile C63010eb f228033d;

    /* renamed from: a */
    public int f228034a;

    /* renamed from: b */
    public String f228035b = BuildConfig.FLAVOR;

    static {
        C83654f fVar = new C83654f();
        f228032c = fVar;
        C62942bv.registerDefaultInstance(C83654f.class, fVar);
    }

    private C83654f() {
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
                return newMessageInfo(f228032c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83654f();
            case 4:
                return new C83653e();
            case 5:
                return f228032c;
            case 6:
                C63010eb ebVar = f228033d;
                if (ebVar == null) {
                    synchronized (C83654f.class) {
                        ebVar = f228033d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228032c);
                            f228033d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
