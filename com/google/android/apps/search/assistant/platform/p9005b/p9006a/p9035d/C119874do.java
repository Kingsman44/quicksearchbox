package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2511d.p2512a.C32510c;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32512e;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.do */
/* compiled from: PG */
public final class C119874do extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119874do f333841c;

    /* renamed from: e */
    private static volatile C63010eb f333842e;

    /* renamed from: a */
    public int f333843a = 0;

    /* renamed from: b */
    public Object f333844b;

    /* renamed from: d */
    private byte f333845d = 2;

    static {
        C119874do doVar = new C119874do();
        f333841c = doVar;
        C62942bv.registerDefaultInstance(C119874do.class, doVar);
    }

    private C119874do() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333845d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333845d = b;
                return null;
            case 2:
                return newMessageInfo(f333841c, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0004\u0001<\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0000\u0005м\u0000", new Object[]{"b", "a", C62912at.class, C119873dn.class, C32512e.class, C119798at.class, C32510c.class});
            case 3:
                return new C119874do();
            case 4:
                return new C119870dk();
            case 5:
                return f333841c;
            case 6:
                C63010eb ebVar = f333842e;
                if (ebVar == null) {
                    synchronized (C119874do.class) {
                        ebVar = f333842e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333841c);
                            f333842e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
