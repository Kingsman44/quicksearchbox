package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.media.AudioManager;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35870b;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35864u;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35866w;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a.p2747b.C35796a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52112fr;
import com.google.assistant.p3897e.p3921j.C52114ft;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.o */
/* compiled from: PG */
public final class C35809o implements C35870b {

    /* renamed from: a */
    private static final C59071e f93812a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.o");

    /* renamed from: b */
    private final AudioManager f93813b;

    /* renamed from: c */
    private final C35866w f93814c;

    /* renamed from: d */
    private final C35934c f93815d;

    /* renamed from: e */
    private final C35796a f93816e;

    public C35809o(AudioManager audioManager, C35935d dVar, C35796a aVar, C35866w wVar) {
        this.f93813b = audioManager;
        this.f93815d = dVar.mo39899a("device.MODIFY_SETTING");
        this.f93816e = aVar;
        this.f93814c = wVar;
    }

    /* renamed from: d */
    private final C52070ec m64214d(C63490p pVar, int i) {
        int a = C35864u.m64259a(pVar.name());
        if (this.f93814c.mo39873b(this.f93813b, pVar, i)) {
            C58976aa aaVar = C58975e.f156826a;
            pVar.name();
            return C36180b.f94544a;
        } else if (i == -100) {
            return m64216f(pVar, 7, 3, C59203do.f157270a);
        } else {
            if (i != 100) {
                String format = String.format(Locale.US, "Error mute/unmute stream volume, setting = %s, direction = %d.", new Object[]{pVar.name(), Integer.valueOf(i)});
                C59104x c = f93812a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ModifyVolume");
                ((C59052c) ((C59052c) c).mo56372aa(52035)).mo56389s("%s", format);
                return C36180b.m64579c(C52235kf.INTERNAL, format);
            } else if (this.f93813b.getStreamVolume(a) == 0) {
                return m64216f(pVar, 5, 1, C59203do.f157270a);
            } else {
                C59104x b = f93812a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ModifyVolume");
                ((C59052c) ((C59052c) b).mo56372aa(52036)).mo56389s("Current volume stream (setting = %s) is not muted, so skip unmute volume.", pVar.name());
                return C36180b.f94544a;
            }
        }
    }

