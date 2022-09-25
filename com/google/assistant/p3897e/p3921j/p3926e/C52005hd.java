package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hd */
/* compiled from: PG */
public final class C52005hd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52005hd f136486b;

    /* renamed from: f */
    private static volatile C63010eb f136487f;

    /* renamed from: a */
    public C51016dg f136488a;

    /* renamed from: c */
    private int f136489c;

    /* renamed from: d */
    private C51016dg f136490d;

    /* renamed from: e */
    private byte f136491e = 2;

    static {
        C52005hd hdVar = new C52005hd();
        f136486b = hdVar;
        C62942bv.registerDefaultInstance(C52005hd.class, hdVar);
    }

    private C52005hd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136491e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136491e = b;
                return null;
            case 2:
                return newMessageInfo(f136486b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C52005hd();
            case 4:
                return new C52004hc();
            case 5:
                return f136486b;
            case 6:
                C63010eb ebVar = f136487f;
                if (ebVar == null) {
                    synchronized (C52005hd.class) {
                        ebVar = f136487f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136486b);
                            f136487f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
