package com.google.assistant.p3825an.p3836f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.an.f.f */
/* compiled from: PG */
public final class C49380f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49380f f127628f;

    /* renamed from: g */
    private static volatile C63010eb f127629g;

    /* renamed from: a */
    public int f127630a;

    /* renamed from: b */
    public C49377c f127631b;

    /* renamed from: c */
    public String f127632c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f127633d = C63088z.f170246b;

    /* renamed from: e */
    public C62971cq f127634e = emptyProtobufList();

    static {
        C49380f fVar = new C49380f();
        f127628f = fVar;
        C62942bv.registerDefaultInstance(C49380f.class, fVar);
    }

    private C49380f() {
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
                return newMessageInfo(f127628f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003\u001b\u0004ည\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C49379e.class, "d"});
            case 3:
                return new C49380f();
            case 4:
                return new C49373a();
            case 5:
                return f127628f;
            case 6:
                C63010eb ebVar = f127629g;
                if (ebVar == null) {
                    synchronized (C49380f.class) {
                        ebVar = f127629g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127628f);
                            f127629g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
