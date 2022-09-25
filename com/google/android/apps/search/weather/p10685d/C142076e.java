package com.google.android.apps.search.weather.p10685d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.weather.d.e */
/* compiled from: PG */
public final class C142076e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142076e f385463c;

    /* renamed from: d */
    private static volatile C63010eb f385464d;

    /* renamed from: a */
    public int f385465a;

    /* renamed from: b */
    public String f385466b = BuildConfig.FLAVOR;

    static {
        C142076e eVar = new C142076e();
        f385463c = eVar;
        C62942bv.registerDefaultInstance(C142076e.class, eVar);
    }

    private C142076e() {
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
                return newMessageInfo(f385463c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142076e();
            case 4:
                return new C142075d();
            case 5:
                return f385463c;
            case 6:
                C63010eb ebVar = f385464d;
                if (ebVar == null) {
                    synchronized (C142076e.class) {
                        ebVar = f385464d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385463c);
                            f385464d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
