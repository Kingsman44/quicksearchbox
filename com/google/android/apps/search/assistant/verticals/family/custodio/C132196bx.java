package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p427am.p432b.p433a.C8624ac;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8641at;
import com.google.p427am.p432b.p433a.C8642au;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8692v;
import com.google.p427am.p432b.p433a.C8693w;
import com.google.p427am.p432b.p433a.C8696z;
import com.google.protobuf.C62963cj;
import java.util.HashSet;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bx */
/* compiled from: PG */
public final class C132196bx {

    /* renamed from: a */
    public static final C59071e f360824a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.bx");

    /* renamed from: b */
    public final CustodioMediaSettingsFragment f360825b;

    /* renamed from: c */
    public final Bundle f360826c;

    /* renamed from: d */
    public final C132140a f360827d;

    /* renamed from: e */
    public final C46485f f360828e;

    /* renamed from: f */
    public final C46801dp f360829f;

    /* renamed from: g */
    public final C132197a f360830g = new C132197a();

    /* renamed from: h */
    public final C37215b f360831h;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bx$a */
    /* compiled from: PG */
    final class C132197a implements C46792di {
        public C132197a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132196bx.f360824a.mo56225c()).mo56382g(th)).mo56372aa(39545)).mo56386p("Failed to fetch required information!");
            C132196bx.this.mo110535b();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                C8633al alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                Context requireContext = C132196bx.this.f360825b.requireContext();
                View requireView = C132196bx.this.f360825b.requireView();
                TextView textView = (TextView) requireView.findViewById(R.id.assistant_custodio_media_settings_fragment_subtitle);
                C8642au auVar = alVar.f29904b;
                if (auVar == null) {
                    auVar = C8642au.f29924f;
                }
                HashSet hashSet = new HashSet(new C62963cj(auVar.f29928d, C8642au.f29923e));
                C8693w wVar = alVar.f29903a;
                if (wVar == null) {
                    wVar = C8693w.f30027f;
                }
                HashSet hashSet2 = new HashSet(new C62963cj(wVar.f30031d, C8693w.f30026e));
                boolean contains = hashSet.contains(C8641at.YOUTUBE);
                int i = R.string.assistant_custodio_media_settings_fragment_subtitle_with_youtube;
                if (!contains && !hashSet.contains(C8641at.YOUTUBE_KIDS) && !hashSet.contains(C8641at.YOUTUBE_TV) && !hashSet2.contains(C8692v.YOUTUBE)) {
                    i = R.string.assistant_custodio_media_settings_fragment_subtitle_no_youtube;
                }
                textView.setText(requireContext.getString(i, new Object[]{agVar.f29893b}));
                C132196bx bxVar = C132196bx.this;
                View findViewById = requireView.findViewById(R.id.assistant_custodio_media_settings_fragment_music_item);
                String string = requireContext.getString(R.string.assistant_custodio_media_settings_fragment_music_item_title);
                C8693w wVar2 = alVar.f29903a;
                if (wVar2 == null) {
                    wVar2 = C8693w.f30027f;
                }
                bxVar.mo110534a(findViewById, R.drawable.quantum_ic_audiotrack_vd_theme_24, string, C132262dp.m214923b(requireContext, wVar2), new C132193bu(this));
                C132196bx bxVar2 = C132196bx.this;
                View findViewById2 = requireView.findViewById(R.id.assistant_custodio_media_settings_fragment_video_item);
                String string2 = requireContext.getString(R.string.assistant_custodio_media_settings_fragment_video_item_title);
                C8642au auVar2 = alVar.f29904b;
                if (auVar2 == null) {
                    auVar2 = C8642au.f29924f;
                }
                bxVar2.mo110534a(findViewById2, R.drawable.quantum_ic_ondemand_video_vd_theme_24, string2, C132262dp.m214924c(requireContext, auVar2), new C132194bv(this));
                C132196bx bxVar3 = C132196bx.this;
                View findViewById3 = requireView.findViewById(R.id.assistant_custodio_media_settings_fragment_news_podcasts_item);
                String string3 = requireContext.getString(R.string.assistant_custodio_media_settings_fragment_news_and_podcasts_item_title);
                C8696z zVar = alVar.f29908f;
                if (zVar == null) {
                    zVar = C8696z.f30032b;
                }
                C8624ac acVar = alVar.f29909g;
                if (acVar == null) {
                    acVar = C8624ac.f29887b;
                }
                bxVar3.mo110534a(findViewById3, R.drawable.quantum_ic_podcasts_vd_theme_24, string3, C132262dp.m214925d(requireContext, zVar, acVar), new C132195bw(this));
                C132196bx bxVar4 = C132196bx.this;
                bxVar4.f360825b.requireView().findViewById(R.id.assistant_custodio_media_settings_fragment_progress_bar).setVisibility(8);
                bxVar4.f360825b.requireView().findViewById(R.id.assistant_custodio_media_settings_fragment_main_container).setVisibility(0);
                C132196bx.this.f360831h.mo19974a(C37176a.f97034dt);
                return;
            }
            ((C59052c) ((C59052c) C132196bx.f360824a.mo56225c()).mo56372aa(39546)).mo56386p("Not provided with exactly one child's info!");
            C132196bx.this.mo110535b();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132196bx bxVar = C132196bx.this;
            bxVar.f360825b.requireView().findViewById(R.id.assistant_custodio_media_settings_fragment_progress_bar).setVisibility(0);
            bxVar.f360825b.requireView().findViewById(R.id.assistant_custodio_media_settings_fragment_main_container).setVisibility(8);
        }
    }

    public C132196bx(CustodioMediaSettingsFragment custodioMediaSettingsFragment, C132140a aVar, C46485f fVar, C46801dp dpVar, C37215b bVar) {
        this.f360825b = custodioMediaSettingsFragment;
        this.f360827d = aVar;
        this.f360828e = fVar;
        this.f360829f = dpVar;
        Bundle arguments = custodioMediaSettingsFragment.getArguments();
        this.f360826c = arguments == null ? new Bundle() : arguments;
        this.f360831h = bVar;
    }

    /* renamed from: a */
    public final void mo110534a(View view, int i, String str, String str2, View.OnClickListener onClickListener) {
        if (str2 == null) {
            ((C59052c) ((C59052c) f360824a.mo56225c()).mo56372aa(39547)).mo56386p("Subtitle could not be rendered for item in CustodioMediaSettingsFragment!");
            mo110535b();
            return;
        }
        ((ImageView) view.findViewById(R.id.assistant_custodio_media_settings_fragment_item_image)).setImageResource(i);
        ((TextView) view.findViewById(R.id.assistant_custodio_media_settings_fragment_item_title)).setText(str);
        ((TextView) view.findViewById(R.id.assistant_custodio_media_settings_fragment_item_subtitle)).setText(str2);
        view.setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public final void mo110535b() {
        this.f360831h.mo19974a(C37176a.f97023di);
        this.f360828e.mo50482c(this.f360825b).mo50508d(R.id.assistant_custodio_media_settings_fragment_to_dialog, C132287ei.m214954a(this.f360825b.getString(R.string.assistant_custodio_fatal_error_title), this.f360825b.getString(R.string.assistant_custodio_fatal_error_body), this.f360825b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }
}
