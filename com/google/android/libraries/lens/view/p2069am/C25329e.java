package com.google.android.libraries.lens.view.p2069am;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.e */
/* compiled from: PG */
public final class C25329e extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C25329e f68928h;

    /* renamed from: i */
    private static volatile C63010eb f68929i;

    /* renamed from: a */
    public float f68930a;

    /* renamed from: b */
    public float f68931b;

    /* renamed from: c */
    public float f68932c;

    /* renamed from: d */
    public float f68933d;

    /* renamed from: e */
    public float f68934e;

    /* renamed from: f */
    public float f68935f;

    /* renamed from: g */
    public int f68936g;

    static {
        C25329e eVar = new C25329e();
        f68928h = eVar;
        C62942bv.registerDefaultInstance(C25329e.class, eVar);
    }

    private C25329e() {
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
                return newMessageInfo(f68928h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C25329e();
            case 4:
                return new C25328d();
            case 5:
                return f68928h;
            case 6:
                C63010eb ebVar = f68929i;
                if (ebVar == null) {
                    synchronized (C25329e.class) {
                        ebVar = f68929i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68928h);
                            f68929i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
