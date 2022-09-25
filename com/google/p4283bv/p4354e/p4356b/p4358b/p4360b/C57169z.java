package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57231am;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.b.z */
/* compiled from: PG */
public final class C57169z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57169z f152623c;

    /* renamed from: d */
    public static final C62940bt f152624d;

    /* renamed from: f */
    private static volatile C63010eb f152625f;

    /* renamed from: a */
    public int f152626a;

    /* renamed from: b */
    public C57696b f152627b;

    /* renamed from: e */
    private byte f152628e = 2;

    static {
        C57169z zVar = new C57169z();
        f152623c = zVar;
        C62942bv.registerDefaultInstance(C57169z.class, zVar);
        f152624d = C62942bv.newSingularGeneratedExtension(C57231am.f152780c, zVar, zVar, (C62958ce) null, 1000, C63066gd.MESSAGE, C57169z.class);
    }

    private C57169z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152628e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152628e = b;
                return null;
            case 2:
                return newMessageInfo(f152623c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57169z();
            case 4:
                return new C57168y();
            case 5:
                return f152623c;
            case 6:
                C63010eb ebVar = f152625f;
                if (ebVar == null) {
                    synchronized (C57169z.class) {
                        ebVar = f152625f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152623c);
                            f152625f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
