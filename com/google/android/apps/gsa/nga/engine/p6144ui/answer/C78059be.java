package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.p3926e.C51981gg;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.assistant.p3897e.p3921j.p3926e.C51987gm;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.be */
/* compiled from: PG */
public final class C78059be {

    /* renamed from: a */
    public final Context f215019a;

    /* renamed from: b */
    public final C81515c f215020b;

    public C78059be(Context context, C81515c cVar) {
        this.f215019a = context;
        this.f215020b = cVar;
    }

    /* renamed from: a */
    public final C51986gl mo73039a(Intent intent, Locale locale) {
        C51981gg ggVar = (C51981gg) C51986gl.f136421f.createBuilder();
        C51987gm gmVar = (C51987gm) C51992gr.f136445r.createBuilder();
        String string = this.f215020b.mo75121a(locale).getString(R.string.nga_missing_permission_action, new Object[0]);
        gmVar.copyOnWrite();
        C51992gr grVar = (C51992gr) gmVar.instance;
        string.getClass();
        grVar.f136447a |= 8;
        grVar.f136451e = string;
        C51097gg ggVar2 = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String uri = intent.toUri(1);
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        uri.getClass();
        evVar.f132943a |= 32;
        evVar.f132949g = uri;
        ggVar2.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar2.instance;
        C51058ev evVar2 = (C51058ev) esVar.build();
        evVar2.getClass();
        ghVar.f133013c = evVar2;
        ghVar.f133012b = 1;
        gmVar.copyOnWrite();
        C51992gr grVar2 = (C51992gr) gmVar.instance;
        C51098gh ghVar2 = (C51098gh) ggVar2.build();
        ghVar2.getClass();
        grVar2.f136453g = ghVar2;
        grVar2.f136447a |= 32;
        ggVar.copyOnWrite();
        C51986gl glVar = (C51986gl) ggVar.instance;
        C51992gr grVar3 = (C51992gr) gmVar.build();
        grVar3.getClass();
        glVar.mo53773a();
        glVar.f136424b.add(grVar3);
        return (C51986gl) ggVar.build();
    }

    /* renamed from: b */
    public final void mo73040b(int i, C80399l lVar, Intent intent, Locale locale) {
        C81442m.m129557s(lVar, t.r(this.f215020b.mo75121a(locale).getString(i, new Object[0])));
        C81442m.m129557s(lVar, t.n(mo73039a(intent, locale)));
    }
}
