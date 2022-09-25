package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.j */
/* compiled from: PG */
public final class C63626j extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C63626j f172073b;

    /* renamed from: d */
    private static volatile C63010eb f172074d;

    /* renamed from: a */
    public C62971cq f172075a;

    /* renamed from: c */
    private byte f172076c = 2;

    static {
        C63626j jVar = new C63626j();
        f172073b = jVar;
        C62942bv.registerDefaultInstance(C63626j.class, jVar);
    }

    private C63626j() {
        C62942bv.emptyProtobufList();
        this.f172075a = C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172076c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f172076c = b;
                return null;
            case 2:
                return newMessageInfo(f172073b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
            case 3:
                return new C63626j();
            case 4:
                return new C63625i();
            case 5:
                return f172073b;
            case 6:
                C63010eb ebVar = f172074d;
                if (ebVar == null) {
                    synchronized (C63626j.class) {
                        ebVar = f172074d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172073b);
                            f172074d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
