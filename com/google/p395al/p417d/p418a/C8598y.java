package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.al.d.a.y */
/* compiled from: PG */
public final class C8598y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8598y f29750f;

    /* renamed from: g */
    public static final C62940bt f29751g;

    /* renamed from: h */
    private static volatile C63010eb f29752h;

    /* renamed from: a */
    public int f29753a;

    /* renamed from: b */
    public String f29754b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f29755c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f29756d;

    /* renamed from: e */
    public boolean f29757e;

    static {
        C8598y yVar = new C8598y();
        f29750f = yVar;
        C62942bv.registerDefaultInstance(C8598y.class, yVar);
        f29751g = C62942bv.newSingularGeneratedExtension(C8523ac.f29564e, yVar, yVar, (C62958ce) null, 111, C63066gd.MESSAGE, C8598y.class);
    }

    private C8598y() {
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
                return newMessageInfo(f29750f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8598y();
            case 4:
                return new C8597x();
            case 5:
                return f29750f;
            case 6:
                C63010eb ebVar = f29752h;
                if (ebVar == null) {
                    synchronized (C8598y.class) {
                        ebVar = f29752h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29750f);
                            f29752h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
