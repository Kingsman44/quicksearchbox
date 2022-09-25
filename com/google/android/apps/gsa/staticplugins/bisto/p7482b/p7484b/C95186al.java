package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.al */
/* compiled from: PG */
public final class C95186al {

    /* renamed from: a */
    public static final C59071e f266307a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.b.b.al");

    /* renamed from: b */
    public static final Duration f266308b = Duration.ofSeconds(2);

    /* renamed from: c */
    public static final Duration f266309c = Duration.ofSeconds(30);

    /* renamed from: h */
    private static final Duration f266310h = Duration.ofMillis(50);

    /* renamed from: i */
    private static final Duration f266311i = Duration.ofSeconds(30);

    /* renamed from: d */
    public final Object f266312d = new Object();

    /* renamed from: e */
    public final Context f266313e;

    /* renamed from: f */
    public MediaPlayer f266314f;

    /* renamed from: g */
    public C95294af f266315g;

    /* renamed from: j */
    private final C22871g f266316j;

    /* renamed from: k */
    private final C22871g f266317k;

    /* renamed from: l */
    private final C21370a f266318l;

    /* renamed from: m */
    private final C95295ag f266319m;

    /* renamed from: n */
    private final AtomicReference f266320n = new AtomicReference((Object) null);

    /* renamed from: o */
    private C95174a f266321o;

    /* renamed from: p */
    private int f266322p;

    public C95186al(Context context, C22871g gVar, C22871g gVar2, C21370a aVar, C95295ag agVar) {
        this.f266313e = context;
        this.f266316j = gVar;
        this.f266317k = gVar2;
        this.f266318l = aVar;
        this.f266319m = agVar;
    }

    /* renamed from: g */
    private final void m157335g(Uri uri) {
        C95294af a = this.f266319m.mo89222a();
        C58976aa aaVar = C58975e.f156826a;
        C59104x b = f266307a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UriPlayer");
        ((C59052c) ((C59052c) b).mo56372aa(14659)).mo56386p("Attempting to play straight audio from Uri");
        this.f266316j.mo28212l("play-uri-as-audio", new C95179ae(this, uri, a));
    }

