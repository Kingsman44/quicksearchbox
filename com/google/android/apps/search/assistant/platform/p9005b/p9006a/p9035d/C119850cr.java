package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.cr */
/* compiled from: PG */
public final class C119850cr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119850cr f333797d;

    /* renamed from: f */
    private static volatile C63010eb f333798f;

    /* renamed from: a */
    public int f333799a;

    /* renamed from: b */
    public C18343b f333800b;

    /* renamed from: c */
    public C119893l f333801c;

    /* renamed from: e */
    private byte f333802e = 2;

    static {
        C119850cr crVar = new C119850cr();
        f333797d = crVar;
        C62942bv.registerDefaultInstance(C119850cr.class, crVar);
    }

    private C119850cr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333802e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333802e = b;
                return null;
            case 2:
                return newMessageInfo(f333797d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C119850cr();
            case 4:
                return new C119849cq();
            case 5:
                return f333797d;
            case 6:
                C63010eb ebVar = f333798f;
                if (ebVar == null) {
                    synchronized (C119850cr.class) {
                        ebVar = f333798f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333797d);
                            f333798f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
