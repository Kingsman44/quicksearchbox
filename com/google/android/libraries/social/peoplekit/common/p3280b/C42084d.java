package com.google.android.libraries.social.peoplekit.common.p3280b;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C1881g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3260a.p3265d.C41911d;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.social.peoplekit.common.b.d */
/* compiled from: PG */
final class C42084d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C41911d f110003a;

    /* renamed from: b */
    final /* synthetic */ boolean f110004b;

    /* renamed from: c */
    final /* synthetic */ Channel f110005c;

    /* renamed from: d */
    final /* synthetic */ C42086f f110006d;

    public C42084d(C42086f fVar, C41911d dVar, boolean z, Channel channel) {
        this.f110006d = fVar;
        this.f110003a = dVar;
        this.f110004b = z;
        this.f110005c = channel;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C60870cx cxVar;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(this.f110003a));
        peopleKitVisualElementPath.mo44564a(this.f110006d.f110019f.f109973a);
        this.f110006d.f110018e.mo44577c(4, peopleKitVisualElementPath);
        C0391l lVar = new C0391l(this.f110006d.f110015b);
        LayoutInflater from = LayoutInflater.from(this.f110006d.f110015b);
        C42087a.m73676b(this.f110006d.f110014a);
        lVar.setView(from.inflate(R.layout.peoplekit_hide_suggestion_loading_view, (ViewGroup) null));
        lVar.f1347a.f1333n = false;
        C0392m create = lVar.create();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.requestWindowFeature(1);
        create.show();
        if (this.f110004b) {
            C42086f fVar = this.f110006d;
            cxVar = fVar.f110017d.mo44660e(fVar.f110016c, C58485gu.m89846n(this.f110005c));
        } else {
            C42086f fVar2 = this.f110006d;
            cxVar = fVar2.f110017d.mo44661f(fVar2.f110016c, C58485gu.m89846n(this.f110005c));
        }
        C60856cj.m92911t(cxVar, new C42083c(this, create), C1881g.m5136a(this.f110006d.f110015b));
    }
}
