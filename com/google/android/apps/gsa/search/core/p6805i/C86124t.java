package com.google.android.apps.gsa.search.core.p6805i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7180q.p7181a.C91082a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C59830gw;
import com.google.common.p4552o.C59831gx;
import com.google.common.p4552o.C59837ha;
import com.google.common.p4552o.C59838hb;
import com.google.common.p4575r.C60757n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.search.core.i.t */
/* compiled from: PG */
public class C86124t extends C86126v implements C90991b {

    /* renamed from: a */
    private static final C59071e f232775a = C59071e.m91332i("com.google.android.apps.gsa.search.core.i.t");

    /* renamed from: b */
    protected final List f232776b = new ArrayList();

    /* renamed from: c */
    public final C68214a f232777c;

    /* renamed from: d */
    public final C86127w f232778d;

    /* renamed from: h */
    private final C22871g f232779h;

    public C86124t(C86127w wVar, C68214a aVar, C22871g gVar, Optional optional) {
        if (!optional.isPresent()) {
            this.f232778d = wVar;
            this.f232777c = aVar;
            this.f232779h = gVar;
            mo79755u(m138477C(), mo79736f());
            gVar.mo28212l("ConfigFlagsListener.whenFlagsFirstAvailable", new C86122r(this, aVar));
            return;
        }
        C91082a aVar2 = (C91082a) optional.get();
        throw null;
    }

    /* renamed from: C */
    private final C86111g m138477C() {
        byte[] e = this.f232778d.f232790a.mo79723b().mo80079e(C90507o.f253017g, (byte[]) null);
        if (e == null) {
            return C86111g.f232741g;
        }
        try {
            return (C86111g) C62942bv.parseFrom((C62942bv) C86111g.f232741g, e, C62921ba.m95368a());
        } catch (C62974ct e2) {
            ((C59052c) ((C59052c) ((C59052c) f232775a.mo56225c()).mo56382g(e2)).mo56372aa(7593)).mo56386p("Couldn't load default configuration.");
            return C86111g.f232741g;
        }
    }

