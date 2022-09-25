package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4695b.C62160f;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.cw */
/* compiled from: PG */
public final class C54042cw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54042cw f141794e;

    /* renamed from: g */
    private static volatile C63010eb f141795g;

    /* renamed from: a */
    public int f141796a;

    /* renamed from: b */
    public C56244ay f141797b;

    /* renamed from: c */
    public C62971cq f141798c = emptyProtobufList();

    /* renamed from: d */
    public C62910ar f141799d;

    /* renamed from: f */
    private byte f141800f = 2;

    static {
        C54042cw cwVar = new C54042cw();
        f141794e = cwVar;
        C62942bv.registerDefaultInstance(C54042cw.class, cwVar);
    }

    private C54042cw() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141800f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141800f = b;
                return null;
            case 2:
                return newMessageInfo(f141794e, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0003ဉ\u0001\u0004ဉ\u0000", new Object[]{"a", C45240c.f118157a, C62160f.class, "d", "b"});
            case 3:
                return new C54042cw();
            case 4:
                return new C54041cv();
            case 5:
                return f141794e;
            case 6:
                C63010eb ebVar = f141795g;
                if (ebVar == null) {
                    synchronized (C54042cw.class) {
                        ebVar = f141795g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141794e);
                            f141795g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
