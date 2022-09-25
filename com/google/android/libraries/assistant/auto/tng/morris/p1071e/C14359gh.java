package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gh */
/* compiled from: PG */
public final class C14359gh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14359gh f43450d;

    /* renamed from: f */
    private static volatile C63010eb f43451f;

    /* renamed from: a */
    public C14603pi f43452a;

    /* renamed from: b */
    public C14603pi f43453b;

    /* renamed from: c */
    public C14603pi f43454c;

    /* renamed from: e */
    private byte f43455e = 2;

    static {
        C14359gh ghVar = new C14359gh();
        f43450d = ghVar;
        C62942bv.registerDefaultInstance(C14359gh.class, ghVar);
    }

    private C14359gh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43455e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43455e = b;
                return null;
            case 2:
                return newMessageInfo(f43450d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001Љ\u0002Љ\u0003Љ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14359gh();
            case 4:
                return new C14358gg();
            case 5:
                return f43450d;
            case 6:
                C63010eb ebVar = f43451f;
                if (ebVar == null) {
                    synchronized (C14359gh.class) {
                        ebVar = f43451f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43450d);
                            f43451f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
