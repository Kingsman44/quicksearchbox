package com.google.android.apps.search.podcasts.playerpanel.p10599b;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.widgets.valueselector.HorizontalValueSelector;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47754cs;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.b.j */
/* compiled from: PG */
public final class C140906j {

    /* renamed from: a */
    public static final C59071e f382598a = C59071e.m91331h();

    /* renamed from: b */
    public final C140898b f382599b;

    /* renamed from: c */
    public final Context f382600c;

    /* renamed from: d */
    public final C140790h f382601d;

    /* renamed from: e */
    public final C47770dh f382602e;

    /* renamed from: f */
    public final C46439e f382603f;

    /* renamed from: g */
    public final C46855i f382604g;

    /* renamed from: h */
    public final C140459au f382605h;

    /* renamed from: i */
    public final C28306ab f382606i;

    /* renamed from: j */
    public final C140997s f382607j;

    /* renamed from: k */
    public boolean f382608k;

    /* renamed from: l */
    public final CompoundButton.OnCheckedChangeListener f382609l;

    /* renamed from: m */
    public final C46852f f382610m = new C140901e(this);

    /* renamed from: n */
    public final C1409071 f382611n = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((Number) obj).floatValue();
            C140906j.this.f382608k = false;
            C59052c cVar = (C59052c) ((C59052c) C140906j.f382598a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41637));
            cVar.mo56386p("Failed to update playback speed");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            ((Number) obj).floatValue();
            Void voidR = (Void) obj2;
            C140906j.this.f382608k = false;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: o */
    public final C1409082 f382612o = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((Boolean) obj).booleanValue();
            C140906j.this.f382608k = false;
            C59052c cVar = (C59052c) ((C59052c) C140906j.f382598a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41638));
            cVar.mo56386p("Failed to update trim silence");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            ((Boolean) obj).booleanValue();
            Void voidR = (Void) obj2;
            C140906j.this.f382608k = false;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: p */
    private final C28443m f382613p;

    public C140906j(C140898b bVar, Context context, C140790h hVar, C47770dh dhVar, C46439e eVar, C46855i iVar, C140459au auVar, C28306ab abVar, C140997s sVar, C28443m mVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(hVar, "podcastAudioPlayer");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(iVar, "localSubscriptionMixin");
        C69664n.m101061g(auVar, "preferencesManager");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(sVar, "veLoggedEvents");
        C69664n.m101061g(mVar, "interactionLogger");
        this.f382599b = bVar;
        this.f382600c = context;
        this.f382601d = hVar;
        this.f382602e = dhVar;
        this.f382603f = eVar;
        this.f382604g = iVar;
        this.f382605h = auVar;
        this.f382606i = abVar;
        this.f382607j = sVar;
        this.f382613p = mVar;
        this.f382609l = new C47754cs(dhVar, new C140902f(this), "trim silence change");
    }

    /* renamed from: a */
    public final HorizontalValueSelector mo116004a() {
        View requireView = this.f382599b.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        HorizontalValueSelector a = C140910l.m228833a(requireView);
        C69664n.m101060f(a, "fragment.requireView().getSpeedSelectorView()");
        return a;
    }

    /* renamed from: b */
    public final Chip mo116005b() {
        View requireView = this.f382599b.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        Chip b = C140910l.m228834b(requireView);
        C69664n.m101060f(b, "fragment.requireView().getTrimSilenceView()");
        return b;
    }

    /* renamed from: c */
    public final void mo116006c(boolean z) {
        if (!this.f382599b.isStateSaved()) {
            this.f382613p.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(mo116005b()));
            Resources resources = this.f382599b.getResources();
            C69664n.m101060f(resources, "fragment.resources");
            if (z) {
                mo116005b().mo47695r(resources.getDimension(R.dimen.podcasts_trim_silence_icon_size_checked));
                mo116005b().mo47720u(0.0f);
                mo116005b().setContentDescription(resources.getString(R.string.podcasts_trim_silence_disable));
            } else {
                mo116005b().mo47695r(resources.getDimension(R.dimen.podcasts_trim_silence_icon_size));
                mo116005b().mo47720u(resources.getDimension(R.dimen.podcasts_trim_silence_start_padding));
                mo116005b().setContentDescription(resources.getString(R.string.podcasts_trim_silence_enable));
            }
            this.f382608k = true;
            C60870cx n = this.f382605h.mo115689n(z);
            C69664n.m101060f(n, "preferencesManager.updateTrimSilence(isChecked)");
            this.f382603f.mo50445g(C46438d.m82810b(C140989k.m228945c(n, new C140909k(this, z))), new C46436b(Boolean.valueOf(z)), this.f382612o);
        }
    }
}
