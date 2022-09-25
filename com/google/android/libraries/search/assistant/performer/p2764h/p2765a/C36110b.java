package com.google.android.libraries.search.assistant.performer.p2764h.p2765a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.performer.h.a.b */
/* compiled from: PG */
public final class C36110b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36110b f94442c;

    /* renamed from: d */
    private static volatile C63010eb f94443d;

    /* renamed from: a */
    public String f94444a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f94445b = emptyProtobufList();

    static {
        C36110b bVar = new C36110b();
        f94442c = bVar;
        C62942bv.registerDefaultInstance(C36110b.class, bVar);
    }

    private C36110b() {
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
                return newMessageInfo(f94442c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", C52081en.class});
            case 3:
                return new C36110b();
            case 4:
                return new C36109a();
            case 5:
                return f94442c;
            case 6:
                C63010eb ebVar = f94443d;
                if (ebVar == null) {
                    synchronized (C36110b.class) {
                        ebVar = f94443d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f94442c);
                            f94443d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
