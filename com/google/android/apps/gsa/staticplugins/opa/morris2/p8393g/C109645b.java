package com.google.android.apps.gsa.staticplugins.opa.morris2.p8393g;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Telephony;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
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
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90364ac;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8391b.C109616c;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14170k;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15373a;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15385m;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15386n;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15387o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.g.b */
/* compiled from: PG */
public final class C109645b implements C86686h {

    /* renamed from: a */
    public static final C59071e f305356a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.g.b");

    /* renamed from: c */
    public final C109616c f305357c;

    /* renamed from: d */
    private final C86610af f305358d;

    /* renamed from: e */
    private final C84885a f305359e;

    /* renamed from: f */
    private final C15387o f305360f;

    public C109645b(Context context, C86610af afVar, C84885a aVar, C109616c cVar, C86124t tVar, C90364ac acVar) {
        this.f305358d = afVar;
        this.f305359e = aVar;
        this.f305357c = cVar;
        C58976aa aaVar = C58975e.f156826a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(tVar.mo79745c(C90014bt.f247368fo));
        linkedHashSet.addAll(tVar.mo79745c(C90014bt.f247367fn));
        if (linkedHashSet.isEmpty()) {
            linkedHashSet.addAll(acVar.f252391c.keySet());
        }
        if (Telephony.Sms.getDefaultSmsPackage(context) != null) {
            linkedHashSet.add(Telephony.Sms.getDefaultSmsPackage(context));
        }
        C58528ij F = C58528ij.m90006F(linkedHashSet);
        C15385m b = C15387o.m32012b();
        C15386n nVar = new C15386n(F);
        C15373a aVar2 = (C15373a) b;
        if (aVar2.f46149a == null) {
            aVar2.f46149a = C58485gu.m89837e();
        }
        aVar2.f46149a.mo55395g(nVar);
        this.f305360f = b.mo22264a();
    }

    /* renamed from: a */
    private static ArrayList m182463a(ClientEventData clientEventData) {
        Bundle bundle = (Bundle) clientEventData.mo81912b(Bundle.class);
        ClassLoader classLoader = BundledMessageNotification.class.getClassLoader();
        if (classLoader == null) {
            return new ArrayList();
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelableArrayList("active_notifications");
    }

    /* renamed from: c */
    private final List m182464c(ClientEventData clientEventData, String str) {
        ArrayList arrayList = new ArrayList();
        Parcelable[] parcelableArray = ((Bundle) clientEventData.mo81912b(Bundle.class)).getParcelableArray(str);
        if (parcelableArray != null) {
            for (Parcelable parcelable : parcelableArray) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) parcelable;
                C15387o oVar = this.f305360f;
                if (oVar.mo22265a() != null) {
                    C58485gu a = oVar.mo22265a();
                    int size = a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        C58976aa aaVar = C58975e.f156826a;
                        i++;
                        if (!((C15386n) a.get(i)).f46168a.contains(statusBarNotification.getPackageName())) {
                            break;
                        }
                    }
                }
                arrayList.add(new NotificationWrapper(statusBarNotification));
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    private final void m182465m(long j, List list) {
        C58976aa aaVar = C58975e.f156826a;
        if (!list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NotificationWrapper notificationWrapper = (NotificationWrapper) it.next();
                linkedHashMap.put(notificationWrapper.f252553d, notificationWrapper);
            }
            C60870cx i = this.f305359e.mo78566i(list);
            this.f305358d.mo80225f(i, j, 0);
            C60856cj.m92911t(i, new C109643a(this, linkedHashMap), C60826bg.f164896a);
        }
    }

    /* renamed from: n */
    private final void m182466n(List list, long j) {
        ArrayList<NotificationWrapper> arrayList = new ArrayList<>();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new NotificationWrapper((BundledMessageNotification) it.next()));
            }
        }
        if (!arrayList.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            if (!arrayList.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (NotificationWrapper notificationWrapper : arrayList) {
                    linkedHashMap.put(notificationWrapper.f252553d, notificationWrapper);
                }
                this.f305358d.mo80225f(C118826c.f331423b, j, 0);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) it2.next();
                    String i = bundledMessageNotification.mo84119i();
                    if (linkedHashMap.containsKey(i)) {
                        this.f305357c.mo97914b(bundledMessageNotification, (NotificationWrapper) linkedHashMap.get(i));
                    }
                }
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
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        int ordinal = a.ordinal();
        if (ordinal == 146) {
            m182465m(j, m182464c(clientEventData, "active_notifications"));
        } else if (ordinal != 149) {
            switch (ordinal) {
                case 197:
                    List c = m182464c(clientEventData, "active_notifications");
                    if (!c.isEmpty()) {
                        m182465m(j, new ArrayList(C58485gu.m89846n((NotificationWrapper) c.get(0))));
                        return;
                    }
                    return;
                case 198:
                    ArrayList a2 = m182463a(clientEventData);
                    if (a2 != null && !a2.isEmpty()) {
                        m182466n(a2, j);
                        return;
                    }
                    return;
                case 199:
                    ArrayList a3 = m182463a(clientEventData);
                    if (a3 != null && !a3.isEmpty()) {
                        m182466n(C58485gu.m89846n((BundledMessageNotification) a3.get(0)), j);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            List<NotificationWrapper> c2 = m182464c(clientEventData, "removed_notifications");
            if (!c2.isEmpty()) {
                for (NotificationWrapper notificationWrapper : c2) {
                    C109616c cVar2 = this.f305357c;
                    String str = notificationWrapper.f252553d;
                    if (!cVar2.f305265c.isEmpty()) {
                        ((C14170k) cVar2.f305265c.get()).mo21508b(str);
                    }
                }
            }
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
