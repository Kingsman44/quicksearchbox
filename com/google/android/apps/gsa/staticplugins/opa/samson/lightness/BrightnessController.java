package com.google.android.apps.gsa.staticplugins.opa.samson.lightness;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class BrightnessController implements C2333ah, C2376g {

    /* renamed from: a */
    public static final C59071e f307232a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.lightness.BrightnessController");

    /* renamed from: b */
    public static final long f307233b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public final BoundBrightnessSensorListener f307234c;

    /* renamed from: d */
    public final C22871g f307235d;

    /* renamed from: e */
    public boolean f307236e;

    /* renamed from: f */
    public boolean f307237f;

    /* renamed from: g */
    public C60870cx f307238g;

    /* renamed from: h */
    private final C110253e f307239h;

    /* renamed from: i */
    private final Activity f307240i;

    /* renamed from: j */
    private final C110252d f307241j;

    /* renamed from: k */
    private int f307242k;

    /* renamed from: l */
    private final List f307243l;

    /* renamed from: m */
    private final List f307244m;

    public BrightnessController(Activity activity, C86124t tVar, BoundBrightnessSensorListener boundBrightnessSensorListener, C110253e eVar, C22871g gVar, C110252d dVar) {
        this.f307240i = activity;
        this.f307234c = boundBrightnessSensorListener;
        this.f307239h = eVar;
        this.f307235d = gVar;
        this.f307241j = dVar;
        this.f307243l = tVar.mo79749o(C90014bt.f247103ao);
        this.f307244m = tVar.mo79749o(C90014bt.f247096ah);
    }

    /* renamed from: i */
    private final void m183583i(int i) {
        Window window = this.f307240i.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = ((float) i) / 255.0f;
        window.setAttributes(attributes);
    }

    /* renamed from: j */
    private final void m183584j() {
        int i = this.f307242k;
        int i2 = -1;
        int intValue = (i < 0 || i >= this.f307244m.size()) ? -1 : ((Integer) this.f307244m.get(i)).intValue();
        if (intValue > 0) {
            m183583i(intValue);
            int i3 = this.f307242k;
            if (i3 >= 0 && i3 < this.f307243l.size()) {
                i2 = ((Integer) this.f307243l.get(i3)).intValue();
            }
            if (i2 >= 0) {
                this.f307241j.mo98308y(1.0f - (((float) i2) / 255.0f));
            }
        }
    }

    /* renamed from: g */
    public final void mo98494g(boolean z) {
        if (this.f307237f != z) {
            C59104x b = f307232a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BrightCont");
            ((C59052c) ((C59052c) b).mo56372aa(25752)).mo56389s("apply AOD brightness: %b", Boolean.valueOf(z));
            this.f307237f = z;
            if (z) {
                m183584j();
            } else {
                m183583i(-1);
            }
        }
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        this.f307239h.mo5679j(this);
        C59104x b = f307232a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BrightCont");
        ((C59052c) ((C59052c) b).mo56372aa(25753)).mo56386p("disable AOD brightness mechanism");
        this.f307236e = false;
        mo98495h();
        mo98494g(false);
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        C59104x b = f307232a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BrightCont");
        ((C59052c) ((C59052c) b).mo56372aa(25754)).mo56386p("enable AOD brightness mechanism");
        this.f307236e = true;
        mo98495h();
        this.f307238g = this.f307235d.mo28208h("APPLY_AOD_BRIGHTNESS_MODE_TIMEOUT", f307233b, new C110251c(this));
        this.f307239h.mo5705f(this);
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: h */
    public final void mo98495h() {
        C60870cx cxVar = this.f307238g;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        Integer num = (Integer) obj;
        if (num != null && this.f307242k != num.intValue()) {
            this.f307242k = num.intValue();
            C59104x b = f307232a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BrightCont");
            ((C59052c) ((C59052c) b).mo56372aa(25756)).mo56387q("sensorBrightnessValue = %d", this.f307242k);
            if (this.f307237f) {
                m183584j();
            }
        }
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
