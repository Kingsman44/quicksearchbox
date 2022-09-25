package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.p */
/* compiled from: PG */
public final class C80070p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80070p f219716a;

    /* renamed from: b */
    private static volatile C63010eb f219717b;

    static {
        C80070p pVar = new C80070p();
        f219716a = pVar;
        C62942bv.registerDefaultInstance(C80070p.class, pVar);
    }

    private C80070p() {
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
                return newMessageInfo(f219716a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80070p();
            case 4:
                return new C80069o();
            case 5:
                return f219716a;
            case 6:
                C63010eb ebVar = f219717b;
                if (ebVar == null) {
                    synchronized (C80070p.class) {
                        ebVar = f219717b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219716a);
                            f219717b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
