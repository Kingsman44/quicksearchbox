package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.pz */
/* compiled from: PG */
public final class C52390pz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52390pz f137470c;

    /* renamed from: e */
    private static volatile C63010eb f137471e;

    /* renamed from: a */
    public String f137472a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f137473b = emptyProtobufList();

    /* renamed from: d */
    private int f137474d;

    static {
        C52390pz pzVar = new C52390pz();
        f137470c = pzVar;
        C62942bv.registerDefaultInstance(C52390pz.class, pzVar);
    }

    private C52390pz() {
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
                return newMessageInfo(f137470c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C52389py.class});
            case 3:
                return new C52390pz();
            case 4:
                return new C52387pw();
            case 5:
                return f137470c;
            case 6:
                C63010eb ebVar = f137471e;
                if (ebVar == null) {
                    synchronized (C52390pz.class) {
                        ebVar = f137471e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137470c);
                            f137471e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
