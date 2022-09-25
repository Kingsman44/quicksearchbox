package com.google.android.libraries.lens.p1995c.p1996a.p1997a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.c.a.a.d */
/* compiled from: PG */
public final class C24073d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C24073d f65753f;

    /* renamed from: g */
    private static volatile C63010eb f65754g;

    /* renamed from: a */
    public int f65755a;

    /* renamed from: b */
    public String f65756b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f65757c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f65758d = -1;

    /* renamed from: e */
    public int f65759e = -1;

    static {
        C24073d dVar = new C24073d();
        f65753f = dVar;
        C62942bv.registerDefaultInstance(C24073d.class, dVar);
    }

    private C24073d() {
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
                objArr[3] = "d";
                C62959cf cfVar = C24071b.f65752a;
                objArr[6] = cfVar;
                objArr[4] = cfVar;
                objArr[5] = "e";
                return newMessageInfo(f65753f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", objArr);
            case 3:
                return new C24073d();
            case 4:
                return new C24070a();
            case 5:
                return f65753f;
            case 6:
                C63010eb ebVar = f65754g;
                if (ebVar == null) {
                    synchronized (C24073d.class) {
                        ebVar = f65754g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f65753f);
                            f65754g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
