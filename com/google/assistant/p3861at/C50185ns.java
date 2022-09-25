package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.at.ns */
/* compiled from: PG */
public final class C50185ns extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50185ns f130461c;

    /* renamed from: e */
    private static volatile C63010eb f130462e;

    /* renamed from: a */
    public String f130463a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130464b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f130465d;

    static {
        C50185ns nsVar = new C50185ns();
        f130461c = nsVar;
        C62942bv.registerDefaultInstance(C50185ns.class, nsVar);
    }

    private C50185ns() {
        emptyProtobufList();
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
                return newMessageInfo(f130461c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C50185ns();
            case 4:
                return new C50184nr();
            case 5:
                return f130461c;
            case 6:
                C63010eb ebVar = f130462e;
                if (ebVar == null) {
                    synchronized (C50185ns.class) {
                        ebVar = f130462e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130461c);
                            f130462e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
