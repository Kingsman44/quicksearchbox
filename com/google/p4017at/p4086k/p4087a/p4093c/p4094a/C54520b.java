package com.google.p4017at.p4086k.p4087a.p4093c.p4094a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63947k;

/* renamed from: com.google.at.k.a.c.a.b */
/* compiled from: PG */
public final class C54520b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54520b f143150d;

    /* renamed from: f */
    private static volatile C63010eb f143151f;

    /* renamed from: a */
    public int f143152a;

    /* renamed from: b */
    public C63947k f143153b;

    /* renamed from: c */
    public C54527i f143154c;

    /* renamed from: e */
    private byte f143155e = 2;

    static {
        C54520b bVar = new C54520b();
        f143150d = bVar;
        C62942bv.registerDefaultInstance(C54520b.class, bVar);
    }

    private C54520b() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143155e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143155e = b;
                return null;
            case 2:
                return newMessageInfo(f143150d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54520b();
            case 4:
                return new C54517a();
            case 5:
                return f143150d;
            case 6:
                C63010eb ebVar = f143151f;
                if (ebVar == null) {
                    synchronized (C54520b.class) {
                        ebVar = f143151f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143150d);
                            f143151f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
