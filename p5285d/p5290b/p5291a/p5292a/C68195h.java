package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.h */
/* compiled from: PG */
public final class C68195h extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C68195h f184523l;

    /* renamed from: m */
    private static volatile C63010eb f184524m;

    /* renamed from: a */
    public boolean f184525a;

    /* renamed from: b */
    public C68164b f184526b;

    /* renamed from: c */
    public C62971cq f184527c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f184528d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C68202o f184529e;

    /* renamed from: f */
    public C68181bq f184530f;

    /* renamed from: g */
    public int f184531g;

    /* renamed from: h */
    public C68165ba f184532h;

    /* renamed from: i */
    public C68160aw f184533i;

    /* renamed from: j */
    public int f184534j;

    /* renamed from: k */
    public int f184535k;

    static {
        C68195h hVar = new C68195h();
        f184523l = hVar;
        C62942bv.registerDefaultInstance(C68195h.class, hVar);
    }

    private C68195h() {
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
                return newMessageInfo(f184523l, "\u0000\u000b\u0000\u0000\u0002\u000f\u000b\u0000\u0001\u0000\u0002\u0007\u0003\t\u0004Ț\u0005Ȉ\u0006\t\u0007\t\b\f\t\t\n\t\f\f\u000f\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C68195h();
            case 4:
                return new C68194g();
            case 5:
                return f184523l;
            case 6:
                C63010eb ebVar = f184524m;
                if (ebVar == null) {
                    synchronized (C68195h.class) {
                        ebVar = f184524m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184523l);
                            f184524m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
