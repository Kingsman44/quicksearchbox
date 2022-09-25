package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.cortex.C75332a;
import com.google.android.apps.gsa.nga.engine.cortex.CortexWrapper;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79879a;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79881c;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79882d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79892n;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79893o;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78952d;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78954f;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78969u;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78971w;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78972x;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79298f;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.TeleportQueryCleaner;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.assistant.p3817aj.p3818a.p3819a.C49190b;
import com.google.assistant.p3817aj.p3818a.p3819a.C49191c;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.assistant.p3817aj.p3818a.p3819a.C49196h;
import com.google.assistant.p3817aj.p3818a.p3819a.C49197i;
import com.google.assistant.p3817aj.p3818a.p3819a.C49200l;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p440an.p441a.C8837d;
import com.google.p440an.p441a.C8838e;
import com.google.p440an.p441a.C8841h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.l */
/* compiled from: PG */
public final class C78930l implements C78954f {

    /* renamed from: c */
    public static final /* synthetic */ int f217158c = 0;

    /* renamed from: d */
    private static final C58974d f217159d = C58974d.m91136j();

    /* renamed from: e */
    private static final C58495hd f217160e;

    /* renamed from: f */
    private static final C58528ij f217161f = C58528ij.m90011K(C49190b.GOOGLE_IMAGE_SEARCH, C49190b.GOOGLE_WEB_SEARCH);

    /* renamed from: a */
    public final C78931m f217162a;

    /* renamed from: b */
    public int f217163b = 4;

    /* renamed from: g */
    private final TeleportQueryCleaner f217164g;

    /* renamed from: h */
    private final C91142g f217165h;

    /* renamed from: i */
    private final CortexWrapper f217166i;

    /* renamed from: j */
    private final C78918ad f217167j;

    /* renamed from: k */
    private final Set f217168k;

    /* renamed from: l */
    private final C76092h f217169l;

