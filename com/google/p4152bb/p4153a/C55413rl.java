package com.google.p4152bb.p4153a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
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

/* renamed from: com.google.bb.a.rl */
/* compiled from: PG */
public final class C55413rl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55413rl f146015d;

    /* renamed from: e */
    public static final C62940bt f146016e;

    /* renamed from: h */
    private static volatile C63010eb f146017h;

    /* renamed from: a */
    public C62971cq f146018a = emptyProtobufList();

    /* renamed from: b */
    public boolean f146019b;

    /* renamed from: c */
    public C62971cq f146020c = emptyProtobufList();

    /* renamed from: f */
    private int f146021f;

    /* renamed from: g */
    private byte f146022g = 2;

    static {
        C55413rl rlVar = new C55413rl();
        f146015d = rlVar;
        C62942bv.registerDefaultInstance(C55413rl.class, rlVar);
        f146016e = C62942bv.newSingularGeneratedExtension(C55415rn.f146023d, rlVar, rlVar, (C62958ce) null, 89923117, C63066gd.MESSAGE, C55413rl.class);
    }

    private C55413rl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f146022g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f146022g = b;
                return null;
            case 2:
                return newMessageInfo(f146015d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0002\u0002Л\u0003ဇ\u0001\u0004Л", new Object[]{C10662f.f35572a, "a", C55412rk.class, "b", C45240c.f118157a, C55412rk.class});
            case 3:
                return new C55413rl();
            case 4:
                return new C55410ri();
            case 5:
                return f146015d;
            case 6:
                C63010eb ebVar = f146017h;
                if (ebVar == null) {
                    synchronized (C55413rl.class) {
                        ebVar = f146017h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146015d);
                            f146017h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
