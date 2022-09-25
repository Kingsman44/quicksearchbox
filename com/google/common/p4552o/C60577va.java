package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.va */
/* compiled from: PG */
public final class C60577va extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60577va f164319f;

    /* renamed from: g */
    private static volatile C63010eb f164320g;

    /* renamed from: a */
    public int f164321a;

    /* renamed from: b */
    public long f164322b;

    /* renamed from: c */
    public int f164323c;

    /* renamed from: d */
    public long f164324d;

    /* renamed from: e */
    public int f164325e;

    static {
        C60577va vaVar = new C60577va();
        f164319f = vaVar;
        C62942bv.registerDefaultInstance(C60577va.class, vaVar);
    }

    private C60577va() {
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
                Object[] objArr = new Object[7];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C45240c.f118157a;
                C62959cf cfVar = C60574uy.f164317a;
                objArr[6] = cfVar;
                objArr[3] = cfVar;
                objArr[4] = "d";
                objArr[5] = "e";
                return newMessageInfo(f164319f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0003ဃ\u0002\u0004ဌ\u0003", objArr);
            case 3:
                return new C60577va();
            case 4:
                return new C60573ux();
            case 5:
                return f164319f;
            case 6:
                C63010eb ebVar = f164320g;
                if (ebVar == null) {
                    synchronized (C60577va.class) {
                        ebVar = f164320g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164319f);
                            f164320g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
