package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.yu */
/* compiled from: PG */
public final class C8188yu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8188yu f28765c;

    /* renamed from: e */
    private static volatile C63010eb f28766e;

    /* renamed from: a */
    public int f28767a;

    /* renamed from: b */
    public C62971cq f28768b = emptyProtobufList();

    /* renamed from: d */
    private String f28769d = BuildConfig.FLAVOR;

    static {
        C8188yu yuVar = new C8188yu();
        f28765c = yuVar;
        C62942bv.registerDefaultInstance(C8188yu.class, yuVar);
    }

    private C8188yu() {
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
                return newMessageInfo(f28765c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "d", "b", C8195za.class});
            case 3:
                return new C8188yu();
            case 4:
                return new C8187yt();
            case 5:
                return f28765c;
            case 6:
                C63010eb ebVar = f28766e;
                if (ebVar == null) {
                    synchronized (C8188yu.class) {
                        ebVar = f28766e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28765c);
                            f28766e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
