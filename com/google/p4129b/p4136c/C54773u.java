package com.google.p4129b.p4136c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.u */
/* compiled from: PG */
public final class C54773u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54773u f143704c;

    /* renamed from: d */
    private static volatile C63010eb f143705d;

    /* renamed from: a */
    public String f143706a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f143707b = emptyProtobufList();

    static {
        C54773u uVar = new C54773u();
        f143704c = uVar;
        C62942bv.registerDefaultInstance(C54773u.class, uVar);
    }

    private C54773u() {
        emptyProtobufList();
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
                return newMessageInfo(f143704c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", C54772t.class});
            case 3:
                return new C54773u();
            case 4:
                return new C54770r();
            case 5:
                return f143704c;
            case 6:
                C63010eb ebVar = f143705d;
                if (ebVar == null) {
                    synchronized (C54773u.class) {
                        ebVar = f143705d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143704c);
                            f143705d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
