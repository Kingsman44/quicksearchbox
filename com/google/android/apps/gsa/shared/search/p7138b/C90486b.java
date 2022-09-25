package com.google.android.apps.gsa.shared.search.p7138b;

import com.google.android.apps.search.googleapp.search.p10409e.C137412a;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5535j.p5536a.p5545c.p5548c.p5550b.C71142b;

/* renamed from: com.google.android.apps.gsa.shared.search.b.b */
/* compiled from: PG */
public final class C90486b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C90486b f252864g;

    /* renamed from: i */
    private static volatile C63010eb f252865i;

    /* renamed from: a */
    public int f252866a;

    /* renamed from: b */
    public boolean f252867b;

    /* renamed from: c */
    public boolean f252868c;

    /* renamed from: d */
    public long f252869d;

    /* renamed from: e */
    public int f252870e;

    /* renamed from: f */
    public C71142b f252871f;

    /* renamed from: h */
    private byte f252872h = 2;

    static {
        C90486b bVar = new C90486b();
        f252864g = bVar;
        C62942bv.registerDefaultInstance(C90486b.class, bVar);
    }

    private C90486b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f252872h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f252872h = b;
                return null;
            case 2:
                return newMessageInfo(f252864g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0006ဂ\u0004\bဌ\u0005\nᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C137412a.f373764a, C10662f.f35572a});
            case 3:
                return new C90486b();
            case 4:
                return new C90485a();
            case 5:
                return f252864g;
            case 6:
                C63010eb ebVar = f252865i;
                if (ebVar == null) {
                    synchronized (C90486b.class) {
                        ebVar = f252865i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252864g);
                            f252865i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
