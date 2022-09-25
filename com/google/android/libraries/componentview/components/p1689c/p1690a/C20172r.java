package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.r */
/* compiled from: PG */
public final class C20172r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20172r f56594c;

    /* renamed from: e */
    private static volatile C63010eb f56595e;

    /* renamed from: a */
    public String f56596a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f56597b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f56598d;

    static {
        C20172r rVar = new C20172r();
        f56594c = rVar;
        C62942bv.registerDefaultInstance(C20172r.class, rVar);
    }

    private C20172r() {
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
                return newMessageInfo(f56594c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C20172r();
            case 4:
                return new C20171q();
            case 5:
                return f56594c;
            case 6:
                C63010eb ebVar = f56595e;
                if (ebVar == null) {
                    synchronized (C20172r.class) {
                        ebVar = f56595e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56594c);
                            f56595e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
