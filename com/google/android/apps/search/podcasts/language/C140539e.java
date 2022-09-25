package com.google.android.apps.search.podcasts.language;

import android.app.Dialog;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.search.podcasts.language.p10577a.C140517b;
import com.google.android.apps.search.podcasts.language.p10578b.C140532l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.e */
/* compiled from: PG */
public final class C140539e {

    /* renamed from: a */
    public static final C59071e f381699a = C59071e.m91331h();

    /* renamed from: b */
    public final LanguageFragment f381700b;

    /* renamed from: c */
    public final C46801dp f381701c;

    /* renamed from: d */
    public final C140532l f381702d;

    /* renamed from: e */
    public final C140515a f381703e;

    /* renamed from: f */
    public final C47770dh f381704f;

    /* renamed from: g */
    public C140517b f381705g;

    /* renamed from: h */
    public C31974aw f381706h;

    /* renamed from: com.google.android.apps.search.podcasts.language.e$a */
    /* compiled from: PG */
    final class C140540a implements C46792di {

        /* renamed from: b */
        private final C31974aw f381708b;

        public C140540a(C31974aw awVar) {
            this.f381708b = awVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C140539e.f381699a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41602));
            cVar.mo56386p("Failed to load language options");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C140517b bVar = (C140517b) obj;
            C69664n.m101061g(bVar, "data");
            C140539e.this.mo115721a(bVar, this.f381708b);
        }

        /* renamed from: c */
        public final void mo18079c() {
            C59052c cVar = (C59052c) C140539e.f381699a.mo56224b();
            cVar.mo56379ah(new C59094n(41603));
            cVar.mo56386p("Loading language options in background");
        }
    }

    public C140539e(LanguageFragment languageFragment, C46801dp dpVar, C140532l lVar, C140515a aVar, C47770dh dhVar) {
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f381700b = languageFragment;
        this.f381701c = dpVar;
        this.f381702d = lVar;
        this.f381703e = aVar;
        this.f381704f = dhVar;
    }

    /* renamed from: e */
    public static final View m228248e(Dialog dialog) {
        View findViewById = dialog.findViewById(R.id.design_bottom_sheet);
        C69664n.m101058d(findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public static final RecyclerView m228249f(View view) {
        View findViewById = view.findViewById(R.id.podcasts_language_item_list);
        C69664n.m101058d(findViewById);
        return (RecyclerView) findViewById;
    }

    /* renamed from: a */
    public final void mo115721a(C140517b bVar, C31974aw awVar) {
        View findViewById;
        if (bVar != null) {
            awVar.mo37740a(bVar.f381653a);
            Dialog dialog = this.f381700b.getDialog();
            if (!(dialog == null || (findViewById = dialog.findViewById(R.id.podcasts_save_languages_button)) == null)) {
                findViewById.setEnabled(bVar.f381654b);
            }
        }
        this.f381705g = bVar;
    }

    /* renamed from: b */
    public final void mo115722b() {
        Dialog requireDialog = this.f381700b.requireDialog();
        C69664n.m101060f(requireDialog, "fragment.requireDialog()");
        BottomSheetBehavior.m78767C(m228248e(requireDialog)).mo47519v(3);
    }

    /* renamed from: c */
    public final void mo115723c() {
        Object systemService = this.f381700b.requireContext().getSystemService("input_method");
        C69664n.m101059e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        View findViewById = this.f381700b.requireDialog().findViewById(R.id.podcasts_language_settings_container);
        C69664n.m101060f(findViewById, "fragment.requireDialog()…guage_settings_container)");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
    }

    /* renamed from: d */
    public final void mo115724d(int i) {
        View findViewById = this.f381700b.requireDialog().findViewById(R.id.podcasts_language_drag_handle);
        C69664n.m101058d(findViewById);
        findViewById.setVisibility(i);
    }
}
