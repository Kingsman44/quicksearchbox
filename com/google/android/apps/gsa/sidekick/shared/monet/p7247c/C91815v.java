package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.v */
/* compiled from: PG */
public final class C91815v extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C91815v f256065j;

    /* renamed from: k */
    private static volatile C63010eb f256066k;

    /* renamed from: a */
    public int f256067a;

    /* renamed from: b */
    public int f256068b;

    /* renamed from: c */
    public String f256069c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f256070d;

    /* renamed from: e */
    public String f256071e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f256072f;

    /* renamed from: g */
    public int f256073g;

    /* renamed from: h */
    public int f256074h;

    /* renamed from: i */
    public int f256075i;

    static {
        C91815v vVar = new C91815v();
        f256065j = vVar;
        C62942bv.registerDefaultInstance(C91815v.class, vVar);
    }

    private C91815v() {
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
                return newMessageInfo(f256065j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C91815v();
            case 4:
                return new C91814u();
            case 5:
                return f256065j;
            case 6:
                C63010eb ebVar = f256066k;
                if (ebVar == null) {
                    synchronized (C91815v.class) {
                        ebVar = f256066k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256065j);
                            f256066k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
