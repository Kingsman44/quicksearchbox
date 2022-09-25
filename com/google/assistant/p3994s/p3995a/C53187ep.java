package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58081m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ep */
/* compiled from: PG */
public final class C53187ep extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53187ep f139383h;

    /* renamed from: i */
    private static volatile C63010eb f139384i;

    /* renamed from: a */
    public int f139385a;

    /* renamed from: b */
    public String f139386b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139387c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C58081m f139388d;

    /* renamed from: e */
    public C58072d f139389e;

    /* renamed from: f */
    public int f139390f;

    /* renamed from: g */
    public String f139391g = BuildConfig.FLAVOR;

    static {
        C53187ep epVar = new C53187ep();
        f139383h = epVar;
        C62942bv.registerDefaultInstance(C53187ep.class, epVar);
    }

    private C53187ep() {
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
                return newMessageInfo(f139383h, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u000bင\u0005\fဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C53187ep();
            case 4:
                return new C53186eo();
            case 5:
                return f139383h;
            case 6:
                C63010eb ebVar = f139384i;
                if (ebVar == null) {
                    synchronized (C53187ep.class) {
                        ebVar = f139384i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139383h);
                            f139384i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
