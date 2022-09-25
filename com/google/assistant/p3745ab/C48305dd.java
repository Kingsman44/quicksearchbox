package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60056je;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ab.dd */
/* compiled from: PG */
public final class C48305dd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48305dd f124927d;

    /* renamed from: e */
    public static final C62940bt f124928e;

    /* renamed from: f */
    private static volatile C63010eb f124929f;

    /* renamed from: a */
    public int f124930a;

    /* renamed from: b */
    public long f124931b;

    /* renamed from: c */
    public C60056je f124932c;

    static {
        C48305dd ddVar = new C48305dd();
        f124927d = ddVar;
        C62942bv.registerDefaultInstance(C48305dd.class, ddVar);
        f124928e = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ddVar, ddVar, (C62958ce) null, 687, C63066gd.MESSAGE, C48305dd.class);
    }

    private C48305dd() {
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
                return newMessageInfo(f124927d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48305dd();
            case 4:
                return new C48304dc();
            case 5:
                return f124927d;
            case 6:
                C63010eb ebVar = f124929f;
                if (ebVar == null) {
                    synchronized (C48305dd.class) {
                        ebVar = f124929f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124927d);
                            f124929f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
