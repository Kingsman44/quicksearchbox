package com.google.protos.p5146w.p5147a.p5148a;

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

/* renamed from: com.google.protos.w.a.a.s */
/* compiled from: PG */
public final class C65941s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65941s f179349d;

    /* renamed from: e */
    public static final C62940bt f179350e;

    /* renamed from: f */
    private static volatile C63010eb f179351f;

    /* renamed from: a */
    public int f179352a;

    /* renamed from: b */
    public String f179353b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f179354c = BuildConfig.FLAVOR;

    static {
        C65941s sVar = new C65941s();
        f179349d = sVar;
        C62942bv.registerDefaultInstance(C65941s.class, sVar);
        f179350e = C62942bv.newSingularGeneratedExtension(C65930h.f179300i, sVar, sVar, (C62958ce) null, 2008, C63066gd.MESSAGE, C65941s.class);
    }

    private C65941s() {
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
                return newMessageInfo(f179349d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65941s();
            case 4:
                return new C65940r();
            case 5:
                return f179349d;
            case 6:
                C63010eb ebVar = f179351f;
                if (ebVar == null) {
                    synchronized (C65941s.class) {
                        ebVar = f179351f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179349d);
                            f179351f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
