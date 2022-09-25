package com.google.p4152bb.p4153a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.le */
/* compiled from: PG */
public final class C55244le extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55244le f145466h;

    /* renamed from: j */
    private static volatile C63010eb f145467j;

    /* renamed from: a */
    public int f145468a;

    /* renamed from: b */
    public C62971cq f145469b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f145470c = emptyProtobufList();

    /* renamed from: d */
    public C55136he f145471d;

    /* renamed from: e */
    public C62971cq f145472e = emptyProtobufList();

    /* renamed from: f */
    public int f145473f;

    /* renamed from: g */
    public C62971cq f145474g = emptyProtobufList();

    /* renamed from: i */
    private byte f145475i = 2;

    static {
        C55244le leVar = new C55244le();
        f145466h = leVar;
        C62942bv.registerDefaultInstance(C55244le.class, leVar);
    }

    private C55244le() {
    }

    /* renamed from: a */
    public final void mo54216a() {
        C62971cq cqVar = this.f145469b;
        if (!cqVar.mo58948c()) {
            this.f145469b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo54217b() {
        C62971cq cqVar = this.f145470c;
        if (!cqVar.mo58948c()) {
            this.f145470c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: c */
    public final void mo54218c() {
        C62971cq cqVar = this.f145472e;
        if (!cqVar.mo58948c()) {
            this.f145472e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145475i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145475i = b;
                return null;
            case 2:
                return newMessageInfo(f145466h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0004\u0005\u0002Л\u0003Л\u0004Л\u0005ဌ\u0001\u0007Л\bᐉ\u0000", new Object[]{"a", C45240c.f118157a, C55240la.class, "b", C55365pr.class, "e", C55136he.class, C10662f.f35572a, C55418u.f146030a, C30325g.f82003a, C55365pr.class, "d"});
            case 3:
                return new C55244le();
            case 4:
                return new C55243ld();
            case 5:
                return f145466h;
            case 6:
                C63010eb ebVar = f145467j;
                if (ebVar == null) {
                    synchronized (C55244le.class) {
                        ebVar = f145467j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145466h);
                            f145467j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
