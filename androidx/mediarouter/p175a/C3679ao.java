package androidx.mediarouter.p175a;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.os.Build;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p097i.C1970e;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.android.gms.cast.framework.internal.C143456t;
import com.google.android.gms.cast.framework.internal.C143457u;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: androidx.mediarouter.a.ao */
/* compiled from: PG */
public final class C3679ao implements C3729ck, C3719ca {

    /* renamed from: A */
    public C3675ak f11813A;

    /* renamed from: B */
    public MediaSessionCompat f11814B;

    /* renamed from: C */
    final C3670af f11815C = new C3670af(this);

    /* renamed from: D */
    private final ArrayList f11816D = new ArrayList();

    /* renamed from: E */
    private final C3677am f11817E = new C3677am(this);

    /* renamed from: F */
    private C3740m f11818F;

    /* renamed from: a */
    final Context f11819a;

    /* renamed from: b */
    boolean f11820b;

    /* renamed from: c */
    C3730cl f11821c;

    /* renamed from: d */
    C3720cb f11822d;

    /* renamed from: e */
    boolean f11823e;

    /* renamed from: f */
    C3737j f11824f;

    /* renamed from: g */
    final ArrayList f11825g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f11826h = new ArrayList();

    /* renamed from: i */
    public final Map f11827i = new HashMap();

    /* renamed from: j */
    public final ArrayList f11828j = new ArrayList();

    /* renamed from: k */
    final C3721cc f11829k = new C3721cc();

    /* renamed from: l */
    final C3671ag f11830l = new C3671ag(this);

    /* renamed from: m */
    public final boolean f11831m;

    /* renamed from: n */
    public C3688ax f11832n;

    /* renamed from: o */
    public C3702bk f11833o;

    /* renamed from: p */
    C3685au f11834p;

    /* renamed from: q */
    public C3685au f11835q;

    /* renamed from: r */
    public C3685au f11836r;

    /* renamed from: s */
    public C3748u f11837s;

    /* renamed from: t */
    C3685au f11838t;

    /* renamed from: u */
    C3748u f11839u;

    /* renamed from: v */
    final Map f11840v = new HashMap();

    /* renamed from: w */
    public C3740m f11841w;

    /* renamed from: x */
    public int f11842x;

    /* renamed from: y */
    public C3680ap f11843y;

    /* renamed from: z */
    C3683as f11844z;

