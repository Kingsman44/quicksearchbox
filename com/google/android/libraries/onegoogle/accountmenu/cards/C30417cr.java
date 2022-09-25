package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1882h;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30910aj;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.material.chip.Chip;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.cr */
/* compiled from: PG */
public class C30417cr extends C30373ba {

    /* renamed from: A */
    private View f82187A;

    /* renamed from: B */
    private View f82188B;

    /* renamed from: C */
    private ViewGroup f82189C;

    /* renamed from: g */
    private final int f82190g;

    /* renamed from: h */
    public final int f82191h;

    /* renamed from: i */
    public TextualCardRootView f82192i;

    /* renamed from: j */
    public ImageView f82193j;

    /* renamed from: k */
    public ImageView f82194k;

    /* renamed from: l */
    public TextView f82195l;

    /* renamed from: m */
    public TextView f82196m;

    /* renamed from: n */
    public TextView f82197n;

    /* renamed from: o */
    public Chip f82198o;

    /* renamed from: p */
    public Chip f82199p;

    /* renamed from: q */
    public ImageView f82200q;

    /* renamed from: r */
    public ImageView f82201r;

    /* renamed from: s */
    public ImageView f82202s;

    /* renamed from: t */
    public TextView f82203t;

    /* renamed from: u */
    public boolean f82204u;

    /* renamed from: v */
    public boolean f82205v;

    /* renamed from: w */
    public boolean f82206w;

    /* renamed from: x */
    private final int f82207x;

    /* renamed from: y */
    private ViewGroup f82208y;

    /* renamed from: z */
    private ViewGroup f82209z;

    public C30417cr(ViewGroup viewGroup, Context context, C30897z zVar) {
        super(viewGroup, context, zVar);
        this.f82191h = C30899a.m57682a(context, R.attr.ogIconColor);
        this.f82190g = context.getResources().getDimensionPixelSize(R.dimen.account_menu_cards_vertical_spacing);
        this.f82207x = context.getResources().getDimensionPixelSize(R.dimen.text_card_vertical_spacing_with_actions);
    }

    /* renamed from: i */
    private static final void m56625i(TextualCardRootView textualCardRootView, C30398bz bzVar) {
        if (textualCardRootView != null) {
            textualCardRootView.f82048c = bzVar != null ? C58833ax.m90834k(bzVar.f82168w) : C58836b.f156633a;
        }
    }

