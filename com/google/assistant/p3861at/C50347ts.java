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

/* renamed from: com.google.assistant.at.ts */
/* compiled from: PG */
public final class C50347ts extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C50347ts f131027k;

    /* renamed from: l */
    private static volatile C63010eb f131028l;

    /* renamed from: a */
    public int f131029a;

    /* renamed from: b */
    public String f131030b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131031c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f131032d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f131033e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f131034f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f131035g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f131036h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f131037i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f131038j = BuildConfig.FLAVOR;

    static {
        C50347ts tsVar = new C50347ts();
        f131027k = tsVar;
        C62942bv.registerDefaultInstance(C50347ts.class, tsVar);
    }

    private C50347ts() {
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
                return newMessageInfo(f131027k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C50347ts();
            case 4:
                return new C50346tr();
            case 5:
                return f131027k;
            case 6:
                C63010eb ebVar = f131028l;
                if (ebVar == null) {
                    synchronized (C50347ts.class) {
                        ebVar = f131028l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131027k);
                            f131028l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
