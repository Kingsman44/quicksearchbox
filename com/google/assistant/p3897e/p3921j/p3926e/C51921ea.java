package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ea */
/* compiled from: PG */
public final class C51921ea extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51921ea f136198d;

    /* renamed from: g */
    private static volatile C63010eb f136199g;

    /* renamed from: a */
    public String f136200a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C51098gh f136201b;

    /* renamed from: c */
    public C62971cq f136202c;

    /* renamed from: e */
    private int f136203e;

    /* renamed from: f */
    private byte f136204f = 2;

    static {
        C51921ea eaVar = new C51921ea();
        f136198d = eaVar;
        C62942bv.registerDefaultInstance(C51921ea.class, eaVar);
    }

    private C51921ea() {
        emptyProtobufList();
        emptyProtobufList();
        this.f136202c = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136204f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136204f = b;
                return null;
            case 2:
                return newMessageInfo(f136198d, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0007Л\rဉ\u0003", new Object[]{"e", "a", C45240c.f118157a, C52560wg.class, "b"});
            case 3:
                return new C51921ea();
            case 4:
                return new C51919dz();
            case 5:
                return f136198d;
            case 6:
                C63010eb ebVar = f136199g;
                if (ebVar == null) {
                    synchronized (C51921ea.class) {
                        ebVar = f136199g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136198d);
                            f136199g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
