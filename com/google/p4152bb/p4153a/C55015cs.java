package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.cs */
/* compiled from: PG */
public final class C55015cs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55015cs f144739b;

    /* renamed from: c */
    public static final C62940bt f144740c;

    /* renamed from: e */
    private static volatile C63010eb f144741e;

    /* renamed from: a */
    public boolean f144742a;

    /* renamed from: d */
    private int f144743d;

    static {
        C55015cs csVar = new C55015cs();
        f144739b = csVar;
        C62942bv.registerDefaultInstance(C55015cs.class, csVar);
        f144740c = C62942bv.newSingularGeneratedExtension(C55005ci.f144714d, csVar, csVar, (C62958ce) null, 77632368, C63066gd.MESSAGE, C55015cs.class);
    }

    private C55015cs() {
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
                return newMessageInfo(f144739b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C55015cs();
            case 4:
                return new C55014cr();
            case 5:
                return f144739b;
            case 6:
                C63010eb ebVar = f144741e;
                if (ebVar == null) {
                    synchronized (C55015cs.class) {
                        ebVar = f144741e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144739b);
                            f144741e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
