package com.google.android.apps.gsa.staticplugins.p7960g.p7963c;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.assist.p507f.p508a.C9413b;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import com.google.android.apps.gsa.shared.util.p7187ui.C91104c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.c.f */
/* compiled from: PG */
public final class C101285f extends C19600b {

    /* renamed from: a */
    public static final C59071e f282677a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.g.c.f");

    /* renamed from: b */
    public final C90929bz f282678b;

    /* renamed from: c */
    public ImageView f282679c;

    /* renamed from: d */
    public ImageView f282680d;

    /* renamed from: e */
    C90945k f282681e;

    /* renamed from: f */
    C101284e f282682f = null;

    /* renamed from: g */
    public Uri f282683g;

    /* renamed from: h */
    public final C9413b f282684h;

    /* renamed from: i */
    public int f282685i;

    /* renamed from: j */
    public int f282686j;

    /* renamed from: l */
    private ProgressBar f282687l;

    /* renamed from: m */
    private ViewPropertyAnimator f282688m;

    /* renamed from: n */
    private final C89859i f282689n;

    /* renamed from: o */
    private boolean f282690o;

    /* renamed from: p */
    private int f282691p;

    public C101285f(C90929bz bzVar, C9413b bVar, C89859i iVar) {
        this.f282678b = bzVar;
        this.f282684h = bVar;
        this.f282689n = iVar;
        this.f282691p = 1;
    }

    /* renamed from: a */
    public final void mo92219a(C89849ae aeVar) {
        int i;
        this.f282689n.mo83702b(aeVar);
        C89849ae aeVar2 = C89849ae.UNKNOWN_EVENT;
        switch (aeVar.ordinal()) {
            case 2326:
                i = 2;
                break;
            case 2328:
            case 2329:
            case 2330:
                i = 3;
                break;
            default:
                return;
        }
        this.f282691p = i;
    }

    /* renamed from: b */
    public final void mo24895b(Bundle bundle) {
        C74504a.m120462a(f.bb);
        mo24912u(0);
        mo24913v();
        try {
            this.f54539k.setRequestedOrientation(14);
        } catch (IllegalStateException unused) {
            Log.w("DynamicActivity", "setRequestedOrientation: Unable to setRequestedOrientation.");
        }
        this.f54539k.setContentView(R.layout.screenshot_share_activity);
        this.f54539k.mo24861h(bundle);
        this.f54539k.getWindow().getDecorView().setSystemUiVisibility(768);
        this.f282690o = false;
    }

    /* renamed from: d */
    public final void mo24897d() {
        Display display;
        this.f54539k.mo24866m();
        C59071e eVar = f282677a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(13862)).mo56386p("#onStart");
        Intent b = this.f54539k.mo24853b();
        if (b != null && b.hasExtra("extra_screenshot_saved_uri")) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(13863)).mo56386p("activity has been started before, quit");
            this.f54539k.mo24855e();
        } else if (!this.f282690o) {
            this.f282679c = (ImageView) this.f54539k.mo24854d(R.id.background_image);
            this.f282680d = (ImageView) this.f54539k.mo24854d(R.id.foreground_image);
            View d = this.f54539k.mo24854d(R.id.shade);
            ProgressBar progressBar = (ProgressBar) this.f54539k.mo24854d(R.id.scrim_spinner);
            this.f282687l = progressBar;
            this.f282688m = C91104c.m148853b(progressBar);
            if (Build.VERSION.SDK_INT >= 30) {
                display = this.f54539k.getDisplay();
            } else {
                display = ((WindowManager) this.f54539k.getSystemService("window")).getDefaultDisplay();
            }
            Point point = new Point();
            if (display != null) {
                display.getSize(point);
            }
            this.f282685i = point.x;
            this.f282686j = point.y;
            mo92219a(C89849ae.SHARE_SCREENSHOT_STARTED);
            if (this.f282682f == null) {
                this.f282682f = new C101284e(this, this.f282678b, this.f54539k);
            }
            this.f282682f.mo85242e(new Void[0]);
            ObjectAnimator.ofArgb(d, "backgroundColor", new int[]{-1, this.f54539k.getResources().getColor(R.color.screen_assist_search_scrim)}).setDuration(400).start();
            this.f282687l.setVisibility(0);
            this.f282688m.alpha(1.0f).setStartDelay(800).setDuration(400).start();
            this.f282690o = true;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(13860)).mo56386p("initialized");
        }
    }

    /* renamed from: e */
    public final void mo24898e(int i, int i2, Intent intent) {
        if (i == 0) {
            this.f54539k.mo24855e();
        }
    }

    /* renamed from: f */
    public final void mo24899f() {
        this.f54539k.mo24858g();
        this.f54539k.mo24855e();
    }

    /* renamed from: g */
    public final void mo24900g() {
        ((C59052c) ((C59052c) f282677a.mo56224b()).mo56372aa(13861)).mo56386p("#onDestroy");
        C90945k kVar = this.f282681e;
        if (kVar != null) {
            kVar.mo85241d(false);
        }
        C101284e eVar = this.f282682f;
        if (eVar != null) {
            eVar.mo85241d(true);
        }
        this.f282684h.f32704b = false;
        if (this.f282691p == 2) {
            mo92219a(C89849ae.SHARE_SCREENSHOT_CANCELLED);
        }
        this.f54539k.mo24862i();
    }

    /* renamed from: h */
    public final void mo92220h(boolean z) {
        this.f282680d.setVisibility(0);
        this.f282679c.setVisibility(0);
        C91104c.m148853b(this.f282680d).setDuration(400).alpha(1.0f).withStartAction(new C101282c(this, z)).start();
        C91104c.m148853b(this.f282679c).setDuration(400).alpha(1.0f).start();
    }

    /* renamed from: i */
    public final void mo92221i() {
        this.f282688m.cancel();
        this.f282687l.setVisibility(8);
    }
}
