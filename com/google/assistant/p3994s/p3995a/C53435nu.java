package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49111gw;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.s.a.nu */
/* compiled from: PG */
public final class C53435nu extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C53435nu f140233n;

    /* renamed from: o */
    public static final C62940bt f140234o;

    /* renamed from: q */
    private static volatile C63010eb f140235q;

    /* renamed from: a */
    public int f140236a;

    /* renamed from: b */
    public int f140237b = 0;

    /* renamed from: c */
    public Object f140238c;

    /* renamed from: d */
    public String f140239d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f140240e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C53439ny f140241f;

    /* renamed from: g */
    public String f140242g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C53439ny f140243h;

    /* renamed from: i */
    public C51012dc f140244i;

    /* renamed from: j */
    public C51012dc f140245j;

    /* renamed from: k */
    public C53308jb f140246k;

    /* renamed from: l */
    public C53437nw f140247l;

    /* renamed from: m */
    public String f140248m = BuildConfig.FLAVOR;

    /* renamed from: p */
    private byte f140249p = 2;

    static {
        C53435nu nuVar = new C53435nu();
        f140233n = nuVar;
        C62942bv.registerDefaultInstance(C53435nu.class, nuVar);
        f140234o = C62942bv.newSingularGeneratedExtension(C49111gw.f127019a, nuVar, nuVar, (C62958ce) null, 101, C63066gd.MESSAGE, C53435nu.class);
    }

    private C53435nu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140249p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140249p = b;
                return null;
            case 2:
                return newMessageInfo(f140233n, "\u0001\u000f\u0001\u0001\u0001\u0011\u000f\u0000\u0000\u0004\u0001ဈ\u0001\u0002ᐉ\u0005\u0003ဉ\n\u0004်\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ျ\u0000\bဈ\u0003\u000bᐼ\u0000\fᐉ\t\rᐉ\u0006\u000eဈ\u0000\u000fဉ\u0002\u0010ဉ\u0004\u0011ဈ\u000b", new Object[]{C45240c.f118157a, "b", "a", "e", "i", "l", C51805du.class, C30325g.f82003a, C52560wg.class, C19621k.f54601a, "j", "d", C10662f.f35572a, C19618h.f54585a, "m"});
            case 3:
                return new C53435nu();
            case 4:
                return new C53433ns();
            case 5:
                return f140233n;
            case 6:
                C63010eb ebVar = f140235q;
                if (ebVar == null) {
                    synchronized (C53435nu.class) {
                        ebVar = f140235q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140233n);
                            f140235q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
