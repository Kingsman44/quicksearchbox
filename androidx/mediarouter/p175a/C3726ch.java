package androidx.mediarouter.p175a;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.mediarouter.a.ch */
/* compiled from: PG */
class C3726ch extends C3730cl implements C3689ay, C3694bc {

    /* renamed from: r */
    private static final ArrayList f11962r;

    /* renamed from: s */
    private static final ArrayList f11963s;

    /* renamed from: a */
    protected final Object f11964a;

    /* renamed from: b */
    protected final Object f11965b;

    /* renamed from: c */
    protected final Object f11966c;

    /* renamed from: d */
    protected final Object f11967d;

    /* renamed from: m */
    protected int f11968m;

    /* renamed from: n */
    protected boolean f11969n;

    /* renamed from: o */
    protected boolean f11970o;

    /* renamed from: p */
    protected final ArrayList f11971p = new ArrayList();

    /* renamed from: q */
    protected final ArrayList f11972q = new ArrayList();

    /* renamed from: t */
    private final C3729ck f11973t;

    /* renamed from: u */
    private C3693bb f11974u;

    /* renamed from: v */
    private C3692ba f11975v;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        f11962r = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        f11963s = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public C3726ch(Context context, C3729ck ckVar) {
        super(context);
        this.f11973t = ckVar;
        Object systemService = context.getSystemService("media_router");
        this.f11964a = systemService;
        this.f11965b = mo7848q();
        this.f11966c = new C3695bd(this);
        this.f11967d = ((MediaRouter) systemService).createRouteCategory(context.getResources().getString(R.string.mr_user_route_category_name), false);
        m10767C();
    }

