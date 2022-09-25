package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123977n;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.o */
/* compiled from: PG */
public final /* synthetic */ class C131405o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131377ai f359210a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f359211b;

    public /* synthetic */ C131405o(C131377ai aiVar, C58495hd hdVar) {
        this.f359210a = aiVar;
        this.f359211b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51058ev evVar;
        C131377ai aiVar = this.f359210a;
        C58495hd hdVar = this.f359211b;
        C52560wg wgVar = (C52560wg) obj;
        C51098gh ghVar = wgVar.f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str = evVar.f132944b;
        C123977n nVar = (C123977n) hdVar.get(str);
        if (nVar != null) {
            return nVar.mo106216a(wgVar, C50690ab.MBS);
        }
        ((C58970a) ((C58970a) aiVar.f359119b.mo56225c()).mo56372aa(39243)).mo56389s("#createMediaItemWrapperIfValid: Unsupported app: %s, using default wrapper", str);
        return aiVar.f359123f.mo106216a(wgVar, C50690ab.MBS);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
