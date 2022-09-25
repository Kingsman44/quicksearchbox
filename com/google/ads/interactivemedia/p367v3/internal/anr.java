package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p367v3.api.AdEvent;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p367v3.impl.data.C6747bm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anr */
/* compiled from: PG */
public final class anr implements AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, amf, and {

    /* renamed from: a */
    private final ane f21050a;

    /* renamed from: b */
    private final anq f21051b;

    /* renamed from: c */
    private final Context f21052c;

    /* renamed from: d */
    private View f21053d;

    /* renamed from: e */
    private String f21054e;

    /* renamed from: f */
    private final Set f21055f;

    /* renamed from: g */
    private boolean f21056g = false;

    /* renamed from: h */
    private boolean f21057h = false;

    /* renamed from: i */
    private String f21058i = null;

    /* renamed from: j */
    private C6893e f21059j;

    public anr(ane ane, Context context) {
        anq anq = new anq();
        this.f21050a = ane;
        this.f21052c = context;
        this.f21051b = anq;
        this.f21055f = new HashSet();
    }

    /* renamed from: j */
    private final void m19074j(List list) {
        C6747bm bmVar;
        if (list == null) {
            bmVar = null;
        } else if (!list.isEmpty()) {
            bmVar = C6747bm.builder().friendlyObstructions(list).build();
        } else {
            return;
        }
        this.f21050a.mo15008n(new amx(amv.omid, amw.registerFriendlyObstructions, this.f21054e, bmVar));
    }

    /* renamed from: a */
    public final void mo14993a() {
        C6839c.m19798a(this.f21052c);
        this.f21056g = true;
    }

    /* renamed from: b */
    public final void mo14994b() {
        this.f21056g = false;
    }

    /* renamed from: c */
    public final void mo15035c(String str) {
        this.f21058i = str;
    }

    /* renamed from: d */
    public final void mo15036d(View view) {
        this.f21053d = view;
    }

    /* renamed from: e */
    public final void mo15037e(String str) {
        this.f21054e = str;
    }

    /* renamed from: f */
    public final boolean mo15038f() {
        C6893e eVar;
        if (!this.f21056g || (eVar = this.f21059j) == null) {
            return false;
        }
        eVar.mo15761c();
        this.f21059j = null;
        return true;
    }

    /* renamed from: g */
    public final void mo15039g(FriendlyObstruction friendlyObstruction) {
        if (!this.f21055f.contains(friendlyObstruction)) {
            this.f21055f.add(friendlyObstruction);
            C6893e eVar = this.f21059j;
            if (eVar != null) {
                eVar.mo15762d(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
                m19074j(Arrays.asList(new FriendlyObstruction[]{friendlyObstruction}));
            }
        }
    }

    /* renamed from: h */
    public final void mo15040h() {
        this.f21055f.clear();
        C6893e eVar = this.f21059j;
        if (eVar != null) {
            eVar.mo15763e();
            m19074j((List) null);
        }
    }

    /* renamed from: i */
    public final void mo15041i() {
        this.f21057h = true;
    }

    public final void onAdError(AdErrorEvent adErrorEvent) {
        C6893e eVar;
        if (this.f21056g && (eVar = this.f21059j) != null) {
            eVar.mo15761c();
            this.f21059j = null;
        }
    }

    public final void onAdEvent(AdEvent adEvent) {
        if (this.f21056g) {
            AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
            int ordinal = adEvent.getType().ordinal();
            if (ordinal == 3 || ordinal == 14) {
                mo15038f();
            } else if (ordinal == 15 && this.f21056g && this.f21059j == null && this.f21053d != null) {
                C6920f b = C6920f.m20358b(C7028j.DEFINED_BY_JAVASCRIPT, C7082l.DEFINED_BY_JAVASCRIPT, C7109m.JAVASCRIPT, C7109m.JAVASCRIPT);
                C7136n c = C7136n.m21208c();
                WebView b2 = this.f21050a.mo14996b();
                String str = this.f21058i;
                String str2 = true != this.f21057h ? "false" : "true";
                StringBuilder sb = new StringBuilder(str2.length() + 7);
                sb.append("{ssai:");
                sb.append(str2);
                sb.append("}");
                C6893e f = C6893e.m20125f(b, C6947g.m20386a(c, b2, str, sb.toString()));
                this.f21059j = f;
                f.mo15760b(this.f21053d);
                for (FriendlyObstruction friendlyObstruction : this.f21055f) {
                    this.f21059j.mo15762d(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
                }
                m19074j(new ArrayList(this.f21055f));
                this.f21059j.mo15759a();
            }
        }
    }
}
