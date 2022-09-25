package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.nowpromo;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.nowpromo.b */
/* compiled from: PG */
public final class C88664b extends C88728ak implements C89199d {

    /* renamed from: a */
    public final Context f239726a;

    /* renamed from: b */
    private final DialogInterface.OnClickListener f239727b = new C88663a(this);

    public C88664b(Context context) {
        this.f239726a = context;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 139;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 28;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f239726a.getResources().getString(R.string.access_now_promo_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82457U(this.f239727b);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        View s = anVar.mo82585s();
        ((ImageView) s.findViewById(R.id.access_now_promo_image)).setImageResource(R.drawable.spark_lure_image);
        TextView textView = (TextView) s.findViewById(R.id.access_now_promo);
        if (!Locale.getDefault().equals(Locale.US) || textView == null) {
            return true;
        }
        textView.setText(R.string.access_discover_promo);
        return true;
    }
}
