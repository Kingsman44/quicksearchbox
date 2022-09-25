package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.hd */
/* compiled from: PG */
public final class C50008hd extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50008hd f129999h;

    /* renamed from: j */
    private static volatile C63010eb f130000j;

    /* renamed from: a */
    public String f130001a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130002b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f130003c;

    /* renamed from: d */
    public String f130004d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130005e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f130006f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f130007g;

    /* renamed from: i */
    private int f130008i;

    static {
        C50008hd hdVar = new C50008hd();
        f129999h = hdVar;
        C62942bv.registerDefaultInstance(C50008hd.class, hdVar);
    }

    private C50008hd() {
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
                return newMessageInfo(f129999h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006", new Object[]{"i", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C49875cf.m85756b()});
            case 3:
                return new C50008hd();
            case 4:
                return new C50007hc();
            case 5:
                return f129999h;
            case 6:
                C63010eb ebVar = f130000j;
                if (ebVar == null) {
                    synchronized (C50008hd.class) {
                        ebVar = f130000j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129999h);
                            f130000j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
