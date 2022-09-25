package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.n */
/* compiled from: PG */
public final class C104518n extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C104518n f290704h;

    /* renamed from: j */
    private static volatile C63010eb f290705j;

    /* renamed from: a */
    public int f290706a;

    /* renamed from: b */
    public C7718hj f290707b;

    /* renamed from: c */
    public C7718hj f290708c;

    /* renamed from: d */
    public int f290709d = -1;

    /* renamed from: e */
    public int f290710e = -1;

    /* renamed from: f */
    public int f290711f = -1;

    /* renamed from: g */
    public C104520p f290712g;

    /* renamed from: i */
    private byte f290713i = 2;

    static {
        C104518n nVar = new C104518n();
        f290704h = nVar;
        C62942bv.registerDefaultInstance(C104518n.class, nVar);
    }

    private C104518n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290713i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290713i = b;
                return null;
            case 2:
                return newMessageInfo(f290704h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005င\u0004\u0006င\u0005\u0007င\u0006\bᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C104518n();
            case 4:
                return new C104517m();
            case 5:
                return f290704h;
            case 6:
                C63010eb ebVar = f290705j;
                if (ebVar == null) {
                    synchronized (C104518n.class) {
                        ebVar = f290705j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290704h);
                            f290705j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
