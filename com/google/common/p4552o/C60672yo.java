package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.yo */
/* compiled from: PG */
public final class C60672yo extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60672yo f164588e;

    /* renamed from: f */
    private static volatile C63010eb f164589f;

    /* renamed from: a */
    public int f164590a;

    /* renamed from: b */
    public long f164591b;

    /* renamed from: c */
    public int f164592c;

    /* renamed from: d */
    public int f164593d;

    static {
        C60672yo yoVar = new C60672yo();
        f164588e = yoVar;
        C62942bv.registerDefaultInstance(C60672yo.class, yoVar);
    }

    private C60672yo() {
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
                Object[] objArr = new Object[6];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C45240c.f118157a;
                C62959cf cfVar = C60670ym.f164587a;
                objArr[5] = cfVar;
                objArr[3] = cfVar;
                objArr[4] = "d";
                return newMessageInfo(f164588e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", objArr);
            case 3:
                return new C60672yo();
            case 4:
                return new C60669yl();
            case 5:
                return f164588e;
            case 6:
                C63010eb ebVar = f164589f;
                if (ebVar == null) {
                    synchronized (C60672yo.class) {
                        ebVar = f164589f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164588e);
                            f164589f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
