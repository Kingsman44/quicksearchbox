package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.net.Uri;
import com.google.android.apps.gsa.h.e.a;
import com.google.android.apps.search.googleapp.p10539y.p10540a.C139883a;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137312j;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58837ba;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57582az;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.ai */
/* compiled from: PG */
final class C137324ai implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137316ad f373548a;

    public C137324ai(C137316ad adVar) {
        this.f373548a = adVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        String str;
        C57582az azVar;
        C137316ad adVar = this.f373548a;
        a aVar = adVar.f373531h;
        C57578av a = ((C137312j) bVar).mo113633a();
        if (a.f153825b == 2 && (azVar = a.f153826c) != null) {
            String str2 = (String) Collections.unmodifiableMap(azVar.f153839c).get(3);
            if (!C58837ba.m90859h(str2)) {
                str = C139883a.m227489a(Uri.parse(str2));
                aVar.mo41490e(a.b(str));
                adVar.mo113646g();
                return C47392e.f123115a;
            }
        }
        C57566aj ajVar = a.f153824a;
        if (ajVar == null) {
            ajVar = C57566aj.f153791e;
        }
        str = C139883a.m227490b(ajVar);
        aVar.mo41490e(a.b(str));
        adVar.mo113646g();
        return C47392e.f123115a;
    }
}
