package com.google.android.apps.gsa.shared.p7038f.p7039a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p3339v.C43205e;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.assistant.p3825an.p3830c.p3831a.C49293bl;
import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.f.a.am */
/* compiled from: PG */
public final /* synthetic */ class C89736am implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C89737an f242909a;

    /* renamed from: b */
    public final /* synthetic */ Optional f242910b;

    /* renamed from: c */
    public final /* synthetic */ Optional f242911c;

    public /* synthetic */ C89736am(C89737an anVar, Optional optional, Optional optional2) {
        this.f242909a = anVar;
        this.f242910b = optional;
        this.f242911c = optional2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C89737an anVar = this.f242909a;
        Optional optional = this.f242910b;
        Optional optional2 = this.f242911c;
        C49293bl blVar = (C49293bl) obj;
        if (blVar.f127403a.isEmpty()) {
            return C60856cj.m92900i(C49337n.f127527b);
        }
        C22871g gVar = anVar.f242912a;
        C89741ar arVar = anVar.f242914c;
        C142826w wVar = new C142826w();
        for (C49267am amVar : blVar.f127403a) {
            String str = amVar.f127349b;
            Optional ofNullable = Optional.ofNullable((String) C89758r.f242950a.get(amVar.f127350c));
            CorpusId corpusId = null;
            if (ofNullable.isPresent()) {
                corpusId = new CorpusId(str, (String) ofNullable.get(), (Bundle) null);
            }
            Optional ofNullable2 = Optional.ofNullable(corpusId);
            if (!ofNullable2.isEmpty()) {
                String str2 = ((CorpusId) ofNullable2.get()).f387417a;
                String str3 = ((CorpusId) ofNullable2.get()).f387418b;
                wVar.mo117756b((CorpusId) ofNullable2.get());
                wVar.mo117757c((CorpusId) ofNullable2.get(), amVar.f127351d, amVar.f127352e);
            }
        }
        wVar.f387611d = true;
        optional.ifPresent(new C89759s(wVar));
        optional2.ifPresent(new C89760t(wVar));
        if (!optional2.isPresent() || !((String) optional2.get()).equals("AppActionsNga")) {
            wVar.f387614g = "AppActions";
        } else {
            wVar.f387614g = "AppActionsIcingCache";
        }
        C60870cx e = C90877ak.m148471e(C43205e.m76192b(arVar.f242919a.mo122338b(BuildConfig.FLAVOR, 100, wVar.mo117755a())), 5000, TimeUnit.MILLISECONDS, anVar.f242913b);
        Objects.requireNonNull(anVar.f242915d);
        return gVar.mo28205e(gVar.mo28209i(e, "AppActionsIcing : Icing search execution", new C89734ak()), "AppActionsIcing : Icing search with timeout", TimeoutException.class, C89735al.f242908a);
    }
}
