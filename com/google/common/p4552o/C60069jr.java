package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.jr */
/* compiled from: PG */
public final class C60069jr extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C60069jr f162379n;

    /* renamed from: o */
    private static volatile C63010eb f162380o;

    /* renamed from: a */
    public int f162381a;

    /* renamed from: b */
    public int f162382b;

    /* renamed from: c */
    public int f162383c;

    /* renamed from: d */
    public int f162384d;

    /* renamed from: e */
    public int f162385e;

    /* renamed from: f */
    public int f162386f;

    /* renamed from: g */
    public int f162387g;

    /* renamed from: h */
    public int f162388h;

    /* renamed from: i */
    public int f162389i;

    /* renamed from: j */
    public int f162390j;

    /* renamed from: k */
    public int f162391k;

    /* renamed from: l */
    public boolean f162392l;

    /* renamed from: m */
    public boolean f162393m;

    static {
        C60069jr jrVar = new C60069jr();
        f162379n = jrVar;
        C62942bv.registerDefaultInstance(C60069jr.class, jrVar);
    }

    private C60069jr() {
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
                return newMessageInfo(f162379n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\fင\u000b\rဇ\f\u000eဇ\r", new Object[]{"a", "b", C60067jp.f162377a, C45240c.f118157a, C60068jq.f162378a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C60069jr();
            case 4:
                return new C60066jo();
            case 5:
                return f162379n;
            case 6:
                C63010eb ebVar = f162380o;
                if (ebVar == null) {
                    synchronized (C60069jr.class) {
                        ebVar = f162380o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162379n);
                            f162380o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
