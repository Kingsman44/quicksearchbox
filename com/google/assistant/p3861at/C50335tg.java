package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.tg */
/* compiled from: PG */
public final class C50335tg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50335tg f131004c;

    /* renamed from: d */
    private static volatile C63010eb f131005d;

    /* renamed from: a */
    public C62971cq f131006a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f131007b = emptyProtobufList();

    static {
        C50335tg tgVar = new C50335tg();
        f131004c = tgVar;
        C62942bv.registerDefaultInstance(C50335tg.class, tgVar);
    }

    private C50335tg() {
    }

    /* renamed from: a */
    public final void mo53397a() {
        C62971cq cqVar = this.f131006a;
        if (!cqVar.mo58948c()) {
            this.f131006a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo53398b() {
        C62971cq cqVar = this.f131007b;
        if (!cqVar.mo58948c()) {
            this.f131007b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f131004c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C50334tf.class, "b", C50334tf.class});
            case 3:
                return new C50335tg();
            case 4:
                return new C50332td();
            case 5:
                return f131004c;
            case 6:
                C63010eb ebVar = f131005d;
                if (ebVar == null) {
                    synchronized (C50335tg.class) {
                        ebVar = f131005d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131004c);
                            f131005d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
