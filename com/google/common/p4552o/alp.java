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

/* renamed from: com.google.common.o.alp */
/* compiled from: PG */
public final class alp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final alp f159090c;

    /* renamed from: d */
    public static final C62940bt f159091d;

    /* renamed from: e */
    private static volatile C63010eb f159092e;

    /* renamed from: a */
    public int f159093a;

    /* renamed from: b */
    public String f159094b = BuildConfig.FLAVOR;

    static {
        alp alp = new alp();
        f159090c = alp;
        C62942bv.registerDefaultInstance(alp.class, alp);
        f159091d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, alp, alp, (C62958ce) null, 703, C63066gd.MESSAGE, alp.class);
    }

    private alp() {
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
                return newMessageInfo(f159090c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new alp();
            case 4:
                return new alo();
            case 5:
                return f159090c;
            case 6:
                C63010eb ebVar = f159092e;
                if (ebVar == null) {
                    synchronized (alp.class) {
                        ebVar = f159092e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159090c);
                            f159092e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
