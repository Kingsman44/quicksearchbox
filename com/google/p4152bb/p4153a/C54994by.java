package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.by */
/* compiled from: PG */
public final class C54994by extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54994by f144695a;

    /* renamed from: b */
    public static final C62940bt f144696b;

    /* renamed from: d */
    private static volatile C63010eb f144697d;

    /* renamed from: c */
    private byte f144698c = 2;

    static {
        C54994by byVar = new C54994by();
        f144695a = byVar;
        C62942bv.registerDefaultInstance(C54994by.class, byVar);
        f144696b = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, byVar, byVar, (C62958ce) null, 34151581, C63066gd.MESSAGE, C54994by.class);
    }

    private C54994by() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144698c);
            case 1:
                this.f144698c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f144695a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54994by();
            case 4:
                return new C54993bx();
            case 5:
                return f144695a;
            case 6:
                C63010eb ebVar = f144697d;
                if (ebVar == null) {
                    synchronized (C54994by.class) {
                        ebVar = f144697d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144695a);
                            f144697d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
