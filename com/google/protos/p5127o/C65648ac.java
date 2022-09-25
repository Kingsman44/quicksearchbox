package com.google.protos.p5127o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.ac */
/* compiled from: PG */
public final class C65648ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65648ac f178380e;

    /* renamed from: g */
    private static volatile C63010eb f178381g;

    /* renamed from: a */
    public int f178382a;

    /* renamed from: b */
    public int f178383b = 0;

    /* renamed from: c */
    public Object f178384c;

    /* renamed from: d */
    public long f178385d;

    /* renamed from: f */
    private byte f178386f = 2;

    static {
        C65648ac acVar = new C65648ac();
        f178380e = acVar;
        C62942bv.registerDefaultInstance(C65648ac.class, acVar);
    }

    private C65648ac() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178386f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178386f = b;
                return null;
            case 2:
                return newMessageInfo(f178380e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ဿ\u0000\u0004ဂ\u0003", new Object[]{C45240c.f118157a, "b", "a", C65651af.class, C65653ah.class, C65649ad.f178387a, "d"});
            case 3:
                return new C65648ac();
            case 4:
                return new C65647ab();
            case 5:
                return f178380e;
            case 6:
                C63010eb ebVar = f178381g;
                if (ebVar == null) {
                    synchronized (C65648ac.class) {
                        ebVar = f178381g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178380e);
                            f178381g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
