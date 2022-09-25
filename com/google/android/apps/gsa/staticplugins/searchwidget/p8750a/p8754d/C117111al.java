package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.widget.C2131r;
import androidx.core.widget.C2132s;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.al */
/* compiled from: PG */
final class C117111al implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f325121a;

    /* renamed from: b */
    final /* synthetic */ C117114ao f325122b;

    public C117111al(C117114ao aoVar, View view) {
        this.f325122b = aoVar;
        this.f325121a = view;
    }

    public final void onGlobalLayout() {
        this.f325121a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C117114ao aoVar = this.f325122b;
        ListView listView = (ListView) aoVar.f325134c.inflate(R.layout.customization_menu_overlay_list, (ViewGroup) null, false);
        listView.setAdapter(aoVar.f325135d);
        listView.setOnItemClickListener(new C117109aj(aoVar));
        int dimensionPixelOffset = aoVar.f325132a.getResources().getDimensionPixelOffset(R.dimen.menu_overlay_window_padding);
        int width = aoVar.mo28297il().getWidth();
        int dimensionPixelSize = aoVar.f325132a.getResources().getDimensionPixelSize(R.dimen.menu_overlay_window_width_unit);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int size = aoVar.f325135d.f325129a.size();
        View view = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            view = aoVar.f325135d.getView(i3, view, listView);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            i2 += view.getMeasuredHeight();
            if (measuredWidth > i) {
                i = measuredWidth;
            }
        }
        double d = (double) i;
        double d2 = (double) dimensionPixelSize;
        Double.isNaN(d);
        Double.isNaN(d2);
        aoVar.f325136e = new PopupWindow(listView, Math.min(((int) Math.ceil(d / d2)) * dimensionPixelSize, (width - dimensionPixelOffset) - dimensionPixelOffset), i2 + dimensionPixelOffset + dimensionPixelOffset, true);
        aoVar.f325136e.setBackgroundDrawable(aoVar.f325132a.getDrawable(R.drawable.menu_overlay_background));
        aoVar.f325136e.setElevation(16.0f);
        aoVar.f325136e.setOnDismissListener(new C117110ak(aoVar));
        C2132s.m5903b(aoVar.f325136e, true);
        int dimensionPixelOffset2 = aoVar.f325132a.getResources().getDimensionPixelOffset(R.dimen.menu_overlay_window_offset_end);
        if (C91115n.m148876h(aoVar.mo28297il())) {
            dimensionPixelOffset2 = -dimensionPixelOffset2;
        }
        C2131r.m5901a(aoVar.f325136e, aoVar.mo28297il().findViewById(R.id.menu_anchor_point), dimensionPixelOffset2, 0, 8388613);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1149;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
