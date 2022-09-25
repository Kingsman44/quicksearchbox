package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.ca */
/* compiled from: PG */
public final class C39647ca extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39647ca f104365d;

    /* renamed from: e */
    public static final C62940bt f104366e;

    /* renamed from: f */
    private static volatile C63010eb f104367f;

    /* renamed from: a */
    public int f104368a;

    /* renamed from: b */
    public boolean f104369b;

    /* renamed from: c */
    public int f104370c;

    static {
        C39647ca caVar = new C39647ca();
        f104365d = caVar;
        C62942bv.registerDefaultInstance(C39647ca.class, caVar);
        f104366e = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, caVar, caVar, (C62958ce) null, 413019261, C63066gd.MESSAGE, C39647ca.class);
    }

    private C39647ca() {
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
                return newMessageInfo(f104365d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C39376by.f103692a});
            case 3:
                return new C39647ca();
            case 4:
                return new C39375bx();
            case 5:
                return f104365d;
            case 6:
                C63010eb ebVar = f104367f;
                if (ebVar == null) {
                    synchronized (C39647ca.class) {
                        ebVar = f104367f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104365d);
                            f104367f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
