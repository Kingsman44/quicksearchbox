package com.google.android.apps.gsa.nowoverlayservice;

import android.app.Service;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1859d.p1861b.C22755ae;
import com.google.android.libraries.gsa.p1859d.p1861b.C22756b;
import com.google.android.libraries.gsa.p1859d.p1861b.C22768n;
import com.google.android.libraries.gsa.p1859d.p1861b.C22776v;
import com.google.android.libraries.gsa.p1859d.p1861b.p1862a.C22750a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.aj */
/* compiled from: PG */
public final class C83435aj extends C22776v implements C83480bn {

    /* renamed from: d */
    private final Context f227409d;

    /* renamed from: e */
    private final C83439an f227410e;

    /* renamed from: f */
    private final C68214a f227411f;

    /* renamed from: g */
    private final C83479bm f227412g;

    /* renamed from: h */
    private final C118827a f227413h;

    /* renamed from: i */
    private final C83517d f227414i;

    /* renamed from: j */
    private final C58881cr f227415j;

    /* renamed from: k */
    private final C58881cr f227416k;

    /* renamed from: l */
    private final C58881cr f227417l;

    /* renamed from: m */
    private final C58881cr f227418m;

    /* renamed from: n */
    private final C58881cr f227419n;

    /* renamed from: o */
    private final C58881cr f227420o;

    /* renamed from: p */
    private final long f227421p;

    /* renamed from: q */
    private final boolean f227422q;

    public C83435aj(Service service, C83439an anVar, C68214a aVar, C83479bm bmVar, C22750a aVar2, C118827a aVar3, C91142g gVar) {
        super(service, aVar2);
        this.f227409d = service;
        this.f227410e = anVar;
        this.f227411f = aVar;
        this.f227412g = bmVar;
        this.f227413h = aVar3;
        this.f227414i = new C83517d(aVar3);
        this.f227415j = C58886cw.m90973a(new C83429ad(aVar3));
        this.f227416k = C58886cw.m90973a(new C83430ae(aVar3));
        this.f227417l = C58886cw.m90973a(new C83431af(aVar3));
        this.f227418m = C58886cw.m90973a(new C83432ag(aVar3));
        this.f227419n = C58886cw.m90973a(new C83433ah(aVar3));
        this.f227420o = C58886cw.m90973a(new C83434ai(aVar3));
        this.f227421p = gVar.mo85399d(C90138q.f251841o);
        this.f227422q = gVar.mo85405j(C90138q.f251831e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo28094a() {
        return 24;
    }

    /* renamed from: b */
    public final Configuration mo28095b(Configuration configuration, Bundle bundle) {
        if (bundle.containsKey("is_background_dark")) {
            if (configuration == null) {
                configuration = new Configuration(this.f227409d.getResources().getConfiguration());
            }
            configuration.uiMode = (true != bundle.getBoolean("is_background_dark", false) ? 16 : 32) | (configuration.uiMode & -49);
        }
        return configuration;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C22756b mo28096c() {
        C83479bm bmVar = this.f227412g;
        Context context = this.f227409d;
        context.getClass();
        C87677ae aeVar = (C87677ae) bmVar.f227620a.mo17428b();
        aeVar.getClass();
        return new C83478bl(context, aeVar);
    }

    /* renamed from: d */
    public final C22768n mo28097d(Configuration configuration, int i, int i2, boolean z, Bundle bundle, String str) {
        Context context = this.f227409d;
        if (configuration != null) {
            context = context.createConfigurationContext(configuration);
        }
        return new C83553y(context, i, i2, z, bundle, str, this.f227413h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ C22755ae mo28098e() {
        return this.f227410e;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo76770f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo28099g() {
        ((C118831d) this.f227420o.mo6453a()).mo104025g(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo28100h() {
        ((C118831d) this.f227418m.mo6453a()).mo104025g(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo28101i(Bundle bundle) {
        if (this.f227422q) {
            bundle.putParcelable("minus_one_thumbnail_image_960_540", Icon.createWithResource(this.f227409d, true != C90962a.m148577a(this.f227409d) ? R.drawable.minus_one_thumbnail_light_mode : R.drawable.minus_one_thumbnail_dark_mode));
            bundle.putString("minus_one_product_name", this.f227409d.getString(R.string.minus_one_product_name));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo28102j(Bundle bundle) {
        Bitmap bitmap = (Bitmap) bundle.getParcelable("partner_overlay_icon");
        if (bitmap != null) {
            ((C118831d) this.f227416k.mo6453a()).mo104025g((long) bitmap.getWidth());
            ((C118831d) this.f227415j.mo6453a()).mo104025g((long) bitmap.getHeight());
            if (((long) bitmap.getByteCount()) > this.f227421p) {
                ((C118831d) this.f227417l.mo6453a()).mo104025g(1);
                bundle.remove("partner_overlay_icon");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo28103k() {
        ((C118831d) this.f227419n.mo6453a()).mo104025g(1);
        boolean N = ((C85651bb) this.f227411f.mo27525b()).mo79141N();
        C58976aa aaVar = C58975e.f156826a;
        return N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo28104l(Configuration configuration) {
        C83517d dVar = this.f227414i;
        Context context = this.f227409d;
        if (configuration != null) {
            Display display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
            if (display == null) {
                ((C59052c) ((C59052c) C83517d.f227703a.mo56226d()).mo56372aa(6682)).mo56387q("Could not find display with ID: %d", 0);
                return;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            if ((configuration.orientation != 1 || displayMetrics.widthPixels <= displayMetrics.heightPixels) && (configuration.orientation != 2 || displayMetrics.heightPixels <= displayMetrics.widthPixels)) {
                ((C118831d) dVar.f227704b.mo6453a()).mo104025g(0);
                return;
            }
            ((C59052c) ((C59052c) C83517d.f227703a.mo56226d()).mo56372aa(6679)).mo56354G("Detected orientation mismatch: %s config: %s", displayMetrics, configuration);
            ((C118831d) dVar.f227704b.mo6453a()).mo104025g(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo28105m() {
        return true;
    }
}
