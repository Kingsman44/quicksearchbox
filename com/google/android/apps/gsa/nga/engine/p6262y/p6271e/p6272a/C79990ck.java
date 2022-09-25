package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ck */
/* compiled from: PG */
public final class C79990ck extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C79990ck f219432l;

    /* renamed from: m */
    private static volatile C63010eb f219433m;

    /* renamed from: a */
    public int f219434a;

    /* renamed from: b */
    public float f219435b;

    /* renamed from: c */
    public float f219436c;

    /* renamed from: d */
    public float f219437d;

    /* renamed from: e */
    public float f219438e;

    /* renamed from: f */
    public float f219439f;

    /* renamed from: g */
    public float f219440g;

    /* renamed from: h */
    public float f219441h;

    /* renamed from: i */
    public float f219442i;

    /* renamed from: j */
    public float f219443j;

    /* renamed from: k */
    public float f219444k;

    static {
        C79990ck ckVar = new C79990ck();
        f219432l = ckVar;
        C62942bv.registerDefaultInstance(C79990ck.class, ckVar);
    }

    private C79990ck() {
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
                return newMessageInfo(f219432l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C79990ck();
            case 4:
                return new C79989cj();
            case 5:
                return f219432l;
            case 6:
                C63010eb ebVar = f219433m;
                if (ebVar == null) {
                    synchronized (C79990ck.class) {
                        ebVar = f219433m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219432l);
                            f219433m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
