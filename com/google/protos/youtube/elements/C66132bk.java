package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.bk */
/* compiled from: PG */
public final class C66132bk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66132bk f179834b;

    /* renamed from: c */
    public static final C62940bt f179835c;

    /* renamed from: d */
    private static volatile C63010eb f179836d;

    /* renamed from: a */
    public C62995dn f179837a = C62995dn.f170057a;

    static {
        C66132bk bkVar = new C66132bk();
        f179834b = bkVar;
        C62942bv.registerDefaultInstance(C66132bk.class, bkVar);
        f179835c = C62942bv.newSingularGeneratedExtension(C66128bg.f179829a, bkVar, bkVar, (C62958ce) null, 188495463, C63066gd.MESSAGE, C66132bk.class);
    }

    private C66132bk() {
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
                return newMessageInfo(f179834b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C66131bj.f179833a});
            case 3:
                return new C66132bk();
            case 4:
                return new C66130bi();
            case 5:
                return f179834b;
            case 6:
                C63010eb ebVar = f179836d;
                if (ebVar == null) {
                    synchronized (C66132bk.class) {
                        ebVar = f179836d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179834b);
                            f179836d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
