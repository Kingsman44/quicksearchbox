package com.google.p4653i.p4654a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.az */
/* compiled from: PG */
public final class C61685az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61685az f166645c;

    /* renamed from: d */
    private static volatile C63010eb f166646d;

    /* renamed from: a */
    public int f166647a;

    /* renamed from: b */
    public String f166648b = BuildConfig.FLAVOR;

    static {
        C61685az azVar = new C61685az();
        f166645c = azVar;
        C62942bv.registerDefaultInstance(C61685az.class, azVar);
    }

    private C61685az() {
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
                return newMessageInfo(f166645c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61685az();
            case 4:
                return new C61684ay();
            case 5:
                return f166645c;
            case 6:
                C63010eb ebVar = f166646d;
                if (ebVar == null) {
                    synchronized (C61685az.class) {
                        ebVar = f166646d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166645c);
                            f166646d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
