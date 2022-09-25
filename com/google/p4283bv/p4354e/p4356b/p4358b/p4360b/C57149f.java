package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.f */
/* compiled from: PG */
public final class C57149f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57149f f152565f;

    /* renamed from: h */
    private static volatile C63010eb f152566h;

    /* renamed from: a */
    public String f152567a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f152568b;

    /* renamed from: c */
    public boolean f152569c;

    /* renamed from: d */
    public boolean f152570d;

    /* renamed from: e */
    public int f152571e;

    /* renamed from: g */
    private int f152572g;

    static {
        C57149f fVar = new C57149f();
        f152565f = fVar;
        C62942bv.registerDefaultInstance(C57149f.class, fVar);
    }

    private C57149f() {
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
                return newMessageInfo(f152565f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57149f();
            case 4:
                return new C57148e();
            case 5:
                return f152565f;
            case 6:
                C63010eb ebVar = f152566h;
                if (ebVar == null) {
                    synchronized (C57149f.class) {
                        ebVar = f152566h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152565f);
                            f152566h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
