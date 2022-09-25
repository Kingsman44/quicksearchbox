package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.h */
/* compiled from: PG */
public final class C80062h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80062h f219705b;

    /* renamed from: c */
    private static volatile C63010eb f219706c;

    /* renamed from: a */
    public long f219707a;

    static {
        C80062h hVar = new C80062h();
        f219705b = hVar;
        C62942bv.registerDefaultInstance(C80062h.class, hVar);
    }

    private C80062h() {
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
                return newMessageInfo(f219705b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new C80062h();
            case 4:
                return new C80061g();
            case 5:
                return f219705b;
            case 6:
                C63010eb ebVar = f219706c;
                if (ebVar == null) {
                    synchronized (C80062h.class) {
                        ebVar = f219706c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219705b);
                            f219706c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
