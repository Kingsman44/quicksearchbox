package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49349z;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.at.ak */
/* compiled from: PG */
public final class C49826ak extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C49826ak f129462q;

    /* renamed from: r */
    private static volatile C63010eb f129463r;

    /* renamed from: a */
    public int f129464a;

    /* renamed from: b */
    public C62971cq f129465b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f129466c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f129467d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f129468e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f129469f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f129470g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f129471h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f129472i;

    /* renamed from: j */
    public C63088z f129473j = C63088z.f170246b;

    /* renamed from: k */
    public C62971cq f129474k = emptyProtobufList();

    /* renamed from: l */
    public C49821ag f129475l;

    /* renamed from: m */
    public String f129476m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public boolean f129477n = true;

    /* renamed from: o */
    public boolean f129478o;

    /* renamed from: p */
    public C49843ba f129479p;

    static {
        C49826ak akVar = new C49826ak();
        f129462q = akVar;
        C62942bv.registerDefaultInstance(C49826ak.class, akVar);
    }

    private C49826ak() {
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
                return newMessageInfo(f129462q, "\u0001\u000f\u0000\u0001\u0001\u0012\u000f\u0000\u0002\u0000\u0001\u001a\u0002ဈ\u0001\u0003ဈ\u0005\u0004ဈ\u0000\u0005ဌ\u0006\u0007ဈ\u0002\bည\b\t\u001b\nဈ\u0003\u000bဉ\t\fဈ\n\u000eဇ\f\u000fဇ\r\u0010ဈ\u0004\u0012ဉ\u000e", new Object[]{"a", "b", "d", C19618h.f54585a, C45240c.f118157a, "i", C49349z.f127554a, "e", "j", C19621k.f54601a, C49825aj.class, C10662f.f35572a, "l", "m", C48004n.f124238a, C66412o.f180592a, C30325g.f82003a, "p"});
            case 3:
                return new C49826ak();
            case 4:
                return new C49823ah();
            case 5:
                return f129462q;
            case 6:
                C63010eb ebVar = f129463r;
                if (ebVar == null) {
                    synchronized (C49826ak.class) {
                        ebVar = f129463r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129462q);
                            f129463r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
