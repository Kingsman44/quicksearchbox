package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.eu */
/* compiled from: PG */
public final class C66234eu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66234eu f180108c;

    /* renamed from: d */
    public static final C62940bt f180109d;

    /* renamed from: f */
    private static volatile C63010eb f180110f;

    /* renamed from: a */
    public int f180111a;

    /* renamed from: b */
    public C66182d f180112b;

    /* renamed from: e */
    private byte f180113e = 2;

    static {
        C66234eu euVar = new C66234eu();
        f180108c = euVar;
        C62942bv.registerDefaultInstance(C66234eu.class, euVar);
        f180109d = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, euVar, euVar, (C62958ce) null, 158796380, C63066gd.MESSAGE, C66234eu.class);
    }

    private C66234eu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180113e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180113e = b;
                return null;
            case 2:
                return newMessageInfo(f180108c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66234eu();
            case 4:
                return new C66233et();
            case 5:
                return f180108c;
            case 6:
                C63010eb ebVar = f180110f;
                if (ebVar == null) {
                    synchronized (C66234eu.class) {
                        ebVar = f180110f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180108c);
                            f180110f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
