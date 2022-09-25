package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p096h.C1950c;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42055a;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42056b;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42064j;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChipInfo;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42094d;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42102l;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3280b.C42081a;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42090c;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.C42138b;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41979ar;
import com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41994m;
import com.google.android.libraries.social.peoplekit.p3275b.p3276a.C42038c;
import com.google.android.libraries.social.peoplekit.p3275b.p3276a.C42044i;
import com.google.android.material.chip.C44596f;
import com.google.android.material.chip.ChipGroup;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58557jl;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p5602o.p5607c.p5608a.p5609a.C71912k;
import p5602o.p5607c.p5608a.p5609a.C71913l;
import p5602o.p5607c.p5608a.p5609a.C71916o;
import p5602o.p5607c.p5608a.p5609a.C71917p;
import p5602o.p5607c.p5608a.p5609a.C71919r;
import p5602o.p5607c.p5608a.p5609a.C71920s;

/* renamed from: com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.p */
/* compiled from: PG */
public final class C42023p implements C42102l, C42138b, C42090c, C42081a {

    /* renamed from: a */
    public final ViewGroup f109724a;

    /* renamed from: b */
    public final Context f109725b;

    /* renamed from: c */
    public MaxHeightScrollView f109726c;

    /* renamed from: d */
    public final ChipGroup f109727d;

    /* renamed from: e */
    public final ListenerEditText f109728e;

    /* renamed from: f */
    public final TextView f109729f;

    /* renamed from: g */
    public final TextView f109730g;

    /* renamed from: h */
    public final C41994m f109731h;

    /* renamed from: i */
    public final PeopleKitDataLayer f109732i;

    /* renamed from: j */
    public final PeopleKitSelectionModel f109733j;

    /* renamed from: k */
    public final C42075e f109734k;

    /* renamed from: l */
    public final C42089b f109735l;

    /* renamed from: m */
    public final PeopleKitVisualElementPath f109736m;

    /* renamed from: n */
    public boolean f109737n = true;

    /* renamed from: o */
    public boolean f109738o = true;

    /* renamed from: p */
    public String f109739p;

    /* renamed from: q */
    public C42090c f109740q;

    /* renamed from: r */
    public C42141b f109741r;

    /* renamed from: s */
    public boolean f109742s;

    /* renamed from: t */
    public final List f109743t = new ArrayList();

    /* renamed from: u */
    public boolean f109744u = false;

    /* renamed from: v */
    public C42038c f109745v;

    /* renamed from: w */
    private final ViewGroup f109746w;

    /* renamed from: x */
    private final PeopleKitConfig f109747x;

    /* renamed from: y */
    private int f109748y = -1;

    /* renamed from: z */
    private final int f109749z;

