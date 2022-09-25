package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.oj */
/* compiled from: PG */
public final class C55330oj extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C55330oj f145769e;

    /* renamed from: g */
    private static volatile C63010eb f145770g;

    /* renamed from: a */
    public int f145771a;

    /* renamed from: b */
    public int f145772b;

    /* renamed from: c */
    public C62971cq f145773c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f145774d;

    /* renamed from: f */
    private byte f145775f = 2;

    static {
        C55330oj ojVar = new C55330oj();
        f145769e = ojVar;
        C62942bv.registerDefaultInstance(C55330oj.class, ojVar);
    }

    private C55330oj() {
        emptyProtobufList();
        this.f145774d = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo54243a() {
        C62971cq cqVar = this.f145773c;
        if (!cqVar.mo58948c()) {
            this.f145773c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145775f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145775f = b;
                return null;
            case 2:
                return newMessageInfo(f145769e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0002\u0001င\u0000\u0002Л\u0004Л", new Object[]{"a", "b", C45240c.f118157a, C55317nx.class, "d", C55305nl.class});
            case 3:
                return new C55330oj();
            case 4:
                return new C55329oi();
            case 5:
                return f145769e;
            case 6:
                C63010eb ebVar = f145770g;
                if (ebVar == null) {
                    synchronized (C55330oj.class) {
                        ebVar = f145770g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145769e);
                            f145770g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
