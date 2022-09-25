package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105070g;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9272p;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7517ae;
import com.google.p375ai.p378b.C7518af;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7811kv;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C7828ll;
import com.google.p375ai.p378b.C8150xj;
import com.google.p375ai.p378b.C8178yk;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.ap */
/* compiled from: PG */
public final class C104314ap extends C104348l {

    /* renamed from: A */
    private MetadataLineView f290174A;

    /* renamed from: B */
    private View f290175B;

    /* renamed from: C */
    private View f290176C;

    /* renamed from: D */
    private View f290177D;

    /* renamed from: E */
    private ImageView f290178E;

    /* renamed from: y */
    private final C105070g f290179y;

    /* renamed from: z */
    private MetadataLineView f290180z;

    public C104314ap(Context context, C104350n nVar, C105070g gVar) {
        super(context, nVar);
        this.f290179y = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.card_cap, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.card_cap, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        ViewGroup p;
        MetadataLineView metadataLineView;
        String str;
        C7828ll llVar;
        C7828ll llVar2;
        View findViewById = this.f290311f.findViewById(R.id.gestalt_cap_container);
        this.f290177D = findViewById;
        this.f290180z = (MetadataLineView) findViewById.findViewById(R.id.content_container);
        this.f290174A = (MetadataLineView) this.f290177D.findViewById(R.id.sub_content_container);
        this.f290175B = this.f290177D.findViewById(R.id.card_action_container);
        this.f290178E = (ImageView) this.f290177D.findViewById(R.id.cap_menu_button);
        this.f290176C = this.f290177D.findViewById(R.id.cap_clickable_container);
        this.f290177D.setAccessibilityDelegate(new C104321aw(-1));
        MetadataLineView metadataLineView2 = this.f290180z;
        if (metadataLineView2 != null) {
            metadataLineView2.setAccessibilityDelegate(new C104322ax(-1));
            this.f290180z.setFocusable(true);
        }
        this.f290175B.setClickable(true);
        if (this.f290318m) {
            this.f290178E.setColorFilter(C1878d.m5128a(this.f290307b, R.color.snowman_dark_theme_color), PorterDuff.Mode.MULTIPLY);
        }
        this.f290180z.f292772b = this.f290308c.f256407c;
        View view = this.f290311f;
        this.f290177D.setVisibility(0);
        C7518af afVar = this.f290310e.f32219z;
        if (afVar == null) {
            afVar = C7518af.f26025j;
        }
        C105069f a = this.f290179y.mo94516a(this.f290307b, this.f290308c.f256406b, (Map) null, mo94120n());
        a.f292793e.mo94509a(this.f290318m);
        if (afVar.f26029c.size() != 0) {
            this.f290180z.mo94502d(a, afVar.f26029c, this.f290314i.f290349s);
            if (mo94108G() && (afVar.f26027a & 1) != 0) {
                int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.lotic_cap_left_padding_hq);
                MetadataLineView metadataLineView3 = this.f290180z;
                if (metadataLineView3 != null) {
                    ViewGroup.LayoutParams layoutParams = metadataLineView3.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = dimensionPixelOffset;
                        marginLayoutParams.setMarginStart(dimensionPixelOffset);
                    }
                }
            }
            if (afVar.f26029c.size() > 0 && ((C7818lb) afVar.f26029c.get(0)).f27419b.size() > 0) {
                Iterator it = ((C7818lb) afVar.f26029c.get(0)).f27419b.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    str = BuildConfig.FLAVOR;
                    if (!hasNext) {
                        break;
                    }
                    C7811kv kvVar = (C7811kv) it.next();
                    if (kvVar.f27308b == 1) {
                        llVar = (C7828ll) kvVar.f27309c;
                    } else {
                        llVar = C7828ll.f27455e;
                    }
                    if ((llVar.f27457a & 1) != 0) {
                        C89291a aVar = this.f290314i.f290331a;
                        Context context = this.f290307b;
                        if (kvVar.f27308b == 1) {
                            llVar2 = (C7828ll) kvVar.f27309c;
                        } else {
                            llVar2 = C7828ll.f27455e;
                        }
                        C8150xj xjVar = llVar2.f27458b;
                        if (xjVar == null) {
                            xjVar = C8150xj.f28657d;
                        }
                        String a2 = aVar.mo83231a(context, xjVar);
                        if (a2 != null) {
                            str = a2;
                        }
                    }
                }
                this.f290175B.setContentDescription(this.f290307b.getString(R.string.accessibility_menu_button_with_title, new Object[]{str}));
                if (this.f290176C != null) {
                    this.f290180z.setAccessibilityHeading(true);
                }
            }
        }
        if (!(afVar.f26030d.size() == 0 || (metadataLineView = this.f290174A) == null)) {
            metadataLineView.mo94502d(a, afVar.f26030d, this.f290314i.f290349s);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f290175B.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, 0, marginLayoutParams2.rightMargin, 0);
        }
        C9278v vVar = this.f290310e;
        if (this.f290314i.f290335e) {
            C9272p pVar = vVar.f32189W;
            if (pVar == null) {
                pVar = C9272p.f32079d;
            }
            if (pVar.f32082b.size() > 0) {
                this.f290175B.setOnClickListener(new C104312an(this));
                this.f290175B.setVisibility(0);
                C7718hj hjVar = this.f290310e.f32174H;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                C7708h c = C91978bb.m150937c(hjVar, C7681g.CARD_MENU_OPEN, new C7681g[0]);
                if (!(c == null || (c.f26896a & 2048) == 0)) {
                    C8178yk ykVar = c.f26907l;
                    if (ykVar == null) {
                        ykVar = C8178yk.f28736g;
                    }
                    if (!ykVar.f28742e) {
                        Map map = this.f290312g;
                        C8178yk ykVar2 = c.f26907l;
                        if (ykVar2 == null) {
                            ykVar2 = C8178yk.f28736g;
                        }
                        map.put(ykVar2, this.f290175B);
                    }
                }
            } else {
                this.f290175B.setOnClickListener((View.OnClickListener) null);
                this.f290175B.setVisibility(4);
            }
        }
        C91671j jVar = this.f290309d;
        if (jVar != null && (p = jVar.mo86101p()) != null) {
            p.setTag(R.id.cap_module_presenter, this);
        }
    }

    /* renamed from: q */
    public final void mo94036q() {
        super.mo94036q();
        MetadataLineView metadataLineView = this.f290180z;
        if (metadataLineView != null) {
            metadataLineView.setOnClickListener((View.OnClickListener) null);
            this.f290180z.mo94501c();
        }
        MetadataLineView metadataLineView2 = this.f290174A;
        if (metadataLineView2 != null) {
            metadataLineView2.mo94501c();
        }
        View view = this.f290175B;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
            this.f290175B.setVisibility(8);
        }
        View view2 = this.f290176C;
        if (view2 != null) {
            view2.setOnClickListener((View.OnClickListener) null);
        }
        View view3 = this.f290177D;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo94075w() {
        C9141ad adVar;
        C9278v vVar = this.f290310e;
        if ((vVar.f32192a & 67108864) != 0) {
            adVar = vVar.f32169C;
            if (adVar == null) {
                adVar = C9141ad.f31521K;
            }
        } else {
            adVar = null;
        }
        boolean z = false;
        if (adVar == null) {
            C7518af afVar = this.f290310e.f32219z;
            if (afVar == null) {
                afVar = C7518af.f26025j;
            }
            if ((afVar.f26027a & 4) != 0) {
                Context context = this.f290307b;
                C89291a aVar = this.f290314i.f290331a;
                C7518af afVar2 = this.f290310e.f32219z;
                if (afVar2 == null) {
                    afVar2 = C7518af.f26025j;
                }
                C7536ax axVar = afVar2.f26032f;
                if (axVar == null) {
                    axVar = C7536ax.f26084o;
                }
                adVar = C91992k.m150979g(context, aVar, false, axVar);
            }
        }
        if (adVar != null) {
            C7518af afVar3 = this.f290310e.f32219z;
            if (afVar3 == null) {
                afVar3 = C7518af.f26025j;
            }
            if ((afVar3.f26027a & 32) != 0) {
                C7518af afVar4 = this.f290310e.f32219z;
                if (afVar4 == null) {
                    afVar4 = C7518af.f26025j;
                }
                int a = C7517ae.m22775a(afVar4.f26034h);
                if (a != 0 && a == 2) {
                    z = true;
                }
            }
            View view = this.f290176C;
            if (view == null || !z) {
                view = this.f290311f;
            }
            mo94103B(view, adVar);
            mo94103B(this.f290180z, adVar);
            if (z && this.f290176C != null) {
                this.f290180z.setForeground(this.f290307b.getResources().getDrawable(R.drawable.qp_clickable_module_background));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0082, code lost:
        if (r1 != 2) goto L_0x0085;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94076z() {
        /*
            r9 = this;
            com.google.android.apps.g.d.v r0 = r9.f290310e
            int r1 = r0.f32192a
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r2
            r3 = 0
            if (r1 == 0) goto L_0x0060
            int r0 = r0.f32167A
            int r1 = android.graphics.Color.alpha(r0)
            int r4 = android.graphics.Color.red(r0)
            int r5 = android.graphics.Color.green(r0)
            int r6 = android.graphics.Color.blue(r0)
            com.google.android.apps.g.d.v r7 = r9.f290310e
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.android.apps.g.d.q r7 = (com.google.android.apps.p489g.p494d.C9273q) r7
            float r4 = (float) r4
            r8 = 1063675494(0x3f666666, float:0.9)
            float r4 = r4 * r8
            int r4 = (int) r4
            int r4 = java.lang.Math.max(r4, r3)
            float r5 = (float) r5
            float r5 = r5 * r8
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r5, r3)
            float r6 = (float) r6
            float r6 = r6 * r8
            int r6 = (int) r6
            int r6 = java.lang.Math.max(r6, r3)
            int r1 = android.graphics.Color.argb(r1, r4, r5, r6)
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            int r5 = r4.f32192a
            r5 = r5 | r2
            r4.f32192a = r5
            r4.f32167A = r1
            com.google.protobuf.bv r1 = r7.build()
            com.google.android.apps.g.d.v r1 = (com.google.android.apps.p489g.p494d.C9278v) r1
            r9.f290310e = r1
            android.widget.ImageView r1 = r9.f290178E
            r4 = -1
            r1.setColorFilter(r4)
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            com.google.android.apps.g.d.v r1 = r9.f290310e
            com.google.ai.b.af r1 = r1.f32219z
            if (r1 != 0) goto L_0x0069
            com.google.ai.b.af r1 = com.google.p375ai.p378b.C7518af.f26025j
        L_0x0069:
            int r1 = r1.f26027a
            r1 = r1 & 32
            r4 = 1
            if (r1 == 0) goto L_0x0085
            com.google.android.apps.g.d.v r1 = r9.f290310e
            com.google.ai.b.af r1 = r1.f32219z
            if (r1 != 0) goto L_0x0078
            com.google.ai.b.af r1 = com.google.p375ai.p378b.C7518af.f26025j
        L_0x0078:
            int r1 = r1.f26034h
            int r1 = com.google.p375ai.p378b.C7517ae.m22775a(r1)
            if (r1 != 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r5 = 2
            if (r1 != r5) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r3 = 1
        L_0x0086:
            super.mo94102A(r3)
            if (r0 == 0) goto L_0x00aa
            com.google.android.apps.g.d.v r1 = r9.f290310e
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.android.apps.g.d.q r1 = (com.google.android.apps.p489g.p494d.C9273q) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r4 = r3.f32192a
            r2 = r2 | r4
            r3.f32192a = r2
            r3.f32167A = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.apps.g.d.v r0 = (com.google.android.apps.p489g.p494d.C9278v) r0
            r9.mo94126s(r0)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.base.C104314ap.mo94076z():void");
    }
}
