package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ar */
/* compiled from: PG */
public final class C7530ar extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C7530ar f26069f;

    /* renamed from: i */
    private static volatile C63010eb f26070i;

    /* renamed from: a */
    public C62971cq f26071a = emptyProtobufList();

    /* renamed from: b */
    public String f26072b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C8178yk f26073c;

    /* renamed from: d */
    public C8178yk f26074d;

    /* renamed from: e */
    public C8178yk f26075e;

    /* renamed from: g */
    private int f26076g;

    /* renamed from: h */
    private byte f26077h = 2;

    static {
        C7530ar arVar = new C7530ar();
        f26069f = arVar;
        C62942bv.registerDefaultInstance(C7530ar.class, arVar);
    }

    private C7530ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26077h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26077h = b;
                return null;
            case 2:
                return newMessageInfo(f26069f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0004\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{C30325g.f82003a, "a", C7529aq.class, "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C7530ar();
            case 4:
                return new C7527ao();
            case 5:
                return f26069f;
            case 6:
                C63010eb ebVar = f26070i;
                if (ebVar == null) {
                    synchronized (C7530ar.class) {
                        ebVar = f26070i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26069f);
                            f26070i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
