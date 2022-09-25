package com.google.assistant.p3886c;

import com.google.p4283bv.p4345d.p4350b.p4353c.C57021m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.cf */
/* compiled from: PG */
public final class C50782cf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50782cf f132150c;

    /* renamed from: d */
    public static final C62940bt f132151d;

    /* renamed from: e */
    private static volatile C63010eb f132152e;

    /* renamed from: a */
    public int f132153a;

    /* renamed from: b */
    public C57021m f132154b;

    static {
        C50782cf cfVar = new C50782cf();
        f132150c = cfVar;
        C62942bv.registerDefaultInstance(C50782cf.class, cfVar);
        f132151d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, cfVar, cfVar, (C62958ce) null, 355913213, C63066gd.MESSAGE, C50782cf.class);
    }

    private C50782cf() {
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
                return newMessageInfo(f132150c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50782cf();
            case 4:
                return new C50781ce();
            case 5:
                return f132150c;
            case 6:
                C63010eb ebVar = f132152e;
                if (ebVar == null) {
                    synchronized (C50782cf.class) {
                        ebVar = f132152e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132150c);
                            f132152e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
