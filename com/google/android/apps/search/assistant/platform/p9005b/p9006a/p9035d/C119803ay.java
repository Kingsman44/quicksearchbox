package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.ay */
/* compiled from: PG */
public final class C119803ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119803ay f333699b;

    /* renamed from: d */
    private static volatile C63010eb f333700d;

    /* renamed from: a */
    public C119789ak f333701a;

    /* renamed from: c */
    private byte f333702c = 2;

    static {
        C119803ay ayVar = new C119803ay();
        f333699b = ayVar;
        C62942bv.registerDefaultInstance(C119803ay.class, ayVar);
    }

    private C119803ay() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333702c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f333702c = b;
                return null;
            case 2:
                return newMessageInfo(f333699b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C119803ay();
            case 4:
                return new C119802ax();
            case 5:
                return f333699b;
            case 6:
                C63010eb ebVar = f333700d;
                if (ebVar == null) {
                    synchronized (C119803ay.class) {
                        ebVar = f333700d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333699b);
                            f333700d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
