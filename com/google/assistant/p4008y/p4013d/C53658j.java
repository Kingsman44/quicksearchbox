package com.google.assistant.p4008y.p4013d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49007d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.y.d.j */
/* compiled from: PG */
public final class C53658j extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53658j f140828i;

    /* renamed from: j */
    private static volatile C63010eb f140829j;

    /* renamed from: a */
    public int f140830a;

    /* renamed from: b */
    public int f140831b = 0;

    /* renamed from: c */
    public Object f140832c;

    /* renamed from: d */
    public int f140833d = 0;

    /* renamed from: e */
    public Object f140834e;

    /* renamed from: f */
    public int f140835f;

    /* renamed from: g */
    public C63042fg f140836g;

    /* renamed from: h */
    public C49007d f140837h;

    static {
        C53658j jVar = new C53658j();
        f140828i = jVar;
        C62942bv.registerDefaultInstance(C53658j.class, jVar);
    }

    private C53658j() {
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
                return newMessageInfo(f140828i, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ြ\u0001", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C53656h.f140827a, C30325g.f82003a, C19618h.f54585a, C53664p.class});
            case 3:
                return new C53658j();
            case 4:
                return new C53655g();
            case 5:
                return f140828i;
            case 6:
                C63010eb ebVar = f140829j;
                if (ebVar == null) {
                    synchronized (C53658j.class) {
                        ebVar = f140829j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140828i);
                            f140829j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
