package com.google.assistant.p3803ag.p3804a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.ba */
/* compiled from: PG */
public final class C48834ba extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48834ba f126365a;

    /* renamed from: i */
    private static volatile C63010eb f126366i;

    /* renamed from: b */
    private int f126367b;

    /* renamed from: c */
    private C48814av f126368c;

    /* renamed from: d */
    private C48812at f126369d;

    /* renamed from: e */
    private C48809aq f126370e;

    /* renamed from: f */
    private C48816ax f126371f;

    /* renamed from: g */
    private C48818az f126372g;

    /* renamed from: h */
    private byte f126373h = 2;

    static {
        C48834ba baVar = new C48834ba();
        f126365a = baVar;
        C62942bv.registerDefaultInstance(C48834ba.class, baVar);
    }

    private C48834ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126373h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126373h = b;
                return null;
            case 2:
                return newMessageInfo(f126365a, "\u0001\u0005\u0000\u0001\u0002\u0010\u0005\u0000\u0000\u0004\u0002ᐉ\u0001\u0004ᐉ\u0003\u0007ᐉ\u0007\rဉ\b\u0010ᐉ\u000f", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C48834ba();
            case 4:
                return new C48810ar();
            case 5:
                return f126365a;
            case 6:
                C63010eb ebVar = f126366i;
                if (ebVar == null) {
                    synchronized (C48834ba.class) {
                        ebVar = f126366i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126365a);
                            f126366i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
