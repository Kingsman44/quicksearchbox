package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57366ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.ai.b.ny */
/* compiled from: PG */
public final class C7895ny extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7895ny f27749d;

    /* renamed from: e */
    public static final C62940bt f27750e;

    /* renamed from: f */
    private static volatile C63010eb f27751f;

    /* renamed from: a */
    public int f27752a;

    /* renamed from: b */
    public String f27753b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C7669fo f27754c;

    static {
        C7895ny nyVar = new C7895ny();
        f27749d = nyVar;
        C62942bv.registerDefaultInstance(C7895ny.class, nyVar);
        f27750e = C62942bv.newSingularGeneratedExtension(C57366ar.f153251a, nyVar, nyVar, (C62958ce) null, 218174131, C63066gd.MESSAGE, C7895ny.class);
    }

    private C7895ny() {
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
                return newMessageInfo(f27749d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7895ny();
            case 4:
                return new C7894nx();
            case 5:
                return f27749d;
            case 6:
                C63010eb ebVar = f27751f;
                if (ebVar == null) {
                    synchronized (C7895ny.class) {
                        ebVar = f27751f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27749d);
                            f27751f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
