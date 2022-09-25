package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.at */
/* compiled from: PG */
public final class C24787at extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C24787at f67723g;

    /* renamed from: h */
    private static volatile C63010eb f67724h;

    /* renamed from: a */
    public int f67725a;

    /* renamed from: b */
    public int f67726b;

    /* renamed from: c */
    public int f67727c;

    /* renamed from: d */
    public int f67728d;

    /* renamed from: e */
    public C62995dn f67729e = C62995dn.f170057a;

    /* renamed from: f */
    public C62995dn f67730f = C62995dn.f170057a;

    static {
        C24787at atVar = new C24787at();
        f67723g = atVar;
        C62942bv.registerDefaultInstance(C24787at.class, atVar);
    }

    private C24787at() {
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
                return newMessageInfo(f67723g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0002\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u00042\u00052", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C24786as.f67722a, C10662f.f35572a, C24785ar.f67721a});
            case 3:
                return new C24787at();
            case 4:
                return new C24784aq();
            case 5:
                return f67723g;
            case 6:
                C63010eb ebVar = f67724h;
                if (ebVar == null) {
                    synchronized (C24787at.class) {
                        ebVar = f67724h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67723g);
                            f67724h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
