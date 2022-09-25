package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.interactivemedia.p367v3.api.AdError;
import com.google.ads.interactivemedia.p367v3.api.AdEvent;
import com.google.ads.interactivemedia.p367v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p367v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p367v3.impl.data.C6727at;
import com.google.ads.interactivemedia.p367v3.impl.data.C6729av;
import com.google.ads.interactivemedia.p367v3.impl.data.C6740bf;
import com.google.ads.interactivemedia.p367v3.impl.data.C6755c;
import com.google.ads.interactivemedia.p367v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.p367v3.impl.data.TestingConfiguration;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ane */
/* compiled from: PG */
public final class ane implements anh, ani {

    /* renamed from: a */
    private final Map f21013a = new HashMap();

    /* renamed from: b */
    private final Set f21014b = new HashSet();

    /* renamed from: c */
    private final Map f21015c = new HashMap();

    /* renamed from: d */
    private final Map f21016d = new HashMap();

    /* renamed from: e */
    private final Map f21017e = new HashMap();

    /* renamed from: f */
    private final Map f21018f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f21019g;

    /* renamed from: h */
    private final String f21020h;

    /* renamed from: i */
    private final anj f21021i;

    /* renamed from: j */
    private final Queue f21022j = new ArrayDeque();

    /* renamed from: k */
    private final TestingConfiguration f21023k;

    /* renamed from: l */
    private anp f21024l;

    /* renamed from: m */
    private and f21025m;

    /* renamed from: n */
    private long f21026n;

    /* renamed from: o */
    private boolean f21027o = false;

    public ane(Context context, Uri uri, ImaSdkSettings imaSdkSettings, TestingConfiguration testingConfiguration) {
        this.f21019g = context;
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("sdk_version", "a.3.21.0").appendQueryParameter("hl", imaSdkSettings.getLanguage()).appendQueryParameter("omv", C6839c.m19799b()).appendQueryParameter("app", context.getApplicationContext().getPackageName());
        if (testingConfiguration != null) {
            agf agf = new agf();
            agf.mo14715c(new apt());
            agf.mo14716d(new apz());
            appendQueryParameter.appendQueryParameter(TestingConfiguration.PARAMETER_KEY, agf.mo14713a().mo14707e(testingConfiguration));
        }
        this.f21020h = appendQueryParameter.build().toString();
        this.f21021i = new anj(new Handler(Looper.getMainLooper()), new WebView(context), this);
        this.f21023k = testingConfiguration;
    }

    /* renamed from: r */
    private final void m19031r(amv amv, amw amw, String str, C6740bf bfVar) {
        aoa aoa = (aoa) this.f21018f.get(str);
        if (aoa == null) {
            String valueOf = String.valueOf(amv);
            String valueOf2 = String.valueOf(amw);
            int length = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 44 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
            sb.append("Received ");
            sb.append(valueOf);
            sb.append(" message: ");
            sb.append(valueOf2);
            sb.append(" for invalid session id: ");
            sb.append(str);
            C7458yy.m22581d(sb.toString());
            return;
        }
        aoa.mo15023d(amv, amw, bfVar);
    }

    /* renamed from: s */
    private static String m19032s(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + str2.length());
        sb.append(str);
        sb.append(" Caused by: ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: t */
    private static final void m19033t(String str, amw amw) {
        String valueOf = String.valueOf(amw);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(str).length());
        sb.append("Illegal message type ");
        sb.append(valueOf);
        sb.append(" received for ");
        sb.append(str);
        sb.append(" channel");
        C7458yy.m22580c(sb.toString());
    }

    /* renamed from: a */
    public final void mo14995a() {
        this.f21026n = SystemClock.elapsedRealtime();
        this.f21021i.mo15017b(this.f21020h);
    }

