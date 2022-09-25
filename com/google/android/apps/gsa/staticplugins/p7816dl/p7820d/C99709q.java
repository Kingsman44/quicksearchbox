package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99680e;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99683h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23204ai;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.q */
/* compiled from: PG */
public final class C99709q extends C22939d {

    /* renamed from: a */
    public final C99680e f279014a;

    /* renamed from: b */
    private final Context f279015b;

    /* renamed from: c */
    private final C99683h f279016c;

    /* renamed from: d */
    private final C90314b f279017d;

    /* renamed from: e */
    private C90315c f279018e;

    public C99709q(C22945j jVar, Context context, C99683h hVar, C99680e eVar, C90314b bVar) {
        super(jVar);
        this.f279015b = context;
        this.f279016c = hVar;
        this.f279014a = eVar;
        this.f279017d = bVar;
    }

    /* renamed from: im */
    public final void mo28298im() {
        this.f279017d.mo83995b(this.f279018e);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) LayoutInflater.from(this.f279015b).inflate(R.layout.pomo_tab, (ViewGroup) null, false);
        C99680e eVar = this.f279014a;
        Objects.requireNonNull(eVar);
        swipeRefreshLayout.f13508a = new C99704l(eVar);
        mo28295iC(swipeRefreshLayout);
        ((CoScrollContainer) swipeRefreshLayout.findViewById(R.id.pomo_tab_container)).mo84822r(new C99708p(this));
        View findViewById = swipeRefreshLayout.findViewById(R.id.empty_state_ui_container);
        ((C99712t) this.f279016c).f279036c.mo28657c(new C23204ai((ViewGroup) swipeRefreshLayout.findViewById(R.id.pomo_content_container)));
        ((C99712t) this.f279016c).f279034a.mo28726b(new C99705m(findViewById));
        C23251a aVar = ((C99712t) this.f279016c).f279035b;
        Objects.requireNonNull(swipeRefreshLayout);
        aVar.mo28726b(new C99706n(swipeRefreshLayout));
        this.f279018e = new C99707o(swipeRefreshLayout);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f279017d.mo83994a(this.f279018e);
    }
}
