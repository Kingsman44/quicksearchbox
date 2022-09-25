package com.google.protos.p4985f.p5028p.p5029a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.p.a.k */
/* compiled from: PG */
public final class C64984k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64984k f175972c;

    /* renamed from: d */
    private static volatile C63010eb f175973d;

    /* renamed from: a */
    public int f175974a;

    /* renamed from: b */
    public C65682h f175975b;

    static {
        C64984k kVar = new C64984k();
        f175972c = kVar;
        C62942bv.registerDefaultInstance(C64984k.class, kVar);
    }

    private C64984k() {
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
                return newMessageInfo(f175972c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64984k();
            case 4:
                return new C64983j();
            case 5:
                return f175972c;
            case 6:
                C63010eb ebVar = f175973d;
                if (ebVar == null) {
                    synchronized (C64984k.class) {
                        ebVar = f175973d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175972c);
                            f175973d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
