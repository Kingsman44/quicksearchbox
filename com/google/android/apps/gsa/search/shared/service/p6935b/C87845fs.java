package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.fs */
/* compiled from: PG */
public final class C87845fs extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C87845fs f237675c;

    /* renamed from: e */
    private static volatile C63010eb f237676e;

    /* renamed from: a */
    public int f237677a;

    /* renamed from: b */
    public int f237678b;

    /* renamed from: d */
    private byte f237679d = 2;

    static {
        C87845fs fsVar = new C87845fs();
        f237675c = fsVar;
        C62942bv.registerDefaultInstance(C87845fs.class, fsVar);
    }

    private C87845fs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237679d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237679d = b;
                return null;
            case 2:
                return newMessageInfo(f237675c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87845fs();
            case 4:
                return new C87844fr();
            case 5:
                return f237675c;
            case 6:
                C63010eb ebVar = f237676e;
                if (ebVar == null) {
                    synchronized (C87845fs.class) {
                        ebVar = f237676e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237675c);
                            f237676e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
