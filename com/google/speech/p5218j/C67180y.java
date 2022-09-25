package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.y */
/* compiled from: PG */
public final class C67180y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C67180y f182596f;

    /* renamed from: g */
    private static volatile C63010eb f182597g;

    /* renamed from: a */
    public int f182598a;

    /* renamed from: b */
    public String f182599b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f182600c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f182601d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f182602e;

    static {
        C67180y yVar = new C67180y();
        f182596f = yVar;
        C62942bv.registerDefaultInstance(C67180y.class, yVar);
    }

    private C67180y() {
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
                return newMessageInfo(f182596f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C67180y();
            case 4:
                return new C67179x();
            case 5:
                return f182596f;
            case 6:
                C63010eb ebVar = f182597g;
                if (ebVar == null) {
                    synchronized (C67180y.class) {
                        ebVar = f182597g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182596f);
                            f182597g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
