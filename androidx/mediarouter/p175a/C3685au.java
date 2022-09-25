package androidx.mediarouter.p175a;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.p060c.C0977g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.mediarouter.a.au */
/* compiled from: PG */
public final class C3685au {

    /* renamed from: a */
    public final C3684at f11861a;

    /* renamed from: b */
    public final String f11862b;

    /* renamed from: c */
    public final String f11863c;

    /* renamed from: d */
    public String f11864d;

    /* renamed from: e */
    public String f11865e;

    /* renamed from: f */
    public Uri f11866f;

    /* renamed from: g */
    public boolean f11867g;

    /* renamed from: h */
    public int f11868h;

    /* renamed from: i */
    public boolean f11869i;

    /* renamed from: j */
    public int f11870j;

    /* renamed from: k */
    public int f11871k;

    /* renamed from: l */
    public int f11872l;

    /* renamed from: m */
    public int f11873m;

    /* renamed from: n */
    public int f11874n;

    /* renamed from: o */
    public int f11875o = -1;

    /* renamed from: p */
    public Bundle f11876p;

    /* renamed from: q */
    C3739l f11877q;

    /* renamed from: r */
    public List f11878r = new ArrayList();

    /* renamed from: s */
    private final ArrayList f11879s = new ArrayList();

    /* renamed from: t */
    private int f11880t;

    /* renamed from: u */
    private IntentSender f11881u;

    /* renamed from: v */
    private Map f11882v;

    public C3685au(C3684at atVar, String str, String str2) {
        this.f11861a = atVar;
        this.f11862b = str;
        this.f11863c = str2;
    }

