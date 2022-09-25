package com.google.android.apps.gsa.assist;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.au */
/* compiled from: PG */
public final class C9350au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9350au f32472c;

    /* renamed from: d */
    private static volatile C63010eb f32473d;

    /* renamed from: a */
    public int f32474a;

    /* renamed from: b */
    public boolean f32475b;

    static {
        C9350au auVar = new C9350au();
        f32472c = auVar;
        C62942bv.registerDefaultInstance(C9350au.class, auVar);
    }

    private C9350au() {
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
                return newMessageInfo(f32472c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9350au();
            case 4:
                return new C9349at();
            case 5:
                return f32472c;
            case 6:
                C63010eb ebVar = f32473d;
                if (ebVar == null) {
                    synchronized (C9350au.class) {
                        ebVar = f32473d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32472c);
                            f32473d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
