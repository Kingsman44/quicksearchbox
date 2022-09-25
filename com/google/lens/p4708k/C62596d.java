package com.google.lens.p4708k;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62452cb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.d */
/* compiled from: PG */
public final class C62596d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62596d f168994g;

    /* renamed from: i */
    private static volatile C63010eb f168995i;

    /* renamed from: a */
    public int f168996a;

    /* renamed from: b */
    public C62971cq f168997b = emptyProtobufList();

    /* renamed from: c */
    public C62595c f168998c;

    /* renamed from: d */
    public C62452cb f168999d;

    /* renamed from: e */
    public boolean f169000e;

    /* renamed from: f */
    public boolean f169001f;

    /* renamed from: h */
    private byte f169002h = 2;

    static {
        C62596d dVar = new C62596d();
        f168994g = dVar;
        C62942bv.registerDefaultInstance(C62596d.class, dVar);
    }

    private C62596d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169002h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169002h = b;
                return null;
            case 2:
                return newMessageInfo(f168994g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001Л\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဇ\u0003\u0007ဇ\u0005", new Object[]{"a", "b", C62610r.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C62596d();
            case 4:
                return new C62593a();
            case 5:
                return f168994g;
            case 6:
                C63010eb ebVar = f168995i;
                if (ebVar == null) {
                    synchronized (C62596d.class) {
                        ebVar = f168995i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168994g);
                            f168995i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
