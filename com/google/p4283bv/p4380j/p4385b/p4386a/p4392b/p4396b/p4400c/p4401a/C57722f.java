package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4401a;

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
import com.google.protos.youtube.elements.C66244fd;

/* renamed from: com.google.bv.j.b.a.b.b.c.a.f */
/* compiled from: PG */
public final class C57722f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57722f f154210d;

    /* renamed from: e */
    public static final C62940bt f154211e;

    /* renamed from: g */
    private static volatile C63010eb f154212g;

    /* renamed from: a */
    public int f154213a;

    /* renamed from: b */
    public C57718b f154214b;

    /* renamed from: c */
    public C62971cq f154215c = emptyProtobufList();

    /* renamed from: f */
    private byte f154216f = 2;

    static {
        C57722f fVar = new C57722f();
        f154210d = fVar;
        C62942bv.registerDefaultInstance(C57722f.class, fVar);
        f154211e = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, fVar, fVar, (C62958ce) null, 427723515, C63066gd.MESSAGE, C57722f.class);
    }

    private C57722f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154216f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154216f = b;
                return null;
            case 2:
                return newMessageInfo(f154210d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C57720d.class});
            case 3:
                return new C57722f();
            case 4:
                return new C57721e();
            case 5:
                return f154210d;
            case 6:
                C63010eb ebVar = f154212g;
                if (ebVar == null) {
                    synchronized (C57722f.class) {
                        ebVar = f154212g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154210d);
                            f154212g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
