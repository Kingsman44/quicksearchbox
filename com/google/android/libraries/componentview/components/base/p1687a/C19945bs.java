package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.bs */
/* compiled from: PG */
public final class C19945bs extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C19945bs f55821j;

    /* renamed from: k */
    private static volatile C63010eb f55822k;

    /* renamed from: a */
    public int f55823a;

    /* renamed from: b */
    public int f55824b;

    /* renamed from: c */
    public int f55825c;

    /* renamed from: d */
    public int f55826d;

    /* renamed from: e */
    public int f55827e;

    /* renamed from: f */
    public float f55828f;

    /* renamed from: g */
    public float f55829g;

    /* renamed from: h */
    public float f55830h;

    /* renamed from: i */
    public float f55831i;

    static {
        C19945bs bsVar = new C19945bs();
        f55821j = bsVar;
        C62942bv.registerDefaultInstance(C19945bs.class, bsVar);
    }

    private C19945bs() {
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
                return newMessageInfo(f55821j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C19945bs();
            case 4:
                return new C19944br();
            case 5:
                return f55821j;
            case 6:
                C63010eb ebVar = f55822k;
                if (ebVar == null) {
                    synchronized (C19945bs.class) {
                        ebVar = f55822k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55821j);
                            f55822k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
