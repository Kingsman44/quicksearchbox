package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ju */
/* compiled from: PG */
public final class C7783ju extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7783ju f27241c;

    /* renamed from: d */
    private static volatile C63010eb f27242d;

    /* renamed from: a */
    public C62971cq f27243a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f27244b = emptyProtobufList();

    static {
        C7783ju juVar = new C7783ju();
        f27241c = juVar;
        C62942bv.registerDefaultInstance(C7783ju.class, juVar);
    }

    private C7783ju() {
    }

    /* renamed from: a */
    public final void mo16965a() {
        C62971cq cqVar = this.f27243a;
        if (!cqVar.mo58948c()) {
            this.f27243a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo16966b() {
        C62971cq cqVar = this.f27244b;
        if (!cqVar.mo58948c()) {
            this.f27244b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f27241c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", C8156xp.class, "b", C7782jt.class});
            case 3:
                return new C7783ju();
            case 4:
                return new C7780jr();
            case 5:
                return f27241c;
            case 6:
                C63010eb ebVar = f27242d;
                if (ebVar == null) {
                    synchronized (C7783ju.class) {
                        ebVar = f27242d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27241c);
                            f27242d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
