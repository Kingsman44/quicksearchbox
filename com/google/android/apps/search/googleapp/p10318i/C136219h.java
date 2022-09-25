package com.google.android.apps.search.googleapp.p10318i;

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

/* renamed from: com.google.android.apps.search.googleapp.i.h */
/* compiled from: PG */
public final class C136219h extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C136219h f370977i;

    /* renamed from: j */
    private static volatile C63010eb f370978j;

    /* renamed from: a */
    public int f370979a;

    /* renamed from: b */
    public int f370980b;

    /* renamed from: c */
    public int f370981c;

    /* renamed from: d */
    public int f370982d;

    /* renamed from: e */
    public int f370983e;

    /* renamed from: f */
    public C62971cq f370984f = emptyProtobufList();

    /* renamed from: g */
    public String f370985g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f370986h;

    static {
        C136219h hVar = new C136219h();
        f370977i = hVar;
        C62942bv.registerDefaultInstance(C136219h.class, hVar);
    }

    private C136219h() {
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
                return newMessageInfo(f370977i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001b\u0006ဈ\u0004\u0007င\u0005", new Object[]{"a", "b", C136221j.f370991a, C45240c.f118157a, "d", "e", C10662f.f35572a, C136217f.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C136219h();
            case 4:
                return new C136218g();
            case 5:
                return f370977i;
            case 6:
                C63010eb ebVar = f370978j;
                if (ebVar == null) {
                    synchronized (C136219h.class) {
                        ebVar = f370978j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370977i);
                            f370978j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
