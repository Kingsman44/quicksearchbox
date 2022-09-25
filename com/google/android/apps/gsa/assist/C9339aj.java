package com.google.android.apps.gsa.assist;

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

/* renamed from: com.google.android.apps.gsa.assist.aj */
/* compiled from: PG */
public final class C9339aj extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C9339aj f32401m;

    /* renamed from: n */
    private static volatile C63010eb f32402n;

    /* renamed from: a */
    public int f32403a;

    /* renamed from: b */
    public boolean f32404b;

    /* renamed from: c */
    public boolean f32405c;

    /* renamed from: d */
    public boolean f32406d;

    /* renamed from: e */
    public boolean f32407e;

    /* renamed from: f */
    public boolean f32408f;

    /* renamed from: g */
    public boolean f32409g;

    /* renamed from: h */
    public boolean f32410h;

    /* renamed from: i */
    public boolean f32411i;

    /* renamed from: j */
    public boolean f32412j;

    /* renamed from: k */
    public boolean f32413k;

    /* renamed from: l */
    public boolean f32414l;

    static {
        C9339aj ajVar = new C9339aj();
        f32401m = ajVar;
        C62942bv.registerDefaultInstance(C9339aj.class, ajVar);
    }

    private C9339aj() {
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
                return newMessageInfo(f32401m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C9339aj();
            case 4:
                return new C9338ai();
            case 5:
                return f32401m;
            case 6:
                C63010eb ebVar = f32402n;
                if (ebVar == null) {
                    synchronized (C9339aj.class) {
                        ebVar = f32402n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32401m);
                            f32402n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
