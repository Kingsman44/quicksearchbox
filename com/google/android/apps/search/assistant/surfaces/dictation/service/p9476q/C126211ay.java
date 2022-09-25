package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125751p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126333j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126345v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ay */
/* compiled from: PG */
public final /* synthetic */ class C126211ay implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126223bj f347779a;

    /* renamed from: b */
    public final /* synthetic */ C125044j f347780b;

    public /* synthetic */ C126211ay(C126223bj bjVar, C125044j jVar) {
        this.f347779a = bjVar;
        this.f347780b = jVar;
    }

    public final C60870cx apply(Object obj) {
        C126223bj bjVar = this.f347779a;
        C125044j jVar = this.f347780b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C59052c cVar = (C59052c) C126223bj.f347801a.mo56226d();
            cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.ASSISTANT_DICTATION_EMPTY_SUGGESTION_FULFILLMENT_VALUE));
            ((C59052c) cVar.mo56372aa(36946)).mo56389s("No fulfillment generated for button: %s [SD]", C126288a.m206492d(jVar));
            return C60866ct.f164955a;
        }
        jVar.getNumber();
        ((C125751p) optional.get()).f346565c.getClass().getCanonicalName();
        ((C125751p) optional.get()).f346564b.size();
        int a = ((C125751p) optional.get()).f346565c.mo107031a();
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0 || i == 1) {
            bjVar.f347803c.mo107491a(C126345v.m206599a(((C126333j) bjVar.f347817q).f348016a), C125065at.f345040b, BuildConfig.FLAVOR, bjVar.f347817q);
            return bjVar.mo107469f((C125751p) optional.get());
        } else if (i != 2) {
            return C60866ct.f164955a;
        } else {
            return bjVar.mo107469f((C125751p) optional.get());
        }
    }
}
