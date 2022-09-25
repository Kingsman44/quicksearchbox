package androidx.mediarouter.p175a;

import android.content.Context;
import android.os.Looper;
import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.mediarouter.a.aw */
/* compiled from: PG */
public final class C3687aw {

    /* renamed from: a */
    static final boolean f11883a = Log.isLoggable("MediaRouter", 3);

    /* renamed from: b */
    static C3679ao f11884b;

    /* renamed from: c */
    final Context f11885c;

    /* renamed from: d */
    final ArrayList f11886d = new ArrayList();

    public C3687aw(Context context) {
        this.f11885c = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.mediarouter.p175a.C3679ao m10682b() {
        /*
            androidx.mediarouter.a.ao r0 = f11884b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r0.f11820b
            if (r2 == 0) goto L_0x000c
            goto L_0x00c2
        L_0x000c:
            r2 = 1
            r0.f11820b = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            r5 = 0
            if (r3 < r4) goto L_0x0048
            android.content.Context r3 = r0.f11819a
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<androidx.mediarouter.a.bl> r6 = androidx.mediarouter.p175a.C3703bl.class
            r4.<init>(r3, r6)
            java.lang.String r6 = r3.getPackageName()
            r4.setPackage(r6)
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.util.List r3 = r3.queryBroadcastReceivers(r4, r5)
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0035
            r5 = 1
        L_0x0035:
            r0.f11823e = r5
            if (r5 == 0) goto L_0x004a
            androidx.mediarouter.a.j r3 = new androidx.mediarouter.a.j
            android.content.Context r4 = r0.f11819a
            androidx.mediarouter.a.al r5 = new androidx.mediarouter.a.al
            r5.<init>(r0)
            r3.<init>(r4, r5)
            r0.f11824f = r3
            goto L_0x004c
        L_0x0048:
            r0.f11823e = r5
        L_0x004a:
            r0.f11824f = r1
        L_0x004c:
            android.content.Context r3 = r0.f11819a
            androidx.mediarouter.a.cd r4 = new androidx.mediarouter.a.cd
            r4.<init>(r3, r0)
            r0.f11821c = r4
            androidx.mediarouter.a.ax r3 = new androidx.mediarouter.a.ax
            androidx.mediarouter.a.ae r4 = new androidx.mediarouter.a.ae
            r4.<init>(r0)
            r3.<init>(r4)
            r0.f11832n = r3
            androidx.mediarouter.a.cl r3 = r0.f11821c
            r0.mo7737g(r3)
            androidx.mediarouter.a.j r3 = r0.f11824f
            if (r3 == 0) goto L_0x006d
            r0.mo7737g(r3)
        L_0x006d:
            androidx.mediarouter.a.cb r3 = new androidx.mediarouter.a.cb
            android.content.Context r4 = r0.f11819a
            r3.<init>(r4, r0)
            r0.f11822d = r3
            androidx.mediarouter.a.cb r0 = r0.f11822d
            boolean r3 = r0.f11946d
            if (r3 != 0) goto L_0x00c2
            r0.f11946d = r2
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "android.intent.action.PACKAGE_ADDED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_REMOVED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_CHANGED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_REPLACED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_RESTARTED"
            r2.addAction(r3)
            java.lang.String r3 = "package"
            r2.addDataScheme(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 >= r4) goto L_0x00b1
            android.content.Context r3 = r0.f11943a
            android.content.BroadcastReceiver r4 = r0.f11947e
            android.os.Handler r5 = r0.f11945c
            r3.registerReceiver(r4, r2, r1, r5)
            goto L_0x00bb
        L_0x00b1:
            android.content.Context r1 = r0.f11943a
            android.content.BroadcastReceiver r3 = r0.f11947e
            android.os.Handler r4 = r0.f11945c
            r5 = 4
            androidx.mediarouter.p175a.C3717bz.m10758a(r1, r3, r2, r4, r5)
        L_0x00bb:
            android.os.Handler r1 = r0.f11945c
            java.lang.Runnable r0 = r0.f11948f
            r1.post(r0)
        L_0x00c2:
            androidx.mediarouter.a.ao r0 = f11884b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3687aw.m10682b():androidx.mediarouter.a.ao");
    }

    /* renamed from: i */
    public static void m10684i() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r0 = r0.f11901d;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10685n() {
        /*
            androidx.mediarouter.a.ao r0 = f11884b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.mediarouter.a.ao r0 = m10682b()
            androidx.mediarouter.a.bk r0 = r0.f11833o
            r2 = 1
            if (r0 == 0) goto L_0x001d
            android.os.Bundle r0 = r0.f11901d
            if (r0 == 0) goto L_0x001d
            java.lang.String r3 = "androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return r1
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3687aw.m10685n():boolean");
    }

    /* renamed from: o */
    public static boolean m10686o() {
        if (f11884b == null) {
            return false;
        }
        return m10682b().mo7747q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f11833o;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m10687q() {
        /*
            androidx.mediarouter.a.ao r0 = m10682b()
            if (r0 == 0) goto L_0x0011
            androidx.mediarouter.a.bk r0 = r0.f11833o
            if (r0 != 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            boolean r0 = r0.f11900c
            if (r0 == 0) goto L_0x0011
            r0 = 1
            return r0
        L_0x0011:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3687aw.m10687q():boolean");
    }

    /* renamed from: r */
    public static final void m10688r(C3702bk bkVar) {
        m10684i();
        C3679ao b = m10682b();
        C3702bk bkVar2 = b.f11833o;
        b.f11833o = bkVar;
        if (b.mo7747q()) {
            if (b.f11824f == null) {
                b.f11824f = new C3737j(b.f11819a, new C3676al(b));
                b.mo7737g(b.f11824f);
                b.mo7743m();
                b.f11822d.mo7841a();
            }
            boolean z = false;
            if (bkVar2 != null && bkVar2.f11900c) {
                z = true;
            }
            if (z != bkVar.f11900c) {
                b.f11824f.mo7916fm(b.f11841w);
            }
        } else {
            C3737j jVar = b.f11824f;
            if (jVar != null) {
                b.mo7740j(jVar);
                b.f11824f = null;
                b.f11822d.mo7841a();
            }
        }
        b.f11830l.obtainMessage(769, bkVar).sendToTarget();
    }

    /* renamed from: s */
    private final int m10689s(C3665aa aaVar) {
        int size = this.f11886d.size();
        for (int i = 0; i < size; i++) {
            if (((C3666ab) this.f11886d.get(i)).f11794b == aaVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final MediaSessionCompat.Token mo7768a() {
        C3679ao aoVar = f11884b;
        if (aoVar == null) {
            return null;
        }
        C3675ak akVar = aoVar.f11813A;
        if (akVar != null) {
            return ((C0286ac) akVar.f11808a.f982b).f1014b;
        }
        MediaSessionCompat mediaSessionCompat = aoVar.f11814B;
        if (mediaSessionCompat == null) {
            return null;
        }
        return ((C0286ac) mediaSessionCompat.f982b).f1014b;
    }

    /* renamed from: c */
    public final C3685au mo7769c() {
        m10684i();
        return m10682b().mo7734d();
    }

    /* renamed from: d */
    public final C3685au mo7770d() {
        m10684i();
        return m10682b().mo7735e();
    }

    /* renamed from: f */
    public final C3702bk mo7771f() {
        m10684i();
        C3679ao b = m10682b();
        if (b == null) {
            return null;
        }
        return b.f11833o;
    }

    /* renamed from: g */
    public final List mo7772g() {
        m10684i();
        C3679ao b = m10682b();
        return b == null ? Collections.emptyList() : b.f11826h;
    }

    /* renamed from: l */
    public final void mo7776l(MediaSessionCompat mediaSessionCompat) {
        m10684i();
        if (f11883a) {
            new StringBuilder("setMediaSessionCompat: ").append(mediaSessionCompat);
            Log.d("MediaRouter", "setMediaSessionCompat: ".concat(String.valueOf(mediaSessionCompat)));
        }
        C3679ao b = m10682b();
        b.f11814B = mediaSessionCompat;
        C3675ak akVar = mediaSessionCompat != null ? new C3675ak(b, mediaSessionCompat) : null;
        C3675ak akVar2 = b.f11813A;
        if (akVar2 != null) {
            akVar2.mo7729a();
        }
        b.f11813A = akVar;
        if (akVar != null) {
            b.mo7744n();
        }
    }

    /* renamed from: e */
    public static C3687aw m10683e(Context context) {
        if (context != null) {
            m10684i();
            if (f11884b == null) {
                f11884b = new C3679ao(context.getApplicationContext());
            }
            C3679ao aoVar = f11884b;
            int size = aoVar.f11825g.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C3687aw awVar = (C3687aw) ((WeakReference) aoVar.f11825g.get(size)).get();
                    if (awVar == null) {
                        aoVar.f11825g.remove(size);
                    } else if (awVar.f11885c == context) {
                        return awVar;
                    }
                } else {
                    C3687aw awVar2 = new C3687aw(context);
                    aoVar.f11825g.add(new WeakReference(awVar2));
                    return awVar2;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    /* renamed from: j */
    public final void mo7774j(C3665aa aaVar) {
        if (aaVar != null) {
            m10684i();
            if (f11883a) {
                new StringBuilder("removeCallback: callback=").append(aaVar);
                Log.d("MediaRouter", "removeCallback: callback=".concat(aaVar.toString()));
            }
            int s = m10689s(aaVar);
            if (s >= 0) {
                this.f11886d.remove(s);
                m10682b().mo7743m();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    /* renamed from: k */
    public final void mo7775k(C3685au auVar) {
        if (auVar != null) {
            m10684i();
            if (f11883a) {
                new StringBuilder("selectRoute: ").append(auVar);
                Log.d("MediaRouter", "selectRoute: ".concat(auVar.toString()));
            }
            m10682b().mo7741k(auVar, 3);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    /* renamed from: m */
    public final void mo7777m(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        m10684i();
        C3679ao b = m10682b();
        C3685au c = b.mo7733c();
        if (b.mo7735e() != c) {
            b.mo7741k(c, i);
        }
    }

    /* renamed from: p */
    public final boolean mo7778p(C3753z zVar, int i) {
        if (zVar != null) {
            m10684i();
            C3679ao b = m10682b();
            if (zVar.mo7927d()) {
                return false;
            }
            if ((i & 2) != 0 || !b.f11831m) {
                C3702bk bkVar = b.f11833o;
                boolean z = bkVar != null && bkVar.f11899b && b.mo7747q();
                int size = b.f11826h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C3685au auVar = (C3685au) b.f11826h.get(i2);
                    if ((i & 1) == 0 || !auVar.mo7761h()) {
                        if (z && !auVar.mo7761h()) {
                            C3684at atVar = auVar.f11861a;
                            m10684i();
                            if (atVar.f11857a != b.f11824f) {
                                continue;
                            }
                        }
                        if (auVar.mo7765l(zVar)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.mediarouter.a.ab} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7773h(androidx.mediarouter.p175a.C3753z r4, androidx.mediarouter.p175a.C3665aa r5, int r6) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0094
            if (r5 == 0) goto L_0x008c
            m10684i()
            boolean r0 = f11883a
            if (r0 == 0) goto L_0x0032
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "addCallback: selector="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", callback="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", flags="
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r6)
            r0.append(r1)
            java.lang.String r1 = "MediaRouter"
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x0032:
            int r0 = r3.m10689s(r5)
            if (r0 >= 0) goto L_0x0043
            androidx.mediarouter.a.ab r0 = new androidx.mediarouter.a.ab
            r0.<init>(r3, r5)
            java.util.ArrayList r5 = r3.f11886d
            r5.add(r0)
            goto L_0x004c
        L_0x0043:
            java.util.ArrayList r5 = r3.f11886d
            java.lang.Object r5 = r5.get(r0)
            r0 = r5
            androidx.mediarouter.a.ab r0 = (androidx.mediarouter.p175a.C3666ab) r0
        L_0x004c:
            int r5 = r0.f11796d
            r1 = 1
            if (r6 == r5) goto L_0x0055
            r0.f11796d = r6
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            r6 = r6 & r1
            r5 = r5 | r6
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f11797e = r1
            androidx.mediarouter.a.z r6 = r0.f11795c
            r6.mo7926c()
            r4.mo7926c()
            java.util.List r6 = r6.f12044c
            java.util.List r1 = r4.f12044c
            boolean r6 = r6.containsAll(r1)
            if (r6 != 0) goto L_0x0081
            androidx.mediarouter.a.y r5 = new androidx.mediarouter.a.y
            androidx.mediarouter.a.z r6 = r0.f11795c
            r5.<init>(r6)
            r5.mo7924d(r4)
            androidx.mediarouter.a.z r4 = r5.mo7921a()
            r0.f11795c = r4
            goto L_0x0084
        L_0x0081:
            if (r5 != 0) goto L_0x0084
            return
        L_0x0084:
            androidx.mediarouter.a.ao r4 = m10682b()
            r4.mo7743m()
            return
        L_0x008c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "callback must not be null"
            r4.<init>(r5)
            throw r4
        L_0x0094:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "selector must not be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3687aw.mo7773h(androidx.mediarouter.a.z, androidx.mediarouter.a.aa, int):void");
    }
}
