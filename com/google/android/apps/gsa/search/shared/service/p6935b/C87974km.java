package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.km */
/* compiled from: PG */
public final class C87974km extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87974km f237924b;

    /* renamed from: d */
    private static volatile C63010eb f237925d;

    /* renamed from: a */
    public C87973kl f237926a;

    /* renamed from: c */
    private int f237927c;

    static {
        C87974km kmVar = new C87974km();
        f237924b = kmVar;
        C62942bv.registerDefaultInstance(C87974km.class, kmVar);
    }

    private C87974km() {
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
                return newMessageInfo(f237924b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87974km();
            case 4:
                return new C87971kj();
            case 5:
                return f237924b;
            case 6:
                C63010eb ebVar = f237925d;
                if (ebVar == null) {
                    synchronized (C87974km.class) {
                        ebVar = f237925d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237924b);
                            f237925d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
