package com.google.android.apps.search.podcasts.settings;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.app.C0395p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.p10576l.C140449ak;
import com.google.android.apps.search.podcasts.p10588n.C140666ao;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.settings.p10612a.C141048a;
import com.google.android.apps.search.podcasts.settings.p10612a.C141050c;
import com.google.android.apps.search.podcasts.settings.p10612a.C141051d;
import com.google.android.apps.search.podcasts.settings.p10612a.C141057j;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.apps.tiktok.tracing.C47754cs;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.function.Consumer;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.t */
/* compiled from: PG */
public final class C141098t {

    /* renamed from: a */
    public static final C59071e f383068a = C59071e.m91331h();

    /* renamed from: b */
    public static final C58485gu f383069b;

    /* renamed from: c */
    public final Context f383070c;

    /* renamed from: d */
    public final SettingsFragment f383071d;

    /* renamed from: e */
    public final C141057j f383072e;

    /* renamed from: f */
    public final C46801dp f383073f;

    /* renamed from: g */
    public final C46439e f383074g;

    /* renamed from: h */
    public final C47770dh f383075h;

    /* renamed from: i */
    public final C46485f f383076i;

    /* renamed from: j */
    public final C141213d f383077j;

    /* renamed from: k */
    public final C28306ab f383078k;

    /* renamed from: l */
    public final NotificationManager f383079l;

    /* renamed from: m */
    public final boolean f383080m;

    /* renamed from: n */
    public C141050c f383081n;

