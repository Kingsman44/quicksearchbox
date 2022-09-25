package com.google.android.libraries.search.p3055n;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67091ks;

/* renamed from: com.google.android.libraries.search.n.ah */
/* compiled from: PG */
public final class C39258ah extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C39258ah f103403i;

    /* renamed from: j */
    public static final C62940bt f103404j;

    /* renamed from: k */
    private static volatile C63010eb f103405k;

    /* renamed from: a */
    public int f103406a;

    /* renamed from: b */
    public int f103407b;

    /* renamed from: c */
    public float f103408c;

    /* renamed from: d */
    public C67091ks f103409d;

    /* renamed from: e */
    public String f103410e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f103411f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public float f103412g;

    /* renamed from: h */
    public float f103413h;

    static {
        C39258ah ahVar = new C39258ah();
        f103403i = ahVar;
        C62942bv.registerDefaultInstance(C39258ah.class, ahVar);
        f103404j = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, ahVar, ahVar, (C62958ce) null, 455186943, C63066gd.MESSAGE, C39258ah.class);
    }

    private C39258ah() {
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
                return newMessageInfo(f103403i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"a", "b", C39257ag.f103402a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C39258ah();
            case 4:
                return new C39256af();
            case 5:
                return f103403i;
            case 6:
                C63010eb ebVar = f103405k;
                if (ebVar == null) {
                    synchronized (C39258ah.class) {
                        ebVar = f103405k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103403i);
                            f103405k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
