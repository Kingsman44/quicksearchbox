package com.google.p4242bp.p4267h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.v */
/* compiled from: PG */
public final class C56415v extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C56415v f150454c;

    /* renamed from: f */
    private static volatile C63010eb f150455f;

    /* renamed from: a */
    public C62971cq f150456a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f150457b = emptyProtobufList();

    /* renamed from: d */
    private C62995dn f150458d = C62995dn.f170057a;

    /* renamed from: e */
    private byte f150459e = 2;

    static {
        C56415v vVar = new C56415v();
        f150454c = vVar;
        C62942bv.registerDefaultInstance(C56415v.class, vVar);
    }

    private C56415v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150459e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150459e = b;
                return null;
            case 2:
                return newMessageInfo(f150454c, "\u0001\u0003\u0000\u0000\u0001\u000f\u0003\u0001\u0002\u0002\u0001Л\u0002Л\u000f2", new Object[]{"a", C56414u.class, "b", C56412s.class, "d", C56407n.f150435a});
            case 3:
                return new C56415v();
            case 4:
                return new C56408o();
            case 5:
                return f150454c;
            case 6:
                C63010eb ebVar = f150455f;
                if (ebVar == null) {
                    synchronized (C56415v.class) {
                        ebVar = f150455f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150454c);
                            f150455f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
