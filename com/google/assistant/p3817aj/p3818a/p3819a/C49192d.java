package com.google.assistant.p3817aj.p3818a.p3819a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aj.a.a.d */
/* compiled from: PG */
public final class C49192d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49192d f127199e;

    /* renamed from: f */
    private static volatile C63010eb f127200f;

    /* renamed from: a */
    public int f127201a;

    /* renamed from: b */
    public int f127202b;

    /* renamed from: c */
    public String f127203c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f127204d = BuildConfig.FLAVOR;

    static {
        C49192d dVar = new C49192d();
        f127199e = dVar;
        C62942bv.registerDefaultInstance(C49192d.class, dVar);
    }

    private C49192d() {
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
                return newMessageInfo(f127199e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C49190b.m85388b(), C45240c.f118157a, "d"});
            case 3:
                return new C49192d();
            case 4:
                return new C49191c();
            case 5:
                return f127199e;
            case 6:
                C63010eb ebVar = f127200f;
                if (ebVar == null) {
                    synchronized (C49192d.class) {
                        ebVar = f127200f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127199e);
                            f127200f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
