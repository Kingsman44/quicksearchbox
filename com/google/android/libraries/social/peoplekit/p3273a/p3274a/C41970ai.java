package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.ai */
/* compiled from: PG */
final class C41970ai implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C41979ar f109556a;

    public C41970ai(C41979ar arVar) {
        this.f109556a = arVar;
    }

    public final void onClick(View view) {
        Context context = this.f109556a.f109576a;
        Toast.makeText(context, context.getResources().getString(R.string.peoplekit_listview_already_selected), 0).show();
    }
}
