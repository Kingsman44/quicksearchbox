package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.l */
/* compiled from: PG */
public final class C104516l extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C104516l f290692j;

    /* renamed from: l */
    private static volatile C63010eb f290693l;

    /* renamed from: a */
    public int f290694a;

    /* renamed from: b */
    public C9278v f290695b;

    /* renamed from: c */
    public C7718hj f290696c;

    /* renamed from: d */
    public C7718hj f290697d;

    /* renamed from: e */
    public int f290698e;

    /* renamed from: f */
    public int f290699f;

    /* renamed from: g */
    public int f290700g = -1;

    /* renamed from: h */
    public int f290701h = -1;

    /* renamed from: i */
    public int f290702i = -1;

    /* renamed from: k */
    private byte f290703k = 2;

    static {
        C104516l lVar = new C104516l();
        f290692j = lVar;
        C62942bv.registerDefaultInstance(C104516l.class, lVar);
    }

    private C104516l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290703k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290703k = b;
                return null;
            case 2:
                return newMessageInfo(f290692j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C104516l();
            case 4:
                return new C104515k();
            case 5:
                return f290692j;
            case 6:
                C63010eb ebVar = f290693l;
                if (ebVar == null) {
                    synchronized (C104516l.class) {
                        ebVar = f290693l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290692j);
                            f290693l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
