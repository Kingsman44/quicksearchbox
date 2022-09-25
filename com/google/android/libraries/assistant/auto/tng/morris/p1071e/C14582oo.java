package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.oo */
/* compiled from: PG */
public final class C14582oo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14582oo f44087c;

    /* renamed from: d */
    private static volatile C63010eb f44088d;

    /* renamed from: a */
    public C14348fx f44089a;

    /* renamed from: b */
    public boolean f44090b;

    static {
        C14582oo ooVar = new C14582oo();
        f44087c = ooVar;
        C62942bv.registerDefaultInstance(C14582oo.class, ooVar);
    }

    private C14582oo() {
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
                return newMessageInfo(f44087c, "\u0000\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004\t\u0005\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14582oo();
            case 4:
                return new C14581on();
            case 5:
                return f44087c;
            case 6:
                C63010eb ebVar = f44088d;
                if (ebVar == null) {
                    synchronized (C14582oo.class) {
                        ebVar = f44088d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44087c);
                            f44088d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