    public C3679ao(Context context) {
        this.f11819a = context;
        this.f11831m = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    /* renamed from: r */
    private final int m10645r(String str) {
        int size = this.f11826h.size();
        for (int i = 0; i < size; i++) {
            if (((C3685au) this.f11826h.get(i)).f11863c.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: s */
    private final boolean m10646s(C3685au auVar) {
        C3684at atVar = auVar.f11861a;
        C3687aw.m10684i();
        return atVar.f11857a == this.f11821c && auVar.mo7766m("android.media.intent.category.LIVE_AUDIO") && !auVar.mo7766m("android.media.intent.category.LIVE_VIDEO");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo7731a(C3685au auVar, C3739l lVar) {
        int b = auVar.mo7755b(lVar);
        if (b != 0) {
            if ((b & 1) != 0) {
                if (C3687aw.f11883a) {
                    new StringBuilder("Route changed: ").append(auVar);
                    Log.d("MediaRouter", "Route changed: ".concat(String.valueOf(auVar)));
                }
                this.f11830l.obtainMessage(259, auVar).sendToTarget();
            }
            if ((b & 2) != 0) {
                if (C3687aw.f11883a) {
                    new StringBuilder("Route volume changed: ").append(auVar);
                    Log.d("MediaRouter", "Route volume changed: ".concat(String.valueOf(auVar)));
                }
                this.f11830l.obtainMessage(260, auVar).sendToTarget();
            }
            if ((b & 4) != 0) {
                if (C3687aw.f11883a) {
                    new StringBuilder("Route presentation display changed: ").append(auVar);
                    Log.d("MediaRouter", "Route presentation display changed: ".concat(String.valueOf(auVar)));
                }
                this.f11830l.obtainMessage(261, auVar).sendToTarget();
            }
        }
        return b;
    }

    /* renamed from: b */
    public final C3684at mo7732b(C3749v vVar) {
        int size = this.f11816D.size();
        for (int i = 0; i < size; i++) {
            if (((C3684at) this.f11816D.get(i)).f11857a == vVar) {
                return (C3684at) this.f11816D.get(i);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3685au mo7733c() {
        ArrayList arrayList = this.f11826h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3685au auVar = (C3685au) arrayList.get(i);
            if (auVar != this.f11834p && m10646s(auVar) && auVar.mo7763j()) {
                return auVar;
            }
        }
        return this.f11834p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C3685au mo7734d() {
        C3685au auVar = this.f11834p;
        if (auVar != null) {
            return auVar;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C3685au mo7735e() {
        C3685au auVar = this.f11836r;
        if (auVar != null) {
            return auVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo7736f(C3684at atVar, String str) {
        String flattenToShortString = atVar.f11859c.f12028a.flattenToShortString();
        String str2 = flattenToShortString + ":" + str;
        if (m10645r(str2) < 0) {
            this.f11827i.put(new C1970e(flattenToShortString, str), str2);
            return str2;
        }
        Log.w("MediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
        int i = 2;
        while (true) {
            String format = String.format(Locale.US, "%s_%d", new Object[]{str2, Integer.valueOf(i)});
            if (m10645r(format) < 0) {
                this.f11827i.put(new C1970e(flattenToShortString, str), format);
                return format;
            }
            i++;
        }
    }

    /* renamed from: g */
    public final void mo7737g(C3749v vVar) {
        if (mo7732b(vVar) == null) {
            C3684at atVar = new C3684at(vVar);
            this.f11816D.add(atVar);
            if (C3687aw.f11883a) {
                new StringBuilder("Provider added: ").append(atVar);
                Log.d("MediaRouter", "Provider added: ".concat(atVar.toString()));
            }
            this.f11830l.obtainMessage(513, atVar).sendToTarget();
            mo7745o(atVar, vVar.f12035k);
            C3677am amVar = this.f11817E;
            C3687aw.m10684i();
            vVar.f12032h = amVar;
            vVar.mo7915fl(this.f11818F);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo7738h() {
        if (this.f11836r.mo7762i()) {
            List<C3685au> unmodifiableList = Collections.unmodifiableList(this.f11836r.f11878r);
            HashSet hashSet = new HashSet();
            for (C3685au auVar : unmodifiableList) {
                hashSet.add(auVar.f11863c);
            }
            Iterator it = this.f11840v.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    C3748u uVar = (C3748u) entry.getValue();
                    uVar.mo7821i(0);
                    uVar.mo7816a();
                    it.remove();
                }
            }
            for (C3685au auVar2 : unmodifiableList) {
                if (!this.f11840v.containsKey(auVar2.f11863c)) {
                    C3684at atVar = auVar2.f11861a;
                    C3687aw.m10684i();
                    C3748u fj = atVar.f11857a.mo7827fj(auVar2.f11862b, this.f11836r.f11862b);
                    fj.mo7819g();
                    this.f11840v.put(auVar2.f11863c, fj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo7739i(C3679ao aoVar, C3685au auVar, C3748u uVar, int i, C3685au auVar2, Collection collection) {
        C3680ap apVar;
        C3683as asVar = this.f11844z;
        if (asVar != null) {
            asVar.mo7750a();
            this.f11844z = null;
        }
        C3683as asVar2 = new C3683as(aoVar, auVar, uVar, i, auVar2, collection);
        this.f11844z = asVar2;
        if (asVar2.f11848b != 3 || (apVar = this.f11843y) == null) {
            asVar2.mo7751b();
            return;
        }
        C3685au auVar3 = this.f11836r;
        C3685au auVar4 = asVar2.f11849c;
        C143457u.f389001a.mo118884b("Prepare transfer from Route(%s) to Route(%s)", auVar3, auVar4);
        C60870cx a = C2169h.m6027a(new C143456t((C143457u) apVar, auVar3, auVar4));
        C3683as asVar3 = this.f11844z;
        C3679ao aoVar2 = (C3679ao) asVar3.f11851e.get();
        if (aoVar2 == null || aoVar2.f11844z != asVar3) {
            Log.w("MediaRouter", "Router is released. Cancel transfer");
            asVar3.mo7750a();
        } else if (asVar3.f11852f == null) {
            asVar3.f11852f = a;
            C3681aq aqVar = new C3681aq(asVar3);
            C3671ag agVar = aoVar2.f11830l;
            Objects.requireNonNull(agVar);
            ((C2168g) a).f6144b.mo4106b(aqVar, new C3682ar(agVar));
        } else {
            throw new IllegalStateException("future is already set");
        }
    }

    /* renamed from: j */
    public final void mo7740j(C3749v vVar) {
        C3684at b = mo7732b(vVar);
        if (b != null) {
            C3687aw.m10684i();
            vVar.f12032h = null;
            vVar.mo7915fl((C3740m) null);
            mo7745o(b, (C3751x) null);
            if (C3687aw.f11883a) {
                new StringBuilder("Provider removed: ").append(b);
                Log.d("MediaRouter", "Provider removed: ".concat(b.toString()));
            }
            this.f11830l.obtainMessage(514, b).sendToTarget();
            this.f11816D.remove(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo7741k(C3685au auVar, int i) {
        if (!this.f11826h.contains(auVar)) {
            new StringBuilder("Ignoring attempt to select removed route: ").append(auVar);
            Log.w("MediaRouter", "Ignoring attempt to select removed route: ".concat(String.valueOf(auVar)));
        } else if (!auVar.f11867g) {
            new StringBuilder("Ignoring attempt to select disabled route: ").append(auVar);
            Log.w("MediaRouter", "Ignoring attempt to select disabled route: ".concat(String.valueOf(auVar)));
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                C3684at atVar = auVar.f11861a;
                C3687aw.m10684i();
                C3749v vVar = atVar.f11857a;
                C3737j jVar = this.f11824f;
                if (vVar == jVar && this.f11836r != auVar) {
                    String str = auVar.f11862b;
                    MediaRoute2Info mediaRoute2Info = null;
                    if (str != null) {
                        Iterator it = jVar.f11997d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MediaRoute2Info mediaRoute2Info2 = (MediaRoute2Info) it.next();
                            if (TextUtils.equals(mediaRoute2Info2.getId(), str)) {
                                mediaRoute2Info = mediaRoute2Info2;
                                break;
                            }
                        }
                    }
                    if (mediaRoute2Info == null) {
                        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=".concat(String.valueOf(str)));
                        return;
                    } else {
                        jVar.f11994a.transferTo(mediaRoute2Info);
                        return;
                    }
                }
            }
            mo7742l(auVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b0, code lost:
        r0 = r11.f11861a;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7742l(androidx.mediarouter.p175a.C3685au r11, int r12) {
        /*
            r10 = this;
            androidx.mediarouter.a.ao r0 = androidx.mediarouter.p175a.C3687aw.f11884b
            r1 = 3
            if (r0 == 0) goto L_0x000f
            androidx.mediarouter.a.au r0 = r10.f11835q
            if (r0 == 0) goto L_0x0090
            boolean r0 = r11.mo7760g()
            if (r0 == 0) goto L_0x0090
        L_0x000f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 3
        L_0x001d:
            int r4 = r0.length
            if (r3 >= r4) goto L_0x0049
            r4 = r0[r3]
            java.lang.String r5 = r4.getClassName()
            r2.append(r5)
            java.lang.String r5 = "."
            r2.append(r5)
            java.lang.String r5 = r4.getMethodName()
            r2.append(r5)
            java.lang.String r5 = ":"
            r2.append(r5)
            int r4 = r4.getLineNumber()
            r2.append(r4)
            java.lang.String r4 = "  "
            r2.append(r4)
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0049:
            androidx.mediarouter.a.ao r0 = androidx.mediarouter.p175a.C3687aw.f11884b
            if (r0 != 0) goto L_0x006f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "setSelectedRouteInternal is called while sGlobal is null: pkgName="
            r0.<init>(r3)
            android.content.Context r3 = r10.f11819a
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            java.lang.String r3 = ", callers="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = "MediaRouter"
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
            goto L_0x0090
        L_0x006f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Default route is selected while a BT route is available: pkgName="
            r0.<init>(r3)
            android.content.Context r3 = r10.f11819a
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            java.lang.String r3 = ", callers="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = "MediaRouter"
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
        L_0x0090:
            androidx.mediarouter.a.au r0 = r10.f11836r
            if (r0 != r11) goto L_0x0095
            return
        L_0x0095:
            androidx.mediarouter.a.au r0 = r10.f11838t
            r2 = 0
            if (r0 == 0) goto L_0x00aa
            r10.f11838t = r2
            androidx.mediarouter.a.u r0 = r10.f11839u
            if (r0 == 0) goto L_0x00aa
            r0.mo7821i(r1)
            androidx.mediarouter.a.u r0 = r10.f11839u
            r0.mo7816a()
            r10.f11839u = r2
        L_0x00aa:
            boolean r0 = r10.mo7747q()
            if (r0 == 0) goto L_0x012b
            androidx.mediarouter.a.at r0 = r11.f11861a
            androidx.mediarouter.a.x r1 = r0.f11860d
            if (r1 == 0) goto L_0x012b
            boolean r1 = r1.f12040b
            if (r1 == 0) goto L_0x012b
            androidx.mediarouter.p175a.C3687aw.m10684i()
            androidx.mediarouter.a.v r0 = r0.f11857a
            java.lang.String r1 = r11.f11862b
            androidx.mediarouter.a.r r0 = r0.mo7826fi(r1)
            if (r0 == 0) goto L_0x0112
            android.content.Context r12 = r10.f11819a
            java.util.concurrent.Executor r12 = androidx.core.content.C1881g.m5136a(r12)
            androidx.mediarouter.a.af r1 = r10.f11815C
            java.lang.Object r3 = r0.f12022j
            monitor-enter(r3)
            if (r12 == 0) goto L_0x0107
            if (r1 == 0) goto L_0x00ff
            r0.f12023k = r12     // Catch:{ all -> 0x010f }
            r0.f12026n = r1     // Catch:{ all -> 0x010f }
            java.util.Collection r12 = r0.f12025m     // Catch:{ all -> 0x010f }
            if (r12 == 0) goto L_0x00f6
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x010f }
            if (r12 != 0) goto L_0x00f6
            androidx.mediarouter.a.l r12 = r0.f12024l     // Catch:{ all -> 0x010f }
            java.util.Collection r4 = r0.f12025m     // Catch:{ all -> 0x010f }
            r0.f12024l = r2     // Catch:{ all -> 0x010f }
            r0.f12025m = r2     // Catch:{ all -> 0x010f }
            java.util.concurrent.Executor r2 = r0.f12023k     // Catch:{ all -> 0x010f }
            androidx.mediarouter.a.o r5 = new androidx.mediarouter.a.o     // Catch:{ all -> 0x010f }
            r5.<init>(r0, r1, r12, r4)     // Catch:{ all -> 0x010f }
            r2.execute(r5)     // Catch:{ all -> 0x010f }
        L_0x00f6:
            monitor-exit(r3)     // Catch:{ all -> 0x010f }
            r10.f11838t = r11
            r10.f11839u = r0
            r0.mo7819g()
            return
        L_0x00ff:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "Listener shouldn't be null"
            r11.<init>(r12)     // Catch:{ all -> 0x010f }
            throw r11     // Catch:{ all -> 0x010f }
        L_0x0107:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "Executor shouldn't be null"
            r11.<init>(r12)     // Catch:{ all -> 0x010f }
            throw r11     // Catch:{ all -> 0x010f }
        L_0x010f:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x010f }
            throw r11
        L_0x0112:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setSelectedRouteInternal: Failed to create dynamic group route controller. route="
            r0.<init>(r1)
            java.lang.String r1 = "setSelectedRouteInternal: Failed to create dynamic group route controller. route="
            r0.append(r11)
            java.lang.String r0 = "MediaRouter"
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r1 = r1.concat(r3)
            android.util.Log.w(r0, r1)
        L_0x012b:
            androidx.mediarouter.a.at r0 = r11.f11861a
            androidx.mediarouter.p175a.C3687aw.m10684i()
            androidx.mediarouter.a.v r0 = r0.f11857a
            java.lang.String r1 = r11.f11862b
            androidx.mediarouter.a.u r6 = r0.mo7823c(r1)
            if (r6 == 0) goto L_0x013d
            r6.mo7819g()
        L_0x013d:
            boolean r0 = androidx.mediarouter.p175a.C3687aw.f11883a
            if (r0 == 0) goto L_0x015a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Route selected: "
            r0.<init>(r1)
            java.lang.String r1 = "Route selected: "
            r0.append(r11)
            java.lang.String r0 = "MediaRouter"
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r1 = r1.concat(r3)
            android.util.Log.d(r0, r1)
        L_0x015a:
            androidx.mediarouter.a.au r0 = r10.f11836r
            if (r0 != 0) goto L_0x016f
            r10.f11836r = r11
            r10.f11837s = r6
            androidx.mediarouter.a.ag r0 = r10.f11830l
            androidx.core.i.e r1 = new androidx.core.i.e
            r1.<init>(r2, r11)
            r11 = 262(0x106, float:3.67E-43)
            r0.mo7725a(r11, r1, r12)
            return
        L_0x016f:
            r8 = 0
            r9 = 0
            r3 = r10
            r4 = r10
            r5 = r11
            r7 = r12
            r3.mo7739i(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3679ao.mo7742l(androidx.mediarouter.a.au, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ef, code lost:
        if (r0.f11841w.mo7904b() == r2) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7743m() {
        /*
            r21 = this;
            r0 = r21
            androidx.mediarouter.a.y r1 = new androidx.mediarouter.a.y
            r1.<init>()
            androidx.mediarouter.a.ax r2 = r0.f11832n
            r3 = 0
            r2.f11889c = r3
            r5 = 0
            r2.f11891e = r5
            long r6 = android.os.SystemClock.elapsedRealtime()
            r2.f11890d = r6
            android.os.Handler r6 = r2.f11887a
            java.lang.Runnable r2 = r2.f11888b
            r6.removeCallbacks(r2)
            java.util.ArrayList r2 = r0.f11825g
            int r2 = r2.size()
            r6 = 0
            r7 = 0
        L_0x0025:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x00aa
            java.util.ArrayList r8 = r0.f11825g
            java.lang.Object r8 = r8.get(r2)
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            java.lang.Object r8 = r8.get()
            androidx.mediarouter.a.aw r8 = (androidx.mediarouter.p175a.C3687aw) r8
            if (r8 != 0) goto L_0x0040
            java.util.ArrayList r8 = r0.f11825g
            r8.remove(r2)
            goto L_0x00a5
        L_0x0040:
            java.util.ArrayList r9 = r8.f11886d
            int r9 = r9.size()
            int r6 = r6 + r9
            r10 = 0
        L_0x0048:
            if (r10 >= r9) goto L_0x00a4
            java.util.ArrayList r11 = r8.f11886d
            java.lang.Object r11 = r11.get(r10)
            androidx.mediarouter.a.ab r11 = (androidx.mediarouter.p175a.C3666ab) r11
            androidx.mediarouter.a.z r12 = r11.f11795c
            r1.mo7924d(r12)
            int r12 = r11.f11796d
            r13 = 1
            r12 = r12 & r13
            androidx.mediarouter.a.ax r14 = r0.f11832n
            r15 = r6
            long r5 = r11.f11797e
            if (r12 != 0) goto L_0x0067
        L_0x0062:
            r16 = r8
            r17 = r9
            goto L_0x0082
        L_0x0067:
            long r3 = r14.f11890d
            long r16 = r3 - r5
            r18 = 30000(0x7530, double:1.4822E-319)
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x0062
            r16 = r8
            r17 = r9
            long r8 = r14.f11889c
            long r5 = r5 + r18
            long r5 = r5 - r3
            long r3 = java.lang.Math.max(r8, r5)
            r14.f11889c = r3
            r14.f11891e = r13
        L_0x0082:
            r3 = r12 | r7
            int r4 = r11.f11796d
            r5 = r4 & 4
            if (r5 == 0) goto L_0x008f
            boolean r5 = r0.f11831m
            if (r5 != 0) goto L_0x008f
            r3 = 1
        L_0x008f:
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0095
            r4 = 0
            goto L_0x0096
        L_0x0095:
            r4 = 1
        L_0x0096:
            r4 = r4 ^ r13
            r7 = r4 | r3
            int r10 = r10 + 1
            r6 = r15
            r8 = r16
            r9 = r17
            r3 = 0
            r5 = 0
            goto L_0x0048
        L_0x00a4:
            r15 = r6
        L_0x00a5:
            r3 = 0
            r5 = 0
            goto L_0x0025
        L_0x00aa:
            androidx.mediarouter.a.ax r2 = r0.f11832n
            boolean r3 = r2.f11891e
            if (r3 == 0) goto L_0x00bf
            long r3 = r2.f11889c
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x00bf
            android.os.Handler r5 = r2.f11887a
            java.lang.Runnable r8 = r2.f11888b
            r5.postDelayed(r8, r3)
        L_0x00bf:
            boolean r2 = r2.f11891e
            r0.f11842x = r6
            if (r7 == 0) goto L_0x00ca
            androidx.mediarouter.a.z r3 = r1.mo7921a()
            goto L_0x00cc
        L_0x00ca:
            androidx.mediarouter.a.z r3 = androidx.mediarouter.p175a.C3753z.f12042a
        L_0x00cc:
            androidx.mediarouter.a.z r1 = r1.mo7921a()
            boolean r4 = r21.mo7747q()
            r5 = 0
            java.lang.String r6 = "MediaRouter"
            if (r4 != 0) goto L_0x00da
            goto L_0x0129
        L_0x00da:
            androidx.mediarouter.a.m r4 = r0.f11841w
            if (r4 == 0) goto L_0x00f1
            r4.mo7903a()
            androidx.mediarouter.a.z r4 = r4.f12011b
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00f1
            androidx.mediarouter.a.m r4 = r0.f11841w
            boolean r4 = r4.mo7904b()
            if (r4 == r2) goto L_0x0129
        L_0x00f1:
            boolean r4 = r1.mo7927d()
            if (r4 == 0) goto L_0x0100
            if (r2 != 0) goto L_0x0100
            androidx.mediarouter.a.m r1 = r0.f11841w
            if (r1 == 0) goto L_0x0129
            r0.f11841w = r5
            goto L_0x0107
        L_0x0100:
            androidx.mediarouter.a.m r4 = new androidx.mediarouter.a.m
            r4.<init>(r1, r2)
            r0.f11841w = r4
        L_0x0107:
            boolean r1 = androidx.mediarouter.p175a.C3687aw.f11883a
            if (r1 == 0) goto L_0x0122
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Updated MediaRoute2Provider's discovery request: "
            r1.<init>(r4)
            androidx.mediarouter.a.m r8 = r0.f11841w
            r1.append(r8)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r1 = r4.concat(r1)
            android.util.Log.d(r6, r1)
        L_0x0122:
            androidx.mediarouter.a.j r1 = r0.f11824f
            androidx.mediarouter.a.m r4 = r0.f11841w
            r1.mo7915fl(r4)
        L_0x0129:
            androidx.mediarouter.a.m r1 = r0.f11818F
            if (r1 == 0) goto L_0x0142
            r1.mo7903a()
            androidx.mediarouter.a.z r1 = r1.f12011b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0142
            androidx.mediarouter.a.m r1 = r0.f11818F
            boolean r1 = r1.mo7904b()
            if (r1 == r2) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            return
        L_0x0142:
            boolean r1 = r3.mo7927d()
            if (r1 == 0) goto L_0x0152
            if (r2 != 0) goto L_0x0152
            androidx.mediarouter.a.m r1 = r0.f11818F
            if (r1 != 0) goto L_0x014f
            return
        L_0x014f:
            r0.f11818F = r5
            goto L_0x0159
        L_0x0152:
            androidx.mediarouter.a.m r1 = new androidx.mediarouter.a.m
            r1.<init>(r3, r2)
            r0.f11818F = r1
        L_0x0159:
            boolean r1 = androidx.mediarouter.p175a.C3687aw.f11883a
            if (r1 == 0) goto L_0x0174
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Updated discovery request: "
            r1.<init>(r3)
            androidx.mediarouter.a.m r4 = r0.f11818F
            r1.append(r4)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r3.concat(r1)
            android.util.Log.d(r6, r1)
        L_0x0174:
            if (r7 == 0) goto L_0x0181
            if (r2 != 0) goto L_0x0181
            boolean r1 = r0.f11831m
            if (r1 == 0) goto L_0x0181
            java.lang.String r1 = "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY."
            android.util.Log.i(r6, r1)
        L_0x0181:
            java.util.ArrayList r1 = r0.f11816D
            int r1 = r1.size()
            r5 = 0
        L_0x0188:
            if (r5 >= r1) goto L_0x01a0
            java.util.ArrayList r2 = r0.f11816D
            java.lang.Object r2 = r2.get(r5)
            androidx.mediarouter.a.at r2 = (androidx.mediarouter.p175a.C3684at) r2
            androidx.mediarouter.a.v r2 = r2.f11857a
            androidx.mediarouter.a.j r3 = r0.f11824f
            if (r2 == r3) goto L_0x019d
            androidx.mediarouter.a.m r3 = r0.f11818F
            r2.mo7915fl(r3)
        L_0x019d:
            int r5 = r5 + 1
            goto L_0x0188
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3679ao.mo7743m():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7744n() {
        /*
            r8 = this;
            androidx.mediarouter.a.au r0 = r8.f11836r
            if (r0 == 0) goto L_0x00b9
            androidx.mediarouter.a.cc r1 = r8.f11829k
            int r2 = r0.f11873m
            r1.f11951a = r2
            int r2 = r0.f11874n
            r1.f11952b = r2
            int r0 = r0.mo7754a()
            r1.f11953c = r0
            androidx.mediarouter.a.cc r0 = r8.f11829k
            androidx.mediarouter.a.au r1 = r8.f11836r
            int r2 = r1.f11871k
            r0.f11954d = r2
            int r0 = r1.f11870j
            boolean r0 = r8.mo7747q()
            r2 = 0
            if (r0 == 0) goto L_0x003b
            androidx.mediarouter.a.at r0 = r1.f11861a
            androidx.mediarouter.p175a.C3687aw.m10684i()
            androidx.mediarouter.a.v r0 = r0.f11857a
            androidx.mediarouter.a.j r1 = r8.f11824f
            if (r0 != r1) goto L_0x003b
            androidx.mediarouter.a.cc r0 = r8.f11829k
            androidx.mediarouter.a.u r1 = r8.f11837s
            java.lang.String r1 = androidx.mediarouter.p175a.C3737j.m10818e(r1)
            r0.f11955e = r1
            goto L_0x003f
        L_0x003b:
            androidx.mediarouter.a.cc r0 = r8.f11829k
            r0.f11955e = r2
        L_0x003f:
            java.util.ArrayList r0 = r8.f11828j
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L_0x00b0
            androidx.mediarouter.a.ak r0 = r8.f11813A
            if (r0 == 0) goto L_0x00c0
            androidx.mediarouter.a.au r0 = r8.f11836r
            androidx.mediarouter.a.au r2 = r8.mo7734d()
            if (r0 == r2) goto L_0x00aa
            androidx.mediarouter.a.au r0 = r8.f11836r
            androidx.mediarouter.a.au r2 = r8.f11835q
            if (r0 != r2) goto L_0x005b
            goto L_0x00aa
        L_0x005b:
            androidx.mediarouter.a.cc r0 = r8.f11829k
            int r2 = r0.f11953c
            r3 = 1
            if (r2 != r3) goto L_0x0065
            r1 = 2
            r4 = 2
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            androidx.mediarouter.a.ak r1 = r8.f11813A
            int r5 = r0.f11952b
            int r6 = r0.f11951a
            java.lang.String r7 = r0.f11955e
            androidx.media.au r0 = r1.f11809b
            if (r0 == 0) goto L_0x0083
            if (r4 != 0) goto L_0x0083
            if (r5 == 0) goto L_0x0077
            goto L_0x0083
        L_0x0077:
            r0.f6697a = r6
            java.lang.Object r0 = r0.mo5847a()
            android.media.VolumeProvider r0 = (android.media.VolumeProvider) r0
            androidx.media.C2422at.m6448a(r0, r6)
            return
        L_0x0083:
            androidx.mediarouter.a.aj r0 = new androidx.mediarouter.a.aj
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f11809b = r0
            android.support.v4.media.session.MediaSessionCompat r0 = r1.f11808a
            androidx.media.au r1 = r1.f11809b
            if (r1 == 0) goto L_0x00a2
            android.support.v4.media.session.aa r0 = r0.f982b
            android.support.v4.media.session.ac r0 = (android.support.p031v4.media.session.C0286ac) r0
            android.media.session.MediaSession r0 = r0.f1013a
            java.lang.Object r1 = r1.mo5847a()
            android.media.VolumeProvider r1 = (android.media.VolumeProvider) r1
            r0.setPlaybackToRemote(r1)
            return
        L_0x00a2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "volumeProvider may not be null!"
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            androidx.mediarouter.a.ak r0 = r8.f11813A
            r0.mo7729a()
            return
        L_0x00b0:
            java.util.ArrayList r0 = r8.f11828j
            java.lang.Object r0 = r0.get(r1)
            androidx.mediarouter.a.an r0 = (androidx.mediarouter.p175a.C3678an) r0
            throw r2
        L_0x00b9:
            androidx.mediarouter.a.ak r0 = r8.f11813A
            if (r0 == 0) goto L_0x00c0
            r0.mo7729a()
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3679ao.mo7744n():void");
    }

    /* renamed from: o */
    public final void mo7745o(C3684at atVar, C3751x xVar) {
        boolean z;
        int i;
        C3684at atVar2 = atVar;
        C3751x xVar2 = xVar;
        if (atVar2.f11860d != xVar2) {
            atVar2.f11860d = xVar2;
            if (xVar2 == null || (!xVar.mo7919b() && xVar2 != this.f11821c.f12035k)) {
                new StringBuilder("Ignoring invalid provider descriptor: ").append(xVar2);
                Log.w("MediaRouter", "Ignoring invalid provider descriptor: ".concat(String.valueOf(xVar)));
                i = 0;
                z = false;
            } else {
                List<C3739l> list = xVar2.f12039a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                z = false;
                int i2 = 0;
                for (C3739l lVar : list) {
                    if (lVar == null || !lVar.mo7901t()) {
                        new StringBuilder("Ignoring invalid system route descriptor: ").append(lVar);
                        Log.w("MediaRouter", "Ignoring invalid system route descriptor: ".concat(String.valueOf(lVar)));
                    } else {
                        String n = lVar.mo7895n();
                        int size = atVar2.f11858b.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                if (((C3685au) atVar2.f11858b.get(i3)).f11862b.equals(n)) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 < 0) {
                            C3685au auVar = new C3685au(atVar2, n, mo7736f(atVar2, n));
                            int i4 = i2 + 1;
                            atVar2.f11858b.add(i2, auVar);
                            this.f11826h.add(auVar);
                            lVar.mo7898q();
                            if (lVar.f12008b.size() > 0) {
                                arrayList.add(new C1970e(auVar, lVar));
                            } else {
                                auVar.mo7755b(lVar);
                                if (C3687aw.f11883a) {
                                    new StringBuilder("Route added: ").append(auVar);
                                    Log.d("MediaRouter", "Route added: ".concat(auVar.toString()));
                                }
                                this.f11830l.obtainMessage(257, auVar).sendToTarget();
                            }
                            i2 = i4;
                        } else if (i3 < i2) {
                            new StringBuilder("Ignoring route descriptor with duplicate id: ").append(lVar);
                            Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: ".concat(lVar.toString()));
                        } else {
                            C3685au auVar2 = (C3685au) atVar2.f11858b.get(i3);
                            int i5 = i2 + 1;
                            Collections.swap(atVar2.f11858b, i3, i2);
                            lVar.mo7898q();
                            if (lVar.f12008b.size() > 0) {
                                arrayList2.add(new C1970e(auVar2, lVar));
                            } else if (mo7731a(auVar2, lVar) != 0 && auVar2 == this.f11836r) {
                                i2 = i5;
                                z = true;
                            }
                            i2 = i5;
                        }
                    }
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    C1970e eVar = (C1970e) arrayList.get(i6);
                    C3685au auVar3 = (C3685au) eVar.f5888a;
                    auVar3.mo7755b((C3739l) eVar.f5889b);
                    if (C3687aw.f11883a) {
                        new StringBuilder("Route added: ").append(auVar3);
                        Log.d("MediaRouter", "Route added: ".concat(String.valueOf(auVar3)));
                    }
                    this.f11830l.obtainMessage(257, auVar3).sendToTarget();
                }
                int size3 = arrayList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    C1970e eVar2 = (C1970e) arrayList2.get(i7);
                    C3685au auVar4 = (C3685au) eVar2.f5888a;
                    if (mo7731a(auVar4, (C3739l) eVar2.f5889b) != 0 && auVar4 == this.f11836r) {
                        z = true;
                    }
                }
                i = i2;
            }
            for (int size4 = atVar2.f11858b.size() - 1; size4 >= i; size4--) {
                C3685au auVar5 = (C3685au) atVar2.f11858b.get(size4);
                auVar5.mo7755b((C3739l) null);
                this.f11826h.remove(auVar5);
            }
            mo7746p(z);
            for (int size5 = atVar2.f11858b.size() - 1; size5 >= i; size5--) {
                C3685au auVar6 = (C3685au) atVar2.f11858b.remove(size5);
                if (C3687aw.f11883a) {
                    new StringBuilder("Route removed: ").append(auVar6);
                    Log.d("MediaRouter", "Route removed: ".concat(String.valueOf(auVar6)));
                }
                this.f11830l.obtainMessage(258, auVar6).sendToTarget();
            }
            if (C3687aw.f11883a) {
                new StringBuilder("Provider changed: ").append(atVar2);
                Log.d("MediaRouter", "Provider changed: ".concat(atVar.toString()));
            }
            this.f11830l.obtainMessage(515, atVar2).sendToTarget();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo7746p(boolean z) {
        C3685au auVar = this.f11834p;
        if (auVar != null && !auVar.mo7763j()) {
            StringBuilder sb = new StringBuilder("Clearing the default route because it is no longer selectable: ");
            C3685au auVar2 = this.f11834p;
            sb.append(auVar2);
            Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: ".concat(String.valueOf(auVar2)));
            this.f11834p = null;
        }
        if (this.f11834p == null && !this.f11826h.isEmpty()) {
            ArrayList arrayList = this.f11826h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                C3685au auVar3 = (C3685au) arrayList.get(i);
                C3684at atVar = auVar3.f11861a;
                C3687aw.m10684i();
                if (atVar.f11857a == this.f11821c && auVar3.f11862b.equals("DEFAULT_ROUTE") && auVar3.mo7763j()) {
                    this.f11834p = auVar3;
                    StringBuilder sb2 = new StringBuilder("Found default route: ");
                    C3685au auVar4 = this.f11834p;
                    sb2.append(auVar4);
                    Log.i("MediaRouter", "Found default route: ".concat(String.valueOf(auVar4)));
                    break;
                }
                i++;
            }
        }
        C3685au auVar5 = this.f11835q;
        if (auVar5 != null && !auVar5.mo7763j()) {
            StringBuilder sb3 = new StringBuilder("Clearing the bluetooth route because it is no longer selectable: ");
            C3685au auVar6 = this.f11835q;
            sb3.append(auVar6);
            Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: ".concat(String.valueOf(auVar6)));
            this.f11835q = null;
        }
        if (this.f11835q == null && !this.f11826h.isEmpty()) {
            ArrayList arrayList2 = this.f11826h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                C3685au auVar7 = (C3685au) arrayList2.get(i2);
                if (m10646s(auVar7) && auVar7.mo7763j()) {
                    this.f11835q = auVar7;
                    StringBuilder sb4 = new StringBuilder("Found bluetooth route: ");
                    C3685au auVar8 = this.f11835q;
                    sb4.append(auVar8);
                    Log.i("MediaRouter", "Found bluetooth route: ".concat(String.valueOf(auVar8)));
                    break;
                }
                i2++;
            }
        }
        C3685au auVar9 = this.f11836r;
        if (auVar9 == null || !auVar9.f11867g) {
            StringBuilder sb5 = new StringBuilder("Unselecting the current route because it is no longer selectable: ");
            C3685au auVar10 = this.f11836r;
            sb5.append(auVar10);
            Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: ".concat(String.valueOf(auVar10)));
            mo7742l(mo7733c(), 0);
        } else if (z) {
            mo7738h();
            mo7744n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo7747q() {
        if (!this.f11823e) {
            return false;
        }
        C3702bk bkVar = this.f11833o;
        return bkVar == null || bkVar.f11898a;
    }
}