    /* renamed from: E */
    private static void m138479E(StringBuilder sb, List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str);
            sb.append(':');
            sb.append(intValue);
        }
    }

    /* renamed from: F */
    private static int[] m138480F(int[] iArr) {
        if (iArr == null) {
            return new int[0];
        }
        if (iArr.length > 0) {
            Arrays.sort(iArr);
        }
        return iArr;
    }

    /* renamed from: g */
    public static String m138481g(Integer num, Object obj, Object obj2, Object obj3, Object obj4) {
        if (C58832aw.m90831a(obj2, obj4)) {
            String concat = BuildConfig.FLAVOR.concat(m138478D(obj4, "Local: ", false));
            if (obj3 != null) {
                concat = concat.concat(m138478D(obj3, "Server: ", true));
            }
            return concat.concat(m138478D(obj, "Default: ", true));
        } else if (C58832aw.m90831a(obj2, obj3)) {
            return BuildConfig.FLAVOR.concat(m138478D(obj3, "Server: ", false)).concat(m138478D(obj, "Default: ", true));
        } else {
            if (C58832aw.m90831a(obj2, obj)) {
                return BuildConfig.FLAVOR.concat(m138478D(obj, "Default: ", false));
            }
            ((C59052c) ((C59052c) f232775a.mo56226d()).mo56372aa(7595)).mo56354G("Source for flag %d value %s is unknown", num, obj2);
            String concat2 = BuildConfig.FLAVOR.concat(m138478D(obj2, "UNKNOWN SOURCE: ", false));
            if (obj4 != null) {
                concat2 = concat2.concat(m138478D(obj4, "Local: ", true));
            }
            if (obj3 != null) {
                concat2 = concat2.concat(m138478D(obj3, "Server: ", true));
            }
            return concat2.concat(m138478D(obj, "Default: ", true));
        }
    }

    /* renamed from: f */
    public final C86111g mo79736f() {
        byte[] e = this.f232778d.f232790a.mo79723b().mo80079e(C90507o.f253018h, (byte[]) null);
        if (e == null) {
            return C86111g.f232741g;
        }
        try {
            return (C86111g) C62942bv.parseFrom((C62942bv) C86111g.f232741g, e, C62921ba.m95368a());
        } catch (C62974ct e2) {
            ((C59052c) ((C59052c) ((C59052c) f232775a.mo56225c()).mo56382g(e2)).mo56372aa(7594)).mo56386p("Couldn't load local configuration.");
            return C86111g.f232741g;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C59837ha haVar = (C59837ha) C59838hb.f161707d.createBuilder();
        List k = C58701ou.f156429a.mo55816k(mo79759y());
        haVar.copyOnWrite();
        C59838hb hbVar = (C59838hb) haVar.instance;
        C62961ch chVar = hbVar.f161710b;
        if (!chVar.mo58948c()) {
            hbVar.f161710b = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) k, (List) hbVar.f161710b);
        List k2 = C58701ou.f156429a.mo55816k(this.f232786f.f232747e);
        haVar.copyOnWrite();
        C59838hb hbVar2 = (C59838hb) haVar.instance;
        C62961ch chVar2 = hbVar2.f161711c;
        if (!chVar2.mo58948c()) {
            hbVar2.f161711c = C62942bv.mutableCopy(chVar2);
        }
        C62947c.addAll((Iterable) k2, (List) hbVar2.f161711c);
        HashMap hashMap = new HashMap();
        for (C86113i iVar : this.f232786f.f232744b) {
            hashMap.put(Integer.valueOf(iVar.f232755e), iVar);
        }
        HashMap hashMap2 = new HashMap();
        for (C86113i iVar2 : this.f232787g.f232744b) {
            hashMap2.put(Integer.valueOf(iVar2.f232755e), iVar2);
        }
        List list = (List) Collection.EL.stream(this.f232785e.values()).filter(C86118n.f232765a).map(new C86119o(hashMap, hashMap2)).sorted(Comparator.CC.comparing(C86120p.f232768a)).collect(Collectors.toList());
        haVar.copyOnWrite();
        C59838hb hbVar3 = (C59838hb) haVar.instance;
        C62971cq cqVar = hbVar3.f161709a;
        if (!cqVar.mo58948c()) {
            hbVar3.f161709a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) hbVar3.f161709a);
        C59838hb hbVar4 = (C59838hb) haVar.build();
        C59830gw gwVar = (C59830gw) C59831gx.f161678f.createBuilder();
        gwVar.copyOnWrite();
        C59831gx gxVar = (C59831gx) gwVar.instance;
        hbVar4.getClass();
        gxVar.f161681b = hbVar4;
        gxVar.f161680a |= 1;
        List j = C60757n.m92749j(m138480F(this.f232778d.f232790a.mo79722a().mo80080f("server_experiment_ids")));
        gwVar.copyOnWrite();
        C59831gx gxVar2 = (C59831gx) gwVar.instance;
        C62961ch chVar3 = gxVar2.f161682c;
        if (!chVar3.mo58948c()) {
            gxVar2.f161682c = C62942bv.mutableCopy(chVar3);
        }
        C62947c.addAll((Iterable) j, (List) gxVar2.f161682c);
        List j2 = C60757n.m92749j(m138480F(this.f232778d.f232790a.mo79723b().mo80080f(C90507o.f253019i)));
        gwVar.copyOnWrite();
        C59831gx gxVar3 = (C59831gx) gwVar.instance;
        C62961ch chVar4 = gxVar3.f161683d;
        if (!chVar4.mo58948c()) {
            gxVar3.f161683d = C62942bv.mutableCopy(chVar4);
        }
        C62947c.addAll((Iterable) j2, (List) gxVar3.f161683d);
        String w = mo79757w();
        if (w != null) {
            gwVar.copyOnWrite();
            C59831gx gxVar4 = (C59831gx) gwVar.instance;
            gxVar4.f161680a |= 2;
            gxVar4.f161684e = w;
        }
        C59831gx gxVar5 = (C59831gx) gwVar.build();
        C59795fw fwVar = fVar.f254236a;
        fwVar.copyOnWrite();
        C59796fx fxVar = (C59796fx) fwVar.instance;
        C59796fx fxVar2 = C59796fx.f161580r;
        gxVar5.getClass();
        fxVar.f161586e = gxVar5;
        fxVar.f161582a |= 4;
        StringBuilder sb = new StringBuilder();
        m138479E(sb, gxVar5.f161682c, "gws");
        C59838hb hbVar5 = gxVar5.f161681b;
        if (hbVar5 == null) {
            hbVar5 = C59838hb.f161707d;
        }
        m138479E(sb, hbVar5.f161710b, "client");
        m138479E(sb, mo79737h(), "trigger");
        fVar.mo85284k("experiments", sb.toString());
    }

    @Deprecated
    /* renamed from: h */
    public final List mo79737h() {
        int[] f = this.f232778d.f232790a.mo79723b().mo80080f(C90507o.f253019i);
        if (f == null || f.length == 0) {
            return this.f232786f.f232747e;
        }
        return C60757n.m92749j(f);
    }

    /* renamed from: i */
    public final void mo79738i(C86123s sVar) {
        synchronized (this.f232776b) {
            this.f232776b.add(sVar);
        }
    }

    /* renamed from: j */
    public final void mo79739j(Supplier supplier, C86111g gVar) {
        ArrayList arrayList;
        synchronized (this.f232776b) {
            arrayList = new ArrayList(this.f232776b);
        }
        this.f232779h.mo28212l("GsaConfigFlags.notifyListenerAndSave", new C86121q(this, supplier, arrayList, gVar));
    }

    /* renamed from: k */
    public final void mo79740k(C86123s sVar) {
        synchronized (this.f232776b) {
            this.f232776b.remove(sVar);
        }
    }

    /* renamed from: l */
    public final void mo79741l() {
        mo79739j(mo79755u(m138477C(), mo79736f()), (C86111g) null);
    }

    /* renamed from: D */
    private static String m138478D(Object obj, String str, boolean z) {
        String str2;
        if (obj == null) {
            str2 = str.concat("null");
        } else if (obj instanceof String) {
            str2 = str + "\"" + obj.toString() + "\"";
        } else {
            str2 = str.concat(obj.toString());
        }
        if (!z) {
            return str2;
        }
        return " [" + str2 + "]";
    }
}
