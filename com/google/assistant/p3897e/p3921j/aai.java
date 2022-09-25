package com.google.assistant.p3897e.p3921j;

import com.google.assistant.p3886c.C50838j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.e.j.aai */
/* compiled from: PG */
public final class aai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aai f134643b;

    /* renamed from: c */
    public static final C62940bt f134644c;

    /* renamed from: e */
    private static volatile C63010eb f134645e;

    /* renamed from: a */
    public C50838j f134646a;

    /* renamed from: d */
    private int f134647d;

    static {
        aai aai = new aai();
        f134643b = aai;
        C62942bv.registerDefaultInstance(aai.class, aai);
        f134644c = C62942bv.newSingularGeneratedExtension(aas.f134661u, aai, aai, (C62958ce) null, 395197687, C63066gd.MESSAGE, aai.class);
    }

    private aai() {
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
                return newMessageInfo(f134643b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new aai();
            case 4:
                return new aah();
            case 5:
                return f134643b;
            case 6:
                C63010eb ebVar = f134645e;
                if (ebVar == null) {
                    synchronized (aai.class) {
                        ebVar = f134645e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134643b);
                            f134645e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
