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

/* renamed from: com.google.assistant.at.xg */
/* compiled from: PG */
public final class C50443xg extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C50443xg f131282k;

    /* renamed from: l */
    private static volatile C63010eb f131283l;

    /* renamed from: a */
    public int f131284a;

    /* renamed from: b */
    public long f131285b;

    /* renamed from: c */
    public C50400vr f131286c;

    /* renamed from: d */
    public C50453xq f131287d;

    /* renamed from: e */
    public C50423wn f131288e;

    /* renamed from: f */
    public String f131289f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f131290g;

    /* renamed from: h */
    public long f131291h;

    /* renamed from: i */
    public C50391vi f131292i;

    /* renamed from: j */
    public C50408vz f131293j;

    static {
        C50443xg xgVar = new C50443xg();
        f131282k = xgVar;
        C62942bv.registerDefaultInstance(C50443xg.class, xgVar);
    }

    private C50443xg() {
        emptyProtobufList();
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
                return newMessageInfo(f131282k, "\u0001\t\u0000\u0001\u0004\r\t\u0000\u0000\u0000\u0004ဂ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဈ\u0004\nဌ\u0005\u000bဂ\u0006\fဉ\u0007\rဉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C50446xj.f131298a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C50443xg();
            case 4:
                return new C50442xf();
            case 5:
                return f131282k;
            case 6:
                C63010eb ebVar = f131283l;
                if (ebVar == null) {
                    synchronized (C50443xg.class) {
                        ebVar = f131283l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131282k);
                            f131283l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
