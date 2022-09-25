package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.b.a.j;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80482g;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4283bv.p4373g.C57667b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.ae */
/* compiled from: PG */
public final class C80413ae extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C62962ci f220687l = new C80411ac();

    /* renamed from: p */
    public static final C80413ae f220688p;

    /* renamed from: r */
    private static volatile C63010eb f220689r;

    /* renamed from: a */
    public int f220690a;

    /* renamed from: b */
    public String f220691b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f220692c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f220693d = emptyProtobufList();

    /* renamed from: e */
    public long f220694e;

    /* renamed from: f */
    public long f220695f;

    /* renamed from: g */
    public j f220696g;

    /* renamed from: h */
    public C80386p f220697h;

    /* renamed from: i */
    public String f220698i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f220699j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C62961ch f220700k = emptyIntList();

    /* renamed from: m */
    public String f220701m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public int f220702n;

    /* renamed from: o */
    public int f220703o;

    /* renamed from: q */
    private byte f220704q = 2;

    static {
        C80413ae aeVar = new C80413ae();
        f220688p = aeVar;
        C62942bv.registerDefaultInstance(C80413ae.class, aeVar);
    }

    private C80413ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220704q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220704q = b;
                return null;
            case 2:
                return newMessageInfo(f220688p, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0002\u0003\u0001ဈ\u0001\u0002Л\u0003ဂ\u0002\u0004ᐉ\u0004\u0005ဂ\u0003\u0006ᐉ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\u0000\n\u001e\u000bဈ\b\fဌ\t\rဌ\n", new Object[]{"a", C45240c.f118157a, "d", C80047aa.class, "e", C30325g.f82003a, C10662f.f35572a, C19618h.f54585a, "i", "j", "b", C19621k.f54601a, C57667b.m88515b(), "m", C48004n.f124238a, C80482g.m128177b(), C66412o.f180592a, e.b()});
            case 3:
                return new C80413ae();
            case 4:
                return new C80412ad();
            case 5:
                return f220688p;
            case 6:
                C63010eb ebVar = f220689r;
                if (ebVar == null) {
                    synchronized (C80413ae.class) {
                        ebVar = f220689r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220688p);
                            f220689r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
