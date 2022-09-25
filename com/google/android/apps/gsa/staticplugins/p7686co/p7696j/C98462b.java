package com.google.android.apps.gsa.staticplugins.p7686co.p7696j;

import android.text.TextUtils;
import android.text.format.Time;
import android.util.Base64;
import android.util.TimeFormatException;
import com.google.android.apps.gsa.gcm.g;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.proactive.p6476c.C84166a;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.proto.p7126io.LargeProtoParcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91374d;
import com.google.android.apps.gsa.staticplugins.p7686co.C98237bb;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C7963ql;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.j.b */
/* compiled from: PG */
public final class C98462b extends C84166a {

    /* renamed from: a */
    private static final C59071e f274930a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.j.b");

    /* renamed from: b */
    private final C91306ak f274931b;

    /* renamed from: c */
    private final C84160c f274932c;

    /* renamed from: d */
    private final C91374d f274933d;

    /* renamed from: e */
    private final C22871g f274934e;

    /* renamed from: f */
    private final g f274935f;

    /* renamed from: g */
    private final C98237bb f274936g;

    public C98462b(C91306ak akVar, C84160c cVar, C91374d dVar, C22871g gVar, g gVar2, C98237bb bbVar) {
        this.f274934e = gVar;
        this.f274931b = akVar;
        this.f274932c = cVar;
        this.f274933d = dVar;
        this.f274935f = gVar2;
        this.f274936g = bbVar;
    }

    /* renamed from: n */
    private static long m163084n(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isDigitsOnly(str)) {
            return Long.parseLong(str);
        }
        Time time = new Time();
        try {
            time.parse3339(str);
            return time.toMillis(true);
        } catch (TimeFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) f274930a.mo56226d()).mo56382g(e)).mo56372aa(30688)).mo56386p("Failed to parse time value");
            return -1;
        }
    }

    /* renamed from: a */
    public final List mo77618a() {
        List<C7752iq> list = (List) C60856cj.m92910s(this.f274933d.mo85684e());
        ArrayList d = C58597ky.m90213d(list.size());
        for (C7752iq protoLiteParcelable : list) {
            d.add(new ProtoLiteParcelable((MessageLite) protoLiteParcelable));
        }
        return d;
    }

    /* renamed from: b */
    public final void mo77619b() {
        C60856cj.m92910s(this.f274933d.mo85687h());
    }

    /* renamed from: c */
    public final void mo77620c() {
        ((C59052c) ((C59052c) f274930a.mo56224b()).mo56372aa(30689)).mo56386p("Cleared user time");
    }

    /* renamed from: d */
    public final void mo77621d() {
        ((C59052c) ((C59052c) f274930a.mo56224b()).mo56372aa(30690)).mo56386p("Clearing sidekick response");
        this.f274936g.f274293d = null;
    }

    /* renamed from: e */
    public final void mo77622e() {
        ((C59052c) ((C59052c) f274930a.mo56224b()).mo56372aa(30691)).mo56386p("Invalidating entries");
        C22871g gVar = this.f274934e;
        C91306ak akVar = this.f274931b;
        Objects.requireNonNull(akVar);
        gVar.mo28212l("invalidateEntries", new C98461a(akVar));
    }

    /* renamed from: f */
    public final void mo77623f() {
        ((C59052c) ((C59052c) f274930a.mo56224b()).mo56372aa(30692)).mo56386p("Test cards loaded on next refresh");
        this.f274936g.f274295f = true;
    }

    /* renamed from: g */
    public final void mo77624g(String str) {
        mo77626i(Base64.decode(str, 3));
    }

    /* renamed from: h */
    public final void mo77625h(LargeProtoParcelable largeProtoParcelable) {
        this.f274936g.f274293d = (C7963ql) largeProtoParcelable.mo84185a(C7963ql.f27969i.getParserForType());
    }

    /* renamed from: i */
    public final void mo77626i(byte[] bArr) {
        try {
            this.f274936g.f274293d = (C7963ql) C62942bv.parseFrom((C62942bv) C7963ql.f27969i, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f274930a.mo56226d()).mo56382g(e)).mo56372aa(30693)).mo56386p("IO Exception");
        }
    }

    /* renamed from: j */
    public final void mo77627j(byte[] bArr) {
        this.f274935f.a(bArr, (C60220t) null, (String) null);
    }

    /* renamed from: k */
    public final void mo77628k() {
        C60856cj.m92910s(this.f274932c.mo77602c(C7642eo.OBSOLETE_TEST_LAUNCHER, false));
    }

    /* renamed from: l */
    public final void mo77629l(boolean z) {
        ((C59052c) ((C59052c) f274930a.mo56224b()).mo56372aa(30694)).mo56389s("Simulating bad connection: %b", Boolean.valueOf(z));
        this.f274936g.f274294e = z;
    }

    /* renamed from: m */
    public final void mo77630m(String str) {
        C59071e eVar = f274930a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(30695)).mo56389s("Setting fake time to: %s", str);
        long n = m163084n(str);
        if (n != -1) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(30696)).mo56389s("User time %s", C89407a.m145419b(n));
        }
    }
}
