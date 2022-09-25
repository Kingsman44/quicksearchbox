package com.google.android.apps.search.transcription.voiceime.standalone.settings;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10978e;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10979f;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10984k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.transcription.voiceime.standalone.settings.m */
/* compiled from: PG */
public final /* synthetic */ class C142035m implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C142036n f385370a;

    public /* synthetic */ C142035m(C142036n nVar) {
        this.f385370a = nVar;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C142036n nVar = this.f385370a;
        String str = (String) obj;
        C10984k kVar = nVar.f385373c;
        ((C59052c) ((C59052c) C10984k.f36121a.mo56224b()).mo56372aa(54065)).mo56389s("#setLanguage: %s", str);
        C60870cx a = kVar.f36123c.mo46039a(new C10978e(str), kVar.f36125e);
        C10979f fVar = new C10979f(kVar);
        nVar.f385375e.mo50445g(C46438d.m82809a(C60922j.m93045h(a, C47810es.m84966f(fVar), kVar.f36125e)), new C46436b("primary_language"), nVar.f385379i);
        return false;
    }
}
