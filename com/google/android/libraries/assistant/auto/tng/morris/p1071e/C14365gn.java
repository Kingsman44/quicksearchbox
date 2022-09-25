package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gn */
/* compiled from: PG */
public final class C14365gn extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C14365gn f43466q;

    /* renamed from: s */
    private static volatile C63010eb f43467s;

    /* renamed from: a */
    public int f43468a;

    /* renamed from: b */
    public long f43469b;

    /* renamed from: c */
    public int f43470c;

    /* renamed from: d */
    public String f43471d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f43472e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f43473f;

    /* renamed from: g */
    public C60214n f43474g;

    /* renamed from: h */
    public boolean f43475h;

    /* renamed from: i */
    public C54201r f43476i;

    /* renamed from: j */
    public boolean f43477j;

    /* renamed from: k */
    public C13901e f43478k;

    /* renamed from: l */
    public C51805du f43479l;

    /* renamed from: m */
    public C16754d f43480m;

    /* renamed from: n */
    public C14364gm f43481n;

    /* renamed from: o */
    public String f43482o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public boolean f43483p;

    /* renamed from: r */
    private byte f43484r = 2;

    static {
        C14365gn gnVar = new C14365gn();
        f43466q = gnVar;
        C62942bv.registerDefaultInstance(C14365gn.class, gnVar);
    }

    private C14365gn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43484r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43484r = b;
                return null;
            case 2:
                return newMessageInfo(f43466q, "\u0000\u0010\u0000\u0000\u0001\u0011\u0010\u0000\u0000\u0002\u0001\f\u0002\f\u0003Ȉ\u0005\u0007\u0006\u0010\u0007Љ\b\u0007\tЉ\n\u0007\u000b\t\f\t\r\t\u000e\t\u000fȈ\u0010Ȉ\u0011\u0007", new Object[]{"a", C45240c.f118157a, "d", C10662f.f35572a, "b", C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, "e", C66412o.f180592a, "p"});
            case 3:
                return new C14365gn();
            case 4:
                return new C14362gk();
            case 5:
                return f43466q;
            case 6:
                C63010eb ebVar = f43467s;
                if (ebVar == null) {
                    synchronized (C14365gn.class) {
                        ebVar = f43467s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43466q);
                            f43467s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
