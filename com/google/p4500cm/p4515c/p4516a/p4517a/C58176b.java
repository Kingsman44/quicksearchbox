package com.google.p4500cm.p4515c.p4516a.p4517a;

import com.google.p4154bc.p4155a.p4156a.C55428e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.c.a.a.b */
/* compiled from: PG */
public final class C58176b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C58176b f155530c;

    /* renamed from: d */
    private static volatile C63010eb f155531d;

    /* renamed from: a */
    public int f155532a;

    /* renamed from: b */
    public C55428e f155533b;

    static {
        C58176b bVar = new C58176b();
        f155530c = bVar;
        C62942bv.registerDefaultInstance(C58176b.class, bVar);
    }

    private C58176b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f155530c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C58176b();
            case 4:
                return new C58175a();
            case 5:
                return f155530c;
            case 6:
                C63010eb ebVar = f155531d;
                if (ebVar == null) {
                    synchronized (C58176b.class) {
                        ebVar = f155531d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155530c);
                            f155531d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
