package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ct */
/* compiled from: PG */
public final class C79999ct extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C79999ct f219469i;

    /* renamed from: j */
    private static volatile C63010eb f219470j;

    /* renamed from: a */
    public int f219471a;

    /* renamed from: b */
    public float f219472b;

    /* renamed from: c */
    public float f219473c;

    /* renamed from: d */
    public float f219474d;

    /* renamed from: e */
    public float f219475e;

    /* renamed from: f */
    public float f219476f;

    /* renamed from: g */
    public float f219477g;

    /* renamed from: h */
    public float f219478h;

    static {
        C79999ct ctVar = new C79999ct();
        f219469i = ctVar;
        C62942bv.registerDefaultInstance(C79999ct.class, ctVar);
    }

    private C79999ct() {
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
                return newMessageInfo(f219469i, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0000\u0002ခ\u0000\u0003ခ\u0001\u0004ခ\u0002\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "e"});
            case 3:
                return new C79999ct();
            case 4:
                return new C79998cs();
            case 5:
                return f219469i;
            case 6:
                C63010eb ebVar = f219470j;
                if (ebVar == null) {
                    synchronized (C79999ct.class) {
                        ebVar = f219470j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219469i);
                            f219470j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
