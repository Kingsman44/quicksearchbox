package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.oi */
/* compiled from: PG */
public final class C50202oi extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50202oi f130501h;

    /* renamed from: i */
    private static volatile C63010eb f130502i;

    /* renamed from: a */
    public int f130503a;

    /* renamed from: b */
    public String f130504b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f130505c;

    /* renamed from: d */
    public int f130506d;

    /* renamed from: e */
    public int f130507e;

    /* renamed from: f */
    public C62971cq f130508f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public boolean f130509g;

    static {
        C50202oi oiVar = new C50202oi();
        f130501h = oiVar;
        C62942bv.registerDefaultInstance(C50202oi.class, oiVar);
    }

    private C50202oi() {
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
                return newMessageInfo(f130501h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001a\u0006ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C50202oi();
            case 4:
                return new C50201oh();
            case 5:
                return f130501h;
            case 6:
                C63010eb ebVar = f130502i;
                if (ebVar == null) {
                    synchronized (C50202oi.class) {
                        ebVar = f130502i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130501h);
                            f130502i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
