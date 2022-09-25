package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bz */
/* compiled from: PG */
public final class C20156bz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20156bz f56539f;

    /* renamed from: h */
    private static volatile C63010eb f56540h;

    /* renamed from: a */
    public String f56541a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C20150bt f56542b;

    /* renamed from: c */
    public double f56543c;

    /* renamed from: d */
    public C20150bt f56544d;

    /* renamed from: e */
    public C62971cq f56545e = emptyProtobufList();

    /* renamed from: g */
    private int f56546g;

    static {
        C20156bz bzVar = new C20156bz();
        f56539f = bzVar;
        C62942bv.registerDefaultInstance(C20156bz.class, bzVar);
    }

    private C20156bz() {
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
                return newMessageInfo(f56539f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003က\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e", C20150bt.class});
            case 3:
                return new C20156bz();
            case 4:
                return new C20155by();
            case 5:
                return f56539f;
            case 6:
                C63010eb ebVar = f56540h;
                if (ebVar == null) {
                    synchronized (C20156bz.class) {
                        ebVar = f56540h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56539f);
                            f56540h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
