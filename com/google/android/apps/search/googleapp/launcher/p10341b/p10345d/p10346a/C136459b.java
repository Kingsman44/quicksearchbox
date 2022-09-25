package com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.p10346a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.d.a.b */
/* compiled from: PG */
public final class C136459b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C136459b f371515j;

    /* renamed from: k */
    private static volatile C63010eb f371516k;

    /* renamed from: a */
    public int f371517a;

    /* renamed from: b */
    public long f371518b;

    /* renamed from: c */
    public int f371519c;

    /* renamed from: d */
    public int f371520d;

    /* renamed from: e */
    public boolean f371521e;

    /* renamed from: f */
    public boolean f371522f;

    /* renamed from: g */
    public boolean f371523g;

    /* renamed from: h */
    public boolean f371524h;

    /* renamed from: i */
    public boolean f371525i;

    static {
        C136459b bVar = new C136459b();
        f371515j = bVar;
        C62942bv.registerDefaultInstance(C136459b.class, bVar);
    }

    private C136459b() {
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
                return newMessageInfo(f371515j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C136459b();
            case 4:
                return new C136458a();
            case 5:
                return f371515j;
            case 6:
                C63010eb ebVar = f371516k;
                if (ebVar == null) {
                    synchronized (C136459b.class) {
                        ebVar = f371516k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371515j);
                            f371516k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
