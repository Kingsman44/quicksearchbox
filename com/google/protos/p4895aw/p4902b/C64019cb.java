package com.google.protos.p4895aw.p4902b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.cb */
/* compiled from: PG */
public final class C64019cb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64019cb f173113f;

    /* renamed from: h */
    private static volatile C63010eb f173114h;

    /* renamed from: a */
    public C64098p f173115a;

    /* renamed from: b */
    public String f173116b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f173117c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f173118d;

    /* renamed from: e */
    public boolean f173119e;

    /* renamed from: g */
    private int f173120g;

    static {
        C64019cb cbVar = new C64019cb();
        f173113f = cbVar;
        C62942bv.registerDefaultInstance(C64019cb.class, cbVar);
    }

    private C64019cb() {
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
                return newMessageInfo(f173113f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0004ည\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64019cb();
            case 4:
                return new C64018ca();
            case 5:
                return f173113f;
            case 6:
                C63010eb ebVar = f173114h;
                if (ebVar == null) {
                    synchronized (C64019cb.class) {
                        ebVar = f173114h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173113f);
                            f173114h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
