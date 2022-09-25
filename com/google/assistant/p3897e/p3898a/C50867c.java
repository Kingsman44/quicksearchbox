package com.google.assistant.p3897e.p3898a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.a.c */
/* compiled from: PG */
public final class C50867c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50867c f132440d;

    /* renamed from: e */
    private static volatile C63010eb f132441e;

    /* renamed from: a */
    public int f132442a;

    /* renamed from: b */
    public String f132443b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132444c = BuildConfig.FLAVOR;

    static {
        C50867c cVar = new C50867c();
        f132440d = cVar;
        C62942bv.registerDefaultInstance(C50867c.class, cVar);
    }

    private C50867c() {
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
                return newMessageInfo(f132440d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50867c();
            case 4:
                return new C50866b();
            case 5:
                return f132440d;
            case 6:
                C63010eb ebVar = f132441e;
                if (ebVar == null) {
                    synchronized (C50867c.class) {
                        ebVar = f132441e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132440d);
                            f132441e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
