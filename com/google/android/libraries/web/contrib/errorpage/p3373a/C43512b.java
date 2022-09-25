package com.google.android.libraries.web.contrib.errorpage.p3373a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.a.b */
/* compiled from: PG */
public final class C43512b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C43512b f113627a;

    /* renamed from: c */
    private static volatile C63010eb f113628c;

    /* renamed from: b */
    private byte f113629b = 2;

    static {
        C43512b bVar = new C43512b();
        f113627a = bVar;
        C62942bv.registerDefaultInstance(C43512b.class, bVar);
    }

    private C43512b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f113629b);
            case 1:
                this.f113629b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f113627a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C43512b();
            case 4:
                return new C43508a();
            case 5:
                return f113627a;
            case 6:
                C63010eb ebVar = f113628c;
                if (ebVar == null) {
                    synchronized (C43512b.class) {
                        ebVar = f113628c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113627a);
                            f113628c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
