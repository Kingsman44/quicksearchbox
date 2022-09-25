package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.akl */
/* compiled from: PG */
public final class akl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final akl f158967f;

    /* renamed from: g */
    private static volatile C63010eb f158968g;

    /* renamed from: a */
    public int f158969a;

    /* renamed from: b */
    public int f158970b;

    /* renamed from: c */
    public int f158971c;

    /* renamed from: d */
    public String f158972d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f158973e = BuildConfig.FLAVOR;

    static {
        akl akl = new akl();
        f158967f = akl;
        C62942bv.registerDefaultInstance(akl.class, akl);
    }

    private akl() {
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
                return newMessageInfo(f158967f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, akj.f158966a, "d", "e"});
            case 3:
                return new akl();
            case 4:
                return new aki();
            case 5:
                return f158967f;
            case 6:
                C63010eb ebVar = f158968g;
                if (ebVar == null) {
                    synchronized (akl.class) {
                        ebVar = f158968g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158967f);
                            f158968g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
