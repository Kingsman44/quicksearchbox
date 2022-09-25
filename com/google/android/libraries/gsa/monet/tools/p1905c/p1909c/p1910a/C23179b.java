package com.google.android.libraries.gsa.monet.tools.p1905c.p1909c.p1910a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.tools.c.c.a.b */
/* compiled from: PG */
public final class C23179b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C23179b f63565a;

    /* renamed from: c */
    private static volatile C63010eb f63566c;

    /* renamed from: b */
    private byte f63567b = 2;

    static {
        C23179b bVar = new C23179b();
        f63565a = bVar;
        C62942bv.registerDefaultInstance(C23179b.class, bVar);
    }

    private C23179b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f63567b);
            case 1:
                this.f63567b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f63565a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C23179b();
            case 4:
                return new C23178a();
            case 5:
                return f63565a;
            case 6:
                C63010eb ebVar = f63566c;
                if (ebVar == null) {
                    synchronized (C23179b.class) {
                        ebVar = f63566c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63565a);
                            f63566c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
