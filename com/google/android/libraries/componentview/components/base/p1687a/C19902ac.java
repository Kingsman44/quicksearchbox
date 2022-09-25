package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.ac */
/* compiled from: PG */
public final class C19902ac extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C19902ac f55675h;

    /* renamed from: j */
    private static volatile C63010eb f55676j;

    /* renamed from: a */
    public int f55677a;

    /* renamed from: b */
    public float f55678b;

    /* renamed from: c */
    public float f55679c;

    /* renamed from: d */
    public float f55680d;

    /* renamed from: e */
    public float f55681e = 1.0f;

    /* renamed from: f */
    public C62971cq f55682f = emptyProtobufList();

    /* renamed from: g */
    public C62960cg f55683g = emptyFloatList();

    /* renamed from: i */
    private int f55684i;

    static {
        C19902ac acVar = new C19902ac();
        f55675h = acVar;
        C62942bv.registerDefaultInstance(C19902ac.class, acVar);
    }

    private C19902ac() {
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
                return newMessageInfo(f55675h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005\u001b\u0006\u0013\u0007ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19995r.class, C30325g.f82003a, "i", C19901ab.f55674a});
            case 3:
                return new C19902ac();
            case 4:
                return new C19900aa();
            case 5:
                return f55675h;
            case 6:
                C63010eb ebVar = f55676j;
                if (ebVar == null) {
                    synchronized (C19902ac.class) {
                        ebVar = f55676j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55675h);
                            f55676j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
