package com.google.android.gms.usonia.p10881d.p10882a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.usonia.d.a.d */
/* compiled from: PG */
public final class C146176d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C146176d f394956a;

    /* renamed from: b */
    private static volatile C63010eb f394957b;

    static {
        C146176d dVar = new C146176d();
        f394956a = dVar;
        C62942bv.registerDefaultInstance(C146176d.class, dVar);
    }

    private C146176d() {
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
                return newMessageInfo(f394956a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C146176d();
            case 4:
                return new C146175c();
            case 5:
                return f394956a;
            case 6:
                C63010eb ebVar = f394957b;
                if (ebVar == null) {
                    synchronized (C146176d.class) {
                        ebVar = f394957b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f394956a);
                            f394957b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
