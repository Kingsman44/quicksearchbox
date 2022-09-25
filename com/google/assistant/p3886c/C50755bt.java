package com.google.assistant.p3886c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.bt */
/* compiled from: PG */
public final class C50755bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50755bt f132078c;

    /* renamed from: d */
    public static final C62940bt f132079d;

    /* renamed from: e */
    private static volatile C63010eb f132080e;

    /* renamed from: a */
    public int f132081a;

    /* renamed from: b */
    public C123789r f132082b;

    static {
        C50755bt btVar = new C50755bt();
        f132078c = btVar;
        C62942bv.registerDefaultInstance(C50755bt.class, btVar);
        f132079d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, btVar, btVar, (C62958ce) null, 467793228, C63066gd.MESSAGE, C50755bt.class);
    }

    private C50755bt() {
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
                return newMessageInfo(f132078c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50755bt();
            case 4:
                return new C50754bs();
            case 5:
                return f132078c;
            case 6:
                C63010eb ebVar = f132080e;
                if (ebVar == null) {
                    synchronized (C50755bt.class) {
                        ebVar = f132080e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132078c);
                            f132080e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
