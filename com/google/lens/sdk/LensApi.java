package com.google.lens.sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.C84209i;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87740bv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.libraries.lens.p1995c.p1996a.C24076d;
import com.google.android.libraries.lens.p1995c.p1996a.C24077e;
import com.google.android.libraries.lens.p1995c.p1996a.C24078f;
import com.google.android.libraries.lens.p1995c.p1996a.C24081i;
import com.google.android.libraries.lens.p1995c.p1996a.C24083k;
import com.google.android.libraries.lens.p1995c.p1996a.C24091s;
import com.google.android.libraries.lens.p1995c.p1996a.C24092t;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24072c;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62455ce;
import com.google.lens.p4707j.C62470ct;
import com.google.lens.p4707j.C62471cu;

/* compiled from: PG */
public class LensApi {

    /* renamed from: a */
    static final Uri f169109a = Uri.parse("googleapp://lens");

    /* renamed from: b */
    public final C24081i f169110b;

    /* renamed from: c */
    private final C24076d f169111c;

    /* renamed from: d */
    private final KeyguardManager f169112d;

    /* compiled from: PG */
    public interface LensAvailabilityCallback {
        void onAvailabilityStatusFetched(int i);
    }

    /* compiled from: PG */
    public @interface LensAvailabilityStatus {
        public static final int LENS_AVAILABILITY_UNKNOWN = -1;
        public static final int LENS_READY = 0;
        public static final int LENS_UNAVAILABLE = 1;
        public static final int LENS_UNAVAILABLE_AGSA_OUTDATED = 6;
        @Deprecated
        public static final int LENS_UNAVAILABLE_ASSISTANT_EYES_FLAG_DISABLED = 8;
        public static final int LENS_UNAVAILABLE_DEVICE_INCOMPATIBLE = 3;
        public static final int LENS_UNAVAILABLE_DEVICE_LOCKED = 5;
        public static final int LENS_UNAVAILABLE_FEATURE_UNAVAILABLE = 11;
        public static final int LENS_UNAVAILABLE_INVALID_CURSOR = 4;
        @Deprecated
        public static final int LENS_UNAVAILABLE_LOCALE_NOT_SUPPORTED = 2;
        public static final int LENS_UNAVAILABLE_SERVICE_BUSY_FAILURE = 10;
        public static final int LENS_UNAVAILABLE_SERVICE_UNAVAILABLE = 9;
        public static final int LENS_UNAVAILABLE_UNKNOWN_ERROR_CODE = 12;
    }

    /* compiled from: PG */
    public @interface LensFeature {
        public static final int LENS_AR_STICKERS = 1;
        public static final int LENS_CORE = 0;
    }

    /* compiled from: PG */
    public @interface LensLaunchStatus {
        public static final int LAUNCH_FAILURE_UNLOCK_FAILED = 1;
        public static final int LAUNCH_SUCCESS = 0;
    }

    /* compiled from: PG */
    public interface LensLaunchStatusCallback {
        void onLaunchStatusFetched(int i);
    }

    public LensApi(Context context) {
        this.f169112d = (KeyguardManager) context.getSystemService("keyguard");
        C24076d dVar = new C24076d(context, context.getPackageManager());
        this.f169111c = dVar;
        this.f169110b = new C24081i(context, dVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m94826f(LensAvailabilityCallback lensAvailabilityCallback, int i) {
        int i2 = i - 2;
        if (i != 0) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(i2);
            return;
        }
        throw null;
    }

    /* renamed from: g */
    public static /* synthetic */ void m94827g(LensAvailabilityCallback lensAvailabilityCallback, int i) {
        int i2 = i - 2;
        if (i != 0) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(i2);
            return;
        }
        throw null;
    }