    /* renamed from: b */
    public final WebView mo14996b() {
        return this.f21021i.mo15016a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final TestingConfiguration mo14997c() {
        return this.f21023k;
    }

    /* renamed from: d */
    public final void mo14998d(amx amx) {
        C6755c cVar;
        Map map;
        ami ami;
        aml aml;
        String str;
        String str2;
        C6740bf bfVar = (C6740bf) amx.mo14983d();
        String e = amx.mo14984e();
        amw c = amx.mo14982c();
        String name = amx.mo14981b().name();
        String name2 = c.name();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + String.valueOf(name2).length());
        sb.append("Received js message: ");
        sb.append(name);
        sb.append(" [");
        sb.append(name2);
        sb.append("]");
        C7458yy.m22580c(sb.toString());
        C6727at atVar = C6727at.Html;
        int i = 1;
        switch (amx.mo14981b().ordinal()) {
            case 0:
                if (!this.f21014b.contains(e)) {
                    amz amz = (amz) this.f21013a.get(e);
                    if (amz == null) {
                        String valueOf = String.valueOf(c);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(e).length());
                        sb2.append("Received monitor message: ");
                        sb2.append(valueOf);
                        sb2.append(" for invalid session id: ");
                        sb2.append(e);
                        C7458yy.m22581d(sb2.toString());
                        return;
                    } else if (bfVar == null) {
                        String valueOf2 = String.valueOf(c);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 56 + String.valueOf(e).length());
                        sb3.append("Received monitor message: ");
                        sb3.append(valueOf2);
                        sb3.append(" for session id: ");
                        sb3.append(e);
                        sb3.append(" with no data");
                        C7458yy.m22581d(sb3.toString());
                        return;
                    } else if (c.ordinal() != 36) {
                        m19033t(amv.activityMonitor.toString(), c);
                        return;
                    } else {
                        amz.mo14916g(bfVar.queryId, bfVar.eventId);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ana ana = (ana) this.f21016d.get(e);
                if (ana == null) {
                    String valueOf3 = String.valueOf(c);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 51 + String.valueOf(e).length());
                    sb4.append("Received request message: ");
                    sb4.append(valueOf3);
                    sb4.append(" for invalid session id: ");
                    sb4.append(e);
                    C7458yy.m22583f(sb4.toString());
                    return;
                }
                int ordinal = c.ordinal();
                if (ordinal != 11) {
                    if (ordinal == 30) {
                        ana.mo14926c(e, AdError.AdErrorType.LOAD, bfVar.errorCode, m19032s(bfVar.errorMessage, bfVar.innerError));
                        return;
                    } else if (ordinal != 67) {
                        m19033t(amv.adsLoader.toString(), c);
                        return;
                    } else {
                        ana.mo14925b(e, bfVar.streamId, bfVar.monitorAppLifecycle);
                        String valueOf4 = String.valueOf(bfVar.streamId);
                        C7458yy.m22580c(valueOf4.length() != 0 ? "Stream initialized with streamId: ".concat(valueOf4) : new String("Stream initialized with streamId: "));
                        return;
                    }
                } else if (bfVar == null) {
                    ana.mo14927d(e, AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR);
                    return;
                } else {
                    ana.mo14924a(e, bfVar.adCuePoints, bfVar.internalCuePoints, bfVar.monitorAppLifecycle);
                    return;
                }
            case 2:
                anc anc = (anc) this.f21017e.get(e);
                if (anc == null) {
                    String valueOf5 = String.valueOf(c);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 51 + String.valueOf(e).length());
                    sb5.append("Received manager message: ");
                    sb5.append(valueOf5);
                    sb5.append(" for invalid session id: ");
                    sb5.append(e);
                    C7458yy.m22581d(sb5.toString());
                    return;
                }
                if (bfVar == null || (cVar = bfVar.adData) == null) {
                    cVar = null;
                }
                int ordinal2 = c.ordinal();
                if (ordinal2 == 12) {
                    anc.mo14935a(new anb(AdEvent.AdEventType.ALL_ADS_COMPLETED, (C6755c) null));
                    return;
                } else if (ordinal2 == 16) {
                    anc.mo14935a(new anb(AdEvent.AdEventType.CLICKED, cVar));
                    return;
                } else if (ordinal2 == 18) {
                    anc.mo14935a(new anb(AdEvent.AdEventType.COMPLETED, cVar));
                    return;
                } else if (ordinal2 == 24) {
                    anb anb = new anb(AdEvent.AdEventType.CUEPOINTS_CHANGED, (C6755c) null);
                    anb.f21010d = new ArrayList();
                    for (C6729av avVar : bfVar.cuepoints) {
                        anb.f21010d.add(new amn(avVar.start(), avVar.end(), avVar.played()));
                    }
                    anc.mo14935a(anb);
                    return;
                } else if (ordinal2 != 43) {
                    if (ordinal2 == 51) {
                        anc.mo14935a(new anb(AdEvent.AdEventType.PAUSED, cVar));
                        return;
                    } else if (ordinal2 == 60) {
                        anc.mo14935a(new anb(AdEvent.AdEventType.RESUMED, cVar));
                        return;
                    } else if (ordinal2 == 68) {
                        anc.mo14935a(new anb(AdEvent.AdEventType.THIRD_QUARTILE, cVar));
                        return;
                    } else if (ordinal2 == 76) {
                        return;
                    } else {
                        if (ordinal2 == 20) {
                            anc.mo14935a(new anb(AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED, (C6755c) null));
                            return;
                        } else if (ordinal2 == 21) {
                            anc.mo14935a(new anb(AdEvent.AdEventType.CONTENT_RESUME_REQUESTED, (C6755c) null));
                            return;
                        } else if (ordinal2 == 30) {
                            anc.mo14963h(AdError.AdErrorType.PLAY, bfVar.errorCode, m19032s(bfVar.errorMessage, bfVar.innerError));
                            return;
                        } else if (ordinal2 == 31) {
                            anc.mo14935a(new anb(AdEvent.AdEventType.FIRST_QUARTILE, cVar));
                            return;
                        } else if (ordinal2 == 38) {
                            anc.mo14935a(new anb(AdEvent.AdEventType.ICON_FALLBACK_IMAGE_CLOSED, (C6755c) null));
                            return;
                        } else if (ordinal2 != 39) {
                            switch (ordinal2) {
                                case 1:
                                    anc.mo14935a(new anb(AdEvent.AdEventType.AD_BREAK_ENDED, cVar));
                                    return;
                                case 2:
                                    anb anb2 = new anb(AdEvent.AdEventType.AD_BREAK_FETCH_ERROR, (C6755c) null);
                                    anb2.f21009c = ars.m19428b("adBreakTime", bfVar.adBreakTime);
                                    anc.mo14935a(anb2);
                                    return;
                                case 3:
                                    anb anb3 = new anb(AdEvent.AdEventType.AD_BREAK_READY, (C6755c) null);
                                    anb3.f21009c = ars.m19428b("adBreakTime", bfVar.adBreakTime);
                                    anc.mo14935a(anb3);
                                    return;
                                case 4:
                                    anc.mo14935a(new anb(AdEvent.AdEventType.AD_BREAK_STARTED, cVar));
                                    return;
                                case 5:
                                    anc.mo14935a(new anb(AdEvent.AdEventType.AD_BUFFERING, (C6755c) null));
                                    return;
                                case 6:
                                case 7:
                                    return;
                                case 8:
                                    anc.mo14935a(new anb(AdEvent.AdEventType.AD_PERIOD_ENDED, (C6755c) null));
                                    return;
                                case 9:
                                    anc.mo14935a(new anb(AdEvent.AdEventType.AD_PERIOD_STARTED, (C6755c) null));
                                    return;
                                case 10:
                                    anb anb4 = new anb(AdEvent.AdEventType.AD_PROGRESS, cVar);
                                    anb4.f21011e = new alo(bfVar.currentTime, bfVar.duration, bfVar.adPosition, bfVar.totalAds, bfVar.adBreakDuration, bfVar.adPeriodDuration);
                                    anc.mo14935a(anb4);
                                    return;
                                default:
                                    switch (ordinal2) {
                                        case 45:
                                            anb anb5 = new anb(AdEvent.AdEventType.LOG, cVar);
                                            anb5.f21009c = bfVar.logData.constructMap();
                                            anc.mo14935a(anb5);
                                            return;
                                        case 46:
                                            anc.mo14935a(new anb(AdEvent.AdEventType.MIDPOINT, cVar));
                                            return;
                                        case 47:
                                            return;
                                        case 48:
                                            mo15009o(bfVar.url);
                                            return;
                                        default:
                                            switch (ordinal2) {
                                                case 62:
                                                    anb anb6 = new anb(AdEvent.AdEventType.SKIPPED, (C6755c) null);
                                                    anb6.f21012f = bfVar.seekTime;
                                                    anc.mo14935a(anb6);
                                                    return;
                                                case 63:
                                                    anc.mo14935a(new anb(AdEvent.AdEventType.SKIPPABLE_STATE_CHANGED, cVar));
                                                    return;
                                                case 64:
                                                    anc.mo14935a(new anb(AdEvent.AdEventType.STARTED, cVar));
                                                    return;
                                                default:
                                                    switch (ordinal2) {
                                                        case 72:
                                                            return;
                                                        case 73:
                                                            anc.mo14935a(new anb(AdEvent.AdEventType.TAPPED, cVar));
                                                            return;
                                                        case 74:
                                                            anc.mo14935a(new anb(AdEvent.AdEventType.ICON_TAPPED, (C6755c) null));
                                                            return;
                                                        default:
                                                            m19033t(amv.adsManager.toString(), c);
                                                            return;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            return;
                        }
                    }
                } else if (cVar != null) {
                    anc.mo14935a(new anb(AdEvent.AdEventType.LOADED, cVar));
                    return;
                } else {
                    C7458yy.m22583f("Ad loaded message requires adData");
                    anc.mo14964i(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Ad loaded message did not contain adData.");
                    return;
                }
            case 4:
                amg amg = (amg) this.f21015c.get(e);
                anc anc2 = (anc) this.f21017e.get(e);
                aoa aoa = (aoa) this.f21018f.get(e);
                if (amg == null || anc2 == null || aoa == null) {
                    String valueOf6 = String.valueOf(c);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 60 + String.valueOf(e).length());
                    sb6.append("Received displayContainer message: ");
                    sb6.append(valueOf6);
                    sb6.append(" for invalid session id: ");
                    sb6.append(e);
                    C7458yy.m22583f(sb6.toString());
                    return;
                }
                int ordinal3 = c.ordinal();
                if (ordinal3 != 27) {
                    if (ordinal3 != 37 && ordinal3 != 61) {
                        if (ordinal3 == 58) {
                            anc2.mo14936b(bfVar.resizeAndPositionVideo);
                            return;
                        } else if (ordinal3 != 59) {
                            m19033t(amv.displayContainer.toString(), c);
                            return;
                        } else {
                            anc2.mo14937c();
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (bfVar == null || (map = bfVar.companions) == null) {
                    anc2.mo14964i(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display companions message requires companions in data.");
                    return;
                } else {
                    Set<String> keySet = map.keySet();
                    HashMap g = asn.m19520g(keySet.size());
                    for (String str3 : keySet) {
                        CompanionAdSlot companionAdSlot = (CompanionAdSlot) amg.mo14956a().get(str3);
                        if (companionAdSlot.getContainer() != null) {
                            g.put(str3, companionAdSlot.getContainer());
                        } else {
                            anc2.mo14964i(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display requested for invalid companion slot.");
                        }
                    }
                    for (String str4 : g.keySet()) {
                        ViewGroup viewGroup = (ViewGroup) g.get(str4);
                        CompanionData companionData = (CompanionData) bfVar.companions.get(str4);
                        viewGroup.removeAllViews();
                        ami ami2 = (ami) ((CompanionAdSlot) amg.mo14956a().get(str4));
                        List b = ami2.mo14968b();
                        int ordinal4 = companionData.type().ordinal();
                        if (ordinal4 != 0) {
                            if (ordinal4 == i) {
                                amt amt = r0;
                                ami = ami2;
                                amt amt2 = new amt(viewGroup.getContext(), this, companionData, e, b);
                                new amr(amt).execute(new Void[0]);
                                aml = amt;
                            } else if (ordinal4 != 2) {
                                ami = ami2;
                                aml = null;
                            }
                            aml.setTag(e);
                            ami.mo14967a(e);
                            viewGroup.addView(aml);
                            i = 1;
                        }
                        ami = ami2;
                        aml = new aml(viewGroup.getContext(), this, companionData, b);
                        aml.setTag(e);
                        ami.mo14967a(e);
                        viewGroup.addView(aml);
                        i = 1;
                    }
                    return;
                }
            case 5:
            case 11:
                int ordinal5 = c.ordinal();
                if (ordinal5 == 41) {
                    this.f21027o = true;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = this.f21026n;
                    HashMap g2 = asn.m19520g(1);
                    g2.put("webViewLoadingTime", Long.valueOf(elapsedRealtime - j));
                    mo15008n(new amx(amv.webViewLoaded, amw.csi, e, g2));
                    return;
                } else if (ordinal5 != 45) {
                    m19033t("other", c);
                    return;
                } else if (bfVar.f20043ln == null || (str = bfVar.f20045n) == null || (str2 = bfVar.f20044m) == null) {
                    String valueOf7 = String.valueOf(bfVar);
                    String.valueOf(valueOf7).length();
                    C7458yy.m22583f("Invalid logging message data: ".concat(String.valueOf(valueOf7)));
                    return;
                } else {
                    StringBuilder sb7 = new StringBuilder(str.length() + 14 + str2.length());
                    sb7.append("JsMessage (");
                    sb7.append(str);
                    sb7.append("): ");
                    sb7.append(str2);
                    String sb8 = sb7.toString();
                    char charAt = bfVar.f20043ln.charAt(0);
                    if (charAt != 'D') {
                        if (charAt != 'E') {
                            if (charAt != 'I') {
                                if (charAt != 'S') {
                                    if (charAt != 'V') {
                                        if (charAt != 'W') {
                                            String valueOf8 = String.valueOf(bfVar.f20043ln);
                                            C7458yy.m22581d(valueOf8.length() != 0 ? "Unrecognized log level: ".concat(valueOf8) : new String("Unrecognized log level: "));
                                            C7458yy.m22581d(sb8);
                                            return;
                                        }
                                        C7458yy.m22581d(sb8);
                                        return;
                                    }
                                }
                            }
                        }
                        C7458yy.m22583f(sb8);
                        return;
                    }
                    C7458yy.m22580c(sb8);
                    return;
                }
            case 6:
                anp anp = this.f21024l;
                if (anp != null) {
                    anp.mo15034a(c, e, bfVar.networkRequest);
                    return;
                } else {
                    C7458yy.m22583f("Native network handler not initialized.");
                    return;
                }
            case 7:
                int ordinal6 = c.ordinal();
                if (ordinal6 == 49) {
                    this.f21025m.mo14993a();
                    return;
                } else if (ordinal6 == 50) {
                    this.f21025m.mo14994b();
                    return;
                } else {
                    return;
                }
            case 9:
                m19031r(amv.videoDisplay1, c, e, bfVar);
                return;
            case 10:
                m19031r(amv.videoDisplay2, c, e, bfVar);
                return;
            default:
                String valueOf9 = String.valueOf(amx.mo14981b());
                String.valueOf(valueOf9).length();
                C7458yy.m22583f("Unknown message channel: ".concat(String.valueOf(valueOf9)));
                return;
        }
    }

    /* renamed from: e */
    public final void mo14999e(ana ana, String str) {
        this.f21016d.put(str, ana);
    }

    /* renamed from: f */
    public final void mo15000f(anc anc, String str) {
        this.f21017e.put(str, anc);
    }

    /* renamed from: g */
    public final void mo15001g(and and) {
        this.f21025m = and;
    }

    /* renamed from: h */
    public final void mo15002h(amz amz, String str) {
        this.f21013a.put(str, amz);
    }

    /* renamed from: i */
    public final void mo15003i(String str) {
        this.f21013a.remove(str);
        this.f21014b.add(str);
    }

    /* renamed from: j */
    public final void mo15004j(aoa aoa, String str) {
        this.f21018f.put(str, aoa);
    }

    /* renamed from: k */
    public final void mo15005k(BaseDisplayContainer baseDisplayContainer, String str) {
        this.f21015c.put(str, baseDisplayContainer);
    }

    /* renamed from: l */
    public final void mo15006l(String str) {
        this.f21017e.remove(str);
        this.f21015c.remove(str);
        this.f21018f.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo15007m() {
        this.f21021i.mo15020e();
    }

    /* renamed from: n */
    public final void mo15008n(amx amx) {
        String name = amx.mo14981b().name();
        String name2 = amx.mo14982c().name();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23 + String.valueOf(name2).length());
        sb.append("Sending js message: ");
        sb.append(name);
        sb.append(" [");
        sb.append(name2);
        sb.append("]");
        C7458yy.m22580c(sb.toString());
        this.f21022j.add(amx);
        while (this.f21027o && !this.f21022j.isEmpty()) {
            this.f21021i.mo15018c((amx) this.f21022j.remove());
        }
    }

    /* renamed from: o */
    public final void mo15009o(String str) {
        if (str != null && str.length() > 0) {
            new amy(this, str).execute(new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo15010q() {
        this.f21024l = new anp(this);
    }
}
