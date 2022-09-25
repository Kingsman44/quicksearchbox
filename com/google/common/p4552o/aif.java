package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.aif */
/* compiled from: PG */
public final class aif extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aif f158805c;

    /* renamed from: d */
    public static final C62940bt f158806d;

    /* renamed from: e */
    private static volatile C63010eb f158807e;

    /* renamed from: a */
    public int f158808a;

    /* renamed from: b */
    public String f158809b = BuildConfig.FLAVOR;

    static {
        aif aif = new aif();
        f158805c = aif;
        C62942bv.registerDefaultInstance(aif.class, aif);
        f158806d = C62942bv.newSingularGeneratedExtension(C60313nz.f163201a, aif, aif, (C62958ce) null, 165, C63066gd.MESSAGE, aif.class);
    }

    private aif() {
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
                return newMessageInfo(f158805c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aif();
            case 4:
                return new aie();
            case 5:
                return f158805c;
            case 6:
                C63010eb ebVar = f158807e;
                if (ebVar == null) {
                    synchronized (aif.class) {
                        ebVar = f158807e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158805c);
                            f158807e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
