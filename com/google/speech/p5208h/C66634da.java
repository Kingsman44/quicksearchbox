package com.google.speech.p5208h;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.da */
/* compiled from: PG */
public final class C66634da extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66634da f181292g;

    /* renamed from: h */
    public static final C62940bt f181293h;

    /* renamed from: i */
    private static volatile C63010eb f181294i;

    /* renamed from: a */
    public int f181295a;

    /* renamed from: b */
    public float f181296b;

    /* renamed from: c */
    public float f181297c;

    /* renamed from: d */
    public int f181298d;

    /* renamed from: e */
    public int f181299e;

    /* renamed from: f */
    public boolean f181300f;

    static {
        C66634da daVar = new C66634da();
        f181292g = daVar;
        C62942bv.registerDefaultInstance(C66634da.class, daVar);
        f181293h = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, daVar, daVar, (C62958ce) null, 124183122, C63066gd.MESSAGE, C66634da.class);
    }

    private C66634da() {
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
                return newMessageInfo(f181292g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C66627cy.f181273a, "e", C66626cx.m97269b(), C10662f.f35572a});
            case 3:
                return new C66634da();
            case 4:
                return new C66628cz();
            case 5:
                return f181292g;
            case 6:
                C63010eb ebVar = f181294i;
                if (ebVar == null) {
                    synchronized (C66634da.class) {
                        ebVar = f181294i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181292g);
                            f181294i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
