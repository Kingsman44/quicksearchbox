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

/* renamed from: com.google.bb.a.ll */
/* compiled from: PG */
public final class C55251ll extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55251ll f145499e;

    /* renamed from: f */
    public static final C62940bt f145500f;

    /* renamed from: h */
    private static volatile C63010eb f145501h;

    /* renamed from: a */
    public int f145502a;

    /* renamed from: b */
    public C62971cq f145503b = emptyProtobufList();

    /* renamed from: c */
    public int f145504c;

    /* renamed from: d */
    public C55183iy f145505d;

    /* renamed from: g */
    private byte f145506g = 2;

    static {
        C55251ll llVar = new C55251ll();
        f145499e = llVar;
        C62942bv.registerDefaultInstance(C55251ll.class, llVar);
        f145500f = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, llVar, llVar, (C62958ce) null, 65803704, C63066gd.MESSAGE, C55251ll.class);
    }

    private C55251ll() {
    }

    /* renamed from: a */
    public final void mo54220a() {
        C62971cq cqVar = this.f145503b;
        if (!cqVar.mo58948c()) {
            this.f145503b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145506g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145506g = b;
                return null;
            case 2:
                return newMessageInfo(f145499e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C55250lk.class, C45240c.f118157a, "d"});
            case 3:
                return new C55251ll();
            case 4:
                return new C55248li();
            case 5:
                return f145499e;
            case 6:
                C63010eb ebVar = f145501h;
                if (ebVar == null) {
                    synchronized (C55251ll.class) {
                        ebVar = f145501h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145499e);
                            f145501h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
