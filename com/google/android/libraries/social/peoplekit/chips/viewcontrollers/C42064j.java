package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42009b;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.material.chip.Chip;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.j */
/* compiled from: PG */
public final class C42064j {

    /* renamed from: a */
    public final View f109937a;

    /* renamed from: b */
    public final ChannelChip f109938b;

    /* renamed from: c */
    public final Context f109939c;

    /* renamed from: d */
    public final PeopleKitConfig f109940d;

    /* renamed from: e */
    public final PeopleKitVisualElementPath f109941e;

    /* renamed from: f */
    public final C42075e f109942f;

    /* renamed from: g */
    public final PeopleKitSelectionModel f109943g;

    /* renamed from: h */
    public C42141b f109944h;

    /* renamed from: i */
    public PopupWindow f109945i;

    /* renamed from: j */
    public boolean f109946j;

    /* renamed from: k */
    public String f109947k;

    /* renamed from: l */
    public boolean f109948l = false;

    /* renamed from: m */
    public int f109949m = 0;

    /* renamed from: n */
    public final AtomicInteger f109950n;

    /* renamed from: o */
    public ColorStateList f109951o;

    /* renamed from: p */
    public ColorStateList f109952p;

    /* renamed from: q */
    public C42009b f109953q;

    /* renamed from: r */
    private final C58833ax f109954r;

    /* renamed from: s */
    private ColorStateList f109955s;

    /* renamed from: t */
    private ColorStateList f109956t;

