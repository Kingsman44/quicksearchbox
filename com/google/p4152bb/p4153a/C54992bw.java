package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.bw */
/* compiled from: PG */
public final class C54992bw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54992bw f144692a;

    /* renamed from: b */
    public static final C62940bt f144693b;

    /* renamed from: c */
    private static volatile C63010eb f144694c;

    static {
        C54992bw bwVar = new C54992bw();
        f144692a = bwVar;
        C62942bv.registerDefaultInstance(C54992bw.class, bwVar);
        f144693b = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, bwVar, bwVar, (C62958ce) null, 52546476, C63066gd.MESSAGE, C54992bw.class);
    }

    private C54992bw() {
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
                return newMessageInfo(f144692a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54992bw();
            case 4:
                return new C54991bv();
            case 5:
                return f144692a;
            case 6:
                C63010eb ebVar = f144694c;
                if (ebVar == null) {
                    synchronized (C54992bw.class) {
                        ebVar = f144694c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144692a);
                            f144694c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
