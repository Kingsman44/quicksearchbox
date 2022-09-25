package com.google.android.apps.gsa.staticplugins.images.viewer.p8016b;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.p6489a.p6490a.C84336a;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.images.p8013a.C102254d;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102262a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102266e;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102267f;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102268g;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102269h;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102270i;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8015a.C102284w;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a.C64629b;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65935m;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.b.c */
/* compiled from: PG */
public final class C102290c implements C23113i {

    /* renamed from: a */
    private final C102288a f285408a;

    public C102290c(C102288a aVar) {
        this.f285408a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        Object obj;
        if ("ImagePageEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("close")) {
                ((C102270i) this.f285408a).f285367n.mo93058a();
            } else if (str.equals("downloadImageToLocalStorage")) {
                C102270i iVar = (C102270i) this.f285408a;
                iVar.f285355b.mo28212l("Image viewer image downloader", new C102266e(iVar));
            } else if (str.equals("onPrimaryItem")) {
                C102270i iVar2 = (C102270i) this.f285408a;
                if (!iVar2.f285369p) {
                    C64629b bVar = (C64629b) ((C102262a) iVar2.f285354a).f285330a.f63720e;
                    if (C102270i.m169517j(bVar)) {
                        iVar2.f285369p = true;
                        C22871g gVar = iVar2.f285363j;
                        C102254d dVar = iVar2.f285360g;
                        String str3 = bVar.f175191d;
                        C65930h hVar = bVar.f175189b;
                        if (hVar == null) {
                            hVar = C65930h.f179300i;
                        }
                        String str4 = hVar.f179303b;
                        C65930h hVar2 = bVar.f175189b;
                        if (hVar2 == null) {
                            hVar2 = C65930h.f179300i;
                        }
                        C62940bt r3 = C62942bv.checkIsLite(C65937o.f179333l);
                        hVar2.mo58887l(r3);
                        Object l = hVar2.f169962ag.mo58854l(r3.f169971d);
                        if (l == null) {
                            obj = r3.f169969b;
                        } else {
                            obj = r3.mo58889c(l);
                        }
                        gVar.mo28211k(dVar.mo93043e(str3, str4, ((C65937o) obj).f179337c), "related images callback", new C102269h(iVar2));
                    }
                }
            } else if (str.equals("openImageSearchQuery_java.lang.String")) {
                String string = pVar.f63472a.getString("query");
                string.getClass();
                C102288a aVar = this.f285408a;
                C90498f i = Query.f252741b.mo84480i();
                i.mo84588t("web.isch", false);
                i.mo84546E(string);
                ((C102270i) aVar).mo93050h(i.mo84568a());
            } else if (str.equals("openRelatedImage_int")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("index")).intValue();
                C102270i iVar3 = (C102270i) this.f285408a;
                C102284w wVar = iVar3.f285362i;
                C65926d dVar2 = ((C65949b) ((C102262a) iVar3.f285354a).f285332c.f63720e).f179371b;
                if (dVar2 == null) {
                    dVar2 = C65926d.f179289b;
                }
                wVar.mo93057a(dVar2, intValue);
            } else if (str.equals("openUrl_java.lang.String")) {
                String string2 = pVar.f63472a.getString("url");
                string2.getClass();
                C102288a aVar2 = this.f285408a;
                Uri parse = Uri.parse(string2);
                if (parse.getHost() == null) {
                    String uri = ((C102270i) aVar2).f285365l.mo77868a().toString();
                    if (uri.endsWith("/")) {
                        uri = uri.substring(0, uri.length() - 1);
                    }
                    if (!string2.startsWith("/")) {
                        string2 = "/".concat(string2);
                    }
                    parse = Uri.parse(String.valueOf(uri).concat(string2));
                }
                ((C102270i) aVar2).f285361h.mo65089a(new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(parse));
            } else if (str.equals("sendFeedback_com.google.android.apps.gsa.shared.util.DummyParcelable<com.google.android.apps.gsa.shared.feedback.FeedbackDataBuilder>")) {
                ((C102270i) this.f285408a).f285358e.mo84209b((C90461c) ((DummyParcelable) new C23269n().mo28733b("feedbackDataParcel", pVar)).f253766a, 1);
            } else if (str.equals("shareImageSearchResult")) {
                C102270i iVar4 = (C102270i) this.f285408a;
                C65930h hVar3 = ((C64629b) ((C102262a) iVar4.f285354a).f285330a.f63720e).f175189b;
                if (hVar3 == null) {
                    hVar3 = C65930h.f179300i;
                }
                iVar4.f285363j.mo28211k(iVar4.f285360g.mo93042d(hVar3), "Share link callback", new C102267f(iVar4, hVar3));
            } else if (str.equals("sharePersonalPhoto")) {
                C102270i iVar5 = (C102270i) this.f285408a;
                C65930h hVar4 = ((C64629b) ((C102262a) iVar5.f285354a).f285330a.f63720e).f175189b;
                if (hVar4 == null) {
                    hVar4 = C65930h.f179300i;
                }
                C62940bt r9 = C62942bv.checkIsLite(C65935m.f179324d);
                hVar4.mo58887l(r9);
                if (hVar4.f169962ag.mo58857o(r9.f169971d)) {
                    C22871g gVar2 = iVar5.f285355b;
                    C91189au auVar = iVar5.f285368o;
                    C65928f fVar = hVar4.f179305d;
                    if (fVar == null) {
                        fVar = C65928f.f179293f;
                    }
                    gVar2.mo28211k(auVar.mo85424l(Uri.parse(fVar.f179296b), C58833ax.m90834k(Bitmap.CompressFormat.PNG)), "Share personal photo", new C102268g(iVar5));
                    return;
                }
                C65928f fVar2 = hVar4.f179305d;
                if (fVar2 == null) {
                    fVar2 = C65928f.f179293f;
                }
                String str5 = fVar2.f179296b;
                Uri parse2 = Uri.parse(str5);
                String scheme = parse2.getScheme();
                if (!TextUtils.isEmpty(scheme)) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    if (scheme.equals("http") || scheme.equals("https")) {
                        intent.putExtra("android.intent.extra.TEXT", str5);
                        intent.setType("text/plain");
                    } else if (scheme.equals("content")) {
                        intent.putExtra("android.intent.extra.STREAM", parse2);
                        intent.setType("image/*");
                    } else {
                        return;
                    }
                    iVar5.f285361h.mo65089a(Intent.createChooser(intent, (CharSequence) null));
                }
            } else if (str.equals("updateSavedState_com.google.protos.gws.common.images.ImageMetadataOuterClass.ImageMetadata_boolean")) {
                boolean booleanValue = Boolean.valueOf(pVar.f63472a.getBoolean("save")).booleanValue();
                ((C102270i) this.f285408a).f285359f.mo93056a((C65930h) new C23271p(C65930h.f179300i.getParserForType(), C62921ba.m95368a(), C65930h.f179300i).mo28733b("image", pVar), booleanValue);
            } else if (str.equals("viewAllRelatedImages")) {
                C102270i iVar6 = (C102270i) this.f285408a;
                String str6 = ((C65949b) ((C102262a) iVar6.f285354a).f285332c.f63720e).f179372c;
                if (str6.startsWith("/")) {
                    str6 = str6.replace(":", "%3A");
                }
                String queryParameter = Uri.parse(str6).getQueryParameter("tbs");
                Query aE = Query.f252741b.mo84268aE(((C64629b) ((C102262a) iVar6.f285354a).f285330a.f63720e).f175191d, false);
                queryParameter.getClass();
                C90498f i2 = aE.mo84480i();
                i2.mo84588t("web.isch", false);
                i2.mo84560S(queryParameter);
                iVar6.mo93050h(i2.mo84568a());
            } else if (str.equals("viewSaved")) {
                C102270i iVar7 = (C102270i) this.f285408a;
                C91097g gVar3 = iVar7.f285361h;
                C84336a aVar3 = iVar7.f285364k;
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(aVar3.f229525a.mo77869b(aVar3.f229525a.mo77868a().buildUpon().path("save").build().toString())));
                intent2.putExtra("full_screen", true);
                ComponentName componentName = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.dynamichosts.NoOrientationConfigVelvetDynamicHostActivity");
                Uri.Builder appendPath = new Uri.Builder().scheme("dynact").authority("legacy").appendPath("velour").appendPath("inappwebpage");
                Uri data = intent2.getData();
                if (data != null) {
                    appendPath.appendQueryParameter("data", data.toString());
                }
                Intent intent3 = new Intent(intent2.getAction(), appendPath.build());
                intent3.addFlags(intent2.getFlags());
                intent3.setComponent(componentName);
                intent3.putExtra("com.google.android.libraries.velour.INNER_INTENT", intent2);
                gVar3.mo65089a(intent3);
            }
        }
    }
}
