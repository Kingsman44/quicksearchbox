package com.google.android.libraries.lens.view.gleam;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p033v7.app.C0395p;
import android.util.Size;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25976a;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2074ap.C25464d;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.gleam.ff */
/* compiled from: PG */
public final class C26586ff {

    /* renamed from: a */
    public final C25989d f72474a;

    /* renamed from: b */
    public Size f72475b = new Size(0, 0);

    /* renamed from: c */
    public C25497ac f72476c = C25497ac.NONE;

    /* renamed from: d */
    public boolean f72477d = false;

    /* renamed from: e */
    public final C25758g f72478e;

    /* renamed from: f */
    public final C25758g f72479f;

    /* renamed from: g */
    private final Activity f72480g;

    /* renamed from: h */
    private final C27232l f72481h;

    /* renamed from: i */
    private final C24974a f72482i;

    /* renamed from: j */
    private final C25466f f72483j;

    /* renamed from: k */
    private final C25976a f72484k;

    /* renamed from: l */
    private final C26244b f72485l;

    /* renamed from: m */
    private final int f72486m;

    public C26586ff(Activity activity, C27232l lVar, C24974a aVar, C25466f fVar, C25989d dVar, C25976a aVar2, C26244b bVar) {
        C26600i iVar = new C26600i();
        iVar.f72526a = new RectF();
        iVar.mo31844b(false);
        iVar.mo31845c(false);
        this.f72478e = new C25758g(iVar.mo31843a());
        this.f72479f = new C25758g(C58836b.f156633a);
        this.f72480g = activity;
        this.f72481h = lVar;
        this.f72482i = aVar;
        this.f72483j = fVar;
        this.f72474a = dVar;
        this.f72484k = aVar2;
        this.f72485l = bVar;
        this.f72486m = m49083f(R.dimen.min_reticle_size);
        if (activity instanceof C0395p) {
            fVar.f69401a.mo5704e((C0395p) activity, new C26584fd(this));
        }
    }

    /* renamed from: f */
    private final int m49083f(int i) {
        return this.f72480g.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: g */
    private final boolean m49084g() {
        return this.f72480g.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: a */
    public final Rect mo31849a(Size size) {
        int i = 0;
        Rect rect = new Rect(0, ((C25464d) this.f72483j.f69401a.mo3842a()).mo30499a(), size.getWidth(), size.getHeight());
        int f = m49083f(R.dimen.shutter_button_outer_ring_size) + m49083f(R.dimen.filter_carousel_top_margin);
        if (!C62632i.m94823h(this.f72481h.mo32701h())) {
            i = m49083f(R.dimen.filter_carousel_height_with_borders);
        }
        if (C24974a.m46225a(this.f72482i.f68122a) || !m49084g()) {
            rect.top += m49083f(R.dimen.lens_overlay_buttons_height);
            rect.bottom -= i + f;
        } else {
            rect.bottom -= i;
            rect.left += f;
            rect.right -= f;
        }
        return rect;
    }

    /* renamed from: b */
    public final RectF mo31850b(Rect rect, C25980d dVar) {
        C26585fe feVar;
        if ((C24974a.m46225a(this.f72482i.f68122a) || !m49084g()) && (!dVar.equals(C25980d.EDUCATION) || (this.f72485l.mo31462g(C26239a.EDUCATION_SELECTION_STATE_ENABLED) && this.f72485l.mo31462g(C26239a.SELECTION_STATE_ENABLED)))) {
            feVar = C26585fe.SQUARE;
        } else {
            feVar = C26585fe.WIDE;
        }
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        float width = ((float) rect.width()) * feVar.f72471c;
        float f = (float) m49083f(feVar.f72473e);
        if (width > f) {
            width = f;
        }
        float f2 = width * 0.5f;
        float f3 = width * feVar.f72472d * 0.5f;
        float f4 = (float) centerX;
        float f5 = (float) centerY;
        return new RectF(f4 - f2, f5 - f3, f4 + f2, f5 + f3);
    }

    /* renamed from: c */
    public final RectF mo31851c() {
        RectF a = ((C26583fc) this.f72478e.mo3842a()).mo31846a();
        return new RectF(a.left / ((float) this.f72475b.getWidth()), a.top / ((float) this.f72475b.getHeight()), a.right / ((float) this.f72475b.getWidth()), a.bottom / ((float) this.f72475b.getHeight()));
    }

    /* renamed from: d */
    public final void mo31852d(C58833ax axVar) {
        if (!((C58833ax) this.f72479f.mo3842a()).equals(axVar)) {
            this.f72479f.mo5708l(axVar);
        }
    }

    /* renamed from: e */
    public final void mo31853e() {
        if (this.f72475b.getWidth() != 0 && this.f72475b.getHeight() != 0) {
            C25980d dVar = this.f72474a.f70642a.f70649b;
            RectF b = mo31850b(mo31849a(this.f72475b), dVar);
            boolean z = true;
            boolean z2 = !this.f72477d && this.f72474a.mo31203a().mo31195l() && !this.f72484k.mo31167a(dVar, this.f72476c) && this.f72476c.mo30526c() && b.width() >= ((float) this.f72486m) && b.height() >= ((float) this.f72486m);
            if (!z2 || dVar == C25980d.EDUCATION) {
                z = false;
            }
            C26600i iVar = new C26600i();
            iVar.f72526a = b;
            iVar.mo31844b(z2);
            iVar.mo31845c(z);
            C26583fc a = iVar.mo31843a();
            if (!a.equals(this.f72478e.mo3842a())) {
                C25758g gVar = this.f72478e;
                a.getClass();
                gVar.mo5708l(a);
            }
        }
    }
}
