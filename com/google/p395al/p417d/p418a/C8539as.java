package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.as */
/* compiled from: PG */
public final class C8539as extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8539as f29624f;

    /* renamed from: g */
    private static volatile C63010eb f29625g;

    /* renamed from: a */
    public int f29626a;

    /* renamed from: b */
    public String f29627b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f29628c;

    /* renamed from: d */
    public boolean f29629d;

    /* renamed from: e */
    public long f29630e;

    static {
        C8539as asVar = new C8539as();
        f29624f = asVar;
        C62942bv.registerDefaultInstance(C8539as.class, asVar);
    }

    private C8539as() {
        emptyProtobufList();
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
                return newMessageInfo(f29624f, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0000\u0003ဈ\u0002\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဃ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8539as();
            case 4:
                return new C8538ar();
            case 5:
                return f29624f;
            case 6:
                C63010eb ebVar = f29625g;
                if (ebVar == null) {
                    synchronized (C8539as.class) {
                        ebVar = f29625g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29624f);
                            f29625g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
