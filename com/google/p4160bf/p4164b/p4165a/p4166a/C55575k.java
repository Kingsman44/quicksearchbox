package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.k */
/* compiled from: PG */
public final class C55575k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55575k f146629b;

    /* renamed from: d */
    private static volatile C63010eb f146630d;

    /* renamed from: a */
    public String f146631a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f146632c;

    static {
        C55575k kVar = new C55575k();
        f146629b = kVar;
        C62942bv.registerDefaultInstance(C55575k.class, kVar);
    }

    private C55575k() {
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
                return newMessageInfo(f146629b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C55575k();
            case 4:
                return new C55574j();
            case 5:
                return f146629b;
            case 6:
                C63010eb ebVar = f146630d;
                if (ebVar == null) {
                    synchronized (C55575k.class) {
                        ebVar = f146630d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146629b);
                            f146630d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
