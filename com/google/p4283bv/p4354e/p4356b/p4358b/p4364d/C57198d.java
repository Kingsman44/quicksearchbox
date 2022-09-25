package com.google.p4283bv.p4354e.p4356b.p4358b.p4364d;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.d.d */
/* compiled from: PG */
public final class C57198d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57198d f152705b;

    /* renamed from: c */
    public static final C62940bt f152706c;

    /* renamed from: f */
    private static volatile C63010eb f152707f;

    /* renamed from: a */
    public C57784p f152708a;

    /* renamed from: d */
    private int f152709d;

    /* renamed from: e */
    private byte f152710e = 2;

    static {
        C57198d dVar = new C57198d();
        f152705b = dVar;
        C62942bv.registerDefaultInstance(C57198d.class, dVar);
        f152706c = C62942bv.newSingularGeneratedExtension(C57212r.f152734d, dVar, dVar, (C62958ce) null, 1000, C63066gd.MESSAGE, C57198d.class);
    }

    private C57198d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152710e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152710e = b;
                return null;
            case 2:
                return newMessageInfo(f152705b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C57198d();
            case 4:
                return new C57197c();
            case 5:
                return f152705b;
            case 6:
                C63010eb ebVar = f152707f;
                if (ebVar == null) {
                    synchronized (C57198d.class) {
                        ebVar = f152707f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152705b);
                            f152707f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
