package com.google.protos.p4850an.p4853b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.b.d */
/* compiled from: PG */
public final class C63360d extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C63360d f171230f;

    /* renamed from: h */
    private static volatile C63010eb f171231h;

    /* renamed from: a */
    public int f171232a;

    /* renamed from: b */
    public C62971cq f171233b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f171234c = emptyProtobufList();

    /* renamed from: d */
    public C63371o f171235d;

    /* renamed from: e */
    public int f171236e;

    /* renamed from: g */
    private byte f171237g = 2;

    static {
        C63360d dVar = new C63360d();
        f171230f = dVar;
        C62942bv.registerDefaultInstance(C63360d.class, dVar);
    }

    private C63360d() {
    }

    /* renamed from: a */
    public final void mo59208a() {
        C62971cq cqVar = this.f171234c;
        if (!cqVar.mo58948c()) {
            this.f171234c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171237g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171237g = b;
                return null;
            case 2:
                return newMessageInfo(f171230f, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0002\u0003\u0001Л\u0002Л\u0003ᐉ\u0001\u000bဌ\u0006", new Object[]{"a", "b", C63369m.class, C45240c.f118157a, C63358b.class, "d", "e", C63374r.f171272a});
            case 3:
                return new C63360d();
            case 4:
                return new C63359c();
            case 5:
                return f171230f;
            case 6:
                C63010eb ebVar = f171231h;
                if (ebVar == null) {
                    synchronized (C63360d.class) {
                        ebVar = f171231h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171230f);
                            f171231h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
