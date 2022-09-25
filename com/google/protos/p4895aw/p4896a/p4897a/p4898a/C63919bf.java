package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.bf */
/* compiled from: PG */
public final class C63919bf extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63919bf f172845g;

    /* renamed from: i */
    private static volatile C63010eb f172846i;

    /* renamed from: a */
    public int f172847a;

    /* renamed from: b */
    public C63909aw f172848b;

    /* renamed from: c */
    public C63938by f172849c;

    /* renamed from: d */
    public C62971cq f172850d = emptyProtobufList();

    /* renamed from: e */
    public C63959w f172851e;

    /* renamed from: f */
    public C63905as f172852f;

    /* renamed from: h */
    private byte f172853h = 2;

    static {
        C63919bf bfVar = new C63919bf();
        f172845g = bfVar;
        C62942bv.registerDefaultInstance(C63919bf.class, bfVar);
    }

    private C63919bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172853h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172853h = b;
                return null;
            case 2:
                return newMessageInfo(f172845g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C63927bn.class, "e", C10662f.f35572a});
            case 3:
                return new C63919bf();
            case 4:
                return new C63918be();
            case 5:
                return f172845g;
            case 6:
                C63010eb ebVar = f172846i;
                if (ebVar == null) {
                    synchronized (C63919bf.class) {
                        ebVar = f172846i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172845g);
                            f172846i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