    public C42064j(Context context, PeopleKitConfig peopleKitConfig, C42075e eVar, PeopleKitVisualElementPath peopleKitVisualElementPath, PeopleKitSelectionModel peopleKitSelectionModel, C42141b bVar) {
        C58833ax axVar;
        this.f109939c = context;
        this.f109940d = peopleKitConfig;
        this.f109942f = eVar;
        this.f109941e = peopleKitVisualElementPath;
        this.f109943g = peopleKitSelectionModel;
        C42087a.m73675a(bVar);
        this.f109944h = bVar;
        this.f109950n = new AtomicInteger(-1);
        C42087a.m73676b(this.f109944h);
        View inflate = LayoutInflater.from(context).inflate(R.layout.peoplekit_chip, (ViewGroup) null);
        this.f109937a = inflate;
        ChannelChip channelChip = (ChannelChip) inflate.findViewById(R.id.peoplekit_chip);
        this.f109938b = channelChip;
        if (C42131a.m73922e()) {
            this.f109951o = channelChip.mo47674g();
            this.f109952p = channelChip.mo47678h();
        }
        PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) peopleKitConfig;
        String str = peopleKitConfigImpl.f110234a;
        String str2 = peopleKitConfigImpl.f110235b;
        if (!TextUtils.isEmpty(str)) {
            axVar = C58833ax.m90834k(new Account(str, true == TextUtils.isEmpty(str2) ? "com.google" : str2));
        } else {
            axVar = C58836b.f156633a;
        }
        this.f109954r = axVar;
    }

    /* renamed from: f */
    private final void m73622f(Chip chip, Channel channel, boolean z) {
        chip.mo47721v(this.f109939c.getResources().getColorStateList(R.color.peoplekit_chip_out_of_domain_stroke_color, this.f109939c.getTheme()));
        if (this.f109944h.f110300s) {
            chip.mo47684o(this.f109939c.getColorStateList(R.color.peoplekit_chip_out_of_domain_background_color_dark_mode));
        } else {
            chip.mo47684o(this.f109939c.getColorStateList(R.color.peoplekit_chip_out_of_domain_background_color));
        }
        if (!z) {
            this.f109950n.set(5);
            C42067m.m73630a(this.f109939c, chip, channel, this.f109947k);
        }
        chip.mo47723x((Drawable) null);
    }

    /* renamed from: a */
    public final void mo44552a(Chip chip, Drawable drawable) {
        PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) this.f109940d;
        if (peopleKitConfigImpl.f110249p || peopleKitConfigImpl.f110250q || peopleKitConfigImpl.f110258y) {
            chip.mo47723x(drawable);
            if (this.f109944h.f110294m != 0) {
                C1929b.m5225f(drawable.mutate(), C1878d.m5128a(this.f109939c, this.f109944h.f110294m));
            }
        }
    }

    /* renamed from: b */
    public final void mo44553b(boolean z) {
        this.f109938b.setSelected(z);
        int i = this.f109949m;
        if (i != 5 && i != 4) {
            C42087a.m73676b(this.f109944h);
            if (z) {
                if (this.f109955s == null) {
                    this.f109955s = this.f109938b.mo47674g();
                    this.f109938b.mo47693p(R.color.people_chip_selected_state_background_color);
                }
                if (this.f109956t == null) {
                    this.f109956t = this.f109938b.mo47678h();
                    this.f109938b.mo47722w(R.color.people_chip_selected_state_border_color);
                    return;
                }
                return;
            }
            ColorStateList colorStateList = this.f109955s;
            if (colorStateList != null) {
                this.f109938b.mo47684o(colorStateList);
                this.f109955s = null;
            }
            ColorStateList colorStateList2 = this.f109956t;
            if (colorStateList2 != null) {
                this.f109938b.mo47721v(colorStateList2);
                this.f109956t = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo44554c(C42141b bVar) {
        C42087a.m73675a(bVar);
        this.f109944h = bVar;
        int i = bVar.f110282a;
        if (i != 0) {
            this.f109938b.mo47693p(i);
        }
        int i2 = bVar.f110293l;
        if (i2 != 0) {
            this.f109938b.mo47722w(i2);
        }
        int i3 = bVar.f110286e;
        if (i3 != 0) {
            this.f109938b.setTextColor(C1878d.m5128a(this.f109939c, i3));
        }
        mo44552a(this.f109938b, C0678gm.m2375e().mo3100c(this.f109939c, R.drawable.quantum_gm_ic_expand_more_vd_theme_24));
    }

    /* renamed from: d */
    public final void mo44555d(int i, Channel channel) {
        if (this.f109949m != i) {
            this.f109949m = i;
            mo44556e(channel);
            if (i == 2) {
                C42075e eVar = this.f109942f;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144479t));
                peopleKitVisualElementPath.mo44564a(this.f109941e.f109973a);
                eVar.mo44577c(-1, peopleKitVisualElementPath);
            } else if (i == 4) {
                C42075e eVar2 = this.f109942f;
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144479t));
                peopleKitVisualElementPath2.mo44564a(this.f109941e.f109973a);
                eVar2.mo44577c(-1, peopleKitVisualElementPath2);
            } else if (i == 5) {
                C42075e eVar3 = this.f109942f;
                PeopleKitVisualElementPath peopleKitVisualElementPath3 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath3.f109973a.mo44369a(new C41952a(C54941a.f144481v));
                peopleKitVisualElementPath3.mo44564a(this.f109941e.f109973a);
                eVar3.mo44577c(-1, peopleKitVisualElementPath3);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.libraries.glide.fife.b] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.libraries.glide.fife.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44556e(com.google.android.libraries.social.peoplekit.common.dataservice.Channel r13) {
        /*
            r12 = this;
            int r0 = r12.f109949m
            r1 = 0
            r2 = 2131171218(0x7f071792, float:1.7956816E38)
            r3 = 4
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x00c2
            if (r0 == r4) goto L_0x0083
            r6 = 2
            if (r0 == r6) goto L_0x0060
            r6 = 3
            if (r0 == r6) goto L_0x0031
            if (r0 == r3) goto L_0x0023
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r12.f109940d
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            boolean r0 = r0.f110256w
            if (r0 == 0) goto L_0x0154
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r0 = r12.f109938b
            r12.m73622f(r0, r13, r1)
            return
        L_0x0023:
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r12.f109940d
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            boolean r0 = r0.f110256w
            if (r0 == 0) goto L_0x0154
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r0 = r12.f109938b
            r12.m73622f(r0, r13, r4)
            return
        L_0x0031:
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r0 = r12.f109938b
            r1 = 2131101922(0x7f0608e2, float:1.7816267E38)
            r0.mo47722w(r1)
            r3 = 2131101919(0x7f0608df, float:1.7816261E38)
            r0.mo47693p(r3)
            android.content.Context r3 = r12.f109939c
            java.lang.String r4 = r12.f109947k
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42067m.m73631b(r3, r0, r13, r4)
            android.content.res.Resources r13 = r3.getResources()
            int r13 = r13.getDimensionPixelSize(r2)
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.j r2 = new com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.j
            int r1 = androidx.core.content.C1878d.m5128a(r3, r1)
            r4 = 255(0xff, float:3.57E-43)
            r2.<init>(r3, r1, r13, r4)
            r0.mo47694q(r2)
            r0.mo47723x(r5)
            return
        L_0x0060:
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r0 = r12.f109938b
            android.content.Context r1 = r12.f109939c
            android.content.res.Resources r1 = r1.getResources()
            android.content.Context r2 = r12.f109939c
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r3 = 2131103319(0x7f060e57, float:1.78191E38)
            android.content.res.ColorStateList r1 = r1.getColorStateList(r3, r2)
            r0.mo47721v(r1)
            android.content.Context r1 = r12.f109939c
            java.lang.String r2 = r12.f109947k
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42067m.m73630a(r1, r0, r13, r2)
            r0.mo47723x(r5)
            return
        L_0x0083:
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r0 = r12.f109938b
            r1 = 2131102009(0x7f060939, float:1.7816444E38)
            r0.mo47722w(r1)
            android.content.Context r2 = r12.f109939c
            java.lang.String r3 = r12.f109947k
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42067m.m73631b(r2, r0, r13, r3)
            android.support.v7.widget.gm r13 = android.support.p033v7.widget.C0678gm.m2375e()
            r3 = 2131234155(0x7f080d6b, float:1.8084468E38)
            android.graphics.drawable.Drawable r13 = r13.mo3100c(r2, r3)
            r0.mo47694q(r13)
            android.graphics.drawable.Drawable r13 = r13.mutate()
            int r1 = androidx.core.content.C1878d.m5128a(r2, r1)
            androidx.core.graphics.drawable.C1929b.m5225f(r13, r1)
            r13 = 0
            r0.mo47720u(r13)
            android.content.res.Resources r13 = r2.getResources()
            r1 = 2131171224(0x7f071798, float:1.7956829E38)
            int r13 = r13.getDimensionPixelSize(r1)
            float r13 = (float) r13
            r0.mo47695r(r13)
            r0.mo47723x(r5)
            return
        L_0x00c2:
            boolean r0 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73922e()
            if (r0 == 0) goto L_0x00d6
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r0 = r12.f109938b
            android.content.res.ColorStateList r6 = r12.f109951o
            r0.mo47684o(r6)
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r0 = r12.f109938b
            android.content.res.ColorStateList r6 = r12.f109952p
            r0.mo47721v(r6)
        L_0x00d6:
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r12.f109940d
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            boolean r6 = r0.f110249p
            if (r6 == 0) goto L_0x0155
            boolean r6 = r0.f110250q
            if (r6 != 0) goto L_0x0155
            boolean r6 = r0.f110258y
            if (r6 != 0) goto L_0x0155
            android.content.Context r1 = r12.f109939c
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r2 = r12.f109938b
            int r0 = r0.f110240g
            com.google.android.libraries.social.peoplekit.configs.b r3 = r12.f109944h
            java.lang.String r5 = r12.f109947k
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42067m.m73631b(r1, r2, r13, r5)
            android.content.res.Resources r5 = r1.getResources()
            r6 = 2131171222(0x7f071796, float:1.7956824E38)
            int r5 = r5.getDimensionPixelSize(r6)
            float r5 = (float) r5
            r2.mo47695r(r5)
            android.content.res.Resources r5 = r1.getResources()
            r6 = 2131171229(0x7f07179d, float:1.7956839E38)
            int r5 = r5.getDimensionPixelSize(r6)
            float r5 = (float) r5
            r2.mo47662B(r5)
            boolean r5 = r13.mo44611C()
            if (r5 == 0) goto L_0x0123
            android.support.v7.widget.gm r13 = android.support.p033v7.widget.C0678gm.m2375e()
            android.graphics.drawable.Drawable r13 = r13.mo3100c(r1, r0)
            r2.mo47694q(r13)
            return
        L_0x0123:
            int r13 = r13.mo44621b()
            if (r13 != r4) goto L_0x0135
            android.support.v7.widget.gm r13 = android.support.p033v7.widget.C0678gm.m2375e()
            r0 = 2131234149(0x7f080d65, float:1.8084456E38)
            android.graphics.drawable.Drawable r13 = r13.mo3100c(r1, r0)
            goto L_0x0140
        L_0x0135:
            android.support.v7.widget.gm r13 = android.support.p033v7.widget.C0678gm.m2375e()
            r0 = 2131234279(0x7f080de7, float:1.808472E38)
            android.graphics.drawable.Drawable r13 = r13.mo3100c(r1, r0)
        L_0x0140:
            r2.mo47694q(r13)
            int r0 = r3.f110297p
            if (r0 == 0) goto L_0x0154
            android.graphics.drawable.Drawable r13 = r13.mutate()
            int r0 = r3.f110297p
            int r0 = androidx.core.content.C1878d.m5128a(r1, r0)
            androidx.core.graphics.drawable.C1929b.m5225f(r13, r0)
        L_0x0154:
            return
        L_0x0155:
            android.content.Context r0 = r12.f109939c
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r6 = r12.f109938b
            java.lang.String r7 = r12.f109947k
            com.google.android.libraries.social.peoplekit.configs.b r8 = r12.f109944h
            com.google.common.base.ax r9 = r12.f109954r
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42067m.m73631b(r0, r6, r13, r7)
            android.content.res.Resources r7 = r0.getResources()
            int r2 = r7.getDimensionPixelSize(r2)
            java.lang.String r7 = r13.mo44638s()
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            r11 = 138(0x8a, float:1.93E-43)
            if (r10 == 0) goto L_0x01ab
            java.lang.String r3 = r13.mo44634o()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0192
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.j r1 = new com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.j
            java.lang.String r13 = r13.mo44631l(r0)
            int r13 = com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42025b.m73580b(r0, r13, r8)
            r1.<init>(r0, r13, r2, r11)
            r6.mo47694q(r1)
            goto L_0x0246
        L_0x0192:
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.i r3 = new com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.i
            java.lang.String r4 = r13.mo44634o()
            java.lang.String r13 = r13.mo44631l(r0)
            int r13 = com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42025b.m73580b(r0, r13, r8)
            r3.<init>(r0, r4, r13, r2)
            r6.mo47694q(r3)
            r6.setForceDarkAllowed(r1)
            goto L_0x0246
        L_0x01ab:
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.j r13 = new com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.j
            r1 = 2131103600(0x7f060f70, float:1.781967E38)
            int r1 = androidx.core.content.C1878d.m5128a(r0, r1)
            r13.<init>(r0, r1, r2, r11)
            r6.mo47694q(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r7)
            if (r13 != 0) goto L_0x0246
            boolean r13 = com.google.android.libraries.social.p3267c.p3268a.C41921c.m73452a(r7)
            if (r13 == 0) goto L_0x0203
            com.google.android.libraries.glide.fife.g r13 = new com.google.android.libraries.glide.fife.g
            r13.<init>()
            r13.mo27321b(r3)
            r13.mo27321b(r4)
            r1 = 16
            r13.mo27321b(r1)
            r1 = 32
            r13.mo27321b(r1)
            boolean r1 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73920c()
            if (r1 == 0) goto L_0x01fd
            boolean r1 = r9.mo56113h()
            if (r1 == 0) goto L_0x01fd
            com.google.android.libraries.glide.fife.b r1 = new com.google.android.libraries.glide.fife.b
            com.google.android.libraries.glide.fife.a r2 = new com.google.android.libraries.glide.fife.a
            java.lang.Object r3 = r9.mo56107c()
            android.accounts.Account r3 = (android.accounts.Account) r3
            r2.<init>(r3)
            com.google.android.libraries.glide.fife.ProvidedFifeUrl r3 = new com.google.android.libraries.glide.fife.ProvidedFifeUrl
            r3.<init>((java.lang.String) r7)
            r1.<init>(r3, r13, r2)
            goto L_0x0204
        L_0x01fd:
            com.google.android.libraries.glide.fife.b r1 = new com.google.android.libraries.glide.fife.b
            r1.<init>(r7, r13)
            goto L_0x0204
        L_0x0203:
            r1 = r5
        L_0x0204:
            android.content.res.Resources r13 = r0.getResources()
            r2 = 2131171149(0x7f07174d, float:1.7956676E38)
            int r13 = r13.getDimensionPixelSize(r2)
            int r2 = r12.f109949m
            java.util.concurrent.atomic.AtomicInteger r3 = r12.f109950n
            r3.set(r2)
            com.bumptech.glide.manager.r r3 = com.bumptech.glide.C5543d.m14323c(r0)
            com.bumptech.glide.ad r0 = r3.mo12423b(r0)
            com.bumptech.glide.z r0 = r0.mo11865c()
            if (r1 != 0) goto L_0x0225
            goto L_0x0226
        L_0x0225:
            r7 = r1
        L_0x0226:
            com.bumptech.glide.z r0 = r0.mo12447i(r7)
            com.bumptech.glide.f.j r13 = com.bumptech.glide.p287f.C5593j.m14523g(r13, r13)
            com.bumptech.glide.z r13 = r0.mo11982o(r13)
            com.bumptech.glide.f.a r13 = r13.mo11988y()
            com.bumptech.glide.z r13 = (com.bumptech.glide.C6007z) r13
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.l r0 = new com.google.android.libraries.social.peoplekit.chips.viewcontrollers.l
            r0.<init>(r12, r2, r6)
            com.bumptech.glide.z r13 = r13.mo12439a(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.mo12453q(r0, r0)
        L_0x0246:
            com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip r13 = r12.f109938b
            r13.mo47723x(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42064j.mo44556e(com.google.android.libraries.social.peoplekit.common.dataservice.Channel):void");
    }
}
