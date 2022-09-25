package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.br */
/* compiled from: PG */
public final class C50753br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50753br f132073c;

    /* renamed from: d */
    public static final C62940bt f132074d;

    /* renamed from: e */
    private static volatile C63010eb f132075e;

    /* renamed from: a */
    public int f132076a;

    /* renamed from: b */
    public C50844p f132077b;

    static {
        C50753br brVar = new C50753br();
        f132073c = brVar;
        C62942bv.registerDefaultInstance(C50753br.class, brVar);
        f132074d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, brVar, brVar, (C62958ce) null, 368320277, C63066gd.MESSAGE, C50753br.class);
    }

    private C50753br() {
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
                return newMessageInfo(f132073c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50753br();
            case 4:
                return new C50752bq();
            case 5:
                return f132073c;
            case 6:
                C63010eb ebVar = f132075e;
                if (ebVar == null) {
                    synchronized (C50753br.class) {
                        ebVar = f132075e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132073c);
                            f132075e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
