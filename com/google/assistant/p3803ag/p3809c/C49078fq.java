package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.fq */
/* compiled from: PG */
public final class C49078fq extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49078fq f126937f;

    /* renamed from: g */
    private static volatile C63010eb f126938g;

    /* renamed from: a */
    public int f126939a;

    /* renamed from: b */
    public C62971cq f126940b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f126941c = emptyProtobufList();

    /* renamed from: d */
    public long f126942d;

    /* renamed from: e */
    public long f126943e;

    static {
        C49078fq fqVar = new C49078fq();
        f126937f = fqVar;
        C62942bv.registerDefaultInstance(C49078fq.class, fqVar);
    }

    private C49078fq() {
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
                return newMessageInfo(f126937f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဃ\u0000\u0003\u001b\u0004ဃ\u0001", new Object[]{"a", "b", C49089ga.class, "d", C45240c.f118157a, C49097gi.class, "e"});
            case 3:
                return new C49078fq();
            case 4:
                return new C49077fp();
            case 5:
                return f126937f;
            case 6:
                C63010eb ebVar = f126938g;
                if (ebVar == null) {
                    synchronized (C49078fq.class) {
                        ebVar = f126938g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126937f);
                            f126938g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
