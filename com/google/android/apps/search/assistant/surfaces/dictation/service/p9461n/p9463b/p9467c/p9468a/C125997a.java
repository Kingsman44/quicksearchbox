package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9468a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C125997a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C125999c f347250a;

    /* renamed from: b */
    public final /* synthetic */ C126035k f347251b;

    public /* synthetic */ C125997a(C125999c cVar, C126035k kVar) {
        this.f347250a = cVar;
        this.f347251b = kVar;
    }

    public final Object apply(Object obj) {
        C125999c cVar = this.f347250a;
        C126035k kVar = this.f347251b;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.size() > 1) {
            return guVar;
        }
        C58480gp e = C58485gu.m89837e();
        if (cVar.f347256c.mo107252a(kVar)) {
            e.mo55395g(cVar.f347255b.mo107353l(((C126029e) kVar).f347344e));
        } else {
            e.mo55395g(cVar.f347255b.mo107347f(((C126029e) kVar).f347344e, R.string.assistant_keyboard_continue_dictating));
        }
        return e.mo55394f();
    }
}
