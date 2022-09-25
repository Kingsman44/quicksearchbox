package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahl */
/* compiled from: PG */
public final class ahl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ahl f129316d;

    /* renamed from: e */
    private static volatile C63010eb f129317e;

    /* renamed from: a */
    public int f129318a;

    /* renamed from: b */
    public String f129319b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f129320c = C62942bv.emptyProtobufList();

    static {
        ahl ahl = new ahl();
        f129316d = ahl;
        C62942bv.registerDefaultInstance(ahl.class, ahl);
    }

    private ahl() {
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
                return newMessageInfo(f129316d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0001\u0000\u0002\u001a\u0004ဈ\u0000", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new ahl();
            case 4:
                return new ahk();
            case 5:
                return f129316d;
            case 6:
                C63010eb ebVar = f129317e;
                if (ebVar == null) {
                    synchronized (ahl.class) {
                        ebVar = f129317e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129316d);
                            f129317e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
