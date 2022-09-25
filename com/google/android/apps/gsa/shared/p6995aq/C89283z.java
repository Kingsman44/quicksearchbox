package com.google.android.apps.gsa.shared.p6995aq;

import com.evernote.android.state.BuildConfig;
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
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.shared.aq.z */
/* compiled from: PG */
public final class C89283z extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C89283z f242073n;

    /* renamed from: o */
    private static volatile C63010eb f242074o;

    /* renamed from: a */
    public int f242075a;

    /* renamed from: b */
    public int f242076b = PrivateKeyType.INVALID;

    /* renamed from: c */
    public int f242077c;

    /* renamed from: d */
    public int f242078d;

    /* renamed from: e */
    public boolean f242079e;

    /* renamed from: f */
    public boolean f242080f = true;

    /* renamed from: g */
    public boolean f242081g;

    /* renamed from: h */
    public C89278u f242082h;

    /* renamed from: i */
    public int f242083i;

    /* renamed from: j */
    public String f242084j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f242085k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C89282y f242086l;

    /* renamed from: m */
    public int f242087m;

    static {
        C89283z zVar = new C89283z();
        f242073n = zVar;
        C62942bv.registerDefaultInstance(C89283z.class, zVar);
    }

    private C89283z() {
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
                return newMessageInfo(f242073n, "\u0001\f\u0000\u0001\u0001\u0016\f\u0000\u0000\u0000\u0001င\u0000\u0003ဌ\u0002\u0004ဌ\u0003\u0006ဇ\t\tဇ\f\nဌ\u000e\u000bဉ\u0011\fင\u0012\u0012ဉ\r\u0013ဈ\u000f\u0014ဇ\u0007\u0016ဈ\u0010", new Object[]{"a", "b", C45240c.f118157a, C89268k.f242046a, "d", C89279v.f242065a, C10662f.f35572a, C30325g.f82003a, "i", C89271n.f242047a, "l", "m", C19618h.f54585a, "j", "e", C19621k.f54601a});
            case 3:
                return new C89283z();
            case 4:
                return new C89270m();
            case 5:
                return f242073n;
            case 6:
                C63010eb ebVar = f242074o;
                if (ebVar == null) {
                    synchronized (C89283z.class) {
                        ebVar = f242074o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242073n);
                            f242074o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
