package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ajo */
/* compiled from: PG */
public final class ajo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ajo f135231c;

    /* renamed from: e */
    private static volatile C63010eb f135232e;

    /* renamed from: a */
    public String f135233a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f135234b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f135235d;

    static {
        ajo ajo = new ajo();
        f135231c = ajo;
        C62942bv.registerDefaultInstance(ajo.class, ajo);
    }

    private ajo() {
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
                return newMessageInfo(f135231c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new ajo();
            case 4:
                return new ajn();
            case 5:
                return f135231c;
            case 6:
                C63010eb ebVar = f135232e;
                if (ebVar == null) {
                    synchronized (ajo.class) {
                        ebVar = f135232e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135231c);
                            f135232e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
