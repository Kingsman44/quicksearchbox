package com.google.p4283bv.p4354e.p4356b.p4358b.p4364d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.d.r */
/* compiled from: PG */
public final class C57212r extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C57212r f152734d;

    /* renamed from: e */
    public static final C62940bt f152735e;

    /* renamed from: g */
    private static volatile C63010eb f152736g;

    /* renamed from: a */
    public int f152737a;

    /* renamed from: b */
    public int f152738b;

    /* renamed from: c */
    public C57206l f152739c;

    /* renamed from: f */
    private byte f152740f = 2;

    static {
        C57212r rVar = new C57212r();
        f152734d = rVar;
        C62942bv.registerDefaultInstance(C57212r.class, rVar);
        f152735e = C62942bv.newSingularGeneratedExtension(C57235aq.f152787g, rVar, rVar, (C62958ce) null, 185431439, C63066gd.MESSAGE, C57212r.class);
    }

    private C57212r() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152740f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152740f = b;
                return null;
            case 2:
                return newMessageInfo(f152734d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0001\u0005ဌ\u0000\u0006ᐉ\u0001", new Object[]{"a", "b", C57210p.m88270b(), C45240c.f118157a});
            case 3:
                return new C57212r();
            case 4:
                return new C57211q();
            case 5:
                return f152734d;
            case 6:
                C63010eb ebVar = f152736g;
                if (ebVar == null) {
                    synchronized (C57212r.class) {
                        ebVar = f152736g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152734d);
                            f152736g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
