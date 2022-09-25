package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jp */
/* compiled from: PG */
public final class C87950jp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87950jp f237865c;

    /* renamed from: d */
    private static volatile C63010eb f237866d;

    /* renamed from: a */
    public int f237867a;

    /* renamed from: b */
    public boolean f237868b;

    static {
        C87950jp jpVar = new C87950jp();
        f237865c = jpVar;
        C62942bv.registerDefaultInstance(C87950jp.class, jpVar);
    }

    private C87950jp() {
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
                return newMessageInfo(f237865c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87950jp();
            case 4:
                return new C87949jo();
            case 5:
                return f237865c;
            case 6:
                C63010eb ebVar = f237866d;
                if (ebVar == null) {
                    synchronized (C87950jp.class) {
                        ebVar = f237866d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237865c);
                            f237866d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
