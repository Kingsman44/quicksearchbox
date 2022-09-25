package com.google.android.libraries.assistant.p1481f.p1483b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.f.b.f */
/* compiled from: PG */
public final class C17951f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C17951f f51407f;

    /* renamed from: g */
    private static volatile C63010eb f51408g;

    /* renamed from: a */
    public int f51409a;

    /* renamed from: b */
    public String f51410b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f51411c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f51412d;

    /* renamed from: e */
    public String f51413e = BuildConfig.FLAVOR;

    static {
        C17951f fVar = new C17951f();
        f51407f = fVar;
        C62942bv.registerDefaultInstance(C17951f.class, fVar);
    }

    private C17951f() {
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
                return newMessageInfo(f51407f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C17951f();
            case 4:
                return new C17950e();
            case 5:
                return f51407f;
            case 6:
                C63010eb ebVar = f51408g;
                if (ebVar == null) {
                    synchronized (C17951f.class) {
                        ebVar = f51408g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51407f);
                            f51408g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
