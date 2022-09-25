package com.google.android.libraries.social.peoplekit.common.p3280b;

import android.content.DialogInterface;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.common.b.b */
/* compiled from: PG */
final class C42082b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PeopleKitVisualElementPath f109996a;

    /* renamed from: b */
    final /* synthetic */ boolean f109997b;

    /* renamed from: c */
    final /* synthetic */ Channel f109998c;

    /* renamed from: d */
    final /* synthetic */ PopupWindow f109999d;

    /* renamed from: e */
    final /* synthetic */ C42086f f110000e;

    public C42082b(C42086f fVar, PeopleKitVisualElementPath peopleKitVisualElementPath, boolean z, Channel channel, PopupWindow popupWindow) {
        this.f110000e = fVar;
        this.f109996a = peopleKitVisualElementPath;
        this.f109997b = z;
        this.f109998c = channel;
        this.f109999d = popupWindow;
    }

    public final void onClick(View view) {
        this.f110000e.f110018e.mo44577c(4, this.f109996a);
        if (this.f109997b) {
            this.f110000e.mo44598d(this.f109998c.mo44628i(), this.f109998c.mo44629j());
        } else if (this.f109998c.mo44609A()) {
            this.f110000e.mo44596b(true, this.f109998c);
        } else {
            C42086f fVar = this.f110000e;
            C42087a.m73676b(fVar.f110014a);
            C0391l lVar = new C0391l(fVar.f110015b);
            lVar.mo1307l(R.string.peoplekit_hide_suggestion_device_contact_cannot_be_hidden_title);
            lVar.mo1300f(R.string.peoplekit_hide_suggestion_device_contact_cannot_be_hidden_text);
            lVar.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
            C0392m create = lVar.create();
            fVar.mo44595a(create);
            create.show();
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144483x));
            peopleKitVisualElementPath.mo44564a(fVar.f110019f.f109973a);
            fVar.f110018e.mo44577c(-1, peopleKitVisualElementPath);
        }
        this.f109999d.dismiss();
    }
}
