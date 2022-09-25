package androidx.media3.p174ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.core.app.C1800aq;
import androidx.core.app.C1832s;
import androidx.core.app.C1839z;
import androidx.media.p130a.C2402b;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2646bh;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.apps.search.podcasts.player.impl.C140812at;
import com.google.android.apps.search.podcasts.player.impl.C140836o;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.media3.ui.p */
/* compiled from: PG */
public final class C3652p {

    /* renamed from: h */
    private static int f11714h;

    /* renamed from: A */
    private boolean f11715A;

    /* renamed from: B */
    private int f11716B;

    /* renamed from: C */
    private boolean f11717C;

    /* renamed from: D */
    private int f11718D = R.drawable.exo_notification_small_icon;

    /* renamed from: E */
    private int f11719E;

    /* renamed from: F */
    private int f11720F;

    /* renamed from: G */
    private boolean f11721G;

    /* renamed from: H */
    private String f11722H;

    /* renamed from: I */
    private final C140836o f11723I;

    /* renamed from: a */
    public final Handler f11724a;

    /* renamed from: b */
    public final int f11725b;

    /* renamed from: c */
    public C2646bh f11726c;

    /* renamed from: d */
    public boolean f11727d;

    /* renamed from: e */
    public int f11728e;

    /* renamed from: f */
    public boolean f11729f;

    /* renamed from: g */
    public boolean f11730g;

    /* renamed from: i */
    private final Context f11731i;

    /* renamed from: j */
    private final String f11732j;

    /* renamed from: k */
    private final int f11733k;

    /* renamed from: l */
    private final C3649m f11734l;

    /* renamed from: m */
    private final C1800aq f11735m;

    /* renamed from: n */
    private final IntentFilter f11736n;

    /* renamed from: o */
    private final C2644bf f11737o;

    /* renamed from: p */
    private final C3650n f11738p;

    /* renamed from: q */
    private final Map f11739q;

    /* renamed from: r */
    private final Map f11740r;

    /* renamed from: s */
    private final PendingIntent f11741s;

    /* renamed from: t */
    private C1839z f11742t;

    /* renamed from: u */
    private List f11743u;

    /* renamed from: v */
    private MediaSessionCompat.Token f11744v;

    /* renamed from: w */
    private boolean f11745w;

    /* renamed from: x */
    private boolean f11746x;

    /* renamed from: y */
    private boolean f11747y;

    /* renamed from: z */
    private boolean f11748z;

    protected C3652p(Context context, String str, int i, C3649m mVar, C140836o oVar, int i2, int i3, int i4, int i5, int i6, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f11731i = applicationContext;
        this.f11732j = str;
        this.f11733k = i;
        this.f11734l = mVar;
        this.f11723I = oVar;
        this.f11722H = str2;
        int i7 = f11714h;
        f11714h = i7 + 1;
        this.f11725b = i7;
        this.f11724a = C2612ak.m6921D(Looper.getMainLooper(), new C3646j(this));
        this.f11735m = new C1800aq(applicationContext);
        this.f11737o = new C3651o(this);
        this.f11738p = new C3650n(this);
        this.f11736n = new IntentFilter();
        this.f11745w = true;
        this.f11746x = true;
        this.f11715A = true;
        this.f11747y = true;
        this.f11748z = true;
        this.f11717C = true;
        this.f11721G = true;
        this.f11720F = -1;
        this.f11716B = 1;
        this.f11719E = 1;
        HashMap hashMap = new HashMap();
        hashMap.put("androidx.media3.ui.notification.play", new C1832s(i2, applicationContext.getString(R.string.exo_controls_play_description), m10599j("androidx.media3.ui.notification.play", applicationContext, i7)));
        hashMap.put("androidx.media3.ui.notification.pause", new C1832s(i3, applicationContext.getString(R.string.exo_controls_pause_description), m10599j("androidx.media3.ui.notification.pause", applicationContext, i7)));
        hashMap.put("androidx.media3.ui.notification.stop", new C1832s(R.drawable.exo_notification_stop, applicationContext.getString(R.string.exo_controls_stop_description), m10599j("androidx.media3.ui.notification.stop", applicationContext, i7)));
        hashMap.put("androidx.media3.ui.notification.rewind", new C1832s(i4, applicationContext.getString(R.string.exo_controls_rewind_description), m10599j("androidx.media3.ui.notification.rewind", applicationContext, i7)));
        hashMap.put("androidx.media3.ui.notification.ffwd", new C1832s(i5, applicationContext.getString(R.string.exo_controls_fastforward_description), m10599j("androidx.media3.ui.notification.ffwd", applicationContext, i7)));
        hashMap.put("androidx.media3.ui.notification.prev", new C1832s(R.drawable.exo_notification_previous, applicationContext.getString(R.string.exo_controls_previous_description), m10599j("androidx.media3.ui.notification.prev", applicationContext, i7)));
        hashMap.put("androidx.media3.ui.notification.next", new C1832s(i6, applicationContext.getString(R.string.exo_controls_next_description), m10599j("androidx.media3.ui.notification.next", applicationContext, i7)));
        this.f11739q = hashMap;
        for (String addAction : hashMap.keySet()) {
            this.f11736n.addAction(addAction);
        }
        Map emptyMap = Collections.emptyMap();
        this.f11740r = emptyMap;
        for (String addAction2 : emptyMap.keySet()) {
            this.f11736n.addAction(addAction2);
        }
        this.f11741s = m10599j("androidx.media3.ui.notification.dismiss", applicationContext, this.f11725b);
        this.f11736n.addAction("androidx.media3.ui.notification.dismiss");
    }

