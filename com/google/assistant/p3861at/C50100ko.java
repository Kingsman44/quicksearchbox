package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ko */
/* compiled from: PG */
public final class C50100ko extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50100ko f130247c;

    /* renamed from: e */
    private static volatile C63010eb f130248e;

    /* renamed from: a */
    public String f130249a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f130250b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private int f130251d;

    static {
        C50100ko koVar = new C50100ko();
        f130247c = koVar;
        C62942bv.registerDefaultInstance(C50100ko.class, koVar);
    }

    private C50100ko() {
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
                return newMessageInfo(f130247c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            case 3:
                return new C50100ko();
            case 4:
                return new C50099kn();
            case 5:
                return f130247c;
            case 6:
                C63010eb ebVar = f130248e;
                if (ebVar == null) {
                    synchronized (C50100ko.class) {
                        ebVar = f130248e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130247c);
                            f130248e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
