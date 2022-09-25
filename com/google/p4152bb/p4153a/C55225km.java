package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.km */
/* compiled from: PG */
public final class C55225km extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55225km f145400e;

    /* renamed from: f */
    public static final C62940bt f145401f;

    /* renamed from: h */
    private static volatile C63010eb f145402h;

    /* renamed from: a */
    public int f145403a;

    /* renamed from: b */
    public C55347p f145404b;

    /* renamed from: c */
    public C55224kl f145405c;

    /* renamed from: d */
    public C62971cq f145406d = emptyProtobufList();

    /* renamed from: g */
    private byte f145407g = 2;

    static {
        C55225km kmVar = new C55225km();
        f145400e = kmVar;
        C62942bv.registerDefaultInstance(C55225km.class, kmVar);
        f145401f = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, kmVar, kmVar, (C62958ce) null, 60571304, C63066gd.MESSAGE, C55225km.class);
    }

    private C55225km() {
    }

    /* renamed from: a */
    public final void mo54208a() {
        C62971cq cqVar = this.f145406d;
        if (!cqVar.mo58948c()) {
            this.f145406d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145407g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145407g = b;
                return null;
            case 2:
                return newMessageInfo(f145400e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003Л", new Object[]{"a", "b", C45240c.f118157a, "d", C55224kl.class});
            case 3:
                return new C55225km();
            case 4:
                return new C55222kj();
            case 5:
                return f145400e;
            case 6:
                C63010eb ebVar = f145402h;
                if (ebVar == null) {
                    synchronized (C55225km.class) {
                        ebVar = f145402h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145400e);
                            f145402h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
