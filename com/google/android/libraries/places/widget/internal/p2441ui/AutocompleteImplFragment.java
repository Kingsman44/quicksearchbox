package com.google.android.libraries.places.widget.internal.p2441ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2371bs;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.gms.tasks.C146024d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.places.api.C31779a;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.C31872e;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.p2437b.C31845a;
import com.google.android.libraries.places.api.p2437b.C31847c;
import com.google.android.libraries.places.api.p2437b.C31854j;
import com.google.android.libraries.places.api.p2437b.C31855k;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import com.google.android.libraries.places.widget.internal.common.AutocompleteOptions;
import com.google.android.libraries.places.widget.internal.common.C31920h;
import com.google.android.libraries.places.widget.internal.common.C31922j;
import com.google.android.libraries.places.widget.internal.logging.AutocompleteWidgetSession;
import com.google.android.libraries.places.widget.internal.logging.C31924b;
import com.google.android.libraries.places.widget.internal.p2440a.C31900b;
import com.google.android.libraries.places.widget.internal.p2440a.C31901c;
import com.google.android.libraries.places.widget.internal.p2440a.C31902d;
import com.google.android.libraries.places.widget.internal.p2440a.C31907i;
import com.google.android.libraries.places.widget.internal.p2440a.C31908j;
import com.google.android.libraries.places.widget.internal.p2440a.C31911m;
import com.google.android.libraries.places.widget.internal.p2440a.C31912n;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.p2439a.C31896a;
import com.google.common.base.C58838bb;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment */
/* compiled from: PG */
public final class AutocompleteImplFragment extends Fragment {

    /* renamed from: a */
    public C31912n f85867a;

    /* renamed from: b */
    public C31896a f85868b;

    /* renamed from: c */
    public EditText f85869c;

    /* renamed from: d */
    private final C31863s f85870d;

    /* renamed from: e */
    private final AutocompleteOptions f85871e;

    /* renamed from: f */
    private final C31924b f85872f;

    /* renamed from: g */
    private final C21370a f85873g;

    /* renamed from: h */
    private RecyclerView f85874h;

    /* renamed from: i */
    private View f85875i;

    /* renamed from: j */
    private View f85876j;

    /* renamed from: k */
    private View f85877k;

    /* renamed from: l */
    private View f85878l;

    /* renamed from: m */
    private View f85879m;

    /* renamed from: n */
    private View f85880n;

    /* renamed from: o */
    private View f85881o;

    /* renamed from: p */
    private View f85882p;

    /* renamed from: q */
    private TextView f85883q;

    /* renamed from: r */
    private TextView f85884r;

    /* renamed from: s */
    private C31940o f85885s;

    /* renamed from: t */
    private final C31934i f85886t;

