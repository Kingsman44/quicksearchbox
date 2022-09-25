package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128189u;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.cj */
/* compiled from: PG */
public final class C71037cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71037cj f189453c;

    /* renamed from: d */
    private static volatile C63010eb f189454d;

    /* renamed from: a */
    public int f189455a;

    /* renamed from: b */
    public int f189456b;

    static {
        C71037cj cjVar = new C71037cj();
        f189453c = cjVar;
        C62942bv.registerDefaultInstance(C71037cj.class, cjVar);
    }

    private C71037cj() {
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
                return newMessageInfo(f189453c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C128189u.m209276b()});
            case 3:
                return new C71037cj();
            case 4:
                return new C71036ci();
            case 5:
                return f189453c;
            case 6:
                C63010eb ebVar = f189454d;
                if (ebVar == null) {
                    synchronized (C71037cj.class) {
                        ebVar = f189454d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189453c);
                            f189454d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