    /* renamed from: m */
    private final C75332a f217170m;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("com.google.android.youtube", m126813l(C49190b.YOUTUBE, "com.google.android.youtube"));
        gzVar.mo55429h("com.google.android.apps.photos", m126813l(C49190b.GOOGLE_PHOTOS, "com.google.android.apps.photos"));
        gzVar.mo55429h("com.google.android.apps.maps", m126813l(C49190b.GOOGLE_MAPS, "com.google.android.apps.maps"));
        gzVar.mo55429h("com.android.vending", m126813l(C49190b.GOOGLE_PLAY_STORE, "com.android.vending"));
        f217160e = gzVar.mo55427f(false);
    }

    public C78930l(CortexWrapper cortexWrapper, C78931m mVar, TeleportQueryCleaner teleportQueryCleaner, C78918ad adVar, C91142g gVar, Set set, C76092h hVar, C75332a aVar) {
        this.f217166i = cortexWrapper;
        this.f217162a = mVar;
        this.f217168k = set;
        this.f217164g = teleportQueryCleaner;
        this.f217165h = gVar;
        this.f217169l = hVar;
        this.f217170m = aVar;
        this.f217167j = adVar;
    }

    /* renamed from: f */
    public static float m126812f(C58495hd hdVar, C49192d dVar) {
        C49190b a = C49190b.m85387a(dVar.f127202b);
        if (a == null) {
            a = C49190b.OTHER;
        }
        return ((Float) hdVar.getOrDefault(a, Float.valueOf(Float.MAX_VALUE))).floatValue();
    }

    /* renamed from: l */
    private static C49192d m126813l(C49190b bVar, String str) {
        C49191c cVar = (C49191c) C49192d.f127199e.createBuilder();
        cVar.copyOnWrite();
        C49192d dVar = (C49192d) cVar.instance;
        dVar.f127202b = bVar.f127198r;
        dVar.f127201a |= 1;
        cVar.copyOnWrite();
        C49192d dVar2 = (C49192d) cVar.instance;
        dVar2.f127201a |= 2;
        dVar2.f127203c = str;
        return (C49192d) cVar.build();
    }

    /* renamed from: m */
    private final C8841h m126814m() {
        return C8841h.m23466a(this.f217169l.mo72021b().mo72039e().toLanguageTag());
    }

    /* renamed from: n */
    private final void m126815n(C79326x xVar, String str, Object... objArr) {
        xVar.mo73900a(String.format(str, objArr));
        Collection.EL.stream(this.f217168k).forEach(new C78914a(str, objArr));
    }

    /* renamed from: o */
    private final void m126816o(String str, String str2, float f, float f2, C79326x xVar) {
        m126815n(xVar, "Query %s. Score: %f, Search Threshold: %f, Search Query [%s].", str, Float.valueOf(f), Float.valueOf(f2), str2);
    }

    /* renamed from: p */
    private final boolean m126817p() {
        return ((Boolean) this.f217170m.mo71675a().map(C78925g.f217151a).orElse(true)).booleanValue();
    }

    /* renamed from: a */
    public final C58528ij mo73695a() {
        return (C58528ij) Stream.CC.m71936of((T[]) new Stream[]{Stream.CC.m71935of("com.android.chrome"), Collection.EL.stream(f217160e.keySet()), Collection.EL.stream(this.f217162a.mo73687b())}).flatMap(Function.CC.identity()).collect(C58370cn.f155947b);
    }

    /* renamed from: b */
    public final Optional mo73696b(String str, C58485gu guVar, String str2, Optional optional) {
        float f;
        int i;
        Optional optional2;
        Optional optional3;
        Optional optional4;
        Optional optional5;
        Object obj;
        String str3 = str;
        C58485gu guVar2 = guVar;
        String str4 = str2;
        Optional optional6 = optional;
        C79326x a = new C79326x(Optional.m71637of(f217159d)).mo73900a("\nAssistedBrowseClassifier");
        C79326x a2 = a.mo73900a("SearchQueryConfidence");
        a2.mo73900a(str4);
        a2.mo73900a(str3);
        int i2 = 1;
        m126815n(a, "Foreground app package [%s]", str4);
        if (optional.isPresent()) {
            m126815n(a, "Foreground uri [%s]", optional.get());
        } else {
            m126815n(a, "Foreground uri not present", new Object[0]);
        }
        m126815n(a, "ModelResources version [%s]", this.f217166i.c());
        if (!this.f217166i.b(4) || !this.f217165h.mo85405j(C90126fx.f251800z)) {
            m126815n(a, "AssistedBrowseClassifier is disabled.", new Object[0]);
            return Optional.empty();
        }
        Optional i3 = mo73702i(str4, optional6);
        if (i3.isEmpty()) {
            m126815n(a, "Missing App proto for package %s", str4);
            return Optional.empty();
        }
        Object[] objArr = new Object[4];
        C49190b a3 = C49190b.m85387a(((C49192d) i3.get()).f127202b);
        if (a3 == null) {
            a3 = C49190b.OTHER;
        }
        objArr[0] = a3.name();
        objArr[1] = ((C49192d) i3.get()).f127203c;
        objArr[2] = ((C49192d) i3.get()).f127204d;
        objArr[3] = m126814m().f30255g;
        m126815n(a, "AssistedBrowse App [%s][%s][%s] Locale [%s]", objArr);
        C78918ad adVar = this.f217167j;
        C49190b a4 = C49190b.m85387a(((C49192d) i3.get()).f127202b);
        if (a4 == null) {
            a4 = C49190b.OTHER;
        }
        if (adVar.mo73694a(a4, str3, guVar2)) {
            m126815n(a, "Deeplink has been predicted skipping  version [%s]", this.f217166i.c());
            return Optional.empty();
        }
        C49190b a5 = C49190b.m85387a(((C49192d) i3.get()).f127202b);
        if (a5 == null) {
            a5 = C49190b.OTHER;
        }
        String c = this.f217166i.c();
        String name = a5.name();
        String[] split = this.f217165h.mo85403h(C90126fx.f251799y).split(";");
        int length = split.length;
        int i4 = 0;
        while (i4 < length) {
            String[] split2 = split[i4].split(":");
            if (split2.length > i2 && split2[0].equals(name)) {
                String[] split3 = split2[i2].split(",");
                for (String startsWith : split3) {
                    if (c.startsWith(startsWith)) {
                        m126815n(a, "AssistedBrowseClassifier is disabled for this app with the current MDD version.", new Object[0]);
                        return Optional.empty();
                    }
                }
                continue;
            }
            i4++;
            i2 = 1;
        }
        if (m126817p()) {
            f = mo73700g((C49192d) i3.get(), str4, optional6);
        } else {
            m126814m();
            f = m126812f(C58729pv.f156485a, (C49192d) i3.get());
        }
        float f2 = f;
        if (f2 > 1.0f) {
            m126815n(a, "AssistedBrowseClassifier is not enabled for this app and locale.", new Object[0]);
            return Optional.empty();
        }
        C79892n nVar = (C79892n) C79893o.f218982d.createBuilder();
        nVar.copyOnWrite();
        C79893o oVar = (C79893o) nVar.instance;
        str.getClass();
        oVar.f218984a |= 1;
        oVar.f218985b = str3;
        nVar.mo74272a(guVar2);
        C79893o oVar2 = (C79893o) nVar.build();
        C49192d dVar = (C49192d) i3.get();
        CortexWrapper cortexWrapper = this.f217166i;
        C49196h hVar = (C49196h) C49197i.f127208d.createBuilder();
        C49190b a6 = C49190b.m85387a(dVar.f127202b);
        if (a6 == null) {
            a6 = C49190b.OTHER;
        }
        switch (a6.ordinal()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 10;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i = 26;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            default:
                i = 1;
                break;
        }
        hVar.copyOnWrite();
        C49197i iVar = (C49197i) hVar.instance;
        iVar.f127213c = i - 1;
        iVar.f127211a |= 2;
        hVar.copyOnWrite();
        C49197i iVar2 = (C49197i) hVar.instance;
        dVar.getClass();
        iVar2.f127212b = dVar;
        iVar2.f127211a |= 1;
        C79882d dVar2 = (C79882d) C79885g.f218957h.createBuilder();
        C79879a aVar = (C79879a) C79881c.f218947d.createBuilder();
        aVar.copyOnWrite();
        C79881c cVar = (C79881c) aVar.instance;
        cVar.f218950b = 3;
        cVar.f218949a |= 1;
        dVar2.copyOnWrite();
        C79885g gVar = (C79885g) dVar2.instance;
        C79881c cVar2 = (C79881c) aVar.build();
        cVar2.getClass();
        gVar.f218963e = cVar2;
        gVar.f218959a |= 8;
        dVar2.copyOnWrite();
        C79885g gVar2 = (C79885g) dVar2.instance;
        oVar2.getClass();
        gVar2.f218960b = oVar2;
        gVar2.f218959a |= 1;
        dVar2.mo58885m(C49197i.f127209e, (C49197i) hVar.build());
        C79891m a7 = cortexWrapper.a((C79885g) dVar2.build());
        if (a7 == null) {
            m126815n(a, "ModelResponse is null.", new Object[0]);
            optional2 = Optional.empty();
        } else if (!a7.f218979c.isEmpty()) {
            m126815n(a, "Model returned error: %s", a7.f218979c);
            optional2 = Optional.empty();
        } else if (a7.f218978b.size() != 1) {
            m126815n(a, "ModelResponse contains wrong number of classes.", new Object[0]);
            optional2 = Optional.empty();
        } else {
            optional2 = Optional.m71637of((C79890l) a7.f218978b.get(0));
        }
        if (optional2.isEmpty()) {
            m126815n(a, "Could not extract model response", new Object[0]);
            return Optional.empty();
        }
        C79890l lVar = (C79890l) optional2.get();
        C62940bt r9 = C62942bv.checkIsLite(C49200l.f127215c);
        lVar.mo58887l(r9);
        if (lVar.f169962ag.mo58857o(r9.f169971d)) {
            C62940bt r92 = C62942bv.checkIsLite(C49200l.f127215c);
            lVar.mo58887l(r92);
            Object l = lVar.f169962ag.mo58854l(r92.f169971d);
            if (l == null) {
                obj = r92.f169969b;
            } else {
                obj = r92.mo58889c(l);
            }
            optional3 = Optional.m71637of(((C49200l) obj).f127217a);
        } else {
            m126815n(a, "Could not parse AxonModelResponse.ResultClass", new Object[0]);
            optional3 = Optional.empty();
        }
        if (optional3.isEmpty()) {
            m126815n(a, "Could not extract model response search query", new Object[0]);
            return Optional.empty();
        }
        float f3 = ((C79890l) optional2.get()).f218972c;
        if (f3 < f2) {
            m126816o("DO_NOT_TRIGGER", (String) optional3.get(), f3, f2, a);
            return Optional.empty();
        }
        C49192d dVar3 = (C49192d) i3.get();
        C58528ij ijVar = f217161f;
        C49190b a8 = C49190b.m85387a(dVar3.f127202b);
        if (a8 == null) {
            a8 = C49190b.OTHER;
        }
        boolean contains = ijVar.contains(a8);
        String str5 = dVar3.f127203c;
        String str6 = dVar3.f127204d;
        if (contains || !C58837ba.m90859h(str6)) {
            optional4 = Optional.m71637of(new C78972x(str6));
        } else if (!C58837ba.m90859h(str5)) {
            optional4 = Optional.m71637of(new C78971w(str5));
        } else {
            optional4 = Optional.empty();
        }
        Optional optional7 = optional4;
        if (optional7.isEmpty()) {
            Object[] objArr2 = new Object[1];
            C49190b a9 = C49190b.m85387a(((C49192d) i3.get()).f127202b);
            if (a9 == null) {
                a9 = C49190b.OTHER;
            }
            objArr2[0] = a9.name();
            m126815n(a, "Could not construct search target for %s.", objArr2);
            m126816o("DO_NOT_TRIGGER", (String) optional3.get(), f3, f2, a);
            return Optional.empty();
        }
        C49192d dVar4 = (C49192d) i3.get();
        C49190b a10 = C49190b.m85387a(dVar4.f127202b);
        if (a10 == null) {
            a10 = C49190b.OTHER;
        }
        boolean contains2 = ijVar.contains(a10);
        String str7 = dVar4.f127203c;
        String str8 = dVar4.f127204d;
        if (contains2 || !C58837ba.m90859h(str8)) {
            optional5 = Optional.m71637of(this.f217164g.mo73824b(str8, C79298f.m127227c(str, guVar)));
        } else if (!C58837ba.m90859h(str7)) {
            optional5 = Optional.m71637of(this.f217164g.mo73824b(str7, C79298f.m127227c(str, guVar)));
        } else {
            optional5 = Optional.empty();
        }
        Optional optional8 = optional5;
        if (optional8.isEmpty()) {
            Object[] objArr3 = new Object[1];
            C49190b a11 = C49190b.m85387a(((C49192d) i3.get()).f127202b);
            if (a11 == null) {
                a11 = C49190b.OTHER;
            }
            objArr3[0] = a11.name();
            m126815n(a, "Could not cleanup search query for %s.", objArr3);
            return Optional.empty();
        }
        m126816o("TRIGGER_SEARCH", (String) optional8.get(), f3, f2, a);
        C78969u uVar = new C78969u();
        uVar.mo73686b((String) optional8.get());
        C78952d dVar5 = (C78952d) optional7.get();
        if (dVar5 != null) {
            uVar.f217221a = dVar5;
            return Optional.m71637of(uVar.mo73685a());
        }
        throw new NullPointerException("Null target");
    }

    /* renamed from: c */
    public final /* synthetic */ Optional mo73697c() {
        return Optional.empty();
    }

    /* renamed from: d */
    public final String mo73698d() {
        return "assisted_browse";
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo73699e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final float mo73700g(C49192d dVar, String str, Optional optional) {
        Optional optional2;
        String h = this.f217165h.mo85403h(C90126fx.f250949B);
        if (!h.isEmpty()) {
            String[] split = h.split(",", -1);
            if (split.length % 6 == 0) {
                int i = 0;
                while (true) {
                    if (i >= split.length) {
                        optional2 = Optional.empty();
                        break;
                    }
                    String str2 = split[i];
                    if (!str2.isEmpty()) {
                        if (str2.equals("ASSISTED_BROWSE")) {
                            int i2 = this.f217163b;
                            if (i2 == 0) {
                                throw null;
                            } else if (i2 != 4) {
                                continue;
                            }
                        }
                        if (str2.equals("TELEPORT")) {
                            int i3 = this.f217163b;
                            if (i3 == 0) {
                                throw null;
                            } else if (i3 != 3) {
                                continue;
                            }
                        }
                        String str3 = split[i + 1];
                        if (!str3.isEmpty()) {
                            C8841h hVar = C8841h.f30228a;
                            try {
                                C8841h a = C8841h.m23466a(str3);
                                C8841h m = m126814m();
                                if (a.mo17252b().equals(m.mo17252b()) && (!a.mo17253c() || !m.mo17253c() || a.f30256h.equals(m.f30256h))) {
                                    String str4 = split[i + 2];
                                    if (!str4.isEmpty()) {
                                        C49190b a2 = C49190b.m85387a(dVar.f127202b);
                                        if (a2 == null) {
                                            a2 = C49190b.OTHER;
                                        }
                                        if (!str4.equals(a2.name())) {
                                            continue;
                                        }
                                    }
                                    String str5 = split[i + 3];
                                    if (str5.isEmpty() || str5.equals(str)) {
                                        String str6 = split[i + 4];
                                        if ((str6.isEmpty() || (str.equals("com.android.chrome") && !optional.isEmpty() && this.f217162a.mo73691f(Uri.parse(str6), (Uri) optional.get()))) && (!str4.isEmpty() || !str5.isEmpty() || !str6.isEmpty())) {
                                            String str7 = split[i + 5];
                                            if (!str7.isEmpty() && !C58890d.m90990e(str7, "NaN")) {
                                                try {
                                                    optional2 = Optional.m71637of(Float.valueOf(Float.parseFloat(str7)));
                                                    break;
                                                } catch (NumberFormatException unused) {
                                                    optional2 = Optional.empty();
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (C8837d | C8838e unused2) {
                                optional2 = Optional.empty();
                            }
                        } else {
                            continue;
                        }
                    }
                    i += 6;
                }
            } else {
                optional2 = Optional.empty();
            }
        } else {
            optional2 = Optional.empty();
        }
        if (optional2.isPresent()) {
            return ((Float) optional2.get()).floatValue();
        }
        if (!str.equals("com.android.chrome") || !optional.isPresent()) {
            return ((Float) this.f217162a.mo73692g(str, this.f217163b).orElse(Float.valueOf(Float.MAX_VALUE))).floatValue();
        }
        return ((Float) this.f217162a.mo73693h((Uri) optional.get(), this.f217163b).orElse(Float.valueOf(Float.MAX_VALUE))).floatValue();
    }

    /* renamed from: h */
    public final C58528ij mo73701h() {
        return this.f217162a.mo73688c();
    }

    /* renamed from: i */
    public final Optional mo73702i(String str, Optional optional) {
        if (!str.equals("com.android.chrome") || !optional.isPresent()) {
            Optional d = this.f217162a.mo73689d(str);
            if (d.isPresent()) {
                return d;
            }
            return Optional.ofNullable((C49192d) f217160e.get(str));
        }
        Uri uri = (Uri) optional.get();
        if (!Objects.equals(uri.getHost(), "www.google.com") || !Objects.equals(uri.getQueryParameter("tbm"), "isch")) {
            return this.f217162a.mo73690e((Uri) optional.get());
        }
        C49191c cVar = (C49191c) C49192d.f127199e.createBuilder();
        C49190b bVar = C49190b.GOOGLE_IMAGE_SEARCH;
        cVar.copyOnWrite();
        C49192d dVar = (C49192d) cVar.instance;
        dVar.f127202b = bVar.f127198r;
        dVar.f127201a |= 1;
        cVar.copyOnWrite();
        C49192d dVar2 = (C49192d) cVar.instance;
        dVar2.f127201a |= 4;
        dVar2.f127204d = "http://images.google.com/";
        return Optional.m71637of((C49192d) cVar.build());
    }

    /* renamed from: j */
    public final boolean mo73703j(String str) {
        if (!m126817p()) {
            return ((Boolean) mo73702i(str, Optional.empty()).map(new C78921c(C58729pv.f156485a)).map(C78922d.f217148a).orElse(false)).booleanValue();
        } else if (!mo73695a().contains(str)) {
            return false;
        } else {
            Optional d = this.f217162a.mo73689d(str);
            if (!d.isEmpty() && mo73700g((C49192d) d.get(), str, Optional.empty()) <= 1.0f) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo73704k(Optional optional) {
        if (m126817p()) {
            if (!optional.isEmpty() && !Collection.EL.stream(mo73701h()).noneMatch(new C78926h(this, optional))) {
                Optional e = this.f217162a.mo73690e((Uri) optional.get());
                if (!e.isEmpty() && mo73700g((C49192d) e.get(), "com.android.chrome", optional) <= 1.0f) {
                    return true;
                }
            }
            return false;
        }
        return optional.isPresent() && Collection.EL.stream(mo73701h()).filter(C78927i.f217154a).filter(new C78928j(optional)).filter(new C78929k(this, C58729pv.f156485a)).anyMatch(C78920b.f217146a);
    }
}