    /* renamed from: h */
    private final boolean m94828h(String str) {
        String str2 = this.f169111c.f65770f.f65757c;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String[] split = str2.split("\\.", -1);
        String[] split2 = str.split("\\.", -1);
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt < parseInt2) {
                return true;
            }
            if (parseInt > parseInt2) {
                return false;
            }
        }
        if (split.length < split2.length) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo58515a(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback, Runnable runnable) {
        if (!this.f169112d.isKeyguardLocked()) {
            runnable.run();
            if (lensLaunchStatusCallback != null) {
                lensLaunchStatusCallback.onLaunchStatusFetched(0);
            }
        } else if (activity == null) {
            int i = Build.VERSION.SDK_INT;
            Log.e("LensApi", "Cannot start Lens when device is locked with Android " + i);
            if (lensLaunchStatusCallback != null) {
                lensLaunchStatusCallback.onLaunchStatusFetched(1);
            }
        } else {
            this.f169112d.requestDismissKeyguard(activity, new C62644j(runnable, lensLaunchStatusCallback));
        }
    }

    /* renamed from: b */
    public final void mo58516b(Activity activity) {
        C24081i iVar = this.f169110b;
        C24092t.m44741a();
        if (!iVar.f65778a.mo29483f()) {
            Log.i("LensServiceBridge", "Lens session is not ready for prewarm.");
        } else {
            C87740bv bvVar = (C87740bv) C87741bw.f237477c.createBuilder();
            C87739bu buVar = C87739bu.LENS_SERVICE_WARM_UP_ACTIVITY;
            bvVar.copyOnWrite();
            C87741bw bwVar = (C87741bw) bvVar.instance;
            bwVar.f237480b = buVar.f237476dL;
            bwVar.f237479a |= 1;
            C87741bw bwVar2 = (C87741bw) bvVar.build();
            try {
                C24083k kVar = iVar.f65778a;
                byte[] byteArray = bwVar2.toByteArray();
                C24092t.m44741a();
                C24092t.m44742b(((C24091s) kVar).mo29483f(), "Attempted to use lensServiceSession before ready.");
                C84209i iVar2 = ((C24091s) kVar).f65800i;
                C24092t.m44743c(iVar2);
                iVar2.mo77671e(byteArray);
                Log.i("LensApi", "Lens is pre-warmed.");
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Unable to send prewarm signal.", e);
            }
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(f169109a);
        activity.startActivityForResult(intent, 0);
    }

    /* renamed from: c */
    public final void mo58517c(C62647m mVar) {
        if (!(mVar.mo58542e() == null && mVar.mo58538a() == null && mVar.mo58557r() == null)) {
            C24081i iVar = this.f169110b;
            if (!iVar.mo29475d(mVar.mo58566s(iVar.mo29473b()))) {
                Log.i("LensApi", "Failed to inject image.");
                return;
            }
        }
        C24081i iVar2 = this.f169110b;
        iVar2.mo29473b();
        Bundle t = mVar.mo58567t();
        C24092t.m44741a();
        if (!iVar2.f65778a.mo29483f()) {
            Log.i("LensServiceBridge", "Lens session is not ready.");
        } else {
            C87740bv bvVar = (C87740bv) C87741bw.f237477c.createBuilder();
            C87739bu buVar = C87739bu.LENS_SERVICE_START_ACTIVITY;
            bvVar.copyOnWrite();
            C87741bw bwVar = (C87741bw) bvVar.instance;
            bwVar.f237480b = buVar.f237476dL;
            bwVar.f237479a |= 1;
            try {
                iVar2.f65778a.mo29480b(((C87741bw) bvVar.build()).toByteArray(), new SystemParcelableWrapper(t));
                iVar2.f65778a.mo29481c();
                return;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to start Lens", e);
            }
        }
        Log.e("LensApi", "Failed to start lens.");
    }

    public void checkArStickersAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f169111c.mo29470a(new C62645k(lensAvailabilityCallback, 1));
    }

    public void checkLensAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f169112d.isKeyguardLocked();
        if (m94828h("8.3")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
        } else {
            this.f169111c.mo29470a(new C62645k(lensAvailabilityCallback, 0));
        }
    }

    public void checkPendingIntentAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f169112d.isKeyguardLocked();
        if (m94828h("9.72")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        C24081i iVar = this.f169110b;
        C62640f fVar = new C62640f(lensAvailabilityCallback);
        C24092t.m44741a();
        iVar.mo29476e(new C24078f(iVar, fVar));
    }

    public void checkPostCaptureAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f169112d.isKeyguardLocked();
        if (m94828h("8.19")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        C24081i iVar = this.f169110b;
        C62642h hVar = new C62642h(lensAvailabilityCallback);
        C24092t.m44741a();
        iVar.mo29476e(new C24077e(iVar, hVar));
    }

    /* renamed from: d */
    public final boolean mo58522d(Bitmap bitmap, C62647m mVar) {
        if (bitmap == null) {
            Log.w("LensApi", "launchLensActivityWithBitmap: bitmap should not be null.");
        }
        if (this.f169112d.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        } else if (this.f169110b.mo29477f() != 2) {
            return false;
        } else {
            C62646l g = mVar.mo58545g();
            g.mo58536b(bitmap);
            mo58517c(g.mo58535a());
            return true;
        }
    }

    /* renamed from: e */
    public final boolean mo58523e(C62647m mVar, PendingIntentConsumer pendingIntentConsumer) {
        if (this.f169110b.mo29478g() != 2) {
            return false;
        }
        C24081i iVar = this.f169110b;
        if (!iVar.mo29475d(mVar.mo58566s(iVar.mo29473b()))) {
            Log.i("LensApi", "Failed to inject image.");
        }
        C24081i iVar2 = this.f169110b;
        iVar2.mo29473b();
        Bundle t = mVar.mo58567t();
        C24092t.m44741a();
        iVar2.f65779b = pendingIntentConsumer;
        if (!iVar2.f65778a.mo29483f()) {
            Log.i("LensServiceBridge", "Lens session is not ready.");
        } else {
            C87740bv bvVar = (C87740bv) C87741bw.f237477c.createBuilder();
            C87739bu buVar = C87739bu.LENS_SERVICE_REQUEST_PENDING_INTENT;
            bvVar.copyOnWrite();
            C87741bw bwVar = (C87741bw) bvVar.instance;
            bwVar.f237480b = buVar.f237476dL;
            bwVar.f237479a |= 1;
            try {
                iVar2.f65778a.mo29480b(((C87741bw) bvVar.build()).toByteArray(), new SystemParcelableWrapper(t));
                return true;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to send Lens service client event", e);
            }
        }
        Log.e("LensApi", "Failed to request pending intent.");
        return false;
    }

    @Deprecated
    public void launchLensActivity(Activity activity) {
        mo58515a(activity, (LensLaunchStatusCallback) null, new C62639e(this, activity));
    }

    public boolean launchLensActivityWithBitmap(Bitmap bitmap) {
        if (this.f169112d.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C62635a aVar = new C62635a();
        aVar.f169118f = Long.valueOf(elapsedRealtimeNanos);
        return mo58522d(bitmap, aVar.mo58535a());
    }

    public boolean launchLensActivityWithBitmapForTranslate(Bitmap bitmap) {
        if ((this.f169110b.mo29472a().f237874a & 2) != 0) {
            C62455ce ceVar = (C62455ce) C62471cu.f168676c.createBuilder();
            C62470ct ctVar = C62470ct.f168670e;
            ceVar.copyOnWrite();
            C62471cu cuVar = (C62471cu) ceVar.instance;
            ctVar.getClass();
            cuVar.f168679b = ctVar;
            cuVar.f168678a = 2;
            C62635a aVar = new C62635a();
            aVar.f169120h = Integer.valueOf(C62433bj.SUGGESTION_CHIP_TRANSLATE.f168594ao);
            aVar.f169119g = (C62471cu) ceVar.build();
            return mo58522d(bitmap, aVar.mo58535a());
        }
        Log.e("LensApi", "Translate is not supported.");
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.libraries.lens.c.a.k, android.content.ServiceConnection] */
    public void onPause() {
        C24081i iVar = this.f169110b;
        C24092t.m44741a();
        ? r1 = iVar.f65778a;
        C24092t.m44741a();
        C24091s sVar = r1;
        if (C24091s.m44728l(sVar.f65795d)) {
            C87740bv bvVar = (C87740bv) C87741bw.f237477c.createBuilder();
            C87739bu buVar = C87739bu.END_SESSION;
            bvVar.copyOnWrite();
            C87741bw bwVar = (C87741bw) bvVar.instance;
            bwVar.f237480b = buVar.f237476dL;
            bwVar.f237479a |= 1;
            C87741bw bwVar2 = (C87741bw) bvVar.build();
            try {
                C84209i iVar2 = r1.f65800i;
                C24092t.m44743c(iVar2);
                iVar2.mo77671e(bwVar2.toByteArray());
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceConnImpl", "Unable to end Lens service session.", e);
            }
            sVar.f65800i = null;
            sVar.f65796e = 0;
            sVar.f65797f = null;
            sVar.f65798g = null;
        }
        if (C24091s.m44727k(sVar.f65795d)) {
            try {
                r1.f65793b.unbindService(r1);
            } catch (IllegalArgumentException unused) {
                Log.w("LensServiceConnImpl", "Unable to unbind, service is not registered.");
            }
            sVar.f65799h = null;
        }
        sVar.f65801j = 1;
        sVar.mo29493i(1);
        iVar.f65779b = null;
    }

    public void onResume() {
        C24081i iVar = this.f169110b;
        C24092t.m44741a();
        ((C24091s) iVar.f65778a).mo29494m();
    }

    public boolean requestLensActivityPendingIntent(PendingIntentConsumer pendingIntentConsumer) {
        return mo58523e(new C62635a().mo58535a(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmap(Bitmap bitmap, PendingIntentConsumer pendingIntentConsumer) {
        C62635a aVar = new C62635a();
        aVar.f169114b = bitmap;
        return mo58523e(aVar.mo58535a(), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmapUri(Context context, Uri uri, PendingIntentConsumer pendingIntentConsumer) {
        if (context != null) {
            context.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
        }
        C62635a aVar = new C62635a();
        aVar.f169113a = uri;
        return mo58523e(aVar.mo58535a(), pendingIntentConsumer);
    }

    @Deprecated
    public void launchLensActivity(Activity activity, int i) {
        if (i == 0) {
            mo58515a(activity, (LensLaunchStatusCallback) null, new C62641g(this, activity));
        } else if (i != 1) {
            Log.w("LensApi", "Invalid lens activity: " + i);
        } else {
            int b = C24072c.m44703b(this.f169111c.f65770f.f65759e);
            if (b != 0 && b == 2) {
                Intent intent = new Intent();
                intent.setClassName("com.google.ar.lens", "com.google.vr.apps.ornament.app.MainActivity");
                activity.startActivity(intent);
            }
        }
    }

    public void launchLensActivity(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback) {
        mo58515a(activity, lensLaunchStatusCallback, new C62638d(this, activity, new C62635a().mo58535a()));
    }
}
