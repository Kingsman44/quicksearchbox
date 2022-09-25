package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.mediarouter.p175a.C3687aw;
import com.google.android.gms.cast.framework.internal.C143437ac;
import com.google.android.gms.cast.framework.internal.C143438b;
import com.google.android.gms.cast.framework.internal.C143439c;
import com.google.android.gms.cast.framework.internal.C143441e;
import com.google.android.gms.cast.framework.internal.C143451o;
import com.google.android.gms.cast.framework.internal.C143454r;
import com.google.android.gms.cast.framework.internal.C143461y;
import com.google.android.gms.cast.framework.p10774b.p10775a.C143418a;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143584j;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146021aq;
import com.google.common.base.C58890d;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.cast.framework.e */
/* compiled from: PG */
public final class C143429e {

    /* renamed from: a */
    public static final C143566ae f388948a = new C143566ae("CastContext");

    /* renamed from: b */
    public static final Object f388949b = new Object();

    /* renamed from: c */
    public static volatile C143429e f388950c;

    /* renamed from: d */
    public final Context f388951d;

    /* renamed from: e */
    public final C143549t f388952e;

    /* renamed from: f */
    public final C143410ar f388953f;

    /* renamed from: g */
    public final C143543n f388954g;

    /* renamed from: h */
    public final C143584j f388955h;

    /* renamed from: i */
    final C143438b f388956i;

    /* renamed from: j */
    public final C143437ac f388957j;

    /* renamed from: k */
    private final CastOptions f388958k;

    /* renamed from: l */
    private final C143461y f388959l;

    /* renamed from: m */
    private final C143454r f388960m;

    /* renamed from: n */
    private final List f388961n;

    /* renamed from: o */
    private C143441e f388962o;

