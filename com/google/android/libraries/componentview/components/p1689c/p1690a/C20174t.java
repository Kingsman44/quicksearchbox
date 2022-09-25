package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.t */
/* compiled from: PG */
public final class C20174t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C20174t f56599d;

    /* renamed from: e */
    private static volatile C63010eb f56600e;

    /* renamed from: a */
    public int f56601a;

    /* renamed from: b */
    public C20176v f56602b;

    /* renamed from: c */
    public String f56603c = BuildConfig.FLAVOR;

    static {
        C20174t tVar = new C20174t();
        f56599d = tVar;
        C62942bv.registerDefaultInstance(C20174t.class, tVar);
    }

    private C20174t() {
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
                return newMessageInfo(f56599d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C20174t();
            case 4:
                return new C20173s();
            case 5:
                return f56599d;
            case 6:
                C63010eb ebVar = f56600e;
                if (ebVar == null) {
                    synchronized (C20174t.class) {
                        ebVar = f56600e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56599d);
                            f56600e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
