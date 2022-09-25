package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.engine.recognition.p6123j.C77675a;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80096ak;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80097al;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80472k;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82320av;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82392dm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82393dn;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82394do;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82970he;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82971hf;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82972hg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82974hi;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82975hj;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.g */
/* compiled from: PG */
public final class C77839g implements C77675a {

    /* renamed from: a */
    public static final C58974d f214415a = C58974d.m91136j();

    /* renamed from: b */
    public final Map f214416b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConnectivityManager f214417c;

    /* renamed from: d */
    private final Map f214418d = new ConcurrentHashMap();

    /* renamed from: e */
    private final C83334w f214419e;

    /* renamed from: f */
    private final C91142g f214420f;

    /* renamed from: g */
    private final C76455a f214421g;

    /* renamed from: h */
    private final C83305i f214422h;

    /* renamed from: i */
    private final C22871g f214423i;

    public C77839g(Context context, C83334w wVar, C91142g gVar, C76455a aVar, C83305i iVar, C22871g gVar2) {
        this.f214417c = (ConnectivityManager) context.getSystemService("connectivity");
        this.f214419e = wVar;
        this.f214420f = gVar;
        this.f214421g = aVar;
        this.f214422h = iVar;
        this.f214423i = gVar2;
    }

    /* renamed from: f */
    private final Duration m124877f() {
        return Duration.ofMillis(this.f214420f.mo85399d(C90126fx.f251715nz));
    }

    /* renamed from: g */
    private static String m124878g() {
        String lowerCase = Build.MODEL.toLowerCase(Locale.ENGLISH);
        return lowerCase.contains("pixel 4") ? lowerCase : "non pixel 4";
    }

    /* renamed from: h */
    private final void m124879h(C82972hg hgVar) {
        C83305i iVar = this.f214422h;
        String g = m124878g();
        if (g != null) {
            int a = C82974hi.m132441a(hgVar.f226370b);
            if (a == 0) {
                a = 1;
            }
            String num = Integer.toString(a - 1);
            if (num != null) {
                iVar.mo75579d(new C82393dn("NGA_NETWORK_STATUS", g, num));
                C83334w wVar = this.f214419e;
                C82887ec ecVar = C82887ec.SPEECH_RECOGNITION_SWITCH;
                C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
                C82970he heVar = (C82970he) C82975hj.f226373c.createBuilder();
                heVar.copyOnWrite();
                C82975hj hjVar = (C82975hj) heVar.instance;
                hgVar.getClass();
                hjVar.f226376b = hgVar;
                hjVar.f226375a = 2;
                C82975hj hjVar2 = (C82975hj) heVar.build();
                dzVar.copyOnWrite();
                C82885ea eaVar = (C82885ea) dzVar.instance;
                hjVar2.getClass();
                eaVar.f225980b = hjVar2;
                eaVar.f225979a = 59;
                wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null deviceModel");
    }

    /* renamed from: a */
    public final void mo72771a() {
        Optional ofNullable = Optional.ofNullable(this.f214417c.getActiveNetwork());
        if (ofNullable.isPresent()) {
            long networkHandle = ((Network) ofNullable.get()).getNetworkHandle();
            ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4494)).mo56388r("S3 connection timed out for network: %s", networkHandle);
            mo72837b(networkHandle);
        }
    }

