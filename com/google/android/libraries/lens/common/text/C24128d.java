package com.google.android.libraries.lens.common.text;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4699e.C62218bd;
import com.google.lens.p4707j.C62441br;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.common.text.d */
/* compiled from: PG */
public final class C24128d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C24128d f65875i;

    /* renamed from: j */
    private static volatile C63010eb f65876j;

    /* renamed from: a */
    public int f65877a;

    /* renamed from: b */
    public C62441br f65878b;

    /* renamed from: c */
    public C62218bd f65879c;

    /* renamed from: d */
    public float f65880d;

    /* renamed from: e */
    public C24127c f65881e;

    /* renamed from: f */
    public C63088z f65882f = C63088z.f170246b;

    /* renamed from: g */
    public int f65883g;

    /* renamed from: h */
    public int f65884h;

    static {
        C24128d dVar = new C24128d();
        f65875i = dVar;
        C62942bv.registerDefaultInstance(C24128d.class, dVar);
    }

    private C24128d() {
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
                return newMessageInfo(f65875i, "\u0000\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\t\u0003\t\u0004\u0001\u0006\t\u0007ည\u0000\bင\u0001\tင\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C24128d();
            case 4:
                return new C24115a();
            case 5:
                return f65875i;
            case 6:
                C63010eb ebVar = f65876j;
                if (ebVar == null) {
                    synchronized (C24128d.class) {
                        ebVar = f65876j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f65875i);
                            f65876j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
