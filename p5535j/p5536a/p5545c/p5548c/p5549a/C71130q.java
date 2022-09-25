package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.p3755g.C48339n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.q */
/* compiled from: PG */
public final class C71130q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71130q f189744d;

    /* renamed from: e */
    private static volatile C63010eb f189745e;

    /* renamed from: a */
    public int f189746a;

    /* renamed from: b */
    public String f189747b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C48339n f189748c;

    static {
        C71130q qVar = new C71130q();
        f189744d = qVar;
        C62942bv.registerDefaultInstance(C71130q.class, qVar);
    }

    private C71130q() {
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
                return newMessageInfo(f189744d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71130q();
            case 4:
                return new C71129p();
            case 5:
                return f189744d;
            case 6:
                C63010eb ebVar = f189745e;
                if (ebVar == null) {
                    synchronized (C71130q.class) {
                        ebVar = f189745e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189744d);
                            f189745e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
