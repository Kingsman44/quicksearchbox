package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fl */
/* compiled from: PG */
public final class C59784fl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59784fl f161534c;

    /* renamed from: e */
    private static volatile C63010eb f161535e;

    /* renamed from: a */
    public String f161536a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f161537b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f161538d;

    static {
        C59784fl flVar = new C59784fl();
        f161534c = flVar;
        C62942bv.registerDefaultInstance(C59784fl.class, flVar);
    }

    private C59784fl() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f161534c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C59784fl();
            case 4:
                return new C59783fk();
            case 5:
                return f161534c;
            case 6:
                C63010eb ebVar = f161535e;
                if (ebVar == null) {
                    synchronized (C59784fl.class) {
                        ebVar = f161535e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161534c);
                            f161535e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
