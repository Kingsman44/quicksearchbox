package com.google.lens.p4701g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.p4174b.C55715d;
import com.google.p4172bg.p4174b.C55721j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bb */
/* compiled from: PG */
public final class C62279bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62279bb f168134e;

    /* renamed from: g */
    private static volatile C63010eb f168135g;

    /* renamed from: a */
    public int f168136a;

    /* renamed from: b */
    public String f168137b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f168138c = emptyProtobufList();

    /* renamed from: d */
    public C55715d f168139d;

    /* renamed from: f */
    private byte f168140f = 2;

    static {
        C62279bb bbVar = new C62279bb();
        f168134e = bbVar;
        C62942bv.registerDefaultInstance(C62279bb.class, bbVar);
    }

    private C62279bb() {
    }

    /* renamed from: a */
    public final void mo58490a() {
        C62971cq cqVar = this.f168138c;
        if (!cqVar.mo58948c()) {
            this.f168138c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168140f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168140f = b;
                return null;
            case 2:
                return newMessageInfo(f168134e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C55721j.class, "d"});
            case 3:
                return new C62279bb();
            case 4:
                return new C62278ba();
            case 5:
                return f168134e;
            case 6:
                C63010eb ebVar = f168135g;
                if (ebVar == null) {
                    synchronized (C62279bb.class) {
                        ebVar = f168135g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168134e);
                            f168135g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
