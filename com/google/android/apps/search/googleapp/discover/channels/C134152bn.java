package com.google.android.apps.search.googleapp.discover.channels;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.bn */
/* compiled from: PG */
public final class C134152bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134152bn f365440c;

    /* renamed from: d */
    private static volatile C63010eb f365441d;

    /* renamed from: a */
    public int f365442a;

    /* renamed from: b */
    public String f365443b = BuildConfig.FLAVOR;

    static {
        C134152bn bnVar = new C134152bn();
        f365440c = bnVar;
        C62942bv.registerDefaultInstance(C134152bn.class, bnVar);
    }

    private C134152bn() {
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
                return newMessageInfo(f365440c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134152bn();
            case 4:
                return new C134151bm();
            case 5:
                return f365440c;
            case 6:
                C63010eb ebVar = f365441d;
                if (ebVar == null) {
                    synchronized (C134152bn.class) {
                        ebVar = f365441d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365440c);
                            f365441d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
