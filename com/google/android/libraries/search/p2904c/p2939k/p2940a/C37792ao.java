package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.android.libraries.search.p2904c.C37660hg;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38137o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.c.k.a.ao */
/* compiled from: PG */
public final class C37792ao implements C37660hg {

    /* renamed from: a */
    private static final C59071e f100286a = C59071e.m91332i("com.google.android.libraries.search.c.k.a.ao");

    /* renamed from: b */
    private final C37895i f100287b;

    public C37792ao(C37895i iVar) {
        this.f100287b = iVar;
    }

    /* renamed from: a */
    public final C37659hf mo41061a(C37662hi hiVar) {
        C59104x b = f100286a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.HWClient");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52813);
        C37773c cVar2 = hiVar.f100037f;
        if (cVar2 == null) {
            cVar2 = C37773c.f100243c;
        }
        cVar.mo56389s("#audio# start listening for hotword client(%s)", C37772b.m66674a(cVar2.f100245a).name());
        return this.f100287b.mo41113n(hiVar).mo41143b();
    }

    /* renamed from: b */
    public final C38137o mo41062b(C37462ck ckVar) {
        C59104x b = f100286a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.HWClient");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52812);
        C37467cp cpVar = ckVar.f99445b;
        if (cpVar == null) {
            cpVar = C37467cp.f99458c;
        }
        cVar.mo56389s("#audio# route hotword client to(%s)", C37465cn.m66491a(cpVar.f99460a).name());
        return this.f100287b.mo41118s(ckVar);
    }
}
