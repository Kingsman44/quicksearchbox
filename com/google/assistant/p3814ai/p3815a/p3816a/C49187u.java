package com.google.assistant.p3814ai.p3815a.p3816a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.u */
/* compiled from: PG */
public final class C49187u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49187u f127173e;

    /* renamed from: f */
    private static volatile C63010eb f127174f;

    /* renamed from: a */
    public int f127175a = 0;

    /* renamed from: b */
    public Object f127176b;

    /* renamed from: c */
    public String f127177c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f127178d;

    static {
        C49187u uVar = new C49187u();
        f127173e = uVar;
        C62942bv.registerDefaultInstance(C49187u.class, uVar);
    }

    private C49187u() {
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
                return newMessageInfo(f127173e, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", C49183q.class});
            case 3:
                return new C49187u();
            case 4:
                return new C49186t();
            case 5:
                return f127173e;
            case 6:
                C63010eb ebVar = f127174f;
                if (ebVar == null) {
                    synchronized (C49187u.class) {
                        ebVar = f127174f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127173e);
                            f127174f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
