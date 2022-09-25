package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64730i;

/* renamed from: j.a.c.c.a.bu */
/* compiled from: PG */
public final class C71021bu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71021bu f189399e;

    /* renamed from: f */
    private static volatile C63010eb f189400f;

    /* renamed from: a */
    public int f189401a;

    /* renamed from: b */
    public int f189402b;

    /* renamed from: c */
    public int f189403c;

    /* renamed from: d */
    public boolean f189404d;

    static {
        C71021bu buVar = new C71021bu();
        f189399e = buVar;
        C62942bv.registerDefaultInstance(C71021bu.class, buVar);
    }

    private C71021bu() {
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
                return newMessageInfo(f189399e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C119299u.m197996b(), C45240c.f118157a, C64730i.m96447b(), "d"});
            case 3:
                return new C71021bu();
            case 4:
                return new C71020bt();
            case 5:
                return f189399e;
            case 6:
                C63010eb ebVar = f189400f;
                if (ebVar == null) {
                    synchronized (C71021bu.class) {
                        ebVar = f189400f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189399e);
                            f189400f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
