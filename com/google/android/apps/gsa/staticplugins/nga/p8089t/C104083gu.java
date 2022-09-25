package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.mdi.download.C28798cm;
import com.google.android.libraries.mdi.download.C28800co;
import com.google.android.libraries.mdi.download.C28802cq;
import com.google.android.libraries.mdi.download.C28803cr;
import com.google.android.libraries.mdi.download.p2248h.C29628y;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gu */
/* compiled from: PG */
public final /* synthetic */ class C104083gu implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86054o f289588a;

    /* renamed from: b */
    public final /* synthetic */ ae f289589b;

    /* renamed from: c */
    public final /* synthetic */ C29628y f289590c;

    public /* synthetic */ C104083gu(C86054o oVar, ae aeVar, C29628y yVar) {
        this.f289588a = oVar;
        this.f289589b = aeVar;
        this.f289590c = yVar;
    }

    public final Object apply(Object obj) {
        C86054o oVar = this.f289588a;
        ae aeVar = this.f289589b;
        C29628y yVar = this.f289590c;
        C28798cm cmVar = (C28798cm) obj;
        String F = oVar.mo79659F();
        Locale locale = Locale.getDefault();
        if (!C58837ba.m90859h(F)) {
            locale = aeVar.d(F);
        }
        String languageTag = locale.toLanguageTag();
        cmVar.copyOnWrite();
        C28803cr crVar = (C28803cr) cmVar.instance;
        C28803cr crVar2 = C28803cr.f78265n;
        languageTag.getClass();
        crVar.f78267a |= 32;
        crVar.f78272f = languageTag;
        cmVar.copyOnWrite();
        C28803cr crVar3 = (C28803cr) cmVar.instance;
        crVar3.f78267a |= 8;
        crVar3.f78270d = "GddWebrefNga";
        C28800co coVar = (C28800co) C28802cq.f78261c.createBuilder();
        int i = true != ((C58833ax) yVar.mo6453a()).mo56113h() ? 2 : 3;
        coVar.copyOnWrite();
        C28802cq cqVar = (C28802cq) coVar.instance;
        cqVar.f78264b = i - 1;
        cqVar.f78263a |= 1;
        C28802cq cqVar2 = (C28802cq) coVar.build();
        cmVar.copyOnWrite();
        C28803cr crVar4 = (C28803cr) cmVar.instance;
        cqVar2.getClass();
        crVar4.f78273g = cqVar2;
        crVar4.f78267a |= 64;
        return (C28803cr) cmVar.build();
    }
}
