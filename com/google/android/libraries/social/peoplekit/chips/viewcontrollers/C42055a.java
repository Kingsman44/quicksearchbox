package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatImageView;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42009b;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42026c;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42027d;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.List;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.a */
/* compiled from: PG */
public final class C42055a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Drawable f109920a;

    /* renamed from: b */
    final /* synthetic */ Channel f109921b;

    /* renamed from: c */
    final /* synthetic */ Drawable f109922c;

    /* renamed from: d */
    final /* synthetic */ C42064j f109923d;

    public C42055a(C42064j jVar, Drawable drawable, Channel channel, Drawable drawable2) {
        this.f109923d = jVar;
        this.f109920a = drawable;
        this.f109921b = channel;
        this.f109922c = drawable2;
    }

    public final void onClick(View view) {
        View view2;
        String str;
        C42064j jVar = this.f109923d;
        ChannelChip channelChip = jVar.f109938b;
        if (!channelChip.f109917b) {
            channelChip.f109917b = true;
            jVar.mo44552a(channelChip, this.f109920a);
            C42064j jVar2 = this.f109923d;
            Channel channel = this.f109921b;
            LinearLayout linearLayout = new LinearLayout(jVar2.f109939c);
            PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) jVar2.f109940d;
            if (peopleKitConfigImpl.f110249p || peopleKitConfigImpl.f110250q) {
                C42087a.m73676b(jVar2.f109944h);
                view2 = LayoutInflater.from(jVar2.f109939c).inflate(R.layout.peoplekit_chip_multiple_alternative_popup, linearLayout);
            } else {
                C42087a.m73676b(jVar2.f109944h);
                view2 = LayoutInflater.from(jVar2.f109939c).inflate(R.layout.peoplekit_chip_single_alternative_popup, linearLayout);
            }
            C42026c cVar = new C42026c(jVar2.f109939c, jVar2.f109942f, jVar2.f109941e);
            cVar.f109783d = jVar2.f109940d;
            cVar.f109784e = jVar2.f109944h;
            C42027d dVar = new C42027d(cVar);
            ((RelativeLayout) view2.findViewById(R.id.peoplekit_autocomplete_popup_avatar)).addView(dVar.f109785a);
            dVar.mo44509e(channel);
            TextView textView = (TextView) view2.findViewById(R.id.peoplekit_autocomplete_popup_contact_name);
            textView.setText(jVar2.f109947k);
            int i = jVar2.f109944h.f110286e;
            if (i != 0) {
                textView.setTextColor(C1878d.m5128a(jVar2.f109939c, i));
            }
            if (jVar2.f109944h.f110293l != 0) {
                view2.findViewById(R.id.peoplekit_chip_popup_menu_divider).setBackgroundColor(C1878d.m5128a(jVar2.f109939c, jVar2.f109944h.f110293l));
            }
            PeopleKitConfigImpl peopleKitConfigImpl2 = (PeopleKitConfigImpl) jVar2.f109940d;
            boolean z = peopleKitConfigImpl2.f110249p;
            int i2 = R.id.peoplekit_autocomplete_popup_contact_method;
            if (z || peopleKitConfigImpl2.f110250q) {
                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.peoplekit_autocomplete_popup_methods);
                CoalescedChannels coalescedChannels = jVar2.f109938b.f109916a.f109919b;
                int i3 = R.layout.peoplekit_chip_popup_contact_method;
                if (coalescedChannels != null) {
                    List c = coalescedChannels.mo44648c();
                    int i4 = 0;
                    while (i4 < c.size()) {
                        Channel channel2 = (Channel) c.get(i4);
                        C42087a.m73676b(jVar2.f109944h);
                        View inflate = LayoutInflater.from(jVar2.f109939c).inflate(i3, linearLayout2, false);
                        int i5 = jVar2.f109944h.f110288g;
                        if (i5 != 0) {
                            inflate.setBackgroundColor(C1878d.m5128a(jVar2.f109939c, i5));
                        }
                        TextView textView2 = (TextView) inflate.findViewById(i2);
                        textView2.setText(channel2.mo44630k(jVar2.f109939c));
                        int i6 = jVar2.f109944h.f110287f;
                        if (i6 != 0) {
                            textView2.setTextColor(C1878d.m5128a(jVar2.f109939c, i6));
                        }
                        if (!((PeopleKitConfigImpl) jVar2.f109940d).f110250q) {
                            if (jVar2.f109943g.mo44751g(channel2)) {
                                AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.peoplekit_popup_checkmark);
                                int i7 = jVar2.f109944h.f110289h;
                                if (i7 != 0) {
                                    appCompatImageView.setColorFilter(C1878d.m5128a(jVar2.f109939c, i7));
                                }
                                appCompatImageView.setVisibility(0);
                                Context context = jVar2.f109939c;
                                inflate.setContentDescription(context.getString(R.string.peoplekit_contact_name_and_method_selected_description, new Object[]{channel2.mo44630k(context), BuildConfig.FLAVOR}));
                            } else {
                                Context context2 = jVar2.f109939c;
                                inflate.setContentDescription(context2.getString(R.string.peoplekit_contact_method_unselected_description, new Object[]{channel2.mo44630k(context2)}));
                            }
                            inflate.setOnClickListener(new C42063i(jVar2, channel2, channel));
                        }
                        linearLayout2.addView(inflate);
                        i4++;
                        i2 = R.id.peoplekit_autocomplete_popup_contact_method;
                        i3 = R.layout.peoplekit_chip_popup_contact_method;
                    }
                } else if (!TextUtils.isEmpty(channel.mo44635p())) {
                    C42087a.m73676b(jVar2.f109944h);
                    View inflate2 = LayoutInflater.from(jVar2.f109939c).inflate(R.layout.peoplekit_chip_popup_contact_method, linearLayout2, false);
                    int i8 = jVar2.f109944h.f110288g;
                    if (i8 != 0) {
                        inflate2.setBackgroundColor(C1878d.m5128a(jVar2.f109939c, i8));
                    }
                    TextView textView3 = (TextView) inflate2.findViewById(R.id.peoplekit_autocomplete_popup_contact_method);
                    textView3.setText(channel.mo44630k(jVar2.f109939c));
                    int i9 = jVar2.f109944h.f110287f;
                    if (i9 != 0) {
                        textView3.setTextColor(C1878d.m5128a(jVar2.f109939c, i9));
                    }
                    if (!((PeopleKitConfigImpl) jVar2.f109940d).f110250q) {
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate2.findViewById(R.id.peoplekit_popup_checkmark);
                        int i10 = jVar2.f109944h.f110289h;
                        if (i10 != 0) {
                            appCompatImageView2.setColorFilter(C1878d.m5128a(jVar2.f109939c, i10));
                        }
                        appCompatImageView2.setVisibility(0);
                    }
                    linearLayout2.addView(inflate2);
                }
            } else {
                TextView textView4 = (TextView) view2.findViewById(R.id.peoplekit_autocomplete_popup_contact_method);
                if (TextUtils.equals(channel.mo44631l(jVar2.f109939c), channel.mo44630k(jVar2.f109939c))) {
                    textView.setText(channel.mo44630k(jVar2.f109939c));
                    textView.setPadding(0, jVar2.f109939c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_half_padding), 0, 0);
                    textView4.setVisibility(8);
                } else {
                    if (jVar2.f109946j) {
                        str = C42096f.m73804i(channel, jVar2.f109939c);
                    } else {
                        str = channel.mo44630k(jVar2.f109939c);
                    }
                    textView4.setText(str);
                    int i11 = jVar2.f109944h.f110287f;
                    if (i11 != 0) {
                        textView4.setTextColor(C1878d.m5128a(jVar2.f109939c, i11));
                    }
                }
            }
            if (((PeopleKitConfigImpl) jVar2.f109940d).f110245l && !channel.mo44612D() && channel.mo44644y()) {
                View findViewById = view2.findViewById(R.id.peoplekit_autocomplete_hide_name_row);
                findViewById.setVisibility(0);
                if (jVar2.f109944h.f110289h != 0) {
                    ((TextView) findViewById.findViewById(R.id.peoplekit_autocomplete_hide_name_text)).setTextColor(C1878d.m5128a(jVar2.f109939c, jVar2.f109944h.f110289h));
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) findViewById.findViewById(R.id.peoplekit_autocomplete_hide_name_icon);
                int i12 = jVar2.f109944h.f110296o;
                if (i12 != 0) {
                    appCompatImageView3.setColorFilter(C1878d.m5128a(jVar2.f109939c, i12));
                }
                int i13 = jVar2.f109944h.f110288g;
                if (i13 != 0) {
                    findViewById.setBackgroundColor(C1878d.m5128a(jVar2.f109939c, i13));
                }
                View findViewById2 = view2.findViewById(R.id.peoplekit_chip_popup_hide_name_divider);
                int i14 = jVar2.f109944h.f110293l;
                if (i14 != 0) {
                    findViewById2.setBackgroundColor(C1878d.m5128a(jVar2.f109939c, i14));
                }
                findViewById2.setVisibility(0);
                findViewById.setOnClickListener(new C42058d(jVar2, channel));
                C42075e eVar = jVar2.f109942f;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144472m));
                peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144469j));
                peopleKitVisualElementPath.mo44564a(jVar2.f109941e.f109973a);
                eVar.mo44577c(-1, peopleKitVisualElementPath);
            }
            if (!((PeopleKitConfigImpl) jVar2.f109940d).f110250q) {
                View findViewById3 = view2.findViewById(R.id.peoplekit_autocomplete_copy_row);
                TextView textView5 = (TextView) findViewById3.findViewById(R.id.peoplekit_autocomplete_copy_text);
                int i15 = jVar2.f109944h.f110289h;
                if (i15 != 0) {
                    textView5.setTextColor(C1878d.m5128a(jVar2.f109939c, i15));
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) findViewById3.findViewById(R.id.peoplekit_autocomplete_copy_icon);
                int i16 = jVar2.f109944h.f110296o;
                if (i16 != 0) {
                    appCompatImageView4.setColorFilter(C1878d.m5128a(jVar2.f109939c, i16));
                }
                int i17 = jVar2.f109944h.f110288g;
                if (i17 != 0) {
                    findViewById3.setBackgroundColor(C1878d.m5128a(jVar2.f109939c, i17));
                }
                findViewById3.setOnClickListener(new C42059e(jVar2, channel));
                findViewById3.setVisibility(0);
                C42075e eVar2 = jVar2.f109942f;
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144468i));
                peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144469j));
                peopleKitVisualElementPath2.mo44564a(jVar2.f109941e.f109973a);
                eVar2.mo44577c(-1, peopleKitVisualElementPath2);
                if (jVar2.f109943g.mo44746c().size() > 1) {
                    View findViewById4 = view2.findViewById(R.id.peoplekit_autocomplete_copy_all_row);
                    TextView textView6 = (TextView) findViewById4.findViewById(R.id.peoplekit_autocomplete_copy_all_text);
                    int i18 = jVar2.f109944h.f110289h;
                    if (i18 != 0) {
                        textView6.setTextColor(C1878d.m5128a(jVar2.f109939c, i18));
                    }
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) findViewById4.findViewById(R.id.peoplekit_autocomplete_copy_all_icon);
                    int i19 = jVar2.f109944h.f110296o;
                    if (i19 != 0) {
                        appCompatImageView5.setColorFilter(C1878d.m5128a(jVar2.f109939c, i19));
                    }
                    int i20 = jVar2.f109944h.f110288g;
                    if (i20 != 0) {
                        findViewById4.setBackgroundColor(C1878d.m5128a(jVar2.f109939c, i20));
                    }
                    findViewById4.setOnClickListener(new C42060f(jVar2));
                    findViewById4.setVisibility(0);
                    C42075e eVar3 = jVar2.f109942f;
                    PeopleKitVisualElementPath peopleKitVisualElementPath3 = new PeopleKitVisualElementPath();
                    peopleKitVisualElementPath3.f109973a.mo44369a(new C41952a(C54941a.f144467h));
                    peopleKitVisualElementPath3.f109973a.mo44369a(new C41952a(C54941a.f144469j));
                    peopleKitVisualElementPath3.mo44564a(jVar2.f109941e.f109973a);
                    eVar3.mo44577c(-1, peopleKitVisualElementPath3);
                }
                View findViewById5 = view2.findViewById(R.id.peoplekit_chip_popup_copy_divider);
                int i21 = jVar2.f109944h.f110293l;
                if (i21 != 0) {
                    findViewById5.setBackgroundColor(C1878d.m5128a(jVar2.f109939c, i21));
                }
                findViewById5.setVisibility(0);
            }
            View findViewById6 = view2.findViewById(R.id.peoplekit_autocomplete_delete_row);
            TextView textView7 = (TextView) findViewById6.findViewById(R.id.peoplekit_autocomplete_delete_text);
            int i22 = jVar2.f109944h.f110289h;
            if (i22 != 0) {
                textView7.setTextColor(C1878d.m5128a(jVar2.f109939c, i22));
            }
            AppCompatImageView appCompatImageView6 = (AppCompatImageView) findViewById6.findViewById(R.id.peoplekit_autocomplete_delete_icon);
            int i23 = jVar2.f109944h.f110296o;
            if (i23 != 0) {
                appCompatImageView6.setColorFilter(C1878d.m5128a(jVar2.f109939c, i23));
            }
            int i24 = jVar2.f109944h.f110288g;
            if (i24 != 0) {
                findViewById6.setBackgroundColor(C1878d.m5128a(jVar2.f109939c, i24));
            }
            findViewById6.setOnClickListener(new C42061g(jVar2, channel));
            C42075e eVar4 = jVar2.f109942f;
            PeopleKitVisualElementPath peopleKitVisualElementPath4 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath4.f109973a.mo44369a(new C41952a(C54941a.f144474o));
            peopleKitVisualElementPath4.f109973a.mo44369a(new C41952a(C54941a.f144469j));
            peopleKitVisualElementPath4.mo44564a(jVar2.f109941e.f109973a);
            eVar4.mo44577c(-1, peopleKitVisualElementPath4);
            View findViewById7 = view2.findViewById(R.id.peoplekit_autocomplete_popup_primary);
            C42131a.m73928k();
            findViewById7.setOnClickListener(new C42062h(jVar2));
            jVar2.f109945i = new PopupWindow(view2, -2, -2, true);
            C42087a.m73676b(jVar2.f109944h);
            Drawable c2 = C0678gm.m2375e().mo3100c(jVar2.f109939c, R.drawable.peoplekit_popup_background);
            C42141b bVar = jVar2.f109944h;
            int i25 = bVar.f110288g;
            if (i25 != 0) {
                c2.setColorFilter(new PorterDuffColorFilter(C1878d.m5128a(jVar2.f109939c, i25), PorterDuff.Mode.SRC_ATOP));
            } else {
                C42087a.m73676b(bVar);
            }
            jVar2.f109945i.setBackgroundDrawable(c2);
            jVar2.f109945i.setElevation((float) jVar2.f109939c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_elevation));
            int[] iArr = new int[2];
            jVar2.f109938b.getLocationOnScreen(iArr);
            int i26 = iArr[0];
            Point point = new Point();
            ((WindowManager) jVar2.f109939c.getSystemService("window")).getDefaultDisplay().getSize(point);
            int dimensionPixelSize = i26 + jVar2.f109939c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_width);
            jVar2.f109945i.showAsDropDown(jVar2.f109938b, dimensionPixelSize > point.x ? (point.x - dimensionPixelSize) - jVar2.f109939c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_half_padding) : 0, -(jVar2.f109939c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_height) + jVar2.f109939c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_spacing)));
            jVar2.f109945i.setOnDismissListener(new C42057c(jVar2));
            ((InputMethodManager) jVar2.f109939c.getSystemService("input_method")).hideSoftInputFromWindow(jVar2.f109937a.getWindowToken(), 0);
            C42009b bVar2 = jVar2.f109953q;
            if (bVar2 != null) {
                bVar2.f109704a.f109728e.setCursorVisible(false);
            }
            C42075e eVar5 = jVar2.f109942f;
            PeopleKitVisualElementPath peopleKitVisualElementPath5 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath5.f109973a.mo44369a(new C41952a(C54941a.f144469j));
            peopleKitVisualElementPath5.mo44564a(jVar2.f109941e.f109973a);
            eVar5.mo44577c(-1, peopleKitVisualElementPath5);
            C42075e eVar6 = this.f109923d.f109942f;
            PeopleKitVisualElementPath peopleKitVisualElementPath6 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath6.f109973a.mo44369a(new C41952a(C54941a.f144473n));
            peopleKitVisualElementPath6.mo44564a(this.f109923d.f109941e.f109973a);
            eVar6.mo44577c(4, peopleKitVisualElementPath6);
            return;
        }
        channelChip.f109917b = false;
        jVar.mo44552a(channelChip, this.f109922c);
        PopupWindow popupWindow = this.f109923d.f109945i;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f109923d.f109945i.dismiss();
        }
    }
}
