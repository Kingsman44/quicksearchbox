package com.google.p4283bv.p4412k.p4415c.p4416a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.c.a.h */
/* compiled from: PG */
public final class C57850h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57850h f154557c;

    /* renamed from: e */
    private static volatile C63010eb f154558e;

    /* renamed from: a */
    public C62971cq f154559a = emptyProtobufList();

    /* renamed from: b */
    public C57569am f154560b;

    /* renamed from: d */
    private byte f154561d = 2;

    static {
        C57850h hVar = new C57850h();
        f154557c = hVar;
        C62942bv.registerDefaultInstance(C57850h.class, hVar);
    }

    private C57850h() {
    }

    /* renamed from: a */
    public final void mo54532a() {
        C62971cq cqVar = this.f154559a;
        if (!cqVar.mo58948c()) {
            this.f154559a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154561d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154561d = b;
                return null;
            case 2:
                return newMessageInfo(f154557c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002Љ", new Object[]{"a", C57566aj.class, "b"});
            case 3:
                return new C57850h();
            case 4:
                return new C57849g();
            case 5:
                return f154557c;
            case 6:
                C63010eb ebVar = f154558e;
                if (ebVar == null) {
                    synchronized (C57850h.class) {
                        ebVar = f154558e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154557c);
                            f154558e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
