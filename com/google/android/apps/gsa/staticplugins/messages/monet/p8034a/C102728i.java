package com.google.android.apps.gsa.staticplugins.messages.monet.p8034a;

import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.a.i */
/* compiled from: PG */
public final class C102728i extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62962ci f286783g = new C102726g();

    /* renamed from: l */
    public static final C102728i f286784l;

    /* renamed from: m */
    private static volatile C63010eb f286785m;

    /* renamed from: a */
    public int f286786a;

    /* renamed from: b */
    public int f286787b;

    /* renamed from: c */
    public int f286788c;

    /* renamed from: d */
    public int f286789d;

    /* renamed from: e */
    public int f286790e;

    /* renamed from: f */
    public C62961ch f286791f = emptyIntList();

    /* renamed from: h */
    public boolean f286792h;

    /* renamed from: i */
    public int f286793i = 1;

    /* renamed from: j */
    public boolean f286794j;

    /* renamed from: k */
    public boolean f286795k;

    static {
        C102728i iVar = new C102728i();
        f286784l = iVar;
        C62942bv.registerDefaultInstance(C102728i.class, iVar);
    }

    private C102728i() {
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
                return newMessageInfo(f286784l, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0005င\u0003\u0006\u001e\u0007ဇ\u0004\bဌ\u0005\tဇ\u0006\nဇ\u0007", new Object[]{"a", "b", C87544b.m142202b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C102721b.m170318b(), C19618h.f54585a, "i", C102725f.m170320b(), "j", C19621k.f54601a});
            case 3:
                return new C102728i();
            case 4:
                return new C102727h();
            case 5:
                return f286784l;
            case 6:
                C63010eb ebVar = f286785m;
                if (ebVar == null) {
                    synchronized (C102728i.class) {
                        ebVar = f286785m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f286784l);
                            f286785m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
