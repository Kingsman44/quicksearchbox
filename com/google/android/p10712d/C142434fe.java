package com.google.android.p10712d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.fe */
/* compiled from: PG */
public final class C142434fe extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C142434fe f386498f;

    /* renamed from: h */
    private static volatile C63010eb f386499h;

    /* renamed from: a */
    public boolean f386500a;

    /* renamed from: b */
    public boolean f386501b;

    /* renamed from: c */
    public boolean f386502c;

    /* renamed from: d */
    public C63088z f386503d = C63088z.f170246b;

    /* renamed from: e */
    public C63088z f386504e = C63088z.f170246b;

    /* renamed from: g */
    private int f386505g;

    static {
        C142434fe feVar = new C142434fe();
        f386498f = feVar;
        C62942bv.registerDefaultInstance(C142434fe.class, feVar);
    }

    private C142434fe() {
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
                return newMessageInfo(f386498f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ည\u0003\u0005ည\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C142434fe();
            case 4:
                return new C142433fd();
            case 5:
                return f386498f;
            case 6:
                C63010eb ebVar = f386499h;
                if (ebVar == null) {
                    synchronized (C142434fe.class) {
                        ebVar = f386499h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386498f);
                            f386499h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
