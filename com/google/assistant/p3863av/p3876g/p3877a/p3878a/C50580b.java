package com.google.assistant.p3863av.p3876g.p3877a.p3878a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.g.a.a.b */
/* compiled from: PG */
public final class C50580b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50580b f131622c;

    /* renamed from: d */
    private static volatile C63010eb f131623d;

    /* renamed from: a */
    public String f131624a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f131625b = BuildConfig.FLAVOR;

    static {
        C50580b bVar = new C50580b();
        f131622c = bVar;
        C62942bv.registerDefaultInstance(C50580b.class, bVar);
    }

    private C50580b() {
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
                return newMessageInfo(f131622c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C50580b();
            case 4:
                return new C50579a();
            case 5:
                return f131622c;
            case 6:
                C63010eb ebVar = f131623d;
                if (ebVar == null) {
                    synchronized (C50580b.class) {
                        ebVar = f131623d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131622c);
                            f131623d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
