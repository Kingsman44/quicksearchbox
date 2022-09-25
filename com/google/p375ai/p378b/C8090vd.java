package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56991a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.vd */
/* compiled from: PG */
public final class C8090vd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8090vd f28449e;

    /* renamed from: f */
    private static volatile C63010eb f28450f;

    /* renamed from: a */
    public int f28451a;

    /* renamed from: b */
    public int f28452b;

    /* renamed from: c */
    public String f28453c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f28454d = 6;

    static {
        C8090vd vdVar = new C8090vd();
        f28449e = vdVar;
        C62942bv.registerDefaultInstance(C8090vd.class, vdVar);
    }

    private C8090vd() {
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
                return newMessageInfo(f28449e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0005ဌ\u0004", new Object[]{"a", "b", C56991a.f152134a, C45240c.f118157a, "d", C8088vb.f28448a});
            case 3:
                return new C8090vd();
            case 4:
                return new C8087va();
            case 5:
                return f28449e;
            case 6:
                C63010eb ebVar = f28450f;
                if (ebVar == null) {
                    synchronized (C8090vd.class) {
                        ebVar = f28450f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28449e);
                            f28450f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
