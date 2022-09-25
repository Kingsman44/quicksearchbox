package com.google.android.apps.gsa.staticplugins.p7845do.p7848c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99935a;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99939e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.c.h */
/* compiled from: PG */
public final class C99947h extends C22939d {

    /* renamed from: a */
    public final C99935a f279587a;

    /* renamed from: b */
    public FrameLayout f279588b;

    /* renamed from: c */
    public MaterialProgressBar f279589c;

    /* renamed from: d */
    public ViewGroup f279590d;

    /* renamed from: e */
    private final C99939e f279591e;

    /* renamed from: f */
    private final Context f279592f;

    public C99947h(C22945j jVar, C99939e eVar, C99935a aVar, Context context) {
        super(jVar);
        this.f279591e = eVar;
        this.f279587a = aVar;
        this.f279592f = context;
    }

    /* renamed from: e */
    public final void mo91683e(int i) {
        this.f279588b.setVisibility(8);
        this.f279589c.mo34158a();
        CardView cardView = (CardView) this.f279590d.findViewById(R.id.error_card);
        ((TextView) cardView.findViewById(R.id.error_message)).setText(i);
        if (i == R.string.silky_tab_internal_error_message) {
            this.f279590d.findViewById(R.id.retry_button).setVisibility(8);
        }
        this.f279588b.setVisibility(8);
        this.f279590d.findViewById(R.id.error_layout).setVisibility(0);
        cardView.animate().start();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f279592f).inflate(R.layout.silkytab, (ViewGroup) null, false);
        this.f279590d = viewGroup;
        mo28295iC(viewGroup);
        this.f279588b = (FrameLayout) this.f279590d.findViewById(R.id.webview_host);
        this.f279589c = (MaterialProgressBar) this.f279590d.findViewById(R.id.progress_bar_circular);
        ((C99940a) this.f279591e).f279577d.mo28726b(new C99941b(this));
        ((C99940a) this.f279591e).f279576c.mo28726b(new C99942c(this));
        ((C99940a) this.f279591e).f279575b.mo28726b(new C99943d(this));
        ((C99940a) this.f279591e).f279574a.mo28726b(new C99944e(this));
        ViewGroup viewGroup2 = this.f279590d;
        viewGroup2.findViewById(R.id.retry_button).setOnClickListener(new C99945f(this));
        viewGroup2.findViewById(R.id.dismiss_button).setOnClickListener(new C99946g(this));
    }
}
