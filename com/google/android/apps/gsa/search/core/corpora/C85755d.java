package com.google.android.apps.gsa.search.core.corpora;

import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.p395al.p417d.C8600b;
import java.util.Comparator;
import java.util.EnumMap;

/* renamed from: com.google.android.apps.gsa.search.core.corpora.d */
/* compiled from: PG */
public final class C85755d implements Comparator {

    /* renamed from: a */
    private final EnumMap f231876a;

    public C85755d(EnumMap enumMap) {
        this.f231876a = enumMap;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Corpus corpus = (Corpus) obj;
        Corpus corpus2 = (Corpus) obj2;
        if (corpus.f252915f == C8600b.WEB && corpus2.f252915f == C8600b.WEB) {
            return 0;
        }
        C8600b bVar = corpus.f252915f;
        C8600b bVar2 = C8600b.WEB;
        if (bVar == bVar2) {
            return -1;
        }
        if (corpus2.f252915f == bVar2) {
            return 1;
        }
        Integer num = (Integer) this.f231876a.get(bVar);
        if (num == null) {
            num = 100;
        }
        Integer num2 = (Integer) this.f231876a.get(corpus2.f252915f);
        if (num2 == null) {
            num2 = 100;
        }
        return num.intValue() - num2.intValue();
    }
}
