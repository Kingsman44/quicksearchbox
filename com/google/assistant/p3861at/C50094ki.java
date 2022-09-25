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

/* renamed from: com.google.assistant.at.ki */
/* compiled from: PG */
public final class C50094ki extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C50094ki f130230i;

    /* renamed from: j */
    private static volatile C63010eb f130231j;

    /* renamed from: a */
    public int f130232a;

    /* renamed from: b */
    public String f130233b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130234c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130235d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130236e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C50106ku f130237f;

    /* renamed from: g */
    public C50102kq f130238g;

    /* renamed from: h */
    public boolean f130239h;

    static {
        C50094ki kiVar = new C50094ki();
        f130230i = kiVar;
        C62942bv.registerDefaultInstance(C50094ki.class, kiVar);
    }

    private C50094ki() {
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
                return newMessageInfo(f130230i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\bဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C50094ki();
            case 4:
                return new C50093kh();
            case 5:
                return f130230i;
            case 6:
                C63010eb ebVar = f130231j;
                if (ebVar == null) {
                    synchronized (C50094ki.class) {
                        ebVar = f130231j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130230i);
                            f130231j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
