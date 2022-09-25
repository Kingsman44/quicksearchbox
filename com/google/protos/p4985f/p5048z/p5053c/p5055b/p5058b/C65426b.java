package com.google.protos.p4985f.p5048z.p5053c.p5055b.p5058b;

import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.b.b */
/* compiled from: PG */
public final class C65426b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65426b f177860c;

    /* renamed from: d */
    private static volatile C63010eb f177861d;

    /* renamed from: a */
    public int f177862a;

    /* renamed from: b */
    public C52432rn f177863b;

    static {
        C65426b bVar = new C65426b();
        f177860c = bVar;
        C62942bv.registerDefaultInstance(C65426b.class, bVar);
    }

    private C65426b() {
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
                return newMessageInfo(f177860c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65426b();
            case 4:
                return new C65425a();
            case 5:
                return f177860c;
            case 6:
                C63010eb ebVar = f177861d;
                if (ebVar == null) {
                    synchronized (C65426b.class) {
                        ebVar = f177861d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177860c);
                            f177861d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
