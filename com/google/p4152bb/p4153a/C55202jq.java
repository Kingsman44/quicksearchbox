package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.jq */
/* compiled from: PG */
public final class C55202jq extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C55202jq f145289f;

    /* renamed from: h */
    private static volatile C63010eb f145290h;

    /* renamed from: a */
    public int f145291a;

    /* renamed from: b */
    public C62971cq f145292b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f145293c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f145294d = emptyProtobufList();

    /* renamed from: e */
    public C55365pr f145295e;

    /* renamed from: g */
    private byte f145296g = 2;

    static {
        C55202jq jqVar = new C55202jq();
        f145289f = jqVar;
        C62942bv.registerDefaultInstance(C55202jq.class, jqVar);
    }

    private C55202jq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145296g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145296g = b;
                return null;
            case 2:
                return newMessageInfo(f145289f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0003\u0004\u0001Л\u0002Л\u0003Л\u0006ᐉ\u0000", new Object[]{"a", "b", C55215kc.class, C45240c.f118157a, C55365pr.class, "d", C55365pr.class, "e"});
            case 3:
                return new C55202jq();
            case 4:
                return new C55201jp();
            case 5:
                return f145289f;
            case 6:
                C63010eb ebVar = f145290h;
                if (ebVar == null) {
                    synchronized (C55202jq.class) {
                        ebVar = f145290h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145289f);
                            f145290h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
