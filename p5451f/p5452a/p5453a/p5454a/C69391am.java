package p5451f.p5452a.p5453a.p5454a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: f.a.a.a.am */
/* compiled from: PG */
public final class C69391am extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C62962ci f185638j = new C69460y();

    /* renamed from: r */
    public static final C69391am f185639r;

    /* renamed from: s */
    private static volatile C63010eb f185640s;

    /* renamed from: a */
    public int f185641a;

    /* renamed from: b */
    public int f185642b;

    /* renamed from: c */
    public int f185643c;

    /* renamed from: d */
    public int f185644d;

    /* renamed from: e */
    public String f185645e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f185646f;

    /* renamed from: g */
    public String f185647g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f185648h;

    /* renamed from: i */
    public C62961ch f185649i = emptyIntList();

    /* renamed from: k */
    public boolean f185650k;

    /* renamed from: l */
    public String f185651l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f185652m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public boolean f185653n;

    /* renamed from: o */
    public boolean f185654o;

    /* renamed from: p */
    public C69455t f185655p;

    /* renamed from: q */
    public C69455t f185656q;

    static {
        C69391am amVar = new C69391am();
        f185639r = amVar;
        C62942bv.registerDefaultInstance(C69391am.class, amVar);
    }

    private C69391am() {
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
                return newMessageInfo(f185639r, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0001\u0000\u0001ဌ\u0000\u0007ဌ\u0001\bဌ\u0002\tဈ\u0003\nဌ\u0004\u000bဈ\u0005\fဌ\u0006\r\u001e\u000eဇ\u0007\u000fဈ\b\u0010ဈ\t\u0011ဇ\n\u0012ဇ\u000b\u0013ဉ\f\u0014ဉ\r", new Object[]{"a", "b", C69390al.m100746b(), C45240c.f118157a, C69384af.m100740b(), "d", C69386ah.m100742b(), "e", C10662f.f35572a, C69388aj.m100744b(), C30325g.f82003a, C19618h.f54585a, C69379aa.m100736b(), "i", C69381ac.m100738b(), C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C69391am();
            case 4:
                return new C69382ad();
            case 5:
                return f185639r;
            case 6:
                C63010eb ebVar = f185640s;
                if (ebVar == null) {
                    synchronized (C69391am.class) {
                        ebVar = f185640s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185639r);
                            f185640s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
