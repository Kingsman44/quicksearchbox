package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.StrictMode;
import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.AdError;
import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p367v3.api.AdsLoader;
import com.google.ads.interactivemedia.p367v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.p367v3.api.AdsRequest;
import com.google.ads.interactivemedia.p367v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.p367v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p367v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.StreamRequest;
import com.google.ads.interactivemedia.p367v3.impl.data.C6728au;
import com.google.ads.interactivemedia.p367v3.impl.data.TestingConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alv */
/* compiled from: PG */
public final class alv implements AdsLoader {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f20911a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ane f20912b;

    /* renamed from: c */
    private final ana f20913c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final amo f20914d;

    /* renamed from: e */
    private final List f20915e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map f20916f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map f20917g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final anr f20918h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ImaSdkSettings f20919i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final TestingConfiguration f20920j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final StreamDisplayContainer f20921k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final AdDisplayContainer f20922l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Object f20923m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public apk f20924n;

    public alv(Context context, Uri uri, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer, TestingConfiguration testingConfiguration) {
        this(new ane(context, uri, imaSdkSettings, testingConfiguration), context, imaSdkSettings, testingConfiguration, adDisplayContainer, (StreamDisplayContainer) null);
        this.f20912b.mo14995a();
    }

    /* renamed from: e */
    static /* synthetic */ C6728au m18957e(alv alv) {
        Context context = alv.f20911a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(String.valueOf(context.getPackageName()).concat("_preferences"), 0);
        if (sharedPreferences == null) {
            return null;
        }
        try {
            return C6728au.create(sharedPreferences.contains("IABTCF_gdprApplies") ? String.valueOf(sharedPreferences.getInt("IABTCF_gdprApplies", 0)) : BuildConfig.FLAVOR, sharedPreferences.getString("IABTCF_TCString", BuildConfig.FLAVOR), sharedPreferences.getString("IABTCF_AddtlConsent", BuildConfig.FLAVOR), sharedPreferences.getString("IABUSPrivacy_String", BuildConfig.FLAVOR));
        } catch (ClassCastException e) {
            C7458yy.m22582e("Failed to read TCF Consent settings from SharedPreferences.", e);
            return null;
        }
    }

