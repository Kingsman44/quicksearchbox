package com.google.android.apps.gsa.staticplugins.p7554bs.p7560f;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87903hw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87906hz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87908ia;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87909ib;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87932iy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87935ja;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87936jb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87937jc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87953js;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87955ju;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87956jv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87957jw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87959jy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87960jz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87962ka;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87963kb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p7066m.C89997bc;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.lens.sdk.p2045c.C24917b;
import com.google.android.libraries.lens.sdk.p2045c.C24928m;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26241ab;
import com.google.android.libraries.lens.view.flags.C26242ac;
import com.google.android.libraries.lens.view.flags.C26259q;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62995dn;
import java.util.EnumSet;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.f.h */
/* compiled from: PG */
public final class C96734h implements C86686h {

    /* renamed from: c */
    private static final C59071e f270593c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bs.f.h");

    /* renamed from: d */
    private static final C58528ij f270594d = C58476gl.m89803b(EnumSet.of(C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT, new C87739bu[]{C87739bu.CANVAS_WORKER_BINDER_REQUEST, C87739bu.OPEN_AMP_DOCUMENT, C87739bu.PREPARE_CCT_SESSION}));

    /* renamed from: a */
    public C86697a f270595a;

    /* renamed from: e */
    private final C96737k f270596e;

    /* renamed from: f */
    private final C96730d f270597f;

    /* renamed from: g */
    private final C143701ac f270598g;

    /* renamed from: h */
    private final PackageManager f270599h;

    /* renamed from: i */
    private final C86124t f270600i;

    /* renamed from: j */
    private boolean f270601j;

