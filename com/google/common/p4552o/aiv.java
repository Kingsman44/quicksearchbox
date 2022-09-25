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

/* renamed from: com.google.common.o.aiv */
/* compiled from: PG */
public final class aiv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aiv f158845c;

    /* renamed from: d */
    public static final C62940bt f158846d;

    /* renamed from: e */
    private static volatile C63010eb f158847e;

    /* renamed from: a */
    public int f158848a;

    /* renamed from: b */
    public String f158849b = BuildConfig.FLAVOR;

    static {
        aiv aiv = new aiv();
        f158845c = aiv;
        C62942bv.registerDefaultInstance(aiv.class, aiv);
        f158846d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, aiv, aiv, (C62958ce) null, 498, C63066gd.MESSAGE, aiv.class);
    }

    private aiv() {
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
                return newMessageInfo(f158845c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new aiv();
            case 4:
                return new aiu();
            case 5:
                return f158845c;
            case 6:
                C63010eb ebVar = f158847e;
                if (ebVar == null) {
                    synchronized (aiv.class) {
                        ebVar = f158847e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158845c);
                            f158847e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
