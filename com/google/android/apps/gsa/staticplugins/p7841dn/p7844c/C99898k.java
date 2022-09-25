package com.google.android.apps.gsa.staticplugins.p7841dn.p7844c;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.staticplugins.p7841dn.p7843b.C99883a;
import com.google.android.apps.gsa.staticplugins.p7841dn.p7843b.C99887e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.c.k */
/* compiled from: PG */
public final class C99898k extends C22939d {

    /* renamed from: a */
    public final Context f279449a;

    /* renamed from: b */
    public final C99883a f279450b;

    /* renamed from: c */
    public FrameLayout f279451c;

    /* renamed from: d */
    public MaterialProgressBar f279452d;

    /* renamed from: e */
    public ImageView f279453e;

    /* renamed from: f */
    public ViewGroup f279454f;

    /* renamed from: g */
    private final C99887e f279455g;

    /* renamed from: h */
    private final C58833ax f279456h;

    public C99898k(C22945j jVar, C99887e eVar, C99883a aVar, Context context, C58833ax axVar) {
        super(jVar);
        this.f279455g = eVar;
        this.f279450b = aVar;
        this.f279449a = context;
        this.f279456h = axVar;
    }

    /* renamed from: e */
    public final void mo91659e(int i) {
        this.f279451c.setVisibility(8);
        this.f279452d.mo34158a();
        CardView cardView = (CardView) this.f279454f.findViewById(R.id.error_card);
        ((TextView) cardView.findViewById(R.id.error_message)).setText(i);
        if (i == R.string.silk_pane_internal_error_message) {
            this.f279454f.findViewById(R.id.retry_button).setVisibility(8);
        }
        this.f279451c.setVisibility(8);
        this.f279454f.findViewById(R.id.error_layout).setVisibility(0);
        cardView.animate().start();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f279449a).inflate(R.layout.silkpane, (ViewGroup) null, false);
        this.f279454f = viewGroup;
        mo28295iC(viewGroup);
        this.f279451c = (FrameLayout) this.f279454f.findViewById(R.id.webview_host);
        this.f279452d = (MaterialProgressBar) this.f279454f.findViewById(R.id.progress_bar);
        this.f279453e = (ImageView) this.f279454f.findViewById(R.id.navigation_button);
        ((C99888a) this.f279455g).f279434f.mo28726b(new C99892e(this));
        ((C99888a) this.f279455g).f279432d.mo28726b(new C99893f(this));
        ((C99888a) this.f279455g).f279431c.mo28726b(new C99894g(this));
        ((C99888a) this.f279455g).f279429a.mo28726b(new C99895h(this));
        ((C99888a) this.f279455g).f279430b.mo28726b(new C99896i(this));
        ((C99888a) this.f279455g).f279433e.mo28726b(new C99897j(this));
        ViewGroup viewGroup2 = this.f279454f;
        viewGroup2.findViewById(R.id.navigation_button).setOnClickListener(new C99889b(this));
        viewGroup2.findViewById(R.id.retry_button).setOnClickListener(new C99890c(this));
        viewGroup2.findViewById(R.id.dismiss_button).setOnClickListener(new C99891d(this));
        if (this.f279456h.mo56113h()) {
            Window window = ((Activity) this.f279456h.mo56107c()).getWindow();
            window.setStatusBarColor(-1);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
        }
    }
}
