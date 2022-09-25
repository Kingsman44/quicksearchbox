package androidx.mediarouter.p175a;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: androidx.mediarouter.a.j */
/* compiled from: PG */
final class C3737j extends C3749v {

    /* renamed from: a */
    final MediaRouter2 f11994a;

    /* renamed from: b */
    final C3691b f11995b;

    /* renamed from: c */
    final Map f11996c = new ArrayMap();

    /* renamed from: d */
    public List f11997d = new ArrayList();

    /* renamed from: m */
    private final MediaRouter2.RouteCallback f11998m = new C3735h(this);

    /* renamed from: n */
    private final MediaRouter2.TransferCallback f11999n = new C3736i(this);

    /* renamed from: o */
    private final MediaRouter2.ControllerCallback f12000o = new C3718c(this);

    /* renamed from: p */
    private final Handler f12001p;

    /* renamed from: q */
    private final Executor f12002q;

    /* renamed from: r */
    private final Map f12003r = new ArrayMap();

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public C3737j(Context context, C3691b bVar) {
        super(context, (C3747t) null);
        this.f11994a = MediaRouter2.getInstance(context);
        this.f11995b = bVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f12001p = handler;
        Objects.requireNonNull(handler);
        this.f12002q = new C3664a(handler);
    }

    /* renamed from: a */
    static Messenger m10817a(MediaRouter2.RoutingController routingController) {
        Bundle controlHints;
        if (routingController == null || (controlHints = routingController.getControlHints()) == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    /* renamed from: e */
    static String m10818e(C3748u uVar) {
        MediaRouter2.RoutingController routingController;
        if ((uVar instanceof C3733f) && (routingController = ((C3733f) uVar).f11981b) != null) {
            return routingController.getId();
        }
        return null;
    }

    /* renamed from: c */
    public final C3748u mo7823c(String str) {
        return new C3734g((String) this.f12003r.get(str), (C3733f) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7825f(androidx.mediarouter.p175a.C3740m r13) {
        /*
            r12 = this;
            androidx.mediarouter.a.ao r0 = androidx.mediarouter.p175a.C3687aw.f11884b
            if (r0 != 0) goto L_0x0006
            goto L_0x00ee
        L_0x0006:
            androidx.mediarouter.a.ao r0 = androidx.mediarouter.p175a.C3687aw.m10682b()
            int r0 = r0.f11842x
            if (r0 <= 0) goto L_0x00ee
            boolean r0 = androidx.mediarouter.p175a.C3687aw.m10687q()
            r1 = 0
            if (r13 != 0) goto L_0x001c
            androidx.mediarouter.a.m r13 = new androidx.mediarouter.a.m
            androidx.mediarouter.a.z r2 = androidx.mediarouter.p175a.C3753z.f12042a
            r13.<init>(r2, r1)
        L_0x001c:
            r13.mo7903a()
            androidx.mediarouter.a.z r2 = r13.f12011b
            java.util.List r2 = r2.mo7925b()
            java.lang.String r3 = "android.media.intent.category.LIVE_AUDIO"
            if (r0 == 0) goto L_0x0033
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L_0x0036
            r2.add(r3)
            goto L_0x0036
        L_0x0033:
            r2.remove(r3)
        L_0x0036:
            androidx.mediarouter.a.y r0 = new androidx.mediarouter.a.y
            r0.<init>()
            r0.mo7922b(r2)
            androidx.mediarouter.a.z r0 = r0.mo7921a()
            androidx.mediarouter.a.m r2 = new androidx.mediarouter.a.m
            boolean r13 = r13.mo7904b()
            r2.<init>(r0, r13)
            android.media.MediaRouter2 r13 = r12.f11994a
            java.util.concurrent.Executor r0 = r12.f12002q
            android.media.MediaRouter2$RouteCallback r4 = r12.f11998m
            boolean r5 = r2.mo7905c()
            if (r5 != 0) goto L_0x0067
            android.media.RouteDiscoveryPreference$Builder r2 = new android.media.RouteDiscoveryPreference$Builder
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.<init>(r3, r1)
            android.media.RouteDiscoveryPreference r1 = r2.build()
            goto L_0x00d8
        L_0x0067:
            boolean r5 = r2.mo7904b()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2.mo7903a()
            androidx.mediarouter.a.z r2 = r2.f12011b
            java.util.List r2 = r2.mo7925b()
            java.util.Iterator r2 = r2.iterator()
        L_0x007d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00cf
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = -2065577523(0xffffffff84e1c9cd, float:-5.308257E-36)
            r10 = 2
            r11 = 1
            if (r8 == r9) goto L_0x00b1
            r9 = 956939050(0x3909bb2a, float:1.3135062E-4)
            if (r8 == r9) goto L_0x00a9
            r9 = 975975375(0x3a2c33cf, float:6.5689994E-4)
            if (r8 == r9) goto L_0x009f
            goto L_0x00bb
        L_0x009f:
            java.lang.String r8 = "android.media.intent.category.LIVE_VIDEO"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x00bb
            r8 = 1
            goto L_0x00bc
        L_0x00a9:
            boolean r8 = r7.equals(r3)
            if (r8 == 0) goto L_0x00bb
            r8 = 0
            goto L_0x00bc
        L_0x00b1:
            java.lang.String r8 = "android.media.intent.category.REMOTE_PLAYBACK"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x00bb
            r8 = 2
            goto L_0x00bc
        L_0x00bb:
            r8 = -1
        L_0x00bc:
            if (r8 == 0) goto L_0x00c9
            if (r8 == r11) goto L_0x00c6
            if (r8 == r10) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            java.lang.String r7 = "android.media.route.feature.REMOTE_PLAYBACK"
            goto L_0x00cb
        L_0x00c6:
            java.lang.String r7 = "android.media.route.feature.LIVE_VIDEO"
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r7 = "android.media.route.feature.LIVE_AUDIO"
        L_0x00cb:
            r6.add(r7)
            goto L_0x007d
        L_0x00cf:
            android.media.RouteDiscoveryPreference$Builder r1 = new android.media.RouteDiscoveryPreference$Builder
            r1.<init>(r6, r5)
            android.media.RouteDiscoveryPreference r1 = r1.build()
        L_0x00d8:
            r13.registerRouteCallback(r0, r4, r1)
            android.media.MediaRouter2 r13 = r12.f11994a
            java.util.concurrent.Executor r0 = r12.f12002q
            android.media.MediaRouter2$TransferCallback r1 = r12.f11999n
            r13.registerTransferCallback(r0, r1)
            android.media.MediaRouter2 r13 = r12.f11994a
            java.util.concurrent.Executor r0 = r12.f12002q
            android.media.MediaRouter2$ControllerCallback r1 = r12.f12000o
            r13.registerControllerCallback(r0, r1)
            return
        L_0x00ee:
            android.media.MediaRouter2 r13 = r12.f11994a
            android.media.MediaRouter2$RouteCallback r0 = r12.f11998m
            r13.unregisterRouteCallback(r0)
            android.media.MediaRouter2 r13 = r12.f11994a
            android.media.MediaRouter2$TransferCallback r0 = r12.f11999n
            r13.unregisterTransferCallback(r0)
            android.media.MediaRouter2 r13 = r12.f11994a
            android.media.MediaRouter2$ControllerCallback r0 = r12.f12000o
            r13.unregisterControllerCallback(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.p175a.C3737j.mo7825f(androidx.mediarouter.a.m):void");
    }

    /* renamed from: fi */
    public final C3745r mo7826fi(String str) {
        for (Map.Entry value : this.f11996c.entrySet()) {
            C3733f fVar = (C3733f) value.getValue();
            if (TextUtils.equals(str, fVar.f11980a)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: fj */
    public final C3748u mo7827fj(String str, String str2) {
        String str3;
        String str4 = (String) this.f12003r.get(str);
        for (C3733f fVar : this.f11996c.values()) {
            C3739l lVar = fVar.f11988i;
            if (lVar != null) {
                str3 = lVar.mo7895n();
            } else {
                str3 = fVar.f11981b.getId();
            }
            if (TextUtils.equals(str2, str3)) {
                return new C3734g(str4, fVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C3734g(str4, (C3733f) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo7869g() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.f11994a.getRoutes()) {
            if (mediaRoute2Info != null && !arraySet.contains(mediaRoute2Info) && !mediaRoute2Info.isSystemRoute()) {
                arraySet.add(mediaRoute2Info);
                arrayList.add(mediaRoute2Info);
            }
        }
        if (!arrayList.equals(this.f11997d)) {
            this.f11997d = arrayList;
            this.f12003r.clear();
            for (MediaRoute2Info mediaRoute2Info2 : this.f11997d) {
                Bundle extras = mediaRoute2Info2.getExtras();
                if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                    new StringBuilder("Cannot find the original route Id. route=").append(mediaRoute2Info2);
                    Log.w("MR2Provider", "Cannot find the original route Id. route=".concat(String.valueOf(mediaRoute2Info2)));
                } else {
                    this.f12003r.put(mediaRoute2Info2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
                }
            }
            ArrayList<C3739l> arrayList2 = new ArrayList<>();
            for (MediaRoute2Info mediaRoute2Info3 : this.f11997d) {
                C3739l a = C3686av.m10680a(mediaRoute2Info3);
                if (mediaRoute2Info3 != null) {
                    arrayList2.add(a);
                }
            }
            C3750w wVar = new C3750w();
            wVar.f12037a = true;
            if (!arrayList2.isEmpty()) {
                for (C3739l b : arrayList2) {
                    wVar.mo7918b(b);
                }
            }
            mo7914fk(wVar.mo7917a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo7870h(MediaRouter2.RoutingController routingController) {
        C3738k kVar;
        C3733f fVar = (C3733f) this.f11996c.get(routingController);
        if (fVar == null) {
            new StringBuilder("setDynamicRouteDescriptors: No matching routeController found. routingController=").append(routingController);
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=".concat(String.valueOf(routingController)));
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            new StringBuilder("setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=").append(routingController);
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=".concat(String.valueOf(routingController)));
            return;
        }
        List<String> b = C3686av.m10681b(selectedRoutes);
        C3739l a = C3686av.m10680a((MediaRoute2Info) selectedRoutes.get(0));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f12029e.getString(R.string.mr_dialog_default_group_name);
        C3739l lVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (true != TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    lVar = C3739l.m10837l(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (lVar == null) {
            kVar = new C3738k(routingController.getId(), string);
            kVar.mo7873c(2);
            kVar.mo7878h(1);
        } else {
            kVar = new C3738k(lVar);
        }
        kVar.mo7880j(routingController.getVolume());
        kVar.mo7882l(routingController.getVolumeMax());
        kVar.mo7881k(routingController.getVolumeHandling());
        ArrayList arrayList = kVar.f12006c;
        if (arrayList != null) {
            arrayList.clear();
        }
        a.mo7897p();
        kVar.mo7872b(a.f12009c);
        ArrayList arrayList2 = kVar.f12005b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (!b.isEmpty()) {
            for (String str : b) {
                if (!TextUtils.isEmpty(str)) {
                    if (kVar.f12005b == null) {
                        kVar.f12005b = new ArrayList();
                    }
                    if (!kVar.f12005b.contains(str)) {
                        kVar.f12005b.add(str);
                    }
                } else {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
            }
        }
        C3739l a2 = kVar.mo7871a();
        List b2 = C3686av.m10681b(routingController.getSelectableRoutes());
        List b3 = C3686av.m10681b(routingController.getDeselectableRoutes());
        C3751x xVar = this.f12035k;
        if (xVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        List<C3739l> list = xVar.f12039a;
        if (!list.isEmpty()) {
            for (C3739l lVar2 : list) {
                String n = lVar2.mo7895n();
                if (lVar2 != null) {
                    int i = true != b.contains(n) ? 1 : 3;
                    b2.contains(n);
                    b3.contains(n);
                    arrayList3.add(new C3744q(lVar2, i));
                } else {
                    throw new NullPointerException("descriptor must not be null");
                }
            }
        }
        fVar.f11988i = a2;
        fVar.mo7911k(a2, arrayList3);
    }
}
