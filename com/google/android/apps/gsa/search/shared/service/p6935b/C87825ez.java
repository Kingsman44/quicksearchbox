package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ez */
/* compiled from: PG */
public final class C87825ez extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87825ez f237627c;

    /* renamed from: d */
    private static volatile C63010eb f237628d;

    /* renamed from: a */
    public int f237629a;

    /* renamed from: b */
    public int f237630b;

    static {
        C87825ez ezVar = new C87825ez();
        f237627c = ezVar;
        C62942bv.registerDefaultInstance(C87825ez.class, ezVar);
    }

    private C87825ez() {
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
                return newMessageInfo(f237627c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C87823ex.f237626a});
            case 3:
                return new C87825ez();
            case 4:
                return new C87822ew();
            case 5:
                return f237627c;
            case 6:
                C63010eb ebVar = f237628d;
                if (ebVar == null) {
                    synchronized (C87825ez.class) {
                        ebVar = f237628d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237627c);
                            f237628d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
