package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afc */
/* compiled from: PG */
public final class afc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final afc f158506d;

    /* renamed from: e */
    private static volatile C63010eb f158507e;

    /* renamed from: a */
    public int f158508a;

    /* renamed from: b */
    public boolean f158509b;

    /* renamed from: c */
    public String f158510c = BuildConfig.FLAVOR;

    static {
        afc afc = new afc();
        f158506d = afc;
        C62942bv.registerDefaultInstance(afc.class, afc);
    }

    private afc() {
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
                return newMessageInfo(f158506d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new afc();
            case 4:
                return new afb();
            case 5:
                return f158506d;
            case 6:
                C63010eb ebVar = f158507e;
                if (ebVar == null) {
                    synchronized (afc.class) {
                        ebVar = f158507e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158506d);
                            f158507e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
