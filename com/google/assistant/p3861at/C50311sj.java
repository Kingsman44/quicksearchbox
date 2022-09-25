package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sj */
/* compiled from: PG */
public final class C50311sj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50311sj f130940c;

    /* renamed from: e */
    private static volatile C63010eb f130941e;

    /* renamed from: a */
    public String f130942a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f130943b = emptyProtobufList();

    /* renamed from: d */
    private int f130944d;

    static {
        C50311sj sjVar = new C50311sj();
        f130940c = sjVar;
        C62942bv.registerDefaultInstance(C50311sj.class, sjVar);
    }

    private C50311sj() {
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
                return newMessageInfo(f130940c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C50316so.class});
            case 3:
                return new C50311sj();
            case 4:
                return new C50310si();
            case 5:
                return f130940c;
            case 6:
                C63010eb ebVar = f130941e;
                if (ebVar == null) {
                    synchronized (C50311sj.class) {
                        ebVar = f130941e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130940c);
                            f130941e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
