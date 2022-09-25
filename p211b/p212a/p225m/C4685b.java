package p211b.p212a.p225m;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4665l;

/* renamed from: b.a.m.b */
/* compiled from: PG */
public final class C4685b extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C4685b f14700n;

    /* renamed from: o */
    public static final C62940bt f14701o;

    /* renamed from: p */
    private static volatile C63010eb f14702p;

    /* renamed from: a */
    public int f14703a;

    /* renamed from: b */
    public C4665l f14704b;

    /* renamed from: c */
    public String f14705c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C4659f f14706d;

    /* renamed from: e */
    public float f14707e;

    /* renamed from: f */
    public int f14708f;

    /* renamed from: g */
    public String f14709g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C4659f f14710h;

    /* renamed from: i */
    public String f14711i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C4659f f14712j;

    /* renamed from: k */
    public boolean f14713k;

    /* renamed from: l */
    public boolean f14714l;

    /* renamed from: m */
    public boolean f14715m;

    static {
        C4685b bVar = new C4685b();
        f14700n = bVar;
        C62942bv.registerDefaultInstance(C4685b.class, bVar);
        f14701o = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194749152, C63066gd.MESSAGE, C4685b.class);
    }

    private C4685b() {
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
                return newMessageInfo(f14700n, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ခ\u0003\u0007ဋ\u0004\bဈ\u0005\tဉ\u0006\nဈ\u0007\u000bဉ\b\u000eဇ\t\u000fဇ\n\u0010ဇ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C4685b();
            case 4:
                return new C4684a();
            case 5:
                return f14700n;
            case 6:
                C63010eb ebVar = f14702p;
                if (ebVar == null) {
                    synchronized (C4685b.class) {
                        ebVar = f14702p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14700n);
                            f14702p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
