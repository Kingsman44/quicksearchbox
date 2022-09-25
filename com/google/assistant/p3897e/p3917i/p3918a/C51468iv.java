package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.iv */
/* compiled from: PG */
public final class C51468iv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51468iv f134081b;

    /* renamed from: d */
    private static volatile C63010eb f134082d;

    /* renamed from: a */
    public String f134083a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f134084c;

    static {
        C51468iv ivVar = new C51468iv();
        f134081b = ivVar;
        C62942bv.registerDefaultInstance(C51468iv.class, ivVar);
    }

    private C51468iv() {
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
                return newMessageInfo(f134081b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51468iv();
            case 4:
                return new C51467iu();
            case 5:
                return f134081b;
            case 6:
                C63010eb ebVar = f134082d;
                if (ebVar == null) {
                    synchronized (C51468iv.class) {
                        ebVar = f134082d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134081b);
                            f134082d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
