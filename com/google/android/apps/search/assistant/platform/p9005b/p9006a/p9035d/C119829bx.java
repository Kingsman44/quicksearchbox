package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bx */
/* compiled from: PG */
public final class C119829bx extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C62962ci f333756c = new C119825bt();

    /* renamed from: f */
    public static final C119829bx f333757f;

    /* renamed from: h */
    private static volatile C63010eb f333758h;

    /* renamed from: a */
    public int f333759a;

    /* renamed from: b */
    public C62961ch f333760b = emptyIntList();

    /* renamed from: d */
    public boolean f333761d;

    /* renamed from: e */
    public boolean f333762e;

    /* renamed from: g */
    private byte f333763g = 2;

    static {
        C119829bx bxVar = new C119829bx();
        f333757f = bxVar;
        C62942bv.registerDefaultInstance(C119829bx.class, bxVar);
    }

    private C119829bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333763g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333763g = b;
                return null;
            case 2:
                return newMessageInfo(f333757f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C119828bw.m198730b(), "d", "e"});
            case 3:
                return new C119829bx();
            case 4:
                return new C119826bu();
            case 5:
                return f333757f;
            case 6:
                C63010eb ebVar = f333758h;
                if (ebVar == null) {
                    synchronized (C119829bx.class) {
                        ebVar = f333758h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333757f);
                            f333758h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