    private AutocompleteImplFragment(int i, C31863s sVar, AutocompleteOptions autocompleteOptions, C31924b bVar, C21370a aVar) {
        super(i);
        this.f85886t = new C31934i(this);
        this.f85870d = sVar;
        this.f85871e = autocompleteOptions;
        this.f85872f = bVar;
        this.f85873g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo37695a(AutocompletePrediction autocompletePrediction, int i) {
        C146006ab abVar;
        try {
            C31912n nVar = this.f85867a;
            AutocompleteWidgetSession autocompleteWidgetSession = nVar.f85806b;
            autocompleteWidgetSession.f85856j = true;
            autocompleteWidgetSession.f85855i = i;
            C31901c cVar = nVar.f85805a;
            List list = null;
            if (C31907i.f85790a.containsAll(((C31907i) cVar).f85792c.mo37664i())) {
                C31872e eVar = new C31872e();
                eVar.f85758e = autocompletePrediction.mo37462c();
                if (!autocompletePrediction.mo37467g().isEmpty()) {
                    list = autocompletePrediction.mo37467g();
                }
                eVar.f85767n = list;
                abVar = C146021aq.m237850d(new C31847c(eVar.mo37632e()));
            } else {
                C31905g gVar = ((C31907i) cVar).f85795f;
                if (gVar != null) {
                    if (((C31900b) gVar).f85786b.equals(autocompletePrediction.mo37462c())) {
                        abVar = gVar.f85789c;
                        if (abVar == null) {
                            throw null;
                        }
                    } else {
                        ((C31900b) gVar).f85785a.f394725a.f394724a.mo122510x((Object) null);
                    }
                }
                C31900b bVar = new C31900b(new C146024d(), autocompletePrediction.mo37462c());
                ((C31907i) cVar).f85795f = bVar;
                C31863s sVar = ((C31907i) cVar).f85791b;
                C31854j e = C31855k.m59240e(autocompletePrediction.mo37462c(), ((C31907i) cVar).f85792c.mo37664i());
                ((C31845a) e).f85474b = ((C31907i) cVar).f85793d;
                ((C31845a) e).f85475c = bVar.f85785a.f394725a;
                abVar = sVar.mo37395a(e.mo37447c()).mo122483b(new C31902d(bVar));
                bVar.f85789c = abVar;
            }
            if (!abVar.mo122490i()) {
                nVar.mo37653e(C31920h.m59471g());
            }
            abVar.mo122497p(new C31908j(nVar, autocompletePrediction));
        } catch (Error | RuntimeException e2) {
            C31775f.m59130a(e2);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo37696b(C31920h hVar) {
        try {
            this.f85876j.setVisibility(0);
            this.f85877k.setVisibility(0);
            this.f85878l.setVisibility(8);
            this.f85879m.setVisibility(8);
            this.f85880n.setVisibility(0);
            this.f85881o.setVisibility(8);
            this.f85882p.setVisibility(8);
            this.f85883q.setVisibility(8);
            this.f85884r.setVisibility(8);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int f = hVar.mo37684f();
            int i = f - 1;
            if (f != 0) {
                switch (i) {
                    case 0:
                        if (TextUtils.isEmpty(this.f85871e.mo37667l())) {
                            this.f85876j.setVisibility(8);
                        }
                        this.f85869c.requestFocus();
                        this.f85869c.setText(this.f85871e.mo37667l());
                        EditText editText = this.f85869c;
                        editText.setSelection(editText.getText().length());
                        return;
                    case 1:
                        this.f85885s.mo37711b((List) null);
                        this.f85876j.setVisibility(8);
                        this.f85869c.getText().clear();
                        return;
                    case 2:
                        this.f85878l.setVisibility(0);
                        return;
                    case 3:
                        this.f85884r.setVisibility(8);
                        this.f85879m.setVisibility(0);
                        this.f85880n.setVisibility(8);
                        this.f85882p.setVisibility(0);
                        this.f85883q.setVisibility(0);
                        return;
                    case 4:
                        this.f85885s.mo37711b(hVar.mo37681d());
                        this.f85881o.setVisibility(0);
                        return;
                    case 5:
                        this.f85885s.mo37711b((List) null);
                        this.f85880n.setVisibility(8);
                        this.f85882p.setVisibility(0);
                        this.f85884r.setVisibility(4);
                        this.f85883q.setText(getString(R.string.places_autocomplete_no_results_for_query, hVar.mo37682e()));
                        this.f85883q.setVisibility(0);
                        return;
                    case 6:
                        break;
                    case 7:
                        C31896a aVar = this.f85868b;
                        Place c = hVar.mo37680c();
                        c.getClass();
                        aVar.mo37637x(c);
                        return;
                    case 8:
                        AutocompletePrediction b = hVar.mo37679b();
                        C58838bb.m90866a(b, "Prediction should not be null.");
                        this.f85869c.clearFocus();
                        this.f85869c.removeTextChangedListener(this.f85886t);
                        this.f85869c.setText(b.mo37573j((CharacterStyle) null));
                        this.f85869c.addTextChangedListener(this.f85886t);
                        break;
                    case 9:
                        C31896a aVar2 = this.f85868b;
                        Status a = hVar.mo37678a();
                        a.getClass();
                        aVar2.mo37636w(a);
                        return;
                    default:
                        return;
                }
                this.f85885s.mo37711b((List) null);
                this.f85880n.setVisibility(8);
                this.f85882p.setVisibility(0);
                this.f85884r.setVisibility(0);
                this.f85883q.setText(getString(R.string.places_search_error));
                this.f85883q.setVisibility(0);
                return;
            }
            throw null;
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo37698d() {
        try {
            C31912n nVar = this.f85867a;
            String obj = this.f85869c.getText().toString();
            nVar.f85805a.mo37649a();
            nVar.mo37652c(obj);
            nVar.mo37653e(C31920h.m59473i(4).mo37677a());
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            AutocompleteWidgetSession autocompleteWidgetSession = new AutocompleteWidgetSession(this.f85871e.mo37660f(), this.f85871e.mo37661g(), this.f85871e.mo37667l(), this.f85873g);
            C31912n nVar = (C31912n) new C2368bp((C2371bs) this, (C2363bk) new C31911m(new C31907i(this.f85870d, this.f85871e, autocompleteWidgetSession.f85849c), autocompleteWidgetSession, this.f85872f)).mo5770a(C31912n.class);
            this.f85867a = nVar;
            if (bundle == null) {
                nVar.f85807c.mo5708l(C31920h.m59473i(1).mo37677a());
            }
            requireActivity().f2707h.mo3339b(this, new C31931f(this));
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    public final void onPause() {
        super.onPause();
        AutocompleteWidgetSession autocompleteWidgetSession = this.f85867a.f85806b;
        if (autocompleteWidgetSession.mo37689a()) {
            autocompleteWidgetSession.f85862p += (int) (autocompleteWidgetSession.f85864r.mo26871c() - autocompleteWidgetSession.f85863q);
            autocompleteWidgetSession.f85863q = -1;
        }
    }

    public final void onResume() {
        super.onResume();
        AutocompleteWidgetSession autocompleteWidgetSession = this.f85867a.f85806b;
        if (!autocompleteWidgetSession.mo37689a()) {
            autocompleteWidgetSession.f85863q = autocompleteWidgetSession.f85864r.mo26871c();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        try {
            this.f85869c = (EditText) view.findViewById(R.id.places_autocomplete_search_bar);
            this.f85874h = (RecyclerView) view.findViewById(R.id.places_autocomplete_list);
            this.f85875i = view.findViewById(R.id.places_autocomplete_back_button);
            this.f85876j = view.findViewById(R.id.places_autocomplete_clear_button);
            this.f85877k = view.findViewById(R.id.places_autocomplete_search_bar_separator);
            this.f85878l = view.findViewById(R.id.places_autocomplete_progress);
            this.f85879m = view.findViewById(R.id.places_autocomplete_try_again_progress);
            this.f85880n = view.findViewById(R.id.places_autocomplete_powered_by_google);
            this.f85881o = view.findViewById(R.id.places_autocomplete_powered_by_google_separator);
            this.f85882p = view.findViewById(R.id.places_autocomplete_sad_cloud);
            this.f85883q = (TextView) view.findViewById(R.id.places_autocomplete_error_message);
            this.f85884r = (TextView) view.findViewById(R.id.places_autocomplete_try_again);
            this.f85869c.addTextChangedListener(this.f85886t);
            this.f85869c.setOnFocusChangeListener(new C31935j());
            EditText editText = this.f85869c;
            int i = 0;
            if (TextUtils.isEmpty(this.f85871e.mo37666k())) {
                Context requireContext = requireContext();
                Locale locale = requireContext.getResources().getConfiguration().getLocales().get(0);
                Locale b = C31779a.m59139d() ? C31779a.m59140e().mo37401b() : locale;
                if (b.equals(locale)) {
                    str = requireContext.getResources().getString(R.string.places_autocomplete_search_hint);
                } else {
                    Configuration configuration = new Configuration(requireContext.getResources().getConfiguration());
                    configuration.setLocale(b);
                    str = requireContext.createConfigurationContext(configuration).getResources().getString(R.string.places_autocomplete_search_hint);
                }
            } else {
                str = this.f85871e.mo37666k();
            }
            editText.setHint(str);
            AutocompleteActivityMode autocompleteActivityMode = AutocompleteActivityMode.FULLSCREEN;
            int ordinal = this.f85871e.mo37661g().ordinal();
            if (ordinal == 0) {
                int a = this.f85871e.mo37654a();
                int b2 = this.f85871e.mo37655b();
                if (Color.alpha(a) >= 255) {
                    i = a;
                }
                if (!(i == 0 || b2 == 0)) {
                    int a2 = C31922j.m59482a(i, C1878d.m5128a(requireContext(), R.color.places_text_white_alpha_87), C1878d.m5128a(requireContext(), R.color.places_text_black_alpha_87));
                    int a3 = C31922j.m59482a(i, C1878d.m5128a(requireContext(), R.color.places_text_white_alpha_26), C1878d.m5128a(requireContext(), R.color.places_text_black_alpha_26));
                    view.findViewById(R.id.places_autocomplete_search_bar_container).setBackgroundColor(i);
                    Window window = requireActivity().getWindow();
                    if (C31922j.m59484c(b2, -1, -16777216)) {
                        window.setStatusBarColor(b2);
                        window.getDecorView().setSystemUiVisibility(8192);
                    } else {
                        window.setStatusBarColor(b2);
                    }
                    this.f85869c.setTextColor(a2);
                    this.f85869c.setHintTextColor(a3);
                    C31922j.m59483b((ImageView) this.f85875i, a2);
                    C31922j.m59483b((ImageView) this.f85876j, a2);
                }
            } else if (ordinal == 1) {
                int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    requireActivity().getWindow().addFlags(67108864);
                    C2043bi.m5556aj(view, view.getPaddingLeft(), view.getPaddingTop() + getResources().getDimensionPixelSize(identifier), view.getPaddingRight(), view.getPaddingBottom());
                }
            }
            this.f85875i.setOnClickListener(new C31929d(this));
            this.f85876j.setOnClickListener(new C31928c(this));
            this.f85884r.setOnClickListener(new C31926a(this));
            this.f85885s = new C31940o(new C31927b(this));
            this.f85874h.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.f85874h.setItemAnimator(new C31938m(getResources()));
            this.f85874h.setAdapter(this.f85885s);
            this.f85874h.addOnScrollListener(new C31932g(this));
            this.f85867a.f85807c.mo5704e(getViewLifecycleOwner(), new C31930e(this));
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo37697c() {
        try {
            C31912n nVar = this.f85867a;
            nVar.f85806b.f85860n++;
            nVar.mo37652c(BuildConfig.FLAVOR);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }
}
