package com.google.lens.p4698d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58122b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.lens.d.b */
/* compiled from: PG */
public final class C62163b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C62163b f167812i;

    /* renamed from: j */
    public static final C62940bt f167813j;

    /* renamed from: k */
    private static volatile C63010eb f167814k;

    /* renamed from: a */
    public int f167815a;

    /* renamed from: b */
    public boolean f167816b;

    /* renamed from: c */
    public int f167817c;

    /* renamed from: d */
    public int f167818d;

    /* renamed from: e */
    public int f167819e;

    /* renamed from: f */
    public int f167820f;

    /* renamed from: g */
    public int f167821g;

    /* renamed from: h */
    public int f167822h;

    static {
        C62163b bVar = new C62163b();
        f167812i = bVar;
        C62942bv.registerDefaultInstance(C62163b.class, bVar);
        f167813j = C62942bv.newSingularGeneratedExtension(C58122b.f155367p, bVar, bVar, (C62958ce) null, 298467772, C63066gd.MESSAGE, C62163b.class);
    }

    private C62163b() {
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
                return newMessageInfo(f167812i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C62163b();
            case 4:
                return new C62162a();
            case 5:
                return f167812i;
            case 6:
                C63010eb ebVar = f167814k;
                if (ebVar == null) {
                    synchronized (C62163b.class) {
                        ebVar = f167814k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167812i);
                            f167814k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
