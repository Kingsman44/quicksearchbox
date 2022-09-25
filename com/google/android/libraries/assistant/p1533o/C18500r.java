package com.google.android.libraries.assistant.p1533o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.r */
/* compiled from: PG */
public final class C18500r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C18500r f52444e;

    /* renamed from: f */
    private static volatile C63010eb f52445f;

    /* renamed from: a */
    public String f52446a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f52447b;

    /* renamed from: c */
    public String f52448c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f52449d;

    static {
        C18500r rVar = new C18500r();
        f52444e = rVar;
        C62942bv.registerDefaultInstance(C18500r.class, rVar);
    }

    private C18500r() {
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
                return newMessageInfo(f52444e, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0006Ȉ\u0007\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C18500r();
            case 4:
                return new C18499q();
            case 5:
                return f52444e;
            case 6:
                C63010eb ebVar = f52445f;
                if (ebVar == null) {
                    synchronized (C18500r.class) {
                        ebVar = f52445f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52444e);
                            f52445f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
