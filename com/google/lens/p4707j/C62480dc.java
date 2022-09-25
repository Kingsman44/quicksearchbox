package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.dc */
/* compiled from: PG */
public final class C62480dc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62480dc f168685c;

    /* renamed from: d */
    private static volatile C63010eb f168686d;

    /* renamed from: a */
    public int f168687a;

    /* renamed from: b */
    public String f168688b = BuildConfig.FLAVOR;

    static {
        C62480dc dcVar = new C62480dc();
        f168685c = dcVar;
        C62942bv.registerDefaultInstance(C62480dc.class, dcVar);
    }

    private C62480dc() {
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
                return newMessageInfo(f168685c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62480dc();
            case 4:
                return new C62479db();
            case 5:
                return f168685c;
            case 6:
                C63010eb ebVar = f168686d;
                if (ebVar == null) {
                    synchronized (C62480dc.class) {
                        ebVar = f168686d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168685c);
                            f168686d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
