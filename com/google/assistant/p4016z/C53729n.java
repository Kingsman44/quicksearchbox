package com.google.assistant.p4016z;

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

/* renamed from: com.google.assistant.z.n */
/* compiled from: PG */
public final class C53729n extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53729n f141051i;

    /* renamed from: j */
    private static volatile C63010eb f141052j;

    /* renamed from: a */
    public int f141053a;

    /* renamed from: b */
    public boolean f141054b;

    /* renamed from: c */
    public boolean f141055c;

    /* renamed from: d */
    public boolean f141056d;

    /* renamed from: e */
    public long f141057e;

    /* renamed from: f */
    public String f141058f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f141059g;

    /* renamed from: h */
    public String f141060h = BuildConfig.FLAVOR;

    static {
        C53729n nVar = new C53729n();
        f141051i = nVar;
        C62942bv.registerDefaultInstance(C53729n.class, nVar);
    }

    private C53729n() {
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
                return newMessageInfo(f141051i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0007င\u0006\bဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C53729n();
            case 4:
                return new C53728m();
            case 5:
                return f141051i;
            case 6:
                C63010eb ebVar = f141052j;
                if (ebVar == null) {
                    synchronized (C53729n.class) {
                        ebVar = f141052j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141051i);
                            f141052j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
