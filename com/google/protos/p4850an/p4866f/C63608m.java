package com.google.protos.p4850an.p4866f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.m */
/* compiled from: PG */
public final class C63608m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63608m f172043f;

    /* renamed from: g */
    private static volatile C63010eb f172044g;

    /* renamed from: a */
    public int f172045a;

    /* renamed from: b */
    public C62971cq f172046b = emptyProtobufList();

    /* renamed from: c */
    public C63603h f172047c;

    /* renamed from: d */
    public int f172048d;

    /* renamed from: e */
    public C63617v f172049e;

    static {
        C63608m mVar = new C63608m();
        f172043f = mVar;
        C62942bv.registerDefaultInstance(C63608m.class, mVar);
    }

    private C63608m() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f172043f, "\u0001\u0004\u0000\u0001\u0002\r\u0004\u0000\u0001\u0000\u0002\u001b\u0005ဉ\u0001\u000bဌ\u0002\rဉ\u0003", new Object[]{"a", "b", C63606k.class, C45240c.f118157a, "d", C63607l.f172042a, "e"});
            case 3:
                return new C63608m();
            case 4:
                return new C63604i();
            case 5:
                return f172043f;
            case 6:
                C63010eb ebVar = f172044g;
                if (ebVar == null) {
                    synchronized (C63608m.class) {
                        ebVar = f172044g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172043f);
                            f172044g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
