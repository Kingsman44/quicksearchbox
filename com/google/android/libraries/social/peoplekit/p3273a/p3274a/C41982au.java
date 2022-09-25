package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42026c;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42027d;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.C42138b;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.au */
/* compiled from: PG */
public final class C41982au implements C42138b {

    /* renamed from: a */
    public final Context f109601a;

    /* renamed from: b */
    public final View f109602b;

    /* renamed from: c */
    public final C42027d f109603c;

    /* renamed from: d */
    public final TextView f109604d;

    /* renamed from: e */
    public final TextView f109605e;

    /* renamed from: f */
    public final TextView f109606f;

    /* renamed from: g */
    public final C42075e f109607g;

    /* renamed from: h */
    public final PeopleKitConfig f109608h;

    /* renamed from: i */
    public final PeopleKitVisualElementPath f109609i;

    /* renamed from: j */
    public final C42089b f109610j;

    /* renamed from: k */
    public C42141b f109611k;

    /* renamed from: l */
    public final C41968ag f109612l;

    /* renamed from: m */
    private final View f109613m;

    /* renamed from: n */
    private final PeopleKitSelectionModel f109614n;

    /* renamed from: o */
    private ColorStateList f109615o;

    /* renamed from: p */
    private Channel f109616p;

    public C41982au(Context context, ViewGroup viewGroup, C41968ag agVar, C42075e eVar, C42089b bVar, PeopleKitVisualElementPath peopleKitVisualElementPath, PeopleKitConfig peopleKitConfig, C42141b bVar2, PeopleKitSelectionModel peopleKitSelectionModel) {
        this.f109601a = context;
        this.f109612l = agVar;
        this.f109607g = eVar;
        this.f109608h = peopleKitConfig;
        this.f109610j = bVar;
        this.f109609i = peopleKitVisualElementPath;
        C42087a.m73675a(bVar2);
        this.f109611k = bVar2;
        this.f109614n = peopleKitSelectionModel;
        peopleKitSelectionModel.mo44747d(this);
        C42087a.m73676b(this.f109611k);
        View inflate = LayoutInflater.from(context).inflate(R.layout.flattened_peoplekit_row_view, viewGroup, false);
        this.f109602b = inflate;
        this.f109613m = inflate.findViewById(R.id.peoplekit_listview_flattened_row);
        this.f109604d = (TextView) inflate.findViewById(R.id.peoplekit_listview_contact_name);
        this.f109605e = (TextView) inflate.findViewById(R.id.peoplekit_listview_contact_method);
        this.f109606f = (TextView) inflate.findViewById(R.id.peoplekit_listview_status_text);
        C42026c cVar = new C42026c(context, eVar, peopleKitVisualElementPath);
        cVar.f109783d = peopleKitConfig;
        cVar.f109784e = bVar2;
        C42027d dVar = new C42027d(cVar);
        this.f109603c = dVar;
        dVar.f109790f = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_listview_icon_offset);
        ((RelativeLayout) inflate.findViewById(R.id.peoplekit_listview_row_avatar)).addView(dVar.f109785a);
        mo44445d();
    }

    /* renamed from: a */
    public final void mo44442a(String str, String str2, AutocompleteMatchInfo autocompleteMatchInfo, AutocompleteMatchInfo autocompleteMatchInfo2, Channel channel) {
        int i;
        int i2;
        if (TextUtils.isEmpty(str)) {
            this.f109604d.setText(str2);
            this.f109605e.setVisibility(8);
            return;
        }
        if (this.f109605e.getVisibility() == 8) {
            this.f109605e.setVisibility(0);
        }
        if (autocompleteMatchInfo == null || str == null || (i2 = autocompleteMatchInfo.f110029a) < 0 || i2 + autocompleteMatchInfo.f110030b > str.length()) {
            this.f109604d.setText(str);
        } else {
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(str);
            StyleSpan styleSpan = new StyleSpan(1);
            int i3 = autocompleteMatchInfo.f110029a;
            newSpannable.setSpan(styleSpan, i3, autocompleteMatchInfo.f110030b + i3, 33);
            this.f109604d.setText(newSpannable);
        }
        if (autocompleteMatchInfo2 == null || str2 == null || (i = autocompleteMatchInfo2.f110029a) < 0 || i + autocompleteMatchInfo2.f110030b > str2.length()) {
            this.f109605e.setText(str2);
        } else {
            Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(str2);
            StyleSpan styleSpan2 = new StyleSpan(1);
            int i4 = autocompleteMatchInfo2.f110029a;
            newSpannable2.setSpan(styleSpan2, i4, autocompleteMatchInfo2.f110030b + i4, 33);
            this.f109605e.setText(newSpannable2);
        }
        this.f109616p = channel;
        mo44446g(this.f109614n.mo44750f(channel));
    }

    /* renamed from: b */
    public final void mo44443b(boolean z) {
        if (z) {
            this.f109603c.f109785a.setAlpha(0.38f);
            int i = this.f109611k.f110287f;
            if (i != 0) {
                this.f109604d.setTextColor(C1878d.m5128a(this.f109601a, i));
                this.f109606f.setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110287f));
                return;
            }
            return;
        }
        this.f109603c.f109785a.setAlpha(1.0f);
        int i2 = this.f109611k.f110286e;
        if (i2 != 0) {
            this.f109604d.setTextColor(C1878d.m5128a(this.f109601a, i2));
            this.f109606f.setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
        }
    }

    /* renamed from: c */
    public final void mo44444c(String str) {
        this.f109606f.setText(str);
        this.f109606f.setVisibility(true != TextUtils.isEmpty(str) ? 0 : 8);
    }

    /* renamed from: d */
    public final void mo44445d() {
        View findViewById = this.f109602b.findViewById(R.id.peoplekit_listview_flattened_permissions_row);
        View findViewById2 = this.f109602b.findViewById(R.id.peoplekit_listview_no_contacts_row);
        View findViewById3 = this.f109602b.findViewById(R.id.peoplekit_listview_no_results_fullscreen);
        View findViewById4 = this.f109602b.findViewById(R.id.peoplekit_listview_flattened_show_hidden_suggestions_row);
        View findViewById5 = this.f109602b.findViewById(R.id.peoplekit_listview_flattened_header);
        int i = this.f109611k.f110282a;
        if (i != 0) {
            this.f109602b.setBackgroundColor(C1878d.m5128a(this.f109601a, i));
            this.f109613m.setBackgroundColor(C1878d.m5128a(this.f109601a, this.f109611k.f110282a));
            findViewById.setBackgroundColor(C1878d.m5128a(this.f109601a, this.f109611k.f110282a));
            findViewById2.setBackgroundColor(C1878d.m5128a(this.f109601a, this.f109611k.f110282a));
            findViewById3.setBackgroundColor(C1878d.m5128a(this.f109601a, this.f109611k.f110282a));
            findViewById4.setBackgroundColor(C1878d.m5128a(this.f109601a, this.f109611k.f110282a));
            findViewById5.setBackgroundColor(C1878d.m5128a(this.f109601a, this.f109611k.f110282a));
        }
        if (this.f109611k.f110286e != 0) {
            ((TextView) findViewById.findViewById(R.id.peoplekit_listview_flattened_permissions_text)).setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
            this.f109604d.setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
            this.f109606f.setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
            ((TextView) findViewById2.findViewById(R.id.peoplekit_listview_no_contacts_text)).setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
            ((TextView) findViewById3.findViewById(R.id.no_results_header)).setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
            ((TextView) findViewById3.findViewById(R.id.no_results_body)).setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
            ((TextView) findViewById4.findViewById(R.id.peoplekit_listview_flattened_show_hidden_suggestions_text)).setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
            ((TextView) this.f109602b.findViewById(R.id.peoplekit_listview_flattened_main_header)).setTextColor(C1878d.m5128a(this.f109601a, this.f109611k.f110286e));
        }
        int i2 = this.f109611k.f110287f;
        if (i2 != 0) {
            this.f109605e.setTextColor(C1878d.m5128a(this.f109601a, i2));
        }
        if (this.f109615o == null) {
            this.f109615o = this.f109605e.getTextColors();
        }
    }

    /* renamed from: e */
    public final void mo44422e(Channel channel) {
        if (this.f109614n.mo44750f(this.f109616p)) {
            mo44446g(true);
        }
    }

    /* renamed from: f */
    public final void mo44423f(Channel channel, CoalescedChannels coalescedChannels) {
    }

    /* renamed from: g */
    public final void mo44446g(boolean z) {
        if (((PeopleKitConfigImpl) this.f109608h).f110258y) {
            if (z) {
                this.f109605e.setTextColor(this.f109615o);
            } else if (this.f109611k.f110300s) {
                this.f109605e.setTextColor(C1878d.m5128a(this.f109601a, R.color.gm3_dark_primary_text_disable_only));
            } else {
                this.f109605e.setTextColor(C1878d.m5128a(this.f109601a, R.color.gm3_primary_text_disable_only));
            }
        }
    }

    /* renamed from: t */
    public final void mo44429t() {
    }
}
