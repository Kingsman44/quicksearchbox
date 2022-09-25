package com.google.android.apps.search.googleapp.discover.channels;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.br */
/* compiled from: PG */
public final class C134156br extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134156br f365450d;

    /* renamed from: e */
    private static volatile C63010eb f365451e;

    /* renamed from: a */
    public int f365452a;

    /* renamed from: b */
    public String f365453b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f365454c = BuildConfig.FLAVOR;

    static {
        C134156br brVar = new C134156br();
        f365450d = brVar;
        C62942bv.registerDefaultInstance(C134156br.class, brVar);
    }

    private C134156br() {
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
                return newMessageInfo(f365450d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134156br();
            case 4:
                return new C134155bq();
            case 5:
                return f365450d;
            case 6:
                C63010eb ebVar = f365451e;
                if (ebVar == null) {
                    synchronized (C134156br.class) {
                        ebVar = f365451e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365450d);
                            f365451e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
