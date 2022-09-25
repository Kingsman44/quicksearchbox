package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8745m;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41662ab;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41664ad;
import com.google.android.libraries.searchbox.shared.suggestion.C41667ag;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.m.e */
/* compiled from: PG */
public final class C116990e extends C88582c {

    /* renamed from: a */
    private final Context f324779a;

    /* renamed from: b */
    private final C86124t f324780b;

    /* renamed from: c */
    private Map f324781c;

    public C116990e(Context context, C86124t tVar) {
        this.f324779a = context;
        this.f324780b = tVar;
    }

    /* renamed from: a */
    private final String m194424a(String str) {
        try {
            ApplicationInfo applicationInfo = this.f324779a.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo.icon != 0) {
                int i = applicationInfo.icon;
                return "android.resource://" + str + "/" + i;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    private final void m194425b() {
        if (this.f324781c == null) {
            this.f324781c = new HashMap();
            C116986a aVar = new C116986a("content://com.example.androidx.slice.demos/wifi", m194424a("com.example.androidx.slice.demos"));
            this.f324781c.put("wifi", aVar);
            this.f324781c.put("wi-fi", aVar);
            this.f324781c.put("message", new C116986a("content://com.example.androidx.slice.demos/message", m194424a("com.example.androidx.slice.demos")));
            this.f324781c.put("note", new C116986a("content://com.example.androidx.slice.demos/note", m194424a("com.example.androidx.slice.demos")));
            this.f324781c.put("ride", new C116986a("content://com.example.androidx.slice.demos/ride", m194424a("com.example.androidx.slice.demos")));
            this.f324781c.put("toggle", new C116986a("content://com.example.androidx.slice.demos/toggle", m194424a("com.example.androidx.slice.demos")));
            this.f324781c.put("lyft", new C116986a("content://com.example.tsurantino.lyftslice/main", m194424a("com.example.tsurantino.lyftslice")));
            this.f324781c.put("hawaii", new C116986a("content://com.example.tsurantino.photoslice/main", m194424a("com.example.tsurantino.photoslice")));
            this.f324781c.put("machine learning", new C116986a("content://com.example.tsurantino.courseraslice/main", m194424a("com.example.tsurantino.courseraslice")));
        }
    }

    /* renamed from: l */
    public final C41626a mo82235l(C41642a aVar) {
        if (this.f324780b.mo79746e(C90085ej.f250159aj) && this.f324780b.mo79746e(C90085ej.f250158ai)) {
            String lowerCase = ((C88616t) aVar).f239556a.mo84352bk().trim().toLowerCase();
            m194425b();
            C116989d dVar = (C116989d) this.f324781c.get(lowerCase);
            if (dVar != null) {
                C41662ab abVar = (C41662ab) C41663ac.f108934g.createBuilder();
                String a = dVar.mo103082a();
                abVar.copyOnWrite();
                C41663ac acVar = (C41663ac) abVar.instance;
                a.getClass();
                acVar.f108937b = 3;
                acVar.f108938c = a;
                C41663ac acVar2 = (C41663ac) abVar.build();
                C41664ad adVar = (C41664ad) C41667ag.f108943h.createBuilder();
                String b = dVar.mo103083b();
                adVar.copyOnWrite();
                C41667ag agVar = (C41667ag) adVar.instance;
                b.getClass();
                agVar.f108945a |= 1;
                agVar.f108946b = b;
                adVar.copyOnWrite();
                C41667ag agVar2 = (C41667ag) adVar.instance;
                agVar2.f108947c = 2;
                agVar2.f108945a |= 2;
                C41667ag agVar3 = (C41667ag) adVar.build();
                C41678d dVar2 = (C41678d) C41679e.f109005p.createBuilder();
                dVar2.copyOnWrite();
                C41679e eVar = (C41679e) dVar2.instance;
                acVar2.getClass();
                eVar.f109008b = acVar2;
                eVar.f109007a |= 2;
                dVar2.copyOnWrite();
                C41679e eVar2 = (C41679e) dVar2.instance;
                agVar3.getClass();
                eVar2.f109016j = agVar3;
                eVar2.f109007a |= 512;
                return new C41626a(C58485gu.m89846n(new RootSuggestion("'" + lowerCase + "' Slice", 3, 156, C58485gu.m89846n(286), BuildConfig.FLAVOR, C41669ai.f108961j, 1500, (C54228aq) null, (C41679e) dVar2.build())));
            }
        }
        return new C41626a(C58485gu.m89845m());
    }

    /* renamed from: o */
    public final boolean mo82238o(C41642a aVar) {
        if (this.f324780b.mo79746e(C90085ej.f250159aj) && this.f324780b.mo79746e(C90085ej.f250158ai)) {
            m194425b();
            if (this.f324781c.get(((C88616t) aVar).f239556a.mo84352bk().trim().toLowerCase()) != null) {
                return true;
            }
        }
        return false;
    }
}
