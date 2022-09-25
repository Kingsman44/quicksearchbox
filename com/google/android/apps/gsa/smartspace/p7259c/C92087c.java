package com.google.android.apps.gsa.smartspace.p7259c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.smartspace.c.c */
/* compiled from: PG */
public final class C92087c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C92087c f256720c;

    /* renamed from: e */
    private static volatile C63010eb f256721e;

    /* renamed from: a */
    public String f256722a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f256723b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f256724d;

    static {
        C92087c cVar = new C92087c();
        f256720c = cVar;
        C62942bv.registerDefaultInstance(C92087c.class, cVar);
    }

    private C92087c() {
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
                return newMessageInfo(f256720c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C92087c();
            case 4:
                return new C92086b();
            case 5:
                return f256720c;
            case 6:
                C63010eb ebVar = f256721e;
                if (ebVar == null) {
                    synchronized (C92087c.class) {
                        ebVar = f256721e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256720c);
                            f256721e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