    public C42023p(Context context, ExecutorService executorService, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, C42075e eVar, PeopleKitConfig peopleKitConfig, C41960a aVar, PeopleKitVisualElementPath peopleKitVisualElementPath, C42141b bVar) {
        Context context2 = context;
        PeopleKitDataLayer peopleKitDataLayer2 = peopleKitDataLayer;
        PeopleKitSelectionModel peopleKitSelectionModel2 = peopleKitSelectionModel;
        C42075e eVar2 = eVar;
        PeopleKitConfig peopleKitConfig2 = peopleKitConfig;
        this.f109725b = context2;
        this.f109732i = peopleKitDataLayer2;
        this.f109733j = peopleKitSelectionModel2;
        this.f109734k = eVar2;
        this.f109747x = peopleKitConfig2;
        C42087a.m73675a(bVar);
        this.f109741r = bVar;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144475p));
        peopleKitVisualElementPath2.mo44564a(peopleKitVisualElementPath.f109973a);
        this.f109736m = peopleKitVisualElementPath2;
        eVar2.mo44577c(-1, peopleKitVisualElementPath2);
        eVar2.mo44575a("TimeToAutocompleteSelection").mo44570b();
        PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) peopleKitConfig2;
        if (peopleKitConfigImpl.f110248o) {
            this.f109739p = context2.getString(R.string.peoplekit_autocomplete_hint_text);
        } else {
            this.f109739p = context2.getString(R.string.peoplekit_autocomplete_hint_text_no_phone_number);
        }
        peopleKitSelectionModel2.mo44747d(this);
        C42087a.m73676b(this.f109741r);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.peoplekit_chipgroup_bar, (ViewGroup) null);
        this.f109724a = viewGroup;
        peopleKitDataLayer2.mo44662g(this);
        m73544u();
        ChipGroup chipGroup = (ChipGroup) viewGroup.findViewById(R.id.peoplekit_autocomplete_chip_group);
        this.f109727d = chipGroup;
        chipGroup.mo47726a(context.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_autocomplete_chip_group_spacing));
        chipGroup.mo47727b(0);
        this.f109749z = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_autocomplete_chip_bar_height);
        C42087a.m73676b(this.f109741r);
        ListenerEditText listenerEditText = (ListenerEditText) LayoutInflater.from(context).inflate(R.layout.peoplekit_edittext, chipGroup, false);
        this.f109728e = listenerEditText;
        listenerEditText.setCursorVisible(false);
        C42089b bVar2 = new C42089b(context2, this, peopleKitConfigImpl.f110246m, eVar2);
        this.f109735l = bVar2;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.search_view_container);
        this.f109746w = viewGroup2;
        ViewGroup viewGroup3 = viewGroup2;
        ListenerEditText listenerEditText2 = listenerEditText;
        PeopleKitConfigImpl peopleKitConfigImpl2 = peopleKitConfigImpl;
        C41994m mVar = new C41994m(context, executorService, peopleKitDataLayer, peopleKitSelectionModel, eVar, peopleKitConfig, aVar, peopleKitVisualElementPath2, bVar2, bVar, this);
        this.f109731h = mVar;
        C42013f fVar = new C42013f(this);
        C41979ar arVar = mVar.f109651b;
        arVar.f109589n = fVar;
        arVar.f109590o = new C42014g(this);
        viewGroup3.addView(mVar.f109650a);
        viewGroup3.setVisibility(8);
        listenerEditText2.setOnEditorActionListener(new C42015h(this));
        C42075e eVar3 = eVar;
        ListenerEditText listenerEditText3 = listenerEditText2;
        listenerEditText3.addTextChangedListener(new C42017j(this, eVar3));
        listenerEditText3.setOnKeyListener(new C42018k(this, peopleKitSelectionModel));
        listenerEditText3.f109701a = new C42019l(this, eVar3);
        listenerEditText3.setOnFocusChangeListener(new C42020m(this, eVar3));
        ChipGroup chipGroup2 = chipGroup;
        chipGroup2.addView(listenerEditText3);
        ViewGroup viewGroup4 = viewGroup;
        TextView textView = (TextView) viewGroup4.findViewById(R.id.peoplekit_autocomplete_to_prefix);
        this.f109729f = textView;
        if (peopleKitConfigImpl2.f110245l) {
            C42087a.m73676b(this.f109741r);
            TextView textView2 = (TextView) LayoutInflater.from(context).inflate(R.layout.peoplekit_autocomplete_see_other_names, viewGroup4, true).findViewById(R.id.peoplekit_autocomplete_see_others_names);
            this.f109730g = textView2;
            mo44491i(textView2);
        } else {
            this.f109730g = null;
        }
        chipGroup2.setOnClickListener(new C42021n(this));
        textView.setOnClickListener(new C42022o(this));
        m73545v();
        mo44495m();
        viewGroup4.addOnLayoutChangeListener(new C42008a(this));
    }

    /* renamed from: r */
    public static boolean m73543r(CharSequence charSequence, char c, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (charSequence.charAt(i + i3) == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    private final void m73544u() {
        if (this.f109733j.mo44746c().isEmpty()) {
            this.f109724a.setImportantForAccessibility(2);
            return;
        }
        String str = BuildConfig.FLAVOR;
        for (Channel channel : this.f109733j.mo44746c()) {
            if (!TextUtils.isEmpty(channel.mo44631l(this.f109725b))) {
                str = str.concat(channel.mo44631l(this.f109725b)).concat(",");
            }
        }
        this.f109724a.setImportantForAccessibility(0);
        this.f109724a.setContentDescription(this.f109725b.getString(R.string.peoplekit_autocomplete_recipient_list, new Object[]{str}));
    }

    /* renamed from: v */
    private final void m73545v() {
        if (this.f109743t.isEmpty()) {
            this.f109728e.setHint(C58837ba.m90858g(this.f109739p));
            mo44494l();
        }
    }

    /* renamed from: w */
    private final void m73546w() {
        View findViewById = this.f109724a.findViewById(R.id.divider);
        if (this.f109730g != null) {
            int dimensionPixelSize = this.f109725b.getResources().getDimensionPixelSize(findViewById.getVisibility() == 8 ? R.dimen.peoplekit_ui_autocomplete_chip_group_spacing : R.dimen.peoplekit_ui_autocomplete_recipients_spacing);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f109730g.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, dimensionPixelSize);
        }
    }

    /* renamed from: a */
    public final void mo44450a(String[] strArr) {
        C42090c cVar = this.f109740q;
        if (cVar != null) {
            cVar.mo44450a(strArr);
            return;
        }
        Context context = this.f109725b;
        if (context instanceof Activity) {
            ((Activity) context).requestPermissions(strArr, 1234);
            return;
        }
        throw new IllegalStateException("PeopleKit needs an activity or a permission listener to handle permissions.");
    }

    /* renamed from: b */
    public final boolean mo44451b() {
        C42090c cVar = this.f109740q;
        if (cVar != null) {
            return cVar.mo44451b();
        }
        Context context = this.f109725b;
        if (context instanceof Activity) {
            return ((Activity) context).shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS");
        }
        throw new IllegalStateException("PeopleKit needs an activity or a permission listener to handle permissions.");
    }

    /* renamed from: c */
    public final void mo44489c(String str) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f109725b.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(32);
            obtain.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    /* renamed from: d */
    public final void mo44453d(List list, C42094d dVar) {
        if (!TextUtils.isEmpty(this.f109728e.getText()) && this.f109728e.hasFocus()) {
            mo44493k(true);
            mo44492j(0);
        }
    }

    /* renamed from: e */
    public final void mo44422e(Channel channel) {
        int i = 0;
        while (true) {
            if (i >= this.f109743t.size()) {
                break;
            }
            C42064j jVar = (C42064j) this.f109743t.get(i);
            ChannelChip channelChip = jVar.f109938b;
            if (channelChip == null || !channelChip.f109916a.f109918a.equals(channel)) {
                i++;
            } else {
                if (jVar.f109948l) {
                    this.f109748y = i;
                }
                this.f109727d.removeView(jVar.f109937a);
                this.f109743t.remove(jVar);
                C42075e eVar = this.f109734k;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144474o));
                peopleKitVisualElementPath.mo44564a(this.f109736m.f109973a);
                eVar.mo44577c(1, peopleKitVisualElementPath);
                if (jVar.f109949m == 2) {
                    C42075e eVar2 = this.f109734k;
                    PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                    peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144480u));
                    peopleKitVisualElementPath2.mo44564a(this.f109736m.f109973a);
                    eVar2.mo44577c(1, peopleKitVisualElementPath2);
                }
            }
        }
        m73545v();
        mo44496n();
        mo44498p();
        m73544u();
        if (this.f109746w.getVisibility() == 0) {
            this.f109731h.mo44462c(this.f109728e.getText().toString(), this.f109728e);
        }
    }

    /* renamed from: f */
    public final void mo44423f(Channel channel, CoalescedChannels coalescedChannels) {
        if (C42131a.m73921d() && !this.f109743t.isEmpty()) {
            ((C42064j) C58557jl.m90131l(this.f109743t)).mo44553b(false);
        }
        C42064j jVar = new C42064j(this.f109725b, this.f109747x, this.f109734k, this.f109736m, this.f109733j, this.f109741r);
        if (this.f109742s) {
            jVar.f109946j = true;
        }
        jVar.mo44554c(this.f109741r);
        ChannelChip channelChip = jVar.f109938b;
        ChipInfo chipInfo = channelChip.f109916a;
        chipInfo.f109918a = channel;
        chipInfo.f109919b = coalescedChannels;
        channelChip.mo47683n(false);
        jVar.f109938b.setEllipsize(TextUtils.TruncateAt.END);
        int i = jVar.f109944h.f110282a;
        if (i != 0) {
            jVar.f109938b.mo47693p(i);
            if (C42131a.m73922e()) {
                jVar.f109951o = jVar.f109938b.mo47674g();
            }
        }
        int i2 = jVar.f109944h.f110293l;
        if (i2 != 0) {
            jVar.f109938b.mo47722w(i2);
            if (C42131a.m73922e()) {
                jVar.f109952p = jVar.f109938b.mo47678h();
            }
        }
        int i3 = jVar.f109944h.f110286e;
        if (i3 != 0) {
            jVar.f109938b.setTextColor(C1878d.m5128a(jVar.f109939c, i3));
        }
        if (TextUtils.isEmpty(jVar.f109947k)) {
            jVar.f109947k = channel.mo44631l(jVar.f109939c);
        }
        if (!TextUtils.isEmpty(jVar.f109947k) || !TextUtils.isEmpty(channel.mo44630k(jVar.f109939c))) {
            jVar.f109938b.setContentDescription(jVar.f109947k + ", " + channel.mo44630k(jVar.f109939c));
        }
        jVar.mo44556e(channel);
        Drawable c = C0678gm.m2375e().mo3100c(jVar.f109939c, R.drawable.quantum_gm_ic_expand_less_vd_theme_24);
        Drawable c2 = C0678gm.m2375e().mo3100c(jVar.f109939c, R.drawable.quantum_gm_ic_expand_more_vd_theme_24);
        jVar.mo44552a(jVar.f109938b, c2);
        ChannelChip channelChip2 = jVar.f109938b;
        float dimensionPixelSize = (float) jVar.f109939c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_chevron_size);
        C44596f fVar = channelChip2.f116093d;
        if (fVar != null) {
            fVar.mo47786v(dimensionPixelSize);
        }
        jVar.f109938b.mo47724y((float) jVar.f109939c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_end_spacing));
        ChannelChip channelChip3 = jVar.f109938b;
        String string = jVar.f109939c.getString(R.string.peoplekit_expand_button_content_description, new Object[]{jVar.f109947k});
        C44596f fVar2 = channelChip3.f116093d;
        if (!(fVar2 == null || fVar2.f116166l == string)) {
            C1950c a = C1950c.m5272a();
            fVar2.f116166l = a.mo5100e(string, a.f5867d);
            fVar2.invalidateSelf();
        }
        jVar.f109938b.setOnClickListener(new C42055a(jVar, c, channel, c2));
        ChannelChip channelChip4 = jVar.f109938b;
        channelChip4.f116094e = new C42056b(jVar);
        channelChip4.mo47665E();
        C42075e eVar = jVar.f109942f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144473n));
        peopleKitVisualElementPath.mo44564a(jVar.f109941e.f109973a);
        eVar.mo44577c(-1, peopleKitVisualElementPath);
        jVar.f109938b.setEnabled(true);
        jVar.f109953q = new C42009b(this);
        mo44497o(channel, jVar);
        View view = jVar.f109937a;
        int i4 = this.f109748y;
        if (i4 != -1) {
            this.f109743t.add(i4, jVar);
            this.f109727d.addView(view, this.f109748y);
            this.f109748y = -1;
        } else {
            this.f109743t.add(jVar);
            this.f109727d.addView(view, this.f109743t.size() - 1);
            if (this.f109728e.hasFocus() && this.f109726c != null) {
                this.f109727d.post(new C42010c(this));
            }
        }
        if (this.f109743t.size() == 1) {
            this.f109728e.setHint((CharSequence) null);
        }
        if (((PeopleKitConfigImpl) this.f109747x).f110256w && channel.mo44620a() == 3 && channel.mo44617I() == 3 && channel.mo44616H() != 2 && this.f109745v != null) {
            new ArrayList().add(channel);
        }
        mo44492j(8);
        this.f109738o = false;
        this.f109728e.setText(BuildConfig.FLAVOR);
        mo44496n();
        mo44498p();
        m73544u();
        Stopwatch a2 = this.f109734k.mo44575a("TimeToAutocompleteSelection");
        if (a2.f109976c && (channel.mo44620a() == 1 || channel.mo44620a() == 3)) {
            C42075e eVar2 = this.f109734k;
            C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
            kVar.copyOnWrite();
            C71913l lVar = (C71913l) kVar.instance;
            lVar.f191526b = 4;
            lVar.f191525a |= 1;
            C71916o oVar = (C71916o) C71917p.f191532e.createBuilder();
            oVar.copyOnWrite();
            C71917p pVar = (C71917p) oVar.instance;
            pVar.f191535b = 16;
            pVar.f191534a |= 1;
            long a3 = a2.mo44569a();
            oVar.copyOnWrite();
            C71917p pVar2 = (C71917p) oVar.instance;
            pVar2.f191534a |= 2;
            pVar2.f191536c = a3;
            int e = this.f109734k.mo44579e();
            oVar.copyOnWrite();
            C71917p pVar3 = (C71917p) oVar.instance;
            int i5 = e - 1;
            if (e != 0) {
                pVar3.f191537d = i5;
                pVar3.f191534a = 4 | pVar3.f191534a;
                kVar.copyOnWrite();
                C71913l lVar2 = (C71913l) kVar.instance;
                C71917p pVar4 = (C71917p) oVar.build();
                pVar4.getClass();
                lVar2.f191529e = pVar4;
                lVar2.f191525a = 8 | lVar2.f191525a;
                C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
                int f = this.f109734k.mo44580f();
                rVar.copyOnWrite();
                C71920s sVar = (C71920s) rVar.instance;
                int i6 = f - 1;
                if (f != 0) {
                    sVar.f191542b = i6;
                    sVar.f191541a |= 1;
                    rVar.copyOnWrite();
                    C71920s sVar2 = (C71920s) rVar.instance;
                    sVar2.f191543c = 2;
                    sVar2.f191541a |= 2;
                    kVar.copyOnWrite();
                    C71913l lVar3 = (C71913l) kVar.instance;
                    C71920s sVar3 = (C71920s) rVar.build();
                    sVar3.getClass();
                    lVar3.f191527c = sVar3;
                    lVar3.f191525a |= 2;
                    eVar2.mo44576b((C71913l) kVar.build());
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        a2.mo44570b();
    }

    /* renamed from: g */
    public final void mo44456g(List list, C42094d dVar) {
    }

    /* renamed from: h */
    public final void mo44490h(boolean z) {
        this.f109728e.setVisibility(0);
        this.f109728e.requestFocus();
        ListenerEditText listenerEditText = this.f109728e;
        InputMethodManager inputMethodManager = (InputMethodManager) this.f109725b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(listenerEditText, 1);
        }
    }

    /* renamed from: i */
    public final void mo44491i(View view) {
        View findViewById = this.f109724a.findViewById(R.id.divider);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.addRule(3, view.getId());
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    public final void mo44492j(int i) {
        if (this.f109746w.getVisibility() != i) {
            this.f109746w.setVisibility(i);
            mo44489c(this.f109725b.getString(i == 0 ? R.string.peoplekit_autocomplete_dropdown_opened : R.string.peoplekit_autocomplete_dropdown_closed));
            if (C42131a.m73927j() && ((PeopleKitConfigImpl) this.f109747x).f110255v && i == 8) {
                C42038c cVar = this.f109745v;
                if (cVar != null) {
                    boolean z = this.f109744u;
                    if (C42131a.m73927j()) {
                        C42044i iVar = cVar.f109837b;
                        if (((PeopleKitConfigImpl) iVar.f109849e).f110255v && z) {
                            iVar.f109851g.mo44452c();
                        }
                    }
                }
                this.f109744u = false;
            }
        }
    }

    /* renamed from: k */
    public final void mo44493k(boolean z) {
        View findViewById = this.f109724a.findViewById(R.id.divider);
        int i = 0;
        if (findViewById.getVisibility() == (true != z ? 0 : 8)) {
            if (true != z) {
                i = 8;
            }
            findViewById.setVisibility(i);
            m73546w();
        }
    }

    /* renamed from: l */
    public final void mo44494l() {
        this.f109728e.setVisibility(0);
    }

    /* renamed from: m */
    public final void mo44495m() {
        int i = this.f109741r.f110282a;
        if (i != 0) {
            this.f109724a.setBackgroundColor(C1878d.m5128a(this.f109725b, i));
        }
        int i2 = this.f109741r.f110287f;
        if (i2 != 0) {
            this.f109729f.setTextColor(C1878d.m5128a(this.f109725b, i2));
            TextView textView = this.f109730g;
            if (textView != null) {
                textView.setTextColor(C1878d.m5128a(this.f109725b, this.f109741r.f110287f));
            }
        }
        int i3 = this.f109741r.f110286e;
        if (i3 != 0) {
            this.f109728e.setTextColor(C1878d.m5128a(this.f109725b, i3));
        }
        int i4 = this.f109741r.f110291j;
        if (i4 != 0) {
            this.f109728e.setHintTextColor(C1878d.m5128a(this.f109725b, i4));
        }
        for (C42064j c : this.f109743t) {
            c.mo44554c(this.f109741r);
        }
        if (this.f109741r.f110293l != 0) {
            this.f109724a.findViewById(R.id.divider).setBackgroundColor(C1878d.m5128a(this.f109725b, this.f109741r.f110293l));
        }
        int i5 = this.f109741r.f110296o;
    }

    /* renamed from: n */
    public final void mo44496n() {
        ViewGroup.LayoutParams layoutParams = this.f109728e.getLayoutParams();
        if (this.f109743t.isEmpty()) {
            layoutParams.width = -1;
            this.f109728e.setLayoutParams(layoutParams);
        } else if (this.f109727d.getVisibility() != 8 && this.f109727d.getWidth() != 0) {
            int paddingLeft = this.f109727d.getPaddingLeft();
            int width = this.f109727d.getWidth() - this.f109727d.getPaddingRight();
            int i = 0;
            for (int i2 = 0; i2 < this.f109743t.size(); i2++) {
                ChannelChip channelChip = ((C42064j) this.f109743t.get(i2)).f109938b;
                float measureText = channelChip.getPaint().measureText(channelChip.getText().toString());
                int width2 = this.f109727d.getWidth();
                int paddingLeft2 = this.f109727d.getPaddingLeft();
                int min = Math.min(((int) measureText) + 1 + channelChip.getPaddingLeft() + channelChip.getPaddingRight(), (width2 - paddingLeft2) - this.f109727d.getPaddingRight());
                if (paddingLeft + min > width) {
                    paddingLeft = this.f109727d.getPaddingLeft();
                }
                paddingLeft += min + this.f109727d.f116112a;
            }
            if (!TextUtils.isEmpty(this.f109728e.getText())) {
                i = Math.max(((int) this.f109728e.getPaint().measureText(this.f109728e.getText().toString())) + 1 + this.f109728e.getPaddingLeft() + this.f109728e.getPaddingRight(), this.f109749z);
            }
            int max = Math.max(i, this.f109749z);
            int width3 = (this.f109727d.getWidth() - paddingLeft) - this.f109727d.getPaddingRight();
            if (width3 >= max) {
                if (layoutParams.width != -2) {
                    layoutParams.width = -2;
                    this.f109728e.setLayoutParams(layoutParams);
                }
                if (this.f109728e.getMinWidth() != width3) {
                    this.f109728e.setMinWidth(width3);
                }
            } else if (layoutParams.width != -1) {
                layoutParams.width = -1;
                this.f109728e.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: o */
    public final void mo44497o(Channel channel, C42064j jVar) {
        if (((PeopleKitConfigImpl) this.f109747x).f110256w) {
            int I = channel.mo44617I();
            int H = channel.mo44616H();
            if (I == 0) {
                I = 0;
            } else if (H != 0 && I == 3) {
                if (H == 2) {
                    jVar.mo44555d(4, channel);
                    return;
                } else {
                    jVar.mo44555d(5, channel);
                    return;
                }
            }
            if (C42131a.m73922e() && I != 0) {
                jVar.mo44555d(0, channel);
            }
        }
    }

    /* renamed from: p */
    public final void mo44498p() {
        if (this.f109730g != null) {
            int i = 8;
            if (!this.f109743t.isEmpty()) {
                int i2 = 0;
                boolean z = false;
                while (true) {
                    boolean z2 = true;
                    if (i2 >= this.f109743t.size()) {
                        break;
                    }
                    Channel channel = ((C42064j) this.f109743t.get(i2)).f109938b.f109916a.f109918a;
                    if (!channel.mo44644y() || channel.mo44612D()) {
                        z2 = false;
                    }
                    z |= z2;
                    i2++;
                }
                TextView textView = this.f109730g;
                if (true == z) {
                    i = 0;
                }
                textView.setVisibility(i);
                m73546w();
                return;
            }
            this.f109730g.setVisibility(8);
        }
    }

    /* renamed from: q */
    public final boolean mo44499q() {
        Channel channel;
        if (((PeopleKitConfigImpl) this.f109747x).f110251r) {
            String str = BuildConfig.FLAVOR;
            boolean z = false;
            for (String str2 : C58869cf.m90937c(C58837ba.m90854c(",|:|;")).mo56151a().mo56152f(C58911u.f156751b).mo56153g(this.f109728e.getText().toString())) {
                PeopleKitDataLayer peopleKitDataLayer = this.f109732i;
                Context context = this.f109725b;
                int indexOf = str2.indexOf(60);
                int indexOf2 = str2.indexOf(62, indexOf);
                if (indexOf == -1 || indexOf2 != str2.length() - 1) {
                    channel = peopleKitDataLayer.mo44658c(str2, context);
                } else {
                    channel = peopleKitDataLayer.mo44659d(str2.substring(0, indexOf).trim(), str2.substring(indexOf + 1, indexOf2).trim(), context);
                }
                PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) this.f109747x;
                if ((peopleKitConfigImpl.f110252s || !C42096f.m73800e(channel, peopleKitConfigImpl.f110234a, peopleKitConfigImpl.f110238e)) && (channel.mo44621b() == 1 || (((PeopleKitConfigImpl) this.f109747x).f110248o && channel.mo44621b() == 2))) {
                    this.f109731h.mo44464f(channel, false);
                    List<Channel> asList = Arrays.asList(new Channel[]{channel});
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Channel channel2 : asList) {
                        if (TextUtils.isEmpty(channel2.mo44638s())) {
                            arrayList.add(channel2);
                        }
                        TextUtils.isEmpty(channel2.mo44635p());
                        channel2.mo44621b();
                    }
                    if (!arrayList.isEmpty() || !arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                        this.f109732i.mo44673r(arrayList, arrayList2, arrayList3, new C42012e(this));
                    }
                    z = true;
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat(", ");
                    }
                    str = str.concat(String.valueOf(str2));
                }
            }
            if (z) {
                this.f109738o = false;
                this.f109728e.setText(str);
                ListenerEditText listenerEditText = this.f109728e;
                listenerEditText.setSelection(listenerEditText.getText().length());
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final void mo44457s(List list) {
    }

    /* renamed from: t */
    public final void mo44429t() {
    }
}
