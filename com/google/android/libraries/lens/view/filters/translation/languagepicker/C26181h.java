package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.common.base.C58819aj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.h */
/* compiled from: PG */
public final /* synthetic */ class C26181h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26182i f71138a;

    /* renamed from: b */
    public final /* synthetic */ Locale f71139b;

    /* renamed from: c */
    public final /* synthetic */ C25327c f71140c;

    /* renamed from: d */
    public final /* synthetic */ C26164bf f71141d;

    public /* synthetic */ C26181h(C26182i iVar, Locale locale, C25327c cVar, C26164bf bfVar) {
        this.f71138a = iVar;
        this.f71139b = locale;
        this.f71140c = cVar;
        this.f71141d = bfVar;
    }

    public final void onClick(View view) {
        C26182i iVar = this.f71138a;
        Locale locale = this.f71139b;
        C25327c cVar = this.f71140c;
        C26164bf bfVar = this.f71141d;
        C28443m mVar = iVar.f71148g;
        C58485gu m = C58485gu.m89845m();
        C25327c cVar2 = C25327c.UNKNOWN;
        int ordinal = cVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    m = C58485gu.m89847o(C26172bn.ANY_NETWORK, C26172bn.CANCEL);
                } else if (ordinal != 4) {
                    if (ordinal == 5) {
                        bfVar.f71074a.f71022s.mo31261p(locale);
                    } else if (ordinal == 7) {
                        m = C58485gu.m89847o(C26172bn.RETRY, C26172bn.CANCEL);
                    }
                }
            }
            m = C58485gu.m89847o(C26172bn.WIFI_ONLY, C26172bn.CANCEL);
        } else {
            bfVar.f71074a.f71022s.mo31260o(locale);
        }
        if (!m.isEmpty()) {
            C26173bo boVar = iVar.f71151j;
            View view2 = iVar.f71153l;
            Context context = view2.getContext();
            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.listPopupWindowStyle);
            popupWindow.setTouchable(true);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.setInputMethodMode(2);
            C26168bj bjVar = new C26168bj(locale, bfVar, popupWindow);
            float dimension = context.getResources().getDimension(R.dimen.lens_translate_download_popup_icon_margin);
            RecyclerView recyclerView = new RecyclerView(context);
            C46753j jVar = new C46753j();
            jVar.f122102a = new C58819aj(new C26171bm(boVar, context, (int) dimension, bjVar));
            jVar.mo50771b(C26169bk.f71084a);
            C46755l a = jVar.mo50770a();
            recyclerView.setAdapter(a);
            a.mo50772a(m);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            popupWindow.setContentView(recyclerView);
            int dimension2 = (int) (context.getResources().getDimension(R.dimen.lens_translate_download_popup_item_padding) + (context.getResources().getDimension(R.dimen.lens_translate_download_popup_item_height) * ((float) ((C58724pq) m).f156474d)));
            int i = view2.getResources().getDisplayMetrics().heightPixels;
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            if (((float) iArr[1]) > ((float) i) * 0.6666667f) {
                popupWindow.setOverlapAnchor(true);
                popupWindow.showAsDropDown(view2, 0, -dimension2, 8388691);
            } else {
                popupWindow.showAsDropDown(view2, 0, 0, 8388659);
            }
        }
        if (Boolean.TRUE.equals(view.getTag(R.id.is_bound_tag))) {
            mVar.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        }
    }
}
