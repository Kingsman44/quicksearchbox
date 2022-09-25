package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agr */
/* compiled from: PG */
public final class agr extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final agr f129249f;

    /* renamed from: g */
    private static volatile C63010eb f129250g;

    /* renamed from: a */
    public int f129251a;

    /* renamed from: b */
    public C62971cq f129252b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f129253c = emptyProtobufList();

    /* renamed from: d */
    public long f129254d;

    /* renamed from: e */
    public boolean f129255e;

    static {
        agr agr = new agr();
        f129249f = agr;
        C62942bv.registerDefaultInstance(agr.class, agr);
    }

    private agr() {
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
                return newMessageInfo(f129249f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဂ\u0000\u0004ဇ\u0001", new Object[]{"a", "b", agp.class, C45240c.f118157a, agp.class, "d", "e"});
            case 3:
                return new agr();
            case 4:
                return new agq();
            case 5:
                return f129249f;
            case 6:
                C63010eb ebVar = f129250g;
                if (ebVar == null) {
                    synchronized (agr.class) {
                        ebVar = f129250g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129249f);
                            f129250g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
