package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.evernote.android.state.BuildConfig;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57599bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.v */
/* compiled from: PG */
public final class C54485v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54485v f143052c;

    /* renamed from: e */
    private static volatile C63010eb f143053e;

    /* renamed from: a */
    public C57599bp f143054a;

    /* renamed from: b */
    public String f143055b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f143056d = 2;

    static {
        C54485v vVar = new C54485v();
        f143052c = vVar;
        C62942bv.registerDefaultInstance(C54485v.class, vVar);
    }

    private C54485v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143056d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143056d = b;
                return null;
            case 2:
                return newMessageInfo(f143052c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54485v();
            case 4:
                return new C54484u();
            case 5:
                return f143052c;
            case 6:
                C63010eb ebVar = f143053e;
                if (ebVar == null) {
                    synchronized (C54485v.class) {
                        ebVar = f143053e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143052c);
                            f143053e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
