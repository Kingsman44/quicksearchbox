package com.google.protos.p4985f.p4988b.p4993d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.d.n */
/* compiled from: PG */
public final class C64794n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64794n f175604e;

    /* renamed from: g */
    private static volatile C63010eb f175605g;

    /* renamed from: a */
    public int f175606a;

    /* renamed from: b */
    public int f175607b = 1;

    /* renamed from: c */
    public int f175608c;

    /* renamed from: d */
    public C62971cq f175609d = emptyProtobufList();

    /* renamed from: f */
    private C62995dn f175610f = C62995dn.f170057a;

    static {
        C64794n nVar = new C64794n();
        f175604e = nVar;
        C62942bv.registerDefaultInstance(C64794n.class, nVar);
    }

    private C64794n() {
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
                return newMessageInfo(f175604e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0001\u0001\u0000\u0001ဌ\u0003\u0002ဌ\u0004\u0003\u001b\u00072", new Object[]{"a", "b", C64796p.f175612a, C45240c.f118157a, C64798r.f175613a, "d", C64791k.class, C10662f.f35572a, C64793m.f175603a});
            case 3:
                return new C64794n();
            case 4:
                return new C64792l();
            case 5:
                return f175604e;
            case 6:
                C63010eb ebVar = f175605g;
                if (ebVar == null) {
                    synchronized (C64794n.class) {
                        ebVar = f175605g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175604e);
                            f175605g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
