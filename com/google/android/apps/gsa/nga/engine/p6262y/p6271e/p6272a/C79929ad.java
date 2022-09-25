package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ad */
/* compiled from: PG */
public final class C79929ad extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C79929ad f219085h;

    /* renamed from: i */
    private static volatile C63010eb f219086i;

    /* renamed from: a */
    public int f219087a;

    /* renamed from: b */
    public float f219088b;

    /* renamed from: c */
    public float f219089c;

    /* renamed from: d */
    public int f219090d;

    /* renamed from: e */
    public boolean f219091e;

    /* renamed from: f */
    public boolean f219092f;

    /* renamed from: g */
    public boolean f219093g;

    static {
        C79929ad adVar = new C79929ad();
        f219085h = adVar;
        C62942bv.registerDefaultInstance(C79929ad.class, adVar);
    }

    private C79929ad() {
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
                return newMessageInfo(f219085h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C79929ad();
            case 4:
                return new C79928ac();
            case 5:
                return f219085h;
            case 6:
                C63010eb ebVar = f219086i;
                if (ebVar == null) {
                    synchronized (C79929ad.class) {
                        ebVar = f219086i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219085h);
                            f219086i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
