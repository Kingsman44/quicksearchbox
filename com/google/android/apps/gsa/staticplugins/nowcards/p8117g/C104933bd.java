package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.now.shared.p6421ui.RecyclerViewStub;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9217cz;
import com.google.android.apps.p489g.p494d.C9275s;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.bd */
/* compiled from: PG */
public final class C104933bd extends C104348l {

    /* renamed from: A */
    private boolean f292402A = false;

    /* renamed from: B */
    private View f292403B;

    /* renamed from: C */
    private View f292404C;

    /* renamed from: D */
    private View f292405D;

    /* renamed from: E */
    private RecyclerViewStub f292406E;

    /* renamed from: F */
    private RecyclerViewStub f292407F;

    /* renamed from: y */
    private final C105070g f292408y;

    /* renamed from: z */
    private boolean f292409z = false;

    public C104933bd(Context context, C104350n nVar, C105070g gVar) {
        super(context, nVar);
        this.f292408y = gVar;
    }

    /* renamed from: L */
    private final void m173962L(View view) {
        this.f292403B = view.findViewById(R.id.left_action_container);
        this.f292404C = view.findViewById(R.id.right_action_container);
        this.f292405D = view.findViewById(R.id.secondary_label);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        int i;
        C9278v vVar = this.f290310e;
        C9217cz czVar = vVar.f32198e;
        if (czVar == null) {
            czVar = C9217cz.f31853i;
        }
        boolean z = czVar.f31862h;
        this.f292402A = z;
        if ((vVar.f32192a & 268435456) != 0) {
            this.f292409z = true;
            i = true != z ? R.layout.qp_split_primary_action : R.layout.hq_split_primary_action;
        } else if ((czVar.f31855a & 8) != 0) {
            i = R.layout.qp_primary_action_with_justification;
        } else {
            CardRenderingContext n = mo94120n();
            i = (!mo94108G() || n == null || !n.mo49317l() || this.f292402A) ? true != this.f292402A ? R.layout.qp_primary_action : R.layout.hq_primary_action : R.layout.hq_primary_action_v1p5;
        }
        View inflate = layoutInflater.inflate(i, mo94115i(), false);
        m173962L(inflate);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        View inflate = this.f290308c.f256406b.inflate(R.layout.qp_primary_action, viewGroup, false);
        m173962L(inflate);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        View view = this.f290311f;
        C9278v vVar = this.f290310e;
        C9217cz czVar = vVar.f32198e;
        if (czVar == null) {
            czVar = C9217cz.f31853i;
        }
        if (czVar.f31858d.size() > 0) {
            MetadataLineView metadataLineView = (MetadataLineView) view.findViewById(R.id.metadataText);
            if (metadataLineView != null) {
                metadataLineView.mo94502d(this.f292408y.mo94516a(this.f290307b, this.f290308c.f256406b, (Map) null, mo94120n()), czVar.f31858d, this.f290314i.f290349s);
                metadataLineView.setVisibility(0);
                view.findViewById(R.id.title).setVisibility(8);
            }
        } else {
            boolean z = this.f290318m;
            int color = this.f290307b.getResources().getColor(R.color.default_text_dark_theme_color);
            if ((czVar.f31855a & 1) != 0) {
                C91985d.m150961h(view, R.id.title, Html.fromHtml(czVar.f31856b));
                if (z) {
                    ((TextView) view.findViewById(R.id.title)).setTextColor(color);
                }
            }
            if (this.f292409z && (vVar.f32192a & 536870912) != 0) {
                C91985d.m150961h(view, R.id.secondary_label, Html.fromHtml(vVar.f32172F));
                if (z) {
                    ((TextView) view.findViewById(R.id.secondary_label)).setTextColor(color);
                }
            } else if ((czVar.f31855a & 2) != 0) {
                C91985d.m150961h(view, R.id.secondary_label, Html.fromHtml(czVar.f31857c));
                if (z) {
                    ((TextView) view.findViewById(R.id.secondary_label)).setTextColor(color);
                }
                View view2 = this.f292405D;
                if (!(view2 == null || (czVar.f31855a & 4) == 0)) {
                    C9141ad adVar = czVar.f31859e;
                    if (adVar == null) {
                        adVar = C9141ad.f31521K;
                    }
                    mo94103B(view2, adVar);
                    view2.setBackground(this.f290307b.getResources().getDrawable(R.drawable.qp_secondary_action_background));
                }
            }
        }
        if ((czVar.f31855a & 8) != 0) {
            C91985d.m150961h(view, R.id.justification, Html.fromHtml(czVar.f31860f));
        }
        if ((czVar.f31855a & 16) != 0) {
            view.setContentDescription(czVar.f31861g);
        }
    }

