package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.e */
/* compiled from: PG */
final class C42059e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Channel f109928a;

    /* renamed from: b */
    final /* synthetic */ C42064j f109929b;

    public C42059e(C42064j jVar, Channel channel) {
        this.f109929b = jVar;
        this.f109928a = channel;
    }

    public final void onClick(View view) {
        C42075e eVar = this.f109929b.f109942f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144468i));
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144469j));
        peopleKitVisualElementPath.mo44564a(this.f109929b.f109941e.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
        ((ClipboardManager) this.f109929b.f109939c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence) null, C42096f.m73797b(this.f109928a, this.f109929b.f109939c)));
        Context context = this.f109929b.f109939c;
        Toast.makeText(context, context.getResources().getQuantityString(R.plurals.peoplekit_chips_copied_recipients, 1, new Object[]{1}), 0).show();
        this.f109929b.f109945i.dismiss();
    }
}
