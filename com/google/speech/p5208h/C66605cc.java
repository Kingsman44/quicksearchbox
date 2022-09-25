package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.cc */
/* compiled from: PG */
public final class C66605cc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66605cc f181187b;

    /* renamed from: c */
    public static final C62940bt f181188c;

    /* renamed from: d */
    private static volatile C63010eb f181189d;

    /* renamed from: a */
    public C62961ch f181190a = emptyIntList();

    static {
        C66605cc ccVar = new C66605cc();
        f181187b = ccVar;
        C62942bv.registerDefaultInstance(C66605cc.class, ccVar);
        f181188c = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, ccVar, ccVar, (C62958ce) null, 313216766, C63066gd.MESSAGE, C66605cc.class);
    }

    private C66605cc() {
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
                return newMessageInfo(f181187b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C66605cc();
            case 4:
                return new C66604cb();
            case 5:
                return f181187b;
            case 6:
                C63010eb ebVar = f181189d;
                if (ebVar == null) {
                    synchronized (C66605cc.class) {
                        ebVar = f181189d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181187b);
                            f181189d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
