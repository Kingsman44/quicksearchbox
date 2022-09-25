package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.C65436j;

@Deprecated
/* renamed from: com.google.assistant.e.l.a.bt */
/* compiled from: PG */
public final class C52714bt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52714bt f138372a;

    /* renamed from: e */
    private static volatile C63010eb f138373e;

    /* renamed from: b */
    private int f138374b;

    /* renamed from: c */
    private C65436j f138375c;

    /* renamed from: d */
    private byte f138376d = 2;

    static {
        C52714bt btVar = new C52714bt();
        f138372a = btVar;
        C62942bv.registerDefaultInstance(C52714bt.class, btVar);
    }

    private C52714bt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138376d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138376d = b;
                return null;
            case 2:
                return newMessageInfo(f138372a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C52714bt();
            case 4:
                return new C52713bs();
            case 5:
                return f138372a;
            case 6:
                C63010eb ebVar = f138373e;
                if (ebVar == null) {
                    synchronized (C52714bt.class) {
                        ebVar = f138373e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138372a);
                            f138373e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
