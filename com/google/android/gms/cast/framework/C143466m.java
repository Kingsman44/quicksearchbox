package com.google.android.gms.cast.framework;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.p031v4.media.C0329x;
import android.support.p031v4.media.session.C0324z;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.mediarouter.p175a.C3703bl;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.C143354al;
import com.google.android.gms.cast.C143379f;
import com.google.android.gms.cast.C143556g;
import com.google.android.gms.cast.C143601j;
import com.google.android.gms.cast.C143603l;
import com.google.android.gms.cast.C143610s;
import com.google.android.gms.cast.C143611t;
import com.google.android.gms.cast.C143615x;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.internal.C143437ac;
import com.google.android.gms.cast.framework.internal.C143439c;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.internal.C143509b;
import com.google.android.gms.cast.framework.media.internal.C143519l;
import com.google.android.gms.cast.framework.media.internal.C143521n;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.cast.internal.C143587m;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.googlequicksearchbox.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.m */
/* compiled from: PG */
public final class C143466m extends C143409aq {

    /* renamed from: a */
    public static final C143566ae f389020a = new C143566ae("CastSession");

    /* renamed from: b */
    public final Set f389021b = new HashSet();

    /* renamed from: c */
    public final C143551v f389022c;

    /* renamed from: d */
    public C143603l f389023d;

    /* renamed from: e */
    public C143500bf f389024e;

    /* renamed from: h */
    private final Context f389025h;

    /* renamed from: i */
    private final CastOptions f389026i;

    /* renamed from: j */
    private final C143521n f389027j;

    /* renamed from: k */
    private CastDevice f389028k;

    /* renamed from: l */
    private C143437ac f389029l;

    public C143466m(Context context, String str, String str2, CastOptions castOptions, C143521n nVar) {
        super(context, str, str2);
        this.f389025h = context.getApplicationContext();
        this.f389026i = castOptions;
        this.f389027j = nVar;
        this.f389022c = C143439c.m232817a(context, castOptions, mo118618n(), new C143463j(this));
    }

