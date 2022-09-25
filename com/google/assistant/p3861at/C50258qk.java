package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qk */
/* compiled from: PG */
public final class C50258qk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50258qk f130692c;

    /* renamed from: e */
    private static volatile C63010eb f130693e;

    /* renamed from: a */
    public String f130694a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C50275ra f130695b;

    /* renamed from: d */
    private int f130696d;

    static {
        C50258qk qkVar = new C50258qk();
        f130692c = qkVar;
        C62942bv.registerDefaultInstance(C50258qk.class, qkVar);
    }

    private C50258qk() {
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
                return newMessageInfo(f130692c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C50258qk();
            case 4:
                return new C50257qj();
            case 5:
                return f130692c;
            case 6:
                C63010eb ebVar = f130693e;
                if (ebVar == null) {
                    synchronized (C50258qk.class) {
                        ebVar = f130693e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130692c);
                            f130693e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
