package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14277dg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14278dh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14288dr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14307ej;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14322ey;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14329fe;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14498ll;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import java.util.ArrayList;
import p001a.p007b.p011b.p012a.C0025a;
import p001a.p007b.p011b.p012a.C0027c;
import p001a.p007b.p011b.p012a.C0028d;
import p001a.p007b.p011b.p012a.C0029e;
import p001a.p007b.p011b.p012a.C0030f;
import p001a.p007b.p011b.p012a.C0031g;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.k */
/* compiled from: PG */
public final /* synthetic */ class C109597k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C109578ae f305221a;

    /* renamed from: b */
    public final /* synthetic */ boolean f305222b;

    /* renamed from: c */
    public final /* synthetic */ C14499lm f305223c;

    /* renamed from: d */
    public final /* synthetic */ C14324f f305224d;

    public /* synthetic */ C109597k(C109578ae aeVar, boolean z, C14499lm lmVar, C14324f fVar) {
        this.f305221a = aeVar;
        this.f305222b = z;
        this.f305223c = lmVar;
        this.f305224d = fVar;
    }

    public final void accept(Object obj) {
        C14278dh dhVar;
        Optional optional;
        C14329fe feVar;
        C14288dr drVar;
        C14307ej ejVar;
        C14322ey eyVar;
        C14278dh dhVar2;
        C14288dr drVar2;
        C109578ae aeVar = this.f305221a;
        boolean z = this.f305222b;
        C14499lm lmVar = this.f305223c;
        C14324f fVar = this.f305224d;
        C108100a aVar = (C108100a) obj;
        int i = 1;
        aVar.mo96441f(!z);
        if (aeVar.f305174j.mo79746e(C90051dc.f248839au)) {
            ArrayList arrayList = new ArrayList();
            if (lmVar != null) {
                C88244um umVar = C88244um.ATTACH_WEBVIEW;
                int i2 = lmVar.f43850a;
                int a = C14498ll.m30626a(i2);
                int i3 = a - 1;
                if (a == 0) {
                    throw null;
                } else if (i3 == 1) {
                    if (i2 == 3) {
                        dhVar2 = (C14278dh) lmVar.f43851b;
                    } else {
                        dhVar2 = C14278dh.f43183g;
                    }
                    int i4 = dhVar2.f43185a;
                    int a2 = C14277dg.m30593a(i4);
                    int i5 = a2 - 1;
                    if (a2 == 0) {
                        throw null;
                    } else if (i5 == 3) {
                        if (i4 == 4) {
                            drVar2 = (C14288dr) dhVar2.f43186b;
                        } else {
                            drVar2 = C14288dr.f43223h;
                        }
                        for (C14292dv dvVar : drVar2.f43230f) {
                            C0028d dVar = (C0028d) C0029e.f87d.createBuilder();
                            String str = dvVar.f43241g;
                            dVar.copyOnWrite();
                            str.getClass();
                            ((C0029e) dVar.instance).f89a = str;
                            C14216b bVar = dvVar.f43239e;
                            if (bVar == null) {
                                bVar = C14216b.f43007f;
                            }
                            String str2 = bVar.f43011c;
                            dVar.copyOnWrite();
                            str2.getClass();
                            ((C0029e) dVar.instance).f90b = str2;
                            String str3 = dvVar.f43243i;
                            dVar.copyOnWrite();
                            str3.getClass();
                            ((C0029e) dVar.instance).f91c = str3;
                            arrayList.add((C0029e) dVar.build());
                        }
                    }
                }
            }
            aVar.f300692f = arrayList;
        }
        C0030f fVar2 = (C0030f) C0031g.f92d.createBuilder();
        if (aeVar.f305174j.mo79746e(C90051dc.f248826ah)) {
            if (lmVar.f43850a == 3) {
                dhVar = (C14278dh) lmVar.f43851b;
            } else {
                dhVar = C14278dh.f43183g;
            }
            C88244um umVar2 = C88244um.ATTACH_WEBVIEW;
            int i6 = dhVar.f43185a;
            int a3 = C14277dg.m30593a(i6);
            int i7 = a3 - 1;
            if (a3 != 0) {
                switch (i7) {
                    case 0:
                    case 1:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        optional = Optional.empty();
                        break;
                    case 2:
                        if (i6 == 3) {
                            feVar = (C14329fe) dhVar.f43186b;
                        } else {
                            feVar = C14329fe.f43345c;
                        }
                        C14333fi fiVar = feVar.f43348b;
                        if (fiVar == null) {
                            fiVar = C14333fi.f43350q;
                        }
                        C14216b bVar2 = fiVar.f43356e;
                        if (bVar2 == null) {
                            bVar2 = C14216b.f43007f;
                        }
                        optional = C109578ae.m182333k(bVar2);
                        break;
                    case 3:
                        if (i6 == 4) {
                            drVar = (C14288dr) dhVar.f43186b;
                        } else {
                            drVar = C14288dr.f43223h;
                        }
                        C14216b bVar3 = drVar.f43225a;
                        if (bVar3 == null) {
                            bVar3 = C14216b.f43007f;
                        }
                        optional = C109578ae.m182333k(bVar3);
                        break;
                    case 4:
                        if (i6 == 14) {
                            ejVar = (C14307ej) dhVar.f43186b;
                        } else {
                            ejVar = C14307ej.f43274i;
                        }
                        C14216b bVar4 = ejVar.f43276a;
                        if (bVar4 == null) {
                            bVar4 = C14216b.f43007f;
                        }
                        optional = C109578ae.m182333k(bVar4);
                        break;
                    case 5:
                        if (i6 == 15) {
                            eyVar = (C14322ey) dhVar.f43186b;
                        } else {
                            eyVar = C14322ey.f43322f;
                        }
                        C14216b bVar5 = eyVar.f43324a;
                        if (bVar5 == null) {
                            bVar5 = C14216b.f43007f;
                        }
                        optional = C109578ae.m182333k(bVar5);
                        break;
                    default:
                        optional = Optional.empty();
                        break;
                }
                if (optional.isPresent()) {
                    String str4 = (String) optional.get();
                    fVar2.copyOnWrite();
                    str4.getClass();
                    ((C0031g) fVar2.instance).f96c = str4;
                }
            } else {
                throw null;
            }
        }
        C0027c a4 = C0027c.m9a(fVar.f43332a);
        if (a4 == null) {
            a4 = C0027c.UNRECOGNIZED;
        }
        fVar2.copyOnWrite();
        ((C0031g) fVar2.instance).f94a = a4.getNumber();
        int c = C0025a.m8c(fVar.f43333b);
        if (c != 0) {
            i = c;
        }
        fVar2.copyOnWrite();
        ((C0031g) fVar2.instance).f95b = C0025a.m7b(i);
        aVar.f300691e = (C0031g) fVar2.build();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
