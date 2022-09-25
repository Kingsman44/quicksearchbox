package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.r */
/* compiled from: PG */
public final class C19995r extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C19995r f56032g;

    /* renamed from: h */
    private static volatile C63010eb f56033h;

    /* renamed from: a */
    public int f56034a;

    /* renamed from: b */
    public float f56035b;

    /* renamed from: c */
    public float f56036c;

    /* renamed from: d */
    public float f56037d;

    /* renamed from: e */
    public float f56038e;

    /* renamed from: f */
    public int f56039f;

    static {
        C19995r rVar = new C19995r();
        f56032g = rVar;
        C62942bv.registerDefaultInstance(C19995r.class, rVar);
    }

    private C19995r() {
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
                return newMessageInfo(f56032g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဆ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C19995r();
            case 4:
                return new C19994q();
            case 5:
                return f56032g;
            case 6:
                C63010eb ebVar = f56033h;
                if (ebVar == null) {
                    synchronized (C19995r.class) {
                        ebVar = f56033h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56032g);
                            f56033h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
