package com.google.android.libraries.lens.view.feedback;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.feedback.h */
/* compiled from: PG */
public final class C25817h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25817h f70153b;

    /* renamed from: c */
    private static volatile C63010eb f70154c;

    /* renamed from: a */
    public boolean f70155a;

    static {
        C25817h hVar = new C25817h();
        f70153b = hVar;
        C62942bv.registerDefaultInstance(C25817h.class, hVar);
    }

    private C25817h() {
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
                return newMessageInfo(f70153b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C25817h();
            case 4:
                return new C25816g();
            case 5:
                return f70153b;
            case 6:
                C63010eb ebVar = f70154c;
                if (ebVar == null) {
                    synchronized (C25817h.class) {
                        ebVar = f70154c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f70153b);
                            f70154c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
