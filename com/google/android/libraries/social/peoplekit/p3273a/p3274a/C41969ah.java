package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.ah */
/* compiled from: PG */
final class C41969ah implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C41979ar f109555a;

    public C41969ah(C41979ar arVar) {
        this.f109555a = arVar;
    }

    public final void onClick(View view) {
        Context context = this.f109555a.f109576a;
        Toast.makeText(context, context.getResources().getString(R.string.peoplekit_listview_no_self_select), 0).show();
    }
}
