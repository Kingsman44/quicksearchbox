package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ca */
/* compiled from: PG */
public final class C142349ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142349ca f386233c;

    /* renamed from: e */
    private static volatile C63010eb f386234e;

    /* renamed from: a */
    public String f386235a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f386236b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f386237d;

    static {
        C142349ca caVar = new C142349ca();
        f386233c = caVar;
        C62942bv.registerDefaultInstance(C142349ca.class, caVar);
    }

    private C142349ca() {
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
                return newMessageInfo(f386233c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C142349ca();
            case 4:
                return new C142347bz();
            case 5:
                return f386233c;
            case 6:
                C63010eb ebVar = f386234e;
                if (ebVar == null) {
                    synchronized (C142349ca.class) {
                        ebVar = f386234e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386233c);
                            f386234e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