    /* renamed from: b */
    public final void mo72837b(long j) {
        Duration f = m124877f();
        ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4491)).mo56351D("Added network: %s to blacklist with timeout: %s", j, f);
        Map map = this.f214416b;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            this.f214422h.mo75579d(new C82320av("NETWORK_DENYLIST"));
        }
        this.f214416b.put(valueOf, this.f214423i.mo28208h("[NGA] remove blacklisted network", f.toMillis(), new C77837e(this, j)));
    }

    /* renamed from: c */
    public final boolean mo72838c(Network network) {
        long networkHandle = network.getNetworkHandle();
        NetworkCapabilities networkCapabilities = this.f214417c.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4496)).mo56388r("No network capabilities for network: %s", networkHandle);
            C82971hf hfVar = (C82971hf) C82972hg.f226367d.createBuilder();
            hfVar.copyOnWrite();
            C82972hg hgVar = (C82972hg) hfVar.instance;
            hgVar.f226370b = 2;
            hgVar.f226369a |= 1;
            m124879h((C82972hg) hfVar.build());
            return false;
        }
        C58800sl lA = C58528ij.m90012L(21, 16, 12).iterator();
        while (lA.hasNext()) {
            Integer num = (Integer) lA.next();
            if (!networkCapabilities.hasCapability(num.intValue())) {
                ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4495)).mo56359L("Capability not met: %s, Network: %s, NetworkCapabilities: %s", num, Long.valueOf(networkHandle), networkCapabilities);
                C82971hf hfVar2 = (C82971hf) C82972hg.f226367d.createBuilder();
                hfVar2.copyOnWrite();
                C82972hg hgVar2 = (C82972hg) hfVar2.instance;
                hgVar2.f226370b = 3;
                hgVar2.f226369a = 1 | hgVar2.f226369a;
                String networkCapabilities2 = networkCapabilities.toString();
                hfVar2.copyOnWrite();
                C82972hg hgVar3 = (C82972hg) hfVar2.instance;
                networkCapabilities2.getClass();
                hgVar3.f226369a = 2 | hgVar3.f226369a;
                hgVar3.f226371c = networkCapabilities2;
                m124879h((C82972hg) hfVar2.build());
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo72839d() {
        ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4498)).mo56386p("isNetworkGood called.");
        return mo72840e(true, true);
    }

    /* renamed from: e */
    public final boolean mo72840e(boolean z, boolean z2) {
        C82972hg hgVar;
        String str;
        boolean z3;
        Network activeNetwork = this.f214417c.getActiveNetwork();
        if (activeNetwork == null) {
            ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4490)).mo56386p("No active network");
            C82971hf hfVar = (C82971hf) C82972hg.f226367d.createBuilder();
            hfVar.copyOnWrite();
            C82972hg hgVar2 = (C82972hg) hfVar.instance;
            hgVar2.f226370b = 1;
            hgVar2.f226369a |= 1;
            hgVar = (C82972hg) hfVar.build();
        } else {
            long networkHandle = activeNetwork.getNetworkHandle();
            if (!mo72838c(activeNetwork)) {
                hgVar = C82972hg.f226367d;
            } else {
                NetworkCapabilities networkCapabilities = this.f214417c.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4489)).mo56388r("No network capabilities for network: %s", networkHandle);
                    C82971hf hfVar2 = (C82971hf) C82972hg.f226367d.createBuilder();
                    hfVar2.copyOnWrite();
                    C82972hg hgVar3 = (C82972hg) hfVar2.instance;
                    hgVar3.f226370b = 2;
                    hgVar3.f226369a |= 1;
                    hgVar = (C82972hg) hfVar2.build();
                } else {
                    if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
                        str = "wifi";
                    } else {
                        str = networkCapabilities.hasTransport(0) ? "cellular" : (networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(6)) ? "other" : "unknown";
                    }
                    long d = this.f214420f.mo85399d(C90126fx.f251558lA);
                    int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
                    C83305i iVar = this.f214422h;
                    String g = m124878g();
                    if (g != null) {
                        String str2 = "Null deviceModel";
                        iVar.mo75579d(new C82392dm("NGA_NETWORK_DOWNSTREAM_BANDWIDTH", Double.valueOf((double) linkDownstreamBandwidthKbps), g, str));
                        if (linkDownstreamBandwidthKbps == 0 || ((long) linkDownstreamBandwidthKbps) >= d) {
                            z3 = true;
                        } else {
                            ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4488)).mo56351D("Downstream bandwidth not sufficient: Network: %s, NetworkCapabilities: %s", networkHandle, networkCapabilities);
                            z3 = false;
                        }
                        int linkUpstreamBandwidthKbps = networkCapabilities.getLinkUpstreamBandwidthKbps();
                        C83305i iVar2 = this.f214422h;
                        String g2 = m124878g();
                        if (g2 != null) {
                            iVar2.mo75579d(new C82394do("NGA_NETWORK_UPSTREAM_BANDWIDTH", Double.valueOf((double) linkUpstreamBandwidthKbps), g2, str));
                            if (z3) {
                                if (linkUpstreamBandwidthKbps == 0 || ((long) linkUpstreamBandwidthKbps) >= d) {
                                    if (z) {
                                        Map map = this.f214418d;
                                        Long valueOf = Long.valueOf(networkHandle);
                                        C60870cx cxVar = (C60870cx) map.get(valueOf);
                                        if ((cxVar == null || cxVar.isDone()) && !m124877f().isZero()) {
                                            C76455a aVar = this.f214421g;
                                            C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
                                            C80096ak akVar = (C80096ak) C80097al.f219798c.createBuilder();
                                            akVar.copyOnWrite();
                                            C80097al alVar = (C80097al) akVar.instance;
                                            alVar.f219800a |= 1;
                                            alVar.f219801b = networkHandle;
                                            C80097al alVar2 = (C80097al) akVar.build();
                                            kVar.copyOnWrite();
                                            C80136bn bnVar = (C80136bn) kVar.instance;
                                            alVar2.getClass();
                                            bnVar.f219918b = alVar2;
                                            bnVar.f219917a = 4;
                                            C60870cx d2 = aVar.mo72193d((C80136bn) kVar.build(), Optional.empty());
                                            this.f214418d.put(valueOf, d2);
                                            this.f214423i.mo28211k(d2, "[NGA] measure network", new C77838f(this));
                                        }
                                    }
                                    if (this.f214416b.containsKey(Long.valueOf(networkHandle))) {
                                        ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4486)).mo56388r("Network blacklisted: %s", networkHandle);
                                        C82971hf hfVar3 = (C82971hf) C82972hg.f226367d.createBuilder();
                                        hfVar3.copyOnWrite();
                                        C82972hg hgVar4 = (C82972hg) hfVar3.instance;
                                        hgVar4.f226370b = 6;
                                        hgVar4.f226369a |= 1;
                                        String networkCapabilities2 = networkCapabilities.toString();
                                        hfVar3.copyOnWrite();
                                        C82972hg hgVar5 = (C82972hg) hfVar3.instance;
                                        networkCapabilities2.getClass();
                                        hgVar5.f226369a |= 2;
                                        hgVar5.f226371c = networkCapabilities2;
                                        hgVar = (C82972hg) hfVar3.build();
                                    } else {
                                        ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4485)).mo56351D("Network is good: %s,\nNetworkCapabilities: %s", networkHandle, networkCapabilities);
                                        C82971hf hfVar4 = (C82971hf) C82972hg.f226367d.createBuilder();
                                        hfVar4.copyOnWrite();
                                        C82972hg hgVar6 = (C82972hg) hfVar4.instance;
                                        hgVar6.f226370b = 5;
                                        hgVar6.f226369a |= 1;
                                        String networkCapabilities3 = networkCapabilities.toString();
                                        hfVar4.copyOnWrite();
                                        C82972hg hgVar7 = (C82972hg) hfVar4.instance;
                                        networkCapabilities3.getClass();
                                        hgVar7.f226369a |= 2;
                                        hgVar7.f226371c = networkCapabilities3;
                                        hgVar = (C82972hg) hfVar4.build();
                                    }
                                } else {
                                    ((C58970a) ((C58970a) f214415a.mo56224b()).mo56372aa(4487)).mo56351D("Upstream bandwidth not sufficient: Network: %s, NetworkCapabilities: %s", networkHandle, networkCapabilities);
                                }
                            }
                            C82971hf hfVar5 = (C82971hf) C82972hg.f226367d.createBuilder();
                            hfVar5.copyOnWrite();
                            C82972hg hgVar8 = (C82972hg) hfVar5.instance;
                            hgVar8.f226370b = 4;
                            hgVar8.f226369a |= 1;
                            String networkCapabilities4 = networkCapabilities.toString();
                            hfVar5.copyOnWrite();
                            C82972hg hgVar9 = (C82972hg) hfVar5.instance;
                            networkCapabilities4.getClass();
                            hgVar9.f226369a |= 2;
                            hgVar9.f226371c = networkCapabilities4;
                            hgVar = (C82972hg) hfVar5.build();
                        } else {
                            throw new NullPointerException(str2);
                        }
                    } else {
                        throw new NullPointerException("Null deviceModel");
                    }
                }
            }
        }
        if (z2 && (hgVar.f226369a & 1) != 0) {
            m124879h(hgVar);
        }
        int a = C82974hi.m132441a(hgVar.f226370b);
        if (a != 0 && a == 6) {
            return true;
        }
        return false;
    }
}
