package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.C57520e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.hl */
/* compiled from: PG */
public final class C7720hl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7720hl f26986e;

    /* renamed from: g */
    private static volatile C63010eb f26987g;

    /* renamed from: a */
    public int f26988a;

    /* renamed from: b */
    public C7644eq f26989b;

    /* renamed from: c */
    public C62971cq f26990c = emptyProtobufList();

    /* renamed from: d */
    public C57520e f26991d;

    /* renamed from: f */
    private byte f26992f = 2;

    static {
        C7720hl hlVar = new C7720hl();
        f26986e = hlVar;
        C62942bv.registerDefaultInstance(C7720hl.class, hlVar);
    }

    private C7720hl() {
    }

    /* renamed from: a */
    public final int mo16941a() {
        return this.f26990c.size();
    }

    /* renamed from: b */
    public final void mo16942b() {
        C62971cq cqVar = this.f26990c;
        if (!cqVar.mo58948c()) {
            this.f26990c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: c */
    public final C7799kj mo16943c() {
        return (C7799kj) this.f26990c.get(0);
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26992f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26992f = b;
                return null;
            case 2:
                return newMessageInfo(f26986e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0003\u0002Л\u0004ᐉ\u0000\u0005ᐉ\u0001", new Object[]{"a", C45240c.f118157a, C7799kj.class, "b", "d"});
            case 3:
                return new C7720hl();
            case 4:
                return new C7719hk();
            case 5:
                return f26986e;
            case 6:
                C63010eb ebVar = f26987g;
                if (ebVar == null) {
                    synchronized (C7720hl.class) {
                        ebVar = f26987g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26986e);
                            f26987g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
