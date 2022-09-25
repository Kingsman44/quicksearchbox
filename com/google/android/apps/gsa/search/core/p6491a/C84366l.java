package com.google.android.apps.gsa.search.core.p6491a;

import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.libraries.gsa.conversation.p1852f.C22586m;
import com.google.android.libraries.gsa.conversation.p1852f.C22587n;
import com.google.common.p4522b.C58485gu;
import com.google.speech.p5224k.p5225a.C67193ak;
import com.google.speech.p5224k.p5225a.C67194al;

/* renamed from: com.google.android.apps.gsa.search.core.a.l */
/* compiled from: PG */
public final class C84366l {
    /* renamed from: a */
    public static C22587n m134626a(C90606n nVar) {
        C22586m mVar = new C22586m();
        mVar.mo27692b(nVar.mo84646b());
        if (nVar.mo84645a().mo56113h()) {
            C58485gu guVar = (C58485gu) nVar.mo84645a().mo56107c();
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                C67194al alVar = (C67194al) guVar.get(i);
                C67193ak akVar = alVar.f182646b;
                if (akVar == null) {
                    akVar = C67193ak.f182639c;
                }
                if ((akVar.f182641a & 8) != 0) {
                    String str = mVar.f62233c;
                    C67193ak akVar2 = alVar.f182646b;
                    if (akVar2 == null) {
                        akVar2 = C67193ak.f182639c;
                    }
                    if (!str.equals(akVar2.f182642b)) {
                        mVar.f62232b = true;
                        mVar.f62231a.mo55395g(alVar);
                        C67193ak akVar3 = alVar.f182646b;
                        if (akVar3 == null) {
                            akVar3 = C67193ak.f182639c;
                        }
                        mVar.f62233c = akVar3.f182642b;
                    }
                }
            }
        }
        return mVar.mo27691a();
    }
}
