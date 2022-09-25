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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.af */
/* compiled from: PG */
public final class C104489af extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C104489af f290595k;

    /* renamed from: m */
    private static volatile C63010eb f290596m;

    /* renamed from: a */
    public int f290597a;

    /* renamed from: b */
    public C9278v f290598b;

    /* renamed from: c */
    public C7718hj f290599c;

    /* renamed from: d */
    public C7718hj f290600d;

    /* renamed from: e */
    public int f290601e;

    /* renamed from: f */
    public int f290602f;

    /* renamed from: g */
    public int f290603g = -1;

    /* renamed from: h */
    public int f290604h = -1;

    /* renamed from: i */
    public int f290605i = -1;

    /* renamed from: j */
    public boolean f290606j;

    /* renamed from: l */
    private byte f290607l = 2;

    static {
        C104489af afVar = new C104489af();
        f290595k = afVar;
        C62942bv.registerDefaultInstance(C104489af.class, afVar);
    }

    private C104489af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290607l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290607l = b;
                return null;
            case 2:
                return newMessageInfo(f290595k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဇ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C104489af();
            case 4:
                return new C104488ae();
            case 5:
                return f290595k;
            case 6:
                C63010eb ebVar = f290596m;
                if (ebVar == null) {
                    synchronized (C104489af.class) {
                        ebVar = f290596m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290595k);
                            f290596m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
