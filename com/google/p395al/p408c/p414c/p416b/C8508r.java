package com.google.p395al.p408c.p414c.p416b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.r */
/* compiled from: PG */
public final class C8508r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8508r f29517c;

    /* renamed from: e */
    private static volatile C63010eb f29518e;

    /* renamed from: a */
    public String f29519a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f29520b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f29521d;

    static {
        C8508r rVar = new C8508r();
        f29517c = rVar;
        C62942bv.registerDefaultInstance(C8508r.class, rVar);
    }

    private C8508r() {
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
                return newMessageInfo(f29517c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C8508r();
            case 4:
                return new C8507q();
            case 5:
                return f29517c;
            case 6:
                C63010eb ebVar = f29518e;
                if (ebVar == null) {
                    synchronized (C8508r.class) {
                        ebVar = f29518e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29517c);
                            f29518e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
