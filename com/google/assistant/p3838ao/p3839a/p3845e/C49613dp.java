package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.dp */
/* compiled from: PG */
public final class C49613dp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49613dp f128024c;

    /* renamed from: d */
    public static final C62940bt f128025d;

    /* renamed from: f */
    private static volatile C63010eb f128026f;

    /* renamed from: a */
    public int f128027a;

    /* renamed from: b */
    public int f128028b;

    /* renamed from: e */
    private int f128029e;

    static {
        C49613dp dpVar = new C49613dp();
        f128024c = dpVar;
        C62942bv.registerDefaultInstance(C49613dp.class, dpVar);
        f128025d = C62942bv.newSingularGeneratedExtension(C49621l.f128062b, dpVar, dpVar, (C62958ce) null, 280261361, C63066gd.MESSAGE, C49613dp.class);
    }

    private C49613dp() {
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
                Object[] objArr = new Object[5];
                objArr[0] = "e";
                objArr[1] = "a";
                C62959cf cfVar = C49608dk.f128018a;
                objArr[4] = cfVar;
                objArr[2] = cfVar;
                objArr[3] = "b";
                return newMessageInfo(f128024c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", objArr);
            case 3:
                return new C49613dp();
            case 4:
                return new C49612do();
            case 5:
                return f128024c;
            case 6:
                C63010eb ebVar = f128026f;
                if (ebVar == null) {
                    synchronized (C49613dp.class) {
                        ebVar = f128026f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128024c);
                            f128026f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