    /* renamed from: q */
    public final void mo94036q() {
        super.mo94036q();
        View view = this.f290311f;
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.justification);
        TextView textView3 = (TextView) view.findViewById(R.id.secondary_label);
        MetadataLineView metadataLineView = (MetadataLineView) view.findViewById(R.id.metadataText);
        if (textView != null) {
            textView.setText(BuildConfig.FLAVOR);
        }
        if (textView2 != null) {
            textView2.setText(BuildConfig.FLAVOR);
            textView2.setVisibility(8);
        }
        if (textView3 != null) {
            textView3.setText(BuildConfig.FLAVOR);
            textView3.setVisibility(8);
        }
        if (metadataLineView != null) {
            metadataLineView.mo94501c();
            metadataLineView.setVisibility(8);
        }
        view.setContentDescription((CharSequence) null);
        View view2 = this.f292403B;
        if (view2 != null) {
            view2.setBackground((Drawable) null);
        }
        RecyclerViewStub recyclerViewStub = this.f292406E;
        if (recyclerViewStub != null) {
            recyclerViewStub.mo76715b();
        }
        View view3 = this.f292404C;
        if (view3 != null) {
            view3.setBackground((Drawable) null);
        }
        RecyclerViewStub recyclerViewStub2 = this.f292407F;
        if (recyclerViewStub2 != null) {
            recyclerViewStub2.mo76715b();
        }
        View view4 = this.f292405D;
        if (view4 != null) {
            view4.setOnClickListener((View.OnClickListener) null);
            this.f292405D.setBackground((Drawable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo94075w() {
        View view;
        View view2;
        if (!this.f292409z) {
            super.mo94075w();
            return;
        }
        mo94129x();
        C9278v vVar = this.f290310e;
        if ((vVar.f32192a & 67108864) != 0) {
            C9141ad adVar = vVar.f32169C;
            if (adVar == null) {
                adVar = C9141ad.f31521K;
            }
            if (((adVar.f31535a & 4) != 0 || this.f292402A) && (view2 = this.f292403B) != null) {
                C9141ad adVar2 = vVar.f32169C;
                if (adVar2 == null) {
                    adVar2 = C9141ad.f31521K;
                }
                mo94103B(view2, adVar2);
            }
        }
        if ((vVar.f32192a & 268435456) != 0) {
            C9141ad adVar3 = vVar.f32171E;
            if (adVar3 == null) {
                adVar3 = C9141ad.f31521K;
            }
            if (((adVar3.f31535a & 4) != 0 || this.f292402A) && (view = this.f292404C) != null) {
                C9141ad adVar4 = vVar.f32171E;
                if (adVar4 == null) {
                    adVar4 = C9141ad.f31521K;
                }
                mo94103B(view, adVar4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo94129x() {
        View view;
        View view2;
        C9278v vVar = this.f290310e;
        if (this.f292409z) {
            C9141ad adVar = vVar.f32169C;
            if (adVar == null) {
                adVar = C9141ad.f31521K;
            }
            int i = 1;
            if (!((adVar.f31535a & 4) == 0 || (view2 = this.f292403B) == null)) {
                C9141ad adVar2 = vVar.f32169C;
                if (adVar2 == null) {
                    adVar2 = C9141ad.f31521K;
                }
                C9164b bVar = adVar2.f31539e;
                if (bVar == null) {
                    bVar = C9164b.f31642o;
                }
                int a = C9275s.m23704a(vVar.f32178L);
                if (a == 0) {
                    a = 1;
                }
                this.f292406E = mo94111J(view2, bVar, a);
            }
            C9141ad adVar3 = vVar.f32171E;
            if (((adVar3 == null ? C9141ad.f31521K : adVar3).f31535a & 4) != 0 && (view = this.f292404C) != null) {
                if (adVar3 == null) {
                    adVar3 = C9141ad.f31521K;
                }
                C9164b bVar2 = adVar3.f31539e;
                if (bVar2 == null) {
                    bVar2 = C9164b.f31642o;
                }
                int a2 = C9275s.m23704a(vVar.f32178L);
                if (a2 != 0) {
                    i = a2;
                }
                this.f292407F = mo94111J(view, bVar2, i);
                return;
            }
            return;
        }
        super.mo94129x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo94076z() {
        if (this.f292409z) {
            View view = this.f290311f;
            C9278v vVar = this.f290310e;
            if ((vVar.f32192a & 16777216) != 0) {
                view.setBackgroundColor(vVar.f32167A);
            }
            View view2 = this.f292403B;
            if (view2 != null && !this.f292402A) {
                mo94125r(view2, this.f290307b.getResources().getDrawable(R.drawable.qp_clickable_module_background));
            }
            View view3 = this.f292404C;
            if (view3 != null && !this.f292402A) {
                mo94125r(view3, this.f290307b.getResources().getDrawable(R.drawable.qp_clickable_module_background));
                return;
            }
            return;
        }
        super.mo94102A(true);
    }
}
