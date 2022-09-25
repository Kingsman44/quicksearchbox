package com.google.android.apps.gsa.staticplugins.opa.samson.p8438l;

import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85491h;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8434i.C110186h;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8438l.p8440b.C110240a;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8438l.p8440b.C110242c;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8438l.p8440b.C110244e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.l.f */
/* compiled from: PG */
public final class C110248f implements C86686h {

    /* renamed from: a */
    public static final C59071e f307218a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.l.f");

    /* renamed from: c */
    public final C110186h f307219c;

    /* renamed from: d */
    private final C68214a f307220d;

    /* renamed from: e */
    private final C85492i f307221e;

    /* renamed from: f */
    private final C85005h f307222f;

    /* renamed from: g */
    private final C85299b f307223g;

    /* renamed from: h */
    private final C86610af f307224h;

    /* renamed from: i */
    private final C22871g f307225i;

    public C110248f(C68214a aVar, C85492i iVar, C85005h hVar, C85299b bVar, C110186h hVar2, C22871g gVar, C86610af afVar) {
        this.f307220d = aVar;
        this.f307221e = iVar;
        this.f307222f = hVar;
        this.f307223g = bVar;
        this.f307219c = hVar2;
        this.f307225i = gVar;
        this.f307224h = afVar;
    }

    /* renamed from: a */
    private static List m183565a(Parcelable... parcelableArr) {
        ArrayList arrayList = new ArrayList();
        if (!(parcelableArr == null || (r1 = parcelableArr.length) == 0)) {
            for (StatusBarNotification statusBarNotification : parcelableArr) {
                if (statusBarNotification instanceof StatusBarNotification) {
                    arrayList.add(statusBarNotification);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m183566c(ClientEventData clientEventData, String str) {
        if (clientEventData.mo81913d(Bundle.class)) {
            Bundle bundle = (Bundle) clientEventData.mo81912b(Bundle.class);
            if ("active_notifications".equals(str)) {
                List a = m183565a(bundle.getParcelableArray(str));
                C58976aa aaVar = C58975e.f156826a;
                a.size();
                if (!a.isEmpty()) {
                    this.f307225i.mo28212l("replaceNotificationLiveDataWithActiveNotifications", new C110237a(this, a));
                }
            } else if ("removed_notifications".equals(str)) {
                Parcelable parcelable = bundle.getParcelable(str);
                if (parcelable != null) {
                    List a2 = m183565a(parcelable);
                    if (a2.size() != 1) {
                        C59104x c = f307218a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "DMSCtrl");
                        ((C59052c) ((C59052c) c).mo56372aa(25908)).mo56386p("This should not happen. It is in reference to the parameters of onNotificationPosted() method of NotificationListenerService.");
                        return;
                    }
                    this.f307225i.mo28212l("removeNotificationFromLiveData", new C110239b(this, a2));
                }
            } else {
                C59104x c2 = f307218a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "DMSCtrl");
                ((C59052c) ((C59052c) c2).mo56372aa(25907)).mo56386p("Unsupported resultKey for retrieving notifications");
            }
        }
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
        Object obj;
        Object obj2;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 11) {
            C58976aa aaVar = C58975e.f156826a;
            this.f307222f.mo78638w(j);
        } else if (ordinal == 139) {
            C58976aa aaVar2 = C58975e.f156826a;
            C85492i iVar = this.f307221e;
            C62940bt btVar = C87694ac.f237131a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r8 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r8);
            Object l = bwVar.f169962ag.mo58854l(r8.f169971d);
            if (l == null) {
                obj = r8.f169969b;
            } else {
                obj = r8.mo58889c(l);
            }
            iVar.mo79001f((C87696ae) obj, (C85491h) this.f307220d.mo27525b());
        } else if (ordinal == 146) {
            C58976aa aaVar3 = C58975e.f156826a;
            m183566c(clientEventData, "active_notifications");
            this.f307224h.mo80225f(C118826c.f331423b, j, 0);
        } else if (ordinal == 149) {
            C58976aa aaVar4 = C58975e.f156826a;
            m183566c(clientEventData, "removed_notifications");
            this.f307224h.mo80225f(C118826c.f331423b, j, 0);
        } else if (ordinal == 179) {
            C58976aa aaVar5 = C58975e.f156826a;
            C62940bt btVar2 = C110240a.f307205a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r7 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r7);
            Object l2 = bwVar2.f169962ag.mo58854l(r7.f169971d);
            if (l2 == null) {
                obj2 = r7.f169969b;
            } else {
                obj2 = r7.mo58889c(l2);
            }
            int a2 = C110242c.m183560a(((C110244e) obj2).f307210b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 1) {
                this.f307223g.mo78854g("smartspace_ambient_mode_listener", true);
            } else if (i != 2) {
                C59104x d = f307218a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "DMSCtrl");
                ((C59052c) ((C59052c) d).mo56372aa(25904)).mo56386p("#handleOpaAmbientClientEvent unsupported event id");
            } else {
                this.f307223g.mo78854g("smartspace_ambient_mode_listener", false);
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
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
