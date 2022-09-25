package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7548bb;
import com.google.p375ai.p378b.C7552bf;
import com.google.p375ai.p378b.C7566bt;
import com.google.p375ai.p378b.C7577cd;
import com.google.p375ai.p378b.C7605de;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.k */
/* compiled from: PG */
public final class C56975k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56975k f152090f;

    /* renamed from: h */
    private static volatile C63010eb f152091h;

    /* renamed from: a */
    public int f152092a;

    /* renamed from: b */
    public int f152093b = 0;

    /* renamed from: c */
    public Object f152094c;

    /* renamed from: d */
    public int f152095d;

    /* renamed from: e */
    public C8178yk f152096e;

    /* renamed from: g */
    private byte f152097g = 2;

    static {
        C56975k kVar = new C56975k();
        f152090f = kVar;
        C62942bv.registerDefaultInstance(C56975k.class, kVar);
    }

    private C56975k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152097g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152097g = b;
                return null;
            case 2:
                return newMessageInfo(f152090f, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0005\u0001ဌ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0006ွ\u0000\u0007ြ\u0000\bြ\u0000\tᐼ\u0000\nᐼ\u0000\u000bᐉ\t", new Object[]{C45240c.f118157a, "b", "a", "d", C7681g.m22803b(), C7577cd.class, C7605de.class, C56979o.class, C56990z.class, C7566bt.class, C7548bb.class, C7552bf.class, "e"});
            case 3:
                return new C56975k();
            case 4:
                return new C56974j();
            case 5:
                return f152090f;
            case 6:
                C63010eb ebVar = f152091h;
                if (ebVar == null) {
                    synchronized (C56975k.class) {
                        ebVar = f152091h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152090f);
                            f152091h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
