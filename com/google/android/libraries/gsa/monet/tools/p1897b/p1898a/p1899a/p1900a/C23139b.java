package com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.a.a.a.b */
/* compiled from: PG */
public final class C23139b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C23139b f63486a;

    /* renamed from: c */
    private static volatile C63010eb f63487c;

    /* renamed from: b */
    private byte f63488b = 2;

    static {
        C23139b bVar = new C23139b();
        f63486a = bVar;
        C62942bv.registerDefaultInstance(C23139b.class, bVar);
    }

    private C23139b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f63488b);
            case 1:
                this.f63488b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f63486a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C23139b();
            case 4:
                return new C23138a();
            case 5:
                return f63486a;
            case 6:
                C63010eb ebVar = f63487c;
                if (ebVar == null) {
                    synchronized (C23139b.class) {
                        ebVar = f63487c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63486a);
                            f63487c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
