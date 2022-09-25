package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.bg */
/* compiled from: PG */
public final class C55470bg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55470bg f146346f;

    /* renamed from: g */
    private static volatile C63010eb f146347g;

    /* renamed from: a */
    public int f146348a;

    /* renamed from: b */
    public int f146349b = 0;

    /* renamed from: c */
    public Object f146350c;

    /* renamed from: d */
    public String f146351d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C55469bf f146352e;

    static {
        C55470bg bgVar = new C55470bg();
        f146346f = bgVar;
        C62942bv.registerDefaultInstance(C55470bg.class, bgVar);
    }

    private C55470bg() {
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
                return newMessageInfo(f146346f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002့\u0000\u0003ဉ\u0003\u0004ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e"});
            case 3:
                return new C55470bg();
            case 4:
                return new C55461ay();
            case 5:
                return f146346f;
            case 6:
                C63010eb ebVar = f146347g;
                if (ebVar == null) {
                    synchronized (C55470bg.class) {
                        ebVar = f146347g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146346f);
                            f146347g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
