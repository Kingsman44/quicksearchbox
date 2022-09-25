package com.google.android.apps.gsa.search.core.tasks.now;

import android.content.Context;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86317h;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C8078us;
import com.google.p375ai.p378b.C8085uz;
import com.google.p375ai.p378b.C8091ve;
import com.google.p375ai.p378b.C8098vl;

/* renamed from: com.google.android.apps.gsa.search.core.tasks.now.j */
/* compiled from: PG */
public final class C87190j implements C118549h {

    /* renamed from: a */
    private final Context f235588a;

    /* renamed from: b */
    private final C86338r f235589b;

    /* renamed from: c */
    private final C86319j f235590c;

    public C87190j(Context context, C86338r rVar, C86319j jVar) {
        this.f235588a = context;
        this.f235589b = rVar;
        this.f235590c = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C8085uz uzVar;
        C8085uz uzVar2;
        C86317h a = this.f235590c.mo80040a();
        Resources resources = this.f235588a.getResources();
        String string = resources.getString(R.string.notification_vibrate_preference);
        if (this.f235589b.contains(string)) {
            boolean z = this.f235589b.getBoolean(string, false);
            synchronized (a.f233379b) {
                C8078us a2 = a.mo80033a();
                if (a2 == null) {
                    C59104x d = C86317h.f233378a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "NowConfigurationPrefs");
                    ((C59052c) ((C59052c) d).mo56372aa(8308)).mo56386p("Attempt to write vibrate preference without backing configuration");
                } else {
                    C8098vl vlVar = (C8098vl) a2.instance;
                    if ((vlVar.f28475b & 16384) != 0) {
                        C8091ve veVar = vlVar.f28483j;
                        if (veVar == null) {
                            veVar = C8091ve.f28455e;
                        }
                        uzVar2 = (C8085uz) veVar.toBuilder();
                    } else {
                        uzVar2 = (C8085uz) C8091ve.f28455e.createBuilder();
                    }
                    uzVar2.copyOnWrite();
                    C8091ve veVar2 = (C8091ve) uzVar2.instance;
                    veVar2.f28457a |= 2;
                    veVar2.f28459c = z;
                    a2.copyOnWrite();
                    C8098vl vlVar2 = (C8098vl) a2.instance;
                    C8091ve veVar3 = (C8091ve) uzVar2.build();
                    veVar3.getClass();
                    vlVar2.f28483j = veVar3;
                    vlVar2.f28475b |= 16384;
                    a.mo80036d();
                }
            }
        }
        String string2 = resources.getString(R.string.notification_sound_preference);
        if (this.f235589b.contains(string2)) {
            String string3 = this.f235589b.getString(string2, BuildConfig.FLAVOR);
            synchronized (a.f233379b) {
                C8078us a3 = a.mo80033a();
                if (a3 == null) {
                    C59104x d2 = C86317h.f233378a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "NowConfigurationPrefs");
                    ((C59052c) ((C59052c) d2).mo56372aa(8307)).mo56386p("Attempt to write ringtone preference without backing configuration");
                } else {
                    C8098vl vlVar3 = (C8098vl) a3.instance;
                    if ((vlVar3.f28475b & 16384) != 0) {
                        C8091ve veVar4 = vlVar3.f28483j;
                        if (veVar4 == null) {
                            veVar4 = C8091ve.f28455e;
                        }
                        uzVar = (C8085uz) veVar4.toBuilder();
                    } else {
                        uzVar = (C8085uz) C8091ve.f28455e.createBuilder();
                    }
                    uzVar.copyOnWrite();
                    C8091ve veVar5 = (C8091ve) uzVar.instance;
                    string3.getClass();
                    veVar5.f28457a |= 4;
                    veVar5.f28460d = string3;
                    a3.copyOnWrite();
                    C8098vl vlVar4 = (C8098vl) a3.instance;
                    C8091ve veVar6 = (C8091ve) uzVar.build();
                    veVar6.getClass();
                    vlVar4.f28483j = veVar6;
                    vlVar4.f28475b |= 16384;
                    a.mo80036d();
                }
            }
        }
        return C118826c.f331423b;
    }
}
