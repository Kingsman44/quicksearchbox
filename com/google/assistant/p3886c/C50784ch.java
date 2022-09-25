package com.google.assistant.p3886c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123757bx;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.ch */
/* compiled from: PG */
public final class C50784ch extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50784ch f132155c;

    /* renamed from: d */
    public static final C62940bt f132156d;

    /* renamed from: e */
    private static volatile C63010eb f132157e;

    /* renamed from: a */
    public int f132158a;

    /* renamed from: b */
    public C123757bx f132159b;

    static {
        C50784ch chVar = new C50784ch();
        f132155c = chVar;
        C62942bv.registerDefaultInstance(C50784ch.class, chVar);
        f132156d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, chVar, chVar, (C62958ce) null, 415049588, C63066gd.MESSAGE, C50784ch.class);
    }

    private C50784ch() {
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
                return newMessageInfo(f132155c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50784ch();
            case 4:
                return new C50783cg();
            case 5:
                return f132155c;
            case 6:
                C63010eb ebVar = f132157e;
                if (ebVar == null) {
                    synchronized (C50784ch.class) {
                        ebVar = f132157e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132155c);
                            f132157e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
