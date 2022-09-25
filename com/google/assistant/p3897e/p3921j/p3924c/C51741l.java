package com.google.assistant.p3897e.p3921j.p3924c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.c.l */
/* compiled from: PG */
public final class C51741l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51741l f135747c;

    /* renamed from: d */
    private static volatile C63010eb f135748d;

    /* renamed from: a */
    public int f135749a;

    /* renamed from: b */
    public String f135750b = BuildConfig.FLAVOR;

    static {
        C51741l lVar = new C51741l();
        f135747c = lVar;
        C62942bv.registerDefaultInstance(C51741l.class, lVar);
    }

    private C51741l() {
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
                return newMessageInfo(f135747c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51741l();
            case 4:
                return new C51740k();
            case 5:
                return f135747c;
            case 6:
                C63010eb ebVar = f135748d;
                if (ebVar == null) {
                    synchronized (C51741l.class) {
                        ebVar = f135748d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135747c);
                            f135748d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
