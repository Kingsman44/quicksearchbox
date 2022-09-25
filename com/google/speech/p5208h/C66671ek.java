package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.ek */
/* compiled from: PG */
public final class C66671ek extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66671ek f181361c;

    /* renamed from: d */
    public static final C62940bt f181362d;

    /* renamed from: e */
    private static volatile C63010eb f181363e;

    /* renamed from: a */
    public int f181364a;

    /* renamed from: b */
    public int f181365b;

    static {
        C66671ek ekVar = new C66671ek();
        f181361c = ekVar;
        C62942bv.registerDefaultInstance(C66671ek.class, ekVar);
        f181362d = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, ekVar, ekVar, (C62958ce) null, 240431782, C63066gd.MESSAGE, C66671ek.class);
    }

    private C66671ek() {
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
                return newMessageInfo(f181361c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C66667eg.m97299b()});
            case 3:
                return new C66671ek();
            case 4:
                return new C66670ej();
            case 5:
                return f181361c;
            case 6:
                C63010eb ebVar = f181363e;
                if (ebVar == null) {
                    synchronized (C66671ek.class) {
                        ebVar = f181363e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181361c);
                            f181363e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
