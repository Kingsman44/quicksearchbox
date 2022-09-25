package com.google.speech.p5218j;

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

/* renamed from: com.google.speech.j.ae */
/* compiled from: PG */
public final class C66764ae extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C66764ae f181577i;

    /* renamed from: j */
    private static volatile C63010eb f181578j;

    /* renamed from: a */
    public int f181579a;

    /* renamed from: b */
    public String f181580b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f181581c;

    /* renamed from: d */
    public int f181582d;

    /* renamed from: e */
    public String f181583e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f181584f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f181585g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f181586h = BuildConfig.FLAVOR;

    static {
        C66764ae aeVar = new C66764ae();
        f181577i = aeVar;
        C62942bv.registerDefaultInstance(C66764ae.class, aeVar);
    }

    private C66764ae() {
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
                return newMessageInfo(f181577i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0004\u0003ဈ\u0005\u0004ဈ\u0006\u0006ဌ\u0001\u0007ဈ\u0003\tဌ\u0002", new Object[]{"a", "b", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C45240c.f118157a, C66898do.f181871a, "e", "d", C66900dq.f181872a});
            case 3:
                return new C66764ae();
            case 4:
                return new C66763ad();
            case 5:
                return f181577i;
            case 6:
                C63010eb ebVar = f181578j;
                if (ebVar == null) {
                    synchronized (C66764ae.class) {
                        ebVar = f181578j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181577i);
                            f181578j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
