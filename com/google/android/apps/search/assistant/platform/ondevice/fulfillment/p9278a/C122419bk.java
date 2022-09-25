package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3913g.p3914a.C51225c;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk */
/* compiled from: PG */
public final class C122419bk extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C122419bk f339392l;

    /* renamed from: m */
    private static volatile C63010eb f339393m;

    /* renamed from: a */
    public int f339394a;

    /* renamed from: b */
    public String f339395b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52091ex f339396c;

    /* renamed from: d */
    public String f339397d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f339398e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f339399f;

    /* renamed from: g */
    public boolean f339400g;

    /* renamed from: h */
    public boolean f339401h;

    /* renamed from: i */
    public C51225c f339402i;

    /* renamed from: j */
    public boolean f339403j;

    /* renamed from: k */
    public int f339404k;

    static {
        C122419bk bkVar = new C122419bk();
        f339392l = bkVar;
        C62942bv.registerDefaultInstance(C122419bk.class, bkVar);
    }

    private C122419bk() {
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
                return newMessageInfo(f339392l, "\u0000\u000b\u0000\u0000\u0001\u000f\u000b\u0000\u0000\u0000\u0001\u0004\u0003Ȉ\u0004\t\u0006Ȉ\bȈ\t\u0007\n\u0007\f\u0007\r\t\u000e\u0007\u000f\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C122419bk();
            case 4:
                return new C122417bi();
            case 5:
                return f339392l;
            case 6:
                C63010eb ebVar = f339393m;
                if (ebVar == null) {
                    synchronized (C122419bk.class) {
                        ebVar = f339393m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339392l);
                            f339393m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
