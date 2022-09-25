package com.google.fcp.client.http;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.fcp.client.http.o */
/* compiled from: PG */
public final class C61106o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61106o f165418c;

    /* renamed from: d */
    private static volatile C63010eb f165419d;

    /* renamed from: a */
    public String f165420a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f165421b = BuildConfig.FLAVOR;

    static {
        C61106o oVar = new C61106o();
        f165418c = oVar;
        C62942bv.registerDefaultInstance(C61106o.class, oVar);
    }

    private C61106o() {
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
                return newMessageInfo(f165418c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C61106o();
            case 4:
                return new C61105n();
            case 5:
                return f165418c;
            case 6:
                C63010eb ebVar = f165419d;
                if (ebVar == null) {
                    synchronized (C61106o.class) {
                        ebVar = f165419d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165418c);
                            f165419d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
