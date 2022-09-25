package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.c.e */
/* compiled from: PG */
public final class C115168e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C115168e f319620c;

    /* renamed from: e */
    private static volatile C63010eb f319621e;

    /* renamed from: a */
    public int f319622a;

    /* renamed from: b */
    public C115167d f319623b;

    /* renamed from: d */
    private byte f319624d = 2;

    static {
        C115168e eVar = new C115168e();
        f319620c = eVar;
        C62942bv.registerDefaultInstance(C115168e.class, eVar);
    }

    private C115168e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f319624d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f319624d = b;
                return null;
            case 2:
                return newMessageInfo(f319620c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C115168e();
            case 4:
                return new C115165b();
            case 5:
                return f319620c;
            case 6:
                C63010eb ebVar = f319621e;
                if (ebVar == null) {
                    synchronized (C115168e.class) {
                        ebVar = f319621e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f319620c);
                            f319621e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
