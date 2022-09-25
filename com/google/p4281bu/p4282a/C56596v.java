package com.google.p4281bu.p4282a;

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

/* renamed from: com.google.bu.a.v */
/* compiled from: PG */
public final class C56596v extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C56596v f151094i;

    /* renamed from: j */
    private static volatile C63010eb f151095j;

    /* renamed from: a */
    public String f151096a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f151097b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f151098c;

    /* renamed from: d */
    public String f151099d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f151100e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f151101f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f151102g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f151103h = BuildConfig.FLAVOR;

    static {
        C56596v vVar = new C56596v();
        f151094i = vVar;
        C62942bv.registerDefaultInstance(C56596v.class, vVar);
    }

    private C56596v() {
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
                return newMessageInfo(f151094i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C56596v();
            case 4:
                return new C56595u();
            case 5:
                return f151094i;
            case 6:
                C63010eb ebVar = f151095j;
                if (ebVar == null) {
                    synchronized (C56596v.class) {
                        ebVar = f151095j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151094i);
                            f151095j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
