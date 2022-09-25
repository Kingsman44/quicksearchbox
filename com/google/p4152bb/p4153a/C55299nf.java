package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.nf */
/* compiled from: PG */
public final class C55299nf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55299nf f145679a;

    /* renamed from: b */
    public static final C62940bt f145680b;

    /* renamed from: d */
    private static volatile C63010eb f145681d;

    /* renamed from: c */
    private byte f145682c = 2;

    static {
        C55299nf nfVar = new C55299nf();
        f145679a = nfVar;
        C62942bv.registerDefaultInstance(C55299nf.class, nfVar);
        f145680b = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, nfVar, nfVar, (C62958ce) null, 119998250, C63066gd.MESSAGE, C55299nf.class);
    }

    private C55299nf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145682c);
            case 1:
                this.f145682c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f145679a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55299nf();
            case 4:
                return new C55298ne();
            case 5:
                return f145679a;
            case 6:
                C63010eb ebVar = f145681d;
                if (ebVar == null) {
                    synchronized (C55299nf.class) {
                        ebVar = f145681d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145679a);
                            f145681d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
