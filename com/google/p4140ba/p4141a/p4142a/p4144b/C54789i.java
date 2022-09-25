package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p417d.p418a.C8590q;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b.i */
/* compiled from: PG */
public final class C54789i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54789i f143730e;

    /* renamed from: f */
    private static volatile C63010eb f143731f;

    /* renamed from: a */
    public int f143732a;

    /* renamed from: b */
    public int f143733b;

    /* renamed from: c */
    public int f143734c;

    /* renamed from: d */
    public boolean f143735d;

    static {
        C54789i iVar = new C54789i();
        f143730e = iVar;
        C62942bv.registerDefaultInstance(C54789i.class, iVar);
    }

    private C54789i() {
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
                return newMessageInfo(f143730e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C8590q.m23278c(), C45240c.f118157a, C54788h.f143729a, "d"});
            case 3:
                return new C54789i();
            case 4:
                return new C54787g();
            case 5:
                return f143730e;
            case 6:
                C63010eb ebVar = f143731f;
                if (ebVar == null) {
                    synchronized (C54789i.class) {
                        ebVar = f143731f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143730e);
                            f143731f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
