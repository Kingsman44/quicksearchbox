package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.unifiedime.C118601s;
import com.google.android.apps.gsa.unifiedime.C118604v;
import com.google.android.apps.gsa.unifiedime.C118605w;
import com.google.android.apps.gsa.unifiedime.C118606x;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125132df;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125133dg;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126324be;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126333j;
import com.google.p440an.p441a.C8841h;
import java.util.Locale;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.cr */
/* compiled from: PG */
public final class C126258cr {

    /* renamed from: a */
    private final C70862aj f347901a;

    /* renamed from: b */
    private final Locale f347902b;

    public C126258cr(C70862aj ajVar, Locale locale) {
        this.f347901a = ajVar;
        this.f347902b = locale;
    }

    /* renamed from: a */
    public final void mo107491a(C125065at atVar, C125065at atVar2, String str, C126324be beVar) {
        Boolean bool;
        if (atVar.f345042a.isEmpty()) {
            C126333j jVar = (C126333j) beVar;
            if (((String) jVar.f348020e.orElse(BuildConfig.FLAVOR)).equals(str) && jVar.f348016a.equals(atVar2)) {
                return;
            }
        }
        C125064as asVar = (C125064as) C125065at.f345040b.createBuilder();
        asVar.mo106793a(atVar.f345042a);
        if (str.isEmpty()) {
            bool = false;
        } else {
            bool = Boolean.valueOf(!this.f347902b.getLanguage().equals(C8841h.f30232e.f30255g));
        }
        if (bool.booleanValue()) {
            C118605w wVar = (C118605w) C118606x.f330892g.createBuilder();
            wVar.copyOnWrite();
            C118606x xVar = (C118606x) wVar.instance;
            str.getClass();
            xVar.f330894a |= 1;
            xVar.f330895b = str;
            wVar.copyOnWrite();
            C118606x xVar2 = (C118606x) wVar.instance;
            xVar2.f330894a |= 2;
            xVar2.f330896c = true;
            C118601s sVar = (C118601s) C118604v.f330885f.createBuilder();
            sVar.copyOnWrite();
            C118604v vVar = (C118604v) sVar.instance;
            vVar.f330887a |= 1;
            vVar.f330888b = 0;
            int codePointCount = str.codePointCount(0, str.length());
            sVar.copyOnWrite();
            C118604v vVar2 = (C118604v) sVar.instance;
            vVar2.f330887a |= 2;
            vVar2.f330889c = codePointCount;
            sVar.copyOnWrite();
            C118604v vVar3 = (C118604v) sVar.instance;
            vVar3.f330890d = 2;
            vVar3.f330887a |= 4;
            wVar.mo103784a(sVar);
            asVar.mo106795c((C118606x) wVar.build());
        }
        asVar.mo106793a(atVar2.f345042a);
        if (atVar2.f345042a.isEmpty()) {
            asVar.mo106795c(C118606x.f330892g);
        }
        C125065at atVar3 = (C125065at) asVar.build();
        C70862aj ajVar = this.f347901a;
        C125132df dfVar = (C125132df) C125133dg.f345203c.createBuilder();
        dfVar.copyOnWrite();
        C125133dg dgVar = (C125133dg) dfVar.instance;
        atVar3.getClass();
        dgVar.f345206b = atVar3;
        dgVar.f345205a = 1;
        ajVar.mo20123c((C125133dg) dfVar.build());
    }
}
