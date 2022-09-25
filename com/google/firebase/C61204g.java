package com.google.firebase;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.core.p094f.C1902o;
import androidx.p060c.C0977g;
import com.google.android.gms.common.api.internal.C143823l;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144003c;
import com.google.android.gms.common.util.C144014n;
import com.google.firebase.components.C61151e;
import com.google.firebase.components.C61153g;
import com.google.firebase.components.C61161o;
import com.google.firebase.components.C61162p;
import com.google.firebase.components.C61172z;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.p4610c.C61133g;
import com.google.firebase.p4611d.C61174a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.g */
/* compiled from: PG */
public final class C61204g {

    /* renamed from: a */
    public static final Object f165553a = new Object();

    /* renamed from: b */
    public static final Map f165554b = new C0977g();

    /* renamed from: c */
    public final Context f165555c;

    /* renamed from: d */
    public final String f165556d;

    /* renamed from: e */
    public final C61269n f165557e;

    /* renamed from: f */
    public final C61162p f165558f;

    /* renamed from: g */
    public final AtomicBoolean f165559g = new AtomicBoolean(false);

    /* renamed from: h */
    public final C61172z f165560h;

    /* renamed from: i */
    public final C61174a f165561i;

    /* renamed from: j */
    public final List f165562j = new CopyOnWriteArrayList();

    /* renamed from: k */
    private final AtomicBoolean f165563k = new AtomicBoolean();

    static {
        int i = C61192e.f165537a;
    }

