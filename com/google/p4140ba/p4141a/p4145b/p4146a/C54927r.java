package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.r */
/* compiled from: PG */
public final class C54927r extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54927r f144389g;

    /* renamed from: h */
    private static volatile C63010eb f144390h;

    /* renamed from: a */
    public int f144391a;

    /* renamed from: b */
    public float f144392b;

    /* renamed from: c */
    public float f144393c;

    /* renamed from: d */
    public float f144394d;

    /* renamed from: e */
    public float f144395e;

    /* renamed from: f */
    public float f144396f;

    static {
        C54927r rVar = new C54927r();
        f144389g = rVar;
        C62942bv.registerDefaultInstance(C54927r.class, rVar);
    }

    private C54927r() {
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
                return newMessageInfo(f144389g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ခ\u0000\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C54927r();
            case 4:
                return new C54926q();
            case 5:
                return f144389g;
            case 6:
                C63010eb ebVar = f144390h;
                if (ebVar == null) {
                    synchronized (C54927r.class) {
                        ebVar = f144390h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144389g);
                            f144390h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
