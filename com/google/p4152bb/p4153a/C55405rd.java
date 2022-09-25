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

/* renamed from: com.google.bb.a.rd */
/* compiled from: PG */
public final class C55405rd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55405rd f145990d;

    /* renamed from: e */
    public static final C62940bt f145991e;

    /* renamed from: f */
    private static volatile C63010eb f145992f;

    /* renamed from: a */
    public int f145993a;

    /* renamed from: b */
    public String f145994b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f145995c;

    static {
        C55405rd rdVar = new C55405rd();
        f145990d = rdVar;
        C62942bv.registerDefaultInstance(C55405rd.class, rdVar);
        f145991e = C62942bv.newSingularGeneratedExtension(C55415rn.f146023d, rdVar, rdVar, (C62958ce) null, 86527881, C63066gd.MESSAGE, C55405rd.class);
    }

    private C55405rd() {
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
                return newMessageInfo(f145990d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55405rd();
            case 4:
                return new C55404rc();
            case 5:
                return f145990d;
            case 6:
                C63010eb ebVar = f145992f;
                if (ebVar == null) {
                    synchronized (C55405rd.class) {
                        ebVar = f145992f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145990d);
                            f145992f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
