package com.google.p4152bb.p4153a;

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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.bb.a.gh */
/* compiled from: PG */
public final class C55112gh extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C55112gh f145017p;

    /* renamed from: q */
    private static volatile C63010eb f145018q;

    /* renamed from: a */
    public int f145019a;

    /* renamed from: b */
    public int f145020b;

    /* renamed from: c */
    public String f145021c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f145022d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public double f145023e;

    /* renamed from: f */
    public double f145024f;

    /* renamed from: g */
    public double f145025g;

    /* renamed from: h */
    public C55118gn f145026h;

    /* renamed from: i */
    public String f145027i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f145028j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f145029k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C55003cg f145030l;

    /* renamed from: m */
    public C55116gl f145031m;

    /* renamed from: n */
    public C55108gd f145032n;

    /* renamed from: o */
    public C55106gb f145033o;

    static {
        C55112gh ghVar = new C55112gh();
        f145017p = ghVar;
        C62942bv.registerDefaultInstance(C55112gh.class, ghVar);
    }

    private C55112gh() {
        emptyProtobufList();
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
                return newMessageInfo(f145017p, "\u0001\r\u0000\u0002\u0001'\r\u0000\u0000\u0000\u0001ဈ\u0000\u0005က\n\u0006က\u000b\bဈ\u0011\tဈ\u0012\fဈ\u0015\u0018ဈ\u0004!ဉ!\"ဉ\"$ဉ$%က\u000e&ဉ\u000f'ဉ%", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "i", "j", C19621k.f54601a, "d", "l", "m", C48004n.f124238a, C30325g.f82003a, C19618h.f54585a, C66412o.f180592a});
            case 3:
                return new C55112gh();
            case 4:
                return new C55111gg();
            case 5:
                return f145017p;
            case 6:
                C63010eb ebVar = f145018q;
                if (ebVar == null) {
                    synchronized (C55112gh.class) {
                        ebVar = f145018q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145017p);
                            f145018q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
