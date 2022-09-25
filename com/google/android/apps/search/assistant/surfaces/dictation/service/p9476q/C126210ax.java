package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125751p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126324be;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126333j;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ax */
/* compiled from: PG */
public final /* synthetic */ class C126210ax implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126223bj f347776a;

    /* renamed from: b */
    public final /* synthetic */ String f347777b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f347778c;

    public /* synthetic */ C126210ax(C126223bj bjVar, String str, C58485gu guVar) {
        this.f347776a = bjVar;
        this.f347777b = str;
        this.f347778c = guVar;
    }

    public final C60870cx apply(Object obj) {
        C126223bj bjVar = this.f347776a;
        String str = this.f347777b;
        C58485gu guVar = this.f347778c;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return bjVar.mo107468e(str, guVar);
        }
        int a = ((C125751p) optional.get()).f346565c.mo107031a();
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i != 0 && i != 2) {
            return bjVar.mo107468e(str, guVar);
        } else {
            C47558bi a2 = C47831fm.m85006a("SD.OrationEvent.Partial.Command");
            try {
                C126258cr crVar = bjVar.f347803c;
                C125065at atVar = C125065at.f345040b;
                C126324be beVar = bjVar.f347817q;
                crVar.mo107491a(atVar, ((C126333j) beVar).f348017b, BuildConfig.FLAVOR, beVar);
                C126324be beVar2 = bjVar.f347817q;
                bjVar.mo107471h(new C126333j(((C126333j) beVar2).f348016a, ((C126333j) beVar2).f348017b, ((C126333j) beVar2).f348018c, ((C126333j) beVar2).f348019d, Optional.m71637of(str), ((C126333j) beVar2).f348021f));
                a2.close();
                return C60866ct.f164955a;
            } catch (Throwable th) {
                C126209aw.m206411a(th, th);
            }
        }
        throw th;
    }
}
