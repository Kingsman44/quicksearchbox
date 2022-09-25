package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.bl */
/* compiled from: PG */
public final class C53102bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53102bl f139153c;

    /* renamed from: d */
    private static volatile C63010eb f139154d;

    /* renamed from: a */
    public int f139155a;

    /* renamed from: b */
    public String f139156b = BuildConfig.FLAVOR;

    static {
        C53102bl blVar = new C53102bl();
        f139153c = blVar;
        C62942bv.registerDefaultInstance(C53102bl.class, blVar);
    }

    private C53102bl() {
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
                return newMessageInfo(f139153c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53102bl();
            case 4:
                return new C53101bk();
            case 5:
                return f139153c;
            case 6:
                C63010eb ebVar = f139154d;
                if (ebVar == null) {
                    synchronized (C53102bl.class) {
                        ebVar = f139154d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139153c);
                            f139154d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
