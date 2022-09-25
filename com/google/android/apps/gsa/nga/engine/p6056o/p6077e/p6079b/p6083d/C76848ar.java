package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76575as;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76605q;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82362cj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82364cl;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82591kw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82592kx;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.ar */
/* compiled from: PG */
public final class C76848ar implements C76591c {

    /* renamed from: b */
    public static final /* synthetic */ int f212252b = 0;

    /* renamed from: c */
    private static final ComponentName f212253c = new ComponentName("com.google.android.gm", "com.google.android.gm.ui.MailActivityGmail");

    /* renamed from: a */
    public final C76871v f212254a;

    /* renamed from: d */
    private final Context f212255d;

    /* renamed from: e */
    private final C76832ab f212256e;

    /* renamed from: f */
    private final C22871g f212257f;

    /* renamed from: g */
    private final C83305i f212258g;

    public C76848ar(Context context, C76832ab abVar, C22871g gVar, C76871v vVar, C83305i iVar) {
        this.f212256e = abVar;
        this.f212255d = context;
        this.f212257f = gVar;
        this.f212254a = vVar;
        this.f212258g = iVar;
    }

    /* renamed from: d */
    private static C58485gu m123460d(C76590bg bgVar, String str, Optional optional) {
        Optional flatMap = bgVar.mo72265g(C76605q.f211852a, str).flatMap(C76833ac.f212235a);
        Optional empty = Optional.empty();
        if (optional.isPresent()) {
            empty = bgVar.mo72265g(C76564ah.f211801a, (String) optional.get()).flatMap(C76839ai.f212242a);
        }
        return (C58485gu) Stream.CC.m71936of((T[]) new Optional[]{flatMap, empty}).filter(C76840aj.f212243a).map(C76841ak.f212244a).collect(C58370cn.f155946a);
    }

    /* renamed from: e */
    private static Optional m123461e(C76590bg bgVar, String str) {
        return bgVar.mo72265g(C76564ah.f211801a, str);
    }

    /* renamed from: f */
    private static Optional m123462f(C76590bg bgVar, String str) {
        return bgVar.mo72265g(C76605q.f211852a, str).flatMap(C76838ah.f212241a);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SEARCH_EMAIL));
        h.mo72277g("Search_email", C90126fx.f251233eu);
        h.mo72244c(C58485gu.m89846n("Search_email"));
        ((C76541a) h).f211766c = 10201;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        boolean z;
        boolean z2;
        int i;
        Intent intent;
        C76590bg bgVar2 = bgVar;
        if (this.f212255d.getPackageManager().getLaunchIntentForPackage("com.google.android.gm") == null) {
            return C81442m.f222851a;
        }
        Optional e = m123461e(bgVar2, "body");
        if (e.isPresent()) {
            z2 = false;
            z = true;
        } else {
            e = m123461e(bgVar2, "Body");
            z2 = e.isPresent();
            z = false;
        }
        Optional f = m123462f(bgVar2, "sender");
        if (f.isPresent()) {
            z = true;
        } else {
            f = m123462f(bgVar2, "Sender");
            if (f.isPresent()) {
                z2 = true;
            }
        }
        C58485gu d = m123460d(bgVar2, "recipient", Optional.m71637of("hardcoded_recipient"));
        if (d.isEmpty()) {
            d = m123460d(bgVar2, "Recipient", Optional.empty());
            if (!d.isEmpty()) {
                z2 = true;
            }
        } else {
            z = true;
        }
        C58485gu guVar = (C58485gu) Stream.CC.m71936of((T[]) new Optional[]{bgVar2.mo72267i("date").flatMap(C76842al.f212245a), bgVar2.mo72272n("time_unit").flatMap(new C76843am(this, (Boolean) bgVar2.mo72265g(C76575as.f211814a, "relative").orElse(false))), bgVar2.mo72272n("weekday").flatMap(new C76844an(this)), bgVar2.mo72272n("month").flatMap(new C76845ao(this)), bgVar2.mo72270l("duration").flatMap(new C76846ap(this))}).filter(C76840aj.f212243a).map(C76841ak.f212244a).collect(C58370cn.f155946a);
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(bgVar2.mo72262d("category")).distinct().map(C76836af.f212238a).collect(C58370cn.f155946a);
        e.ifPresent(new C76847aq(this));
        f.ifPresent(new C76834ad(this));
        if (!d.isEmpty()) {
            mo72337c("recipient");
        }
        if (!guVar.isEmpty()) {
            mo72337c("temporal");
            z = true;
        }
        if (!guVar2.isEmpty()) {
            mo72337c("category");
            z = true;
        }
        C58480gp e2 = C58485gu.m89837e();
        Objects.requireNonNull(e2);
        f.ifPresent(new C76835ae(e2));
        e2.mo55396h(d);
        e2.mo55396h(guVar);
        Objects.requireNonNull(e2);
        e.ifPresent(new C76835ae(e2));
        e2.mo55396h(guVar2);
        String str = z2 ? z ? "gina_grammars_and_canteen" : "canteen" : z ? "gina_grammars" : "unclear";
        C83305i iVar = this.f212258g;
        C82591kw c = C82592kx.m131648c();
        ((C82362cj) c).f225000b = str;
        iVar.mo75579d(c.mo75868a());
        String join = TextUtils.join(" ", e2.mo55394f());
        if (join.isEmpty()) {
            intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(f212253c);
            intent.setFlags(268468224);
            i = 84612;
        } else {
            Intent intent2 = new Intent("com.google.android.gms.actions.SEARCH_ACTION");
            intent2.setPackage("com.google.android.gm");
            intent2.putExtra("query", join);
            intent = intent2;
            i = 82918;
        }
        return this.f212257f.mo28209i(this.f212256e.mo72336a(intent), "[NGA] SearchEmailFulfiller.fulfill", new C76837ag(i, nVar));
    }

    /* renamed from: c */
    public final void mo72337c(String str) {
        this.f212258g.mo75579d(new C82364cl("NGA_GMAIL_SEARCH_INTENT_GENERATED_PREDICATE_COUNT", str));
    }
}
