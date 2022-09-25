package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ow */
/* compiled from: PG */
public final class C14590ow extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14590ow f44104b;

    /* renamed from: d */
    private static volatile C63010eb f44105d;

    /* renamed from: a */
    public C53435nu f44106a;

    /* renamed from: c */
    private byte f44107c = 2;

    static {
        C14590ow owVar = new C14590ow();
        f44104b = owVar;
        C62942bv.registerDefaultInstance(C14590ow.class, owVar);
    }

    private C14590ow() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44107c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f44107c = b;
                return null;
            case 2:
                return newMessageInfo(f44104b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C14590ow();
            case 4:
                return new C14589ov();
            case 5:
                return f44104b;
            case 6:
                C63010eb ebVar = f44105d;
                if (ebVar == null) {
                    synchronized (C14590ow.class) {
                        ebVar = f44105d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44104b);
                            f44105d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
