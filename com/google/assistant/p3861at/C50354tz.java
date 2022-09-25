package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.tz */
/* compiled from: PG */
public final class C50354tz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50354tz f131051c;

    /* renamed from: e */
    private static volatile C63010eb f131052e;

    /* renamed from: a */
    public String f131053a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f131054b = emptyProtobufList();

    /* renamed from: d */
    private int f131055d;

    static {
        C50354tz tzVar = new C50354tz();
        f131051c = tzVar;
        C62942bv.registerDefaultInstance(C50354tz.class, tzVar);
    }

    private C50354tz() {
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
                return newMessageInfo(f131051c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C50353ty.class});
            case 3:
                return new C50354tz();
            case 4:
                return new C50351tw();
            case 5:
                return f131051c;
            case 6:
                C63010eb ebVar = f131052e;
                if (ebVar == null) {
                    synchronized (C50354tz.class) {
                        ebVar = f131052e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131051c);
                            f131052e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
