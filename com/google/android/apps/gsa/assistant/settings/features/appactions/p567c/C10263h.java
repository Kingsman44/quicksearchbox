package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C49849bg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.h */
/* compiled from: PG */
public final class C10263h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C10263h f34789f;

    /* renamed from: g */
    private static volatile C63010eb f34790g;

    /* renamed from: a */
    public int f34791a;

    /* renamed from: b */
    public int f34792b = 0;

    /* renamed from: c */
    public Object f34793c;

    /* renamed from: d */
    public long f34794d;

    /* renamed from: e */
    public C49838aw f34795e;

    static {
        C10263h hVar = new C10263h();
        f34789f = hVar;
        C62942bv.registerDefaultInstance(C10263h.class, hVar);
    }

    private C10263h() {
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
                return newMessageInfo(f34789f, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0003ဂ\u0000\u0004ဉ\u0001\u0005ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C49826ak.class, "d", "e", C49849bg.class});
            case 3:
                return new C10263h();
            case 4:
                return new C10262g();
            case 5:
                return f34789f;
            case 6:
                C63010eb ebVar = f34790g;
                if (ebVar == null) {
                    synchronized (C10263h.class) {
                        ebVar = f34790g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34789f);
                            f34790g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
