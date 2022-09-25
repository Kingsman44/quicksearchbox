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

/* renamed from: com.google.assistant.at.pv */
/* compiled from: PG */
public final class C50242pv extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C50242pv f130642j;

    /* renamed from: k */
    private static volatile C63010eb f130643k;

    /* renamed from: a */
    public int f130644a;

    /* renamed from: b */
    public String f130645b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130646c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130647d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130648e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f130649f;

    /* renamed from: g */
    public String f130650g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f130651h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f130652i = BuildConfig.FLAVOR;

    static {
        C50242pv pvVar = new C50242pv();
        f130642j = pvVar;
        C62942bv.registerDefaultInstance(C50242pv.class, pvVar);
    }

    private C50242pv() {
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
                return newMessageInfo(f130642j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဌ\u0004\u0004ဈ\u0005\u0005ဈ\u0001\u0006ဈ\u0006\bဈ\u0007\tဈ\u0000", new Object[]{"a", "d", "e", C10662f.f35572a, C49875cf.m85756b(), C30325g.f82003a, C45240c.f118157a, C19618h.f54585a, "i", "b"});
            case 3:
                return new C50242pv();
            case 4:
                return new C50241pu();
            case 5:
                return f130642j;
            case 6:
                C63010eb ebVar = f130643k;
                if (ebVar == null) {
                    synchronized (C50242pv.class) {
                        ebVar = f130643k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130642j);
                            f130643k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
