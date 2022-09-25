package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.iv */
/* compiled from: PG */
public final class C14427iv extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C14427iv f43643o;

    /* renamed from: q */
    private static volatile C63010eb f43644q;

    /* renamed from: a */
    public int f43645a;

    /* renamed from: b */
    public long f43646b;

    /* renamed from: c */
    public String f43647c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f43648d;

    /* renamed from: e */
    public boolean f43649e;

    /* renamed from: f */
    public C51012dc f43650f;

    /* renamed from: g */
    public C51805du f43651g;

    /* renamed from: h */
    public C51805du f43652h;

    /* renamed from: i */
    public String f43653i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C51805du f43654j;

    /* renamed from: k */
    public C60214n f43655k;

    /* renamed from: l */
    public int f43656l;

    /* renamed from: m */
    public int f43657m;

    /* renamed from: n */
    public int f43658n;

    /* renamed from: p */
    private byte f43659p = 2;

    static {
        C14427iv ivVar = new C14427iv();
        f43643o = ivVar;
        C62942bv.registerDefaultInstance(C14427iv.class, ivVar);
    }

    private C14427iv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43659p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43659p = b;
                return null;
            case 2:
                return newMessageInfo(f43643o, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0002\u0001\f\u0002\u0002\u0003Ȉ\u0004\u0007\u0005Љ\u0006\t\u0007\t\bȈ\t\t\nЉ\u000b\u0004\f\u0004\r\u0004\u000e\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, "e"});
            case 3:
                return new C14427iv();
            case 4:
                return new C14426iu();
            case 5:
                return f43643o;
            case 6:
                C63010eb ebVar = f43644q;
                if (ebVar == null) {
                    synchronized (C14427iv.class) {
                        ebVar = f43644q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43643o);
                            f43644q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
