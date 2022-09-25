package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.apps.gsa.shared.monet.C90165af;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90246a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7092k.C90250a;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90326d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90327e;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105427a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23219p;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23301q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.an */
/* compiled from: PG */
public abstract class C105486an extends C22939d implements C90250a, C23301q {

    /* renamed from: A */
    private Drawable f294230A;

    /* renamed from: B */
    private int f294231B;

    /* renamed from: C */
    private C90315c f294232C;

    /* renamed from: D */
    private boolean f294233D;

    /* renamed from: a */
    public final C105427a f294234a;

    /* renamed from: b */
    protected final Context f294235b;

    /* renamed from: c */
    protected final C90165af f294236c;

    /* renamed from: d */
    public final boolean f294237d;

    /* renamed from: e */
    protected LinearLayout f294238e;

    /* renamed from: f */
    protected ImageView f294239f;

    /* renamed from: g */
    protected TextView f294240g;

    /* renamed from: h */
    protected View f294241h;

    /* renamed from: i */
    protected ViewGroup f294242i;

    /* renamed from: j */
    protected ViewGroup f294243j;

    /* renamed from: k */
    protected boolean f294244k;

    /* renamed from: l */
    protected Rect f294245l = new Rect();

    /* renamed from: m */
    public boolean f294246m;

    /* renamed from: n */
    public boolean f294247n;

    /* renamed from: o */
    protected C90246a f294248o;

    /* renamed from: p */
    protected View f294249p;

    /* renamed from: q */
    protected boolean f294250q;

    /* renamed from: r */
    public ChildStub f294251r;

    /* renamed from: s */
    public boolean f294252s;

    /* renamed from: t */
    private final LayoutInflater f294253t;

    /* renamed from: u */
    private final C90326d f294254u;

    /* renamed from: v */
    private final C90327e f294255v;

    /* renamed from: w */
    private final C90314b f294256w;

    /* renamed from: x */
    private final C105484al f294257x;

    /* renamed from: y */
    private final C90320d f294258y;

    /* renamed from: z */
    private final boolean f294259z;

    public C105486an(C22945j jVar, C105427a aVar, Context context, C90326d dVar, C90320d dVar2, C90314b bVar, C91142g gVar, C90165af afVar) {
        super(jVar);
        LayoutInflater from = LayoutInflater.from(context);
        this.f294234a = aVar;
        this.f294235b = context;
        this.f294253t = from;
        this.f294254u = dVar;
        this.f294258y = dVar2;
        this.f294256w = bVar;
        this.f294236c = afVar;
        this.f294230A = m175362r(context, R.drawable.googleapp_m2_updates_tab, R.color.minus_one_gray);
        this.f294257x = new C105484al(this);
        this.f294255v = new C105483ak(this);
        this.f294237d = true;
        this.f294259z = gVar.mo85405j(C90080ee.f249813l);
    }

