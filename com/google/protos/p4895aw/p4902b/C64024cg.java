package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.aw.b.cg */
/* compiled from: PG */
public final class C64024cg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64024cg f173126b;

    /* renamed from: c */
    public static final C62940bt f173127c;

    /* renamed from: e */
    private static volatile C63010eb f173128e;

    /* renamed from: a */
    public boolean f173129a;

    /* renamed from: d */
    private int f173130d;

    static {
        C64024cg cgVar = new C64024cg();
        f173126b = cgVar;
        C62942bv.registerDefaultInstance(C64024cg.class, cgVar);
        f173127c = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, cgVar, cgVar, (C62958ce) null, 158511070, C63066gd.MESSAGE, C64024cg.class);
    }

    private C64024cg() {
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
                return newMessageInfo(f173126b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64024cg();
            case 4:
                return new C64023cf();
            case 5:
                return f173126b;
            case 6:
                C63010eb ebVar = f173128e;
                if (ebVar == null) {
                    synchronized (C64024cg.class) {
                        ebVar = f173128e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173126b);
                            f173128e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
