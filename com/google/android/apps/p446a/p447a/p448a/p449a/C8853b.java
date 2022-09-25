package com.google.android.apps.p446a.p447a.p448a.p449a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.a.a.a.a.b */
/* compiled from: PG */
public final class C8853b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8853b f30764a;

    /* renamed from: b */
    private static volatile C63010eb f30765b;

    static {
        C8853b bVar = new C8853b();
        f30764a = bVar;
        C62942bv.registerDefaultInstance(C8853b.class, bVar);
    }

    private C8853b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f30764a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8853b();
            case 4:
                return new C8852a();
            case 5:
                return f30764a;
            case 6:
                C63010eb ebVar = f30765b;
                if (ebVar == null) {
                    synchronized (C8853b.class) {
                        ebVar = f30765b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30764a);
                            f30765b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
