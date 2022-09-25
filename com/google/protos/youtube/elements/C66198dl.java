package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.dl */
/* compiled from: PG */
public final class C66198dl extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C66198dl f180008b;

    /* renamed from: c */
    public static final C62940bt f180009c;

    /* renamed from: f */
    private static volatile C63010eb f180010f;

    /* renamed from: a */
    public C66196dj f180011a;

    /* renamed from: d */
    private int f180012d;

    /* renamed from: e */
    private byte f180013e = 2;

    static {
        C66198dl dlVar = new C66198dl();
        f180008b = dlVar;
        C62942bv.registerDefaultInstance(C66198dl.class, dlVar);
        f180009c = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, dlVar, dlVar, (C62958ce) null, 255496645, C63066gd.MESSAGE, C66198dl.class);
    }

    private C66198dl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180013e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180013e = b;
                return null;
            case 2:
                return newMessageInfo(f180008b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"d", "a"});
            case 3:
                return new C66198dl();
            case 4:
                return new C66197dk();
            case 5:
                return f180008b;
            case 6:
                C63010eb ebVar = f180010f;
                if (ebVar == null) {
                    synchronized (C66198dl.class) {
                        ebVar = f180010f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180008b);
                            f180010f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
