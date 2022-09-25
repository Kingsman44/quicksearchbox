package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.speech.h.by */
/* compiled from: PG */
public final class C66599by extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C66599by f181159p;

    /* renamed from: q */
    public static final C62940bt f181160q;

    /* renamed from: r */
    private static volatile C63010eb f181161r;

    /* renamed from: a */
    public int f181162a;

    /* renamed from: b */
    public String f181163b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f181164c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f181165d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f181166e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f181167f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f181168g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f181169h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f181170i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f181171j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f181172k;

    /* renamed from: l */
    public int f181173l;

    /* renamed from: m */
    public int f181174m;

    /* renamed from: n */
    public String f181175n;

    /* renamed from: o */
    public String f181176o;

    static {
        C66599by byVar = new C66599by();
        f181159p = byVar;
        C62942bv.registerDefaultInstance(C66599by.class, byVar);
        f181160q = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, byVar, byVar, (C62958ce) null, 294000, C63066gd.MESSAGE, C66599by.class);
    }

    private C66599by() {
        C62942bv.emptyProtobufList();
        this.f181175n = BuildConfig.FLAVOR;
        this.f181176o = BuildConfig.FLAVOR;
        C62942bv.emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59684a() {
        C62971cq cqVar = this.f181166e;
        if (!cqVar.mo58948c()) {
            this.f181166e = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f181159p, "\u0001\u000e\u0000\u0001\u0001\u0012\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0004\u0004ဈ\u0001\u0005\u001a\bဈ\u0002\tဈ\u0003\nဈ\u0005\u000bဈ\u0006\fင\u0007\rင\b\u000eင\t\u0010ဈ\u000b\u0011ဈ\f\u0012\u001a", new Object[]{"a", "b", C19618h.f54585a, C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "e"});
            case 3:
                return new C66599by();
            case 4:
                return new C66598bx();
            case 5:
                return f181159p;
            case 6:
                C63010eb ebVar = f181161r;
                if (ebVar == null) {
                    synchronized (C66599by.class) {
                        ebVar = f181161r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181159p);
                            f181161r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