    protected C61204g(Context context, String str, C61269n nVar) {
        List<String> list;
        new CopyOnWriteArrayList();
        C143919bh.m233958a(context);
        this.f165555c = context;
        C143919bh.m233969l(str);
        this.f165556d = str;
        C143919bh.m233958a(nVar);
        this.f165557e = nVar;
        ArrayList arrayList = new ArrayList();
        Class<ComponentDiscoveryService> cls = ComponentDiscoveryService.class;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    String obj = cls.toString();
                    Log.w("ComponentDiscovery", obj + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            list = Collections.emptyList();
        } else {
            list = new ArrayList<>();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    list.add(str2.substring(31));
                }
            }
        }
        for (String gVar : list) {
            arrayList.add(new C61153g(gVar));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add(new C61161o(new FirebaseCommonRegistrar()));
        arrayList3.add(C61151e.m93516c(context, Context.class, new Class[0]));
        arrayList3.add(C61151e.m93516c(this, C61204g.class, new Class[0]));
        arrayList3.add(C61151e.m93516c(nVar, C61269n.class, new Class[0]));
        C61162p pVar = new C61162p(arrayList2, arrayList3);
        this.f165558f = pVar;
        this.f165560h = new C61172z(new C61122b(this, context));
        this.f165561i = pVar.mo57713c(C61133g.class);
        C61126c cVar = new C61126c(this);
        mo57770f();
        if (this.f165559g.get()) {
            C143823l.f389880a.f389881b.get();
        }
        this.f165562j.add(cVar);
    }

    /* renamed from: a */
    public static C61204g m93577a() {
        C61204g gVar;
        synchronized (f165553a) {
            gVar = (C61204g) f165554b.get("[DEFAULT]");
            if (gVar == null) {
                String a = C144014n.m234194a();
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + a + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return gVar;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public static com.google.firebase.C61204g m93578b(java.lang.String r4) {
        /*
            java.lang.Object r0 = f165553a
            monitor-enter(r0)
            java.util.Map r1 = f165554b     // Catch:{ all -> 0x007d }
            java.lang.String r2 = r4.trim()     // Catch:{ all -> 0x007d }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x007d }
            com.google.firebase.g r2 = (com.google.firebase.C61204g) r2     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x001e
            com.google.firebase.d.a r4 = r2.f165561i     // Catch:{ all -> 0x007d }
            java.lang.Object r4 = r4.mo57687a()     // Catch:{ all -> 0x007d }
            com.google.firebase.c.g r4 = (com.google.firebase.p4610c.C61133g) r4     // Catch:{ all -> 0x007d }
            r4.mo57700c()     // Catch:{ all -> 0x007d }
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            return r2
        L_0x001e:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x007d }
            r2.<init>()     // Catch:{ all -> 0x007d }
            monitor-enter(r0)     // Catch:{ all -> 0x007d }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x007a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x007a }
        L_0x002c:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x007a }
            com.google.firebase.g r3 = (com.google.firebase.C61204g) r3     // Catch:{ all -> 0x007a }
            r3.mo57770f()     // Catch:{ all -> 0x007a }
            java.lang.String r3 = r3.f165556d     // Catch:{ all -> 0x007a }
            r2.add(r3)     // Catch:{ all -> 0x007a }
            goto L_0x002c
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            java.util.Collections.sort(r2)     // Catch:{ all -> 0x007d }
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = ""
            goto L_0x0065
        L_0x004e:
            java.lang.String r1 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r1, r2)     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r2.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r3 = "Available app names: "
            r2.append(r3)     // Catch:{ all -> 0x007d }
            r2.append(r1)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007d }
        L_0x0065:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
            r3 = 0
            r2[r3] = r4     // Catch:{ all -> 0x007d }
            r4 = 1
            r2[r4] = r1     // Catch:{ all -> 0x007d }
            java.lang.String r4 = "FirebaseApp with name %s doesn't exist. %s"
            java.lang.String r4 = java.lang.String.format(r4, r2)     // Catch:{ all -> 0x007d }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007d }
            r1.<init>(r4)     // Catch:{ all -> 0x007d }
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            throw r4     // Catch:{ all -> 0x007d }
        L_0x007d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x0080:
            throw r4
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.C61204g.m93578b(java.lang.String):com.google.firebase.g");
    }

    /* renamed from: c */
    public static C61204g m93579c(Context context, C61269n nVar, String str) {
        C61204g gVar;
        AtomicReference atomicReference = C61173d.f165514a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (C61173d.f165514a.get() == null) {
                C61173d dVar = new C61173d();
                AtomicReference atomicReference2 = C61173d.f165514a;
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, dVar)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    } else {
                        C143823l.m233745b(application);
                        C143823l.f389880a.mo119264a(dVar);
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f165553a) {
            Map map = f165554b;
            C143919bh.m233967j(!map.containsKey(trim), "FirebaseApp name " + trim + " already exists!");
            C143919bh.m233971n(context, "Application context cannot be null.");
            gVar = new C61204g(context, trim, nVar);
            map.put(trim, gVar);
        }
        gVar.mo57771g();
        return gVar;
    }

    /* renamed from: d */
    public final Object mo57767d(Class cls) {
        mo57770f();
        return this.f165558f.mo57710a(cls);
    }

    /* renamed from: e */
    public final String mo57768e() {
        mo57770f();
        String a = C144003c.m234182a(this.f165556d.getBytes(Charset.defaultCharset()));
        mo57770f();
        String a2 = C144003c.m234182a(this.f165557e.f165714b.getBytes(Charset.defaultCharset()));
        return a + "+" + a2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C61204g)) {
            return false;
        }
        String str = this.f165556d;
        C61204g gVar = (C61204g) obj;
        gVar.mo57770f();
        return str.equals(gVar.f165556d);
    }

    /* renamed from: f */
    public final void mo57770f() {
        C143919bh.m233967j(!this.f165563k.get(), "FirebaseApp was deleted");
    }

    /* renamed from: g */
    public final void mo57771g() {
        HashMap hashMap;
        if (!C1902o.m5170a(this.f165555c)) {
            mo57770f();
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(String.valueOf(this.f165556d)));
            Context context = this.f165555c;
            if (C61194f.f165542a.get() == null) {
                C61194f fVar = new C61194f(context);
                AtomicReference atomicReference = C61194f.f165542a;
                while (!atomicReference.compareAndSet((Object) null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        mo57770f();
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app ".concat(String.valueOf(this.f165556d)));
        C61162p pVar = this.f165558f;
        boolean h = mo57772h();
        AtomicReference atomicReference2 = pVar.f165495b;
        Boolean valueOf = Boolean.valueOf(h);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (pVar) {
                    hashMap = new HashMap(pVar.f165494a);
                }
                pVar.mo57723e(hashMap, h);
                break;
            }
        }
        ((C61133g) this.f165561i.mo57687a()).mo57700c();
    }

    /* renamed from: h */
    public final boolean mo57772h() {
        mo57770f();
        return "[DEFAULT]".equals(this.f165556d);
    }

    public final int hashCode() {
        return this.f165556d.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("name", this.f165556d, arrayList);
        C143910az.m233947b("options", this.f165557e, arrayList);
        return C143910az.m233946a(arrayList, this);
    }
}