    /* renamed from: e */
    private final boolean m64215e(int i, float f) {
        try {
            int i2 = (int) f;
            AudioManager audioManager = this.f93816e.f93776b;
            if (audioManager == null) {
                C59104x d = C35796a.f93775a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "StreamVolumeManager");
                ((C59052c) ((C59052c) d).mo56372aa(52067)).mo56386p("No audioManager provided for setStreamVolume.");
                return true;
            }
            audioManager.setStreamVolume(i, i2, 0);
            return true;
        } catch (SecurityException e) {
            C59104x c = f93812a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ModifyVolume");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52042)).mo56392v("Error setting stream volume, stream=%d, newValue=%f", i, f);
            return false;
        } catch (InterruptedException e2) {
            C59104x c2 = f93812a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ModifyVolume");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(52043)).mo56386p("Interrupted while waiting for StreamVolumeManager");
            Thread.currentThread().interrupt();
            return false;
        } catch (TimeoutException e3) {
            C59104x c3 = f93812a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "ModifyVolume");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(52044)).mo56386p("Timed out while waiting for StreamVolumeManager");
            return false;
        }
    }

    /* renamed from: f */
    private final C52070ec m64216f(C63490p pVar, int i, int i2, double d) {
        int i3;
        int i4;
        int a = C35864u.m64259a(pVar.name());
        try {
            AudioManager audioManager = this.f93816e.f93776b;
            if (audioManager == null) {
                C59104x d2 = C35796a.f93775a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "StreamVolumeManager");
                ((C59052c) ((C59052c) d2).mo56372aa(52066)).mo56386p("No audioManager provided for getStreamVolume.");
                i3 = -1;
            } else {
                i3 = audioManager.getStreamVolume(a);
            }
            AudioManager audioManager2 = this.f93816e.f93776b;
            if (audioManager2 == null) {
                C59104x d3 = C35796a.f93775a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "StreamVolumeManager");
                ((C59052c) ((C59052c) d3).mo56372aa(52065)).mo56386p("No audioManager provided for getStreamMaxVolume.");
                i4 = -1;
            } else {
                i4 = audioManager2.getStreamMaxVolume(a);
            }
            int f = C35864u.m64264f(i, i2, C35864u.m64263e(i, i2, d, i3, 0, i4), i3, 0, i4);
            if (f == -1) {
                C59104x d4 = f93812a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "ModifyVolume");
                ((C59052c) ((C59052c) d4).mo56372aa(52032)).mo56386p("new value is invalid.");
                return C36180b.m64579c(C52235kf.INTERNAL, "invalid value.");
            } else if (m64215e(a, (float) f)) {
                return C36180b.f94544a;
            } else {
                C59104x d5 = f93812a.mo56226d();
                d5.mo56378ag(C58975e.f156826a, "ModifyVolume");
                ((C59052c) ((C59052c) d5).mo56372aa(52031)).mo56386p("Failed to adjust volume.");
                return C36180b.m64578b(C52235kf.INTERNAL);
            }
        } catch (InterruptedException e) {
            C59104x c = f93812a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ModifyVolume");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52033)).mo56389s("%s", "Interrupted while waiting for StreamVolumeManager");
            Thread.currentThread().interrupt();
            return C36180b.m64579c(C52235kf.INTERNAL, "Interrupted while waiting for StreamVolumeManager");
        } catch (TimeoutException e2) {
            C59104x c2 = f93812a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ModifyVolume");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(52034)).mo56389s("%s", "Timed out while waiting for StreamVolumeManager");
            return C36180b.m64579c(C52235kf.INTERNAL, "Timed out while waiting for StreamVolumeManager");
        }
    }

    /* renamed from: a */
    public final C60870cx mo39851a(C52115fu fuVar) {
        C63490p pVar;
        C52070ec ecVar;
        String str = fuVar.f136760f;
        C58976aa aaVar = C58975e.f156826a;
        C35932a.m64317b(this.f93815d, str);
        try {
            pVar = C63490p.m96249a(str);
        } catch (IllegalArgumentException unused) {
            C59104x d = f93812a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ModifyVolume");
            ((C59052c) ((C59052c) d).mo56372aa(52041)).mo56386p("SettingId is not provided.");
            pVar = C63490p.UNSPECIFIED;
        }
        C63490p pVar2 = pVar;
        if ((fuVar.f136755a & 2) != 0) {
            int b = C52112fr.m86508b(fuVar.f136757c);
            if (b == 0) {
                b = 1;
            }
            int i = b - 1;
            if (i == 1) {
                ecVar = m64214d(pVar2, 100);
            } else if (i == 2) {
                ecVar = m64214d(pVar2, -100);
            } else if (i == 4 || i == 5 || i == 6) {
                int a = C52114ft.m86509a(fuVar.f136759e);
                ecVar = m64216f(pVar2, b, a == 0 ? 1 : a, fuVar.f136758d);
            } else {
                C59104x d2 = f93812a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ModifyVolume");
                ((C59052c) ((C59052c) d2).mo56372aa(52039)).mo56389s("Change type is not supported: %s", C52112fr.m86507a(b));
                ecVar = C36180b.m64579c(C52235kf.INTERNAL, "change not support.");
            }
        } else {
            C59104x d3 = f93812a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "ModifyVolume");
            ((C59052c) ((C59052c) d3).mo56372aa(52040)).mo56389s("%s", "Change is not provided.");
            ecVar = C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Change is not provided.");
        }
        this.f93815d.mo39896d(str, C36180b.m64580d(ecVar));
        return C60856cj.m92900i(ecVar);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo39852b(C35473i iVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ boolean mo39853c() {
        return false;
    }
}
