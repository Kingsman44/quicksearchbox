package com.google.assistant.p3890d.p3893b.p3894a.p3895a.p3896a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.d.b.a.a.a.b */
/* compiled from: PG */
public final class C50862b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50862b f132433c;

    /* renamed from: d */
    private static volatile C63010eb f132434d;

    /* renamed from: a */
    public String f132435a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f132436b = C62942bv.emptyProtobufList();

    static {
        C50862b bVar = new C50862b();
        f132433c = bVar;
        C62942bv.registerDefaultInstance(C50862b.class, bVar);
    }

    private C50862b() {
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
                return newMessageInfo(f132433c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C50862b();
            case 4:
                return new C50861a();
            case 5:
                return f132433c;
            case 6:
                C63010eb ebVar = f132434d;
                if (ebVar == null) {
                    synchronized (C50862b.class) {
                        ebVar = f132434d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132433c);
                            f132434d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
