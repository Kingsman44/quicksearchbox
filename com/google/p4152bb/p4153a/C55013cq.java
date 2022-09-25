package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.cq */
/* compiled from: PG */
public final class C55013cq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55013cq f144733c;

    /* renamed from: d */
    public static final C62940bt f144734d;

    /* renamed from: f */
    private static volatile C63010eb f144735f;

    /* renamed from: a */
    public boolean f144736a = true;

    /* renamed from: b */
    public boolean f144737b = true;

    /* renamed from: e */
    private int f144738e;

    static {
        C55013cq cqVar = new C55013cq();
        f144733c = cqVar;
        C62942bv.registerDefaultInstance(C55013cq.class, cqVar);
        f144734d = C62942bv.newSingularGeneratedExtension(C55005ci.f144714d, cqVar, cqVar, (C62958ce) null, 81810903, C63066gd.MESSAGE, C55013cq.class);
    }

    private C55013cq() {
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
                return newMessageInfo(f144733c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C55013cq();
            case 4:
                return new C55012cp();
            case 5:
                return f144733c;
            case 6:
                C63010eb ebVar = f144735f;
                if (ebVar == null) {
                    synchronized (C55013cq.class) {
                        ebVar = f144735f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144733c);
                            f144735f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
