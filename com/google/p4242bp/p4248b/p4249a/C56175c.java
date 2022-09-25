package com.google.p4242bp.p4248b.p4249a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.b.a.c */
/* compiled from: PG */
public final class C56175c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56175c f149669c;

    /* renamed from: e */
    private static volatile C63010eb f149670e;

    /* renamed from: a */
    public String f149671a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f149672b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private int f149673d;

    static {
        C56175c cVar = new C56175c();
        f149669c = cVar;
        C62942bv.registerDefaultInstance(C56175c.class, cVar);
    }

    private C56175c() {
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
                return newMessageInfo(f149669c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
            case 3:
                return new C56175c();
            case 4:
                return new C56174b();
            case 5:
                return f149669c;
            case 6:
                C63010eb ebVar = f149670e;
                if (ebVar == null) {
                    synchronized (C56175c.class) {
                        ebVar = f149670e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149669c);
                            f149670e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
