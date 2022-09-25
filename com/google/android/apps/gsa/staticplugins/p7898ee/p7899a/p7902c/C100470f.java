package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7902c;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b.C100460a;
import com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7901b.C100464e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.c.f */
/* compiled from: PG */
public final class C100470f extends C22939d {

    /* renamed from: a */
    public final C100460a f280860a;

    /* renamed from: b */
    public FrameLayout f280861b;

    /* renamed from: c */
    public FrameLayout f280862c;

    /* renamed from: d */
    private final C100464e f280863d;

    /* renamed from: e */
    private final Context f280864e;

    /* renamed from: f */
    private final C58833ax f280865f;

    /* renamed from: g */
    private final boolean f280866g;

    public C100470f(C22945j jVar, C100464e eVar, C100460a aVar, Context context, C58833ax axVar, boolean z) {
        super(jVar);
        this.f280863d = eVar;
        this.f280860a = aVar;
        this.f280864e = context;
        this.f280865f = axVar;
        this.f280866g = z;
    }

    /* renamed from: e */
    public final void mo91932e(boolean z) {
        this.f280861b.setVisibility(8);
        TextView textView = (TextView) this.f280862c.findViewById(R.id.error_heading);
        TextView textView2 = (TextView) this.f280862c.findViewById(R.id.error_message);
        if (z) {
            this.f280862c.findViewById(R.id.retry_button).setVisibility(0);
            textView.setText(R.string.offline_error_header);
            textView2.setText(R.string.offline_error_message);
        } else {
            this.f280862c.findViewById(R.id.retry_button).setVisibility(8);
            textView.setText(R.string.internal_error_header);
            textView2.setText(R.string.internal_error_message);
        }
        this.f280862c.findViewById(R.id.error_layout).setVisibility(0);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f280864e).inflate(R.layout.training, (ViewGroup) null, false);
        this.f280862c = frameLayout;
        mo28295iC(frameLayout);
        this.f280861b = (FrameLayout) this.f280862c.findViewById(R.id.webview_host);
        ((C100465a) this.f280863d).f280854b.mo28726b(new C100466b(this));
        ((C100465a) this.f280863d).f280853a.mo28726b(new C100467c(this));
        this.f280862c.findViewById(R.id.navigation_button).setOnClickListener(new C100468d(this));
        this.f280862c.findViewById(R.id.retry_button).setOnClickListener(new C100469e(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        if (this.f280865f.mo56113h()) {
            Window window = ((Activity) this.f280865f.mo56107c()).getWindow();
            if (!this.f280866g) {
                window.setStatusBarColor(-1);
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
            }
        }
    }
}
