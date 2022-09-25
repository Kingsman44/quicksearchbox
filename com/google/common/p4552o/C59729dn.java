package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.dn */
/* compiled from: PG */
public final class C59729dn extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59729dn f160317h;

    /* renamed from: i */
    private static volatile C63010eb f160318i;

    /* renamed from: a */
    public int f160319a;

    /* renamed from: b */
    public boolean f160320b;

    /* renamed from: c */
    public boolean f160321c;

    /* renamed from: d */
    public boolean f160322d;

    /* renamed from: e */
    public boolean f160323e;

    /* renamed from: f */
    public int f160324f;

    /* renamed from: g */
    public int f160325g;

    static {
        C59729dn dnVar = new C59729dn();
        f160317h = dnVar;
        C62942bv.registerDefaultInstance(C59729dn.class, dnVar);
    }

    private C59729dn() {
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
                return newMessageInfo(f160317h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C59728dm.m92494b(), C30325g.f82003a});
            case 3:
                return new C59729dn();
            case 4:
                return new C59726dk();
            case 5:
                return f160317h;
            case 6:
                C63010eb ebVar = f160318i;
                if (ebVar == null) {
                    synchronized (C59729dn.class) {
                        ebVar = f160318i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160317h);
                            f160318i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
