package com.google.p4225bm.p4226a.p4227a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bm.a.a.b */
/* compiled from: PG */
public final class C56109b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56109b f149462g;

    /* renamed from: i */
    private static volatile C63010eb f149463i;

    /* renamed from: a */
    public String f149464a = "https://podcasts.google.com/";

    /* renamed from: b */
    public String f149465b = "ep";

    /* renamed from: c */
    public String f149466c = "feed";

    /* renamed from: d */
    public String f149467d = "episode";

    /* renamed from: e */
    public String f149468e = "pep";

    /* renamed from: f */
    public String f149469f = "pe";

    /* renamed from: h */
    private int f149470h;

    static {
        C56109b bVar = new C56109b();
        f149462g = bVar;
        C62942bv.registerDefaultInstance(C56109b.class, bVar);
    }

    private C56109b() {
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
                return newMessageInfo(f149462g, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C56109b();
            case 4:
                return new C56108a();
            case 5:
                return f149462g;
            case 6:
                C63010eb ebVar = f149463i;
                if (ebVar == null) {
                    synchronized (C56109b.class) {
                        ebVar = f149463i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149462g);
                            f149463i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
