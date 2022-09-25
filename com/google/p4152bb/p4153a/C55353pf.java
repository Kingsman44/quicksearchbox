package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.pf */
/* compiled from: PG */
public final class C55353pf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55353pf f145846d;

    /* renamed from: e */
    public static final C62940bt f145847e;

    /* renamed from: f */
    private static volatile C63010eb f145848f;

    /* renamed from: a */
    public int f145849a;

    /* renamed from: b */
    public String f145850b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f145851c = BuildConfig.FLAVOR;

    static {
        C55353pf pfVar = new C55353pf();
        f145846d = pfVar;
        C62942bv.registerDefaultInstance(C55353pf.class, pfVar);
        f145847e = C62942bv.newSingularGeneratedExtension(C55355ph.f145852e, pfVar, pfVar, (C62958ce) null, 79401896, C63066gd.MESSAGE, C55353pf.class);
    }

    private C55353pf() {
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
                return newMessageInfo(f145846d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55353pf();
            case 4:
                return new C55352pe();
            case 5:
                return f145846d;
            case 6:
                C63010eb ebVar = f145848f;
                if (ebVar == null) {
                    synchronized (C55353pf.class) {
                        ebVar = f145848f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145846d);
                            f145848f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
