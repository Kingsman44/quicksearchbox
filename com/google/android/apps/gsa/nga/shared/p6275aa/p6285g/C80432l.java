package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.l */
/* compiled from: PG */
public final class C80432l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80432l f220749e;

    /* renamed from: g */
    private static volatile C63010eb f220750g;

    /* renamed from: a */
    public int f220751a;

    /* renamed from: b */
    public C62971cq f220752b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f220753c = emptyProtobufList();

    /* renamed from: d */
    public C80421am f220754d;

    /* renamed from: f */
    private byte f220755f = 2;

    static {
        C80432l lVar = new C80432l();
        f220749e = lVar;
        C62942bv.registerDefaultInstance(C80432l.class, lVar);
    }

    private C80432l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220755f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220755f = b;
                return null;
            case 2:
                return newMessageInfo(f220749e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0003\u0001Л\u0002Л\u0003ᐉ\u0000", new Object[]{"a", "b", C80413ae.class, C45240c.f118157a, C80419ak.class, "d"});
            case 3:
                return new C80432l();
            case 4:
                return new C80431k();
            case 5:
                return f220749e;
            case 6:
                C63010eb ebVar = f220750g;
                if (ebVar == null) {
                    synchronized (C80432l.class) {
                        ebVar = f220750g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220749e);
                            f220750g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
