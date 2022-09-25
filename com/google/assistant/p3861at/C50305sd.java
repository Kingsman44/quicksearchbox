package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sd */
/* compiled from: PG */
public final class C50305sd extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C50305sd f130918i;

    /* renamed from: k */
    private static volatile C63010eb f130919k;

    /* renamed from: a */
    public String f130920a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130921b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130922c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130923d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130924e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f130925f;

    /* renamed from: g */
    public C62971cq f130926g = emptyProtobufList();

    /* renamed from: h */
    public C50302sa f130927h;

    /* renamed from: j */
    private int f130928j;

    static {
        C50305sd sdVar = new C50305sd();
        f130918i = sdVar;
        C62942bv.registerDefaultInstance(C50305sd.class, sdVar);
    }

    private C50305sd() {
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
                return newMessageInfo(f130918i, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဌ\u0006\b\u001b\u000bဉ\b", new Object[]{"j", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C50297rw.f130892a, C30325g.f82003a, C50304sc.class, C19618h.f54585a});
            case 3:
                return new C50305sd();
            case 4:
                return new C50299ry();
            case 5:
                return f130918i;
            case 6:
                C63010eb ebVar = f130919k;
                if (ebVar == null) {
                    synchronized (C50305sd.class) {
                        ebVar = f130919k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130918i);
                            f130919k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
