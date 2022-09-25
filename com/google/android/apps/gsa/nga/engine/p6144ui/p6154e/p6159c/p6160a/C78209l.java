package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78251c;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78535ar;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80735dj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80736dk;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80747dv;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80759eg;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80760eh;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80798fs;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.l */
/* compiled from: PG */
public final /* synthetic */ class C78209l implements C83343ad {

    /* renamed from: a */
    public final /* synthetic */ C78253d f215336a;

    /* renamed from: b */
    public final /* synthetic */ C81515c f215337b;

    public /* synthetic */ C78209l(C78253d dVar, C81515c cVar) {
        this.f215336a = dVar;
        this.f215337b = cVar;
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C78253d dVar = this.f215336a;
        C81515c cVar = this.f215337b;
        Locale locale = (Locale) obj;
        C78540aw awVar = (C78540aw) obj3;
        if (!((Boolean) obj2).booleanValue()) {
            return C80760eh.f221668f;
        }
        if (!dVar.mo73202a().equals(C78251c.OPTION_1) || !awVar.mo73436b().mo73472a().equals(C78535ar.TRANSCRIPTION)) {
            C80759eg egVar = (C80759eg) C80760eh.f221668f.createBuilder();
            C80735dj djVar = (C80735dj) C80736dk.f221621c.createBuilder();
            djVar.copyOnWrite();
            ((C80736dk) djVar.instance).f221624b = R.drawable.nga_assist_ic_keyboard;
            egVar.copyOnWrite();
            C80736dk dkVar = (C80736dk) djVar.build();
            dkVar.getClass();
            ((C80760eh) egVar.instance).f221672c = dkVar;
            C80747dv dvVar = C80747dv.f221644a;
            egVar.copyOnWrite();
            C80760eh ehVar = (C80760eh) egVar.instance;
            dvVar.getClass();
            ehVar.f221671b = dvVar;
            ehVar.f221670a = 3;
            String string = cVar.mo75121a(locale).getString(R.string.tactile_keyboard_footer_keyboard_content_description, new Object[0]);
            egVar.copyOnWrite();
            string.getClass();
            ((C80760eh) egVar.instance).f221674e = string;
            egVar.copyOnWrite();
            ((C80760eh) egVar.instance).f221673d = 92647;
            return (C80760eh) egVar.build();
        }
        C80759eg egVar2 = (C80759eg) C80760eh.f221668f.createBuilder();
        C80735dj djVar2 = (C80735dj) C80736dk.f221621c.createBuilder();
        djVar2.copyOnWrite();
        ((C80736dk) djVar2.instance).f221624b = R.drawable.wowo_retry_icon;
        egVar2.copyOnWrite();
        C80736dk dkVar2 = (C80736dk) djVar2.build();
        dkVar2.getClass();
        ((C80760eh) egVar2.instance).f221672c = dkVar2;
        C80747dv dvVar2 = C80747dv.f221644a;
        egVar2.copyOnWrite();
        C80760eh ehVar2 = (C80760eh) egVar2.instance;
        dvVar2.getClass();
        ehVar2.f221671b = dvVar2;
        ehVar2.f221670a = 3;
        C80798fs fsVar = C80798fs.f221719a;
        egVar2.copyOnWrite();
        C80760eh ehVar3 = (C80760eh) egVar2.instance;
        fsVar.getClass();
        ehVar3.f221671b = fsVar;
        ehVar3.f221670a = 7;
        String string2 = cVar.mo75121a(locale).getString(R.string.tactile_keyboard_footer_wowo_content_description, new Object[0]);
        egVar2.copyOnWrite();
        string2.getClass();
        ((C80760eh) egVar2.instance).f221674e = string2;
        egVar2.copyOnWrite();
        ((C80760eh) egVar2.instance).f221673d = 145600;
        return (C80760eh) egVar2.build();
    }
}
