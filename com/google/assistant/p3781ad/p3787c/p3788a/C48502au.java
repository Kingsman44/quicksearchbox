package com.google.assistant.p3781ad.p3787c.p3788a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.au */
/* compiled from: PG */
public final class C48502au extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C48502au f125291k;

    /* renamed from: l */
    private static volatile C63010eb f125292l;

    /* renamed from: a */
    public int f125293a;

    /* renamed from: b */
    public String f125294b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f125295c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f125296d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f125297e;

    /* renamed from: f */
    public C48532l f125298f;

    /* renamed from: g */
    public C48528h f125299g;

    /* renamed from: h */
    public C48524d f125300h;

    /* renamed from: i */
    public int f125301i;

    /* renamed from: j */
    public C48522bn f125302j;

    static {
        C48502au auVar = new C48502au();
        f125291k = auVar;
        C62942bv.registerDefaultInstance(C48502au.class, auVar);
    }

    private C48502au() {
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
                return newMessageInfo(f125291k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဌ\u0007\bဉ\b\tဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C48672ag.m85260c(), C10662f.f35572a, C30325g.f82003a, "i", C48580an.m85242c(), "j", C19618h.f54585a});
            case 3:
                return new C48502au();
            case 4:
                return new C48501at();
            case 5:
                return f125291k;
            case 6:
                C63010eb ebVar = f125292l;
                if (ebVar == null) {
                    synchronized (C48502au.class) {
                        ebVar = f125292l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125291k);
                            f125292l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
