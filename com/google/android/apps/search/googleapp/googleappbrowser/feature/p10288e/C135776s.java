package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.s */
/* compiled from: PG */
public final class C135776s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C135776s f369838d;

    /* renamed from: f */
    private static volatile C63010eb f369839f;

    /* renamed from: a */
    public int f369840a;

    /* renamed from: b */
    public boolean f369841b;

    /* renamed from: c */
    public C54120s f369842c;

    /* renamed from: e */
    private byte f369843e = 2;

    static {
        C135776s sVar = new C135776s();
        f369838d = sVar;
        C62942bv.registerDefaultInstance(C135776s.class, sVar);
    }

    private C135776s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f369843e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f369843e = b;
                return null;
            case 2:
                return newMessageInfo(f369838d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဇ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C135776s();
            case 4:
                return new C135775r();
            case 5:
                return f369838d;
            case 6:
                C63010eb ebVar = f369839f;
                if (ebVar == null) {
                    synchronized (C135776s.class) {
                        ebVar = f369839f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369838d);
                            f369839f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
