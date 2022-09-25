package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.rr */
/* compiled from: PG */
public final class C50292rr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f130875e = new C50287rm();

    /* renamed from: f */
    public static final C50292rr f130876f;

    /* renamed from: h */
    private static volatile C63010eb f130877h;

    /* renamed from: a */
    public int f130878a = 0;

    /* renamed from: b */
    public Object f130879b;

    /* renamed from: c */
    public String f130880c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62961ch f130881d = emptyIntList();

    /* renamed from: g */
    private int f130882g;

    static {
        C50292rr rrVar = new C50292rr();
        f130876f = rrVar;
        C62942bv.registerDefaultInstance(C50292rr.class, rrVar);
    }

    private C50292rr() {
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
                return newMessageInfo(f130876f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ဈ\u0002\u0004\u001e", new Object[]{"b", "a", C30325g.f82003a, C45240c.f118157a, "d", C50291rq.m85803b()});
            case 3:
                return new C50292rr();
            case 4:
                return new C50288rn();
            case 5:
                return f130876f;
            case 6:
                C63010eb ebVar = f130877h;
                if (ebVar == null) {
                    synchronized (C50292rr.class) {
                        ebVar = f130877h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130876f);
                            f130877h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
