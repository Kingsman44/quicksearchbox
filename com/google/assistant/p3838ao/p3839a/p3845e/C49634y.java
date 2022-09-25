package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4985f.p5042u.C65346h;

/* renamed from: com.google.assistant.ao.a.e.y */
/* compiled from: PG */
public final class C49634y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49634y f128116b;

    /* renamed from: c */
    public static final C62940bt f128117c;

    /* renamed from: e */
    private static volatile C63010eb f128118e;

    /* renamed from: a */
    public int f128119a;

    /* renamed from: d */
    private int f128120d;

    static {
        C49634y yVar = new C49634y();
        f128116b = yVar;
        C62942bv.registerDefaultInstance(C49634y.class, yVar);
        f128117c = C62942bv.newSingularGeneratedExtension(C49621l.f128062b, yVar, yVar, (C62958ce) null, 300113710, C63066gd.MESSAGE, C49634y.class);
    }

    private C49634y() {
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
                return newMessageInfo(f128116b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", C65346h.m96673c()});
            case 3:
                return new C49634y();
            case 4:
                return new C49633x();
            case 5:
                return f128116b;
            case 6:
                C63010eb ebVar = f128118e;
                if (ebVar == null) {
                    synchronized (C49634y.class) {
                        ebVar = f128118e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128116b);
                            f128118e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
