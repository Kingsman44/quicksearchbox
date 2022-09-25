package com.google.android.apps.gsa.staticplugins.p7391an.p7400g;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6534ag.C84675a;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.p6812m.C86180b;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87779dg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87780dh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87781di;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.C90720ad;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90906bc;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.p7391an.p7399f.C94016a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60564uo;
import com.google.common.p4552o.C60565up;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.g.b */
/* compiled from: PG */
public final class C94018b extends C86734a implements C84675a {

    /* renamed from: a */
    private final Context f262622a;

    /* renamed from: b */
    private final C86610af f262623b;

    /* renamed from: c */
    private final C90931ca f262624c;

    /* renamed from: f */
    private final C94016a f262625f;

    /* renamed from: g */
    private final C86338r f262626g;

    /* renamed from: h */
    private final C87242k f262627h;

    /* renamed from: i */
    private final C86180b f262628i;

    /* renamed from: j */
    private final C69464a f262629j;

    /* renamed from: k */
    private final C68214a f262630k;

    /* renamed from: l */
    private final C84466a f262631l;

    public C94018b(Context context, C86610af afVar, C90931ca caVar, C86127w wVar, C94016a aVar, C87242k kVar, C84466a aVar2, C86180b bVar, C69464a aVar3, C68214a aVar4) {
        super(C118575h.WORKER_DOODLE, "doodledata");
        this.f262622a = context;
        this.f262623b = afVar;
        this.f262624c = caVar;
        this.f262626g = wVar.f232790a.mo79722a();
        this.f262625f = aVar;
        this.f262627h = kVar;
        this.f262631l = aVar2;
        this.f262628i = bVar;
        this.f262629j = aVar3;
        this.f262630k = aVar4;
    }

    /* renamed from: a */
    public final C60870cx mo78411a() {
        C58833ax axVar = C58836b.f156633a;
        if (!this.f262628i.mo79818c()) {
            axVar = C58833ax.m90833j(this.f262628i.mo79817b());
        }
        return mo88300i(axVar);
    }

    /* renamed from: c */
    public final C60870cx mo78412c() {
        Intent putExtra = new Intent("android.intent.action.MAIN").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity").setFlags(1409286144).putExtra(":android:no_headers", false).putExtra("extra_show_setting", C90720ad.DOODLE_IN_QSB).putExtra(":android:show_fragment_title", R.string.pixel_doodle_settings_title);
        C90476a aVar = C91018d.f254254a;
        this.f262622a.startActivity(putExtra);
        return C118826c.f331423b;
    }

    /* renamed from: e */
    public final C60870cx mo78413e() {
        C86180b bVar = this.f262628i;
        if (!bVar.f232876a.getBoolean("doodle_sticky_test_data", false)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = bVar.f232876a.getLong("doodle_update_time", 0);
            long j2 = j - elapsedRealtime;
            if (elapsedRealtime >= j || j2 > 900000 || bVar.mo79818c()) {
                C60870cx h = C60922j.m93045h(this.f262624c.mo85138c((C90906bc) this.f262629j.mo17428b()), new C94017a(this), C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
                return h;
            }
        }
        return mo78411a();
    }

    /* renamed from: f */
    public final void mo78414f(boolean z) {
        C87684al alVar = new C87684al(C88244um.DISPLAY_DYNAMIC_ICON);
        if (z) {
            String string = this.f262626g.getString("qsb_super_g_image_path", BuildConfig.FLAVOR);
            if (!string.isEmpty()) {
                C87780dh dhVar = (C87780dh) C87781di.f237556c.createBuilder();
                dhVar.copyOnWrite();
                C87781di diVar = (C87781di) dhVar.instance;
                string.getClass();
                diVar.f237558a |= 1;
                diVar.f237559b = string;
                alVar.mo81965b(C87779dg.f237555a, (C87781di) dhVar.build());
            }
        }
        this.f262623b.mo80228i(alVar.mo81964a());
    }

    /* renamed from: g */
    public final void mo78415g(Bundle bundle) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1329;
        Parcelable[] parcelableArray = bundle.getParcelableArray("impression_bundles");
        if (parcelableArray != null) {
            for (Parcelable parcelable : parcelableArray) {
                Bundle bundle2 = (Bundle) parcelable;
                long j = bundle2.getLong("impression_timestamp", 0);
                long j2 = bundle2.getLong("impression_duration", 0);
                int i = bundle2.getInt("impression_num_loops", 0);
                C60564uo uoVar = (C60564uo) C60565up.f164290e.createBuilder();
                uoVar.copyOnWrite();
                C60565up upVar = (C60565up) uoVar.instance;
                upVar.f164292a |= 1;
                upVar.f164293b = j;
                uoVar.copyOnWrite();
                C60565up upVar2 = (C60565up) uoVar.instance;
                upVar2.f164292a |= 2;
                upVar2.f164294c = j2;
                uoVar.copyOnWrite();
                C60565up upVar3 = (C60565up) uoVar.instance;
                upVar3.f164292a |= 4;
                upVar3.f164295d = (long) i;
                C60565up upVar4 = (C60565up) uoVar.build();
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                upVar4.getClass();
                C62971cq cqVar = ufVar2.f164159bM;
                if (!cqVar.mo58948c()) {
                    ufVar2.f164159bM = C62942bv.mutableCopy(cqVar);
                }
                ufVar2.f164159bM.add(upVar4);
            }
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo78416h(DoodleData doodleData) {
        this.f262625f.mo88299b(doodleData, Optional.empty());
    }

    /* renamed from: hY */
    public final void mo79108hY() {
    }

    /* renamed from: i */
    public final C60870cx mo88300i(C58833ax axVar) {
        return this.f262624c.mo85138c(new C94020d(this.f262622a, axVar, this.f262631l, this.f262627h, this.f262626g, this.f262630k));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
