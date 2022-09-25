package com.google.android.apps.gsa.search.core.corpora;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.p395al.p408c.p414c.p416b.C8498h;

/* renamed from: com.google.android.apps.gsa.search.core.corpora.a */
/* compiled from: PG */
public final class C85752a {

    /* renamed from: a */
    public final C58495hd f231871a;

    /* renamed from: b */
    public final C58485gu f231872b;

    /* renamed from: c */
    public final C58495hd f231873c;

    public C85752a(C58495hd hdVar, C58495hd hdVar2, C58485gu guVar, C8498h hVar) {
        hdVar.getClass();
        this.f231871a = hdVar;
        guVar.getClass();
        this.f231872b = guVar;
        hVar.getClass();
        hdVar2.getClass();
        this.f231873c = hdVar2;
    }

    /* renamed from: c */
    public static String m137793c(String str, String str2) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        return str + ";" + str2;
    }

    /* renamed from: a */
    public final WebCorpus mo79407a() {
        return (WebCorpus) this.f231871a.get("web");
    }

    /* renamed from: b */
    public final Corpus mo79408b(String str) {
        if (str == null) {
            return null;
        }
        Corpus corpus = (Corpus) this.f231871a.get(str);
        if (corpus == null) {
            int indexOf = str.indexOf(46);
            C58838bb.m90887v(indexOf >= 0, "Invalid corpus id %s", str);
            corpus = (Corpus) this.f231871a.get(str.substring(0, indexOf));
        }
        C58838bb.m90867b(corpus, "No corpus found for id %s", str);
        return corpus;
    }

    /* renamed from: d */
    public final boolean mo79409d() {
        return mo79407a() != null;
    }
}
