package com.google.speech.p5218j.p5223d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.d.b */
/* compiled from: PG */
public final class C66883b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C66883b f181830j;

    /* renamed from: k */
    private static volatile C63010eb f181831k;

    /* renamed from: a */
    public int f181832a;

    /* renamed from: b */
    public boolean f181833b;

    /* renamed from: c */
    public int f181834c;

    /* renamed from: d */
    public long f181835d;

    /* renamed from: e */
    public long f181836e;

    /* renamed from: f */
    public int f181837f;

    /* renamed from: g */
    public boolean f181838g;

    /* renamed from: h */
    public int f181839h;

    /* renamed from: i */
    public long f181840i;

    static {
        C66883b bVar = new C66883b();
        f181830j = bVar;
        C62942bv.registerDefaultInstance(C66883b.class, bVar);
    }

    private C66883b() {
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
                return newMessageInfo(f181830j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007င\u0006\bဃ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C66883b();
            case 4:
                return new C66882a();
            case 5:
                return f181830j;
            case 6:
                C63010eb ebVar = f181831k;
                if (ebVar == null) {
                    synchronized (C66883b.class) {
                        ebVar = f181831k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181830j);
                            f181831k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
