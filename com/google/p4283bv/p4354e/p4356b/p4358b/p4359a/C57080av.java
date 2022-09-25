package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.av */
/* compiled from: PG */
public final class C57080av extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57080av f152377b;

    /* renamed from: f */
    private static volatile C63010eb f152378f;

    /* renamed from: a */
    public C57784p f152379a;

    /* renamed from: c */
    private int f152380c;

    /* renamed from: d */
    private C57696b f152381d;

    /* renamed from: e */
    private byte f152382e = 2;

    static {
        C57080av avVar = new C57080av();
        f152377b = avVar;
        C62942bv.registerDefaultInstance(C57080av.class, avVar);
    }

    private C57080av() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152382e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152382e = b;
                return null;
            case 2:
                return newMessageInfo(f152377b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C57080av();
            case 4:
                return new C57079au();
            case 5:
                return f152377b;
            case 6:
                C63010eb ebVar = f152378f;
                if (ebVar == null) {
                    synchronized (C57080av.class) {
                        ebVar = f152378f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152377b);
                            f152378f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