    /* renamed from: r */
    private static Drawable m175362r(Context context, int i, int i2) {
        Drawable mutate = C1877c.m5125a(context, i).mutate();
        C1929b.m5225f(mutate, context.getResources().getColor(i2));
        return mutate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo94837e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo94838g(boolean z) {
        Drawable drawable;
        boolean z2 = this.f294252s;
        int i = R.color.minus_one_white;
        if (z2) {
            Context context = this.f294235b;
            if (!z) {
                i = R.color.minus_one_gray;
            }
            drawable = m175362r(context, R.drawable.zero_state_gold_brick_v2, i);
        } else {
            Context context2 = this.f294235b;
            if (!z) {
                i = R.color.minus_one_gray;
            }
            drawable = m175362r(context2, R.drawable.googleapp_m2_updates_tab, i);
        }
        this.f294230A = drawable;
        ImageView imageView = this.f294239f;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f294244k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo94839h() {
        TextView textView = this.f294240g;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: i */
    public final int mo83968i() {
        return this.f294243j.getHeight();
    }

    /* renamed from: im */
    public void mo28298im() {
        this.f294254u.mo84018j(this.f294255v);
        this.f294258y.mo84001b(this.f294257x);
        this.f294256w.mo83995b(this.f294232C);
        this.f294236c.mo83915c("MINUS_ONE_HEADER_RENDERER", this);
    }

    /* renamed from: iw */
    public void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) this.f294253t.inflate(mo94837e(), (ViewGroup) null);
        this.f294242i = viewGroup;
        viewGroup.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup viewGroup2 = (ViewGroup) this.f294242i.findViewById(R.id.header_padding_container);
        this.f294243j = viewGroup2;
        this.f294231B = viewGroup2.getPaddingTop();
        this.f294251r = (ChildStub) this.f294242i.findViewById(R.id.minus_one_doodle_stub);
        this.f294232C = new C105475ac(this);
        LinearLayout linearLayout = (LinearLayout) this.f294242i.findViewById(R.id.goldbox);
        this.f294238e = linearLayout;
        if (linearLayout != null) {
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.goldbox_image);
            imageView.getClass();
            this.f294239f = imageView;
            TextView textView = (TextView) this.f294238e.findViewById(R.id.goldbox_label);
            textView.getClass();
            this.f294240g = textView;
            if (this.f294259z) {
                textView.setText(R.string.assistant_snapshot);
            }
            this.f294239f.setImageDrawable(this.f294230A);
            this.f294238e.setOnClickListener(new C105476ad(this));
            ((C23249a) this.f294234a.mo94614j()).mo28726b(new C105477ae(this));
        }
        mo28295iC(this.f294242i);
        ((C23249a) this.f294234a.mo94610f()).mo28726b(new C105478af(this));
        ((C23249a) this.f294234a.mo94615k()).mo28726b(new C105479ag(this));
        if (mo94845q()) {
            ((C23219p) this.f294234a.mo94607c()).mo28685c(new C105482aj(this));
            ((C23249a) this.f294234a.mo94609e()).mo28726b(new C105480ah(this));
        }
        ((C23219p) this.f294234a.mo94606b()).mo28685c(new C105485am(this, this.f294242i));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f294254u.mo84011c(this.f294255v);
        this.f294258y.mo84000a(this.f294257x);
        this.f294256w.mo83994a(this.f294232C);
        int i = 0;
        if (!this.f294233D) {
            if (!this.f294250q) {
                mo94842l(false);
            }
            this.f294233D = true;
        }
        LinearLayout linearLayout = this.f294238e;
        if (linearLayout != null) {
            if (true != ((Boolean) ((C23249a) this.f294234a.mo94614j()).mo28725a()).booleanValue()) {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
        this.f294236c.mo83914b("MINUS_ONE_HEADER_RENDERER", this);
    }

    /* renamed from: j */
    public final void mo94840j() {
        boolean z = true;
        if ((!this.f294246m || ((Boolean) ((C23249a) this.f294234a.mo94609e()).mo28725a()).booleanValue()) && !this.f294247n) {
            z = false;
        }
        C90246a aVar = this.f294248o;
        if (aVar != null) {
            aVar.mo83956d(z);
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
    }

    /* renamed from: k */
    public final void mo94841k() {
        mo94840j();
        C90246a aVar = this.f294248o;
        if (aVar != null) {
            aVar.mo83957e(this.f294246m);
        }
        C90246a aVar2 = this.f294248o;
        boolean z = false;
        if (aVar2 != null && aVar2.mo83958f()) {
            z = true;
        }
        if (this.f294250q != z) {
            this.f294250q = z;
            C58976aa aaVar = C58975e.f156826a;
            mo94842l(this.f294250q);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo94842l(boolean z) {
        View view = this.f294249p;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
        mo94843m();
    }

    /* renamed from: m */
    public final void mo94843m() {
        int i;
        if (this.f294250q) {
            i = 0;
        } else {
            i = this.f294231B;
        }
        C91115n.m148874f(this.f294243j, 0, i + (mo94844p() ? this.f294245l.top : 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo94844p() {
        return !this.f294250q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo94845q() {
        return true;
    }

    /* renamed from: s */
    public final boolean mo28805s() {
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }
}
