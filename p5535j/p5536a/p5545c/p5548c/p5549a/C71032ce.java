package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127929h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.ce */
/* compiled from: PG */
public final class C71032ce extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f189441d = new C71030cc();

    /* renamed from: e */
    public static final C71032ce f189442e;

    /* renamed from: f */
    private static volatile C63010eb f189443f;

    /* renamed from: a */
    public int f189444a = 0;

    /* renamed from: b */
    public Object f189445b;

    /* renamed from: c */
    public C62961ch f189446c = emptyIntList();

    static {
        C71032ce ceVar = new C71032ce();
        f189442e = ceVar;
        C62942bv.registerDefaultInstance(C71032ce.class, ceVar);
    }

    private C71032ce() {
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
                return newMessageInfo(f189442e, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001်\u0000\u0002ဿ\u0000\u0003\u001e", new Object[]{"b", "a", C127923b.m209046b(), C45240c.f118157a, C127929h.m209049b()});
            case 3:
                return new C71032ce();
            case 4:
                return new C71031cd();
            case 5:
                return f189442e;
            case 6:
                C63010eb ebVar = f189443f;
                if (ebVar == null) {
                    synchronized (C71032ce.class) {
                        ebVar = f189443f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189442e);
                            f189443f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
