package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.e.d */
/* compiled from: PG */
public final class C15737d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C15737d f46919f;

    /* renamed from: g */
    private static volatile C63010eb f46920g;

    /* renamed from: a */
    public int f46921a;

    /* renamed from: b */
    public String f46922b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f46923c;

    /* renamed from: d */
    public String f46924d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f46925e = BuildConfig.FLAVOR;

    static {
        C15737d dVar = new C15737d();
        f46919f = dVar;
        C62942bv.registerDefaultInstance(C15737d.class, dVar);
    }

    private C15737d() {
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
                return newMessageInfo(f46919f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C15737d();
            case 4:
                return new C15736c();
            case 5:
                return f46919f;
            case 6:
                C63010eb ebVar = f46920g;
                if (ebVar == null) {
                    synchronized (C15737d.class) {
                        ebVar = f46920g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f46919f);
                            f46920g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
