package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.al */
/* compiled from: PG */
public final class C60120al extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60120al f162592f;

    /* renamed from: h */
    private static volatile C63010eb f162593h;

    /* renamed from: a */
    public int f162594a;

    /* renamed from: b */
    public int f162595b = 0;

    /* renamed from: c */
    public Object f162596c;

    /* renamed from: d */
    public C60114af f162597d;

    /* renamed from: e */
    public C62971cq f162598e = emptyProtobufList();

    /* renamed from: g */
    private byte f162599g = 2;

    static {
        C60120al alVar = new C60120al();
        f162592f = alVar;
        C62942bv.registerDefaultInstance(C60120al.class, alVar);
    }

    private C60120al() {
    }

    /* renamed from: a */
    public final void mo57069a() {
        C62971cq cqVar = this.f162598e;
        if (!cqVar.mo58948c()) {
            this.f162598e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162599g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162599g = b;
                return null;
            case 2:
                return newMessageInfo(f162592f, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C60114af.class, C60117ai.class});
            case 3:
                return new C60120al();
            case 4:
                return new C60115ag();
            case 5:
                return f162592f;
            case 6:
                C63010eb ebVar = f162593h;
                if (ebVar == null) {
                    synchronized (C60120al.class) {
                        ebVar = f162593h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162592f);
                            f162593h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
