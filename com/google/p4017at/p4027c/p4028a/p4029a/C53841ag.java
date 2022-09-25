package com.google.p4017at.p4027c.p4028a.p4029a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.ag */
/* compiled from: PG */
public final class C53841ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53841ag f141309c;

    /* renamed from: d */
    private static volatile C63010eb f141310d;

    /* renamed from: a */
    public String f141311a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f141312b = BuildConfig.FLAVOR;

    static {
        C53841ag agVar = new C53841ag();
        f141309c = agVar;
        C62942bv.registerDefaultInstance(C53841ag.class, agVar);
    }

    private C53841ag() {
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
                return newMessageInfo(f141309c, "\u0000\u0002\u0000\u0000\u0003\b\u0002\u0000\u0000\u0000\u0003Ȉ\bȈ", new Object[]{"a", "b"});
            case 3:
                return new C53841ag();
            case 4:
                return new C53840af();
            case 5:
                return f141309c;
            case 6:
                C63010eb ebVar = f141310d;
                if (ebVar == null) {
                    synchronized (C53841ag.class) {
                        ebVar = f141310d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141309c);
                            f141310d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
