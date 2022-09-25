package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99676a;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99677b;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99679d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.p1859d.p1860a.C22746q;
import com.google.android.libraries.gsa.p1859d.p1860a.C22747r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.j */
/* compiled from: PG */
public final class C99702j extends C22939d {

    /* renamed from: a */
    public final Context f278993a;

    /* renamed from: b */
    public final C99679d f278994b;

    /* renamed from: c */
    public final C22746q f278995c;

    /* renamed from: d */
    public final C99676a f278996d;

    /* renamed from: e */
    public C58833ax f278997e = C58836b.f156633a;

    /* renamed from: f */
    public String f278998f;

    /* renamed from: g */
    public int f278999g;

    /* renamed from: h */
    public int f279000h = 0;

    /* renamed from: i */
    public int f279001i = 0;

    /* renamed from: j */
    public ViewGroup f279002j;

    /* renamed from: k */
    public View f279003k;

    /* renamed from: l */
    public C22747r f279004l;

    /* renamed from: m */
    private FrameLayout f279005m;

    /* renamed from: n */
    private int f279006n;

    public C99702j(C22945j jVar, Context context, C99679d dVar, C99676a aVar, C22746q qVar) {
        super(jVar);
        this.f278993a = context;
        this.f278994b = dVar;
        this.f278995c = qVar;
        this.f278996d = aVar;
    }

    /* renamed from: e */
    public final void mo91572e() {
        int[] iArr = new int[2];
        this.f279005m.getLocationOnScreen(iArr);
        boolean z = true;
        int i = iArr[1];
        int measuredHeight = this.f279005m.getMeasuredHeight() + i;
        int intValue = ((Integer) ((C99711s) this.f278994b).f279031k.f63720e).intValue();
        if (i == measuredHeight || i >= this.f279006n || measuredHeight <= intValue) {
            z = false;
        }
        C99676a aVar = this.f278996d;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isShownInViewport", Boolean.valueOf(z).booleanValue());
        ((C99677b) aVar).f278953a.mo28345s("onViewVisibilityFetched_boolean", "PartnerTabContentHostEventsDispatcher", bundle);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f278993a).inflate(R.layout.partner_tab_content_host, (ViewGroup) null, false);
        this.f279005m = frameLayout;
        mo28295iC(frameLayout);
        this.f279002j = (ViewGroup) this.f279005m.findViewById(R.id.remoteviews_container);
        this.f279003k = this.f279005m.findViewById(R.id.video_stub);
        ((C99711s) this.f278994b).f279029i.mo28685c(new C23243a(R.id.video_stub, this.f279005m));
        ((C99711s) this.f278994b).f279028h.mo28726b(new C99690a(this));
        ((C99711s) this.f278994b).f279021a.mo28726b(new C99694b(this));
        ((C99711s) this.f278994b).f279030j.mo28726b(new C99695c(this));
        ((C99711s) this.f278994b).f279026f.mo28726b(new C99696d(this));
        ((C99711s) this.f278994b).f279025e.mo28726b(new C99697e(this));
        ((C99711s) this.f278994b).f279027g.mo28726b(new C99698f(this));
        ((C99711s) this.f278994b).f279023c.mo28726b(new C99699g(this));
        ((C99711s) this.f278994b).f279022b.mo28726b(new C99700h(this));
        this.f279006n = Resources.getSystem().getDisplayMetrics().heightPixels;
    }
}
