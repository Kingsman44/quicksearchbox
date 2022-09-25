package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14322ey;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14330ff;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15188ay;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.bw */
/* compiled from: PG */
public final class C15041bw implements C15006ao {

    /* renamed from: a */
    public ViewGroup f45110a;

    /* renamed from: b */
    public RecyclerView f45111b;

    /* renamed from: c */
    public ViewGroup f45112c;

    /* renamed from: d */
    public ProgressBar f45113d;

    /* renamed from: e */
    public C14322ey f45114e;

    /* renamed from: f */
    public final C15188ay f45115f;

    /* renamed from: g */
    public final C14986h f45116g;

    /* renamed from: h */
    private final C69464a f45117h;

    /* renamed from: i */
    private final C14132bf f45118i;

    /* renamed from: j */
    private final C15352z f45119j;

    /* renamed from: k */
    private final C15346t f45120k;

    /* renamed from: l */
    private final C86124t f45121l;

    public C15041bw(C15188ay ayVar, C15352z zVar, C69464a aVar, C14986h hVar, C14132bf bfVar, C15346t tVar, C86124t tVar2) {
        this.f45115f = ayVar;
        this.f45119j = zVar;
        this.f45117h = aVar;
        this.f45118i = bfVar;
        this.f45120k = tVar;
        this.f45116g = hVar;
        this.f45121l = tVar2;
    }

    /* renamed from: a */
    public final View mo21891a() {
        ViewGroup viewGroup = this.f45110a;
        viewGroup.getClass();
        return viewGroup;
    }

    /* renamed from: b */
    public final void mo21912b(C14322ey eyVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper, boolean z) {
        if (this.f45110a == null) {
            if (viewGroup.findViewById(R.id.media_pivot_fullscreen_root_view) != null) {
                viewGroup.removeView(viewGroup.findViewById(R.id.media_pivot_fullscreen_root_view));
            }
            LayoutInflater.from(contextThemeWrapper).inflate(R.layout.media_pivot_fullscreen, viewGroup, true);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.media_pivot_fullscreen_root_view);
            this.f45110a = viewGroup2;
            viewGroup2.getClass();
            viewGroup2.setPadding(0, ((Integer) this.f45117h.mo17428b()).intValue(), 0, 0);
            ViewGroup viewGroup3 = this.f45110a;
            viewGroup3.getClass();
            RecyclerView recyclerView = (RecyclerView) viewGroup3.findViewById(R.id.media_pivot_items_recycler_view);
            this.f45111b = recyclerView;
            recyclerView.getClass();
            recyclerView.setLayoutManager(new LinearLayoutManager(contextThemeWrapper));
            ViewGroup viewGroup4 = this.f45110a;
            viewGroup4.getClass();
            ((TextView) viewGroup4.findViewById(R.id.header_text)).setText(R.string.media_pivot_header_text);
            ViewGroup viewGroup5 = this.f45110a;
            viewGroup5.getClass();
            this.f45112c = (ViewGroup) viewGroup5.findViewById(R.id.media_browse_miniplayer_container);
            ViewGroup viewGroup6 = this.f45110a;
            viewGroup6.getClass();
            this.f45113d = (ProgressBar) viewGroup6.findViewById(R.id.media_initiation_progressbar);
            RecyclerView recyclerView2 = this.f45111b;
            recyclerView2.getClass();
            ViewGroup viewGroup7 = this.f45110a;
            viewGroup7.getClass();
            recyclerView2.addOnScrollListener(new C15040bv(viewGroup7.findViewById(R.id.scrolling_shadow)));
            C14144n nVar = new C14144n(contextThemeWrapper, this.f45118i, new C15039bu(this));
            ViewGroup viewGroup8 = this.f45110a;
            viewGroup8.getClass();
            viewGroup8.setOnTouchListener(nVar);
            if (this.f45121l.mo79746e(C90051dc.f248792a)) {
                RecyclerView recyclerView3 = this.f45111b;
                recyclerView3.getClass();
                recyclerView3.setOnTouchListener(nVar);
            }
            if (z) {
                ViewGroup viewGroup9 = this.f45110a;
                viewGroup9.getClass();
                viewGroup9.startAnimation(C15352z.m31954f(contextThemeWrapper, viewGroup));
            }
        }
        C14322ey eyVar2 = this.f45114e;
        if (eyVar2 == null || !eyVar2.f43326c.equals(eyVar.f43326c)) {
            RecyclerView recyclerView4 = this.f45111b;
            recyclerView4.getClass();
            recyclerView4.setAdapter(new C15038bt(contextThemeWrapper, this.f45119j, 4, eyVar.f43326c, this.f45116g, this.f45118i, this.f45120k));
        }
        ProgressBar progressBar = this.f45113d;
        progressBar.getClass();
        int b = C14330ff.m30608b(eyVar.f43328e);
        progressBar.setVisibility((b != 0 && b == 3) ? 0 : 8);
        if (eyVar.f43327d != null) {
            ViewGroup viewGroup10 = this.f45112c;
            viewGroup10.getClass();
            viewGroup10.setVisibility(0);
            C15188ay ayVar = this.f45115f;
            C14572oe oeVar = eyVar.f43327d;
            if (oeVar == null) {
                oeVar = C14572oe.f44055i;
            }
            ViewGroup viewGroup11 = this.f45112c;
            viewGroup11.getClass();
            ayVar.mo22065a(oeVar, viewGroup11, contextThemeWrapper);
        } else {
            ViewGroup viewGroup12 = this.f45112c;
            viewGroup12.getClass();
            viewGroup12.setVisibility(8);
            ViewGroup viewGroup13 = this.f45112c;
            viewGroup13.getClass();
            viewGroup13.removeAllViews();
            this.f45115f.mo22066b();
        }
        this.f45114e = eyVar;
    }
}
