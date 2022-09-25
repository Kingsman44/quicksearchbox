package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aic */
/* compiled from: PG */
public final class aic extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final aic f135130h;

    /* renamed from: i */
    private static volatile C63010eb f135131i;

    /* renamed from: a */
    public int f135132a;

    /* renamed from: b */
    public aiu f135133b;

    /* renamed from: c */
    public ahg f135134c;

    /* renamed from: d */
    public aio f135135d;

    /* renamed from: e */
    public aho f135136e;

    /* renamed from: f */
    public agu f135137f;

    /* renamed from: g */
    public ajg f135138g;

    static {
        aic aic = new aic();
        f135130h = aic;
        C62942bv.registerDefaultInstance(aic.class, aic);
    }

    private aic() {
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
                return newMessageInfo(f135130h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new aic();
            case 4:
                return new aib();
            case 5:
                return f135130h;
            case 6:
                C63010eb ebVar = f135131i;
                if (ebVar == null) {
                    synchronized (aic.class) {
                        ebVar = f135131i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135130h);
                            f135131i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
