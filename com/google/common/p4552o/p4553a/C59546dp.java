package com.google.common.p4552o.p4553a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.a.dp */
/* compiled from: PG */
public final class C59546dp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59546dp f158007d;

    /* renamed from: e */
    public static final C62940bt f158008e;

    /* renamed from: f */
    private static volatile C63010eb f158009f;

    /* renamed from: a */
    public int f158010a;

    /* renamed from: b */
    public int f158011b;

    /* renamed from: c */
    public String f158012c = BuildConfig.FLAVOR;

    static {
        C59546dp dpVar = new C59546dp();
        f158007d = dpVar;
        C62942bv.registerDefaultInstance(C59546dp.class, dpVar);
        f158008e = C62942bv.newSingularGeneratedExtension(aqs.f159780k, dpVar, dpVar, (C62958ce) null, 518, C63066gd.MESSAGE, C59546dp.class);
    }

    private C59546dp() {
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
                return newMessageInfo(f158007d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C48582b.m85244b(), C45240c.f118157a});
            case 3:
                return new C59546dp();
            case 4:
                return new C59545do();
            case 5:
                return f158007d;
            case 6:
                C63010eb ebVar = f158009f;
                if (ebVar == null) {
                    synchronized (C59546dp.class) {
                        ebVar = f158009f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158007d);
                            f158009f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
