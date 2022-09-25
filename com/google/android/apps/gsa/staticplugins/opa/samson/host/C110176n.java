package com.google.android.apps.gsa.staticplugins.opa.samson.host;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.host.n */
/* compiled from: PG */
public final class C110176n {

    /* renamed from: a */
    public static final C59071e f306995a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.host.n");

    /* renamed from: b */
    public final Context f306996b;

    /* renamed from: c */
    final Handler f306997c;

    /* renamed from: d */
    public final View f306998d;

    /* renamed from: e */
    public final ViewGroup f306999e;

    /* renamed from: f */
    public final ImageView f307000f;

    /* renamed from: g */
    public final LayoutInflater f307001g;

    /* renamed from: h */
    public final C110175m f307002h;

    /* renamed from: i */
    final Runnable f307003i;

    /* renamed from: j */
    public byte[] f307004j;

    /* renamed from: k */
    public final C110168f f307005k;

    /* renamed from: l */
    public volatile boolean f307006l = false;

    public C110176n(Context context, Runnable runnable, C110168f fVar) {
        this.f306996b = context;
        this.f306997c = new Handler(Looper.getMainLooper());
        this.f307003i = runnable;
        this.f307005k = fVar;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f307001g = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.ambient_content_area, new FrameLayout(context), false);
        this.f306998d = inflate;
        this.f306999e = (ViewGroup) inflate.findViewById(R.id.ambient_assistant_area);
        this.f307000f = (ImageView) inflate.findViewById(R.id.voice_plate_entry);
        this.f307002h = new C110175m(this);
        inflate.addOnAttachStateChangeListener(new C110172j(this));
    }

    /* renamed from: b */
    public static final void m183476b(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            C59104x d = f306995a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmbConViewCtrl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(25732)).mo56386p("PendingIntent cancelled");
        } catch (RuntimeException e2) {
            C59104x c = f306995a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AmbConViewCtrl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(25733)).mo56386p("Error while using PendingIntent");
        }
    }

    /* renamed from: a */
    public final void mo98452a() {
        if (this.f307006l) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C110168f fVar = this.f307005k;
        C110174l lVar = new C110174l(this);
        C58976aa aaVar2 = C58975e.f156826a;
        fVar.mo98444b(new C110165c(fVar.f306985a, lVar, new C110163a(fVar)));
    }
}
