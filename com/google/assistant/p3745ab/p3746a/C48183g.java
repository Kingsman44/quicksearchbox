package com.google.assistant.p3745ab.p3746a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.g */
/* compiled from: PG */
public final class C48183g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48183g f124670f;

    /* renamed from: g */
    private static volatile C63010eb f124671g;

    /* renamed from: a */
    public int f124672a;

    /* renamed from: b */
    public String f124673b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f124674c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f124675d;

    /* renamed from: e */
    public long f124676e;

    static {
        C48183g gVar = new C48183g();
        f124670f = gVar;
        C62942bv.registerDefaultInstance(C48183g.class, gVar);
    }

    private C48183g() {
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
                return newMessageInfo(f124670f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48183g();
            case 4:
                return new C48182f();
            case 5:
                return f124670f;
            case 6:
                C63010eb ebVar = f124671g;
                if (ebVar == null) {
                    synchronized (C48183g.class) {
                        ebVar = f124671g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124670f);
                            f124671g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
