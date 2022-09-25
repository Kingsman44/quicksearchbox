package com.google.p363ad.p364a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.p5162a.p5163a.C65991h;

/* renamed from: com.google.ad.a.ah */
/* compiled from: PG */
public final class C6676ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C6676ah f19935d;

    /* renamed from: e */
    private static volatile C63010eb f19936e;

    /* renamed from: a */
    public int f19937a;

    /* renamed from: b */
    public String f19938b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C65991h f19939c;

    static {
        C6676ah ahVar = new C6676ah();
        f19935d = ahVar;
        C62942bv.registerDefaultInstance(C6676ah.class, ahVar);
    }

    private C6676ah() {
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
                return newMessageInfo(f19935d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C6676ah();
            case 4:
                return new C6675ag();
            case 5:
                return f19935d;
            case 6:
                C63010eb ebVar = f19936e;
                if (ebVar == null) {
                    synchronized (C6676ah.class) {
                        ebVar = f19936e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19935d);
                            f19936e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
