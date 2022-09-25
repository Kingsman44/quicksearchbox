package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.v */
/* compiled from: PG */
final class C42003v implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C41967af f109687a;

    public C42003v(C41967af afVar) {
        this.f109687a = afVar;
    }

    public final void onClick(View view) {
        Context context = this.f109687a.f109529a;
        Toast.makeText(context, context.getResources().getString(R.string.peoplekit_listview_no_self_select), 0).show();
    }
}