    /* renamed from: h */
    private final void m157336h(C95174a aVar) {
        synchronized (this.f266312d) {
            if (aVar == null) {
                aVar = new C95185ak();
            }
            this.f266321o = aVar;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:44|45|184|(5:51|52|18c|59|60)(2:66|67)) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b0, code lost:
        if (r1 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0184, code lost:
        monitor-enter(r8.f266312d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r0 = r8.f266322p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0188, code lost:
        if (r0 == 1) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018c, code lost:
        monitor-enter(r8.f266312d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r0 = r8.f266321o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018f, code lost:
        if (r0 != null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0191, code lost:
        mo89093d(4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r7.release();
        r0 = f266307a.mo56226d();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "UriPlayer");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(14669)).mo56386p("Failed to get a file descriptor for the URI.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r7.release();
        r0 = f266307a.mo56226d();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "UriPlayer");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(14671)).mo56386p("Failed to get a file descriptor for the URI.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0182 */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ef A[Catch:{ all -> 0x0180, SecurityException -> 0x00c0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo89090a(android.net.Uri r22, com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95174a r23) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.f.e r1 = f266307a
            com.google.common.f.x r2 = r1.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "UriPlayer"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Trying to play Uri"
            r4 = 14635(0x392b, float:2.0508E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            java.lang.Object r9 = r8.f266312d
            monitor-enter(r9)
            r10 = 0
            r8.mo89095f(r10)     // Catch:{ all -> 0x01fb }
            r2 = r23
            r8.m157336h(r2)     // Catch:{ all -> 0x01fb }
            r11 = 1
            r8.f266322p = r11     // Catch:{ all -> 0x01fb }
            boolean r2 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95456b.m157881d(r22)     // Catch:{ all -> 0x01fb }
            r12 = 3
            r13 = 0
            if (r2 == 0) goto L_0x00b3
            android.content.Context r2 = r8.f266313e     // Catch:{ all -> 0x01fb }
            android.media.Ringtone r2 = android.media.RingtoneManager.getRingtone(r2, r0)     // Catch:{ all -> 0x01fb }
            if (r2 == 0) goto L_0x0097
            com.google.common.f.x r0 = r1.mo56224b()     // Catch:{ all -> 0x01fb }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fb }
            java.lang.String r3 = "UriPlayer"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = "Playing a ringtone"
            r3 = 14663(0x3947, float:2.0547E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)     // Catch:{ all -> 0x01fb }
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder     // Catch:{ all -> 0x01fb }
            r0.<init>()     // Catch:{ all -> 0x01fb }
            android.media.AudioAttributes$Builder r0 = r0.setLegacyStreamType(r12)     // Catch:{ all -> 0x01fb }
            android.media.AudioAttributes r0 = r0.build()     // Catch:{ all -> 0x01fb }
            r2.setAudioAttributes(r0)     // Catch:{ all -> 0x01fb }
            r2.play()     // Catch:{ all -> 0x01fb }
            com.google.android.libraries.gsa.k.g r0 = r8.f266317k     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = "wait-for-ringtone"
            com.google.android.apps.gsa.staticplugins.bisto.b.b.af r3 = new com.google.android.apps.gsa.staticplugins.bisto.b.b.af     // Catch:{ all -> 0x01fb }
            r3.<init>(r2)     // Catch:{ all -> 0x01fb }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.ag r2 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95181ag.f266301a     // Catch:{ all -> 0x01fb }
            j$.time.Duration r4 = f266310h     // Catch:{ all -> 0x01fb }
            j$.time.Duration r5 = f266311i     // Catch:{ all -> 0x01fb }
            long r6 = com.google.common.p4543n.p4546c.C59407o.m92308d(r4)     // Catch:{ all -> 0x01fb }
            long r4 = com.google.common.p4543n.p4546c.C59407o.m92308d(r5)     // Catch:{ all -> 0x01fb }
            com.google.common.n.c.n r10 = new com.google.common.n.c.n     // Catch:{ all -> 0x01fb }
            r10.<init>(r6, r4)     // Catch:{ all -> 0x01fb }
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148470d(r0, r1, r3, r2, r10)     // Catch:{ all -> 0x01fb }
            com.google.android.libraries.gsa.k.g r1 = r8.f266317k     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = "played-ringtone"
            com.google.android.apps.gsa.staticplugins.bisto.b.b.ah r3 = new com.google.android.apps.gsa.staticplugins.bisto.b.b.ah     // Catch:{ all -> 0x01fb }
            r3.<init>(r8)     // Catch:{ all -> 0x01fb }
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag     // Catch:{ all -> 0x01fb }
            r4.<init>(r0, r1, r2, r3)     // Catch:{ all -> 0x01fb }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.ai r0 = new com.google.android.apps.gsa.staticplugins.bisto.b.b.ai     // Catch:{ all -> 0x01fb }
            r0.<init>(r8)     // Catch:{ all -> 0x01fb }
            r4.mo85223a(r0)     // Catch:{ all -> 0x01fb }
            monitor-exit(r9)     // Catch:{ all -> 0x01fb }
            goto L_0x01f5
        L_0x0097:
            android.content.Context r1 = r8.f266313e     // Catch:{ all -> 0x01fb }
            boolean r2 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95456b.m157882e(r22)     // Catch:{ all -> 0x01fb }
            if (r2 == 0) goto L_0x00a4
            android.net.Uri r1 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95456b.m157879b(r1, r0)     // Catch:{ all -> 0x01fb }
            goto L_0x00b0
        L_0x00a4:
            boolean r2 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95456b.m157880c(r22)     // Catch:{ all -> 0x01fb }
            if (r2 == 0) goto L_0x00af
            android.net.Uri r1 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95456b.m157878a(r1, r0)     // Catch:{ all -> 0x01fb }
            goto L_0x00b0
        L_0x00af:
            r1 = r10
        L_0x00b0:
            if (r1 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            android.content.Context r0 = r8.f266313e     // Catch:{ SecurityException -> 0x00c0 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x00c0 }
            android.content.ContentProviderClient r0 = r0.acquireContentProviderClient(r1)     // Catch:{ SecurityException -> 0x00c0 }
            r7 = r0
            goto L_0x00e4
        L_0x00c0:
            r0 = move-exception
            com.google.common.f.e r2 = f266307a     // Catch:{ all -> 0x01fb }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x01fb }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fb }
            java.lang.String r4 = "UriPlayer"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x01fb }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x01fb }
            com.google.common.f.x r0 = r2.mo56382g(r0)     // Catch:{ all -> 0x01fb }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01fb }
            r2 = 14675(0x3953, float:2.0564E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x01fb }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = "Can't access %s"
            r0.mo56389s(r2, r1)     // Catch:{ all -> 0x01fb }
            r7 = r10
        L_0x00e4:
            boolean r0 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95456b.m157881d(r1)     // Catch:{ all -> 0x01fb }
            if (r0 != 0) goto L_0x01e5
            if (r7 != 0) goto L_0x00ee
            goto L_0x01e5
        L_0x00ee:
            com.google.android.apps.gsa.staticplugins.bisto.f.ag r0 = r8.f266319m     // Catch:{ all -> 0x01fb }
            com.google.android.apps.gsa.staticplugins.bisto.f.af r0 = r0.mo89222a()     // Catch:{ all -> 0x01fb }
            com.google.common.f.e r2 = f266307a     // Catch:{ all -> 0x01fb }
            com.google.common.f.x r3 = r2.mo56224b()     // Catch:{ all -> 0x01fb }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fb }
            java.lang.String r5 = "UriPlayer"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x01fb }
            java.lang.String r4 = "Attempting to play content provider URI"
            r5 = 14665(0x3949, float:2.055E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x01fb }
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r1 = r7.openFile(r1, r3)     // Catch:{ RemoteException | FileNotFoundException | SecurityException -> 0x0182 }
            if (r1 != 0) goto L_0x0125
            r7.release()     // Catch:{ all -> 0x01fb }
            com.google.common.f.x r3 = r2.mo56226d()     // Catch:{ all -> 0x01fb }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fb }
            java.lang.String r5 = "UriPlayer"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x01fb }
            java.lang.String r4 = "Failed to get a file descriptor for the URI."
            r5 = 14667(0x394b, float:2.0553E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x01fb }
        L_0x0125:
            if (r1 != 0) goto L_0x012a
        L_0x0127:
            r11 = 0
            goto L_0x01ed
        L_0x012a:
            android.media.AudioTrack r6 = new android.media.AudioTrack     // Catch:{ all -> 0x01fb }
            r15 = 3
            r16 = 16000(0x3e80, float:2.2421E-41)
            r17 = 4
            r18 = 2
            r19 = 6400(0x1900, float:8.968E-42)
            r20 = 1
            r14 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01fb }
            r6.play()     // Catch:{ all -> 0x01fb }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r5 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ all -> 0x01fb }
            r5.<init>(r1)     // Catch:{ all -> 0x01fb }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.aj r4 = new com.google.android.apps.gsa.staticplugins.bisto.b.b.aj     // Catch:{ all -> 0x01fb }
            r4.<init>(r6, r0)     // Catch:{ all -> 0x01fb }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.h r3 = new com.google.android.apps.gsa.staticplugins.bisto.b.b.h     // Catch:{ all -> 0x01fb }
            com.google.android.libraries.gsa.k.g r0 = r8.f266317k     // Catch:{ all -> 0x01fb }
            com.google.android.libraries.f.a r1 = r8.f266318l     // Catch:{ all -> 0x01fb }
            r3.<init>(r0, r1, r5)     // Catch:{ all -> 0x01fb }
            java.util.concurrent.atomic.AtomicReference r0 = r8.f266320n     // Catch:{ all -> 0x01fb }
            java.lang.Object r0 = r0.getAndSet(r3)     // Catch:{ all -> 0x01fb }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.h r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95193h) r0     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x0170
            com.google.common.f.x r1 = r2.mo56226d()     // Catch:{ all -> 0x01fb }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fb }
            java.lang.String r14 = "UriPlayer"
            r1.mo56378ag(r2, r14)     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = "Still playing previous Uri"
            r14 = 14666(0x394a, float:2.0551E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r14)).mo56386p(r2)     // Catch:{ all -> 0x01fb }
            r0.mo89099a()     // Catch:{ all -> 0x01fb }
        L_0x0170:
            com.google.android.libraries.gsa.k.g r0 = r8.f266317k     // Catch:{ all -> 0x01fb }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.ad r14 = new com.google.android.apps.gsa.staticplugins.bisto.b.b.ad     // Catch:{ all -> 0x01fb }
            r1 = r14
            r2 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = "play"
            r0.mo28212l(r1, r14)     // Catch:{ all -> 0x01fb }
            goto L_0x01ed
        L_0x0180:
            r0 = move-exception
            goto L_0x01cd
        L_0x0182:
            java.lang.Object r1 = r8.f266312d     // Catch:{ all -> 0x0180 }
            monitor-enter(r1)     // Catch:{ all -> 0x0180 }
            int r0 = r8.f266322p     // Catch:{ all -> 0x01ca }
            monitor-exit(r1)     // Catch:{ all -> 0x01ca }
            if (r0 != r11) goto L_0x01b1
            java.lang.Object r1 = r8.f266312d     // Catch:{ all -> 0x0180 }
            monitor-enter(r1)     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.a r0 = r8.f266321o     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x0195
            r2 = 4
            r8.mo89093d(r2, r0)     // Catch:{ all -> 0x01ae }
        L_0x0195:
            monitor-exit(r1)     // Catch:{ all -> 0x01ae }
            r7.release()     // Catch:{ all -> 0x01fb }
            com.google.common.f.e r0 = f266307a     // Catch:{ all -> 0x01fb }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01fb }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = "UriPlayer"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = "Failed to get a file descriptor for the URI."
            r2 = 14669(0x394d, float:2.0556E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x01fb }
            goto L_0x01ed
        L_0x01ae:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ae }
            throw r0     // Catch:{ all -> 0x0180 }
        L_0x01b1:
            r7.release()     // Catch:{ all -> 0x01fb }
            com.google.common.f.e r0 = f266307a     // Catch:{ all -> 0x01fb }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01fb }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = "UriPlayer"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = "Failed to get a file descriptor for the URI."
            r2 = 14671(0x394f, float:2.0558E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x01fb }
            goto L_0x0127
        L_0x01ca:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ca }
            throw r0     // Catch:{ all -> 0x0180 }
        L_0x01cd:
            r7.release()     // Catch:{ all -> 0x01fb }
            com.google.common.f.e r1 = f266307a     // Catch:{ all -> 0x01fb }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x01fb }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fb }
            java.lang.String r3 = "UriPlayer"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = "Failed to get a file descriptor for the URI."
            r3 = 14670(0x394e, float:2.0557E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x01fb }
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x01e5:
            if (r7 == 0) goto L_0x01ea
            r7.release()     // Catch:{ all -> 0x01fb }
        L_0x01ea:
            r8.m157335g(r1)     // Catch:{ all -> 0x01fb }
        L_0x01ed:
            if (r11 != 0) goto L_0x01f4
            r8.mo89094e(r10)     // Catch:{ all -> 0x01fb }
            r8.f266321o = r10     // Catch:{ all -> 0x01fb }
        L_0x01f4:
            monitor-exit(r9)     // Catch:{ all -> 0x01fb }
        L_0x01f5:
            int r0 = com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a.f268446a
            if (r11 == 0) goto L_0x01fa
            return r12
        L_0x01fa:
            return r13
        L_0x01fb:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01fb }
            goto L_0x01ff
        L_0x01fe:
            throw r0
        L_0x01ff:
            goto L_0x01fe
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al.mo89090a(android.net.Uri, com.google.android.apps.gsa.staticplugins.bisto.b.b.a):int");
    }

    /* renamed from: b */
    public final void mo89091b() {
        C95174a aVar;
        C59104x b = f266307a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UriPlayer");
        ((C59052c) ((C59052c) b).mo56372aa(14637)).mo56386p("Handling error");
        synchronized (this.f266312d) {
            mo89094e((C95294af) null);
            aVar = this.f266321o;
            this.f266321o = null;
            this.f266322p = 0;
        }
        if (aVar != null) {
            aVar.mo89085a();
        }
    }

    /* renamed from: c */
    public final void mo89092c() {
        C95174a aVar;
        C59104x b = f266307a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UriPlayer");
        ((C59052c) ((C59052c) b).mo56372aa(14639)).mo56386p("Handling success");
        synchronized (this.f266312d) {
            mo89094e((C95294af) null);
            aVar = this.f266321o;
            this.f266321o = null;
            this.f266322p = 0;
        }
        if (aVar != null) {
            aVar.mo89086b();
        }
    }

    /* renamed from: d */
    public final void mo89093d(int i, C95174a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        C59104x b = f266307a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UriPlayer");
        ((C59052c) ((C59052c) b).mo56372aa(14657)).mo56386p("Trying to play sound effect");
        synchronized (this.f266312d) {
            mo89095f((C95294af) null);
            m157336h(aVar);
            this.f266322p = 3;
            Context context = this.f266313e;
            int[] iArr = C95188c.f266323a;
            String packageName = context.getPackageName();
            int i2 = C95188c.f266323a[i];
            m157335g(Uri.parse("android.resource://" + packageName + "/" + i2));
            int i3 = C95873a.f268446a;
        }
    }

    /* renamed from: e */
    public final void mo89094e(C95294af afVar) {
        synchronized (this.f266312d) {
            MediaPlayer mediaPlayer = this.f266314f;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    this.f266314f.stop();
                }
                this.f266314f.release();
                if (afVar != null) {
                    afVar.mo89220a(C95457c.f267105e);
                }
                this.f266314f = null;
            }
        }
    }

    /* renamed from: f */
    public final void mo89095f(C95294af afVar) {
        synchronized (this.f266312d) {
            C59104x b = f266307a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "UriPlayer");
            ((C59052c) ((C59052c) b).mo56372aa(14661)).mo56386p("Forcing a stop of playback.");
            this.f266315g = afVar;
            this.f266321o = null;
            C95193h hVar = (C95193h) this.f266320n.getAndSet((Object) null);
            if (hVar != null) {
                hVar.mo89099a();
            }
            this.f266322p = 0;
            mo89094e(afVar);
        }
    }
}
