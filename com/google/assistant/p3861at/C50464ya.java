package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ya */
/* compiled from: PG */
public final class C50464ya extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50464ya f131332f;

    /* renamed from: g */
    private static volatile C63010eb f131333g;

    /* renamed from: a */
    public int f131334a;

    /* renamed from: b */
    public C62971cq f131335b = emptyProtobufList();

    /* renamed from: c */
    public String f131336c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C50058j f131337d;

    /* renamed from: e */
    public String f131338e = BuildConfig.FLAVOR;

    static {
        C50464ya yaVar = new C50464ya();
        f131332f = yaVar;
        C62942bv.registerDefaultInstance(C50464ya.class, yaVar);
    }

    private C50464ya() {
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
                return newMessageInfo(f131332f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဉ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C50461xy.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C50464ya();
            case 4:
                return new C50462xz();
            case 5:
                return f131332f;
            case 6:
                C63010eb ebVar = f131333g;
                if (ebVar == null) {
                    synchronized (C50464ya.class) {
                        ebVar = f131333g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131332f);
                            f131333g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
