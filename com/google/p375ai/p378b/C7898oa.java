package com.google.p375ai.p378b;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57499g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.ai.b.oa */
/* compiled from: PG */
public final class C7898oa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7898oa f27755c;

    /* renamed from: d */
    public static final C62940bt f27756d;

    /* renamed from: f */
    private static volatile C63010eb f27757f;

    /* renamed from: a */
    public int f27758a;

    /* renamed from: b */
    public C7536ax f27759b;

    /* renamed from: e */
    private byte f27760e = 2;

    static {
        C7898oa oaVar = new C7898oa();
        f27755c = oaVar;
        C62942bv.registerDefaultInstance(C7898oa.class, oaVar);
        f27756d = C62942bv.newSingularGeneratedExtension(C57499g.f153590a, oaVar, oaVar, (C62958ce) null, 181786015, C63066gd.MESSAGE, C7898oa.class);
    }

    private C7898oa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27760e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27760e = b;
                return null;
            case 2:
                return newMessageInfo(f27755c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7898oa();
            case 4:
                return new C7896nz();
            case 5:
                return f27755c;
            case 6:
                C63010eb ebVar = f27757f;
                if (ebVar == null) {
                    synchronized (C7898oa.class) {
                        ebVar = f27757f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27755c);
                            f27757f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
