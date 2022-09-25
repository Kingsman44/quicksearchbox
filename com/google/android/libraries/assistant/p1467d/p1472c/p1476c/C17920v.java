package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.d.c.c.v */
/* compiled from: PG */
public final class C17920v extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C17920v f51335j;

    /* renamed from: k */
    private static volatile C63010eb f51336k;

    /* renamed from: a */
    public int f51337a;

    /* renamed from: b */
    public String f51338b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f51339c;

    /* renamed from: d */
    public C63088z f51340d = C63088z.f170246b;

    /* renamed from: e */
    public boolean f51341e;

    /* renamed from: f */
    public boolean f51342f;

    /* renamed from: g */
    public String f51343g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f51344h;

    /* renamed from: i */
    public int f51345i;

    static {
        C17920v vVar = new C17920v();
        f51335j = vVar;
        C62942bv.registerDefaultInstance(C17920v.class, vVar);
    }

    private C17920v() {
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
                return newMessageInfo(f51335j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ည\u0002\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဇ\u0007\tင\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C17920v();
            case 4:
                return new C17919u();
            case 5:
                return f51335j;
            case 6:
                C63010eb ebVar = f51336k;
                if (ebVar == null) {
                    synchronized (C17920v.class) {
                        ebVar = f51336k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51335j);
                            f51336k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
