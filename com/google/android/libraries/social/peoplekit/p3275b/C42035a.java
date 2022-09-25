package com.google.android.libraries.social.peoplekit.p3275b;

import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.social.peoplekit.C41960a;

/* renamed from: com.google.android.libraries.social.peoplekit.b.a */
/* compiled from: PG */
final class C42035a implements C41960a {

    /* renamed from: a */
    final /* synthetic */ C41960a f109827a;

    /* renamed from: b */
    final /* synthetic */ C42048e f109828b;

    public C42035a(C42048e eVar, C41960a aVar) {
        this.f109828b = eVar;
        this.f109827a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r1.f109476b.isEmpty() != false) goto L_0x0047;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44409a(com.google.android.libraries.social.p3269d.p3270a.C41949x r5) {
        /*
            r4 = this;
            com.google.android.libraries.social.peoplekit.a r0 = r4.f109827a
            com.google.android.apps.gsa.assistant.settings.features.people.ff r0 = (com.google.android.apps.gsa.assistant.settings.features.people.C73436ff) r0
            com.google.android.apps.gsa.assistant.settings.features.people.fi r1 = r0.f194426a
            com.google.android.libraries.social.peoplekit.b.e r1 = r1.g
            com.google.android.libraries.social.peoplekit.PeopleKitPickerResult r1 = r1.mo44530a()
            com.google.android.libraries.social.peoplekit.PeopleKitPickerResultImpl r1 = (com.google.android.libraries.social.peoplekit.PeopleKitPickerResultImpl) r1
            com.google.android.libraries.social.d.a.t r1 = r1.f109515b
            com.google.protobuf.cq r1 = r1.f109489b
            int r1 = r1.size()
            r2 = 30
            if (r1 <= r2) goto L_0x002d
            com.google.android.apps.gsa.assistant.settings.features.people.fi r1 = r0.f194426a
            android.support.v4.app.am r1 = r1.getActivity()
            r2 = 2132084703(0x7f1507df, float:1.9809584E38)
            com.google.android.apps.gsa.assistant.settings.features.people.utils.C73459ag.m108076a(r1, r2)
            com.google.android.apps.gsa.assistant.settings.features.people.fi r1 = r0.f194426a
            com.google.android.libraries.social.peoplekit.b.e r1 = r1.g
            r1.mo44532c(r5)
        L_0x002d:
            com.google.android.libraries.social.d.a.r r1 = r5.f109498d
            if (r1 != 0) goto L_0x0033
            com.google.android.libraries.social.d.a.r r1 = com.google.android.libraries.social.p3269d.p3270a.C41943r.f109473l
        L_0x0033:
            int r1 = r1.f109475a
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0047
            com.google.android.libraries.social.d.a.r r1 = r5.f109498d
            if (r1 != 0) goto L_0x003f
            com.google.android.libraries.social.d.a.r r1 = com.google.android.libraries.social.p3269d.p3270a.C41943r.f109473l
        L_0x003f:
            java.lang.String r1 = r1.f109476b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x005a
        L_0x0047:
            com.google.android.apps.gsa.assistant.settings.features.people.fi r1 = r0.f194426a
            android.support.v4.app.am r1 = r1.getActivity()
            r3 = 2132084704(0x7f1507e0, float:1.9809586E38)
            com.google.android.apps.gsa.assistant.settings.features.people.utils.C73459ag.m108076a(r1, r3)
            com.google.android.apps.gsa.assistant.settings.features.people.fi r1 = r0.f194426a
            com.google.android.libraries.social.peoplekit.b.e r1 = r1.g
            r1.mo44532c(r5)
        L_0x005a:
            com.google.android.apps.gsa.assistant.settings.features.people.fi r5 = r0.f194426a
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r5 = r5.i
            if (r5 == 0) goto L_0x0067
            android.widget.Button r5 = r5.mo77360a()
            r5.setEnabled(r2)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.peoplekit.p3275b.C42035a.mo44409a(com.google.android.libraries.social.d.a.x):void");
    }

    /* renamed from: b */
    public final void mo44410b() {
        ((InputMethodManager) this.f109828b.f109875b.getSystemService("input_method")).hideSoftInputFromWindow(this.f109828b.f109874a.getWindowToken(), 0);
    }
}
