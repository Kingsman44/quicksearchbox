package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agi */
/* compiled from: PG */
public final class agi extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final agi f129212e;

    /* renamed from: f */
    private static volatile C63010eb f129213f;

    /* renamed from: a */
    public int f129214a;

    /* renamed from: b */
    public String f129215b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129216c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f129217d = BuildConfig.FLAVOR;

    static {
        agi agi = new agi();
        f129212e = agi;
        C62942bv.registerDefaultInstance(agi.class, agi);
    }

    private agi() {
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
                return newMessageInfo(f129212e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new agi();
            case 4:
                return new agh();
            case 5:
                return f129212e;
            case 6:
                C63010eb ebVar = f129213f;
                if (ebVar == null) {
                    synchronized (agi.class) {
                        ebVar = f129213f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129212e);
                            f129213f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
