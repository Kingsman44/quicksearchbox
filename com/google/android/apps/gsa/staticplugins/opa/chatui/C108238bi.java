package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44535e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bi */
/* compiled from: PG */
public final class C108238bi {
    /* renamed from: a */
    public static C108237bh m179897a(Context context, C86124t tVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C108482q qVar = new C108482q();
        qVar.f301773j = R.dimen.chatui_suggestion_icon_size;
        qVar.f301747O |= 1024;
        qVar.mo96625m(0);
        qVar.f301782s = true;
        int i8 = qVar.f301747O;
        qVar.f301783t = true;
        qVar.f301747O = i8 | 12582912;
        qVar.mo96626n(R.layout.chatui_user_bubble);
        qVar.f301767d = C1878d.m5128a(context, R.color.chatui_bubble_pending_text);
        qVar.f301747O |= 16;
        qVar.mo96620h(R.layout.chatui_google_bubble);
        qVar.f301769f = C58833ax.m90834k(Integer.valueOf(C44535e.m78720c(context, R.attr.assistant_logo_color, 0)));
        qVar.f301770g = R.layout.chatui_card_item;
        qVar.f301747O |= 128;
        qVar.f301771h = tVar.mo79746e(C90014bt.f247760nI) ? context.getResources().getDimensionPixelSize(R.dimen.chatui_card_horizontal_margin) : -1;
        qVar.f301747O |= 256;
        qVar.f301772i = context.getResources().getDimensionPixelSize(R.dimen.chatui_local_xuikit_card_padding);
        qVar.f301747O |= 512;
        if (tVar.mo79746e(C90029ch.f248203Q)) {
            i2 = C1878d.m5128a(context, R.color.opa_header_background);
        } else {
            i2 = C1878d.m5128a(context, R.color.chatui_default_status_bar_color_v2);
        }
        qVar.mo96615c(i2);
        qVar.mo96627o(C1878d.m5128a(context, R.color.zero_state_main_view_v2_color));
        qVar.f301781r = C1878d.m5128a(context, R.color.chatui_solid_background_fill_v2);
        qVar.f301747O |= C89885b.HTTP_VALUE;
        qVar.f301742J = C1878d.m5128a(context, R.color.chatui_mini_plate_3p_header_title_text_color);
        qVar.f301748P |= 4096;
        if (tVar.mo79746e(C90014bt.f247760nI)) {
            i3 = 0;
        } else {
            i3 = context.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_carousel_elevation);
        }
        qVar.f301775l = i3;
        qVar.f301747O |= 4096;
        qVar.f301759a = C1878d.m5128a(context, R.color.chatui_solid_background_fill_v2);
        qVar.f301747O |= 1;
        if (tVar.mo79746e(C90014bt.f247760nI)) {
            i4 = context.getResources().getDimensionPixelSize(R.dimen.chatui_horizontal_margin_v2);
        } else {
            i4 = context.getResources().getDimensionPixelSize(R.dimen.chatui_horizontal_margin);
        }
        qVar.f301765b = i4;
        int i9 = qVar.f301747O;
        qVar.f301766c = 2132148818;
        qVar.f301788y = R.drawable.opa_hero_bubble_v2;
        qVar.f301747O = i9 | 536870918;
        qVar.f301734B = context.getResources().getDimensionPixelSize(R.dimen.chatui_hero_bubble_text_height_v2);
        qVar.f301748P |= 1;
        qVar.f301735C = context.getResources().getDimensionPixelSize(R.dimen.chatui_hero_bubble_top_padding_v2);
        qVar.f301748P |= 2;
        qVar.f301736D = context.getResources().getDimensionPixelSize(R.dimen.chatui_hero_bubble_bottom_padding_v2);
        qVar.f301748P |= 4;
        qVar.f301737E = context.getResources().getDimensionPixelSize(R.dimen.chatui_menu_padding_sides_v2);
        qVar.f301748P |= 8;
        if (tVar.mo79746e(C90014bt.f247760nI)) {
            i5 = 0;
        } else {
            i5 = context.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_carousel_gap_top_v2);
        }
        qVar.f301738F = i5;
        qVar.f301748P |= 16;
        qVar.f301739G = context.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_carousel_gap_bottom_v2);
        qVar.f301748P |= 32;
        qVar.f301785v = context.getResources().getDimensionPixelSize(R.dimen.chatui_header_height_v2);
        qVar.f301747O |= 67108864;
        if (!tVar.mo79746e(C90014bt.f247760nI)) {
            i6 = C1878d.m5128a(context, R.color.opa_header_background);
        } else if (tVar.mo79746e(C90029ch.f248203Q)) {
            i6 = C1878d.m5128a(context, R.color.opa_header_background);
        } else {
            i6 = C1878d.m5128a(context, R.color.opa_header_background_v2);
        }
        qVar.mo96621i(i6);
        qVar.f301784u = C1878d.m5128a(context, R.color.opa_force_dark_header_background);
        qVar.f301747O |= 33554432;
        qVar.f301786w = context.getResources().getDimensionPixelSize(R.dimen.chatui_header_right_padding_v2);
        qVar.f301747O |= 134217728;
        qVar.f301787x = context.getResources().getDimensionPixelSize(R.dimen.chatui_header_left_padding_v2);
        qVar.f301747O |= 268435456;
        qVar.f301740H = R.drawable.immersive_actions_small_card_background_v2;
        qVar.f301748P |= 64;
        qVar.mo96618f(context.getResources().getDimensionPixelSize(R.dimen.chatui_follow_up_google_bubble_padding_top));
        qVar.mo96617e(C113987f.m188692c(tVar) ? context.getResources().getDimensionPixelSize(R.dimen.chatui_follow_up_google_bubble_margin_top) : 0);
        qVar.mo96623k(context.getResources().getDimensionPixelSize(R.dimen.chatui_non_follow_up_google_bubble_padding_top));
        qVar.mo96622j(context.getResources().getDimensionPixelSize(R.dimen.chatui_bubble_min_height_v3));
        qVar.mo96624l(C113987f.m188692c(tVar) ? C1878d.m5128a(context, R.color.chatui_solid_background_fill_v2) : 0);
        boolean a = C113987f.m188690a(tVar);
        int i10 = R.drawable.zero_state_gold_brick;
        if (a && tVar.mo79746e(C90014bt.f247837ox)) {
            i10 = R.drawable.zero_state_gold_brick_v2;
        }
        qVar.f301789z = i10;
        qVar.f301747O |= 1073741824;
        qVar.f301733A = context.getResources().getDimensionPixelSize(true != C113987f.m188690a(tVar) ? R.dimen.opa_search_plate_height : R.dimen.opa_search_plate_height_v2);
        qVar.f301747O |= LinearLayoutManager.INVALID_OFFSET;
        qVar.mo96614b(false);
        qVar.mo96616d(false);
        int i11 = 2132148830;
        if (!C82193a.m130503a(context) && true != tVar.mo79746e(C90014bt.f247760nI)) {
            i11 = 2132148827;
        }
        qVar.f301774k = i11;
        int i12 = qVar.f301747O;
        qVar.f301779p = 2132148831;
        qVar.f301747O = i12 | 67584;
        qVar.f301780q = context.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_chip_no_text_side_padding);
        qVar.f301747O |= C89885b.S3REQUEST_VALUE;
        qVar.f301776m = true != tVar.mo79746e(C90014bt.f247760nI) ? 2132148825 : 2132148829;
        int i13 = qVar.f301747O;
        qVar.f301777n = 2132148826;
        qVar.f301747O = i13 | 24576;
        if (tVar.mo79746e(C90014bt.f247760nI)) {
            i7 = context.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_chip_icon_left_padding);
        } else {
            i7 = context.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_chip_left_padding);
        }
        qVar.f301778o = i7;
        qVar.f301747O |= 32768;
        qVar.f301741I = tVar.mo79746e(C90014bt.f247760nI) ? context.getResources().getDimensionPixelSize(R.dimen.suggestion_chip_wrapper_height_extended) : -2;
        int i14 = qVar.f301748P;
        qVar.f301743K = R.layout.chatui_drl_history_bubble;
        qVar.f301744L = R.layout.chatui_drl_chatty_user_bubble;
        qVar.f301745M = R.layout.chatui_drl_chatty_google_bubble;
        qVar.f301768e = R.layout.chatui_google_bubble_iris_large;
        qVar.f301747O |= 64;
        qVar.f301746N = R.layout.chatui_loading_card;
        qVar.f301748P = i14 | 983168;
        if (i == 1) {
            qVar.mo96614b(true);
        }
        if (!z) {
            return qVar.mo96613a();
        }
        if (tVar.mo79746e(C90029ch.f248211Y)) {
            qVar.mo96616d(true);
            qVar.mo96626n(R.layout.chatui_user_bubble_regular);
            qVar.mo96620h(R.layout.chatui_google_bubble_regular);
        } else if (tVar.mo79746e(C90029ch.f248229aP)) {
            qVar.mo96616d(true);
            qVar.mo96626n(R.layout.chatui_user_bubble_regular);
            qVar.mo96620h(R.layout.chatui_google_bubble_regular);
            qVar.mo96618f(0);
            qVar.mo96617e(0);
            qVar.mo96623k(0);
            qVar.mo96622j(0);
        } else {
            qVar.mo96616d(true);
            qVar.mo96626n(R.layout.chatui_user_bubble_v2);
            qVar.mo96620h(R.layout.chatui_google_bubble_v2);
            qVar.mo96618f(0);
            qVar.mo96617e(0);
            qVar.mo96623k(0);
            qVar.mo96622j(0);
        }
        return qVar.mo96613a();
    }
}
