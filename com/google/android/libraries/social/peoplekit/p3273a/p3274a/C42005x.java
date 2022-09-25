package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.view.View;
import android.widget.PopupWindow;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.x */
/* compiled from: PG */
final class C42005x implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ View f109690a;

    /* renamed from: b */
    final /* synthetic */ Channel f109691b;

    /* renamed from: c */
    final /* synthetic */ String f109692c;

    /* renamed from: d */
    final /* synthetic */ String f109693d;

    /* renamed from: e */
    final /* synthetic */ C41967af f109694e;

    public C42005x(C41967af afVar, View view, Channel channel, String str, String str2) {
        this.f109694e = afVar;
        this.f109690a = view;
        this.f109691b = channel;
        this.f109692c = str;
        this.f109693d = str2;
    }

    public final boolean onLongClick(View view) {
        C42075e eVar = this.f109694e.f109537i;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(this.f109694e.mo44418a());
        peopleKitVisualElementPath.mo44564a(this.f109694e.f109540l.f109973a);
        eVar.mo44577c(31, peopleKitVisualElementPath);
        PopupWindow popupWindow = new PopupWindow((View) null, -2, -2, true);
        C41967af afVar = this.f109694e;
        afVar.f109547s.mo44597c(popupWindow, this.f109690a, afVar.f109529a.getResources().getDimensionPixelSize(R.dimen.peoplekit_listview_row_height), this.f109691b, this.f109692c, this.f109693d);
        this.f109694e.mo44421d();
        return true;
    }
}
