package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.r */
/* compiled from: PG */
public final class C80388r extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C80388r f220587p;

    /* renamed from: q */
    private static volatile C63010eb f220588q;

    /* renamed from: a */
    public boolean f220589a;

    /* renamed from: b */
    public boolean f220590b;

    /* renamed from: c */
    public double f220591c;

    /* renamed from: d */
    public double f220592d;

    /* renamed from: e */
    public double f220593e;

    /* renamed from: f */
    public double f220594f;

    /* renamed from: g */
    public double f220595g;

    /* renamed from: h */
    public boolean f220596h;

    /* renamed from: i */
    public double f220597i;

    /* renamed from: j */
    public double f220598j;

    /* renamed from: k */
    public int f220599k;

    /* renamed from: l */
    public boolean f220600l;

    /* renamed from: m */
    public boolean f220601m;

    /* renamed from: n */
    public boolean f220602n;

    /* renamed from: o */
    public boolean f220603o;

    static {
        C80388r rVar = new C80388r();
        f220587p = rVar;
        C62942bv.registerDefaultInstance(C80388r.class, rVar);
    }

    private C80388r() {
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
                return newMessageInfo(f220587p, "\u0000\u000f\u0000\u0000\u0001\u0012\u000f\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0000\u0005\u0000\u0006\u0000\u0007\u0000\b\u0000\t\u0007\u000b\u0000\r\u0004\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0000", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "j"});
            case 3:
                return new C80388r();
            case 4:
                return new C80387q();
            case 5:
                return f220587p;
            case 6:
                C63010eb ebVar = f220588q;
                if (ebVar == null) {
                    synchronized (C80388r.class) {
                        ebVar = f220588q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220587p);
                            f220588q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
