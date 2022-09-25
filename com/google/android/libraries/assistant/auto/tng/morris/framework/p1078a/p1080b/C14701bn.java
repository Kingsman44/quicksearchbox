package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import androidx.slice.C4110i;
import androidx.slice.C4121t;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14088p;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bn */
/* compiled from: PG */
public final class C14701bn implements C14985g {

    /* renamed from: a */
    public static final C59071e f44422a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bn");

    /* renamed from: b */
    public final Context f44423b;

    /* renamed from: c */
    public final C86124t f44424c;

    /* renamed from: d */
    public final C14096x f44425d;

    /* renamed from: e */
    public final NotificationManager f44426e;

    /* renamed from: f */
    public final C14697bj f44427f;

    /* renamed from: g */
    public C14696bi f44428g;

    /* renamed from: h */
    public AudioManager f44429h;

    /* renamed from: i */
    public OptionalInt f44430i = OptionalInt.empty();

    /* renamed from: j */
    public OptionalInt f44431j = OptionalInt.empty();

    /* renamed from: k */
    public int f44432k;

    /* renamed from: l */
    private final C60887da f44433l;

    public C14701bn(Context context, C86124t tVar, C60887da daVar, C14096x xVar, C14697bj bjVar) {
        this.f44423b = context;
        this.f44424c = tVar;
        this.f44433l = daVar;
        this.f44425d = xVar;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.f44426e = notificationManager;
        this.f44427f = bjVar;
    }

    /* renamed from: n */
    private final void m30875n() {
        C58976aa aaVar = C58975e.f156826a;
        mo21671f();
        try {
            this.f44429h.setStreamVolume(2, this.f44430i.getAsInt(), 0);
            this.f44430i = OptionalInt.empty();
            this.f44425d.mo21403g();
        } catch (SecurityException e) {
            C59104x c = f44422a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.VolumeAdjust");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45480)).mo56386p("Couldn't set stream volume -- probably changing DND status without notification policy access.");
        }
    }

    /* renamed from: a */
    public final void mo21501a() {
        C59104x d = f44422a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.VolumeAdjust");
        ((C59052c) ((C59052c) d).mo56372aa(45466)).mo56386p("#onMorrisCrashed");
        mo21673i();
        mo21672h();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final void mo21503c() {
        new C4121t(this.f44423b);
        C14700bm bmVar = new C14700bm(this);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(bmVar), this.f44433l), "Failed to initialize slices", new Object[0]);
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        mo21673i();
        mo21672h();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final void mo21671f() {
        if (this.f44429h == null) {
            AudioManager audioManager = (AudioManager) this.f44423b.getSystemService("audio");
            audioManager.getClass();
            this.f44429h = audioManager;
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo21672h() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f44430i.isPresent()) {
            return;
        }
        if (this.f44426e.isNotificationPolicyAccessGranted()) {
            m30875n();
        } else if (mo21676l()) {
            mo21675k(this.f44430i.getAsInt());
            this.f44430i = OptionalInt.empty();
            this.f44425d.mo21403g();
        } else {
            C59104x c = f44422a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.VolumeAdjust");
            ((C59052c) ((C59052c) c).mo56372aa(45475)).mo56359L("Unable to restore ring volume to its previous state. Build version: %s, DND permission enabled: %s, Slices flag enabled: %s", Integer.valueOf(Build.VERSION.SDK_INT), Boolean.valueOf(this.f44426e.isNotificationPolicyAccessGranted()), Boolean.valueOf(this.f44424c.mo79746e(C90051dc.f248769D)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo21673i() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f44431j.isPresent()) {
            mo21671f();
            if (this.f44429h.getStreamVolume(3) == this.f44432k) {
                this.f44429h.setStreamVolume(3, this.f44431j.getAsInt(), 0);
                this.f44431j.getAsInt();
                this.f44431j = OptionalInt.empty();
                this.f44425d.f42764b.mo46040b(C14088p.f42755a, C60826bg.f164896a);
            }
        }
    }

    /* renamed from: j */
    public final void mo21674j(C14938e eVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo21673i();
        if (this.f44430i.isPresent()) {
            if (this.f44426e.isNotificationPolicyAccessGranted()) {
                m30875n();
            } else if (!mo21676l()) {
                C59104x c = f44422a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.VolumeAdjust");
                ((C59052c) ((C59052c) c).mo56372aa(45472)).mo56359L("Unable to restore ring volume to its previous state. Build version: %s, DND permission enabled: %s, Slices flag enabled: %s", Integer.valueOf(Build.VERSION.SDK_INT), Boolean.valueOf(this.f44426e.isNotificationPolicyAccessGranted()), Boolean.valueOf(this.f44424c.mo79746e(C90051dc.f248769D)));
            } else if (this.f44430i.isPresent()) {
                eVar.mo21859a(C14742l.m31047c(this.f44430i.getAsInt()), SimpleSnackbar.LENGTH_SHORT);
            }
        }
    }

    /* renamed from: k */
    public final void mo21675k(int i) {
        C14696bi biVar = this.f44428g;
        if (biVar == null) {
            C59104x c = f44422a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.VolumeAdjust");
            ((C59052c) ((C59052c) c).mo56372aa(45487)).mo56386p("Slices API wrapper not initialized. Not setting ring volume.");
        } else if (!biVar.mo21668a()) {
            C59104x d = f44422a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.VolumeAdjust");
            ((C59052c) ((C59052c) d).mo56372aa(45486)).mo56386p("Slices API wrapper was unavailable. Not setting ring volume.");
        } else {
            C4110i iVar = new C4110i(biVar.f44403b, biVar.f44404c);
            Intent putExtra = new Intent().putExtra("android.app.slice.extra.RANGE_VALUE", i);
            try {
                iVar.mo8614c().send(biVar.f44403b, 0, putExtra);
            } catch (Exception e) {
                ((C59052c) ((C59052c) C14696bi.f44402a.mo56226d()).mo56372aa(45438)).mo56389s("Intent was canceled: %s", e.getMessage());
            }
        }
    }

    /* renamed from: l */
    public final boolean mo21676l() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44424c.mo79746e(C90051dc.f248769D);
        return this.f44424c.mo79746e(C90051dc.f248769D);
    }

    /* renamed from: m */
    public final boolean mo21677m() {
        mo21671f();
        return this.f44429h.getStreamVolume(2) == 0;
    }
}
