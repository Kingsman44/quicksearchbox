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

/* renamed from: com.google.assistant.at.ud */
/* compiled from: PG */
public final class C50359ud extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50359ud f131080h;

    /* renamed from: i */
    private static volatile C63010eb f131081i;

    /* renamed from: a */
    public int f131082a;

    /* renamed from: b */
    public C50358uc f131083b;

    /* renamed from: c */
    public C50347ts f131084c;

    /* renamed from: d */
    public C50345tq f131085d;

    /* renamed from: e */
    public String f131086e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f131087f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f131088g = BuildConfig.FLAVOR;

    static {
        C50359ud udVar = new C50359ud();
        f131080h = udVar;
        C62942bv.registerDefaultInstance(C50359ud.class, udVar);
    }

    private C50359ud() {
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
                return newMessageInfo(f131080h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0007ဉ\u0001\tဈ\u0003", new Object[]{"a", "b", "d", C10662f.f35572a, C30325g.f82003a, C45240c.f118157a, "e"});
            case 3:
                return new C50359ud();
            case 4:
                return new C50343to();
            case 5:
                return f131080h;
            case 6:
                C63010eb ebVar = f131081i;
                if (ebVar == null) {
                    synchronized (C50359ud.class) {
                        ebVar = f131081i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131080h);
                            f131081i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
