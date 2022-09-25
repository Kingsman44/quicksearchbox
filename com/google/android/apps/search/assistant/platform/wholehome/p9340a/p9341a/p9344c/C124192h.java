package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.h */
/* compiled from: PG */
public final class C124192h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C124192h f342949b;

    /* renamed from: c */
    private static volatile C63010eb f342950c;

    /* renamed from: a */
    public boolean f342951a;

    static {
        C124192h hVar = new C124192h();
        f342949b = hVar;
        C62942bv.registerDefaultInstance(C124192h.class, hVar);
    }

    private C124192h() {
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
                return newMessageInfo(f342949b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C124192h();
            case 4:
                return new C124191g();
            case 5:
                return f342949b;
            case 6:
                C63010eb ebVar = f342950c;
                if (ebVar == null) {
                    synchronized (C124192h.class) {
                        ebVar = f342950c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f342949b);
                            f342950c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
