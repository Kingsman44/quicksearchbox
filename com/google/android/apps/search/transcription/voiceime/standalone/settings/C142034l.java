package com.google.android.apps.search.transcription.voiceime.standalone.settings;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10982i;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10983j;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10984k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;

/* renamed from: com.google.android.apps.search.transcription.voiceime.standalone.settings.l */
/* compiled from: PG */
public final /* synthetic */ class C142034l implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C142036n f385369a;

    public /* synthetic */ C142034l(C142036n nVar) {
        this.f385369a = nVar;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C142036n nVar = this.f385369a;
        C10984k kVar = nVar.f385373c;
        C58528ij F = C58528ij.m90006F((Set) obj);
        ((C59052c) ((C59052c) C10984k.f36121a.mo56224b()).mo56372aa(54064)).mo56389s("#setAdditionalLanguages: %s", F);
        C60870cx a = kVar.f36123c.mo46039a(new C10982i(F), kVar.f36125e);
        C10983j jVar = new C10983j(kVar);
        nVar.f385375e.mo50445g(C46438d.m82809a(C60922j.m93045h(a, C47810es.m84966f(jVar), kVar.f36125e)), new C46436b("voice_languages"), nVar.f385379i);
        return false;
    }
}
