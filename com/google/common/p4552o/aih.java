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

/* renamed from: com.google.common.o.aih */
/* compiled from: PG */
public final class aih extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aih f158810c;

    /* renamed from: d */
    public static final C62940bt f158811d;

    /* renamed from: e */
    private static volatile C63010eb f158812e;

    /* renamed from: a */
    public int f158813a;

    /* renamed from: b */
    public String f158814b = BuildConfig.FLAVOR;

    static {
        aih aih = new aih();
        f158810c = aih;
        C62942bv.registerDefaultInstance(aih.class, aih);
        f158811d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, aih, aih, (C62958ce) null, 755, C63066gd.MESSAGE, aih.class);
    }

    private aih() {
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
                return newMessageInfo(f158810c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aih();
            case 4:
                return new aig();
            case 5:
                return f158810c;
            case 6:
                C63010eb ebVar = f158812e;
                if (ebVar == null) {
                    synchronized (aih.class) {
                        ebVar = f158812e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158810c);
                            f158812e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
