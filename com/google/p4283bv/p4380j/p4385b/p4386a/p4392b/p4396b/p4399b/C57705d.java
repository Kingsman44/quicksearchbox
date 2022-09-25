package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.b.b.b.d */
/* compiled from: PG */
public final class C57705d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57705d f154166d;

    /* renamed from: e */
    private static volatile C63010eb f154167e;

    /* renamed from: a */
    public int f154168a;

    /* renamed from: b */
    public int f154169b;

    /* renamed from: c */
    public String f154170c = BuildConfig.FLAVOR;

    static {
        C57705d dVar = new C57705d();
        f154166d = dVar;
        C62942bv.registerDefaultInstance(C57705d.class, dVar);
    }

    private C57705d() {
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
                return newMessageInfo(f154166d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C57703b.f154165a, C45240c.f118157a});
            case 3:
                return new C57705d();
            case 4:
                return new C57702a();
            case 5:
                return f154166d;
            case 6:
                C63010eb ebVar = f154167e;
                if (ebVar == null) {
                    synchronized (C57705d.class) {
                        ebVar = f154167e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154166d);
                            f154167e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
