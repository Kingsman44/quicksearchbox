package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.nt */
/* compiled from: PG */
public final class C55313nt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55313nt f145718f;

    /* renamed from: h */
    private static volatile C63010eb f145719h;

    /* renamed from: a */
    public int f145720a;

    /* renamed from: b */
    public int f145721b;

    /* renamed from: c */
    public boolean f145722c;

    /* renamed from: d */
    public C55136he f145723d;

    /* renamed from: e */
    public int f145724e;

    /* renamed from: g */
    private byte f145725g = 2;

    static {
        C55313nt ntVar = new C55313nt();
        f145718f = ntVar;
        C62942bv.registerDefaultInstance(C55313nt.class, ntVar);
    }

    private C55313nt() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145725g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145725g = b;
                return null;
            case 2:
                return newMessageInfo(f145718f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0001\u0002င\u0000\u0004ဇ\u0002\u0005ᐉ\u0003\u0006ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C55418u.f146030a});
            case 3:
                return new C55313nt();
            case 4:
                return new C55312ns();
            case 5:
                return f145718f;
            case 6:
                C63010eb ebVar = f145719h;
                if (ebVar == null) {
                    synchronized (C55313nt.class) {
                        ebVar = f145719h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145718f);
                            f145719h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
