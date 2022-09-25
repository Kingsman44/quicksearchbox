package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14739i;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14318eu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15378f;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15382j;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cc */
/* compiled from: PG */
public final class C14842cc implements MediaSessionManager.OnActiveSessionsChangedListener, C14781a {

    /* renamed from: a */
    public static final C59071e f44681a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cc");

    /* renamed from: j */
    private static final C58495hd f44682j;

    /* renamed from: b */
    public final C14986h f44683b;

    /* renamed from: c */
    public final C14828bp f44684c;

    /* renamed from: d */
    public final C14152v f44685d;

    /* renamed from: e */
    public final C46428ao f44686e;

    /* renamed from: f */
    ComponentName f44687f;

    /* renamed from: g */
    C60872cz f44688g = null;

    /* renamed from: h */
    public final AtomicReference f44689h = new AtomicReference(C14416ik.UNKNOWN);

    /* renamed from: i */
    final ConcurrentHashMap f44690i = new ConcurrentHashMap();

    /* renamed from: k */
    private final Context f44691k;

    /* renamed from: l */
    private final ComponentName f44692l;

    /* renamed from: m */
    private final C14096x f44693m;

    /* renamed from: n */
    private final C15378f f44694n;

    /* renamed from: o */
    private final C15382j f44695o;

    /* renamed from: p */
    private final C86124t f44696p;

    /* renamed from: q */
    private final C15346t f44697q;

    /* renamed from: r */
    private final C60888db f44698r;

    /* renamed from: s */
    private C0320v f44699s;

