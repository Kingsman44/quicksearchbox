package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

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

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.au */
/* compiled from: PG */
public final class C79946au extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C79946au f219229p;

    /* renamed from: q */
    private static volatile C63010eb f219230q;

    /* renamed from: a */
    public int f219231a;

    /* renamed from: b */
    public float f219232b;

    /* renamed from: c */
    public float f219233c;

    /* renamed from: d */
    public float f219234d;

    /* renamed from: e */
    public float f219235e;

    /* renamed from: f */
    public float f219236f;

    /* renamed from: g */
    public float f219237g;

    /* renamed from: h */
    public float f219238h;

    /* renamed from: i */
    public float f219239i;

    /* renamed from: j */
    public float f219240j;

    /* renamed from: k */
    public float f219241k;

    /* renamed from: l */
    public float f219242l;

    /* renamed from: m */
    public float f219243m;

    /* renamed from: n */
    public float f219244n;

    /* renamed from: o */
    public float f219245o;

    static {
        C79946au auVar = new C79946au();
        f219229p = auVar;
        C62942bv.registerDefaultInstance(C79946au.class, auVar);
    }

    private C79946au() {
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
                return newMessageInfo(f219229p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\b\bခ\t\tခ\n\nခ\u000b\u000bခ\f\fခ\r\rခ\u0006\u000eခ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, C19618h.f54585a, "i"});
            case 3:
                return new C79946au();
            case 4:
                return new C79945at();
            case 5:
                return f219229p;
            case 6:
                C63010eb ebVar = f219230q;
                if (ebVar == null) {
                    synchronized (C79946au.class) {
                        ebVar = f219230q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219229p);
                            f219230q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
