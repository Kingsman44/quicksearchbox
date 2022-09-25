package com.google.android.libraries.search.rendering.xuikit.p3131d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.b */
/* compiled from: PG */
public final class C40306b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C40306b f105885a;

    /* renamed from: c */
    private static volatile C63010eb f105886c;

    /* renamed from: b */
    private byte f105887b = 2;

    static {
        C40306b bVar = new C40306b();
        f105885a = bVar;
        C62942bv.registerDefaultInstance(C40306b.class, bVar);
    }

    private C40306b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f105887b);
            case 1:
                this.f105887b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f105885a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C40306b();
            case 4:
                return new C40303a();
            case 5:
                return f105885a;
            case 6:
                C63010eb ebVar = f105886c;
                if (ebVar == null) {
                    synchronized (C40306b.class) {
                        ebVar = f105886c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f105885a);
                            f105886c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
