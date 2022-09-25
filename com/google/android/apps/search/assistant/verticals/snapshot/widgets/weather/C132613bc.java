package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b.C132610b;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132641h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.bc */
/* compiled from: PG */
public final class C132613bc {

    /* renamed from: a */
    public static final C59071e f361914a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.bc");

    /* renamed from: b */
    public final C132610b f361915b;

    /* renamed from: c */
    private final C60887da f361916c;

    /* renamed from: d */
    private final C42876ab f361917d;

    /* renamed from: e */
    private final C21370a f361918e;

    public C132613bc(C60887da daVar, C42876ab abVar, C21370a aVar, C132610b bVar) {
        this.f361916c = daVar;
        this.f361917d = abVar;
        this.f361918e = aVar;
        this.f361915b = bVar;
    }

    /* renamed from: d */
    private final void m215592d(C53258hf hfVar) {
        this.f361917d.mo46039a(new C132611ba(hfVar), this.f361916c);
    }

    /* renamed from: e */
    private final void m215593e(C53258hf hfVar, C63042fg fgVar) {
        this.f361917d.mo46039a(new C132607az(this, hfVar, fgVar), this.f361916c);
    }

    /* renamed from: a */
    public final void mo110839a(Context context) {
        int length = C132582aa.m215550d(context).length;
        int length2 = C132582aa.m215549c(context).length;
        if (length == 0) {
            m215592d(C53258hf.WIDGET_TYPE_SQUARE);
        }
        if (length2 == 0) {
            m215592d(C53258hf.WIDGET_TYPE_FREEFORM);
        }
        if (length + length2 == 0) {
            m215592d(C53258hf.WIDGET_TYPE_ALL);
        }
    }

    /* renamed from: b */
    public final void mo110840b(C53258hf hfVar) {
        C63042fg i = C62953e.m95484i(this.f361918e.mo26870b());
        m215593e(hfVar, i);
        m215593e(C53258hf.WIDGET_TYPE_ALL, i);
    }

    /* renamed from: c */
    public final void mo110841c(int i) {
        C63042fg i2 = C62953e.m95484i(this.f361918e.mo26870b());
        C59104x b = f361914a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WeatherWidgetDataUpdater");
        ((C59052c) ((C59052c) b).mo56372aa(39754)).mo56353F("#updateLastActivityForUIType, UI type: %s, current timestamp (seconds): %d", C132641h.m215615a(i), i2.f170154a);
        this.f361917d.mo46039a(new C132612bb(this, i, i2), this.f361916c);
    }
}
