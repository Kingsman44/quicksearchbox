package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bv */
/* compiled from: PG */
public final class C64488bv extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64488bv f174910i;

    /* renamed from: j */
    private static volatile C63010eb f174911j;

    /* renamed from: a */
    public int f174912a = 0;

    /* renamed from: b */
    public Object f174913b;

    /* renamed from: c */
    public int f174914c;

    /* renamed from: d */
    public String f174915d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f174916e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f174917f = emptyProtobufList();

    /* renamed from: g */
    public int f174918g;

    /* renamed from: h */
    public boolean f174919h;

    static {
        C64488bv bvVar = new C64488bv();
        f174910i = bvVar;
        C62942bv.registerDefaultInstance(C64488bv.class, bvVar);
    }

    private C64488bv() {
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
                return newMessageInfo(f174910i, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b", new Object[]{"b", "a", C45240c.f118157a, "d", C30325g.f82003a, C64507cn.class, C64476bj.class, C64490bx.class, C64478bl.class, C19618h.f54585a, "e", C10662f.f35572a, C64519cz.class});
            case 3:
                return new C64488bv();
            case 4:
                return new C64487bu();
            case 5:
                return f174910i;
            case 6:
                C63010eb ebVar = f174911j;
                if (ebVar == null) {
                    synchronized (C64488bv.class) {
                        ebVar = f174911j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174910i);
                            f174911j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
