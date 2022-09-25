package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90047cz;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58837ba;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57740d;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57741e;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.C66179cx;
import com.google.protos.youtube.elements.C66180cy;
import com.google.protos.youtube.elements.C66181cz;
import com.google.protos.youtube.elements.C66187da;
import java.io.ByteArrayOutputStream;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ju */
/* compiled from: PG */
public final /* synthetic */ class C108467ju implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C108474ka f301698a;

    /* renamed from: b */
    public final /* synthetic */ MediaMetadata f301699b;

    /* renamed from: c */
    public final /* synthetic */ C57741e f301700c;

    public /* synthetic */ C108467ju(C108474ka kaVar, MediaMetadata mediaMetadata, C57741e eVar) {
        this.f301698a = kaVar;
        this.f301699b = mediaMetadata;
        this.f301700c = eVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C108474ka kaVar = this.f301698a;
        MediaMetadata mediaMetadata = this.f301699b;
        C57741e eVar = this.f301700c;
        C57741e eVar2 = (C57741e) obj;
        if (mediaMetadata == null) {
            return eVar2;
        }
        C57740d dVar = (C57740d) eVar2.toBuilder();
        String string = mediaMetadata.getString("android.media.metadata.TITLE");
        if (C58837ba.m90859h(string)) {
            string = kaVar.f301714D.getString(R.string.unknown_media_info);
        }
        String string2 = mediaMetadata.getString("android.media.metadata.ARTIST");
        if (C58837ba.m90859h(string2)) {
            string2 = kaVar.f301714D.getString(R.string.unknown_media_info);
        }
        if (dVar != null) {
            C86124t tVar = kaVar.f301041w;
            if (tVar == null || !tVar.mo79746e(C90047cz.f248756b)) {
                String string3 = mediaMetadata.getString("android.media.metadata.ALBUM_ART_URI");
                if (C58837ba.m90859h(string3)) {
                    string3 = eVar.f154264f;
                }
                dVar.copyOnWrite();
                C57741e eVar3 = (C57741e) dVar.instance;
                string3.getClass();
                eVar3.f154259a |= 64;
                eVar3.f154264f = string3;
            } else {
                String string4 = mediaMetadata.getString("android.media.metadata.ALBUM_ART_URI");
                Bitmap bitmap = mediaMetadata.getBitmap("android.media.metadata.ALBUM_ART");
                if (!C58837ba.m90859h(string4)) {
                    dVar.copyOnWrite();
                    C57741e eVar4 = (C57741e) dVar.instance;
                    string4.getClass();
                    eVar4.f154259a |= 64;
                    eVar4.f154264f = string4;
                    C66179cx cxVar = (C66179cx) C66180cy.f179956b.createBuilder();
                    C66181cz czVar = (C66181cz) C66187da.f179977f.createBuilder();
                    czVar.copyOnWrite();
                    C66187da daVar = (C66187da) czVar.instance;
                    string4.getClass();
                    daVar.f179980b = 1;
                    daVar.f179981c = string4;
                    cxVar.mo59444a(czVar);
                    C66180cy cyVar = (C66180cy) cxVar.build();
                    dVar.copyOnWrite();
                    C57741e eVar5 = (C57741e) dVar.instance;
                    cyVar.getClass();
                    eVar5.f154263e = cyVar;
                    eVar5.f154259a |= 16;
                } else if (bitmap != null) {
                    dVar.copyOnWrite();
                    C57741e eVar6 = (C57741e) dVar.instance;
                    eVar6.f154259a &= -65;
                    eVar6.f154264f = C57741e.f154257j.f154264f;
                    C66179cx cxVar2 = (C66179cx) C66180cy.f179956b.createBuilder();
                    C66181cz czVar2 = (C66181cz) C66187da.f179977f.createBuilder();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    C63088z A = C63088z.m96139A(byteArrayOutputStream.toByteArray());
                    czVar2.copyOnWrite();
                    C66187da daVar2 = (C66187da) czVar2.instance;
                    daVar2.f179980b = 2;
                    daVar2.f179981c = A;
                    cxVar2.mo59444a(czVar2);
                    C66180cy cyVar2 = (C66180cy) cxVar2.build();
                    dVar.copyOnWrite();
                    C57741e eVar7 = (C57741e) dVar.instance;
                    cyVar2.getClass();
                    eVar7.f154263e = cyVar2;
                    eVar7.f154259a |= 16;
                } else {
                    C66180cy cyVar3 = eVar.f154263e;
                    if (cyVar3 == null) {
                        cyVar3 = C66180cy.f179956b;
                    }
                    if (cyVar3.f179958a.size() > 0) {
                        C66180cy cyVar4 = eVar.f154263e;
                        if (cyVar4 == null) {
                            cyVar4 = C66180cy.f179956b;
                        }
                        if (((C66187da) cyVar4.f179958a.get(0)).f179980b == 1) {
                            C66180cy cyVar5 = eVar.f154263e;
                            if (cyVar5 == null) {
                                cyVar5 = C66180cy.f179956b;
                            }
                            C66187da daVar3 = (C66187da) cyVar5.f179958a.get(0);
                            String str = daVar3.f179980b == 1 ? (String) daVar3.f179981c : BuildConfig.FLAVOR;
                            dVar.copyOnWrite();
                            C57741e eVar8 = (C57741e) dVar.instance;
                            str.getClass();
                            eVar8.f154259a |= 64;
                            eVar8.f154264f = str;
                            C66179cx cxVar3 = (C66179cx) C66180cy.f179956b.createBuilder();
                            C66181cz czVar3 = (C66181cz) C66187da.f179977f.createBuilder();
                            czVar3.copyOnWrite();
                            C66187da daVar4 = (C66187da) czVar3.instance;
                            str.getClass();
                            daVar4.f179980b = 1;
                            daVar4.f179981c = str;
                            cxVar3.mo59444a(czVar3);
                            C66180cy cyVar6 = (C66180cy) cxVar3.build();
                            dVar.copyOnWrite();
                            C57741e eVar9 = (C57741e) dVar.instance;
                            cyVar6.getClass();
                            eVar9.f154263e = cyVar6;
                            eVar9.f154259a |= 16;
                        }
                    }
                    String str2 = eVar.f154264f;
                    dVar.copyOnWrite();
                    C57741e eVar10 = (C57741e) dVar.instance;
                    str2.getClass();
                    eVar10.f154259a |= 64;
                    eVar10.f154264f = str2;
                }
            }
        }
        C63088z zVar = ((C108331et) kaVar.f301723g.mo27525b()).f301349h;
        if (zVar != null) {
            C66179cx cxVar4 = (C66179cx) C66180cy.f179956b.createBuilder();
            C66181cz czVar4 = (C66181cz) C66187da.f179977f.createBuilder();
            czVar4.copyOnWrite();
            C66187da daVar5 = (C66187da) czVar4.instance;
            daVar5.f179980b = 2;
            daVar5.f179981c = zVar;
            cxVar4.mo59444a(czVar4);
            C66180cy cyVar7 = (C66180cy) cxVar4.build();
            dVar.copyOnWrite();
            C57741e eVar11 = (C57741e) dVar.instance;
            cyVar7.getClass();
            eVar11.f154262d = cyVar7;
            eVar11.f154259a |= 8;
        }
        dVar.copyOnWrite();
        C57741e eVar12 = (C57741e) dVar.instance;
        string.getClass();
        eVar12.f154259a |= 1;
        eVar12.f154260b = string;
        dVar.copyOnWrite();
        C57741e eVar13 = (C57741e) dVar.instance;
        string2.getClass();
        eVar13.f154259a |= 2;
        eVar13.f154261c = string2;
        return (C57741e) dVar.build();
    }
}
