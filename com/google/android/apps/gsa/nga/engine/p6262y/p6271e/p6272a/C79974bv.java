package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bv */
/* compiled from: PG */
public final class C79974bv extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C79974bv f219349h;

    /* renamed from: i */
    private static volatile C63010eb f219350i;

    /* renamed from: a */
    public int f219351a;

    /* renamed from: b */
    public boolean f219352b;

    /* renamed from: c */
    public boolean f219353c;

    /* renamed from: d */
    public boolean f219354d;

    /* renamed from: e */
    public float f219355e;

    /* renamed from: f */
    public float f219356f;

    /* renamed from: g */
    public C79946au f219357g;

    static {
        C79974bv bvVar = new C79974bv();
        f219349h = bvVar;
        C62942bv.registerDefaultInstance(C79974bv.class, bvVar);
    }

    private C79974bv() {
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
                return newMessageInfo(f219349h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C79974bv();
            case 4:
                return new C79973bu();
            case 5:
                return f219349h;
            case 6:
                C63010eb ebVar = f219350i;
                if (ebVar == null) {
                    synchronized (C79974bv.class) {
                        ebVar = f219350i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219349h);
                            f219350i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
