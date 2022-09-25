package com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.search.suggest.C138010ab;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.a.d */
/* compiled from: PG */
public final class C138138d extends C46756m {

    /* renamed from: a */
    public final C47722m f375843a;

    public C138138d(C47722m mVar) {
        this.f375843a = mVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_spyw_icc_header, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        TextView textView = (TextView) view.findViewById(R.id.googleapp_in_context_control_header_text);
        C138010ab abVar = ((C138015ag) obj).f375484d;
        if (abVar == null) {
            abVar = C138010ab.f375456d;
        }
        textView.setText(abVar.f375459b);
        View findViewById = view.findViewById(R.id.googleapp_in_context_control_overflow_button);
        findViewById.setOnClickListener(new C138136b(this, view, findViewById));
    }
}