    public C143429e(Context context, CastOptions castOptions, List list, C143461y yVar, C143584j jVar) {
        this.f388951d = context;
        this.f388958k = castOptions;
        this.f388959l = yVar;
        this.f388955h = jVar;
        this.f388961n = list;
        this.f388960m = new C143454r(context);
        this.f388957j = yVar.f389015e;
        if (!TextUtils.isEmpty(castOptions.f388829a)) {
            this.f388962o = new C143441e(context, castOptions, yVar);
        } else {
            this.f388962o = null;
        }
        HashMap hashMap = new HashMap();
        C143441e eVar = this.f388962o;
        if (eVar != null) {
            hashMap.put(eVar.f388913b, eVar.f388914c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C143414av avVar = (C143414av) it.next();
                C143919bh.m233971n(avVar, "Additional SessionProvider must not be null.");
                String str = avVar.f388913b;
                C143919bh.m233970m(str, "Category for SessionProvider must not be null or empty string.");
                C143919bh.m233960c(!hashMap.containsKey(str), String.format("SessionProvider for category %s already added", new Object[]{str}));
                hashMap.put(str, avVar.f388914c);
            }
        }
        try {
            C143549t e = C143439c.m232820d(context).mo118648e(new C144166k(context.getApplicationContext()), castOptions, yVar, hashMap);
            this.f388952e = e;
            try {
                this.f388954g = new C143543n(e.mo118855f());
                try {
                    C143410ar arVar = new C143410ar(e.mo118856g(), context);
                    this.f388953f = arVar;
                    new C143566ae("PrecacheManager");
                    C143437ac acVar = this.f388957j;
                    if (acVar != null) {
                        acVar.f388972f = arVar;
                    }
                    C146006ab a = jVar.mo118913a(new String[]{"com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_UPDATE_DEVICES_DELAY_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_DISCOVERY_TIMEOUT_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ZERO_DEVICE_TIMEOUT_MS"});
                    C146014aj ajVar = (C146014aj) a;
                    ajVar.mo122495n(C146013ai.f394700a, C143418a.f388917a);
                    C143438b bVar = new C143438b();
                    this.f388956i = bVar;
                    try {
                        e.mo118857h(bVar);
                        bVar.mo118647e(this.f388960m.f388989b);
                        if (!Collections.unmodifiableList(castOptions.f388840l).isEmpty()) {
                            f388948a.mo118888f("Setting Route Discovery for appIds: ".concat(String.valueOf(String.valueOf(Collections.unmodifiableList(this.f388958k.f388840l)))), new Object[0]);
                            C143454r rVar = this.f388960m;
                            List<String> unmodifiableList = Collections.unmodifiableList(this.f388958k.f388840l);
                            C143566ae aeVar = C143454r.f388988a;
                            int size = unmodifiableList.size();
                            aeVar.mo118884b("SetRouteDiscovery for " + size + " IDs", new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
                            for (String d : unmodifiableList) {
                                linkedHashSet.add(C58890d.m90989d(d));
                            }
                            C143454r.f388988a.mo118884b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(String.valueOf(rVar.f388990c.keySet()))), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (rVar.f388990c) {
                                for (String str2 : linkedHashSet) {
                                    C143451o oVar = (C143451o) rVar.f388990c.get(C58890d.m90989d(str2));
                                    if (oVar != null) {
                                        hashMap2.put(str2, oVar);
                                    }
                                }
                                rVar.f388990c.clear();
                                rVar.f388990c.putAll(hashMap2);
                            }
                            C143454r.f388988a.mo118884b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(String.valueOf(rVar.f388990c.keySet()))), new Object[0]);
                            synchronized (rVar.f388991d) {
                                rVar.f388991d.clear();
                                rVar.f388991d.addAll(linkedHashSet);
                            }
                            rVar.mo118695m();
                        }
                        C146006ab a2 = jVar.mo118913a(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"});
                        C146014aj ajVar2 = (C146014aj) a2;
                        ajVar2.mo122495n(C146013ai.f394700a, new C143416b(this));
                        C146006ab b = jVar.mo118914b(new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        C146014aj ajVar3 = (C146014aj) b;
                        ajVar3.mo122495n(C146013ai.f394700a, new C143427c());
                    } catch (RemoteException e2) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e2);
                    }
                } catch (RemoteException e3) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e3);
                }
            } catch (RemoteException e4) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e4);
            }
        } catch (RemoteException e5) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e5);
        }
    }

    /* renamed from: a */
    public static C143429e m232795a() {
        C143919bh.m233964g("Must be called from the main thread.");
        return f388950c;
    }

    /* renamed from: b */
    public static C143429e m232796b(Context context) {
        C143919bh.m233964g("Must be called from the main thread.");
        try {
            return m232798f(context);
        } catch (RuntimeException e) {
            f388948a.mo118886d("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e);
            return null;
        }
    }

    /* renamed from: e */
    public static C146006ab m232797e(Context context, Executor executor) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (f388950c != null) {
            return C146021aq.m237850d(f388950c);
        }
        Context applicationContext = context.getApplicationContext();
        C143404al g = m232799g(applicationContext);
        CastOptions castOptions = g.getCastOptions(applicationContext);
        C143584j jVar = new C143584j(applicationContext);
        return C146021aq.m237847a(executor, new C143428d(applicationContext, castOptions, g, new C143461y(C3687aw.m10683e(applicationContext), castOptions, jVar), jVar));
    }

    /* renamed from: f */
    public static C143429e m232798f(Context context) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (f388950c == null) {
            synchronized (f388949b) {
                if (f388950c == null) {
                    Context applicationContext = context.getApplicationContext();
                    C143404al g = m232799g(applicationContext);
                    CastOptions castOptions = g.getCastOptions(applicationContext);
                    C143584j jVar = new C143584j(applicationContext);
                    try {
                        f388950c = new C143429e(applicationContext, castOptions, g.getAdditionalSessionProviders(applicationContext), new C143461y(C3687aw.m10683e(applicationContext), castOptions, jVar), jVar);
                    } catch (C143403ak e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f388950c;
    }

    /* renamed from: g */
    private static C143404al m232799g(Context context) {
        try {
            Bundle bundle = C143873c.f389983a.mo119351a(context).mo119347a(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f388948a.mo118886d("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (C143404al) Class.forName(string).asSubclass(C143404al.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    /* renamed from: c */
    public final CastOptions mo118636c() {
        C143919bh.m233964g("Must be called from the main thread.");
        return this.f388958k;
    }

    /* renamed from: d */
    public final C143410ar mo118637d() {
        C143919bh.m233964g("Must be called from the main thread.");
        return this.f388953f;
    }
}