    /* renamed from: B */
    protected static final C3725cg m10766B(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof C3725cg) {
            return (C3725cg) tag;
        }
        return null;
    }

    /* renamed from: C */
    private final void m10767C() {
        mo7856y();
        MediaRouter mediaRouter = (MediaRouter) this.f11964a;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList<Object> arrayList = new ArrayList<>(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        for (Object D : arrayList) {
            z |= m10768D(D);
        }
        if (z) {
            mo7854w();
        }
    }

    /* renamed from: D */
    private final boolean m10768D(Object obj) {
        String str;
        String format;
        if (m10766B(obj) != null || mo7845n(obj) >= 0) {
            return false;
        }
        if (mo7849r() == obj) {
            str = "DEFAULT_ROUTE";
        } else {
            str = String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(mo7850s(obj).hashCode())});
        }
        if (mo7846o(str) >= 0) {
            int i = 2;
            while (true) {
                format = String.format(Locale.US, "%s_%d", new Object[]{str, Integer.valueOf(i)});
                if (mo7846o(format) < 0) {
                    break;
                }
                i++;
            }
            str = format;
        }
        C3724cf cfVar = new C3724cf(obj, str);
        mo7857z(cfVar);
        this.f11971p.add(cfVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo7844A(C3725cg cgVar) {
        ((MediaRouter.UserRouteInfo) cgVar.f11961b).setName(cgVar.f11960a.f11864d);
        ((MediaRouter.UserRouteInfo) cgVar.f11961b).setPlaybackType(cgVar.f11960a.f11870j);
        ((MediaRouter.UserRouteInfo) cgVar.f11961b).setPlaybackStream(cgVar.f11960a.f11871k);
        ((MediaRouter.UserRouteInfo) cgVar.f11961b).setVolume(cgVar.f11960a.f11873m);
        ((MediaRouter.UserRouteInfo) cgVar.f11961b).setVolumeMax(cgVar.f11960a.f11874n);
        ((MediaRouter.UserRouteInfo) cgVar.f11961b).setVolumeHandling(cgVar.f11960a.mo7754a());
    }

    /* renamed from: a */
    public final void mo7779a(Object obj) {
        if (m10768D(obj)) {
            mo7854w();
        }
    }

    /* renamed from: b */
    public final void mo7780b(Object obj) {
        int n;
        if (m10766B(obj) == null && (n = mo7845n(obj)) >= 0) {
            mo7857z((C3724cf) this.f11971p.get(n));
            mo7854w();
        }
    }

    /* renamed from: c */
    public final C3748u mo7823c(String str) {
        int o = mo7846o(str);
        if (o >= 0) {
            return new C3723ce(((C3724cf) this.f11971p.get(o)).f11957a);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo7781d(Object obj) {
        int n;
        if (m10766B(obj) == null && (n = mo7845n(obj)) >= 0) {
            this.f11971p.remove(n);
            mo7854w();
        }
    }

    /* renamed from: e */
    public final void mo7782e(Object obj) {
        int n;
        if (m10766B(obj) == null && (n = mo7845n(obj)) >= 0) {
            C3724cf cfVar = (C3724cf) this.f11971p.get(n);
            int volume = ((MediaRouter.RouteInfo) obj).getVolume();
            if (volume != cfVar.f11959c.mo7888f()) {
                C3738k kVar = new C3738k(cfVar.f11959c);
                kVar.mo7880j(volume);
                cfVar.f11959c = kVar.mo7871a();
                mo7854w();
            }
        }
    }

    /* renamed from: f */
    public final void mo7825f(C3740m mVar) {
        boolean z;
        int i = 0;
        if (mVar != null) {
            mVar.mo7903a();
            List b = mVar.f12011b.mo7925b();
            int size = b.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) b.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            z = mVar.mo7904b();
            i = i2;
        } else {
            z = false;
        }
        if (this.f11968m != i || this.f11969n != z) {
            this.f11968m = i;
            this.f11969n = z;
            m10767C();
        }
    }

    /* renamed from: g */
    public final void mo7783g() {
    }

    /* renamed from: h */
    public final void mo7784h(Object obj) {
        C3685au a;
        if (obj == C3696be.m10712b(this.f11964a)) {
            C3725cg B = m10766B(obj);
            if (B != null) {
                B.f11960a.mo7758e();
                return;
            }
            int n = mo7845n(obj);
            if (n >= 0) {
                C3729ck ckVar = this.f11973t;
                String str = ((C3724cf) this.f11971p.get(n)).f11958b;
                C3679ao aoVar = (C3679ao) ckVar;
                aoVar.f11830l.removeMessages(262);
                C3684at b = aoVar.mo7732b(aoVar.f11821c);
                if (b != null && (a = b.mo7752a(str)) != null) {
                    a.mo7758e();
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo7785i() {
    }

    /* renamed from: j */
    public final void mo7786j() {
    }

    /* renamed from: k */
    public final void mo7795k(Object obj, int i) {
        C3725cg B = m10766B(obj);
        if (B != null) {
            B.f11960a.mo7756c(i);
        }
    }

    /* renamed from: l */
    public final void mo7796l(Object obj, int i) {
        C3725cg B = m10766B(obj);
        if (B != null) {
            B.f11960a.mo7757d(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo7843m(C3724cf cfVar, C3738k kVar) {
        int supportedTypes = ((MediaRouter.RouteInfo) cfVar.f11957a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            kVar.mo7872b(f11962r);
        }
        if ((supportedTypes & 2) != 0) {
            kVar.mo7872b(f11963s);
        }
        kVar.mo7878h(((MediaRouter.RouteInfo) cfVar.f11957a).getPlaybackType());
        kVar.f12004a.putInt("playbackStream", ((MediaRouter.RouteInfo) cfVar.f11957a).getPlaybackStream());
        kVar.mo7880j(((MediaRouter.RouteInfo) cfVar.f11957a).getVolume());
        kVar.mo7882l(((MediaRouter.RouteInfo) cfVar.f11957a).getVolumeMax());
        kVar.mo7881k(((MediaRouter.RouteInfo) cfVar.f11957a).getVolumeHandling());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo7845n(Object obj) {
        int size = this.f11971p.size();
        for (int i = 0; i < size; i++) {
            if (((C3724cf) this.f11971p.get(i)).f11957a == obj) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo7846o(String str) {
        int size = this.f11971p.size();
        for (int i = 0; i < size; i++) {
            if (((C3724cf) this.f11971p.get(i)).f11958b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo7847p(C3685au auVar) {
        int size = this.f11972q.size();
        for (int i = 0; i < size; i++) {
            if (((C3725cg) this.f11972q.get(i)).f11960a == auVar) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Object mo7848q() {
        return new C3690az(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final String mo7850s(Object obj) {
        CharSequence name = ((MediaRouter.RouteInfo) obj).getName(this.f12029e);
        return name != null ? name.toString() : BuildConfig.FLAVOR;
    }

    /* renamed from: t */
    public final void mo7851t(C3685au auVar) {
        C3684at atVar = auVar.f11861a;
        C3687aw.m10684i();
        if (atVar.f11857a != this) {
            MediaRouter.UserRouteInfo createUserRoute = ((MediaRouter) this.f11964a).createUserRoute((MediaRouter.RouteCategory) this.f11967d);
            C3725cg cgVar = new C3725cg(auVar, createUserRoute);
            createUserRoute.setTag(cgVar);
            createUserRoute.setVolumeCallback((MediaRouter.VolumeCallback) this.f11966c);
            mo7844A(cgVar);
            this.f11972q.add(cgVar);
            ((MediaRouter) this.f11964a).addUserRoute(createUserRoute);
            return;
        }
        int n = mo7845n(C3696be.m10712b(this.f11964a));
        if (n >= 0 && ((C3724cf) this.f11971p.get(n)).f11958b.equals(auVar.f11862b)) {
            auVar.mo7758e();
        }
    }

    /* renamed from: u */
    public final void mo7852u(C3685au auVar) {
        int p;
        C3684at atVar = auVar.f11861a;
        C3687aw.m10684i();
        if (atVar.f11857a != this && (p = mo7847p(auVar)) >= 0) {
            C3725cg cgVar = (C3725cg) this.f11972q.remove(p);
            ((MediaRouter.RouteInfo) cgVar.f11961b).setTag((Object) null);
            ((MediaRouter.UserRouteInfo) cgVar.f11961b).setVolumeCallback((MediaRouter.VolumeCallback) null);
            try {
                ((MediaRouter) this.f11964a).removeUserRoute((MediaRouter.UserRouteInfo) cgVar.f11961b);
            } catch (IllegalArgumentException e) {
                Log.w("MediaRouterJellybean", "Failed to remove user route", e);
            }
        }
    }

    /* renamed from: v */
    public final void mo7853v(C3685au auVar) {
        if (auVar.mo7764k()) {
            C3684at atVar = auVar.f11861a;
            C3687aw.m10684i();
            if (atVar.f11857a != this) {
                int p = mo7847p(auVar);
                if (p >= 0) {
                    mo7855x(((C3725cg) this.f11972q.get(p)).f11961b);
                    return;
                }
                return;
            }
            int o = mo7846o(auVar.f11862b);
            if (o >= 0) {
                mo7855x(((C3724cf) this.f11971p.get(o)).f11957a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo7854w() {
        C3750w wVar = new C3750w();
        int size = this.f11971p.size();
        for (int i = 0; i < size; i++) {
            wVar.mo7918b(((C3724cf) this.f11971p.get(i)).f11959c);
        }
        mo7914fk(wVar.mo7917a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7856y() {
        if (this.f11970o) {
            this.f11970o = false;
            C3696be.m10711a(this.f11964a, this.f11965b);
        }
        int i = this.f11968m;
        if (i != 0) {
            this.f11970o = true;
            ((MediaRouter) this.f11964a).addCallback(i, (MediaRouter.Callback) this.f11965b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo7857z(C3724cf cfVar) {
        C3738k kVar = new C3738k(cfVar.f11958b, mo7850s(cfVar.f11957a));
        mo7843m(cfVar, kVar);
        cfVar.f11959c = kVar.mo7871a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo7849r() {
        if (this.f11975v == null) {
            this.f11975v = new C3692ba();
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo7855x(Object obj) {
        if (this.f11974u == null) {
            this.f11974u = new C3693bb();
        }
        throw null;
    }
}
