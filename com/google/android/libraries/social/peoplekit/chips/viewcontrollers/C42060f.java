package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42009b;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.f */
/* compiled from: PG */
final class C42060f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C42064j f109930a;

    public C42060f(C42064j jVar) {
        this.f109930a = jVar;
    }

    public final void onClick(View view) {
        C42075e eVar = this.f109930a.f109942f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144467h));
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144469j));
        peopleKitVisualElementPath.mo44564a(this.f109930a.f109941e.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
        C42009b bVar = this.f109930a.f109953q;
        if (bVar != null) {
            String str = BuildConfig.FLAVOR;
            for (Channel channel : bVar.f109704a.f109733j.mo44746c()) {
                if (!TextUtils.isEmpty(str)) {
                    str = str.concat(", ");
                }
                str = str.concat(String.valueOf(C42096f.m73797b(channel, bVar.f109704a.f109725b)));
            }
            ((ClipboardManager) bVar.f109704a.f109725b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence) null, str));
            int size = bVar.f109704a.f109733j.mo44746c().size();
            Context context = this.f109930a.f109939c;
            Toast.makeText(context, context.getResources().getQuantityString(R.plurals.peoplekit_chips_copied_recipients, size, new Object[]{Integer.valueOf(size)}), 0).show();
        }
        this.f109930a.f109945i.dismiss();
    }
}
