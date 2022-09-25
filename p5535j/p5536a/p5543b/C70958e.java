package p5535j.p5536a.p5543b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C59755el;
import com.google.common.p4552o.C60003j;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.b.e */
/* compiled from: PG */
public final class C70958e extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C70958e f189197m;

    /* renamed from: n */
    public static final C62940bt f189198n;

    /* renamed from: o */
    private static volatile C63010eb f189199o;

    /* renamed from: a */
    public int f189200a;

    /* renamed from: b */
    public int f189201b = 0;

    /* renamed from: c */
    public Object f189202c;

    /* renamed from: d */
    public String f189203d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f189204e;

    /* renamed from: f */
    public C62971cq f189205f = emptyProtobufList();

    /* renamed from: g */
    public String f189206g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f189207h;

    /* renamed from: i */
    public C62971cq f189208i = emptyProtobufList();

    /* renamed from: j */
    public C70957d f189209j;

    /* renamed from: k */
    public C70965l f189210k;

    /* renamed from: l */
    public boolean f189211l;

    static {
        C70958e eVar = new C70958e();
        f189197m = eVar;
        C62942bv.registerDefaultInstance(C70958e.class, eVar);
        f189198n = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, eVar, eVar, (C62958ce) null, 374802878, C63066gd.MESSAGE, C70958e.class);
    }

    private C70958e() {
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
                return newMessageInfo(f189197m, "\u0001\u000b\u0001\u0001\u0001\f\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ြ\u0000\u0004\u001b\u0005ဈ\u0004\u0006ဌ\u0005\u0007\u001b\tဉ\u0007\nဉ\b\u000bဇ\t\fြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C70960g.class, C10662f.f35572a, C60003j.class, C30325g.f82003a, C19618h.f54585a, C70967n.m103851b(), "i", C59755el.class, "j", C19621k.f54601a, "l", C70962i.class});
            case 3:
                return new C70958e();
            case 4:
                return new C70936a();
            case 5:
                return f189197m;
            case 6:
                C63010eb ebVar = f189199o;
                if (ebVar == null) {
                    synchronized (C70958e.class) {
                        ebVar = f189199o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189197m);
                            f189199o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
