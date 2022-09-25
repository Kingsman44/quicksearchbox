package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114868dk;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ag */
/* compiled from: PG */
public final class C114976ag implements C114757k {

    /* renamed from: a */
    public static final C59071e f319090a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ag");

    /* renamed from: b */
    public final Context f319091b;

    /* renamed from: c */
    public final Activity f319092c;

    /* renamed from: d */
    public final C114868dk f319093d;

    /* renamed from: e */
    public final C21370a f319094e;

    /* renamed from: f */
    public final C114978ai f319095f;

    /* renamed from: g */
    public final C91097g f319096g;

    /* renamed from: h */
    public final C58833ax f319097h;

    /* renamed from: i */
    public final C58833ax f319098i;

    /* renamed from: j */
    public final C68214a f319099j;

    /* renamed from: k */
    public final C87571n f319100k;

    /* renamed from: l */
    public final List f319101l = new ArrayList();

    /* renamed from: m */
    public C28293k f319102m;

    /* renamed from: n */
    public boolean f319103n = false;

    /* renamed from: o */
    private final C58881cr f319104o;

    /* renamed from: p */
    private final C86124t f319105p;

    public C114976ag(Context context, Activity activity, C114868dk dkVar, C21370a aVar, C58833ax axVar, C58833ax axVar2, C68214a aVar2, C87571n nVar, C86124t tVar, C114978ai aiVar, C91097g gVar) {
        this.f319091b = context;
        this.f319092c = activity;
        this.f319093d = dkVar;
        this.f319094e = aVar;
        this.f319097h = axVar;
        this.f319098i = axVar2;
        this.f319099j = aVar2;
        this.f319100k = nVar;
        this.f319105p = tVar;
        this.f319095f = aiVar;
        this.f319096g = gVar;
        this.f319104o = C58886cw.m90973a(new C114972ac(this));
    }

