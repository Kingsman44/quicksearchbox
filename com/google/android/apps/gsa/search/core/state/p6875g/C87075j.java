package com.google.android.apps.gsa.search.core.state.p6875g;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.state.g.j */
/* compiled from: PG */
public final class C87075j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C87075j f235277g;

    /* renamed from: h */
    public static final C62940bt f235278h;

    /* renamed from: j */
    private static volatile C63010eb f235279j;

    /* renamed from: a */
    public int f235280a;

    /* renamed from: b */
    public C63088z f235281b = C63088z.f170246b;

    /* renamed from: c */
    public long f235282c;

    /* renamed from: d */
    public C90488d f235283d;

    /* renamed from: e */
    public C63088z f235284e;

    /* renamed from: f */
    public C63088z f235285f;

    /* renamed from: i */
    private byte f235286i = 2;

    static {
        C87075j jVar = new C87075j();
        f235277g = jVar;
        C62942bv.registerDefaultInstance(C87075j.class, jVar);
        f235278h = C62942bv.newSingularGeneratedExtension(C88433bd.f239087e, jVar, jVar, (C62958ce) null, 132269388, C63066gd.MESSAGE, C87075j.class);
    }

    private C87075j() {
        C63088z zVar = C63088z.f170246b;
        this.f235284e = zVar;
        this.f235285f = zVar;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f235286i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f235286i = b;
                return null;
            case 2:
                return newMessageInfo(f235277g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ည\u0000\u0002ဎ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005ည\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C87075j();
            case 4:
                return new C87074i();
            case 5:
                return f235277g;
            case 6:
                C63010eb ebVar = f235279j;
                if (ebVar == null) {
                    synchronized (C87075j.class) {
                        ebVar = f235279j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235277g);
                            f235279j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
