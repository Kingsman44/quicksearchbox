package com.google.p4242bp.p4267h;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.s */
/* compiled from: PG */
public final class C56412s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56412s f150442c;

    /* renamed from: f */
    private static volatile C63010eb f150443f;

    /* renamed from: a */
    public String f150444a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f150445b = emptyProtobufList();

    /* renamed from: d */
    private int f150446d;

    /* renamed from: e */
    private byte f150447e = 2;

    static {
        C56412s sVar = new C56412s();
        f150442c = sVar;
        C62942bv.registerDefaultInstance(C56412s.class, sVar);
    }

    private C56412s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150447e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150447e = b;
                return null;
            case 2:
                return newMessageInfo(f150442c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"d", "a", "b", C56411r.class});
            case 3:
                return new C56412s();
            case 4:
                return new C56409p();
            case 5:
                return f150442c;
            case 6:
                C63010eb ebVar = f150443f;
                if (ebVar == null) {
                    synchronized (C56412s.class) {
                        ebVar = f150443f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150442c);
                            f150443f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
