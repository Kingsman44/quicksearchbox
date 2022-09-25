package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57292ct;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.b.ab */
/* compiled from: PG */
public final class C57118ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57118ab f152469b;

    /* renamed from: c */
    public static final C62940bt f152470c;

    /* renamed from: f */
    private static volatile C63010eb f152471f;

    /* renamed from: a */
    public C57784p f152472a;

    /* renamed from: d */
    private int f152473d;

    /* renamed from: e */
    private byte f152474e = 2;

    static {
        C57118ab abVar = new C57118ab();
        f152469b = abVar;
        C62942bv.registerDefaultInstance(C57118ab.class, abVar);
        f152470c = C62942bv.newSingularGeneratedExtension(C57292ct.f152935b, abVar, abVar, (C62958ce) null, 1000, C63066gd.MESSAGE, C57118ab.class);
    }

    private C57118ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152474e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152474e = b;
                return null;
            case 2:
                return newMessageInfo(f152469b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C57118ab();
            case 4:
                return new C57117aa();
            case 5:
                return f152469b;
            case 6:
                C63010eb ebVar = f152471f;
                if (ebVar == null) {
                    synchronized (C57118ab.class) {
                        ebVar = f152471f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152469b);
                            f152471f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
