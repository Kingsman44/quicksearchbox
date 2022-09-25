package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.cz */
/* compiled from: PG */
public final class C49895cz extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C49895cz f129691h;

    /* renamed from: i */
    private static volatile C63010eb f129692i;

    /* renamed from: a */
    public int f129693a;

    /* renamed from: b */
    public boolean f129694b;

    /* renamed from: c */
    public boolean f129695c;

    /* renamed from: d */
    public boolean f129696d;

    /* renamed from: e */
    public boolean f129697e;

    /* renamed from: f */
    public boolean f129698f;

    /* renamed from: g */
    public boolean f129699g;

    static {
        C49895cz czVar = new C49895cz();
        f129691h = czVar;
        C62942bv.registerDefaultInstance(C49895cz.class, czVar);
    }

    private C49895cz() {
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
                return newMessageInfo(f129691h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C49895cz();
            case 4:
                return new C49894cy();
            case 5:
                return f129691h;
            case 6:
                C63010eb ebVar = f129692i;
                if (ebVar == null) {
                    synchronized (C49895cz.class) {
                        ebVar = f129692i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129691h);
                            f129692i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
