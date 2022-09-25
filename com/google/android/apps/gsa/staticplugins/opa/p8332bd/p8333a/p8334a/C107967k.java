package com.google.android.apps.gsa.staticplugins.opa.p8332bd.p8333a.p8334a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8839t.p8847h.C118443s;
import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p422e.p423a.p424a.p425a.p426a.C8601a;
import com.google.p395al.p422e.p423a.p424a.p425a.p426a.C8602b;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57737a;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57738b;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.C66179cx;
import com.google.protos.youtube.elements.C66180cy;
import com.google.protos.youtube.elements.C66181cz;
import com.google.protos.youtube.elements.C66187da;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bd.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C107967k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107970n f300410a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f300411b;

    public /* synthetic */ C107967k(C107970n nVar, C53306j jVar) {
        this.f300410a = nVar;
        this.f300411b = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar;
        MediaDescriptionCompat mediaDescriptionCompat;
        C107970n nVar = this.f300410a;
        C53306j jVar = this.f300411b;
        C58833ax axVar2 = (C58833ax) obj;
        if (axVar2 == null || !axVar2.mo56113h()) {
            ((C59052c) ((C59052c) C107970n.f300422a.mo56226d()).mo56372aa(26914)).mo56386p("No client media lists from MediaManager");
            return C57738b.f154252b;
        }
        if (axVar2.mo56113h()) {
            nVar.f300431j.mo28210j(C118443s.m196634b((C18913ab) axVar2.mo56107c(), nVar.f300432k, 2, nVar.f300437p, nVar.f300431j, false), "Update proactive cache", new C107965i(nVar));
        }
        C18913ab abVar = (C18913ab) axVar2.mo56107c();
        String packageName = abVar.mo24143a().getPackageName();
        ((C59052c) ((C59052c) C107970n.f300422a.mo56224b()).mo56372aa(26915)).mo56352E("MediaItem from App {%s} size (%s}", packageName, abVar.mo24150g().size());
        if ((nVar.f300435n.contains(jVar.name()) && !nVar.f300429h.mo81719a(packageName)) || abVar.mo24150g().isEmpty()) {
            return C57738b.f154252b;
        }
        C58833ax b = nVar.mo96348b(packageName);
        C58833ax a = nVar.mo96347a(nVar.f300436o, abVar.mo24143a());
        C58833ax c = C107970n.m179252c(nVar.f300423b, packageName);
        ArrayList arrayList = new ArrayList();
        for (MediaBrowserCompat.MediaItem mediaItem : abVar.mo24150g()) {
            String packageName2 = abVar.mo24143a().getPackageName();
            if (C58837ba.m90859h(mediaItem.f930b.f932a) || (mediaDescriptionCompat = mediaItem.f930b) == null) {
                ((C59052c) ((C59052c) C107970n.f300422a.mo56226d()).mo56372aa(26904)).mo56386p("Media ID or Description is empty or NULL");
                axVar = C58836b.f156633a;
            } else {
                CharSequence charSequence = mediaDescriptionCompat.f933b;
                String str = BuildConfig.FLAVOR;
                String obj2 = charSequence != null ? charSequence.toString() : str;
                CharSequence charSequence2 = mediaDescriptionCompat.f934c;
                String obj3 = charSequence2 != null ? charSequence2.toString() : str;
                Uri uri = mediaDescriptionCompat.f937f;
                if (uri != null) {
                    str = uri.toString();
                }
                Bitmap bitmap = mediaDescriptionCompat.f936e;
                if (obj2.isEmpty() || (str.isEmpty() && bitmap == null)) {
                    ((C59052c) ((C59052c) C107970n.f300422a.mo56226d()).mo56372aa(26905)).mo56389s("Missing key description content {%s}.", mediaItem.f930b.f932a);
                    axVar = C58836b.f156633a;
                } else {
                    C8601a aVar = (C8601a) C8602b.f29817k.createBuilder();
                    aVar.copyOnWrite();
                    C8602b bVar = (C8602b) aVar.instance;
                    obj2.getClass();
                    bVar.f29819a |= 1;
                    bVar.f29824f = obj2;
                    aVar.copyOnWrite();
                    C8602b bVar2 = (C8602b) aVar.instance;
                    obj3.getClass();
                    bVar2.f29819a |= 32;
                    bVar2.f29825g = obj3;
                    aVar.copyOnWrite();
                    C8602b bVar3 = (C8602b) aVar.instance;
                    str.getClass();
                    bVar3.f29820b = 4;
                    bVar3.f29821c = str;
                    String str2 = mediaItem.f930b.f932a;
                    str2.getClass();
                    String d = C107970n.m179253d(packageName2, str2);
                    aVar.copyOnWrite();
                    C8602b bVar4 = (C8602b) aVar.instance;
                    d.getClass();
                    bVar4.f29819a |= 256;
                    bVar4.f29826h = d;
                    if (jVar != null && jVar.equals(C53306j.MAIN_APP)) {
                        aVar.copyOnWrite();
                        C8602b bVar5 = (C8602b) aVar.instance;
                        bVar5.f29819a |= 512;
                        bVar5.f29827i = 101571;
                    }
                    if (bitmap != null) {
                        C63087y v = C63088z.m96150v();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
                        C66179cx cxVar = (C66179cx) C66180cy.f179956b.createBuilder();
                        C66181cz czVar = (C66181cz) C66187da.f179977f.createBuilder();
                        C63088z b2 = v.mo59165b();
                        czVar.copyOnWrite();
                        C66187da daVar = (C66187da) czVar.instance;
                        b2.getClass();
                        daVar.f179980b = 2;
                        daVar.f179981c = b2;
                        cxVar.mo59444a(czVar);
                        aVar.copyOnWrite();
                        C8602b bVar6 = (C8602b) aVar.instance;
                        C66180cy cyVar = (C66180cy) cxVar.build();
                        cyVar.getClass();
                        bVar6.f29821c = cyVar;
                        bVar6.f29820b = 16;
                    }
                    if (c.mo56113h()) {
                        String str3 = (String) c.mo56107c();
                        aVar.copyOnWrite();
                        C8602b bVar7 = (C8602b) aVar.instance;
                        str3.getClass();
                        bVar7.f29819a |= 4096;
                        bVar7.f29828j = str3;
                    }
                    if (b.mo56113h() && !((String) b.mo56107c()).isEmpty()) {
                        String str4 = (String) b.mo56107c();
                        aVar.copyOnWrite();
                        C8602b bVar8 = (C8602b) aVar.instance;
                        str4.getClass();
                        bVar8.f29822d = 9;
                        bVar8.f29823e = str4;
                    }
                    if (((C8602b) aVar.instance).f29822d != 9 && a.mo56113h()) {
                        C66179cx cxVar2 = (C66179cx) C66180cy.f179956b.createBuilder();
                        C66181cz czVar2 = (C66181cz) C66187da.f179977f.createBuilder();
                        C63088z A = C63088z.m96139A((byte[]) a.mo56107c());
                        czVar2.copyOnWrite();
                        C66187da daVar2 = (C66187da) czVar2.instance;
                        daVar2.f179980b = 2;
                        daVar2.f179981c = A;
                        cxVar2.mo59444a(czVar2);
                        aVar.copyOnWrite();
                        C8602b bVar9 = (C8602b) aVar.instance;
                        C66180cy cyVar2 = (C66180cy) cxVar2.build();
                        cyVar2.getClass();
                        bVar9.f29823e = cyVar2;
                        bVar9.f29822d = 14;
                    }
                    axVar = C58833ax.m90834k((C8602b) aVar.build());
                }
            }
            if (axVar.mo56113h()) {
                arrayList.add((C8602b) axVar.mo56107c());
            }
        }
        C57737a aVar2 = (C57737a) C57738b.f154252b.createBuilder();
        aVar2.mo54527a(arrayList);
        return (C57738b) aVar2.build();
    }
}
