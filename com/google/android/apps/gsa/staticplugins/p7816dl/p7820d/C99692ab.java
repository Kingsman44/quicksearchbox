package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90135n;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99684i;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99688m;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99689n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.ab */
/* compiled from: PG */
public final class C99692ab extends C22939d {

    /* renamed from: a */
    public final Context f278968a;

    /* renamed from: b */
    public final Resources f278969b;

    /* renamed from: c */
    public final C99684i f278970c;

    /* renamed from: d */
    public final C91142g f278971d;

    /* renamed from: e */
    public FrameLayout f278972e;

    /* renamed from: f */
    public final C99689n f278973f;

    /* renamed from: g */
    public View f278974g;

    /* renamed from: h */
    public RadioGroup f278975h;

    /* renamed from: i */
    public RadioButton f278976i;

    /* renamed from: j */
    public RadioButton f278977j;

    /* renamed from: k */
    public View f278978k;

    /* renamed from: l */
    public View f278979l;

    /* renamed from: m */
    public boolean f278980m;

    /* renamed from: n */
    private boolean f278981n = false;

    public C99692ab(C22945j jVar, Context context, C99684i iVar, C99689n nVar, C91142g gVar) {
        super(jVar);
        this.f278968a = context;
        this.f278970c = iVar;
        this.f278973f = nVar;
        this.f278969b = context.getResources();
        this.f278971d = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo91570e(C58833ax axVar) {
        if (axVar.mo56113h() && this.f278977j != null && !this.f278981n) {
            Bitmap bitmap = (Bitmap) axVar.mo56107c();
            int dimensionPixelSize = this.f278969b.getDimensionPixelSize(R.dimen.google_logo_height);
            int width = (bitmap.getWidth() * dimensionPixelSize) / bitmap.getHeight();
            LayerDrawable layerDrawable = (LayerDrawable) this.f278968a.getDrawable(R.drawable.logo_pomo);
            LayerDrawable layerDrawable2 = (LayerDrawable) this.f278968a.getDrawable(R.drawable.logo_pomo_selected);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f278969b, bitmap);
            bitmapDrawable.setTint(this.f278968a.getColor(R.color.logo_unselected_color));
            layerDrawable.mutate();
            layerDrawable.addLayer(bitmapDrawable);
            layerDrawable.setLayerSize(1, width, dimensionPixelSize);
            layerDrawable.setLayerGravity(1, 17);
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.f278969b, bitmap);
            layerDrawable2.mutate();
            layerDrawable2.addLayer(bitmapDrawable2);
            layerDrawable2.setLayerSize(2, width, dimensionPixelSize);
            layerDrawable2.setLayerGravity(2, 17);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842912}, layerDrawable2);
            stateListDrawable.addState(new int[0], layerDrawable);
            RadioButton radioButton = this.f278977j;
            radioButton.getClass();
            radioButton.setBackground(stateListDrawable);
            this.f278981n = true;
        }
    }

    /* renamed from: g */
    public final void mo91571g(C58833ax axVar) {
        this.f278980m = true;
        if (this.f278975h != null && axVar.mo56113h()) {
            if (C58833ax.m90834k(C99688m.GOOGLE_TAB).equals(axVar)) {
                RadioButton radioButton = this.f278976i;
                radioButton.getClass();
                radioButton.setChecked(true);
            } else {
                RadioButton radioButton2 = this.f278977j;
                radioButton2.getClass();
                radioButton2.setChecked(true);
            }
        }
        this.f278980m = false;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f278968a).inflate(R.layout.shared_minus_one, (ViewGroup) null, false);
        this.f278972e = frameLayout;
        mo28295iC(frameLayout);
        if (this.f278971d.mo85405j(C90135n.f251817c)) {
            C28295m.m52919e(this.f278972e, new C28292j(50530));
            C89949q.m146521e(C28285c.m52874a(this.f278972e, 85242), false);
        }
        ((C99713u) this.f278973f).f279040b.mo28726b(new C99714v(this));
        ((C99713u) this.f278973f).f279041c.mo28685c(new C23243a(R.id.momo_stub, this.f278972e));
        ((C99713u) this.f278973f).f279042d.mo28685c(new C23243a(R.id.pomo_stub, this.f278972e));
        ((C99713u) this.f278973f).f279044f.mo28726b(new C99715w(this));
        ((C99713u) this.f278973f).f279043e.mo28726b(new C99716x(this));
        ((C99713u) this.f278973f).f279039a.mo28726b(new C99717y(this));
        this.f278972e.findViewById(R.id.retry_button).setOnClickListener(new C99718z(this));
        this.f278974g = this.f278972e.findViewById(R.id.tabs_stub);
        this.f278978k = this.f278972e.findViewById(R.id.momo_stub);
        this.f278979l = this.f278972e.findViewById(R.id.pomo_stub);
    }
}