    /* renamed from: t */
    private MediaSessionManager f44700t = null;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(16L, C14318eu.ACTION_SKIP_TO_PREVIOUS);
        gzVar.mo55429h(4L, C14318eu.ACTION_PLAY);
        gzVar.mo55429h(2L, C14318eu.ACTION_PAUSE);
        gzVar.mo55429h(1L, C14318eu.ACTION_STOP);
        gzVar.mo55429h(32L, C14318eu.ACTION_SKIP_TO_NEXT);
        gzVar.mo55429h(256L, C14318eu.ACTION_SEEK_TO);
        f44682j = gzVar.mo55427f(false);
    }

    public C14842cc(Context context, ComponentName componentName, C14986h hVar, C14096x xVar, C15378f fVar, C14828bp bpVar, C15382j jVar, C86124t tVar, C14152v vVar, C15346t tVar2, C46428ao aoVar, C60888db dbVar) {
        this.f44691k = context;
        this.f44692l = componentName;
        this.f44683b = hVar;
        this.f44693m = xVar;
        this.f44694n = fVar;
        this.f44684c = bpVar;
        this.f44695o = jVar;
        this.f44696p = tVar;
        this.f44685d = vVar;
        this.f44697q = tVar2;
        this.f44686e = aoVar;
        this.f44698r = dbVar;
    }

    /* renamed from: j */
    public static String m31213j(C0320v vVar) {
        return vVar == null ? "null" : vVar.mo1039g();
    }

    /* renamed from: o */
    public static boolean m31214o(PlaybackStateCompat playbackStateCompat, long j) {
        return (j & playbackStateCompat.f998e) != 0;
    }

    /* renamed from: q */
    public static boolean m31215q(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return false;
        }
        MediaDescriptionCompat d = mediaMetadataCompat.mo819d();
        C58976aa aaVar = C58975e.f156826a;
        if (d == null) {
            return false;
        }
        if (!TextUtils.isEmpty(d.f933b) || !TextUtils.isEmpty(d.f934c)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private final void m31216r() {
        synchronized (this) {
            ComponentName componentName = this.f44687f;
            if (componentName != null) {
                C0320v vVar = this.f44699s;
                if (vVar != null) {
                    String g = vVar.mo1039g();
                    String k = mo21769k(this.f44699s);
                    if (!TextUtils.isEmpty(g) && g.equals(componentName.getPackageName())) {
                        if (TextUtils.isEmpty(k) || k.equals(componentName.getClassName())) {
                            mo21770l();
                            return;
                        }
                    }
                }
                C60872cz czVar = this.f44688g;
                if (czVar == null) {
                    this.f44683b.mo21875g(C14739i.m31036i(3));
                } else {
                    czVar.cancel(true);
                    this.f44688g = null;
                }
                this.f44688g = this.f44698r.mo29164d(new C14836bx(this), 10000, TimeUnit.MILLISECONDS);
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final void mo21503c() {
        List<MediaController> list;
        C58976aa aaVar = C58975e.f156826a;
        C60870cx d = this.f44693m.f42764b.mo46042d();
        if (!C13315a.m29571a("android.permission.MEDIA_CONTENT_CONTROL", this.f44691k)) {
            C59104x c = f44681a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MediaDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45611)).mo56386p("Missing permission of MEDIA_CONTENT_CONTROL.");
        } else {
            try {
                this.f44700t = (MediaSessionManager) this.f44691k.getSystemService("media_session");
            } catch (RuntimeException e) {
                C59104x c2 = f44681a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Morris.MediaDataSrc");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(45610)).mo56386p("Failed to initialize MediaSessionManager");
            }
            MediaSessionManager mediaSessionManager = this.f44700t;
            if (mediaSessionManager == null) {
                this.f44689h.set(C14416ik.SESSION_NOT_AVAILABLE);
            } else {
                mediaSessionManager.addOnActiveSessionsChangedListener(this, (ComponentName) null, this.f44686e);
            }
        }
        MediaSessionManager mediaSessionManager2 = this.f44700t;
        if (mediaSessionManager2 == null) {
            list = new ArrayList<>();
        } else {
            list = mediaSessionManager2.getActiveSessions(this.f44692l);
        }
        ArrayList arrayList = new ArrayList();
        for (MediaController mediaController : list) {
            if (mediaController != null && this.f44694n.mo22270b(mediaController.getPackageName())) {
                arrayList.add(mo21768f(mediaController));
            }
        }
        C60870cx a = C47638k.m84750a(arrayList).mo51520a(new C14834bv(this, arrayList), C60826bg.f164896a);
        C60870cx a2 = C47638k.m84751b(a, d).mo51520a(new C14831bs(this, a, d), C60826bg.f164896a);
        C14837by byVar = new C14837by(this);
        C60856cj.m92911t(a2, C47810es.m84974n(byVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        for (C14827bo i : this.f44684c.f44660f.values()) {
            i.mo1010i();
        }
        if (this.f44689h.get() == C14416ik.ACTIVE_SESSION || this.f44689h.get() == C14416ik.NO_ACTIVE_SESSION) {
            MediaSessionManager mediaSessionManager = this.f44700t;
            if (mediaSessionManager != null) {
                mediaSessionManager.removeOnActiveSessionsChangedListener(this);
            }
            this.f44700t = null;
            for (C14840ca caVar : this.f44690i.values()) {
                C59104x b = f44681a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "Morris.MediaDataSrc");
                ((C59052c) ((C59052c) b).mo56372aa(45598)).mo56389s("Unregister mediaController callback: %s", caVar.f44677d.mo1039g());
                caVar.f44677d.mo1041i(caVar);
            }
            this.f44690i.clear();
            mo21772n((C0320v) null);
        }
        this.f44689h.set(C14416ik.UNKNOWN);
        mo21770l();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C60870cx mo21768f(MediaController mediaController) {
        C14832bt btVar = new C14832bt(this, mediaController);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(btVar), new C14833bu(this));
        C14838bz bzVar = new C14838bz();
        C60856cj.m92911t(n, C47810es.m84974n(bzVar), C60826bg.f164896a);
        return n;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r2 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14341fq) com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr.f43389l.createBuilder();
        r4.copyOnWrite();
        r0.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43391a = r0;
        r4.copyOnWrite();
        r3.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43392b = r3;
        r0 = r13.f44697q.mo22212a(r0, r3);
        r4.copyOnWrite();
        r0.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43393c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r14.f43038a != 2) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14340fp) r14.f43039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14340fp.f43386b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        r14 = r14.f43388a;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r14 == 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r14 == 1) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r14 == 2) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r14 == 3) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r14 == 4) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        r14 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r14 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        r14 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r14 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r14 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r14 != 4) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        return com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14783c.m31118b((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.build());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        if (r1 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (r14 == 6) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r14 != 5) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        r10 = r1.mo819d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        if (r10 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b2, code lost:
        r11 = r10.f933b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        if (r11 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        r11 = r11.toString();
        r4.copyOnWrite();
        r11.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43395e = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
        r10 = r10.f934c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        if (r10 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r10 = r10.toString();
        r4.copyOnWrite();
        r10.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43394d = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        r10 = r1.mo821f("android.media.metadata.MEDIA_ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e4, code lost:
        if (com.google.common.base.C58837ba.m90859h(r10) != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        r4.copyOnWrite();
        r10.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43401k = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        r1.mo821f("android.media.metadata.TITLE");
        r1.mo821f("android.media.metadata.ARTIST");
        r1.mo821f("android.media.metadata.DISPLAY_TITLE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        if (r0 == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        r0 = r1.mo817b("android.media.metadata.ALBUM_ART");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0109, code lost:
        if (r0 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010b, code lost:
        r0 = r1.mo817b("android.media.metadata.ART");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0111, code lost:
        if (r0 != null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0113, code lost:
        r0 = r1.mo817b("android.media.metadata.DISPLAY_ICON");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0119, code lost:
        if (r0 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011b, code lost:
        r0 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.m31985c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        if (r0 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0121, code lost:
        r4.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43400j = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012a, code lost:
        r0 = r1.mo821f("android.media.metadata.ALBUM_ART_URI");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0130, code lost:
        if (r0 != null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0132, code lost:
        r0 = r1.mo821f("android.media.metadata.ART_URI");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (r0 != null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013a, code lost:
        r0 = r1.mo821f("android.media.metadata.DISPLAY_ICON_URI");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r0 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0142, code lost:
        r4.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43396f = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014b, code lost:
        r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14315er) com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew.f43317e.createBuilder();
        r10 = r2.f994a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0155, code lost:
        if (r10 == 1) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0157, code lost:
        if (r10 == 2) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0159, code lost:
        if (r10 == 3) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015b, code lost:
        if (r10 == 6) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015d, code lost:
        r0.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r0.instance).f43319a = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016b, code lost:
        r0.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r0.instance).f43319a = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017a, code lost:
        r0.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r0.instance).f43319a = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
        r0.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r0.instance).f43319a = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0196, code lost:
        r0.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r0.instance).f43319a = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a3, code lost:
        r3 = r2.f1002i.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ad, code lost:
        if (r3.hasNext() == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01af, code lost:
        r5 = (android.support.p031v4.media.session.PlaybackStateCompat.CustomAction) r3.next();
        r6 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14316es) com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et.f43301d.createBuilder();
        r7 = r5.f1006a;
        r6.copyOnWrite();
        r7.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et) r6.instance).f43303a = r7;
        r7 = r5.f1007b.toString();
        r6.copyOnWrite();
        r7.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et) r6.instance).f43304b = r7;
        r5 = r5.f1008c;
        r6.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et) r6.instance).f43305c = r5;
        r0.copyOnWrite();
        r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r0.instance;
        r6 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et) r6.build();
        r6.getClass();
        r7 = r5.f43321d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fe, code lost:
        if (r7.mo58948c() != false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0200, code lost:
        r5.f43321d = com.google.protobuf.C62942bv.mutableCopy(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0206, code lost:
        r5.f43321d.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020c, code lost:
        p3186j$.util.Map.EL.forEach(f44682j, new com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14835bw(r2, r0));
        r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r0.build();
        r4.copyOnWrite();
        r0.getClass();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43397g = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0228, code lost:
        if (r14 != 3) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0234, code lost:
        return com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14783c.m31118b((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.build());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0235, code lost:
        if (r1 == null) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0237, code lost:
        r0 = r1.mo816a("android.media.metadata.DURATION");
        r4.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43398h = r0;
        r0 = r2.f995b;
        r4.copyOnWrite();
        ((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.instance).f43399i = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025b, code lost:
        return com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14783c.m31118b((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r4.build());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025c, code lost:
        r14 = f44681a.mo56226d();
        r14.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "Morris.MediaDataSrc");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(45590)).mo56386p("Attributes from MediaController becomes invalid, thus not displaying the MediaTask");
        mo21772n((android.support.p031v4.media.session.C0320v) null);
        r13.f44683b.mo21875g(com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14739i.m31029b((com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik) r13.f44689h.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0288, code lost:
        return com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be.f43041c;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be mo21727h(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc r14) {
        /*
            r13 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r14.f43038a
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.MEDIA_UI_DATA_REQUEST
            int r0 = r14.f43038a
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.m30579a(r0)
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.MEDIA_UI_DATA_REQUEST
            if (r0 != r1) goto L_0x028c
            monitor-enter(r13)
            android.support.v4.media.session.v r0 = r13.f44699s     // Catch:{ all -> 0x0289 }
            if (r0 != 0) goto L_0x0019
            com.google.android.libraries.assistant.auto.tng.morris.e.be r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be.f43041c     // Catch:{ all -> 0x0289 }
            monitor-exit(r13)     // Catch:{ all -> 0x0289 }
            return r14
        L_0x0019:
            java.lang.String r0 = r0.mo1039g()     // Catch:{ all -> 0x0289 }
            android.support.v4.media.session.v r1 = r13.f44699s     // Catch:{ all -> 0x0289 }
            android.support.v4.media.MediaMetadataCompat r1 = r1.mo1036d()     // Catch:{ all -> 0x0289 }
            android.support.v4.media.session.v r2 = r13.f44699s     // Catch:{ all -> 0x0289 }
            android.support.v4.media.session.PlaybackStateCompat r2 = r2.mo1038f()     // Catch:{ all -> 0x0289 }
            android.support.v4.media.session.v r3 = r13.f44699s     // Catch:{ all -> 0x0289 }
            java.lang.String r3 = r13.mo21769k(r3)     // Catch:{ all -> 0x0289 }
            monitor-exit(r13)     // Catch:{ all -> 0x0289 }
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x025c
            if (r2 != 0) goto L_0x003a
            goto L_0x025c
        L_0x003a:
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr.f43389l
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.fq r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14341fq) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r5
            r0.getClass()
            r5.f43391a = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r5
            r3.getClass()
            r5.f43392b = r3
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r5 = r13.f44697q
            com.google.android.libraries.assistant.auto.tng.morris.e.b r0 = r5.mo22212a(r0, r3)
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r3
            r0.getClass()
            r3.f43393c = r0
            int r0 = r14.f43038a
            r3 = 2
            if (r0 != r3) goto L_0x0076
            java.lang.Object r14 = r14.f43039b
            com.google.android.libraries.assistant.auto.tng.morris.e.fp r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14340fp) r14
            goto L_0x0078
        L_0x0076:
            com.google.android.libraries.assistant.auto.tng.morris.e.fp r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14340fp.f43386b
        L_0x0078:
            int r14 = r14.f43388a
            r0 = 0
            r5 = 5
            r6 = 6
            r7 = 4
            r8 = 3
            r9 = 1
            if (r14 == 0) goto L_0x0094
            if (r14 == r9) goto L_0x0092
            if (r14 == r3) goto L_0x0090
            if (r14 == r8) goto L_0x008e
            if (r14 == r7) goto L_0x008c
            r14 = 0
            goto L_0x0095
        L_0x008c:
            r14 = 6
            goto L_0x0095
        L_0x008e:
            r14 = 5
            goto L_0x0095
        L_0x0090:
            r14 = 4
            goto L_0x0095
        L_0x0092:
            r14 = 3
            goto L_0x0095
        L_0x0094:
            r14 = 2
        L_0x0095:
            if (r14 != 0) goto L_0x0098
            r14 = 1
        L_0x0098:
            if (r14 != r7) goto L_0x00a5
            com.google.protobuf.bv r14 = r4.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r14
            com.google.android.libraries.assistant.auto.tng.morris.e.be r14 = com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14783c.m31118b(r14)
            return r14
        L_0x00a5:
            if (r1 == 0) goto L_0x014b
            if (r14 == r6) goto L_0x00ab
            if (r14 != r5) goto L_0x00ac
        L_0x00ab:
            r0 = 1
        L_0x00ac:
            android.support.v4.media.MediaDescriptionCompat r10 = r1.mo819d()
            if (r10 == 0) goto L_0x00da
            java.lang.CharSequence r11 = r10.f933b
            if (r11 == 0) goto L_0x00c6
            java.lang.String r11 = r11.toString()
            r4.copyOnWrite()
            com.google.protobuf.bv r12 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r12
            r11.getClass()
            r12.f43395e = r11
        L_0x00c6:
            java.lang.CharSequence r10 = r10.f934c
            if (r10 == 0) goto L_0x00da
            java.lang.String r10 = r10.toString()
            r4.copyOnWrite()
            com.google.protobuf.bv r11 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r11
            r10.getClass()
            r11.f43394d = r10
        L_0x00da:
            java.lang.String r10 = "android.media.metadata.MEDIA_ID"
            java.lang.String r10 = r1.mo821f(r10)
            boolean r11 = com.google.common.base.C58837ba.m90859h(r10)
            if (r11 != 0) goto L_0x00f2
            r4.copyOnWrite()
            com.google.protobuf.bv r11 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r11
            r10.getClass()
            r11.f43401k = r10
        L_0x00f2:
            java.lang.String r10 = "android.media.metadata.TITLE"
            r1.mo821f(r10)
            java.lang.String r10 = "android.media.metadata.ARTIST"
            r1.mo821f(r10)
            java.lang.String r10 = "android.media.metadata.DISPLAY_TITLE"
            r1.mo821f(r10)
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "android.media.metadata.ALBUM_ART"
            android.graphics.Bitmap r0 = r1.mo817b(r0)
            if (r0 != 0) goto L_0x0111
            java.lang.String r0 = "android.media.metadata.ART"
            android.graphics.Bitmap r0 = r1.mo817b(r0)
        L_0x0111:
            if (r0 != 0) goto L_0x0119
            java.lang.String r0 = "android.media.metadata.DISPLAY_ICON"
            android.graphics.Bitmap r0 = r1.mo817b(r0)
        L_0x0119:
            if (r0 == 0) goto L_0x012a
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r0 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.m31985c(r0)
            if (r0 == 0) goto L_0x012a
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r10
            r10.f43400j = r0
        L_0x012a:
            java.lang.String r0 = "android.media.metadata.ALBUM_ART_URI"
            java.lang.String r0 = r1.mo821f(r0)
            if (r0 != 0) goto L_0x0138
            java.lang.String r0 = "android.media.metadata.ART_URI"
            java.lang.String r0 = r1.mo821f(r0)
        L_0x0138:
            if (r0 != 0) goto L_0x0140
            java.lang.String r0 = "android.media.metadata.DISPLAY_ICON_URI"
            java.lang.String r0 = r1.mo821f(r0)
        L_0x0140:
            if (r0 == 0) goto L_0x014b
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r10
            r10.f43396f = r0
        L_0x014b:
            com.google.android.libraries.assistant.auto.tng.morris.e.ew r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew.f43317e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.er r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14315er) r0
            int r10 = r2.f994a
            if (r10 == r9) goto L_0x0196
            if (r10 == r3) goto L_0x0188
            if (r10 == r8) goto L_0x017a
            if (r10 == r6) goto L_0x016b
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ew r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r3
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(r8)
            r3.f43319a = r5
            goto L_0x01a3
        L_0x016b:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ew r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r3
            r5 = 7
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(r5)
            r3.f43319a = r5
            goto L_0x01a3
        L_0x017a:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ew r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r3
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(r5)
            r3.f43319a = r5
            goto L_0x01a3
        L_0x0188:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ew r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r3
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(r7)
            r3.f43319a = r5
            goto L_0x01a3
        L_0x0196:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ew r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r3
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30605a(r6)
            r3.f43319a = r5
        L_0x01a3:
            java.util.List r3 = r2.f1002i
            java.util.Iterator r3 = r3.iterator()
        L_0x01a9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x020c
            java.lang.Object r5 = r3.next()
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r5 = (android.support.p031v4.media.session.PlaybackStateCompat.CustomAction) r5
            com.google.android.libraries.assistant.auto.tng.morris.e.et r6 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et.f43301d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.es r6 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14316es) r6
            java.lang.String r7 = r5.f1006a
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.et r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et) r9
            r7.getClass()
            r9.f43303a = r7
            java.lang.CharSequence r7 = r5.f1007b
            java.lang.String r7 = r7.toString()
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.et r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et) r9
            r7.getClass()
            r9.f43304b = r7
            int r5 = r5.f1008c
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.et r7 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et) r7
            r7.f43305c = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ew r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r5
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.et r6 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14317et) r6
            r6.getClass()
            com.google.protobuf.cq r7 = r5.f43321d
            boolean r9 = r7.mo58948c()
            if (r9 != 0) goto L_0x0206
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r5.f43321d = r7
        L_0x0206:
            com.google.protobuf.cq r5 = r5.f43321d
            r5.add(r6)
            goto L_0x01a9
        L_0x020c:
            com.google.common.b.hd r3 = f44682j
            com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bw r5 = new com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bw
            r5.<init>(r2, r0)
            p3186j$.util.Map.EL.forEach(r3, r5)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.ew r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14320ew) r0
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r3
            r0.getClass()
            r3.f43397g = r0
            if (r14 != r8) goto L_0x0235
            com.google.protobuf.bv r14 = r4.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r14
            com.google.android.libraries.assistant.auto.tng.morris.e.be r14 = com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14783c.m31118b(r14)
            return r14
        L_0x0235:
            if (r1 == 0) goto L_0x0251
            java.lang.String r14 = "android.media.metadata.DURATION"
            long r0 = r1.mo816a(r14)
            r4.copyOnWrite()
            com.google.protobuf.bv r14 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r14
            r14.f43398h = r0
            long r0 = r2.f995b
            r4.copyOnWrite()
            com.google.protobuf.bv r14 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r14
            r14.f43399i = r0
        L_0x0251:
            com.google.protobuf.bv r14 = r4.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r14
            com.google.android.libraries.assistant.auto.tng.morris.e.be r14 = com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14783c.m31118b(r14)
            return r14
        L_0x025c:
            com.google.common.f.e r14 = f44681a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "Morris.MediaDataSrc"
            r14.mo56378ag(r0, r1)
            java.lang.String r0 = "Attributes from MediaController becomes invalid, thus not displaying the MediaTask"
            r1 = 45590(0xb216, float:6.3885E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r1)).mo56386p(r0)
            r14 = 0
            r13.mo21772n(r14)
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r14 = r13.f44683b
            java.util.concurrent.atomic.AtomicReference r0 = r13.f44689h
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.assistant.auto.tng.morris.e.ik r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik) r0
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14739i.m31029b(r0)
            r14.mo21875g(r0)
            com.google.android.libraries.assistant.auto.tng.morris.e.be r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be.f43041c
            return r14
        L_0x0289:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0289 }
            throw r14
        L_0x028c:
            com.google.android.libraries.assistant.auto.tng.morris.e.be r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be.f43041c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14842cc.mo21727h(com.google.android.libraries.assistant.auto.tng.morris.e.bc):com.google.android.libraries.assistant.auto.tng.morris.e.be");
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.MEDIA_UI_DATA_REQUEST) {
            return C60856cj.m92900i(C14782b.SUCCESS);
        }
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.MEDIA_UPDATE_REQUEST) {
            return C60856cj.m92900i(C14782b.ERROR);
        }
        return C60856cj.m92900i(C14782b.FAILED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo21769k(C0320v vVar) {
        Bundle d = vVar.f1044a.mo861d();
        if (d != null && !TextUtils.isEmpty(d.getString("android.media.session.BROWSE_SERVICE", BuildConfig.FLAVOR))) {
            return d.getString("android.media.session.BROWSE_SERVICE", BuildConfig.FLAVOR);
        }
        if (this.f44696p.mo79746e(C90051dc.f248822ad)) {
            return this.f44695o.mo22272h(vVar.mo1039g());
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: l */
    public final void mo21770l() {
        synchronized (this) {
            C60872cz czVar = this.f44688g;
            if (czVar != null) {
                czVar.cancel(true);
                this.f44688g = null;
                this.f44687f = null;
                this.f44683b.mo21875g(C14739i.m31036i(4));
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }

    /* renamed from: m */
    public final void mo21771m(C0320v vVar, boolean z) {
        if (this.f44694n.mo22270b(vVar.mo1039g())) {
            C14841cb cbVar = new C14841cb(vVar);
            if (!this.f44690i.containsKey(cbVar)) {
                C58976aa aaVar = C58975e.f156826a;
                C14840ca caVar = new C14840ca(this, vVar);
                vVar.mo1040h(caVar, (Handler) null);
                if (z) {
                    caVar.mo1006e(vVar.mo1038f());
                }
                this.f44690i.put(cbVar, caVar);
            }
        }
    }

    /* renamed from: n */
    public final void mo21772n(C0320v vVar) {
        synchronized (this) {
            C58976aa aaVar = C58975e.f156826a;
            m31213j(this.f44699s);
            m31213j(vVar);
            this.f44699s = vVar;
            this.f44689h.set(vVar == null ? C14416ik.NO_ACTIVE_SESSION : C14416ik.ACTIVE_SESSION);
            m31216r();
        }
    }

    public final void onActiveSessionsChanged(List list) {
        if (list == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaController mediaController = (MediaController) it.next();
            if (mediaController != null) {
                C60870cx f = mo21768f(mediaController);
                C14830br brVar = new C14830br(this);
                C46459k.m82829b(C60922j.m93044g(f, C47810es.m84963c(brVar), C60826bg.f164896a), "Failed to register callback to mediaController.", new Object[0]);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo21774p(C0320v vVar) {
        synchronized (this) {
            C58976aa aaVar = C58975e.f156826a;
            m31213j(this.f44699s);
            m31213j(vVar);
            C0320v vVar2 = this.f44699s;
            if (vVar2 == null) {
                return false;
            }
            C14841cb cbVar = new C14841cb(vVar2);
            return cbVar.equals(new C14841cb(vVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0127, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21729t(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc r5, com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f r6, com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm r7) {
        /*
            r4 = this;
            int r6 = r5.f43038a
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r6 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.m30579a(r6)
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.MEDIA_UPDATE_REQUEST
            r0 = 1
            r1 = 10
            if (r6 != r7) goto L_0x012b
            monitor-enter(r4)
            android.support.v4.media.session.v r6 = r4.f44699s     // Catch:{ all -> 0x0128 }
            if (r6 != 0) goto L_0x0031
            com.google.common.f.e r5 = f44681a     // Catch:{ all -> 0x0128 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0128 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            java.lang.String r7 = "Morris.MediaDataSrc"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0128 }
            r6 = 45603(0xb223, float:6.3903E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0128 }
            java.lang.String r6 = "MediaController is null. Cannot fulfill fire-and-forget request."
            r5.mo56386p(r6)     // Catch:{ all -> 0x0128 }
            monitor-exit(r4)     // Catch:{ all -> 0x0128 }
            return
        L_0x0031:
            int r6 = r5.f43038a     // Catch:{ all -> 0x0128 }
            r7 = 3
            if (r6 != r7) goto L_0x003b
            java.lang.Object r5 = r5.f43039b     // Catch:{ all -> 0x0128 }
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft) r5     // Catch:{ all -> 0x0128 }
            goto L_0x003d
        L_0x003b:
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft.f43402d     // Catch:{ all -> 0x0128 }
        L_0x003d:
            int r6 = r5.f43404a     // Catch:{ all -> 0x0128 }
            switch(r6) {
                case 0: goto L_0x005d;
                case 1: goto L_0x005b;
                case 2: goto L_0x0059;
                case 3: goto L_0x0057;
                case 4: goto L_0x0055;
                case 5: goto L_0x0053;
                case 6: goto L_0x0050;
                case 7: goto L_0x0042;
                case 8: goto L_0x005e;
                case 9: goto L_0x004d;
                case 10: goto L_0x004a;
                case 11: goto L_0x0047;
                case 12: goto L_0x0044;
                default: goto L_0x0042;
            }     // Catch:{ all -> 0x0128 }
        L_0x0042:
            r1 = 0
            goto L_0x005e
        L_0x0044:
            r1 = 14
            goto L_0x005e
        L_0x0047:
            r1 = 13
            goto L_0x005e
        L_0x004a:
            r1 = 12
            goto L_0x005e
        L_0x004d:
            r1 = 11
            goto L_0x005e
        L_0x0050:
            r1 = 8
            goto L_0x005e
        L_0x0053:
            r1 = 7
            goto L_0x005e
        L_0x0055:
            r1 = 6
            goto L_0x005e
        L_0x0057:
            r1 = 5
            goto L_0x005e
        L_0x0059:
            r1 = 4
            goto L_0x005e
        L_0x005b:
            r1 = 3
            goto L_0x005e
        L_0x005d:
            r1 = 2
        L_0x005e:
            if (r1 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r0 = r1
        L_0x0062:
            int r0 = r0 + -2
            switch(r0) {
                case 1: goto L_0x011a;
                case 2: goto L_0x010d;
                case 3: goto L_0x0100;
                case 4: goto L_0x00f3;
                case 5: goto L_0x00e6;
                case 6: goto L_0x00d7;
                case 7: goto L_0x0067;
                case 8: goto L_0x0067;
                case 9: goto L_0x0067;
                case 10: goto L_0x00b3;
                case 11: goto L_0x007e;
                case 12: goto L_0x0069;
                default: goto L_0x0067;
            }     // Catch:{ all -> 0x0128 }
        L_0x0067:
            goto L_0x0126
        L_0x0069:
            android.support.v4.media.session.v r6 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r6.getClass()
            android.support.v4.media.session.q r6 = r6.mo1037e()     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = r5.f43406c     // Catch:{ all -> 0x0128 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x0128 }
            r7.<init>()     // Catch:{ all -> 0x0128 }
            r6.mo1025j(r5, r7)     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x007e:
            android.support.v4.media.session.v r5 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r5.getClass()
            android.support.v4.media.MediaMetadataCompat r5 = r5.mo1036d()     // Catch:{ all -> 0x0128 }
            r5.getClass()
            java.lang.String r6 = "android.media.metadata.DURATION"
            long r5 = r5.mo816a(r6)     // Catch:{ all -> 0x0128 }
            android.support.v4.media.session.v r7 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r7.getClass()
            android.support.v4.media.session.PlaybackStateCompat r7 = r7.mo1038f()     // Catch:{ all -> 0x0128 }
            r7.getClass()
            long r0 = r7.f995b     // Catch:{ all -> 0x0128 }
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r0 + r2
            android.support.v4.media.session.v r7 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r7.getClass()
            android.support.v4.media.session.q r7 = r7.mo1037e()     // Catch:{ all -> 0x0128 }
            long r5 = java.lang.Math.min(r0, r5)     // Catch:{ all -> 0x0128 }
            r7.mo1024i(r5)     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x00b3:
            android.support.v4.media.session.v r5 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r5.getClass()
            android.support.v4.media.session.PlaybackStateCompat r5 = r5.mo1038f()     // Catch:{ all -> 0x0128 }
            r5.getClass()
            long r5 = r5.f995b     // Catch:{ all -> 0x0128 }
            r0 = -10000(0xffffffffffffd8f0, double:NaN)
            long r5 = r5 + r0
            android.support.v4.media.session.v r7 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r7.getClass()
            android.support.v4.media.session.q r7 = r7.mo1037e()     // Catch:{ all -> 0x0128 }
            r0 = 0
            long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x0128 }
            r7.mo1024i(r5)     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x00d7:
            android.support.v4.media.session.v r6 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r6.getClass()
            android.support.v4.media.session.q r6 = r6.mo1037e()     // Catch:{ all -> 0x0128 }
            long r0 = r5.f43405b     // Catch:{ all -> 0x0128 }
            r6.mo1024i(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x00e6:
            android.support.v4.media.session.v r5 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r5.getClass()
            android.support.v4.media.session.q r5 = r5.mo1037e()     // Catch:{ all -> 0x0128 }
            r5.mo1029n()     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x00f3:
            android.support.v4.media.session.v r5 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r5.getClass()
            android.support.v4.media.session.q r5 = r5.mo1037e()     // Catch:{ all -> 0x0128 }
            r5.mo1030o()     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x0100:
            android.support.v4.media.session.v r5 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r5.getClass()
            android.support.v4.media.session.q r5 = r5.mo1037e()     // Catch:{ all -> 0x0128 }
            r5.mo1031p()     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x010d:
            android.support.v4.media.session.v r5 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r5.getClass()
            android.support.v4.media.session.q r5 = r5.mo1037e()     // Catch:{ all -> 0x0128 }
            r5.mo1017b()     // Catch:{ all -> 0x0128 }
            goto L_0x0126
        L_0x011a:
            android.support.v4.media.session.v r5 = r4.f44699s     // Catch:{ all -> 0x0128 }
            r5.getClass()
            android.support.v4.media.session.q r5 = r5.mo1037e()     // Catch:{ all -> 0x0128 }
            r5.mo1018c()     // Catch:{ all -> 0x0128 }
        L_0x0126:
            monitor-exit(r4)     // Catch:{ all -> 0x0128 }
            return
        L_0x0128:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0128 }
            throw r5
        L_0x012b:
            int r6 = r5.f43038a
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.m30579a(r6)
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.UPDATE_MEDIA_TASK_COLLAPSED_STATUS_REQUEST
            if (r7 != r2) goto L_0x0159
            if (r6 != r1) goto L_0x013c
            java.lang.Object r5 = r5.f43039b
            com.google.android.libraries.assistant.auto.tng.morris.e.qc r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14624qc) r5
            goto L_0x013e
        L_0x013c:
            com.google.android.libraries.assistant.auto.tng.morris.e.qc r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14624qc.f44197b
        L_0x013e:
            int r5 = r5.f44199a
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14076d.m30361b(r5)
            if (r5 != 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r0 = r5
        L_0x0148:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.assistant.auto.tng.morris.b.x r5 = r4.f44693m
            com.google.android.libraries.storage.protostore.ab r5 = r5.f42764b
            com.google.android.libraries.assistant.auto.tng.morris.b.h r6 = new com.google.android.libraries.assistant.auto.tng.morris.b.h
            r6.<init>(r0)
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a
            r5.mo46040b(r6, r7)
            return
        L_0x0159:
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r6 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.m30579a(r6)
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.MEDIA_PLAY_WAITING_REQUEST
            if (r6 != r7) goto L_0x018d
            monitor-enter(r4)
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ all -> 0x018a }
            int r7 = r5.f43038a     // Catch:{ all -> 0x018a }
            r0 = 18
            if (r7 != r0) goto L_0x016f
            java.lang.Object r7 = r5.f43039b     // Catch:{ all -> 0x018a }
            com.google.android.libraries.assistant.auto.tng.morris.e.fc r7 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14327fc) r7     // Catch:{ all -> 0x018a }
            goto L_0x0171
        L_0x016f:
            com.google.android.libraries.assistant.auto.tng.morris.e.fc r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14327fc.f43341c     // Catch:{ all -> 0x018a }
        L_0x0171:
            java.lang.String r7 = r7.f43343a     // Catch:{ all -> 0x018a }
            int r1 = r5.f43038a     // Catch:{ all -> 0x018a }
            if (r1 != r0) goto L_0x017c
            java.lang.Object r5 = r5.f43039b     // Catch:{ all -> 0x018a }
            com.google.android.libraries.assistant.auto.tng.morris.e.fc r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14327fc) r5     // Catch:{ all -> 0x018a }
            goto L_0x017e
        L_0x017c:
            com.google.android.libraries.assistant.auto.tng.morris.e.fc r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14327fc.f43341c     // Catch:{ all -> 0x018a }
        L_0x017e:
            java.lang.String r5 = r5.f43344b     // Catch:{ all -> 0x018a }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x018a }
            r4.f44687f = r6     // Catch:{ all -> 0x018a }
            monitor-exit(r4)     // Catch:{ all -> 0x018a }
            r4.m31216r()
            return
        L_0x018a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x018a }
            throw r5
        L_0x018d:
            com.google.common.f.e r5 = f44681a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "Morris.MediaDataSrc"
            r5.mo56378ag(r6, r7)
            java.lang.String r6 = "MediaDataSource.sendFireAndForgetRequest does not support this request"
            r7 = 45601(0xb221, float:6.39E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14842cc.mo21729t(com.google.android.libraries.assistant.auto.tng.morris.e.bc, com.google.android.libraries.assistant.auto.tng.morris.e.f, com.google.android.libraries.assistant.auto.tng.morris.e.lm):void");
    }
}
