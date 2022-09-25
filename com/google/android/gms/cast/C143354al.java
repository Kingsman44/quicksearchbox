package com.google.android.gms.cast;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.C143563ab;
import com.google.android.gms.cast.internal.C143565ad;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.internal.C143879a;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.cast.al */
/* compiled from: PG */
public final class C143354al extends C143847s implements C143603l {

    /* renamed from: F */
    private static final C143707a f388776F;

    /* renamed from: G */
    private static final C143841m f388777G;

    /* renamed from: a */
    public static final C143566ae f388778a = new C143566ae("CastClient");

    /* renamed from: H */
    private Handler f388779H;

    /* renamed from: b */
    public final C143353ak f388780b = new C143353ak(this);

    /* renamed from: c */
    public boolean f388781c;

    /* renamed from: d */
    public boolean f388782d;

    /* renamed from: e */
    C146010af f388783e;

    /* renamed from: f */
    C146010af f388784f;

    /* renamed from: g */
    public final AtomicLong f388785g;

    /* renamed from: h */
    public final Object f388786h = new Object();

    /* renamed from: i */
    public final Object f388787i = new Object();

    /* renamed from: j */
    public ApplicationMetadata f388788j;

    /* renamed from: k */
    public String f388789k;

    /* renamed from: l */
    public double f388790l;

    /* renamed from: m */
    public boolean f388791m;

    /* renamed from: n */
    public int f388792n;

    /* renamed from: o */
    public int f388793o;

    /* renamed from: p */
    public EqualizerSettings f388794p;

    /* renamed from: q */
    public final CastDevice f388795q;

    /* renamed from: r */
    final Map f388796r;

    /* renamed from: s */
    final Map f388797s;

    /* renamed from: t */
    public final C143557h f388798t;

    /* renamed from: u */
    public final List f388799u = Collections.synchronizedList(new ArrayList());

    /* renamed from: v */
    public int f388800v;

    static {
        C143345ac acVar = new C143345ac();
        f388776F = acVar;
        f388777G = new C143841m("Cast.API_CXLESS", acVar, C143565ad.f389264b);
    }

    public C143354al(Context context, C143556g gVar) {
        super(context, (Activity) null, f388777G, gVar, C143846r.f389923a);
        C143919bh.m233971n(context, "context cannot be null");
        this.f388798t = gVar.f389246b;
        this.f388795q = gVar.f389245a;
        this.f388796r = new HashMap();
        this.f388797s = new HashMap();
        this.f388785g = new AtomicLong(0);
        this.f388800v = 1;
        mo118498r();
    }

    /* renamed from: j */
    public static C143842n m232604j(int i) {
        return C143879a.m233899a(new Status(1, i, (String) null, (PendingIntent) null, (ConnectionResult) null));
    }

    /* renamed from: a */
    public final C146006ab mo118482a(String str, String str2) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C143617z(this, str, str2);
        dcVar.f389863d = 8407;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo118483b(String str, LaunchOptions launchOptions) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C143612u(this, str, launchOptions);
        dcVar.f389863d = 8406;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo118484c(String str, String str2) {
        C143596v.m233277j(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() <= 524288) {
            C143809dc dcVar = new C143809dc();
            dcVar.f389860a = new C143613v(this, str, str2);
            dcVar.f389863d = 8405;
            return super.mo119290u(1, dcVar.mo119260a());
        } else {
            f388778a.mo118889g("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
    }

    /* renamed from: d */
    public final boolean mo118485d() {
        return this.f388800v == 2;
    }

    /* renamed from: e */
    public final void mo118486e() {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = C143616y.f389389a;
        dcVar.f389863d = 8403;
        super.mo119290u(1, dcVar.mo119260a());
        mo118492l();
        mo118499s(this.f388780b);
    }

    /* renamed from: f */
    public final void mo118487f(String str) {
        C143558i iVar;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f388797s) {
                iVar = (C143558i) this.f388797s.remove(str);
            }
            C143809dc dcVar = new C143809dc();
            dcVar.f389860a = new C143343aa(this, iVar, str);
            dcVar.f389863d = 8414;
            super.mo119290u(1, dcVar.mo119260a());
            return;
        }
        throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }

    /* renamed from: g */
    public final void mo118488g(String str, C143558i iVar) {
        C143596v.m233277j(str);
        synchronized (this.f388797s) {
            this.f388797s.put(str, iVar);
        }
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C143344ab(this, str);
        dcVar.f389863d = 8413;
        super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: h */
    public final void mo118489h(String str) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C143614w(this, str);
        dcVar.f389863d = 8409;
        super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: i */
    public final Handler mo118490i() {
        if (this.f388779H == null) {
            this.f388779H = new C144861c(this.f389927B);
        }
        return this.f388779H;
    }

    /* renamed from: k */
    public final void mo118491k() {
        C143919bh.m233967j(mo118485d(), "Not connected to device");
    }

    /* renamed from: l */
    public final void mo118492l() {
        f388778a.mo118884b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f388797s) {
            this.f388797s.clear();
        }
    }

    /* renamed from: m */
    public final void mo118493m(C146010af afVar) {
        synchronized (this.f388786h) {
            if (this.f388783e != null) {
                mo118494n(2477);
            }
            this.f388783e = afVar;
        }
    }

    /* renamed from: n */
    public final void mo118494n(int i) {
        synchronized (this.f388786h) {
            C146010af afVar = this.f388783e;
            if (afVar != null) {
                afVar.f394698a.mo122507u(m232604j(i));
            }
            this.f388783e = null;
        }
    }

    /* renamed from: o */
    public final void mo118495o(long j, int i) {
        C146010af afVar;
        synchronized (this.f388796r) {
            Map map = this.f388796r;
            Long valueOf = Long.valueOf(j);
            afVar = (C146010af) map.get(valueOf);
            this.f388796r.remove(valueOf);
        }
        if (afVar == null) {
            return;
        }
        if (i == 0) {
            afVar.f394698a.mo122508v((Object) null);
            return;
        }
        afVar.f394698a.mo122507u(m232604j(i));
    }

    /* renamed from: p */
    public final void mo118496p(int i) {
        synchronized (this.f388787i) {
            C146010af afVar = this.f388784f;
            if (afVar != null) {
                if (i == 0) {
                    afVar.f394698a.mo122508v(new Status(1, 0, (String) null, (PendingIntent) null, (ConnectionResult) null));
                } else {
                    afVar.f394698a.mo122507u(m232604j(i));
                }
                this.f388784f = null;
            }
        }
    }

    /* renamed from: q */
    public final void mo118497q() {
        boolean z = true;
        if (this.f388800v == 1) {
            z = false;
        }
        C143919bh.m233967j(z, "Not active connection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo118498r() {
        if (!this.f388795q.mo118384d(2048) && this.f388795q.mo118384d(4) && !this.f388795q.mo118384d(1)) {
            "Chromecast Audio".equals(this.f388795q.f388603e);
        }
    }

    /* renamed from: s */
    public final void mo118499s(C143563ab abVar) {
        C143782cc ccVar = C143785cf.m233680b(abVar, this.f389927B, "castDeviceControllerListenerKey").f389806b;
        C143919bh.m233971n(ccVar, "Key must not be null");
        mo119292w(ccVar, 8415);
    }
}
