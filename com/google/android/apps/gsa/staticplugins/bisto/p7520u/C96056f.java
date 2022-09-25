package com.google.android.apps.gsa.staticplugins.bisto.p7520u;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRouter;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.f */
/* compiled from: PG */
public final class C96056f implements AutoCloseable, C89495cg {

    /* renamed from: a */
    public static final C59071e f268937a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.f");

    /* renamed from: b */
    static final Duration f268938b = Duration.ofSeconds(2);

    /* renamed from: c */
    public final C96055e f268939c;

    /* renamed from: d */
    public final C22871g f268940d;

    /* renamed from: e */
    public final C89496ch f268941e;

    /* renamed from: f */
    public final Set f268942f = new HashSet();

    /* renamed from: g */
    public final C96049c f268943g;

    /* renamed from: h */
    public final MediaRouter f268944h;

    /* renamed from: i */
    public final AudioManager f268945i;

    /* renamed from: j */
    public C60870cx f268946j;

    /* renamed from: k */
    private final Context f268947k;

    /* renamed from: l */
    private final C95307m f268948l;

    public C96056f(Context context, C22871g gVar, C89496ch chVar, C95307m mVar, C95850a aVar) {
        C22872h.m42742b(C0826b.class);
        C58976aa aaVar = C58975e.f156826a;
        this.f268947k = context;
        this.f268940d = gVar;
        this.f268941e = chVar;
        this.f268948l = mVar;
        this.f268939c = new C96055e(this);
        this.f268943g = new C96049c(this);
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f268944h = mediaRouter;
        if (mediaRouter == null) {
            C59104x c = f268937a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AudioRouteManagerImpl");
            ((C59052c) ((C59052c) c).mo56372aa(15512)).mo56386p("Unable to get MediaRouter");
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f268945i = audioManager;
        if (audioManager == null) {
            C59104x c2 = f268937a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AudioRouteManagerImpl");
            ((C59052c) ((C59052c) c2).mo56372aa(15511)).mo56386p("Unable to get AudioManager");
        }
        aVar.f268408a.add(this);
    }

    /* renamed from: d */
    private final String m159312d(String str, String str2) {
        try {
            return this.f268947k.getString(Resources.getSystem().getIdentifier(str, "string", "android"));
        } catch (RuntimeException e) {
            C59104x c = f268937a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AudioRouteManagerImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15509)).mo56389s("Unable to get resource: %s", str);
            this.f268948l.mo83543a("AudioRouteManagerImpl", "missing resource: ".concat(str));
            return str2;
        }
    }

    /* renamed from: a */
    public final void mo89919a(C96054d dVar) {
        if (this.f268942f.isEmpty()) {
            C59104x c = f268937a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AudioRouteManagerImpl");
            ((C59052c) ((C59052c) c).mo56372aa(15514)).mo56386p("unregisterCallback when no callback registered");
            return;
        }
        if (!this.f268942f.remove(dVar)) {
            C59104x c2 = f268937a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AudioRouteManagerImpl");
            ((C59052c) ((C59052c) c2).mo56372aa(15513)).mo56386p("Callback was not registered");
        }
        if (this.f268942f.isEmpty()) {
            this.f268941e.mo83379U(this);
            MediaRouter mediaRouter = this.f268944h;
            if (mediaRouter != null) {
                mediaRouter.removeCallback(this.f268939c);
            }
            C60870cx cxVar = this.f268946j;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
            C96049c cVar = this.f268943g;
            if (cVar != null) {
                cVar.f268928a = true;
            }
            AudioManager audioManager = this.f268945i;
            if (audioManager != null) {
                cVar.getClass();
                audioManager.unregisterAudioDeviceCallback(cVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo89920b() {
        boolean z;
        String str;
        C58976aa aaVar = C58975e.f156826a;
        MediaRouter mediaRouter = this.f268944h;
        if (mediaRouter == null) {
            C59104x c = f268937a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AudioRouteManagerImpl");
            ((C59052c) ((C59052c) c).mo56372aa(15517)).mo56386p("Null mediaRouter");
            return;
        }
        MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
        selectedRoute.getName();
        boolean z2 = selectedRoute.getPlaybackType() == 0;
        for (C96054d dVar : this.f268942f) {
            if (selectedRoute.getDeviceType() != 3) {
                if (selectedRoute.getName() != null) {
                    CharSequence name = selectedRoute.getName();
                    name.getClass();
                    if (C58890d.m90990e(name.toString(), m159312d("default_audio_route_name", "Phone"))) {
                        AudioManager audioManager = this.f268945i;
                        if (audioManager != null) {
                            AudioDeviceInfo[] devices = audioManager.getDevices(2);
                            int length = devices.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                AudioDeviceInfo audioDeviceInfo = devices[i];
                                if (audioDeviceInfo.getType() == 8) {
                                    try {
                                        str = (String) AudioDeviceInfo.class.getMethod("getAddress", new Class[0]).invoke(audioDeviceInfo, new Object[0]);
                                    } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                                        str = null;
                                    }
                                    str.getClass();
                                    if (C58890d.m90990e("FA:CE:FA:CE:FA:CE", str)) {
                                        break;
                                    }
                                }
                                i++;
                            }
                        }
                        z = false;
                        dVar.mo89849io(selectedRoute, z, mo89921c(selectedRoute), z2);
                    }
                }
                C59104x b = f268937a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AudioRouteManagerImpl");
                ((C59052c) ((C59052c) b).mo56372aa(15518)).mo56386p("Not phone route");
                z = false;
                dVar.mo89849io(selectedRoute, z, mo89921c(selectedRoute), z2);
            }
            z = true;
            dVar.mo89849io(selectedRoute, z, mo89921c(selectedRoute), z2);
        }
    }

    /* renamed from: c */
    public final boolean mo89921c(MediaRouter.RouteInfo routeInfo) {
        if (routeInfo.getName() == null) {
            return false;
        }
        CharSequence name = routeInfo.getName();
        name.getClass();
        return C58890d.m90990e(name.toString(), m159312d("default_audio_route_name_usb", "USB"));
    }

    public final void close() {
        Iterator it = new HashSet(this.f268942f).iterator();
        while (it.hasNext()) {
            mo89919a((C96054d) it.next());
        }
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        this.f268940d.mo28212l("updateRoute", new C95876a(this));
    }
}
