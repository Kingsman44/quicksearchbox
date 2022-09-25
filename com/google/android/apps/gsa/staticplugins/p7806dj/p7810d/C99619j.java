package com.google.android.apps.gsa.staticplugins.p7806dj.p7810d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99606a;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99609d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.d.j */
/* compiled from: PG */
public final class C99619j extends C22939d {

    /* renamed from: a */
    public final C99606a f278767a;

    /* renamed from: b */
    public final C99611b f278768b;

    /* renamed from: c */
    private final InputMethodManager f278769c;

    /* renamed from: d */
    private final Context f278770d;

    /* renamed from: e */
    private final C99609d f278771e;

    /* renamed from: f */
    private final C90323a f278772f;

    /* renamed from: g */
    private final C90324b f278773g = new C99615f(this);

    /* renamed from: h */
    private EditText f278774h;

    /* renamed from: i */
    private EditText f278775i;

    public C99619j(C22945j jVar, C99606a aVar, Context context, C99609d dVar, C90323a aVar2) {
        super(jVar);
        this.f278770d = context;
        this.f278767a = aVar;
        this.f278771e = dVar;
        this.f278772f = aVar2;
        this.f278768b = new C99611b(context);
        this.f278769c = (InputMethodManager) context.getSystemService("input_method");
    }

    /* renamed from: e */
    public final void mo91511e() {
        InputMethodManager inputMethodManager = this.f278769c;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(mo28297il().getWindowToken(), 0);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        this.f278772f.mo84005b(this.f278773g);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f278770d).inflate(R.layout.settings_search_layout, (ViewGroup) null, false);
        this.f278774h = (EditText) linearLayout.findViewById(R.id.settings_search_bar);
        mo28295iC(linearLayout);
        ((ImageButton) linearLayout.findViewById(R.id.settings_search_back_button)).setOnClickListener(new C99613d(this));
        EditText editText = (EditText) linearLayout.findViewById(R.id.settings_search_bar);
        this.f278775i = editText;
        editText.addTextChangedListener(new C99616g(this, (ImageButton) linearLayout.findViewById(R.id.settings_search_clear_button)));
        ImageButton imageButton = (ImageButton) linearLayout.findViewById(R.id.settings_search_clear_button);
        imageButton.setOnClickListener(new C99614e((EditText) linearLayout.findViewById(R.id.settings_search_bar), imageButton));
        ListView listView = (ListView) linearLayout.findViewById(R.id.settings_search_results_list);
        listView.setAdapter(this.f278768b);
        listView.setOnItemClickListener(new C99617h(this));
        listView.setOnScrollListener(new C99618i(this));
        C23251a aVar = ((C99610a) this.f278771e).f278754b;
        C99611b bVar = this.f278768b;
        Objects.requireNonNull(bVar);
        aVar.mo28726b(new C99612c(bVar));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f278774h.setText((String) ((C99610a) this.f278771e).f278753a.f63720e);
        this.f278775i.requestFocus();
        InputMethodManager inputMethodManager = this.f278769c;
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(2, 1);
        }
        this.f278772f.mo84004a(this.f278773g);
    }
}
