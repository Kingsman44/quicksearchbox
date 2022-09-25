package com.google.p395al.p417d.p418a.p419a.p420a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4343c.p4344a.C56949b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66208dv;

/* renamed from: com.google.al.d.a.a.a.b */
/* compiled from: PG */
public final class C8520b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8520b f29551d;

    /* renamed from: e */
    public static final C62940bt f29552e;

    /* renamed from: g */
    private static volatile C63010eb f29553g;

    /* renamed from: a */
    public int f29554a;

    /* renamed from: b */
    public C56949b f29555b;

    /* renamed from: c */
    public int f29556c;

    /* renamed from: f */
    private byte f29557f = 2;

    static {
        C8520b bVar = new C8520b();
        f29551d = bVar;
        C62942bv.registerDefaultInstance(C8520b.class, bVar);
        f29552e = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, bVar, bVar, (C62958ce) null, 218410495, C63066gd.MESSAGE, C8520b.class);
    }

    private C8520b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29557f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29557f = b;
                return null;
            case 2:
                return newMessageInfo(f29551d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8520b();
            case 4:
                return new C8519a();
            case 5:
                return f29551d;
            case 6:
                C63010eb ebVar = f29553g;
                if (ebVar == null) {
                    synchronized (C8520b.class) {
                        ebVar = f29553g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29551d);
                            f29553g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
