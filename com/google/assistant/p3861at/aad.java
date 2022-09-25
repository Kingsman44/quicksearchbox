package com.google.assistant.p3861at;

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

/* renamed from: com.google.assistant.at.aad */
/* compiled from: PG */
public final class aad extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final aad f128684i;

    /* renamed from: j */
    private static volatile C63010eb f128685j;

    /* renamed from: a */
    public int f128686a;

    /* renamed from: b */
    public int f128687b;

    /* renamed from: c */
    public String f128688c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f128689d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f128690e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f128691f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f128692g;

    /* renamed from: h */
    public boolean f128693h;

    static {
        aad aad = new aad();
        f128684i = aad;
        C62942bv.registerDefaultInstance(aad.class, aad);
    }

    private aad() {
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
                return newMessageInfo(f128684i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", abr.m85722b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new aad();
            case 4:
                return new aac();
            case 5:
                return f128684i;
            case 6:
                C63010eb ebVar = f128685j;
                if (ebVar == null) {
                    synchronized (aad.class) {
                        ebVar = f128685j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128684i);
                            f128685j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
