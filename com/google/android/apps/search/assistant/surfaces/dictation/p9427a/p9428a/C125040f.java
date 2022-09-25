package com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.a.f */
/* compiled from: PG */
public final class C125040f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C125040f f344977e;

    /* renamed from: f */
    private static volatile C63010eb f344978f;

    /* renamed from: a */
    public String f344979a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f344980b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f344981c;

    /* renamed from: d */
    public C125143dq f344982d;

    static {
        C125040f fVar = new C125040f();
        f344977e = fVar;
        C62942bv.registerDefaultInstance(C125040f.class, fVar);
    }

    private C125040f() {
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
                return newMessageInfo(f344977e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C125040f();
            case 4:
                return new C125039e();
            case 5:
                return f344977e;
            case 6:
                C63010eb ebVar = f344978f;
                if (ebVar == null) {
                    synchronized (C125040f.class) {
                        ebVar = f344978f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344977e);
                            f344978f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
