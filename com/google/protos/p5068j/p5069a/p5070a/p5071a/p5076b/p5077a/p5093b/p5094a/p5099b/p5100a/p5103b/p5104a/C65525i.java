package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.i */
/* compiled from: PG */
public final class C65525i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65525i f178097c;

    /* renamed from: d */
    private static volatile C63010eb f178098d;

    /* renamed from: a */
    public int f178099a = 0;

    /* renamed from: b */
    public Object f178100b;

    static {
        C65525i iVar = new C65525i();
        f178097c = iVar;
        C62942bv.registerDefaultInstance(C65525i.class, iVar);
    }

    private C65525i() {
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
                return newMessageInfo(f178097c, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"b", "a", C65531o.class, C65537u.class, C65527k.class, C65529m.class, C65533q.class, C65520d.class, C65522f.class, C65535s.class});
            case 3:
                return new C65525i();
            case 4:
                return new C65523g();
            case 5:
                return f178097c;
            case 6:
                C63010eb ebVar = f178098d;
                if (ebVar == null) {
                    synchronized (C65525i.class) {
                        ebVar = f178098d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178097c);
                            f178098d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
