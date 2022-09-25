package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.hb */
/* compiled from: PG */
public final class C52150hb extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C52150hb f136843e;

    /* renamed from: g */
    private static volatile C63010eb f136844g;

    /* renamed from: a */
    public int f136845a;

    /* renamed from: b */
    public String f136846b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f136847c = emptyProtobufList();

    /* renamed from: d */
    public C52149ha f136848d;

    /* renamed from: f */
    private byte f136849f = 2;

    static {
        C52150hb hbVar = new C52150hb();
        f136843e = hbVar;
        C62942bv.registerDefaultInstance(C52150hb.class, hbVar);
    }

    private C52150hb() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136849f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136849f = b;
                return null;
            case 2:
                return newMessageInfo(f136843e, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0007\u001b\rဉ\t", new Object[]{"a", "b", C45240c.f118157a, C52144gw.class, "d"});
            case 3:
                return new C52150hb();
            case 4:
                return new C52142gu();
            case 5:
                return f136843e;
            case 6:
                C63010eb ebVar = f136844g;
                if (ebVar == null) {
                    synchronized (C52150hb.class) {
                        ebVar = f136844g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136843e);
                            f136844g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
