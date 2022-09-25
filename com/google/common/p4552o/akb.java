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

/* renamed from: com.google.common.o.akb */
/* compiled from: PG */
public final class akb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final akb f158948c;

    /* renamed from: d */
    public static final C62940bt f158949d;

    /* renamed from: e */
    private static volatile C63010eb f158950e;

    /* renamed from: a */
    public int f158951a;

    /* renamed from: b */
    public String f158952b = BuildConfig.FLAVOR;

    static {
        akb akb = new akb();
        f158948c = akb;
        C62942bv.registerDefaultInstance(akb.class, akb);
        f158949d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, akb, akb, (C62958ce) null, 576, C63066gd.MESSAGE, akb.class);
    }

    private akb() {
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
                return newMessageInfo(f158948c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new akb();
            case 4:
                return new aka();
            case 5:
                return f158948c;
            case 6:
                C63010eb ebVar = f158950e;
                if (ebVar == null) {
                    synchronized (akb.class) {
                        ebVar = f158950e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158948c);
                            f158950e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
