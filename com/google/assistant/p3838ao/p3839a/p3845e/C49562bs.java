package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.bs */
/* compiled from: PG */
public final class C49562bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49562bs f127887b;

    /* renamed from: c */
    public static final C62940bt f127888c;

    /* renamed from: e */
    private static volatile C63010eb f127889e;

    /* renamed from: a */
    public long f127890a;

    /* renamed from: d */
    private int f127891d;

    static {
        C49562bs bsVar = new C49562bs();
        f127887b = bsVar;
        C62942bv.registerDefaultInstance(C49562bs.class, bsVar);
        f127888c = C62942bv.newSingularGeneratedExtension(C49520ad.f127756b, bsVar, bsVar, (C62958ce) null, 276083330, C63066gd.MESSAGE, C49562bs.class);
    }

    private C49562bs() {
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
                return newMessageInfo(f127887b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C49562bs();
            case 4:
                return new C49561br();
            case 5:
                return f127887b;
            case 6:
                C63010eb ebVar = f127889e;
                if (ebVar == null) {
                    synchronized (C49562bs.class) {
                        ebVar = f127889e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127887b);
                            f127889e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
