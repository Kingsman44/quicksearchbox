package com.google.p4273bs.p4277b.p4278a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.s */
/* compiled from: PG */
public final class C56479s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56479s f150858d;

    /* renamed from: f */
    private static volatile C63010eb f150859f;

    /* renamed from: a */
    public C56477q f150860a;

    /* renamed from: b */
    public C56481u f150861b;

    /* renamed from: c */
    public C62971cq f150862c = emptyProtobufList();

    /* renamed from: e */
    private int f150863e;

    static {
        C56479s sVar = new C56479s();
        f150858d = sVar;
        C62942bv.registerDefaultInstance(C56479s.class, sVar);
    }

    private C56479s() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f150858d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001b\u0005ဉ\u0001", new Object[]{"e", "a", C45240c.f118157a, C56475o.class, "b"});
            case 3:
                return new C56479s();
            case 4:
                return new C56478r();
            case 5:
                return f150858d;
            case 6:
                C63010eb ebVar = f150859f;
                if (ebVar == null) {
                    synchronized (C56479s.class) {
                        ebVar = f150859f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150858d);
                            f150859f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
