package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.a.fk */
/* compiled from: PG */
public final class C71119fk extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C71119fk f189709o;

    /* renamed from: p */
    public static final C62940bt f189710p;

    /* renamed from: q */
    private static volatile C63010eb f189711q;

    /* renamed from: a */
    public int f189712a;

    /* renamed from: b */
    public int f189713b;

    /* renamed from: c */
    public C62961ch f189714c = emptyIntList();

    /* renamed from: d */
    public String f189715d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f189716e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f189717f;

    /* renamed from: g */
    public int f189718g;

    /* renamed from: h */
    public C63042fg f189719h;

    /* renamed from: i */
    public int f189720i;

    /* renamed from: j */
    public boolean f189721j;

    /* renamed from: k */
    public boolean f189722k;

    /* renamed from: l */
    public boolean f189723l;

    /* renamed from: m */
    public boolean f189724m;

    /* renamed from: n */
    public C71137x f189725n;

    static {
        C71119fk fkVar = new C71119fk();
        f189709o = fkVar;
        C62942bv.registerDefaultInstance(C71119fk.class, fkVar);
        f189710p = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, fkVar, fkVar, (C62958ce) null, 460482311, C63066gd.MESSAGE, C71119fk.class);
    }

    private C71119fk() {
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
                return newMessageInfo(f189709o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဌ\u0000\u0002'\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဌ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\bဌ\u0006\tဇ\u0007\nဇ\b\u000bဇ\t\fဇ\n\rဉ\u000b", new Object[]{"a", "b", C71111fc.m103891b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C71116fh.m103895b(), C30325g.f82003a, C71114ff.m103893b(), C19618h.f54585a, "i", C71118fj.m103897b(), "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C71119fk();
            case 4:
                return new C71112fd();
            case 5:
                return f189709o;
            case 6:
                C63010eb ebVar = f189711q;
                if (ebVar == null) {
                    synchronized (C71119fk.class) {
                        ebVar = f189711q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189709o);
                            f189711q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
