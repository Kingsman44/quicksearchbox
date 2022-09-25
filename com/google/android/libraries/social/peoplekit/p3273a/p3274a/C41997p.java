package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.graphics.drawable.Drawable;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.widget.C0678gm;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.content.p091b.C1874w;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.p */
/* compiled from: PG */
final class C41997p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C42000s f109664a;

    public C41997p(C42000s sVar) {
        this.f109664a = sVar;
    }

    public final void onClick(View view) {
        C42000s sVar = this.f109664a;
        C42075e eVar = sVar.f109668c;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144460a));
        peopleKitVisualElementPath.mo44564a(sVar.f109670e.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
        C42087a.m73676b(sVar.f109676k);
        View inflate = LayoutInflater.from(sVar.f109666a).inflate(R.layout.peoplekit_top_suggestions_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.peoplekit_top_suggestions_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.peoplekit_top_suggestions_content);
        int i = sVar.f109676k.f110286e;
        if (i != 0) {
            textView.setTextColor(C1878d.m5128a(sVar.f109666a, i));
        }
        int i2 = sVar.f109676k.f110287f;
        if (i2 != 0) {
            textView2.setTextColor(C1878d.m5128a(sVar.f109666a, i2));
        }
        if (C42131a.m73927j() && ((PeopleKitConfigImpl) sVar.f109669d).f110255v) {
            TextView textView3 = (TextView) inflate.findViewById(R.id.peoplekit_top_suggestions_hide_content);
            textView3.setVisibility(0);
            int i3 = sVar.f109676k.f110287f;
            if (i3 != 0) {
                textView3.setTextColor(C1878d.m5128a(sVar.f109666a, i3));
            }
        }
        C42087a.m73676b(sVar.f109676k);
        C0391l lVar = new C0391l(sVar.f109666a, R.style.Dialog);
        lVar.setView(inflate);
        lVar.setPositiveButton(R.string.peoplekit_got_it, new C41998q());
        C0392m create = lVar.create();
        C42141b bVar = sVar.f109676k;
        if (bVar.f110282a != 0) {
            Drawable c = C0678gm.m2375e().mo3100c(sVar.f109666a, R.drawable.peoplekit_dialog_background);
            C1929b.m5225f(c, C1878d.m5128a(sVar.f109666a, sVar.f109676k.f110282a));
            create.getWindow().setBackgroundDrawable(c);
        } else {
            C42087a.m73676b(bVar);
        }
        create.show();
        Button button = create.f1349a.f1110j;
        button.setAllCaps(false);
        try {
            button.setTypeface(C1874w.m5107d(sVar.f109666a, R.font.google_sans_medium));
        } catch (Exception unused) {
        }
        int i4 = sVar.f109676k.f110297p;
        if (i4 != 0) {
            button.setTextColor(C1878d.m5128a(sVar.f109666a, i4));
        }
        button.setTextSize(0, (float) sVar.f109666a.getResources().getDimensionPixelSize(R.dimen.peoplekit_listview_row_text_size));
    }
}
