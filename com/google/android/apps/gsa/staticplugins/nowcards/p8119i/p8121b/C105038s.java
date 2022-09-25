package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.apps.gsa.shared.p7148ui.C90702n;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.android.youtube.player.C45440b;
import com.google.android.youtube.player.C45510f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p417d.p418a.C8590q;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.s */
/* compiled from: PG */
public final class C105038s {

    /* renamed from: a */
    private static final C59071e f292712a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.i.b.s");

    /* renamed from: b */
    private final Context f292713b;

    /* renamed from: c */
    private final C58881cr f292714c;

    /* renamed from: d */
    private final C58833ax f292715d;

    /* renamed from: e */
    private final boolean f292716e;

    public C105038s(Context context, C58881cr crVar, C58833ax axVar, boolean z) {
        this.f292713b = context;
        this.f292714c = crVar;
        this.f292715d = axVar;
        this.f292716e = z;
    }

    /* renamed from: a */
    public final boolean mo94484a(C9215cx cxVar) {
        int i;
        NetworkInfo activeNetworkInfo;
        int i2;
        if (!this.f292716e || cxVar.f31851m || ((i = cxVar.f31840b) != 1 && i != 2 && i != 12)) {
            return false;
        }
        CardRenderingContext cardRenderingContext = (CardRenderingContext) this.f292714c.mo6453a();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f292713b.getSystemService("connectivity");
        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
            int type = activeNetworkInfo.getType();
            synchronized (cardRenderingContext.f118456b) {
                i2 = cardRenderingContext.f118457c.getInt("AUTOPLAY_VIDEO_SETTING");
            }
            if (type == 0 ? i2 == C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA.f29729e : type == 1 && (i2 == C8590q.AUTOPLAY_ON_WIFI_ONLY.f29729e || i2 == C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA.f29729e)) {
                if (cardRenderingContext.mo49319n()) {
                    return false;
                }
                int i3 = cxVar.f31840b;
                if (i3 == 2 || i3 == 12) {
                    return true;
                }
                if (!cardRenderingContext.mo49311f() || C45440b.m81085a(this.f292713b) != C45510f.SUCCESS) {
                    return false;
                }
                return (this.f292715d.mo56113h() ? ((C90702n) this.f292715d.mo56107c()).mo76781a() : null) != null;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo94485b(C9215cx cxVar) {
        CardRenderingContext cardRenderingContext = (CardRenderingContext) this.f292714c.mo6453a();
        if (!this.f292716e) {
            return false;
        }
        if (cxVar == null) {
            C59104x d = f292712a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VideoEligibilityChecker");
            ((C59052c) ((C59052c) d).mo56372aa(22108)).mo56386p("PlayVideoAction cannot be null");
            return false;
        } else if (!cxVar.f31845g) {
            return false;
        } else {
            int i = cxVar.f31840b;
            if (i != 1 && i != 2) {
                C59104x d2 = f292712a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "VideoEligibilityChecker");
                ((C59052c) ((C59052c) d2).mo56372aa(22107)).mo56386p("PlayVideoAction needs a youtube or third party video.");
                return false;
            } else if (i != 1 || cardRenderingContext.mo49311f()) {
                return true;
            } else {
                C59104x d3 = f292712a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "VideoEligibilityChecker");
                ((C59052c) ((C59052c) d3).mo56372aa(22106)).mo56386p("Video will not play in One Tap, YouTube app does not meet min requirements");
                return false;
            }
        }
    }
}
