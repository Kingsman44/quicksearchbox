package com.google.android.apps.gsa.assist;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.an */
/* compiled from: PG */
public final class C9343an extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C9343an f32420i;

    /* renamed from: j */
    private static volatile C63010eb f32421j;

    /* renamed from: a */
    public int f32422a;

    /* renamed from: b */
    public int f32423b;

    /* renamed from: c */
    public int f32424c;

    /* renamed from: d */
    public float f32425d;

    /* renamed from: e */
    public boolean f32426e;

    /* renamed from: f */
    public boolean f32427f;

    /* renamed from: g */
    public boolean f32428g;

    /* renamed from: h */
    public boolean f32429h;

    static {
        C9343an anVar = new C9343an();
        f32420i = anVar;
        C62942bv.registerDefaultInstance(C9343an.class, anVar);
    }

    private C9343an() {
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
                return newMessageInfo(f32420i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C9343an();
            case 4:
                return new C9342am();
            case 5:
                return f32420i;
            case 6:
                C63010eb ebVar = f32421j;
                if (ebVar == null) {
                    synchronized (C9343an.class) {
                        ebVar = f32421j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32420i);
                            f32421j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
