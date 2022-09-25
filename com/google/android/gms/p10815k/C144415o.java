package com.google.android.gms.p10815k;

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

/* renamed from: com.google.android.gms.k.o */
/* compiled from: PG */
public final class C144415o extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C144415o f391004i;

    /* renamed from: k */
    private static volatile C63010eb f391005k;

    /* renamed from: a */
    public String f391006a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f391007b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f391008c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f391009d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f391010e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f391011f;

    /* renamed from: g */
    public boolean f391012g;

    /* renamed from: h */
    public C144413m f391013h;

    /* renamed from: j */
    private int f391014j;

    static {
        C144415o oVar = new C144415o();
        f391004i = oVar;
        C62942bv.registerDefaultInstance(C144415o.class, oVar);
    }

    private C144415o() {
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
                return newMessageInfo(f391004i, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006\u0007\u0007\u0007\b\t", new Object[]{"j", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C144415o();
            case 4:
                return new C144414n();
            case 5:
                return f391004i;
            case 6:
                C63010eb ebVar = f391005k;
                if (ebVar == null) {
                    synchronized (C144415o.class) {
                        ebVar = f391005k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f391004i);
                            f391005k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
