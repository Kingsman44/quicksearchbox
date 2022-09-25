package p5285d.p5290b.p5291a.p5292a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.m */
/* compiled from: PG */
public final class C68200m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C68200m f184542g;

    /* renamed from: i */
    private static volatile C63010eb f184543i;

    /* renamed from: a */
    public int f184544a = 0;

    /* renamed from: b */
    public Object f184545b;

    /* renamed from: c */
    public C68195h f184546c;

    /* renamed from: d */
    public C68139ab f184547d;

    /* renamed from: e */
    public C68158au f184548e;

    /* renamed from: f */
    public C68189by f184549f;

    /* renamed from: h */
    private C62995dn f184550h = C62995dn.f170057a;

    static {
        C68200m mVar = new C68200m();
        f184542g = mVar;
        C62942bv.registerDefaultInstance(C68200m.class, mVar);
    }

    private C68200m() {
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
                return newMessageInfo(f184542g, "\u0000\b\u0001\u0000\u0002\u000b\b\u0001\u0000\u0000\u0002\t\u00032\u0005\t\u0006Ȼ\u0000\u0007<\u0000\b\t\t\t\u000b<\u0000", new Object[]{"b", "a", "d", C19618h.f54585a, C68197j.f184536a, C45240c.f118157a, C68174bj.class, "e", C10662f.f35572a, C68199l.class});
            case 3:
                return new C68200m();
            case 4:
                return new C68196i();
            case 5:
                return f184542g;
            case 6:
                C63010eb ebVar = f184543i;
                if (ebVar == null) {
                    synchronized (C68200m.class) {
                        ebVar = f184543i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184542g);
                            f184543i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