    /* renamed from: j */
    private static final void m56626j(ViewGroup viewGroup, C30398bz bzVar) {
        if (viewGroup != null) {
            viewGroup.setTag(R.id.og_card_highlight_id_tag, bzVar != null ? (Integer) bzVar.f82167v.mo56111f() : null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo35955b(ViewGroup viewGroup) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo35947c(C2391v vVar) {
        this.f82192i.mo35632lk(this.f82108b);
        super.mo35947c(vVar);
        C30398bz bzVar = (C30398bz) this.f82112f;
        C58838bb.m90866a(bzVar, "setCardModel has to be called before attaching view.");
        bzVar.f82131k.mo5707k(vVar);
        bzVar.f82158m.mo5707k(vVar);
        bzVar.f82159n.mo5707k(vVar);
        bzVar.f82160o.mo5707k(vVar);
        bzVar.f82161p.mo5707k(vVar);
        bzVar.f82163r.mo5707k(vVar);
        bzVar.f82165t.mo5707k(vVar);
        bzVar.f82164s.mo5707k(vVar);
        bzVar.f82162q.mo5707k(vVar);
        bzVar.f82166u.mo5707k(vVar);
        bzVar.f82088c.mo5707k(vVar);
        if (bzVar instanceof C30384bl) {
            ((C30384bl) bzVar).mo35954f();
        }
        bzVar.mo35968h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo35948d(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f82189C = viewGroup2;
        View inflate = LayoutInflater.from(this.f82107a).inflate(R.layout.og_textual_card, viewGroup);
        this.f82192i = (TextualCardRootView) inflate.findViewById(R.id.og_text_card_root);
        this.f82208y = (ViewGroup) inflate.findViewById(R.id.og_full_text_card_root);
        this.f82209z = (ViewGroup) inflate.findViewById(R.id.og_minimized_text_card_root);
        this.f82193j = (ImageView) inflate.findViewById(R.id.og_text_card_icon);
        this.f82194k = (ImageView) inflate.findViewById(R.id.og_minimized_text_card_icon);
        this.f82195l = (TextView) inflate.findViewById(R.id.og_text_card_title);
        this.f82196m = (TextView) inflate.findViewById(R.id.og_minimized_text_card_title);
        this.f82197n = (TextView) inflate.findViewById(R.id.og_text_card_subtitle);
        this.f82198o = (Chip) inflate.findViewById(R.id.og_text_card_action);
        this.f82187A = inflate.findViewById(R.id.og_text_actions_top_margin);
        this.f82188B = inflate.findViewById(R.id.og_text_cards_flow);
        this.f82199p = (Chip) inflate.findViewById(R.id.og_text_card_secondary_action);
        this.f82200q = (ImageView) inflate.findViewById(R.id.og_text_card_trail_image);
        this.f82201r = (ImageView) inflate.findViewById(R.id.og_text_card_trail_title_image);
        this.f82202s = (ImageView) inflate.findViewById(R.id.og_minimized_text_card_trail_title_image);
        this.f82203t = (TextView) inflate.findViewById(R.id.og_text_card_trail_title_text);
        if (C30910aj.m57700a(this.f82107a)) {
            this.f82198o.setClickable(false);
            this.f82198o.setFocusable(false);
        }
        m56625i(this.f82192i, (C30398bz) this.f82112f);
        m56626j(viewGroup2, (C30398bz) this.f82112f);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.og_text_card_custom_content);
        if (mo35955b(viewGroup3) != null) {
            viewGroup3.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo35937a(C2391v vVar, C30398bz bzVar) {
        super.mo35937a(vVar, bzVar);
        boolean z = bzVar instanceof C30384bl;
        this.f82204u = z;
        m56626j(this.f82189C, bzVar);
        m56625i(this.f82192i, bzVar);
        this.f82192i.mo35630b(this.f82108b);
        bzVar.f82131k.mo5704e(vVar, new C30404ce(this));
        bzVar.f82158m.mo5704e(vVar, new C30410ck(this));
        bzVar.f82159n.mo5704e(vVar, new C30411cl(this));
        bzVar.f82160o.mo5704e(vVar, new C30412cm(this));
        bzVar.f82161p.mo5704e(vVar, new C30413cn(this));
        bzVar.f82163r.mo5704e(vVar, new C30414co(this));
        bzVar.f82165t.mo5704e(vVar, new C30415cp(this));
        bzVar.f82164s.mo5704e(vVar, new C30416cq(this));
        bzVar.f82162q.mo5704e(vVar, new C30405cf(this));
        bzVar.f82166u.mo5704e(vVar, new C30406cg(this));
        bzVar.f82088c.mo5704e(vVar, new C30409cj(this));
        if (z) {
            ((C30384bl) bzVar).mo35953e();
        } else {
            this.f82208y.setVisibility(0);
            this.f82209z.setVisibility(8);
            this.f82196m.setVisibility(8);
        }
        bzVar.mo35967g();
    }

    /* renamed from: f */
    public final ColorStateList mo35982f(C58833ax axVar) {
        if (axVar.mo56113h()) {
            return (ColorStateList) axVar.mo56107c();
        }
        return C1882h.m5138d(this.f82107a, R.color.og_chip_assistive_text_color);
    }

    /* renamed from: g */
    public final void mo35983g() {
        int i;
        int i2 = 0;
        if (this.f82198o.getVisibility() == 8 && this.f82199p.getVisibility() == 8) {
            i2 = 8;
        }
        this.f82188B.setVisibility(i2);
        this.f82187A.setVisibility(i2);
        ViewGroup viewGroup = this.f82208y;
        int paddingLeft = viewGroup.getPaddingLeft();
        int paddingTop = this.f82208y.getPaddingTop();
        int paddingRight = this.f82208y.getPaddingRight();
        if (i2 == 0) {
            i = this.f82207x;
        } else {
            i = this.f82190g;
        }
        viewGroup.setPadding(paddingLeft, paddingTop, paddingRight, i);
    }

    /* renamed from: h */
    public final void mo35984h(boolean z) {
        if (!this.f82206w || !z) {
            this.f82199p.setVisibility(8);
        } else {
            this.f82199p.setVisibility(0);
        }
        mo35983g();
    }
}
