package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.dx;
import com.google.android.apps.gsa.assistant.settings.features.av.eb;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p3562ao.p3570b.p3571a.p3572a.p3573a.C45591b;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bh */
/* compiled from: PG */
public final class C101671bh {

    /* renamed from: a */
    public final C101664ba f283691a;

    /* renamed from: b */
    public final String f283692b;

    /* renamed from: c */
    public final ei f283693c;

    /* renamed from: d */
    public final dn f283694d;

    /* renamed from: e */
    public final C101672bi f283695e;

    /* renamed from: f */
    public final C90743b f283696f;

    /* renamed from: g */
    private final C74555u f283697g;

    public C101671bh(C101664ba baVar, C101644ah ahVar, C74555u uVar, ei eiVar, dn dnVar, C101672bi biVar, C90743b bVar) {
        String str;
        this.f283691a = baVar;
        bh bhVar = ahVar.f283627b;
        bhVar = bhVar == null ? bh.c : bhVar;
        int i = 2;
        String str2 = bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR;
        this.f283692b = str2;
        this.f283697g = uVar;
        this.f283693c = eiVar;
        this.f283694d = dnVar;
        biVar.f283702e = str2;
        boolean f = biVar.f283699b.f(str2);
        boolean anyMatch = Collection.EL.stream(biVar.f283699b.a.b.f129041a).anyMatch(new dx(str2));
        boolean anyMatch2 = Collection.EL.stream(biVar.f283699b.a.b.f129041a).anyMatch(new eb(str2));
        boolean e = biVar.f283699b.e(str2);
        if (!f) {
            biVar.f283703f = true == anyMatch ? 3 : i;
        } else {
            biVar.f283703f = !e ? true != anyMatch ? 4 : 5 : !anyMatch ? 6 : true != anyMatch2 ? 7 : 8;
        }
        C59104x b = C101672bi.f283698a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SLAPRConsentVersionHelper");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(20417);
        int i2 = biVar.f283703f;
        switch (i2) {
            case 1:
                str = "UNINITIALIZED";
                break;
            case 2:
                str = "V1";
                break;
            case 3:
                str = "V2";
                break;
            case 4:
                str = "V3";
                break;
            case 5:
                str = "V4";
                break;
            case 6:
                str = "V5";
                break;
            case 7:
                str = "V6";
                break;
            case 8:
                str = "V7";
                break;
            default:
                str = "null";
                break;
        }
        if (i2 != 0) {
            cVar.mo56389s("Structure personal results consent initialized with version %s", str);
            this.f283695e = biVar;
            this.f283696f = bVar;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final ar mo92479a() {
        C45591b bVar;
        aq createBuilder = ar.f.createBuilder();
        C45595b i = dn.i(this.f283697g.mo70883a());
        createBuilder.copyOnWrite();
        ar arVar = createBuilder.instance;
        arVar.b = i.f119929nK;
        arVar.a |= 1;
        int i2 = this.f283695e.f283703f;
        int i3 = i2 - 1;
        if (i2 != 0) {
            switch (i3) {
                case 1:
                    bVar = C45591b.V1;
                    break;
                case 2:
                    bVar = C45591b.V2;
                    break;
                case 3:
                    bVar = C45591b.V3;
                    break;
                case 4:
                    bVar = C45591b.V4;
                    break;
                case 5:
                    bVar = C45591b.V5;
                    break;
                case 6:
                    bVar = C45591b.V6;
                    break;
                case 7:
                    bVar = C45591b.V7;
                    break;
                default:
                    bVar = C45591b.STRUCTURE_LEVEL_CONSENT_VERSION_UNSPECIFIED;
                    break;
            }
            createBuilder.copyOnWrite();
            ar arVar2 = createBuilder.instance;
            arVar2.d = bVar.f119155i;
            arVar2.a |= 4;
            return createBuilder.build();
        }
        throw null;
    }

    /* renamed from: b */
    public final ItemView mo92480b(String str, int i) {
        ItemView itemView = new ItemView(this.f283691a.requireContext());
        itemView.p(str);
        itemView.h(i);
        return itemView;
    }

    /* renamed from: c */
    public final void mo92481c() {
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), this.f283691a);
    }
}
