package com.google.protos.p4985f.p5003f.p5004a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.f.a.e */
/* compiled from: PG */
public final class C64849e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64849e f175737c;

    /* renamed from: d */
    private static volatile C63010eb f175738d;

    /* renamed from: a */
    public int f175739a;

    /* renamed from: b */
    public C65682h f175740b;

    static {
        C64849e eVar = new C64849e();
        f175737c = eVar;
        C62942bv.registerDefaultInstance(C64849e.class, eVar);
    }

    private C64849e() {
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
                return newMessageInfo(f175737c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64849e();
            case 4:
                return new C64848d();
            case 5:
                return f175737c;
            case 6:
                C63010eb ebVar = f175738d;
                if (ebVar == null) {
                    synchronized (C64849e.class) {
                        ebVar = f175738d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175737c);
                            f175738d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