    /* renamed from: g */
    static /* synthetic */ String m18959g(alv alv) {
        if (alv.f20911a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            C7458yy.m22581d("Host application doesn't have ACCESS_NETWORK_STATE permission");
            return "android:0";
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) alv.f20911a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "android:0";
        }
        return String.format(Locale.US, "android:%d:%d", new Object[]{Integer.valueOf(activeNetworkInfo.getType()), Integer.valueOf(activeNetworkInfo.getSubtype())});
    }

    /* renamed from: i */
    static /* synthetic */ alt m18961i(alv alv) {
        ActivityInfo activityInfo;
        PackageManager packageManager = alv.f20911a.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads.interactivemedia.v3")), 65536);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                return alt.create(packageInfo.versionCode, activityInfo.packageName);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m18968p(alv alv, AdsManagerLoadedEvent adsManagerLoadedEvent) {
        for (AdsLoader.AdsLoadedListener onAdsManagerLoaded : alv.f20915e) {
            onAdsManagerLoaded.onAdsManagerLoaded(adsManagerLoadedEvent);
        }
    }

    /* renamed from: t */
    private final String m18972t() {
        TestingConfiguration testingConfiguration = this.f20920j;
        if (testingConfiguration == null || !testingConfiguration.ignoreStrictModeFalsePositives()) {
            return UUID.randomUUID().toString();
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
        String uuid = UUID.randomUUID().toString();
        StrictMode.setThreadPolicy(threadPolicy);
        return uuid;
    }

    /* renamed from: a */
    public final void mo14934a() {
        this.f20912b.mo14995a();
    }

    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f20914d.mo14972a(adErrorListener);
    }

    public final void addAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.f20915e.add(adsLoadedListener);
    }

    public final void contentComplete() {
        this.f20912b.mo15008n(new amx(amv.adsLoader, amw.contentComplete, "*"));
    }

    public final ImaSdkSettings getSettings() {
        return this.f20919i;
    }

    public final void release() {
        AdDisplayContainer adDisplayContainer = this.f20922l;
        if (adDisplayContainer != null) {
            adDisplayContainer.destroy();
        }
        StreamDisplayContainer streamDisplayContainer = this.f20921k;
        if (streamDisplayContainer != null) {
            streamDisplayContainer.destroy();
        }
        ane ane = this.f20912b;
        if (ane != null) {
            ane.mo15007m();
        }
        this.f20916f.clear();
        this.f20915e.clear();
        this.f20917g.clear();
    }

    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f20914d.mo14973b(adErrorListener);
    }

    public final void removeAdsLoadedListener(AdsLoader.AdsLoadedListener adsLoadedListener) {
        this.f20915e.remove(adsLoadedListener);
    }

    public final void requestAds(AdsRequest adsRequest) {
        String t = m18972t();
        if (adsRequest == null) {
            this.f20914d.mo14975d(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsRequest cannot be null.")));
            return;
        }
        AdDisplayContainer adDisplayContainer = this.f20922l;
        if (adDisplayContainer == null) {
            this.f20914d.mo14975d(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must be provided.")));
        } else if (adDisplayContainer.getAdContainer() == null) {
            this.f20914d.mo14975d(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must have a UI container.")));
        } else if (!aqd.m19274b(adsRequest.getAdTagUrl()) || !aqd.m19274b(adsRequest.getAdsResponse())) {
            if (this.f20922l.getPlayer() == null) {
                AdDisplayContainer adDisplayContainer2 = this.f20922l;
                adDisplayContainer2.setPlayer(ImaSdkFactory.createSdkOwnedPlayer(this.f20911a, adDisplayContainer2.getAdContainer()));
            }
            this.f20916f.put(t, adsRequest);
            this.f20912b.mo14999e(this.f20913c, t);
            this.f20912b.mo15005k(this.f20922l, t);
            new alq(this, adsRequest, t).execute(new String[]{adsRequest.getAdTagUrl()});
        } else {
            this.f20914d.mo14975d(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad tag url must non-null and non empty.")));
        }
    }

    public final String requestStream(StreamRequest streamRequest) {
        String t = m18972t();
        if (streamRequest == null) {
            this.f20914d.mo14975d(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "StreamRequest cannot be null.")));
        } else {
            StreamDisplayContainer streamDisplayContainer = this.f20921k;
            if (streamDisplayContainer == null) {
                this.f20914d.mo14975d(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream display container must be provided.")));
            } else if (streamDisplayContainer.getVideoStreamPlayer() == null) {
                this.f20914d.mo14975d(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream requests must specify a player.")));
            } else {
                this.f20917g.put(t, streamRequest);
                this.f20912b.mo14999e(this.f20913c, t);
                this.f20912b.mo15005k(this.f20921k, t);
                new alu(this, streamRequest, t).execute(new Void[0]);
            }
        }
        return t;
    }

    public alv(Context context, Uri uri, ImaSdkSettings imaSdkSettings, StreamDisplayContainer streamDisplayContainer, TestingConfiguration testingConfiguration) {
        this(new ane(context, uri, imaSdkSettings, testingConfiguration), context, imaSdkSettings, testingConfiguration, (AdDisplayContainer) null, streamDisplayContainer);
        this.f20912b.mo14995a();
    }

    private alv(ane ane, Context context, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration, AdDisplayContainer adDisplayContainer, StreamDisplayContainer streamDisplayContainer) {
        this.f20913c = new alp(this);
        this.f20914d = new amo();
        this.f20915e = new ArrayList(1);
        this.f20916f = new HashMap();
        this.f20917g = new HashMap();
        this.f20923m = new Object();
        this.f20912b = ane;
        this.f20911a = context;
        this.f20919i = imaSdkSettings == null ? ImaSdkFactory.getInstance().createImaSdkSettings() : imaSdkSettings;
        this.f20920j = testingConfiguration;
        this.f20922l = adDisplayContainer;
        this.f20921k = streamDisplayContainer;
        anr anr = new anr(ane, context);
        this.f20918h = anr;
        ane.mo15001g(anr);
        if (adDisplayContainer != null) {
            adDisplayContainer.claim();
        }
        if (streamDisplayContainer != null) {
            streamDisplayContainer.claim();
        }
    }
}
