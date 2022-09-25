package com.google.android.apps.gsa.staticplugins.p7645cd.p7647b;

import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.cd.b.a */
/* compiled from: PG */
public final class C97537a implements C86686h {

    /* renamed from: a */
    private final C86610af f272448a;

    /* renamed from: c */
    private final C84885a f272449c;

    public C97537a(C86610af afVar, C84885a aVar) {
        this.f272448a = afVar;
        this.f272449c = aVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        int ordinal = a.ordinal();
        if (ordinal != 146) {
            ArrayList arrayList = null;
            if (ordinal == 147) {
                Bundle bundle = (Bundle) clientEventData.mo81912b(Bundle.class);
                ClassLoader classLoader = StandardNotification.class.getClassLoader();
                if (classLoader != null) {
                    bundle.setClassLoader(classLoader);
                    arrayList = bundle.getParcelableArrayList("app_notifications");
                }
                this.f272448a.mo80225f(this.f272449c.mo78571n(arrayList), j, 0);
            } else if (ordinal == 173) {
                this.f272448a.mo80225f(this.f272449c.mo78567j(clientEventData), j, 0);
            } else if (ordinal == 212) {
                Bundle bundle2 = (Bundle) clientEventData.mo81912b(Bundle.class);
                ClassLoader classLoader2 = BundledMessageNotification.class.getClassLoader();
                if (classLoader2 != null) {
                    bundle2.setClassLoader(classLoader2);
                    arrayList = bundle2.getParcelableArrayList("parsed_notifications");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                this.f272449c.mo78574r(arrayList);
                this.f272448a.mo80225f(C118826c.f331423b, j, 0);
            }
        } else {
            Parcelable[] parcelableArray = ((Bundle) clientEventData.mo81912b(Bundle.class)).getParcelableArray("active_notifications");
            ArrayList arrayList2 = new ArrayList();
            if (parcelableArray != null) {
                for (Parcelable parcelable : parcelableArray) {
                    arrayList2.add(new NotificationWrapper((StatusBarNotification) parcelable));
                }
            }
            this.f272448a.mo80225f(this.f272449c.mo78565h(arrayList2), j, 0);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
