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

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.f */
/* compiled from: PG */
public final class C104510f extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C104510f f290670k;

    /* renamed from: m */
    private static volatile C63010eb f290671m;

    /* renamed from: a */
    public int f290672a;

    /* renamed from: b */
    public C9278v f290673b;

    /* renamed from: c */
    public int f290674c;

    /* renamed from: d */
    public int f290675d;

    /* renamed from: e */
    public C7718hj f290676e;

    /* renamed from: f */
    public C7718hj f290677f;

    /* renamed from: g */
    public int f290678g = -1;

    /* renamed from: h */
    public int f290679h = -1;

    /* renamed from: i */
    public int f290680i = -1;

    /* renamed from: j */
    public C7718hj f290681j;

    /* renamed from: l */
    private byte f290682l = 2;

    static {
        C104510f fVar = new C104510f();
        f290670k = fVar;
        C62942bv.registerDefaultInstance(C104510f.class, fVar);
    }

    private C104510f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290682l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290682l = b;
                return null;
            case 2:
                return newMessageInfo(f290670k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0004\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tᐉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C104510f();
            case 4:
                return new C104509e();
            case 5:
                return f290670k;
            case 6:
                C63010eb ebVar = f290671m;
                if (ebVar == null) {
                    synchronized (C104510f.class) {
                        ebVar = f290671m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290670k);
                            f290671m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
