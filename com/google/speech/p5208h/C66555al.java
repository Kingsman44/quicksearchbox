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

/* renamed from: com.google.speech.h.al */
/* compiled from: PG */
public final class C66555al extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66555al f181029g;

    /* renamed from: h */
    public static final C62940bt f181030h;

    /* renamed from: i */
    private static volatile C63010eb f181031i;

    /* renamed from: a */
    public int f181032a;

    /* renamed from: b */
    public int f181033b;

    /* renamed from: c */
    public int f181034c;

    /* renamed from: d */
    public int f181035d;

    /* renamed from: e */
    public int f181036e;

    /* renamed from: f */
    public int f181037f;

    static {
        C66555al alVar = new C66555al();
        f181029g = alVar;
        C62942bv.registerDefaultInstance(C66555al.class, alVar);
        f181030h = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, alVar, alVar, (C62958ce) null, 27301014, C63066gd.MESSAGE, C66555al.class);
    }

    private C66555al() {
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
                return newMessageInfo(f181029g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C66555al();
            case 4:
                return new C66553aj();
            case 5:
                return f181029g;
            case 6:
                C63010eb ebVar = f181031i;
                if (ebVar == null) {
                    synchronized (C66555al.class) {
                        ebVar = f181031i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181029g);
                            f181031i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
