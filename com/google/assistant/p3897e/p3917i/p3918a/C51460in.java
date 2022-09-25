package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.in */
/* compiled from: PG */
public final class C51460in extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51460in f134052e;

    /* renamed from: g */
    private static volatile C63010eb f134053g;

    /* renamed from: a */
    public int f134054a;

    /* renamed from: b */
    public C51406gn f134055b;

    /* renamed from: c */
    public String f134056c;

    /* renamed from: d */
    public String f134057d;

    /* renamed from: f */
    private byte f134058f = 2;

    static {
        C51460in inVar = new C51460in();
        f134052e = inVar;
        C62942bv.registerDefaultInstance(C51460in.class, inVar);
    }

    private C51460in() {
        emptyProtobufList();
        this.f134056c = BuildConfig.FLAVOR;
        this.f134057d = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134058f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134058f = b;
                return null;
            case 2:
                return newMessageInfo(f134052e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0005ဈ\u0002\u0007ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51460in();
            case 4:
                return new C51459im();
            case 5:
                return f134052e;
            case 6:
                C63010eb ebVar = f134053g;
                if (ebVar == null) {
                    synchronized (C51460in.class) {
                        ebVar = f134053g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134052e);
                            f134053g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
