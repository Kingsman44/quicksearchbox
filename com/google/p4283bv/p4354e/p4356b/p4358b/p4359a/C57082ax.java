package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.ax */
/* compiled from: PG */
public final class C57082ax extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57082ax f152383e;

    /* renamed from: g */
    private static volatile C63010eb f152384g;

    /* renamed from: a */
    public int f152385a;

    /* renamed from: b */
    public C57784p f152386b;

    /* renamed from: c */
    public C57696b f152387c;

    /* renamed from: d */
    public boolean f152388d;

    /* renamed from: f */
    private byte f152389f = 2;

    static {
        C57082ax axVar = new C57082ax();
        f152383e = axVar;
        C62942bv.registerDefaultInstance(C57082ax.class, axVar);
    }

    private C57082ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152389f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152389f = b;
                return null;
            case 2:
                return newMessageInfo(f152383e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57082ax();
            case 4:
                return new C57081aw();
            case 5:
                return f152383e;
            case 6:
                C63010eb ebVar = f152384g;
                if (ebVar == null) {
                    synchronized (C57082ax.class) {
                        ebVar = f152384g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152383e);
                            f152384g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
