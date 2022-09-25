package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.b */
/* compiled from: PG */
public final class C65518b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65518b f178088b;

    /* renamed from: d */
    private static volatile C63010eb f178089d;

    /* renamed from: a */
    public C51885cs f178090a;

    /* renamed from: c */
    private byte f178091c = 2;

    static {
        C65518b bVar = new C65518b();
        f178088b = bVar;
        C62942bv.registerDefaultInstance(C65518b.class, bVar);
    }

    private C65518b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178091c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f178091c = b;
                return null;
            case 2:
                return newMessageInfo(f178088b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C65518b();
            case 4:
                return new C65506a();
            case 5:
                return f178088b;
            case 6:
                C63010eb ebVar = f178089d;
                if (ebVar == null) {
                    synchronized (C65518b.class) {
                        ebVar = f178089d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178088b);
                            f178089d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
