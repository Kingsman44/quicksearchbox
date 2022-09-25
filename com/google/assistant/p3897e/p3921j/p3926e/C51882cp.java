package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.e.j.e.cp */
/* compiled from: PG */
public final class C51882cp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51882cp f136072b;

    /* renamed from: d */
    private static volatile C63010eb f136073d;

    /* renamed from: a */
    public C63037fb f136074a;

    /* renamed from: c */
    private int f136075c;

    static {
        C51882cp cpVar = new C51882cp();
        f136072b = cpVar;
        C62942bv.registerDefaultInstance(C51882cp.class, cpVar);
    }

    private C51882cp() {
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
                return newMessageInfo(f136072b, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51882cp();
            case 4:
                return new C51881co();
            case 5:
                return f136072b;
            case 6:
                C63010eb ebVar = f136073d;
                if (ebVar == null) {
                    synchronized (C51882cp.class) {
                        ebVar = f136073d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136072b);
                            f136073d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
