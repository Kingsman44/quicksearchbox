package com.google.android.apps.gsa.nga.engine.geniefm;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.geniefm.l */
/* compiled from: PG */
public final class C76106l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76106l f210996c;

    /* renamed from: e */
    private static volatile C63010eb f210997e;

    /* renamed from: a */
    public String f210998a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f210999b;

    /* renamed from: d */
    private int f211000d;

    static {
        C76106l lVar = new C76106l();
        f210996c = lVar;
        C62942bv.registerDefaultInstance(C76106l.class, lVar);
    }

    private C76106l() {
        emptyProtobufList();
        this.f210999b = emptyProtobufList();
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
                return newMessageInfo(f210996c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0004\u001b", new Object[]{"d", "a", "b", C76110p.class});
            case 3:
                return new C76106l();
            case 4:
                return new C76105k();
            case 5:
                return f210996c;
            case 6:
                C63010eb ebVar = f210997e;
                if (ebVar == null) {
                    synchronized (C76106l.class) {
                        ebVar = f210997e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f210996c);
                            f210997e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
