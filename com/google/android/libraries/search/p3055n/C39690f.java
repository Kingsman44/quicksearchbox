package com.google.android.libraries.search.p3055n;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.f */
/* compiled from: PG */
public final class C39690f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39690f f104461c;

    /* renamed from: d */
    private static volatile C63010eb f104462d;

    /* renamed from: a */
    public int f104463a;

    /* renamed from: b */
    public String f104464b = BuildConfig.FLAVOR;

    static {
        C39690f fVar = new C39690f();
        f104461c = fVar;
        C62942bv.registerDefaultInstance(C39690f.class, fVar);
    }

    private C39690f() {
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
                return newMessageInfo(f104461c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C39690f();
            case 4:
                return new C39678e();
            case 5:
                return f104461c;
            case 6:
                C63010eb ebVar = f104462d;
                if (ebVar == null) {
                    synchronized (C39690f.class) {
                        ebVar = f104462d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104461c);
                            f104462d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
