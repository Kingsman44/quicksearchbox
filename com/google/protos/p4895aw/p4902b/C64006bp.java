package com.google.protos.p4895aw.p4902b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.bp */
/* compiled from: PG */
public final class C64006bp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64006bp f173086e;

    /* renamed from: g */
    private static volatile C63010eb f173087g;

    /* renamed from: a */
    public C62971cq f173088a = emptyProtobufList();

    /* renamed from: b */
    public C64057dm f173089b;

    /* renamed from: c */
    public int f173090c;

    /* renamed from: d */
    public long f173091d;

    /* renamed from: f */
    private int f173092f;

    static {
        C64006bp bpVar = new C64006bp();
        f173086e = bpVar;
        C62942bv.registerDefaultInstance(C64006bp.class, bpVar);
    }

    private C64006bp() {
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
                return newMessageInfo(f173086e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဌ\u0001\u0004ဂ\u0002", new Object[]{C10662f.f35572a, "a", C64089g.class, "b", C45240c.f118157a, C64004bn.f173085a, "d"});
            case 3:
                return new C64006bp();
            case 4:
                return new C64003bm();
            case 5:
                return f173086e;
            case 6:
                C63010eb ebVar = f173087g;
                if (ebVar == null) {
                    synchronized (C64006bp.class) {
                        ebVar = f173087g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173086e);
                            f173087g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
