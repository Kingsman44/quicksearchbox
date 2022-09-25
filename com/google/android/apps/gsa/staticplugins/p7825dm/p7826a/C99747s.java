package com.google.android.apps.gsa.staticplugins.p7825dm.p7826a;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84397a;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.shared.p6929g.C87553a;
import com.google.android.apps.gsa.search.shared.p6929g.C87556d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4283bv.p4412k.p4413a.C57836d;
import com.google.protobuf.C62974ct;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.a.s */
/* compiled from: PG */
public final class C99747s implements C87553a {

    /* renamed from: k */
    public static final /* synthetic */ int f279090k = 0;

    /* renamed from: l */
    private static final C58974d f279091l = C58974d.m91134h("SilkAudioRecordingApi");

    /* renamed from: a */
    public final C91077d f279092a;

    /* renamed from: b */
    public final C58833ax f279093b;

    /* renamed from: c */
    public final C22871g f279094c;

    /* renamed from: d */
    public C37404bi f279095d;

    /* renamed from: e */
    public C60870cx f279096e;

    /* renamed from: f */
    public C60870cx f279097f;

    /* renamed from: g */
    public SettableFuture f279098g;

    /* renamed from: h */
    public C57836d f279099h;

    /* renamed from: i */
    public C37402bg f279100i;

    /* renamed from: j */
    public int f279101j = 1;

    /* renamed from: m */
    private final C89688a f279102m;

    /* renamed from: n */
    private final C84411o f279103n;

    public C99747s(C89688a aVar, C90821bm bmVar, C84411o oVar, C91077d dVar, C58833ax axVar) {
        this.f279102m = aVar;
        this.f279103n = oVar;
        this.f279092a = dVar;
        this.f279093b = axVar;
        this.f279094c = bmVar.mo85163a(C99742n.class);
    }

    @JavascriptInterface
    public void prepareToRecord(String str, String str2, String str3) {
        C84410n a = this.f279103n.mo77963a(str2, str3, this.f279102m);
        if (str != null) {
            try {
                C90873ag b = C90875ai.m148465b(new C99734f(a), this.f279094c.mo28207g("prepareToRecord", new C99733e(this, (C57836d) C87556d.m142212a(str, C57836d.f154528b.getParserForType()))), this.f279094c, "prepareToRecordCallback");
                Objects.requireNonNull(a);
                b.mo85223a(new C99735g(a));
            } catch (C62974ct | IllegalArgumentException e) {
                ((C58970a) ((C58970a) ((C58970a) f279091l.mo56225c()).mo56382g(e)).mo56372aa(32871)).mo56386p("Could not parse RecordingSettings.");
                throw new C84397a();
            } catch (C84397a e2) {
                a.mo77959a(e2);
            }
        } else {
            ((C58970a) ((C58970a) f279091l.mo56225c()).mo56372aa(32872)).mo56386p("serializedSettings is null.");
            throw new C84397a();
        }
    }

    @JavascriptInterface
    public void record(int i, String str, String str2) {
        C84410n a = this.f279103n.mo77963a(str, str2, this.f279102m);
        new C90873ag(this.f279094c.mo28202b("record", new C99736h(this, i)), this.f279094c, "recordCallback", new C99737i(this, a)).mo85223a(new C99738j(this, a));
    }

    @JavascriptInterface
    public void stopRecording() {
        this.f279094c.mo28212l("stopRecording", new C99731c(this));
    }

    /* renamed from: a */
    public final void mo91579a() {
        C37402bg bgVar;
        int i = this.f279101j;
        if (i != 0) {
            if (i == 3 && (bgVar = this.f279100i) != null) {
                bgVar.mo20354a();
            }
            this.f279095d = null;
            this.f279096e = null;
            this.f279097f = null;
            this.f279098g = null;
            this.f279099h = null;
            this.f279101j = 1;
            return;
        }
        throw null;
    }
}
