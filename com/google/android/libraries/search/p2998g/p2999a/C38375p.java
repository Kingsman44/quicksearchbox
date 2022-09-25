package com.google.android.libraries.search.p2998g.p2999a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.p */
/* compiled from: PG */
public final class C38375p extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C38375p f101603h;

    /* renamed from: j */
    private static volatile C63010eb f101604j;

    /* renamed from: a */
    public int f101605a;

    /* renamed from: b */
    public String f101606b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f101607c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f101608d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C38370k f101609e;

    /* renamed from: f */
    public C38377r f101610f;

    /* renamed from: g */
    public int f101611g;

    /* renamed from: i */
    private byte f101612i = 2;

    static {
        C38375p pVar = new C38375p();
        f101603h = pVar;
        C62942bv.registerDefaultInstance(C38375p.class, pVar);
    }

    private C38375p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f101612i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f101612i = b;
                return null;
            case 2:
                return newMessageInfo(f101603h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C38373n.f101602a});
            case 3:
                return new C38375p();
            case 4:
                return new C38372m();
            case 5:
                return f101603h;
            case 6:
                C63010eb ebVar = f101604j;
                if (ebVar == null) {
                    synchronized (C38375p.class) {
                        ebVar = f101604j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101603h);
                            f101604j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
