package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.af */
/* compiled from: PG */
public final class C83825af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83825af f228447c;

    /* renamed from: d */
    private static volatile C63010eb f228448d;

    /* renamed from: a */
    public int f228449a;

    /* renamed from: b */
    public String f228450b = BuildConfig.FLAVOR;

    static {
        C83825af afVar = new C83825af();
        f228447c = afVar;
        C62942bv.registerDefaultInstance(C83825af.class, afVar);
    }

    private C83825af() {
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
                return newMessageInfo(f228447c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83825af();
            case 4:
                return new C83824ae();
            case 5:
                return f228447c;
            case 6:
                C63010eb ebVar = f228448d;
                if (ebVar == null) {
                    synchronized (C83825af.class) {
                        ebVar = f228448d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228447c);
                            f228448d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
