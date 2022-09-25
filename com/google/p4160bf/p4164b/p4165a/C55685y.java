package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.y */
/* compiled from: PG */
public final class C55685y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55685y f146912f;

    /* renamed from: g */
    private static volatile C63010eb f146913g;

    /* renamed from: a */
    public int f146914a;

    /* renamed from: b */
    public String f146915b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f146916c;

    /* renamed from: d */
    public String f146917d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f146918e;

    static {
        C55685y yVar = new C55685y();
        f146912f = yVar;
        C62942bv.registerDefaultInstance(C55685y.class, yVar);
    }

    private C55685y() {
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
                return newMessageInfo(f146912f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004", new Object[]{"a", "b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C55685y();
            case 4:
                return new C55684x();
            case 5:
                return f146912f;
            case 6:
                C63010eb ebVar = f146913g;
                if (ebVar == null) {
                    synchronized (C55685y.class) {
                        ebVar = f146913g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146912f);
                            f146913g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
