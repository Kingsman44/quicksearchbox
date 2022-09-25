package com.google.p375ai.p378b;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.ai.b.oc */
/* compiled from: PG */
public final class C7900oc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7900oc f27761c;

    /* renamed from: d */
    public static final C62940bt f27762d;

    /* renamed from: f */
    private static volatile C63010eb f27763f;

    /* renamed from: a */
    public int f27764a;

    /* renamed from: b */
    public C8178yk f27765b;

    /* renamed from: e */
    private byte f27766e = 2;

    static {
        C7900oc ocVar = new C7900oc();
        f27761c = ocVar;
        C62942bv.registerDefaultInstance(C7900oc.class, ocVar);
        f27762d = C62942bv.newSingularGeneratedExtension(C57418cp.f153391a, ocVar, ocVar, (C62958ce) null, 181786015, C63066gd.MESSAGE, C7900oc.class);
    }

    private C7900oc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27766e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27766e = b;
                return null;
            case 2:
                return newMessageInfo(f27761c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7900oc();
            case 4:
                return new C7899ob();
            case 5:
                return f27761c;
            case 6:
                C63010eb ebVar = f27763f;
                if (ebVar == null) {
                    synchronized (C7900oc.class) {
                        ebVar = f27763f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27761c);
                            f27763f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
