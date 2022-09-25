package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.pr */
/* compiled from: PG */
public final class C60423pr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60423pr f163516c;

    /* renamed from: d */
    public static final C62940bt f163517d;

    /* renamed from: e */
    private static volatile C63010eb f163518e;

    /* renamed from: a */
    public int f163519a;

    /* renamed from: b */
    public boolean f163520b;

    static {
        C60423pr prVar = new C60423pr();
        f163516c = prVar;
        C62942bv.registerDefaultInstance(C60423pr.class, prVar);
        f163517d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, prVar, prVar, (C62958ce) null, 836, C63066gd.MESSAGE, C60423pr.class);
    }

    private C60423pr() {
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
                return newMessageInfo(f163516c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60423pr();
            case 4:
                return new C60422pq();
            case 5:
                return f163516c;
            case 6:
                C63010eb ebVar = f163518e;
                if (ebVar == null) {
                    synchronized (C60423pr.class) {
                        ebVar = f163518e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163516c);
                            f163518e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