    /* renamed from: j */
    private static PendingIntent m10599j(String str, Context context, int i) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra("INSTANCE_ID", i);
        int i2 = C2612ak.f7249a;
        return PendingIntent.getBroadcast(context, i, intent, 201326592);
    }

    /* renamed from: k */
    private static final boolean m10600k(C2646bh bhVar) {
        if (bhVar.mo5998e() == 4 || bhVar.mo5998e() == 1 || !bhVar.mo5987O()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7697a() {
        if (this.f11727d) {
            mo7698b();
        }
    }

    /* renamed from: b */
    public final void mo7698b() {
        if (!this.f11724a.hasMessages(0)) {
            this.f11724a.sendEmptyMessage(0);
        }
    }

    /* renamed from: c */
    public final void mo7699c(MediaSessionCompat.Token token) {
        if (!C2612ak.m6951aa(this.f11744v, token)) {
            this.f11744v = token;
            mo7697a();
        }
    }

    /* renamed from: d */
    public final void mo7700d(C2646bh bhVar) {
        boolean z = true;
        C2601a.m6832d(Looper.myLooper() == Looper.getMainLooper());
        if (!(bhVar == null || bhVar.mo6009p() == Looper.getMainLooper())) {
            z = false;
        }
        C2601a.m6830b(z);
        C2646bh bhVar2 = this.f11726c;
        if (bhVar2 != bhVar) {
            if (bhVar2 != null) {
                bhVar2.mo6019z(this.f11737o);
                if (bhVar == null) {
                    mo7704h(false);
                }
            }
            this.f11726c = bhVar;
            if (bhVar != null) {
                bhVar.mo6016w(this.f11737o);
                mo7698b();
            }
        }
    }

    /* renamed from: e */
    public final void mo7701e(int i) {
        if (this.f11718D != i) {
            this.f11718D = i;
            mo7697a();
        }
    }

    /* renamed from: f */
    public final void mo7702f(boolean z) {
        if (this.f11745w != z) {
            this.f11745w = z;
            mo7697a();
        }
    }

    /* renamed from: g */
    public final void mo7703g(C2646bh bhVar, Bitmap bitmap) {
        int i;
        Bitmap bitmap2;
        C1832s sVar;
        C2646bh bhVar2 = bhVar;
        int e = bhVar.mo5998e();
        boolean z = false;
        boolean z2 = (e == 2 || e == 3) && bhVar.mo5987O();
        C1839z zVar = this.f11742t;
        if (bhVar.mo5998e() != 1 || !bhVar.mo6014u().mo6304o()) {
            boolean ar = bhVar2.mo6272ar(7);
            boolean ar2 = bhVar2.mo6272ar(11);
            boolean ar3 = bhVar2.mo6272ar(12);
            boolean ar4 = bhVar2.mo6272ar(9);
            ArrayList arrayList = new ArrayList();
            if (this.f11745w && ar) {
                arrayList.add("androidx.media3.ui.notification.prev");
            }
            if (this.f11747y && ar2) {
                arrayList.add("androidx.media3.ui.notification.rewind");
            }
            if (this.f11715A) {
                if (m10600k(bhVar)) {
                    arrayList.add("androidx.media3.ui.notification.pause");
                } else {
                    arrayList.add("androidx.media3.ui.notification.play");
                }
            }
            if (this.f11748z && ar3) {
                arrayList.add("androidx.media3.ui.notification.ffwd");
            }
            if (this.f11746x && ar4) {
                arrayList.add("androidx.media3.ui.notification.next");
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str = (String) arrayList.get(i2);
                if (this.f11739q.containsKey(str)) {
                    sVar = (C1832s) this.f11739q.get(str);
                } else {
                    sVar = (C1832s) this.f11740r.get(str);
                }
                if (sVar != null) {
                    arrayList2.add(sVar);
                }
            }
            if (zVar == null || !arrayList2.equals(this.f11743u)) {
                zVar = new C1839z(this.f11731i, this.f11732j);
                this.f11743u = arrayList2;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    zVar.mo5017f((C1832s) arrayList2.get(i3));
                }
            }
            C2402b bVar = new C2402b();
            MediaSessionCompat.Token token = this.f11744v;
            if (token != null) {
                bVar.f6643b = token;
            }
            int indexOf = arrayList.indexOf("androidx.media3.ui.notification.pause");
            int indexOf2 = arrayList.indexOf("androidx.media3.ui.notification.play");
            int indexOf3 = this.f11729f ? arrayList.indexOf("androidx.media3.ui.notification.rewind") : -1;
            int indexOf4 = this.f11730g ? arrayList.indexOf("androidx.media3.ui.notification.ffwd") : -1;
            int[] iArr = new int[3];
            if (indexOf3 != -1) {
                iArr[0] = indexOf3;
                i = 1;
            } else {
                i = 0;
            }
            boolean k = m10600k(bhVar);
            if (indexOf != -1 && k) {
                iArr[i] = indexOf;
                i++;
            } else if (indexOf2 != -1 && !k) {
                iArr[i] = indexOf2;
                i++;
            }
            if (indexOf4 != -1) {
                iArr[i] = indexOf4;
                i++;
            }
            bVar.f6642a = Arrays.copyOf(iArr, i);
            zVar.mo5022k(bVar);
            zVar.f5679J.deleteIntent = this.f11741s;
            zVar.f5676G = this.f11716B;
            zVar.mo5015d(2, z2);
            zVar.f5670A = 0;
            zVar.f5703w = this.f11717C;
            zVar.f5704x = true;
            zVar.f5679J.icon = this.f11718D;
            zVar.f5671B = this.f11719E;
            zVar.f5690j = this.f11720F;
            zVar.mo5019h(0);
            int i4 = C2612ak.f7249a;
            if (!this.f11721G || !bhVar.mo6277aw() || bhVar.mo5989Q() || bhVar.mo6273as() || bhVar.mo6012s().f7313b != 1.0f) {
                zVar.f5691k = false;
                zVar.f5692l = false;
            } else {
                zVar.f5679J.when = System.currentTimeMillis() - bhVar.mo6003j();
                zVar.f5691k = true;
                zVar.f5692l = true;
            }
            zVar.f5685e = C1839z.m5037c(this.f11734l.mo7694d(bhVar2));
            zVar.f5686f = C1839z.m5037c(this.f11734l.mo7693c(bhVar2));
            zVar.f5694n = C1839z.m5037c(this.f11734l.mo7695e());
            if (bitmap == null) {
                C3649m mVar = this.f11734l;
                int i5 = this.f11728e + 1;
                this.f11728e = i5;
                bitmap2 = mVar.mo7692b(bhVar2, new C3647k(this, i5));
            } else {
                bitmap2 = bitmap;
            }
            zVar.f5688h = bitmap2;
            zVar.f5687g = this.f11734l.mo7691a(bhVar2);
            String str2 = this.f11722H;
            if (str2 != null) {
                zVar.f5699s = str2;
            }
            zVar.mo5015d(8, true);
        } else {
            this.f11743u = null;
            zVar = null;
        }
        this.f11742t = zVar;
        if (zVar == null) {
            mo7704h(false);
            return;
        }
        Notification a = zVar.mo5013a();
        this.f11735m.mo5003b((String) null, this.f11733k, a);
        if (!this.f11727d) {
            this.f11731i.registerReceiver(this.f11738p, this.f11736n);
        }
        C140836o oVar = this.f11723I;
        if (oVar != null) {
            int i6 = this.f11733k;
            if (z2 || !this.f11727d) {
                z = true;
            }
            C69664n.m101061g(a, "notification");
            C140812at atVar = oVar.f382460a.f382367e;
            C69664n.m101061g(a, "notification");
            if (i6 == 131077) {
                atVar.f382403d = a;
                atVar.f382405f = 2;
                atVar.mo115924a(atVar.f382400a, z);
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.f11727d = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        p5462h.p5472e.C69598b.m101013a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        throw r1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7704h(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.f11727d
            if (r0 == 0) goto L_0x0088
            r0 = 0
            r5.f11727d = r0
            android.os.Handler r1 = r5.f11724a
            r1.removeMessages(r0)
            androidx.core.app.aq r0 = r5.f11735m
            int r1 = r5.f11733k
            android.app.NotificationManager r0 = r0.f5622a
            r2 = 0
            r0.cancel(r2, r1)
            android.content.Context r0 = r5.f11731i
            androidx.media3.ui.n r1 = r5.f11738p
            r0.unregisterReceiver(r1)
            com.google.android.apps.search.podcasts.player.impl.o r0 = r5.f11723I
            if (r0 == 0) goto L_0x0088
            int r1 = r5.f11733k
            com.google.android.apps.search.podcasts.player.impl.an r3 = r0.f382460a
            com.google.android.apps.search.podcasts.player.impl.at r3 = r3.f382367e
            r4 = 131077(0x20005, float:1.83678E-40)
            if (r1 != r4) goto L_0x0080
            int r1 = r3.f382405f
            r4 = 1
            if (r1 == r4) goto L_0x003a
            r3.f382405f = r4
            java.lang.String r1 = r3.f382401b
            java.lang.String r1 = "stop"
            r3.mo115924a(r1, r4)
        L_0x003a:
            if (r6 == 0) goto L_0x0088
            com.google.android.apps.search.podcasts.player.impl.an r6 = r0.f382460a
            com.google.android.apps.search.podcasts.player.impl.at r1 = r6.f382367e
            boolean r1 = r1.f382404e
            if (r1 != 0) goto L_0x0088
            android.content.Context r6 = r6.f382364b
            java.lang.String r1 = "context"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r1)
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 15
            r3 = 3
            if (r1 != r3) goto L_0x0066
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r1 = "android.hardware.type.automotive"
            boolean r6 = r6.hasSystemFeature(r1)
            if (r6 != 0) goto L_0x0088
        L_0x0066:
            com.google.android.apps.search.podcasts.player.impl.an r6 = r0.f382460a
            com.google.apps.tiktok.tracing.dh r6 = r6.f382365c
            java.lang.String r1 = "notification released"
            com.google.apps.tiktok.tracing.ax r6 = r6.mo51613c(r1)
            com.google.android.apps.search.podcasts.player.impl.an r0 = r0.f382460a
            r0.mo115889k(true)     // Catch:{ all -> 0x0079 }
            p5462h.p5472e.C69598b.m101013a(r6, r2)
            return
        L_0x0079:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r0)
            throw r1
        L_0x0080:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r6.<init>(r0)
            throw r6
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p174ui.C3652p.mo7704h(boolean):void");
    }

    /* renamed from: i */
    public final void mo7705i() {
        if (!this.f11746x) {
            this.f11746x = true;
            mo7697a();
        }
    }
}
