package com.google.android.libraries.assistant.auto.ondevice.utils.p715a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.a.b */
/* compiled from: PG */
public final class C11934b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11934b f38331c;

    /* renamed from: e */
    private static volatile C63010eb f38332e;

    /* renamed from: a */
    public int f38333a = 0;

    /* renamed from: b */
    public Object f38334b;

    /* renamed from: d */
    private byte f38335d = 2;

    static {
        C11934b bVar = new C11934b();
        f38331c = bVar;
        C62942bv.registerDefaultInstance(C11934b.class, bVar);
    }

    private C11934b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38335d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38335d = b;
                return null;
            case 2:
                return newMessageInfo(f38331c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C11938f.class, C11936d.class});
            case 3:
                return new C11934b();
            case 4:
                return new C11933a();
            case 5:
                return f38331c;
            case 6:
                C63010eb ebVar = f38332e;
                if (ebVar == null) {
                    synchronized (C11934b.class) {
                        ebVar = f38332e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38331c);
                            f38332e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
