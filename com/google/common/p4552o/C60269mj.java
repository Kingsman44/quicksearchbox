package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.mj */
/* compiled from: PG */
public final class C60269mj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60269mj f163056f;

    /* renamed from: g */
    private static volatile C63010eb f163057g;

    /* renamed from: a */
    public int f163058a;

    /* renamed from: b */
    public int f163059b;

    /* renamed from: c */
    public int f163060c;

    /* renamed from: d */
    public int f163061d;

    /* renamed from: e */
    public boolean f163062e;

    static {
        C60269mj mjVar = new C60269mj();
        f163056f = mjVar;
        C62942bv.registerDefaultInstance(C60269mj.class, mjVar);
    }

    private C60269mj() {
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
                Object[] objArr = new Object[7];
                objArr[0] = "a";
                objArr[1] = "b";
                C62959cf cfVar = C60268mi.f163055a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = C45240c.f118157a;
                objArr[5] = "d";
                objArr[6] = "e";
                return newMessageInfo(f163056f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဋ\u0002\u0004ဇ\u0003", objArr);
            case 3:
                return new C60269mj();
            case 4:
                return new C60267mh();
            case 5:
                return f163056f;
            case 6:
                C63010eb ebVar = f163057g;
                if (ebVar == null) {
                    synchronized (C60269mj.class) {
                        ebVar = f163057g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163056f);
                            f163057g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
