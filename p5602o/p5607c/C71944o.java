package p5602o.p5607c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.social.p3269d.p3270a.C41937l;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4420by.p4421a.p4422a.C57868e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5602o.p5603a.C71860a;

/* renamed from: o.c.o */
/* compiled from: PG */
public final class C71944o extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C71944o f191610j;

    /* renamed from: k */
    private static volatile C63010eb f191611k;

    /* renamed from: a */
    public int f191612a;

    /* renamed from: b */
    public int f191613b;

    /* renamed from: c */
    public C57868e f191614c;

    /* renamed from: d */
    public String f191615d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f191616e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f191617f;

    /* renamed from: g */
    public C62971cq f191618g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public int f191619h;

    /* renamed from: i */
    public int f191620i;

    static {
        C71944o oVar = new C71944o();
        f191610j = oVar;
        C62942bv.registerDefaultInstance(C71944o.class, oVar);
    }

    private C71944o() {
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
                return newMessageInfo(f191610j, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0001\u0000\u0002ဌ\u0000\u0003ဉ\u0001\u0005ဈ\u0002\u0006\u001a\u0007ဂ\u0004\tဌ\u0006\nဈ\u0003\u000bဌ\u0007", new Object[]{"a", "b", C71860a.f191407a, C45240c.f118157a, "d", C30325g.f82003a, C10662f.f35572a, C19618h.f54585a, C71938i.f191603a, "e", "i", C41937l.m73461b()});
            case 3:
                return new C71944o();
            case 4:
                return new C71943n();
            case 5:
                return f191610j;
            case 6:
                C63010eb ebVar = f191611k;
                if (ebVar == null) {
                    synchronized (C71944o.class) {
                        ebVar = f191611k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191610j);
                            f191611k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
