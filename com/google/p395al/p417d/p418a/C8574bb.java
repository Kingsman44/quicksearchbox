package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.bb */
/* compiled from: PG */
public final class C8574bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8574bb f29685d;

    /* renamed from: e */
    private static volatile C63010eb f29686e;

    /* renamed from: a */
    public int f29687a;

    /* renamed from: b */
    public String f29688b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f29689c;

    static {
        C8574bb bbVar = new C8574bb();
        f29685d = bbVar;
        C62942bv.registerDefaultInstance(C8574bb.class, bbVar);
    }

    private C8574bb() {
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
                return newMessageInfo(f29685d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8574bb();
            case 4:
                return new C8573ba();
            case 5:
                return f29685d;
            case 6:
                C63010eb ebVar = f29686e;
                if (ebVar == null) {
                    synchronized (C8574bb.class) {
                        ebVar = f29686e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29685d);
                            f29686e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
