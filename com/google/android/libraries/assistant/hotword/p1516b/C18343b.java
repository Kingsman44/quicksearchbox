package com.google.android.libraries.assistant.hotword.p1516b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67050je;

/* renamed from: com.google.android.libraries.assistant.hotword.b.b */
/* compiled from: PG */
public final class C18343b extends C62942bv implements C18345d {

    /* renamed from: d */
    public static final C18343b f52029d;

    /* renamed from: e */
    private static volatile C63010eb f52030e;

    /* renamed from: a */
    public int f52031a;

    /* renamed from: b */
    public C18350i f52032b;

    /* renamed from: c */
    public C67050je f52033c;

    static {
        C18343b bVar = new C18343b();
        f52029d = bVar;
        C62942bv.registerDefaultInstance(C18343b.class, bVar);
    }

    private C18343b() {
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
                return newMessageInfo(f52029d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C18343b();
            case 4:
                return new C18342a();
            case 5:
                return f52029d;
            case 6:
                C63010eb ebVar = f52030e;
                if (ebVar == null) {
                    synchronized (C18343b.class) {
                        ebVar = f52030e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52029d);
                            f52030e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
