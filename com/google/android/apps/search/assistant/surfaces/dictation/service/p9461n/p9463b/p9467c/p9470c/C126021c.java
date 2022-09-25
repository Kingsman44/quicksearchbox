package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9470c;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126107dr;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126027d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.C125996a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b.C126018r;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9472d.C126028a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.c.c */
/* compiled from: PG */
public final class C126021c implements C125996a {

    /* renamed from: a */
    public final C126107dr f347314a;

    /* renamed from: b */
    public final C126028a f347315b;

    /* renamed from: c */
    public final C126019a f347316c;

    /* renamed from: d */
    private final C126018r f347317d;

    /* renamed from: e */
    private final Executor f347318e;

    public C126021c(C126107dr drVar, C126018r rVar, C126028a aVar, C126019a aVar2, Executor executor) {
        this.f347314a = drVar;
        this.f347317d = rVar;
        this.f347315b = aVar;
        this.f347316c = aVar2;
        this.f347318e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo107237a(C126035k kVar) {
        C126029e eVar = (C126029e) kVar;
        C58838bb.m90879n("com.google.android.gm".equals(eVar.f347340a), "Package: \"%s\" doesn't match provider package: %s", eVar.f347340a, "com.google.android.gm");
        if (this.f347315b.mo107252a(kVar)) {
            return C60856cj.m92900i(C58485gu.m89846n(this.f347314a.mo107353l(eVar.f347344e)));
        }
        return mo107239c(kVar);
    }

    /* renamed from: b */
    public final C60870cx mo107238b(C126035k kVar) {
        C126029e eVar = (C126029e) kVar;
        C58838bb.m90879n("com.google.android.gm".equals(eVar.f347340a), "Package: \"%s\" doesn't match provider package: %s", eVar.f347340a, "com.google.android.gm");
        C60870cx a = this.f347317d.mo107243a(kVar);
        C126020b bVar = new C126020b(this, kVar);
        return C60922j.m93044g(a, C47810es.m84963c(bVar), this.f347318e);
    }

    /* renamed from: c */
    public final C60870cx mo107239c(C126035k kVar) {
        C126029e eVar = (C126029e) kVar;
        C58838bb.m90879n("com.google.android.gm".equals(eVar.f347340a), "Package: \"%s\" doesn't match provider package: %s", eVar.f347340a, "com.google.android.gm");
        ArrayList arrayList = new ArrayList();
        if (eVar.f347346g) {
            arrayList.add(C126107dr.m206200n());
        }
        if (this.f347316c.f347297a && C126019a.m206030a(kVar) && C126019a.m206035f(kVar)) {
            arrayList.add(this.f347314a.mo107346e(eVar.f347344e, R.string.assistant_keyboard_say_recipient_text));
        } else if (this.f347316c.f347298b && C126019a.m206030a(kVar) && C126019a.m206036g(kVar)) {
            arrayList.add(this.f347314a.mo107346e(eVar.f347344e, R.string.assistant_keyboard_say_subject_text));
        } else if (this.f347316c.f347299c && C126019a.m206030a(kVar) && ((C126027d) eVar.f347341b).f347336e == 4) {
            arrayList.add(this.f347314a.mo107346e(eVar.f347344e, R.string.assistant_keyboard_dictate_email_text));
        }
        if (this.f347316c.f347308l && C126019a.m206030a(kVar) && ((C126019a.m206034e(kVar) || C126019a.m206032c(kVar)) && eVar.f347343d.mo107328c())) {
            arrayList.add(this.f347314a.mo107346e(eVar.f347344e, R.string.assistant_keyboard_say_clear_recipient_text));
        } else if (this.f347316c.f347309m && C126019a.m206030a(kVar) && C126019a.m206033d(kVar) && eVar.f347343d.mo107328c()) {
            arrayList.add(this.f347314a.mo107346e(eVar.f347344e, R.string.assistant_keyboard_say_clear_subject_text));
        } else if (this.f347316c.f347310n && C126019a.m206030a(kVar) && C126019a.m206031b(kVar) && eVar.f347343d.mo107328c()) {
            arrayList.add(this.f347314a.mo107346e(eVar.f347344e, R.string.assistant_keyboard_say_clear_body_text));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(this.f347314a.mo107352k(eVar.f347344e));
        }
        if (this.f347316c.f347311o) {
            Collections.shuffle(arrayList);
        }
        return C60856cj.m92900i(C58485gu.m89842j(arrayList));
    }
}
