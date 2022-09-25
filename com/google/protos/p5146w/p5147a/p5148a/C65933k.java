package com.google.protos.p5146w.p5147a.p5148a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.w.a.a.k */
/* compiled from: PG */
public final class C65933k extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C65933k f179312g;

    /* renamed from: h */
    public static final C62940bt f179313h;

    /* renamed from: k */
    private static volatile C63010eb f179314k;

    /* renamed from: a */
    public int f179315a;

    /* renamed from: b */
    public int f179316b;

    /* renamed from: c */
    public int f179317c;

    /* renamed from: d */
    public int f179318d;

    /* renamed from: e */
    public boolean f179319e;

    /* renamed from: f */
    public boolean f179320f;

    /* renamed from: i */
    private int f179321i;

    /* renamed from: j */
    private C62995dn f179322j = C62995dn.f170057a;

    static {
        C65933k kVar = new C65933k();
        f179312g = kVar;
        C62942bv.registerDefaultInstance(C65933k.class, kVar);
        f179313h = C62942bv.newSingularGeneratedExtension(C65930h.f179300i, kVar, kVar, (C62958ce) null, 2001, C63066gd.MESSAGE, C65933k.class);
    }

    private C65933k() {
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
                return newMessageInfo(f179312g, "\u0001\u0007\u0000\u0001\u0004\u000b\u0007\u0001\u0000\u0000\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဇ\u0007\tဇ\b\u000b2", new Object[]{"i", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, "j", C65932j.f179311a});
            case 3:
                return new C65933k();
            case 4:
                return new C65931i();
            case 5:
                return f179312g;
            case 6:
                C63010eb ebVar = f179314k;
                if (ebVar == null) {
                    synchronized (C65933k.class) {
                        ebVar = f179314k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179312g);
                            f179314k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
