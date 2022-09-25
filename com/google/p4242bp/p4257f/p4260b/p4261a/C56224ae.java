package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.ae */
/* compiled from: PG */
public final class C56224ae extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C56224ae f149753h;

    /* renamed from: i */
    private static volatile C63010eb f149754i;

    /* renamed from: a */
    public int f149755a;

    /* renamed from: b */
    public float f149756b;

    /* renamed from: c */
    public float f149757c;

    /* renamed from: d */
    public float f149758d;

    /* renamed from: e */
    public float f149759e;

    /* renamed from: f */
    public float f149760f;

    /* renamed from: g */
    public int f149761g;

    static {
        C56224ae aeVar = new C56224ae();
        f149753h = aeVar;
        C62942bv.registerDefaultInstance(C56224ae.class, aeVar);
    }

    private C56224ae() {
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
                return newMessageInfo(f149753h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဌ\u0005\u0006ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C56222ac.f149752a, C10662f.f35572a});
            case 3:
                return new C56224ae();
            case 4:
                return new C56221ab();
            case 5:
                return f149753h;
            case 6:
                C63010eb ebVar = f149754i;
                if (ebVar == null) {
                    synchronized (C56224ae.class) {
                        ebVar = f149754i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149753h);
                            f149754i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
