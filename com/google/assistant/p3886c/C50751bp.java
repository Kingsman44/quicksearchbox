package com.google.assistant.p3886c;

import com.google.p4283bv.p4345d.p4350b.p4353c.C57012d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.bp */
/* compiled from: PG */
public final class C50751bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50751bp f132068c;

    /* renamed from: d */
    public static final C62940bt f132069d;

    /* renamed from: e */
    private static volatile C63010eb f132070e;

    /* renamed from: a */
    public int f132071a;

    /* renamed from: b */
    public C57012d f132072b;

    static {
        C50751bp bpVar = new C50751bp();
        f132068c = bpVar;
        C62942bv.registerDefaultInstance(C50751bp.class, bpVar);
        f132069d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, bpVar, bpVar, (C62958ce) null, 360120843, C63066gd.MESSAGE, C50751bp.class);
    }

    private C50751bp() {
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
                return newMessageInfo(f132068c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50751bp();
            case 4:
                return new C50750bo();
            case 5:
                return f132068c;
            case 6:
                C63010eb ebVar = f132070e;
                if (ebVar == null) {
                    synchronized (C50751bp.class) {
                        ebVar = f132070e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132068c);
                            f132070e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
