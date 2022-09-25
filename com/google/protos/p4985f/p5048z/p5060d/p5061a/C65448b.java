package com.google.protos.p4985f.p5048z.p5060d.p5061a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.p3772x.C48427d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4989a.C64720d;

/* renamed from: com.google.protos.f.z.d.a.b */
/* compiled from: PG */
public final class C65448b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65448b f177907a;

    /* renamed from: f */
    private static volatile C63010eb f177908f;

    /* renamed from: b */
    private int f177909b;

    /* renamed from: c */
    private C64720d f177910c;

    /* renamed from: d */
    private C48427d f177911d;

    /* renamed from: e */
    private byte f177912e = 2;

    static {
        C65448b bVar = new C65448b();
        f177907a = bVar;
        C62942bv.registerDefaultInstance(C65448b.class, bVar);
    }

    private C65448b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177912e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177912e = b;
                return null;
            case 2:
                return newMessageInfo(f177907a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C65448b();
            case 4:
                return new C65447a();
            case 5:
                return f177907a;
            case 6:
                C63010eb ebVar = f177908f;
                if (ebVar == null) {
                    synchronized (C65448b.class) {
                        ebVar = f177908f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177907a);
                            f177908f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
