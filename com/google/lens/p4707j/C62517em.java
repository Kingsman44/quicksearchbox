package com.google.lens.p4707j;

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

/* renamed from: com.google.lens.j.em */
/* compiled from: PG */
public final class C62517em extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C62517em f168785q;

    /* renamed from: r */
    private static volatile C63010eb f168786r;

    /* renamed from: a */
    public int f168787a;

    /* renamed from: b */
    public boolean f168788b = true;

    /* renamed from: c */
    public boolean f168789c = true;

    /* renamed from: d */
    public boolean f168790d;

    /* renamed from: e */
    public boolean f168791e;

    /* renamed from: f */
    public boolean f168792f;

    /* renamed from: g */
    public boolean f168793g;

    /* renamed from: h */
    public float f168794h = 0.1f;

    /* renamed from: i */
    public boolean f168795i;

    /* renamed from: j */
    public boolean f168796j;

    /* renamed from: k */
    public int f168797k;

    /* renamed from: l */
    public int f168798l = 2;

    /* renamed from: m */
    public int f168799m = 5;

    /* renamed from: n */
    public boolean f168800n;

    /* renamed from: o */
    public boolean f168801o;

    /* renamed from: p */
    public boolean f168802p;

    static {
        C62517em emVar = new C62517em();
        f168785q = emVar;
        C62942bv.registerDefaultInstance(C62517em.class, emVar);
    }

    private C62517em() {
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
                return newMessageInfo(f168785q, "\u0001\u000f\u0000\u0001\u0002 \u000f\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tခ\b\nဇ\t\u0015ဇ\u000b\u0016င\f\u0017င\r\u0018င\u000e\u001eဇ\u000f\u001fဇ\u0010 ဇ\u0011", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new C62517em();
            case 4:
                return new C62516el();
            case 5:
                return f168785q;
            case 6:
                C63010eb ebVar = f168786r;
                if (ebVar == null) {
                    synchronized (C62517em.class) {
                        ebVar = f168786r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168785q);
                            f168786r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