    /* renamed from: o */
    public final C1411002 f383082o = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C141098t.f383068a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41649));
            cVar.mo56386p("Failed to settings");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141050c cVar = (C141050c) obj;
            C69664n.m101061g(cVar, "data");
            C141098t.this.mo116151a(cVar);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: p */
    public final C46440f f383083p = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((Number) obj).intValue();
            C59052c cVar = (C59052c) ((C59052c) C141098t.f383068a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41648));
            cVar.mo56386p("Failed to update them");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            Void voidR = (Void) obj2;
            if (C141098t.this.f383071d.requireActivity() instanceof C0395p) {
                C0167am requireActivity = C141098t.this.f383071d.requireActivity();
                C69664n.m101059e(requireActivity, "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
                C0395p pVar = (C0395p) requireActivity;
                C140449ak a = C140449ak.m228147a(intValue);
                if (a != null) {
                    int ordinal = a.ordinal();
                    if (ordinal == 1) {
                        pVar.mo1322k().mo1191s(1);
                        return;
                    } else if (ordinal == 2) {
                        pVar.mo1322k().mo1191s(2);
                        return;
                    }
                }
                pVar.mo1322k().mo1191s(-1);
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: q */
    private final C140997s f383084q;

    /* renamed from: r */
    private final boolean f383085r;

    static {
        C58485gu p = C58485gu.m89848p(C140449ak.LIGHT, C140449ak.DARK, C140449ak.SYSTEM_DEFAULT);
        C69664n.m101060f(p, "of(ThemeSetting.LIGHT, T…meSetting.SYSTEM_DEFAULT)");
        f383069b = p;
    }

    public C141098t(Context context, SettingsFragment settingsFragment, C141057j jVar, C46801dp dpVar, C46439e eVar, C47770dh dhVar, C46485f fVar, C141213d dVar, C28306ab abVar, NotificationManager notificationManager, C140997s sVar, boolean z, boolean z2) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(jVar, "preferencesDataService");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(notificationManager, "notificationManager");
        C69664n.m101061g(sVar, "veLoggedEvents");
        this.f383070c = context;
        this.f383071d = settingsFragment;
        this.f383072e = jVar;
        this.f383073f = dpVar;
        this.f383074g = eVar;
        this.f383075h = dhVar;
        this.f383076i = fVar;
        this.f383077j = dVar;
        this.f383078k = abVar;
        this.f383079l = notificationManager;
        this.f383084q = sVar;
        this.f383080m = z;
        this.f383085r = z2;
    }

    /* renamed from: c */
    public static final int m229092c(C140449ak akVar) {
        C140449ak akVar2 = C140449ak.DEFAULT;
        int ordinal = akVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? R.string.podcasts_theme_system_default : R.string.podcasts_theme_dark;
        }
        return R.string.podcasts_theme_light;
    }

    /* renamed from: d */
    private final void m229093d(C141048a aVar, int i, int i2, int i3) {
        View findViewById = this.f383071d.requireView().findViewById(i);
        C69664n.m101059e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(aVar.f382927a);
        View view = this.f383071d.getView();
        C69664n.m101058d(view);
        View findViewById2 = view.findViewById(i2);
        C69664n.m101059e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setText(aVar.f382928b);
        View findViewById3 = this.f383071d.requireView().findViewById(i3);
        findViewById3.setVisibility(0);
        findViewById3.setOnClickListener(new C141097s(findViewById3, aVar));
    }

    /* renamed from: e */
    private final boolean m229094e() {
        NotificationChannel notificationChannel;
        if (!this.f383079l.areNotificationsEnabled() || (notificationChannel = this.f383079l.getNotificationChannel("com.google.android.apps.gsa.plugins.podcastplayer.channel")) == null || notificationChannel.getImportance() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo116151a(C141050c cVar) {
        this.f383081n = cVar;
        SettingsFragment settingsFragment = this.f383071d;
        if (settingsFragment.getView() != null) {
            View findViewById = settingsFragment.requireView().findViewById(R.id.podcasts_personalization_container);
            C141050c cVar2 = this.f383081n;
            C69664n.m101058d(cVar2);
            int i = 8;
            findViewById.setVisibility(true != cVar2.f382932a.f382930a ? 8 : 0);
            C141050c cVar3 = this.f383081n;
            C69664n.m101058d(cVar3);
            ((TextView) this.f383071d.requireView().findViewById(R.id.podcasts_preferred_languages)).setText(cVar3.f382932a.f382931b);
            this.f383071d.requireView().findViewById(R.id.podcasts_preferred_language_container).setOnClickListener(new C47591co(this.f383075h, "Preferences: open language settings", new C141064ag(this)));
            View findViewById2 = this.f383071d.requireView().findViewById(R.id.podcasts_auto_download_container);
            C141050c cVar4 = this.f383081n;
            C69664n.m101058d(cVar4);
            findViewById2.setVisibility(true != cVar4.f382943l ? 8 : 0);
            TextView textView = (TextView) this.f383071d.requireView().findViewById(R.id.podcasts_auto_download_status);
            C141050c cVar5 = this.f383081n;
            if (cVar5 == null || !cVar5.f382935d) {
                textView.setText(this.f383070c.getResources().getString(R.string.podcasts_disabled_label));
            } else {
                List list = cVar5.f382939h;
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (((C140666ao) next).f382044a.f382008n) {
                        arrayList.add(next);
                    }
                }
                int size = arrayList.size();
                C141050c cVar6 = this.f383081n;
                C69664n.m101058d(cVar6);
                List list2 = cVar6.f382939h;
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : list2) {
                    if (((C140666ao) next2).f382044a.f382004j) {
                        arrayList2.add(next2);
                    }
                }
                textView.setText(this.f383070c.getResources().getQuantityString(R.plurals.podcasts_enabled_podcasts_number_label, size, new Object[]{Integer.valueOf(size), Integer.valueOf(arrayList2.size())}));
            }
            this.f383071d.requireView().findViewById(R.id.podcasts_auto_download_container).setOnClickListener(new C47591co(this.f383075h, "Preferences: open auto download settings", new C141104x(this)));
            C141050c cVar7 = this.f383081n;
            C69664n.m101058d(cVar7);
            C141051d dVar = cVar7.f382933b;
            Context requireContext = this.f383071d.requireContext();
            C69664n.m101060f(requireContext, "fragment.requireContext()");
            ((TextView) this.f383071d.requireView().findViewById(R.id.podcasts_remove_completed_episode_option)).setText(dVar.mo116112a(requireContext));
            C140997s sVar = this.f383084q;
            View findViewById3 = this.f383071d.requireView().findViewById(R.id.podcasts_remove_completed_episode_container);
            C69664n.m101060f(findViewById3, "fragment.requireView().f…pleted_episode_container)");
            sVar.mo116062a(findViewById3, new C141058aa(this), "Preferences: time to remove completed episode setting");
            C141050c cVar8 = this.f383081n;
            C69664n.m101058d(cVar8);
            C141051d dVar2 = cVar8.f382934c;
            Context requireContext2 = this.f383071d.requireContext();
            C69664n.m101060f(requireContext2, "fragment.requireContext()");
            ((TextView) this.f383071d.requireView().findViewById(R.id.podcasts_remove_unfinished_episode_option)).setText(dVar2.mo116112a(requireContext2));
            C140997s sVar2 = this.f383084q;
            View findViewById4 = this.f383071d.requireView().findViewById(R.id.podcasts_remove_unfinished_episode_container);
            C69664n.m101060f(findViewById4, "fragment.requireView().f…nished_episode_container)");
            sVar2.mo116062a(findViewById4, new C141060ac(this), "Preferences: time to remove unfinished episode setting");
            View findViewById5 = this.f383071d.requireView().findViewById(R.id.podcasts_notifications_settings_container);
            C141050c cVar9 = this.f383081n;
            C69664n.m101058d(cVar9);
            findViewById5.setVisibility((cVar9.f382943l || m229094e()) ? 0 : 8);
            View findViewById6 = this.f383071d.requireView().findViewById(R.id.podcasts_audio_player_notification_container);
            findViewById6.setVisibility(true != m229094e() ? 8 : 0);
            findViewById6.setOnClickListener(new C47591co(this.f383075h, "go to AGSA notification settings", new C141103w(findViewById6, this)));
            TextView textView2 = (TextView) this.f383071d.requireView().findViewById(R.id.podcasts_new_episode_notification_status);
            C141050c cVar10 = this.f383081n;
            C69664n.m101058d(cVar10);
            List list3 = cVar10.f382939h;
            ArrayList arrayList3 = new ArrayList();
            for (Object next3 : list3) {
                if (((C140666ao) next3).f382044a.f382009o) {
                    arrayList3.add(next3);
                }
            }
            int size2 = arrayList3.size();
            C141050c cVar11 = this.f383081n;
            C69664n.m101058d(cVar11);
            List list4 = cVar11.f382939h;
            ArrayList arrayList4 = new ArrayList();
            for (Object next4 : list4) {
                if (((C140666ao) next4).f382044a.f382004j) {
                    arrayList4.add(next4);
                }
            }
            textView2.setText(this.f383070c.getResources().getQuantityString(R.plurals.podcasts_enabled_podcasts_number_label, size2, new Object[]{Integer.valueOf(size2), Integer.valueOf(arrayList4.size())}));
            View findViewById7 = this.f383071d.requireView().findViewById(R.id.podcasts_new_episode_notification_container);
            C141050c cVar12 = this.f383081n;
            C69664n.m101058d(cVar12);
            findViewById7.setVisibility(true != cVar12.f382943l ? 8 : 0);
            findViewById7.setOnClickListener(new C47591co(this.f383075h, "Preferences: open new episode notifications settings", new C141065ah(this)));
            ((ViewGroup) this.f383071d.requireView().findViewById(R.id.podcasts_explore_container)).setVisibility(true != this.f383085r ? 0 : 8);
            Switch switchR = (Switch) this.f383071d.requireView().findViewById(R.id.podcasts_show_personalized_recommendations_switch);
            C141050c cVar13 = this.f383081n;
            C69664n.m101058d(cVar13);
            switchR.setVisibility(true != cVar13.f382943l ? 8 : 0);
            C141050c cVar14 = this.f383081n;
            C69664n.m101058d(cVar14);
            switchR.setChecked(cVar14.f382937f == C54362bo.ENABLE_PERSONALIZATION);
            switchR.setOnCheckedChangeListener(new C47754cs(this.f383075h, new C141061ad(this), "Preferences: update show personalized recommendations preference"));
            TextView textView3 = (TextView) this.f383071d.requireView().findViewById(R.id.podcasts_reactions_preferences);
            C141050c cVar15 = this.f383081n;
            C69664n.m101058d(cVar15);
            if (true == cVar15.f382943l) {
                i = 0;
            }
            textView3.setVisibility(i);
            textView3.setOnClickListener(new C141062ae(textView3));
            TextView textView4 = (TextView) this.f383071d.requireView().findViewById(R.id.podcasts_personalized_recommendations_more_info);
            textView4.setOnClickListener(new C141063af(textView4));
            C141050c cVar16 = this.f383081n;
            C69664n.m101058d(cVar16);
            ((Switch) this.f383071d.requireView().findViewById(R.id.podcasts_explicit_content_filtered_switch)).setChecked(!cVar16.f382944m);
            TextView textView5 = (TextView) this.f383071d.requireView().findViewById(R.id.podcasts_content_settings_more_info);
            textView5.setOnClickListener(new C141105y(textView5));
            Switch switchR2 = (Switch) this.f383071d.requireView().findViewById(R.id.podcasts_autoplay_switch);
            C141050c cVar17 = this.f383081n;
            C69664n.m101058d(cVar17);
            int i2 = true != cVar17.f382938g ? 102657 : 102721;
            C28306ab abVar = this.f383078k;
            abVar.mo33803d(switchR2, abVar.f76990a.mo33805a(C28427h.m53115a(i2)));
            C141050c cVar18 = this.f383081n;
            C69664n.m101058d(cVar18);
            switchR2.setChecked(cVar18.f382938g);
            switchR2.setOnCheckedChangeListener(new C47754cs(this.f383075h, new C141066ai(this), "Preferences: update autoplay preference"));
            C140997s sVar3 = this.f383084q;
            C69664n.m101060f(switchR2, "this");
            sVar3.mo116062a(switchR2, C141067aj.f382982a, "click autoplay switch");
            SettingsFragment settingsFragment2 = this.f383071d;
            C141050c cVar19 = this.f383081n;
            C69664n.m101058d(cVar19);
            ((TextView) this.f383071d.requireView().findViewById(R.id.podcasts_current_theme_setting)).setText(settingsFragment2.getString(m229092c(cVar19.f382940i)));
            this.f383071d.requireView().findViewById(R.id.podcasts_theme_setting_container).setOnClickListener(new C47591co(this.f383075h, "Preferences: open theme settings", new C141068ak(this)));
            C141048a aVar = cVar.f382941j;
            if (aVar != null) {
                m229093d(aVar, R.id.podcasts_google_podcasts_app_name, R.id.podcasts_google_podcasts_app_version, R.id.podcasts_google_podcasts_app_version_container);
            }
            C141048a aVar2 = cVar.f382942k;
            if (aVar2 != null) {
                m229093d(aVar2, R.id.podcasts_google_app_name, R.id.podcasts_google_app_version, R.id.podcasts_google_app_version_container);
            }
        }
    }

    /* renamed from: b */
    public final void mo116152b(String str, List list, C141051d dVar, Consumer consumer) {
        String string = this.f383070c.getString(R.string.podcasts_settings_ok);
        C69664n.m101060f(string, "context.getString(R.string.podcasts_settings_ok)");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            String a = ((C141051d) G.next()).mo116112a(this.f383070c);
            C69664n.m101059e(a, "null cannot be cast to non-null type kotlin.CharSequence");
            arrayList.add(a);
        }
        Object[] array = arrayList.toArray(new CharSequence[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        int indexOf = list.indexOf(dVar);
        C44581b bVar = new C44581b(this.f383070c, 0);
        bVar.mo47605x(str);
        bVar.mo47603v((CharSequence[]) array, indexOf, C141069al.f382984a);
        bVar.mo47602u(string, new C47752cq(this.f383075h, "Preferences: update time preference.", new C141070am(consumer, list)));
        C0392m create = bVar.create();
        C69664n.m101060f(create, "options: List<TimeOption…      )\n        .create()");
        create.show();
    }
}
