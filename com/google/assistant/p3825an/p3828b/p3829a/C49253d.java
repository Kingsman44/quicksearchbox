package com.google.assistant.p3825an.p3828b.p3829a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.b.a.d */
/* compiled from: PG */
public final class C49253d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49253d f127320e;

    /* renamed from: f */
    private static volatile C63010eb f127321f;

    /* renamed from: a */
    public int f127322a;

    /* renamed from: b */
    public int f127323b;

    /* renamed from: c */
    public String f127324c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f127325d;

    static {
        C49253d dVar = new C49253d();
        f127320e = dVar;
        C62942bv.registerDefaultInstance(C49253d.class, dVar);
    }

    private C49253d() {
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
                return newMessageInfo(f127320e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003Ȉ\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49253d();
            case 4:
                return new C49252c();
            case 5:
                return f127320e;
            case 6:
                C63010eb ebVar = f127321f;
                if (ebVar == null) {
                    synchronized (C49253d.class) {
                        ebVar = f127321f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127320e);
                            f127321f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
