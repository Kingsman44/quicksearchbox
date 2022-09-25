package com.google.android.apps.gsa.staticplugins.opa.p8183ag;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C89997bc;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C107130ap;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ag.g */
/* compiled from: PG */
public final class C106158g {

    /* renamed from: a */
    public static final C59071e f296266a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ag.g");

    /* renamed from: b */
    public final Activity f296267b;

    /* renamed from: c */
    public final C89911f f296268c;

    /* renamed from: d */
    public final C68214a f296269d;

    /* renamed from: e */
    public final C139921f f296270e;

    /* renamed from: f */
    public final C68214a f296271f;

    /* renamed from: g */
    public ImageView f296272g;

    /* renamed from: h */
    public C107130ap f296273h;

    /* renamed from: i */
    private final C86124t f296274i;

    /* renamed from: j */
    private final C22871g f296275j;

    /* renamed from: k */
    private final C22871g f296276k;

    /* renamed from: l */
    private ViewGroup f296277l;

    /* renamed from: m */
    private final C104149a f296278m;

    public C106158g(Activity activity, C89911f fVar, C86124t tVar, C104149a aVar, C68214a aVar2, C22871g gVar, C22871g gVar2, C139921f fVar2, C68214a aVar3) {
        this.f296267b = activity;
        this.f296268c = fVar;
        this.f296274i = tVar;
        this.f296278m = aVar;
        this.f296269d = aVar2;
        this.f296275j = gVar;
        this.f296276k = gVar2;
        this.f296270e = fVar2;
        this.f296271f = aVar3;
    }

    /* renamed from: a */
    public final ViewGroup mo95328a() {
        if (this.f296277l == null) {
            FrameLayout frameLayout = new FrameLayout(this.f296267b);
            this.f296277l = frameLayout;
            frameLayout.addView(mo95329b());
        }
        return this.f296277l;
    }

    /* renamed from: b */
    public final ImageView mo95329b() {
        if (this.f296272g == null) {
            this.f296272g = (ImageView) LayoutInflater.from(this.f296267b).inflate(true != this.f296274i.mo79746e(C90029ch.f248210X) ? R.layout.eyes_launcher : R.layout.eyes_launcher_v2, (ViewGroup) null);
            if (this.f296274i.mo79746e(C90014bt.f247760nI)) {
                Drawable drawable = this.f296267b.getDrawable(R.drawable.quantum_ic_google_lens_new_black_24);
                if (this.f296278m.mo93971b()) {
                    drawable.getClass();
                    C1929b.m5225f(drawable, C19391a.m36980a(this.f296267b, R.attr.search_plate_drawable_tint));
                } else {
                    drawable.getClass();
                    C1929b.m5225f(drawable, C1878d.m5128a(this.f296267b, R.color.google_lens_drawable_tint));
                }
                this.f296272g.setImageDrawable(drawable);
            }
            this.f296272g.setVisibility(8);
            C90873ag agVar = new C90873ag(C90877ak.m148471e(this.f296275j.mo28201a("check Lens capability", new C106153b(this)), this.f296274i.mo79743a(C89997bc.f246779B), TimeUnit.MILLISECONDS, this.f296275j), this.f296276k, "set launcher icon visibility based on Lens capability", new C106154c(this));
            agVar.mo85224b(TimeoutException.class, new C106155d(this));
            agVar.mo85223a(C106156e.f296264a);
        }
        return this.f296272g;
    }

    /* renamed from: c */
    public final void mo95330c(boolean z) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C107130ap apVar = this.f296273h;
        apVar.getClass();
        apVar.f298208a.mo97416D(new C106151a(this, elapsedRealtimeNanos, z));
    }
}
