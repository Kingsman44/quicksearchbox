package com.google.assistant.p3897e.p3921j.p3922a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.a.x */
/* compiled from: PG */
public final class C51666x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51666x f134615e;

    /* renamed from: f */
    private static volatile C63010eb f134616f;

    /* renamed from: a */
    public int f134617a;

    /* renamed from: b */
    public String f134618b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51665w f134619c;

    /* renamed from: d */
    public int f134620d;

    static {
        C51666x xVar = new C51666x();
        f134615e = xVar;
        C62942bv.registerDefaultInstance(C51666x.class, xVar);
    }

    private C51666x() {
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
                return newMessageInfo(f134615e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C51662t.f134609a});
            case 3:
                return new C51666x();
            case 4:
                return new C51661s();
            case 5:
                return f134615e;
            case 6:
                C63010eb ebVar = f134616f;
                if (ebVar == null) {
                    synchronized (C51666x.class) {
                        ebVar = f134616f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134615e);
                            f134616f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
