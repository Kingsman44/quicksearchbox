package com.google.android.libraries.assistant.soda.p1606e;

import com.google.android.libraries.assistant.soda.p1606e.p1608b.C19301a;
import com.google.android.libraries.assistant.soda.p1606e.p1608b.C19302b;
import com.google.android.libraries.mdi.download.C28703ai;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28713as;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.soda.e.b */
/* compiled from: PG */
public final class C19300b implements C28746bx {

    /* renamed from: a */
    private static final C59071e f54028a = C59071e.m91332i("com.google.android.libraries.assistant.soda.e.b");

    /* renamed from: b */
    private final C19301a f54029b;

    public C19300b(C19301a aVar) {
        this.f54029b = aVar;
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C58833ax axVar;
        C58833ax a = this.f54029b.mo24446a();
        if (!a.mo56113h()) {
            return C60866ct.f164955a;
        }
        String str = (String) a.mo56107c();
        Map b = this.f54029b.mo24447b();
        if (b.containsKey(str)) {
            axVar = C58833ax.m90834k((String) b.get(str));
        } else {
            axVar = b.containsKey(C19302b.m36801b(str)) ? C58833ax.m90834k((String) b.get(C19302b.m36801b(str))) : C58836b.f156633a;
        }
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) f54028a.mo56226d()).mo56372aa(47700)).mo56389s("No hotword model URL available for locale: %s", str);
            return C60866ct.f164955a;
        }
        String str2 = (String) axVar.mo56107c();
        C28707am amVar = (C28707am) C28708an.f77994l.createBuilder();
        String a2 = C19302b.m36800a(str);
        amVar.copyOnWrite();
        C28708an anVar = (C28708an) amVar.instance;
        a2.getClass();
        anVar.f77996a |= 1;
        anVar.f77997b = a2;
        C28713as asVar = (C28713as) C28716av.f78018d.createBuilder();
        asVar.copyOnWrite();
        C28716av avVar = (C28716av) asVar.instance;
        avVar.f78022c = 1;
        avVar.f78020a |= 2;
        asVar.copyOnWrite();
        C28716av avVar2 = (C28716av) asVar.instance;
        avVar2.f78021b = 2;
        avVar2.f78020a |= 1;
        C28716av avVar3 = (C28716av) asVar.build();
        amVar.copyOnWrite();
        C28708an anVar2 = (C28708an) amVar.instance;
        avVar3.getClass();
        anVar2.f78002g = avVar3;
        anVar2.f77996a |= 1024;
        amVar.copyOnWrite();
        C28708an anVar3 = (C28708an) amVar.instance;
        anVar3.f77996a |= 256;
        anVar3.f78001f = 86400;
        C28703ai aiVar = (C28703ai) C28706al.f77976q.createBuilder();
        aiVar.copyOnWrite();
        C28706al alVar = (C28706al) aiVar.instance;
        alVar.f77978a |= 1;
        alVar.f77979b = "hotword.data";
        aiVar.copyOnWrite();
        C28706al alVar2 = (C28706al) aiVar.instance;
        str2.getClass();
        alVar2.f77978a |= 2;
        alVar2.f77980c = str2;
        aiVar.copyOnWrite();
        C28706al alVar3 = (C28706al) aiVar.instance;
        alVar3.f77982e = 1;
        alVar3.f77978a |= 8;
        amVar.mo34329c((C28706al) aiVar.build());
        C29343e eVar = new C29343e();
        eVar.mo34326b((C28708an) amVar.build());
        return C60922j.m93044g(fdVar.mo34712a(eVar.mo34325a()), C47810es.m84963c(C19286a.f54010a), C60826bg.f164896a);
    }
}
