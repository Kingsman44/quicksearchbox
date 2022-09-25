package com.google.assistant.p3825an.p3834e.p3835a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.e.a.f */
/* compiled from: PG */
public final class C49364f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49364f f127597d;

    /* renamed from: e */
    private static volatile C63010eb f127598e;

    /* renamed from: a */
    public int f127599a;

    /* renamed from: b */
    public String f127600b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f127601c;

    static {
        C49364f fVar = new C49364f();
        f127597d = fVar;
        C62942bv.registerDefaultInstance(C49364f.class, fVar);
    }

    private C49364f() {
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
                return newMessageInfo(f127597d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49364f();
            case 4:
                return new C49363e();
            case 5:
                return f127597d;
            case 6:
                C63010eb ebVar = f127598e;
                if (ebVar == null) {
                    synchronized (C49364f.class) {
                        ebVar = f127598e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127597d);
                            f127598e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