    /* renamed from: a */
    public final int mo7754a() {
        if (!mo7762i() || C3687aw.m10685n()) {
            return this.f11880t;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d8, code lost:
        if (r3.hasNext() != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00de, code lost:
        if (r4.hasNext() == false) goto L_0x00f0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7755b(androidx.mediarouter.p175a.C3739l r13) {
        /*
            r12 = this;
            androidx.mediarouter.a.l r0 = r12.f11877q
            r1 = 0
            if (r0 == r13) goto L_0x0212
            r12.f11877q = r13
            if (r13 == 0) goto L_0x0212
            java.lang.String r0 = r12.f11864d
            java.lang.String r2 = r13.mo7896o()
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r2)
            r2 = 1
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r13.mo7896o()
            r12.f11864d = r0
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            java.lang.String r3 = r12.f11865e
            java.lang.String r4 = r13.mo7894m()
            boolean r3 = androidx.core.p097i.C1968c.m5305b(r3, r4)
            if (r3 != 0) goto L_0x0032
            java.lang.String r0 = r13.mo7894m()
            r12.f11865e = r0
            r0 = 1
        L_0x0032:
            android.net.Uri r3 = r12.f11866f
            android.net.Uri r4 = r13.mo7892j()
            boolean r3 = androidx.core.p097i.C1968c.m5305b(r3, r4)
            if (r3 != 0) goto L_0x0045
            android.net.Uri r0 = r13.mo7892j()
            r12.f11866f = r0
            r0 = 1
        L_0x0045:
            boolean r3 = r12.f11867g
            boolean r4 = r13.mo7900s()
            if (r3 == r4) goto L_0x0054
            boolean r0 = r13.mo7900s()
            r12.f11867g = r0
            r0 = 1
        L_0x0054:
            int r3 = r12.f11868h
            int r4 = r13.mo7883a()
            if (r3 == r4) goto L_0x0063
            int r0 = r13.mo7883a()
            r12.f11868h = r0
            r0 = 1
        L_0x0063:
            java.util.ArrayList r3 = r12.f11879s
            r13.mo7897p()
            java.util.List r4 = r13.f12009c
            if (r3 != r4) goto L_0x006e
            goto L_0x00f0
        L_0x006e:
            if (r4 != 0) goto L_0x0072
            goto L_0x00e0
        L_0x0072:
            java.util.ListIterator r3 = r3.listIterator()
            java.util.ListIterator r4 = r4.listIterator()
        L_0x007a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d4
            java.lang.Object r5 = r3.next()
            android.content.IntentFilter r5 = (android.content.IntentFilter) r5
            java.lang.Object r6 = r4.next()
            android.content.IntentFilter r6 = (android.content.IntentFilter) r6
            if (r5 == r6) goto L_0x007a
            if (r5 == 0) goto L_0x00e0
            if (r6 == 0) goto L_0x00e0
            int r7 = r5.countActions()
            int r8 = r6.countActions()
            if (r7 != r8) goto L_0x00e0
            r8 = 0
        L_0x00a3:
            if (r8 >= r7) goto L_0x00b6
            java.lang.String r9 = r5.getAction(r8)
            java.lang.String r10 = r6.getAction(r8)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00e0
            int r8 = r8 + 1
            goto L_0x00a3
        L_0x00b6:
            int r7 = r5.countCategories()
            int r8 = r6.countCategories()
            if (r7 != r8) goto L_0x00e0
            r8 = 0
        L_0x00c1:
            if (r8 >= r7) goto L_0x007a
            java.lang.String r9 = r5.getCategory(r8)
            java.lang.String r10 = r6.getCategory(r8)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00e0
            int r8 = r8 + 1
            goto L_0x00c1
        L_0x00d4:
            boolean r3 = r3.hasNext()
            if (r3 != 0) goto L_0x00e0
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x00f0
        L_0x00e0:
            java.util.ArrayList r0 = r12.f11879s
            r0.clear()
            java.util.ArrayList r0 = r12.f11879s
            r13.mo7897p()
            java.util.List r3 = r13.f12009c
            r0.addAll(r3)
            r0 = 1
        L_0x00f0:
            int r3 = r12.f11870j
            int r4 = r13.mo7886d()
            if (r3 == r4) goto L_0x00ff
            int r0 = r13.mo7886d()
            r12.f11870j = r0
            r0 = 1
        L_0x00ff:
            int r3 = r12.f11871k
            int r4 = r13.mo7885c()
            if (r3 == r4) goto L_0x010e
            int r0 = r13.mo7885c()
            r12.f11871k = r0
            r0 = 1
        L_0x010e:
            int r3 = r12.f11872l
            int r4 = r13.mo7884b()
            if (r3 == r4) goto L_0x011d
            int r0 = r13.mo7884b()
            r12.f11872l = r0
            r0 = 1
        L_0x011d:
            int r3 = r12.f11880t
            int r4 = r13.mo7889g()
            r5 = 3
            if (r3 == r4) goto L_0x012d
            int r0 = r13.mo7889g()
            r12.f11880t = r0
            r0 = 3
        L_0x012d:
            int r3 = r12.f11873m
            int r4 = r13.mo7888f()
            if (r3 == r4) goto L_0x013c
            int r0 = r13.mo7888f()
            r12.f11873m = r0
            r0 = 3
        L_0x013c:
            int r3 = r12.f11874n
            int r4 = r13.mo7890h()
            if (r3 == r4) goto L_0x014b
            int r0 = r13.mo7890h()
            r12.f11874n = r0
            goto L_0x014c
        L_0x014b:
            r5 = r0
        L_0x014c:
            int r0 = r12.f11875o
            int r3 = r13.mo7887e()
            if (r0 == r3) goto L_0x015c
            int r0 = r13.mo7887e()
            r12.f11875o = r0
            r5 = r5 | 5
        L_0x015c:
            android.os.Bundle r0 = r12.f11876p
            android.os.Bundle r3 = r13.mo7893k()
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r3)
            if (r0 != 0) goto L_0x0170
            android.os.Bundle r0 = r13.mo7893k()
            r12.f11876p = r0
            r5 = r5 | 1
        L_0x0170:
            android.content.IntentSender r0 = r12.f11881u
            android.content.IntentSender r3 = r13.mo7891i()
            boolean r0 = androidx.core.p097i.C1968c.m5305b(r0, r3)
            if (r0 != 0) goto L_0x0184
            android.content.IntentSender r0 = r13.mo7891i()
            r12.f11881u = r0
            r5 = r5 | 1
        L_0x0184:
            boolean r0 = r12.f11869i
            boolean r3 = r13.mo7899r()
            if (r0 == r3) goto L_0x0194
            boolean r0 = r13.mo7899r()
            r12.f11869i = r0
            r5 = r5 | 5
        L_0x0194:
            r13.mo7898q()
            java.util.List r13 = r13.f12008b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r13.size()
            java.util.List r4 = r12.f11878r
            int r4 = r4.size()
            if (r3 == r4) goto L_0x01ac
            r3 = 1
            goto L_0x01ad
        L_0x01ac:
            r3 = 0
        L_0x01ad:
            boolean r4 = r13.isEmpty()
            if (r4 != 0) goto L_0x020a
            androidx.mediarouter.a.ao r4 = androidx.mediarouter.p175a.C3687aw.m10682b()
            java.util.Iterator r13 = r13.iterator()
        L_0x01bb:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x020a
            java.lang.Object r6 = r13.next()
            java.lang.String r6 = (java.lang.String) r6
            androidx.mediarouter.a.at r7 = r12.f11861a
            androidx.mediarouter.a.t r7 = r7.f11859c
            android.content.ComponentName r7 = r7.f12028a
            java.lang.String r7 = r7.flattenToShortString()
            java.util.Map r8 = r4.f11827i
            androidx.core.i.e r9 = new androidx.core.i.e
            r9.<init>(r7, r6)
            java.lang.Object r6 = r8.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            java.util.ArrayList r7 = r4.f11826h
            int r8 = r7.size()
            r9 = 0
        L_0x01e5:
            if (r9 >= r8) goto L_0x01f8
            java.lang.Object r10 = r7.get(r9)
            androidx.mediarouter.a.au r10 = (androidx.mediarouter.p175a.C3685au) r10
            int r9 = r9 + 1
            java.lang.String r11 = r10.f11863c
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L_0x01e5
            goto L_0x01f9
        L_0x01f8:
            r10 = 0
        L_0x01f9:
            if (r10 == 0) goto L_0x01bb
            r0.add(r10)
            if (r3 != 0) goto L_0x01bb
            java.util.List r6 = r12.f11878r
            boolean r6 = r6.contains(r10)
            if (r6 != 0) goto L_0x01bb
            r3 = 1
            goto L_0x01bb
        L_0x020a:
            if (r3 == 0) goto L_0x0211
            r12.f11878r = r0
            r1 = r5 | 1
            goto L_0x0212
        L_0x0211:
            r1 = r5
        L_0x0212:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3685au.mo7755b(androidx.mediarouter.a.l):int");
    }

    /* renamed from: c */
    public final void mo7756c(int i) {
        C3748u uVar;
        C3748u uVar2;
        C3687aw.m10684i();
        C3679ao b = C3687aw.m10682b();
        int min = Math.min(this.f11874n, Math.max(0, i));
        if (this == b.f11836r && (uVar2 = b.f11837s) != null) {
            uVar2.mo7817b(min);
        } else if (!b.f11840v.isEmpty() && (uVar = (C3748u) b.f11840v.get(this.f11863c)) != null) {
            uVar.mo7817b(min);
        }
    }

    /* renamed from: d */
    public final void mo7757d(int i) {
        C3748u uVar;
        C3748u uVar2;
        C3687aw.m10684i();
        if (i != 0) {
            C3679ao b = C3687aw.m10682b();
            if (this == b.f11836r && (uVar2 = b.f11837s) != null) {
                uVar2.mo7818c(i);
            } else if (!b.f11840v.isEmpty() && (uVar = (C3748u) b.f11840v.get(this.f11863c)) != null) {
                uVar.mo7818c(i);
            }
        }
    }

    /* renamed from: e */
    public final void mo7758e() {
        C3687aw.m10684i();
        C3687aw.m10682b().mo7741k(this, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo7759f(Collection collection) {
        this.f11878r.clear();
        if (this.f11882v == null) {
            this.f11882v = new C0977g();
        }
        this.f11882v.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3744q qVar = (C3744q) it.next();
            C3685au a = this.f11861a.mo7752a(qVar.f12020a.mo7895n());
            if (a != null) {
                this.f11882v.put(a.f11863c, qVar);
                int i = qVar.f12021b;
                if (i == 2 || i == 3) {
                    this.f11878r.add(a);
                }
            }
        }
        C3687aw.m10682b().f11830l.obtainMessage(259, this).sendToTarget();
    }

    /* renamed from: g */
    public final boolean mo7760g() {
        C3687aw.m10684i();
        return C3687aw.m10682b().mo7734d() == this;
    }

    /* renamed from: h */
    public final boolean mo7761h() {
        if (mo7760g() || this.f11872l == 3) {
            return true;
        }
        C3684at atVar = this.f11861a;
        C3687aw.m10684i();
        if (!TextUtils.equals(atVar.f11857a.f12030f.f12028a.getPackageName(), "android") || !mo7766m("android.media.intent.category.LIVE_AUDIO") || mo7766m("android.media.intent.category.LIVE_VIDEO")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo7762i() {
        return Collections.unmodifiableList(this.f11878r).size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo7763j() {
        return this.f11877q != null && this.f11867g;
    }

    /* renamed from: k */
    public final boolean mo7764k() {
        C3687aw.m10684i();
        return C3687aw.m10682b().mo7735e() == this;
    }

    /* renamed from: m */
    public final boolean mo7766m(String str) {
        C3687aw.m10684i();
        int size = this.f11879s.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) this.f11879s.get(i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f11863c);
        sb.append(", name=");
        sb.append(this.f11864d);
        sb.append(", description=");
        sb.append(this.f11865e);
        sb.append(", iconUri=");
        sb.append(this.f11866f);
        sb.append(", enabled=");
        sb.append(this.f11867g);
        sb.append(", connectionState=");
        sb.append(this.f11868h);
        sb.append(", canDisconnect=");
        sb.append(this.f11869i);
        sb.append(", playbackType=");
        sb.append(this.f11870j);
        sb.append(", playbackStream=");
        sb.append(this.f11871k);
        sb.append(", deviceType=");
        sb.append(this.f11872l);
        sb.append(", volumeHandling=");
        sb.append(this.f11880t);
        sb.append(", volume=");
        sb.append(this.f11873m);
        sb.append(", volumeMax=");
        sb.append(this.f11874n);
        sb.append(", presentationDisplayId=");
        sb.append(this.f11875o);
        sb.append(", extras=");
        sb.append(this.f11876p);
        sb.append(", settingsIntent=");
        sb.append(this.f11881u);
        sb.append(", providerPackageName=");
        sb.append(this.f11861a.f11859c.f12028a.getPackageName());
        if (mo7762i()) {
            sb.append(", members=[");
            int size = this.f11878r.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.f11878r.get(i) != this) {
                    sb.append(((C3685au) this.f11878r.get(i)).f11863c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: l */
    public final boolean mo7765l(C3753z zVar) {
        if (zVar != null) {
            C3687aw.m10684i();
            ArrayList<IntentFilter> arrayList = this.f11879s;
            zVar.mo7926c();
            if (zVar.f12044c.isEmpty()) {
                return false;
            }
            for (IntentFilter intentFilter : arrayList) {
                if (intentFilter != null) {
                    for (String hasCategory : zVar.f12044c) {
                        if (intentFilter.hasCategory(hasCategory)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
