package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.fedora.e.aj */
/* compiled from: PG */
public final class C132779aj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C132779aj f362244h;

    /* renamed from: i */
    private static volatile C63010eb f362245i;

    /* renamed from: a */
    public int f362246a;

    /* renamed from: b */
    public boolean f362247b;

    /* renamed from: c */
    public String f362248c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f362249d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C132778ai f362250e;

    /* renamed from: f */
    public C63042fg f362251f;

    /* renamed from: g */
    public boolean f362252g;

    static {
        C132779aj ajVar = new C132779aj();
        f362244h = ajVar;
        C62942bv.registerDefaultInstance(C132779aj.class, ajVar);
    }

    private C132779aj() {
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
                return newMessageInfo(f362244h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003\u001a\u0006ဉ\u0002\tဉ\u0005\nဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C132779aj();
            case 4:
                return new C132776ag();
            case 5:
                return f362244h;
            case 6:
                C63010eb ebVar = f362245i;
                if (ebVar == null) {
                    synchronized (C132779aj.class) {
                        ebVar = f362245i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362244h);
                            f362245i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