    /* renamed from: j */
    static /* synthetic */ void m190597j(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            C59104x c = f319090a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AmbientSummarySC");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(29474)).mo56386p("PendingIntent expired.");
        }
    }

    /* renamed from: a */
    public final View mo101577a() {
        C58976aa aaVar = C58975e.f156826a;
        return (View) this.f319104o.mo6453a();
    }

    /* renamed from: b */
    public final /* synthetic */ C114750d mo101578b(int i) {
        return null;
    }

    /* renamed from: c */
    public final C28293k mo101579c() {
        if (this.f319102m == null) {
            View view = (View) this.f319104o.mo6453a();
        }
        return this.f319102m;
    }

    /* renamed from: d */
    public final void mo101580d() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo101581e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101582f() {
    }

    /* renamed from: g */
    public final void mo101583g(C58833ax axVar) {
    }

    /* renamed from: h */
    public final void mo101772h(SpannableStringBuilder spannableStringBuilder, String str, Runnable runnable, boolean z, Integer num) {
        int indexOf = spannableStringBuilder.toString().indexOf(str);
        if (indexOf == -1) {
            C59104x d = f319090a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmbientSummarySC");
            ((C59052c) ((C59052c) d).mo56372aa(29471)).mo56389s("Failed to add ClickableSpan on: %s", str);
            return;
        }
        spannableStringBuilder.setSpan(new C114975af(this, z, runnable, num), indexOf, str.length() + indexOf, 33);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo101584i() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00dd  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo101773k(android.text.SpannableStringBuilder r10) {
        /*
            r9 = this;
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ai r0 = r9.f319095f
            com.google.common.base.ax r0 = r0.mo101775c()
            boolean r0 = r0.mo56113h()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ai r0 = r9.f319095f
            com.google.common.base.ax r0 = r0.mo101775c()
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.s.a.eb r0 = (com.google.assistant.p3994s.p3995a.C53173eb) r0
            java.lang.String r4 = r0.f139354c
            java.lang.String r2 = r0.f139353b
            android.content.Context r3 = r9.f319091b
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r1] = r4
            r1 = 1
            r6[r1] = r2
            r2 = 2132083123(0x7f1501b3, float:1.980638E38)
            java.lang.String r2 = r3.getString(r2, r6)
            r10.append(r2)
            int r2 = r0.f139352a
            r3 = r2 & 64
            if (r3 == 0) goto L_0x0120
            r2 = r2 & 32
            r3 = 3
            r6 = 0
            if (r2 == 0) goto L_0x0067
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.f r2 = com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114752f.UNKNOWN
            int r2 = r0.f139355d
            int r2 = com.google.assistant.p3994s.p3995a.C53172ea.m86783a(r2)
            if (r2 != 0) goto L_0x004d
            r2 = 1
        L_0x004d:
            int r2 = r2 + -1
            if (r2 == r1) goto L_0x005e
            if (r2 == r5) goto L_0x005a
            if (r2 == r3) goto L_0x0056
            goto L_0x0067
        L_0x0056:
            r2 = 2131099887(0x7f0600ef, float:1.781214E38)
            goto L_0x0061
        L_0x005a:
            r2 = 2131099888(0x7f0600f0, float:1.7812142E38)
            goto L_0x0061
        L_0x005e:
            r2 = 2131099886(0x7f0600ee, float:1.7812138E38)
        L_0x0061:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = r2
            goto L_0x0068
        L_0x0067:
            r7 = r6
        L_0x0068:
            com.google.android.apps.gsa.search.core.i.t r2 = r9.f319105p
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f248039p
            boolean r2 = r2.mo79746e(r6)
            if (r2 != 0) goto L_0x00dd
            com.google.assistant.s.a.ih r2 = com.google.assistant.p3994s.p3995a.C53287ih.f139693l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.s.a.hw r2 = (com.google.assistant.p3994s.p3995a.C53275hw) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.s.a.ih r6 = (com.google.assistant.p3994s.p3995a.C53287ih) r6
            int r8 = r6.f139695a
            r8 = r8 | 8
            r6.f139695a = r8
            java.lang.String r8 = "zs_commute"
            r6.f139701g = r8
            java.lang.String r0 = r0.f139356e
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.s.a.ih r6 = (com.google.assistant.p3994s.p3995a.C53287ih) r6
            r0.getClass()
            r6.f139696b = r3
            r6.f139697c = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.s.a.ih r0 = (com.google.assistant.p3994s.p3995a.C53287ih) r0
            r0.f139698d = r5
            int r3 = r0.f139695a
            r3 = r3 | r1
            r0.f139695a = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.s.a.ih r0 = (com.google.assistant.p3994s.p3995a.C53287ih) r0
            r3 = 12
            r0.f139702h = r3
            int r3 = r0.f139695a
            r3 = r3 | 64
            r0.f139695a = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.s.a.ih r0 = (com.google.assistant.p3994s.p3995a.C53287ih) r0
            r3 = 26
            r0.f139703i = r3
            int r3 = r0.f139695a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r0.f139695a = r3
            com.google.protobuf.bv r0 = r2.build()
            com.google.assistant.s.a.ih r0 = (com.google.assistant.p3994s.p3995a.C53287ih) r0
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.z r5 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.z
            r5.<init>(r9, r0)
            r6 = 1
            r2 = r9
            r3 = r10
            r2.mo101772h(r3, r4, r5, r6, r7)
            goto L_0x0120
        L_0x00dd:
            com.google.android.apps.gsa.search.core.i.t r2 = r9.f319105p
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247865G
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0120
            java.lang.String r2 = r0.f139356e     // Catch:{ URISyntaxException -> 0x00fb }
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r1)     // Catch:{ URISyntaxException -> 0x00fb }
            com.google.android.apps.gsa.shared.util.t.g r3 = r9.f319096g     // Catch:{ URISyntaxException -> 0x00fb }
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.aa r5 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.aa     // Catch:{ URISyntaxException -> 0x00fb }
            r5.<init>(r3, r2)     // Catch:{ URISyntaxException -> 0x00fb }
            r6 = 1
            r2 = r9
            r3 = r10
            r2.mo101772h(r3, r4, r5, r6, r7)     // Catch:{ URISyntaxException -> 0x00fb }
            goto L_0x0120
        L_0x00fb:
            r10 = move-exception
            com.google.common.f.e r2 = f319090a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "AmbientSummarySC"
            r2.mo56378ag(r3, r4)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.x r10 = r2.mo56382g(r10)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            r2 = 29475(0x7323, float:4.1303E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r2)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            java.lang.String r2 = "invalid commute uri: %s"
            java.lang.String r0 = r0.f139356e
            r10.mo56389s(r2, r0)
        L_0x0120:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C114976ag.mo101773k(android.text.SpannableStringBuilder):boolean");
    }
}
