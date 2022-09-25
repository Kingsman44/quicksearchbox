package com.google.android.apps.gsa.staticplugins.p7686co.p7692f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.f.b */
/* compiled from: PG */
public final class C98310b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C98310b f274426a;

    /* renamed from: c */
    private static volatile C63010eb f274427c;

    /* renamed from: b */
    private byte f274428b = 2;

    static {
        C98310b bVar = new C98310b();
        f274426a = bVar;
        C62942bv.registerDefaultInstance(C98310b.class, bVar);
    }

    private C98310b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f274428b);
            case 1:
                this.f274428b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f274426a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C98310b();
            case 4:
                return new C98309a();
            case 5:
                return f274426a;
            case 6:
                C63010eb ebVar = f274427c;
                if (ebVar == null) {
                    synchronized (C98310b.class) {
                        ebVar = f274427c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274426a);
                            f274427c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
