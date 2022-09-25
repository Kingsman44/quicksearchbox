package com.google.android.libraries.gsa.p1863e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.e.d */
/* compiled from: PG */
public final class C22803d extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C22803d f62771k;

    /* renamed from: m */
    private static volatile C63010eb f62772m;

    /* renamed from: a */
    public int f62773a;

    /* renamed from: b */
    public boolean f62774b;

    /* renamed from: c */
    public boolean f62775c;

    /* renamed from: d */
    public boolean f62776d;

    /* renamed from: e */
    public int f62777e;

    /* renamed from: f */
    public C7669fo f62778f;

    /* renamed from: g */
    public C62971cq f62779g = emptyProtobufList();

    /* renamed from: h */
    public String f62780h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f62781i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f62782j = BuildConfig.FLAVOR;

    /* renamed from: l */
    private byte f62783l = 2;

    static {
        C22803d dVar = new C22803d();
        f62771k = dVar;
        C62942bv.registerDefaultInstance(C22803d.class, dVar);
    }

    private C22803d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f62783l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f62783l = b;
                return null;
            case 2:
                return newMessageInfo(f62771k, "\u0001\t\u0000\u0001\u0002\u0011\t\u0000\u0001\u0001\u0002ဇ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\nဉ\u0007\fЛ\u000fဈ\b\u0010ဈ\t\u0011ဈ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C22801b.class, C19618h.f54585a, "i", "j"});
            case 3:
                return new C22803d();
            case 4:
                return new C22802c();
            case 5:
                return f62771k;
            case 6:
                C63010eb ebVar = f62772m;
                if (ebVar == null) {
                    synchronized (C22803d.class) {
                        ebVar = f62772m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62771k);
                            f62772m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