    public C96734h(C96737k kVar, C96730d dVar, C143701ac acVar, PackageManager packageManager, C86124t tVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f270596e = kVar;
        this.f270597f = dVar;
        this.f270598g = acVar;
        this.f270599h = packageManager;
        this.f270600i = tVar;
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
        C26239a[] aVarArr;
        int i;
        Object obj3;
        Bundle bundle;
        Bundle bundle2;
        ClientEventData clientEventData2 = clientEventData;
        C87739bu a = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f270600i.mo79746e(C89997bc.f246825v) || (!(C87739bu.LENS_SERVICE_LENS_VIEW_CLIENT_EVENT == a || C87739bu.LENS_SERVICE_SDK_CLIENT_EVENT == a) || this.f270601j)) {
            Trace.beginSection("handleGenericClientEvent:" + a.f237476dL);
            if (f270594d.contains(a)) {
                if (!this.f270600i.mo79746e(C89997bc.f246804a)) {
                    cVar.mo80279a(clientEventData2);
                }
            } else if (C96737k.f270605b.contains(a)) {
                C96737k kVar = this.f270596e;
                C87739bu a2 = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
                if (a2 == null) {
                    a2 = C87739bu.UNKNOWN;
                }
                int ordinal = a2.ordinal();
                if (ordinal != 89) {
                    int i2 = 1;
                    if (ordinal == 175) {
                        C62940bt btVar = C87957jw.f237898a;
                        C87741bw bwVar = clientEventData2.f236955a;
                        C62940bt r3 = C62942bv.checkIsLite(btVar);
                        bwVar.mo58887l(r3);
                        if (!bwVar.f169962ag.mo58857o(r3.f169971d)) {
                            C59104x d = C96737k.f270604a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "LensSessionSubCtrlr");
                            ((C59052c) ((C59052c) d).mo56372aa(20888)).mo56386p("LensView client event missing extension");
                        } else {
                            C62940bt btVar2 = C87957jw.f237898a;
                            C87741bw bwVar2 = clientEventData2.f236955a;
                            C62940bt r32 = C62942bv.checkIsLite(btVar2);
                            bwVar2.mo58887l(r32);
                            Object l = bwVar2.f169962ag.mo58854l(r32.f169971d);
                            if (l == null) {
                                obj = r32.f169969b;
                            } else {
                                obj = r32.mo58889c(l);
                            }
                            C87959jy jyVar = (C87959jy) obj;
                            C62940bt r33 = C62942bv.checkIsLite(C87957jw.f237899b);
                            jyVar.mo58887l(r33);
                            if (!jyVar.f169962ag.mo58857o(r33.f169971d)) {
                                C59104x d2 = C96737k.f270604a.mo56226d();
                                d2.mo56378ag(C58975e.f156826a, "LensSessionSubCtrlr");
                                ((C59052c) ((C59052c) d2).mo56372aa(20887)).mo56386p("Client event missing proxy extension");
                            } else {
                                C62940bt r34 = C62942bv.checkIsLite(C87957jw.f237899b);
                                jyVar.mo58887l(r34);
                                Object l2 = jyVar.f169962ag.mo58854l(r34.f169971d);
                                if (l2 == null) {
                                    obj2 = r34.f169969b;
                                } else {
                                    obj2 = r34.mo58889c(l2);
                                }
                                C87906hz hzVar = (C87906hz) obj2;
                                if (C87903hw.m142773a(hzVar.f237792a) != 6) {
                                    C59104x d3 = C96737k.f270604a.mo56226d();
                                    d3.mo56378ag(C58975e.f156826a, "LensSessionSubCtrlr");
                                    ((C59052c) ((C59052c) d3).mo56372aa(20886)).mo56387q("Ignoring unexpected event (%d)", C87903hw.m142773a(hzVar.f237792a) - 1);
                                } else {
                                    C96733g gVar = kVar.f270608e;
                                    C87684al alVar = new C87684al(C88244um.LENS_SERVICE_LENS_VIEW_SERVICE_EVENT);
                                    C62940bt btVar3 = C87960jz.f237903a;
                                    C87962ka kaVar = (C87962ka) C87963kb.f237905a.createBuilder();
                                    C62940bt btVar4 = C87960jz.f237904b;
                                    C87908ia iaVar = (C87908ia) C87909ib.f237798c.createBuilder();
                                    C86124t tVar = kVar.f270607d;
                                    C26259q qVar = (C26259q) C26241ab.f71364i.createBuilder();
                                    List y = tVar.mo79759y();
                                    qVar.copyOnWrite();
                                    C26241ab abVar = (C26241ab) qVar.instance;
                                    C62961ch chVar = abVar.f71371f;
                                    if (!chVar.mo58948c()) {
                                        abVar.f71371f = C62942bv.mutableCopy(chVar);
                                    }
                                    C62947c.addAll((Iterable) y, (List) abVar.f71371f);
                                    List h = tVar.mo79737h();
                                    qVar.copyOnWrite();
                                    C26241ab abVar2 = (C26241ab) qVar.instance;
                                    C62961ch chVar2 = abVar2.f71373h;
                                    if (!chVar2.mo58948c()) {
                                        abVar2.f71373h = C62942bv.mutableCopy(chVar2);
                                    }
                                    C62947c.addAll((Iterable) h, (List) abVar2.f71373h);
                                    C26239a[] values = C26239a.values();
                                    int length = values.length;
                                    int i3 = 0;
                                    while (i3 < length) {
                                        C26239a aVar = values[i3];
                                        int i4 = aVar.f71362ae;
                                        int i5 = i4 - 1;
                                        if (i4 != 0) {
                                            if (i5 == 0) {
                                                aVarArr = values;
                                                i = length;
                                                int i6 = aVar.f71357Z;
                                                C90048d dVar = aVar.f71359ab;
                                                dVar.getClass();
                                                qVar.mo31470a(i6, tVar.mo79746e(dVar));
                                            } else if (i5 == i2) {
                                                aVarArr = values;
                                                i = length;
                                                int i7 = aVar.f71357Z;
                                                C90075e eVar = aVar.f71360ac;
                                                eVar.getClass();
                                                double m = tVar.mo79747m(eVar);
                                                qVar.copyOnWrite();
                                                C26241ab abVar3 = (C26241ab) qVar.instance;
                                                C62995dn dnVar = abVar3.f71368c;
                                                if (!dnVar.f170058b) {
                                                    abVar3.f71368c = dnVar.mo58980a();
                                                }
                                                abVar3.f71368c.put(Integer.valueOf(i7), Double.valueOf(m));
                                            } else if (i5 != 2) {
                                                if (i5 != 3) {
                                                    aVarArr = values;
                                                } else {
                                                    int i8 = aVar.f71357Z;
                                                    C90129h hVar = aVar.f71361ad;
                                                    hVar.getClass();
                                                    String x = tVar.mo79758x(hVar);
                                                    x.getClass();
                                                    qVar.copyOnWrite();
                                                    C26241ab abVar4 = (C26241ab) qVar.instance;
                                                    C62995dn dnVar2 = abVar4.f71370e;
                                                    aVarArr = values;
                                                    if (!dnVar2.f170058b) {
                                                        abVar4.f71370e = dnVar2.mo58980a();
                                                    }
                                                    abVar4.f71370e.put(Integer.valueOf(i8), x);
                                                }
                                                i = length;
                                            } else {
                                                aVarArr = values;
                                                int i9 = aVar.f71357Z;
                                                C90102f fVar = aVar.f71358aa;
                                                fVar.getClass();
                                                long a3 = tVar.mo79743a(fVar);
                                                qVar.copyOnWrite();
                                                C26241ab abVar5 = (C26241ab) qVar.instance;
                                                C62995dn dnVar3 = abVar5.f71369d;
                                                i = length;
                                                if (!dnVar3.f170058b) {
                                                    abVar5.f71369d = dnVar3.mo58980a();
                                                }
                                                abVar5.f71369d.put(Integer.valueOf(i9), Long.valueOf(a3));
                                            }
                                            i3++;
                                            values = aVarArr;
                                            length = i;
                                            i2 = 1;
                                        } else {
                                            throw null;
                                        }
                                    }
                                    for (C26242ac acVar : C26242ac.values()) {
                                        C90048d dVar2 = acVar.f71380d;
                                        qVar.mo31470a(dVar2.f248757a, tVar.mo79746e(dVar2));
                                    }
                                    String v = tVar.mo79756v();
                                    if (!TextUtils.isEmpty(v)) {
                                        qVar.copyOnWrite();
                                        C26241ab abVar6 = (C26241ab) qVar.instance;
                                        v.getClass();
                                        abVar6.f71366a |= 1;
                                        abVar6.f71372g = v;
                                    }
                                    C26241ab abVar7 = (C26241ab) qVar.build();
                                    iaVar.copyOnWrite();
                                    C87909ib ibVar = (C87909ib) iaVar.instance;
                                    abVar7.getClass();
                                    ibVar.f237801b = abVar7;
                                    ibVar.f237800a = 4;
                                    kaVar.mo58885m(btVar4, (C87909ib) iaVar.build());
                                    alVar.mo81965b(btVar3, (C87963kb) kaVar.build());
                                    gVar.mo90332a(alVar.mo81964a());
                                }
                            }
                        }
                    } else if (ordinal != 159) {
                        if (ordinal != 160) {
                            switch (ordinal) {
                                case 162:
                                    if (clientEventData2.mo81913d(Bundle.class)) {
                                        bundle = (Bundle) clientEventData2.mo81912b(Bundle.class);
                                    } else {
                                        bundle = new Bundle();
                                    }
                                    C96731e eVar2 = kVar.f270609f;
                                    C139921f fVar2 = kVar.f270610g;
                                    Objects.requireNonNull(fVar2);
                                    eVar2.mo90327g(bundle, new C96735i(fVar2));
                                    break;
                                case 163:
                                    C59104x d4 = C96737k.f270604a.mo56226d();
                                    d4.mo56378ag(C58975e.f156826a, "LensSessionSubCtrlr");
                                    ((C59052c) ((C59052c) d4).mo56372aa(20885)).mo56386p("AGSA receives LENS_SERVICE_START_STREAMING event; no-op");
                                    break;
                                case 164:
                                    C96731e eVar3 = kVar.f270609f;
                                    if (clientEventData2.mo81913d(Bundle.class)) {
                                        bundle2 = (Bundle) clientEventData2.mo81912b(Bundle.class);
                                    } else {
                                        bundle2 = new Bundle();
                                    }
                                    eVar3.mo90327g(bundle2, new C96736j(kVar));
                                    break;
                                default:
                                    C59104x d5 = C96737k.f270604a.mo56226d();
                                    d5.mo56378ag(C58975e.f156826a, "LensSessionSubCtrlr");
                                    ((C59052c) ((C59052c) d5).mo56372aa(20883)).mo56387q("Invalid client event id: %s", a2.f237476dL);
                                    break;
                            }
                        } else {
                            C62940bt btVar5 = C87932iy.f237848a;
                            C87741bw bwVar3 = clientEventData2.f236955a;
                            C62940bt r35 = C62942bv.checkIsLite(btVar5);
                            bwVar3.mo58887l(r35);
                            C58838bb.m90868c(bwVar3.f169962ag.mo58857o(r35.f169971d));
                            C62940bt btVar6 = C87932iy.f237848a;
                            C87741bw bwVar4 = clientEventData2.f236955a;
                            C62940bt r36 = C62942bv.checkIsLite(btVar6);
                            bwVar4.mo58887l(r36);
                            Object l3 = bwVar4.f169962ag.mo58854l(r36.f169971d);
                            if (l3 == null) {
                                obj3 = r36.f169969b;
                            } else {
                                obj3 = r36.mo58889c(l3);
                            }
                            kVar.f270609f.mo90326f(((C87935ja) obj3).f237853b);
                            C87684al alVar2 = new C87684al(C88244um.LENS_SERVICE_API_VERSION);
                            C62940bt btVar7 = C87936jb.f237854a;
                            C87937jc jcVar = (C87937jc) C87956jv.f237889h.createBuilder();
                            int a4 = kVar.f270609f.mo90321a();
                            jcVar.copyOnWrite();
                            C87956jv jvVar = (C87956jv) jcVar.instance;
                            jvVar.f237891a = 1 | jvVar.f237891a;
                            jvVar.f237892b = a4;
                            C87955ju c = kVar.f270609f.mo90323c();
                            jcVar.copyOnWrite();
                            C87956jv jvVar2 = (C87956jv) jcVar.instance;
                            c.getClass();
                            jvVar2.f237893c = c;
                            jvVar2.f237891a |= 2;
                            C87953js b = kVar.f270609f.mo90322b();
                            jcVar.copyOnWrite();
                            C87956jv jvVar3 = (C87956jv) jcVar.instance;
                            b.getClass();
                            jvVar3.f237894d = b;
                            jvVar3.f237891a |= 4;
                            int j2 = kVar.f270609f.mo90330j();
                            jcVar.copyOnWrite();
                            C87956jv jvVar4 = (C87956jv) jcVar.instance;
                            int i10 = j2 - 2;
                            if (j2 != 0) {
                                jvVar4.f237895e = i10;
                                jvVar4.f237891a |= 8;
                                int h2 = kVar.f270609f.mo90328h();
                                jcVar.copyOnWrite();
                                C87956jv jvVar5 = (C87956jv) jcVar.instance;
                                int i11 = h2 - 2;
                                if (h2 != 0) {
                                    jvVar5.f237896f = i11;
                                    jvVar5.f237891a |= 16;
                                    int i12 = kVar.f270609f.mo90329i();
                                    jcVar.copyOnWrite();
                                    C87956jv jvVar6 = (C87956jv) jcVar.instance;
                                    int i13 = i12 - 2;
                                    if (i12 != 0) {
                                        jvVar6.f237897g = i13;
                                        jvVar6.f237891a |= 32;
                                        alVar2.mo81965b(btVar7, (C87956jv) jcVar.build());
                                        kVar.f270608e.mo90332a(alVar2.mo81964a());
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                } else {
                    Parcelable b2 = clientEventData2.mo81912b(Parcelable.class);
                    if (b2 instanceof Uri) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("uri", b2);
                        kVar.f270609f.mo90324d(bundle3);
                    } else if (b2 instanceof Bundle) {
                        kVar.f270609f.mo90324d((Bundle) b2);
                    } else {
                        throw new IllegalArgumentException("Invalid Image Inject event.");
                    }
                }
            } else {
                C86124t tVar2 = this.f270600i;
                if (C87739bu.LENS_SERVICE_SDK_CLIENT_EVENT == a && tVar2.mo79746e(C89997bc.f246821r)) {
                    C96730d dVar3 = this.f270597f;
                    Bundle bundle4 = (Bundle) clientEventData2.mo81912b(Bundle.class);
                    if (dVar3.f270565b.isPresent() && dVar3.f270567d != null) {
                        C59104x b3 = C96730d.f270564a.mo56224b();
                        b3.mo56378ag(C58975e.f156826a, "LensSdkSessionCtrlr");
                        ((C59052c) ((C59052c) b3).mo56372aa(20861)).mo56389s("Handling client event, sessionProcessor %s is present.", dVar3.f270565b.get());
                        C24917b bVar = dVar3.f270567d;
                        bVar.getClass();
                        ((C24928m) dVar3.f270565b.get()).mo30142a(bVar, bundle4);
                    }
                }
            }
            Trace.endSection();
        }
    }

    /* renamed from: g */
    public final void mo80294g(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: h */
    public final void mo80295h() {
        C96730d dVar = this.f270597f;
        if (dVar.f270565b.isPresent()) {
            ((C24928m) dVar.f270565b.get()).mo30145d();
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        if (r3 == false) goto L_0x00bc;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80296i(com.google.android.apps.gsa.search.core.service.p6851f.C86697a r10) {
        /*
            r9 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.f270595a = r10
            com.google.android.apps.gsa.staticplugins.bs.f.k r0 = r9.f270596e
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.p7554bs.p7560f.C96737k.f270604a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "LensSessionSubCtrlr"
            r1.mo56378ag(r2, r3)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 20889(0x5199, float:2.9272E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = r10
            com.google.android.apps.gsa.search.core.service.r r2 = (com.google.android.apps.gsa.search.core.service.C86775r) r2
            long r3 = r2.f234389k
            java.lang.String r5 = "onNewClient(%d)"
            r1.mo56388r(r5, r3)
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = r2.f234384f
            int r1 = r1.f236954g
            com.google.android.apps.gsa.staticplugins.bs.f.e r3 = r0.f270609f
            r3.mo90325e(r1)
            r3 = -1
            if (r1 == r3) goto L_0x005c
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f270607d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C89997bc.f246818o
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x005c
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r4 = "session_id"
            long r5 = r0.f270611h
            r1.putLong(r4, r5)
            com.google.android.apps.gsa.search.shared.service.al r4 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.LENS_SERVICE_SESSION_STARTED
            r4.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r5)
            r4.mo81966c(r1)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r1 = r4.mo81964a()
            com.google.android.apps.gsa.staticplugins.bs.f.g r0 = r0.f270608e
            r0.mo90332a(r1)
        L_0x005c:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r2.f234384f
            int r0 = r0.f236954g
            r1 = 0
            r2 = 1
            if (r0 != r3) goto L_0x0067
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            goto L_0x0096
        L_0x0067:
            android.content.pm.PackageManager r4 = r9.f270599h
            java.lang.String[] r4 = r4.getPackagesForUid(r0)
            r5 = 0
            if (r4 == 0) goto L_0x0095
            int r6 = r4.length
            if (r6 != 0) goto L_0x0074
            goto L_0x0095
        L_0x0074:
            if (r6 <= r2) goto L_0x0092
            com.google.common.f.e r5 = f270593c
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "LensSessionCtrlr"
            r5.mo56378ag(r7, r8)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            r7 = 20869(0x5185, float:2.9244E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r7)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.String r7 = "There were %d packages instead of the expected 1. Ignoring extra packages... [%s]"
            r5.mo56395y(r7, r6, r4)
        L_0x0092:
            r4 = r4[r1]
            goto L_0x0096
        L_0x0095:
            r4 = r5
        L_0x0096:
            if (r0 != r3) goto L_0x009a
        L_0x0098:
            r1 = 1
            goto L_0x00bc
        L_0x009a:
            com.google.android.gms.common.ac r3 = r9.f270598g
            boolean r0 = r3.mo119085d(r0)
            com.google.android.apps.gsa.search.core.i.t r3 = r9.f270600i
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C89997bc.f246824u
            com.google.common.b.gu r3 = r3.mo79745c(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x00b6
            boolean r3 = com.google.android.apps.gsa.shared.util.C90772bp.m148274A(r3, r4)
            if (r3 == 0) goto L_0x00b6
            r3 = 1
            goto L_0x00b7
        L_0x00b6:
            r3 = 0
        L_0x00b7:
            if (r0 != 0) goto L_0x0098
            if (r3 == 0) goto L_0x00bc
            goto L_0x0098
        L_0x00bc:
            r9.f270601j = r1
            com.google.android.apps.gsa.staticplugins.bs.f.d r0 = r9.f270597f
            r0.f270566c = r10
            com.google.android.libraries.lens.sdk.c.b r10 = new com.google.android.libraries.lens.sdk.c.b
            r10.<init>()
            r0.f270567d = r10
            j$.util.Optional r10 = r0.f270565b
            boolean r10 = r10.isPresent()
            if (r10 == 0) goto L_0x00e1
            j$.util.Optional r10 = r0.f270565b
            java.lang.Object r10 = r10.get()
            com.google.android.libraries.lens.sdk.c.m r10 = (com.google.android.libraries.lens.sdk.p2045c.C24928m) r10
            com.google.android.apps.gsa.staticplugins.bs.f.c r1 = new com.google.android.apps.gsa.staticplugins.bs.f.c
            r1.<init>(r0)
            r10.mo30143b(r1)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7554bs.p7560f.C96734h.mo80296i(com.google.android.apps.gsa.search.core.service.f.a):void");
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f270596e.f270611h = j;
        C96730d dVar = this.f270597f;
        if (dVar.f270565b.isPresent()) {
            ((C24928m) dVar.f270565b.get()).mo30144c(j);
        }
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
