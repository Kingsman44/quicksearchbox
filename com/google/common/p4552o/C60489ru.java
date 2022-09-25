package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ru */
/* compiled from: PG */
public final class C60489ru extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60489ru f163711h;

    /* renamed from: i */
    private static volatile C63010eb f163712i;

    /* renamed from: a */
    public int f163713a;

    /* renamed from: b */
    public int f163714b;

    /* renamed from: c */
    public int f163715c;

    /* renamed from: d */
    public int f163716d;

    /* renamed from: e */
    public int f163717e;

    /* renamed from: f */
    public C60488rt f163718f;

    /* renamed from: g */
    public C60486rr f163719g;

    static {
        C60489ru ruVar = new C60489ru();
        f163711h = ruVar;
        C62942bv.registerDefaultInstance(C60489ru.class, ruVar);
    }

    private C60489ru() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f163711h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C60484rp.f163694a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C60489ru();
            case 4:
                return new C60483ro();
            case 5:
                return f163711h;
            case 6:
                C63010eb ebVar = f163712i;
                if (ebVar == null) {
                    synchronized (C60489ru.class) {
                        ebVar = f163712i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163711h);
                            f163712i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
