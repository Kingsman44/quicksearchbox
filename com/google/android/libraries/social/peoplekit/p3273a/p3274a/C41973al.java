package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.view.View;
import android.widget.PopupWindow;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.al */
/* compiled from: PG */
final class C41973al implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ C41982au f109561a;

    /* renamed from: b */
    final /* synthetic */ Channel f109562b;

    /* renamed from: c */
    final /* synthetic */ String f109563c;

    /* renamed from: d */
    final /* synthetic */ String f109564d;

    /* renamed from: e */
    final /* synthetic */ C41979ar f109565e;

    public C41973al(C41979ar arVar, C41982au auVar, Channel channel, String str, String str2) {
        this.f109565e = arVar;
        this.f109561a = auVar;
        this.f109562b = channel;
        this.f109563c = str;
        this.f109564d = str2;
    }

    public final boolean onLongClick(View view) {
        C42075e eVar = this.f109565e.f109579d;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144465f));
        peopleKitVisualElementPath.mo44564a(this.f109565e.f109582g.f109973a);
        eVar.mo44577c(31, peopleKitVisualElementPath);
        PopupWindow popupWindow = new PopupWindow((View) null, -2, -2, true);
        C41979ar arVar = this.f109565e;
        arVar.f109588m.mo44597c(popupWindow, this.f109561a.f109602b, arVar.f109576a.getResources().getDimensionPixelSize(R.dimen.peoplekit_listview_row_height), this.f109562b, this.f109563c, this.f109564d);
        this.f109565e.mo44437a();
        return true;
    }
}
