package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2511d.p2512a.C32510c;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32512e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.az */
/* compiled from: PG */
public final class C119804az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119804az f333703c;

    /* renamed from: e */
    private static volatile C63010eb f333704e;

    /* renamed from: a */
    public int f333705a = 0;

    /* renamed from: b */
    public Object f333706b;

    /* renamed from: d */
    private byte f333707d = 2;

    static {
        C119804az azVar = new C119804az();
        f333703c = azVar;
        C62942bv.registerDefaultInstance(C119804az.class, azVar);
    }

    private C119804az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333707d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333707d = b;
                return null;
            case 2:
                return newMessageInfo(f333703c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0004\u0001м\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0000", new Object[]{"b", "a", C119803ay.class, C32510c.class, C119800av.class, C32512e.class});
            case 3:
                return new C119804az();
            case 4:
                return new C119801aw();
            case 5:
                return f333703c;
            case 6:
                C63010eb ebVar = f333704e;
                if (ebVar == null) {
                    synchronized (C119804az.class) {
                        ebVar = f333704e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333703c);
                            f333704e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
