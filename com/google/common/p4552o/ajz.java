package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.ajz */
/* compiled from: PG */
public final class ajz extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final ajz f158928q;

    /* renamed from: r */
    public static final C62940bt f158929r;

    /* renamed from: s */
    public static final C62940bt f158930s;

    /* renamed from: t */
    private static volatile C63010eb f158931t;

    /* renamed from: a */
    public int f158932a;

    /* renamed from: b */
    public String f158933b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f158934c;

    /* renamed from: d */
    public boolean f158935d;

    /* renamed from: e */
    public int f158936e;

    /* renamed from: f */
    public int f158937f;

    /* renamed from: g */
    public long f158938g;

    /* renamed from: h */
    public int f158939h;

    /* renamed from: i */
    public String f158940i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f158941j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f158942k;

    /* renamed from: l */
    public C62961ch f158943l = emptyIntList();

    /* renamed from: m */
    public String f158944m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public boolean f158945n;

    /* renamed from: o */
    public int f158946o;

    /* renamed from: p */
    public int f158947p;

    static {
        ajz ajz = new ajz();
        f158928q = ajz;
        C62942bv.registerDefaultInstance(ajz.class, ajz);
        ajz ajz2 = ajz;
        ajz ajz3 = ajz;
        f158929r = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ajz2, ajz3, (C62958ce) null, 368, C63066gd.MESSAGE, ajz.class);
        f158930s = C62942bv.newSingularGeneratedExtension(C60313nz.f163201a, ajz2, ajz3, (C62958ce) null, 167, C63066gd.MESSAGE, ajz.class);
    }

    private ajz() {
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
                return newMessageInfo(f158928q, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဈ\u0007\tဈ\b\u000fဌ\t\u0010\u0016\u0011ဈ\n\u0012ဇ\u000b\u0013င\f\u0014င\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, ajy.m92418b(), "i", "j", C19621k.f54601a, C51962fo.m86456b(), "l", "m", C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new ajz();
            case 4:
                return new ajw();
            case 5:
                return f158928q;
            case 6:
                C63010eb ebVar = f158931t;
                if (ebVar == null) {
                    synchronized (ajz.class) {
                        ebVar = f158931t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158928q);
                            f158931t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
