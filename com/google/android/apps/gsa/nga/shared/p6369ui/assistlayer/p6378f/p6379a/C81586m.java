package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6378f.p6379a;

import android.support.p033v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.m */
/* compiled from: PG */
public final /* synthetic */ class C81586m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81596w f223170a;

    /* renamed from: b */
    public final /* synthetic */ C81594u f223171b;

    public /* synthetic */ C81586m(C81596w wVar, C81594u uVar) {
        this.f223170a = wVar;
        this.f223171b = uVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        int i;
        int i2;
        int i3;
        C81596w wVar = this.f223170a;
        Boolean bool = (Boolean) obj;
        View view = ((C81574a) this.f223171b).f223146a;
        TextView textView = (TextView) view.findViewById(R.id.nga_assist_nest_promo_title);
        TextView textView2 = (TextView) view.findViewById(R.id.nga_assist_nest_promo_sub_text);
        View findViewById = view.findViewById(R.id.nga_assist_nest_promo_legal);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.nga_assist_nest_promo_legal_text);
        view.setBackgroundResource(true != bool.booleanValue() ? R.drawable.nga_assist_finish_setup_promo_chip_background : R.drawable.nga_assist_finish_setup_promo_chip_background_dark);
        findViewById.setBackgroundResource(true != bool.booleanValue() ? R.drawable.nga_assist_finish_setup_promo_chip_legal_background : R.drawable.nga_assist_finish_setup_promo_chip_legal_background_dark);
        if (bool.booleanValue()) {
            i = C1878d.m5128a(wVar.f223195j, R.color.nga_assist_finish_setup_promo_chip_title_text_color_dark);
        } else {
            i = C1878d.m5128a(wVar.f223195j, R.color.nga_assist_finish_setup_promo_chip_title_text_color_light);
        }
        textView.setTextColor(i);
        if (bool.booleanValue()) {
            i2 = C1878d.m5128a(wVar.f223195j, R.color.nga_assist_finish_setup_promo_chip_sub_text_color_dark);
        } else {
            i2 = C1878d.m5128a(wVar.f223195j, R.color.nga_assist_finish_setup_promo_chip_disclaimer_text_color_light);
        }
        textView2.setTextColor(i2);
        if (bool.booleanValue()) {
            i3 = C1878d.m5128a(wVar.f223195j, R.color.nga_assist_finish_setup_promo_chip_sub_text_color_dark);
        } else {
            i3 = C1878d.m5128a(wVar.f223195j, R.color.nga_assist_finish_setup_promo_chip_disclaimer_text_color_light);
        }
        appCompatTextView.setTextColor(i3);
    }
}
