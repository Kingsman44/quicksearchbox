package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.gk */
/* compiled from: PG */
public final class C51985gk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51985gk f136415c;

    /* renamed from: f */
    private static volatile C63010eb f136416f;

    /* renamed from: a */
    public String f136417a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f136418b;

    /* renamed from: d */
    private int f136419d;

    /* renamed from: e */
    private byte f136420e = 2;

    static {
        C51985gk gkVar = new C51985gk();
        f136415c = gkVar;
        C62942bv.registerDefaultInstance(C51985gk.class, gkVar);
    }

    private C51985gk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136420e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136420e = b;
                return null;
            case 2:
                return newMessageInfo(f136415c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51985gk();
            case 4:
                return new C51984gj();
            case 5:
                return f136415c;
            case 6:
                C63010eb ebVar = f136416f;
                if (ebVar == null) {
                    synchronized (C51985gk.class) {
                        ebVar = f136416f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136415c);
                            f136416f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
