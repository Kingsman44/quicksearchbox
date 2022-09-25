package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.e.c.c.cs */
/* compiled from: PG */
public final class C51001cs extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51001cs f132776f;

    /* renamed from: g */
    private static volatile C63010eb f132777g;

    /* renamed from: a */
    public int f132778a;

    /* renamed from: b */
    public String f132779b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132780c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f132781d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C63037fb f132782e;

    static {
        C51001cs csVar = new C51001cs();
        f132776f = csVar;
        C62942bv.registerDefaultInstance(C51001cs.class, csVar);
    }

    private C51001cs() {
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
                return newMessageInfo(f132776f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002Ȉ\u0003Ț\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C51001cs();
            case 4:
                return new C51000cr();
            case 5:
                return f132776f;
            case 6:
                C63010eb ebVar = f132777g;
                if (ebVar == null) {
                    synchronized (C51001cs.class) {
                        ebVar = f132777g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132776f);
                            f132777g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
