package com.google.android.apps.search.p10086b.p10087a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.b.a.b */
/* compiled from: PG */
public final class C132667b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C132667b f362029c;

    /* renamed from: d */
    private static volatile C63010eb f362030d;

    /* renamed from: a */
    public int f362031a;

    /* renamed from: b */
    public String f362032b = BuildConfig.FLAVOR;

    static {
        C132667b bVar = new C132667b();
        f362029c = bVar;
        C62942bv.registerDefaultInstance(C132667b.class, bVar);
    }

    private C132667b() {
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
                return newMessageInfo(f362029c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C132667b();
            case 4:
                return new C132666a();
            case 5:
                return f362029c;
            case 6:
                C63010eb ebVar = f362030d;
                if (ebVar == null) {
                    synchronized (C132667b.class) {
                        ebVar = f362030d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362029c);
                            f362030d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
