package com.google.android.apps.gsa.shared.p7006ax;

import android.content.Context;
import androidx.p060c.C0979i;
import com.google.android.gms.common.api.C143844p;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.mdns.C145117c;
import com.google.android.gms.mdns.C145118d;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;
import com.google.android.gms.mdns.MdnsServiceInfo;
import com.google.android.gms.mdns.p10847a.C145103e;
import com.google.android.gms.mdns.p10847a.C145104f;
import com.google.android.gms.mdns.p10847a.C145105g;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.shared.ax.c */
/* compiled from: PG */
public class C89324c implements C145118d {

    /* renamed from: b */
    private static final C59071e f242164b = C59071e.m91332i("com.google.android.apps.gsa.shared.ax.c");

    /* renamed from: a */
    public final Map f242165a = new ConcurrentHashMap();

    /* renamed from: c */
    private final MdnsOptions f242166c;

    /* renamed from: d */
    private final C89323b f242167d;

    /* renamed from: e */
    private C89322a f242168e = null;

    /* renamed from: f */
    private C145117c f242169f;

    public C89324c(C89323b bVar) {
        this.f242167d = bVar;
        C143919bh.m233961d(C58869cf.m90936b(new C58903m('.')).mo56155i("_gasetup._udp.local").size() == 3, "Invalid service type %s: should include exactly 3 labels", "_gasetup._udp.local");
        C143919bh.m233969l("libassistant mDNS Scanner");
        this.f242166c = new MdnsOptions("_gasetup._udp.local", "libassistant mDNS Scanner");
    }

    /* renamed from: a */
    public final void mo83249a(List list, int i) {
        C59104x b = f242164b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) b).mo56372aa(11146)).mo56352E("#onDiscoveryQuerySent, subtypes: %s, transactionId: %d", list, i);
    }

    /* renamed from: b */
    public final void mo83250b(int i, int i2) {
        C59104x c = f242164b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) c).mo56372aa(11147)).mo56393w("#onFailedToParseMdnsResponse, receivedPacketNumber: %d, errorCode: %d", i, i2);
    }

    /* renamed from: c */
    public final void mo83251c() {
        C59104x c = f242164b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) c).mo56372aa(11148)).mo56386p("onSearchFailedToStart");
    }

    /* renamed from: d */
    public final void mo83252d(int i) {
        C59104x c = f242164b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) c).mo56372aa(11149)).mo56387q("onSearchStoppedWithError: %d", i);
    }

    /* renamed from: e */
    public final void mo83253e(MdnsServiceInfo mdnsServiceInfo) {
        String str = mdnsServiceInfo.f392168c;
        if (str == null) {
            C59104x c = f242164b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
            ((C59052c) ((C59052c) c).mo56372aa(11140)).mo56386p("#mdnsResponseReceived, serviceInstanceName is null");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        Object a = this.f242167d.mo83248a(mdnsServiceInfo);
        if (a != null) {
            this.f242165a.put(str, a);
            C89322a aVar = this.f242168e;
            aVar.getClass();
            aVar.mo83246a(a);
            return;
        }
        C59104x c2 = f242164b.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) c2).mo56372aa(11138)).mo56386p("Current device is invalid!");
    }

    /* renamed from: f */
    public final void mo83254f(String str) {
        C59071e eVar = f242164b;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) b).mo56372aa(11136)).mo56389s("mdnsGoodbyeMessageReceived: %s", str);
        Object remove = this.f242165a.remove(str);
        if (remove != null) {
            C89322a aVar = this.f242168e;
            aVar.getClass();
            aVar.mo83247b(remove);
            return;
        }
        C59104x c = eVar.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) c).mo56372aa(11137)).mo56386p("This should never happen, try to remove a device doesn't exist!");
    }

    /* renamed from: g */
    public final void mo83255g(MdnsServiceInfo mdnsServiceInfo) {
        String str = mdnsServiceInfo.f392168c;
        if (str == null) {
            C59104x c = f242164b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
            ((C59052c) ((C59052c) c).mo56372aa(11145)).mo56386p("#mdnsResponseUpdated, serviceInstanceName is null");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        Object obj = this.f242165a.get(str);
        if (obj == null) {
            C59104x c2 = f242164b.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
            ((C59052c) ((C59052c) c2).mo56372aa(11143)).mo56386p("Previous found device is null which should not happen!");
        }
        Object a = this.f242167d.mo83248a(mdnsServiceInfo);
        if (a == null) {
            C59104x c3 = f242164b.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
            ((C59052c) ((C59052c) c3).mo56372aa(11142)).mo56386p("Current found device is invalid!");
        }
        if (obj == null) {
            if (a != null) {
                this.f242165a.put(str, a);
                C89322a aVar = this.f242168e;
                aVar.getClass();
                aVar.mo83246a(a);
            }
        } else if (a == null) {
            this.f242165a.remove(str);
            C89322a aVar2 = this.f242168e;
            aVar2.getClass();
            aVar2.mo83247b(obj);
        } else if (!obj.equals(a)) {
            C59104x b = f242164b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
            ((C59052c) ((C59052c) b).mo56372aa(11141)).mo56386p("Attributes of the previous found device updated!");
            this.f242165a.put(str, a);
            C89322a aVar3 = this.f242168e;
            aVar3.getClass();
            aVar3.mo83247b(obj);
            C89322a aVar4 = this.f242168e;
            aVar4.getClass();
            aVar4.mo83246a(a);
        }
    }

    /* renamed from: h */
    public final void mo83256h(Context context, C89322a aVar) {
        C59104x b = f242164b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) b).mo56372aa(11150)).mo56386p("startScan");
        this.f242168e = aVar;
        this.f242169f = new C145105g(context, this.f242166c);
        MdnsSearchOptions mdnsSearchOptions = new MdnsSearchOptions(new ArrayList(new C0979i(0)), false, false, false, 0);
        C145117c cVar = this.f242169f;
        cVar.getClass();
        C143847s sVar = (C143847s) cVar;
        C143784ce b2 = C143785cf.m233680b(this, sVar.f389927B, C145105g.f392184a);
        C143782cc ccVar = b2.f389806b;
        C143919bh.m233971n(ccVar, "Key must not be null");
        C145103e eVar = new C145103e(b2, b2, mdnsSearchOptions);
        C145104f fVar = new C145104f(ccVar, b2);
        C143919bh.m233971n(eVar.f389821a.f389806b, "Listener has already been released.");
        C143919bh.m233960c(C143912ba.m233950b(eVar.f389821a.f389806b, fVar.f389871b), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        sVar.f389930E.mo119208d(sVar, eVar, fVar, C143844p.f389920a);
    }

    /* renamed from: i */
    public final void mo83257i() {
        C59104x b = f242164b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LibAssistantScanner");
        ((C59052c) ((C59052c) b).mo56372aa(11151)).mo56386p("stopScan");
        C145117c cVar = this.f242169f;
        if (cVar != null) {
            C143847s sVar = (C143847s) cVar;
            C143782cc ccVar = C143785cf.m233680b(this, sVar.f389927B, C145105g.f392184a).f389806b;
            C143919bh.m233971n(ccVar, "key must not be null");
            sVar.mo119292w(ccVar, 0);
            this.f242169f = null;
        }
        this.f242168e = null;
        this.f242165a.clear();
    }
}
