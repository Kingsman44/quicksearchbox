package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dz */
/* compiled from: PG */
public final class C113385dz extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C113385dz f313932h;

    /* renamed from: i */
    private static volatile C63010eb f313933i;

    /* renamed from: a */
    public int f313934a;

    /* renamed from: b */
    public float f313935b;

    /* renamed from: c */
    public float f313936c;

    /* renamed from: d */
    public float f313937d;

    /* renamed from: e */
    public float f313938e;

    /* renamed from: f */
    public float f313939f;

    /* renamed from: g */
    public float f313940g;

    static {
        C113385dz dzVar = new C113385dz();
        f313932h = dzVar;
        C62942bv.registerDefaultInstance(C113385dz.class, dzVar);
    }

    private C113385dz() {
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
                return newMessageInfo(f313932h, "\u0001\u0006\u0000\u0001\u0006\u000b\u0006\u0000\u0000\u0000\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C113385dz();
            case 4:
                return new C113384dy();
            case 5:
                return f313932h;
            case 6:
                C63010eb ebVar = f313933i;
                if (ebVar == null) {
                    synchronized (C113385dz.class) {
                        ebVar = f313933i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313932h);
                            f313933i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
