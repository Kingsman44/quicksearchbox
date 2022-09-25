package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.u */
/* compiled from: PG */
public final class C106967u implements C106869ad {

    /* renamed from: a */
    private final Context f297952a;

    /* renamed from: b */
    private final C90021c f297953b;

    /* renamed from: c */
    private final C83564a f297954c;

    /* renamed from: d */
    private final C106964r f297955d;

    /* renamed from: e */
    private final C58974d f297956e;

    /* renamed from: f */
    private final boolean f297957f;

    public C106967u(Context context, C90021c cVar, C106964r rVar, C83564a aVar, boolean z) {
        this.f297952a = context;
        this.f297953b = cVar;
        this.f297954c = aVar;
        this.f297956e = aVar.mo76900a("PodcastsMediaFactory");
        this.f297955d = rVar;
        this.f297957f = z;
    }

    /* renamed from: a */
    public final C58833ax mo95711a(C52560wg wgVar, C50690ab abVar) {
        C52560wg wgVar2;
        C51058ev evVar;
        if (!this.f297955d.mo95723b(wgVar, abVar)) {
            return C58836b.f156633a;
        }
        if (this.f297957f) {
            ((C58970a) ((C58970a) this.f297956e.mo56224b()).mo56372aa(23356)).mo56389s("#create: Using %s for rendering.", "com.google.android.apps.podcasts");
            C52559wf wfVar = (C52559wf) wgVar.toBuilder();
            C51098gh ghVar = wgVar.f137949e;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            C51097gg ggVar = (C51097gg) ghVar.toBuilder();
            C51098gh ghVar2 = wgVar.f137949e;
            if (ghVar2 == null) {
                ghVar2 = C51098gh.f133009e;
            }
            if (ghVar2.f133012b == 1) {
                evVar = (C51058ev) ghVar2.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            C51055es esVar = (C51055es) evVar.toBuilder();
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            evVar2.f132943a |= 1;
            evVar2.f132944b = "com.google.android.apps.podcasts";
            ggVar.copyOnWrite();
            C51098gh ghVar3 = (C51098gh) ggVar.instance;
            C51058ev evVar3 = (C51058ev) esVar.build();
            evVar3.getClass();
            ghVar3.f133013c = evVar3;
            ghVar3.f133012b = 1;
            wfVar.copyOnWrite();
            C52560wg wgVar3 = (C52560wg) wfVar.instance;
            C51098gh ghVar4 = (C51098gh) ggVar.build();
            ghVar4.getClass();
            wgVar3.f137949e = ghVar4;
            wgVar3.f137945a |= 4;
            wgVar2 = (C52560wg) wfVar.build();
        } else if (this.f297953b.mo79746e(C90017bw.f248001ca)) {
            ((C58970a) ((C58970a) this.f297956e.mo56224b()).mo56372aa(23355)).mo56389s("#create: %s not found. No media item created.", "com.google.android.apps.podcasts");
            return C58836b.f156633a;
        } else {
            ((C58970a) ((C58970a) this.f297956e.mo56224b()).mo56372aa(23354)).mo56389s("#create: %s not found. AGSA will be used for rendering.", "com.google.android.apps.podcasts");
            wgVar2 = wgVar;
        }
        return C58833ax.m90834k(new C106965s(this.f297952a, this.f297954c, abVar, wgVar2, wgVar));
    }
}