    /* renamed from: q */
    private final void m232909q(Bundle bundle) {
        CastDevice a = CastDevice.m232553a(bundle);
        this.f389028k = a;
        if (a == null) {
            C143919bh.m233964g("Must be called from the main thread.");
            C143394ab abVar = this.f388905g;
            if (abVar != null) {
                try {
                    if (abVar.mo118574k()) {
                        C143394ab abVar2 = this.f388905g;
                        if (abVar2 != null) {
                            try {
                                abVar2.mo118575l();
                                return;
                            } catch (RemoteException e) {
                                C143409aq.f388903f.mo118885c(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", C143394ab.class.getSimpleName());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } catch (RemoteException e2) {
                    C143409aq.f388903f.mo118885c(e2, "Unable to call %s on %s.", "isResuming", C143394ab.class.getSimpleName());
                }
            }
            C143394ab abVar3 = this.f388905g;
            if (abVar3 != null) {
                try {
                    abVar3.mo118576m();
                } catch (RemoteException e3) {
                    C143409aq.f388903f.mo118885c(e3, "Unable to call %s on %s.", "notifyFailedToStartSession", C143394ab.class.getSimpleName());
                }
            }
        } else {
            C143603l lVar = this.f389023d;
            NotificationOptions notificationOptions = null;
            if (lVar != null) {
                lVar.mo118486e();
                this.f389023d = null;
            }
            f389020a.mo118884b("Acquiring a connection to Google Play Services for %s", this.f389028k);
            CastDevice castDevice = this.f389028k;
            C143919bh.m233958a(castDevice);
            Bundle bundle2 = new Bundle();
            CastOptions castOptions = this.f389026i;
            CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.f388834f;
            if (castMediaOptions != null) {
                notificationOptions = castMediaOptions.f389033c;
            }
            boolean z = castMediaOptions != null && castMediaOptions.f389034d;
            Intent intent = new Intent(this.f389025h, C3703bl.class);
            intent.setPackage(this.f389025h.getPackageName());
            boolean z2 = !this.f389025h.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", notificationOptions != null);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", z2);
            C143379f fVar = new C143379f(castDevice, new C143464k(this));
            fVar.f388828c = bundle2;
            C143603l a2 = C143601j.m233284a(this.f389025h, new C143556g(fVar));
            ((C143354al) a2).f388799u.add(new C143465l(this));
            this.f389023d = a2;
            C143354al alVar = (C143354al) a2;
            C143847s sVar = (C143847s) a2;
            C143784ce b = C143785cf.m233680b(alVar.f388780b, sVar.f389927B, "castDeviceControllerListenerKey");
            C143796cq cqVar = new C143796cq();
            C143611t tVar = new C143611t(alVar);
            C143615x xVar = C143615x.f389388a;
            cqVar.f389833c = b;
            cqVar.f389831a = tVar;
            cqVar.f389832b = xVar;
            cqVar.f389834d = new Feature[]{C143610s.f389366b};
            cqVar.f389836f = 8428;
            sVar.mo119291v(cqVar.mo119255a());
        }
    }

    /* renamed from: a */
    public final long mo118611a() {
        C143919bh.m233964g("Must be called from the main thread.");
        C143500bf bfVar = this.f389024e;
        if (bfVar == null) {
            return 0;
        }
        return bfVar.mo118777e() - this.f389024e.mo118776d();
    }

    /* renamed from: b */
    public final CastDevice mo118719b() {
        C143919bh.m233964g("Must be called from the main thread.");
        return this.f389028k;
    }

    /* renamed from: c */
    public final C143500bf mo118720c() {
        C143919bh.m233964g("Must be called from the main thread.");
        return this.f389024e;
    }

    /* renamed from: d */
    public final synchronized void mo118721d(C143437ac acVar) {
        this.f389029l = acVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo118612f(boolean z) {
        C143551v vVar = this.f389022c;
        if (vVar != null) {
            try {
                vVar.mo118862i(z);
            } catch (RemoteException e) {
                f389020a.mo118885c(e, "Unable to call %s on %s.", "disconnectFromDevice", C143551v.class.getSimpleName());
            }
            mo118619o(0);
            mo118723g();
        }
    }

    /* renamed from: g */
    public final void mo118723g() {
        C143437ac acVar = this.f389029l;
        if (acVar == null) {
            return;
        }
        if (acVar.f388971e != 0) {
            SessionState sessionState = acVar.f388974h;
            if (sessionState == null) {
                C143437ac.f388967a.mo118884b("No need to notify with null sessionState", new Object[0]);
            } else {
                C143437ac.f388967a.mo118884b("notify transferred with type = %d, sessionState = %s", 1, sessionState);
                for (C143415aw c : new HashSet(acVar.f388968b)) {
                    c.mo118550c(acVar.f388971e);
                }
            }
            acVar.mo118642c();
            return;
        }
        C143437ac.f388967a.mo118884b("No need to notify non remote-to-local transfer", new Object[0]);
    }

    /* renamed from: h */
    public final void mo118724h(String str, C146006ab abVar) {
        if (this.f389022c != null) {
            try {
                if (abVar.mo122491j()) {
                    C143587m mVar = (C143587m) abVar.mo122488g();
                    if (mVar.f389321a.mo119097c()) {
                        f389020a.mo118884b("%s() -> success result", str);
                        C143500bf bfVar = new C143500bf(new C143572ak());
                        this.f389024e = bfVar;
                        bfVar.mo118787o(this.f389023d);
                        this.f389024e.mo118785m();
                        C143521n nVar = this.f389027j;
                        C143500bf bfVar2 = this.f389024e;
                        CastDevice b = mo118719b();
                        CastOptions castOptions = nVar.f389157c;
                        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.f388834f;
                        if (!(nVar.f389169o || castOptions == null || castMediaOptions == null || nVar.f389160f == null || bfVar2 == null || b == null)) {
                            if (nVar.f389161g != null) {
                                nVar.f389165k = bfVar2;
                                nVar.f389165k.mo118786n(nVar.f389164j);
                                nVar.f389166l = b;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.setComponent(nVar.f389161g);
                                PendingIntent broadcast = PendingIntent.getBroadcast(nVar.f389156b, 0, intent, 67108864);
                                if (castMediaOptions.f389035e) {
                                    MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(nVar.f389156b, "CastMediaSession", nVar.f389161g, broadcast);
                                    nVar.f389167m = mediaSessionCompat;
                                    nVar.mo118820f(0, (MediaInfo) null);
                                    CastDevice castDevice = nVar.f389166l;
                                    if (castDevice != null && !TextUtils.isEmpty(castDevice.f388602d)) {
                                        C0329x xVar = new C0329x();
                                        xVar.mo1093d("android.media.metadata.ALBUM_ARTIST", nVar.f389156b.getResources().getString(R.string.cast_casting_to_device, new Object[]{nVar.f389166l.f388602d}));
                                        mediaSessionCompat.mo875g(xVar.mo1090a());
                                    }
                                    nVar.f389168n = new C143519l(nVar);
                                    mediaSessionCompat.mo873e(nVar.f389168n, (Handler) null);
                                    mediaSessionCompat.mo872d(true);
                                    nVar.f389158d.f389012b.mo7776l(mediaSessionCompat);
                                }
                                nVar.f389169o = true;
                                nVar.mo118821g();
                            }
                        }
                        C143551v vVar = this.f389022c;
                        ApplicationMetadata applicationMetadata = mVar.f389322b;
                        C143919bh.m233958a(applicationMetadata);
                        String str2 = mVar.f389323c;
                        String str3 = mVar.f389324d;
                        C143919bh.m233958a(str3);
                        vVar.mo118858e(applicationMetadata, str2, str3, mVar.f389325e);
                        return;
                    }
                    f389020a.mo118884b("%s() -> failure result", str);
                    this.f389022c.mo118859f(mVar.f389321a.f389621g);
                    return;
                }
                Exception f = abVar.mo122487f();
                if (f instanceof C143842n) {
                    this.f389022c.mo118859f(((C143842n) f).f389919a.f389621g);
                } else {
                    this.f389022c.mo118859f(2476);
                }
            } catch (RemoteException e) {
                f389020a.mo118885c(e, "Unable to call %s on %s.", "methods", C143551v.class.getSimpleName());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo118613i(Bundle bundle) {
        this.f389028k = CastDevice.m232553a(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo118614j(Bundle bundle) {
        this.f389028k = CastDevice.m232553a(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo118615k(Bundle bundle) {
        m232909q(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo118616l(Bundle bundle) {
        m232909q(bundle);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = r5.f389028k;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118617m(android.os.Bundle r6) {
        /*
            r5 = this;
            com.google.android.gms.cast.CastDevice r6 = com.google.android.gms.cast.CastDevice.m232553a(r6)
            if (r6 == 0) goto L_0x0072
            com.google.android.gms.cast.CastDevice r0 = r5.f389028k
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = r6.f388602d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0028
            com.google.android.gms.cast.CastDevice r0 = r5.f389028k
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = r0.f388602d
            java.lang.String r3 = r6.f388602d
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r5.f389028k = r6
            com.google.android.gms.cast.internal.ae r3 = f389020a
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            if (r2 == r0) goto L_0x0037
            java.lang.String r6 = "unchanged"
            goto L_0x0039
        L_0x0037:
            java.lang.String r6 = "changed"
        L_0x0039:
            r4[r2] = r6
            java.lang.String r6 = "update to device (%s) with name %s"
            r3.mo118884b(r6, r4)
            if (r0 == 0) goto L_0x0072
            com.google.android.gms.cast.CastDevice r6 = r5.f389028k
            if (r6 == 0) goto L_0x0072
            com.google.android.gms.cast.framework.media.internal.n r0 = r5.f389027j
            if (r0 == 0) goto L_0x005a
            com.google.android.gms.cast.internal.ae r3 = com.google.android.gms.cast.framework.media.internal.C143521n.f389155a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            java.lang.String r1 = "update Cast device to %s"
            r3.mo118884b(r1, r2)
            r0.f389166l = r6
            r0.mo118821g()
        L_0x005a:
            java.util.HashSet r6 = new java.util.HashSet
            java.util.Set r0 = r5.f389021b
            r6.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x0065:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r6.next()
            com.google.android.gms.cast.h r0 = (com.google.android.gms.cast.C143557h) r0
            goto L_0x0065
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.C143466m.mo118617m(android.os.Bundle):void");
    }

    /* renamed from: e */
    public final void mo118722e(int i) {
        C143521n nVar = this.f389027j;
        if (nVar.f389169o) {
            nVar.f389169o = false;
            C143500bf bfVar = nVar.f389165k;
            if (bfVar != null) {
                bfVar.mo118790r(nVar.f389164j);
            }
            nVar.f389158d.f389012b.mo7776l((MediaSessionCompat) null);
            C143509b bVar = nVar.f389162h;
            if (bVar != null) {
                bVar.mo118808a();
                bVar.f389142d = null;
            }
            C143509b bVar2 = nVar.f389163i;
            if (bVar2 != null) {
                bVar2.mo118808a();
                bVar2.f389142d = null;
            }
            MediaSessionCompat mediaSessionCompat = nVar.f389167m;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.mo873e((C0324z) null, (Handler) null);
                nVar.f389167m.mo875g(new C0329x().mo1090a());
                nVar.mo118820f(0, (MediaInfo) null);
            }
            MediaSessionCompat mediaSessionCompat2 = nVar.f389167m;
            if (mediaSessionCompat2 != null) {
                mediaSessionCompat2.mo872d(false);
                nVar.f389167m.mo871c();
                nVar.f389167m = null;
            }
            nVar.f389165k = null;
            nVar.f389166l = null;
            nVar.f389168n = null;
            nVar.mo118818d();
            if (i == 0) {
                nVar.mo118819e();
            }
        }
        C143603l lVar = this.f389023d;
        if (lVar != null) {
            lVar.mo118486e();
            this.f389023d = null;
        }
        this.f389028k = null;
        C143500bf bfVar2 = this.f389024e;
        if (bfVar2 != null) {
            bfVar2.mo118787o((C143603l) null);
            this.f389024e = null;
        }
    }
}
