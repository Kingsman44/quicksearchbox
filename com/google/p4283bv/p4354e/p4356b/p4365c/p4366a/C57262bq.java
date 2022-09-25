package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.bq */
/* compiled from: PG */
public final class C57262bq extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C57262bq f152860f;

    /* renamed from: h */
    private static volatile C63010eb f152861h;

    /* renamed from: a */
    public int f152862a;

    /* renamed from: b */
    public int f152863b = 0;

    /* renamed from: c */
    public Object f152864c;

    /* renamed from: d */
    public int f152865d;

    /* renamed from: e */
    public C57252bg f152866e;

    /* renamed from: g */
    private byte f152867g = 2;

    static {
        C57262bq bqVar = new C57262bq();
        f152860f = bqVar;
        C62942bv.registerDefaultInstance(C57262bq.class, bqVar);
    }

    private C57262bq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152867g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152867g = b;
                return null;
            case 2:
                return newMessageInfo(f152860f, "\u0001\u0007\u0001\u0001\u0001\t\u0007\u0000\u0000\u0005\u0001ဌ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ᐼ\u0000\tဉ\u0007", new Object[]{C45240c.f118157a, "b", "a", "d", C57259bn.m88290b(), C57315dp.class, C57315dp.class, C57261bp.class, C57315dp.class, C57315dp.class, "e"});
            case 3:
                return new C57262bq();
            case 4:
                return new C57257bl();
            case 5:
                return f152860f;
            case 6:
                C63010eb ebVar = f152861h;
                if (ebVar == null) {
                    synchronized (C57262bq.class) {
                        ebVar = f152861h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152860f);
                            f152861h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
