package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4172bg.C55697ae;
import com.google.p4172bg.C55698af;
import com.google.p4172bg.C55699ag;
import com.google.p4172bg.C55700ah;
import com.google.p4172bg.C55701ai;
import com.google.p4172bg.C55702aj;
import com.google.p4172bg.C55703ak;
import com.google.p4172bg.C55704al;
import com.google.p4172bg.C55705am;
import com.google.p4172bg.C55706an;
import com.google.p4172bg.C55709aq;
import com.google.p4172bg.C55710ar;
import com.google.p4172bg.C55752m;
import com.google.p4172bg.C55753n;
import com.google.p4172bg.C55754o;
import com.google.p4172bg.C55755p;
import com.google.p4172bg.C55756q;
import com.google.p4172bg.C55757r;
import com.google.p4172bg.C55758s;
import com.google.p4172bg.C55760u;
import com.google.p4172bg.p4174b.C55713b;
import com.google.p4172bg.p4174b.C55722k;
import com.google.p4172bg.p4174b.C55723l;
import com.google.p4172bg.p4174b.C55724m;
import com.google.p4172bg.p4174b.C55725n;
import com.google.p4172bg.p4174b.C55726o;
import com.google.p4172bg.p4174b.C55727p;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p5137s.C65884a;
import com.google.protos.p5137s.C65885b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.aa */
/* compiled from: PG */
public final class C27813aa {

    /* renamed from: f */
    private static final C58974d f75871f = C58974d.m91135i("MigrateOcrMultiscriptTflite");

    /* renamed from: g */
    private static final C58495hd f75872g;

    /* renamed from: h */
    private static final Map f75873h = new HashMap();

    /* renamed from: a */
    public final C63088z f75874a;

    /* renamed from: b */
    public final C63088z f75875b;

    /* renamed from: c */
    public final C63088z f75876c;

    /* renamed from: d */
    public final C63088z f75877d;

    /* renamed from: e */
    public final C63088z f75878e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("latin", "Latn");
        gzVar.mo55429h("chinese", "Hani");
        gzVar.mo55429h("japanese", "Jpan");
        gzVar.mo55429h("korean", "Kore");
        gzVar.mo55429h("cyrillic", "Cyrl");
        gzVar.mo55429h("devanagari,bengali", "Deva");
        gzVar.mo55429h("tamil", "Taml");
        gzVar.mo55429h("telugu", "Telu");
        gzVar.mo55429h("telugu,kannada", "Telu");
        gzVar.mo55429h("thai", "Thai");
        gzVar.mo55429h("greek", "Grek");
        gzVar.mo55429h("arabic", "Arab");
        gzVar.mo55429h("georgian", "Geor");
        gzVar.mo55429h("hebrew", "Hebr");
        gzVar.mo55429h("gujarati", "Gujr");
        gzVar.mo55429h("kannada", "Knda");
        f75872g = gzVar.mo55427f(false);
    }

    private C27813aa(C63088z zVar, C63088z zVar2, C63088z zVar3, C63088z zVar4, C63088z zVar5) {
        this.f75874a = zVar;
        this.f75875b = zVar2;
        this.f75876c = zVar3;
        this.f75877d = zVar4;
        this.f75878e = zVar5;
    }

    /* renamed from: a */
    public static C58833ax m51829a(String str) {
        C58833ax axVar;
        C58833ax axVar2;
        FileInputStream fileInputStream;
        Throwable th;
        Throwable th2;
        Throwable th3;
        BufferedReader bufferedReader;
        Throwable th4;
        String concat = String.valueOf(str).concat("/engine.cfg");
        File file = new File(concat);
        if (!file.isFile()) {
            String concat2 = String.valueOf(str).concat("/rpn_lstm_engine_tflite_multiscript.bincfg");
            if (new File(concat2).isFile()) {
                axVar = C58833ax.m90834k(concat2);
            } else {
                axVar = C58836b.f156633a;
            }
        } else {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(concat);
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream2, StandardCharsets.UTF_8);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        if ("PhotoOcrEngine".equals(bufferedReader.readLine())) {
                            axVar = C58833ax.m90833j(str + "/" + bufferedReader.readLine());
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream2.close();
                        } else {
                            throw new IllegalArgumentException(String.format("Parsing of %s at %s failed. First line must be PhotoOcrEngine.", new Object[]{"engine.cfg", file.getAbsolutePath()}));
                        }
                    } catch (Throwable th5) {
                        th3 = th5;
                        inputStreamReader.close();
                        throw th3;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    fileInputStream2.close();
                    throw th2;
                }
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) f75871f.mo56225c()).mo56382g(e)).mo56372aa(50058)).mo56389s("Failed to parse %s", concat);
                axVar = C58836b.f156633a;
            } catch (Throwable th7) {
                C27843z.m51865a(th2, th7);
            }
        }
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C58974d dVar = f75871f;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50055)).mo56389s("PhotoOCR settings found at %s.", axVar.mo56107c());
        Map map = f75873h;
        if (!map.containsKey(axVar.mo56107c())) {
            try {
                String str2 = (String) axVar.mo56107c();
                File file2 = new File((String) axVar.mo56107c());
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(50053)).mo56389s("Parsing PhotoOcr engine configuration at %s", file2);
                fileInputStream = new FileInputStream(file2);
                C55713b bVar = (C55713b) C62942bv.parseFrom((C62942bv) C55713b.f146977q, (InputStream) fileInputStream, C62921ba.m95368a());
                fileInputStream.close();
                C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                gVar.copyOnWrite();
                ((C63070h) gVar.instance).f170217a = "type.googleapis.com/google_ocr.MultiPassLineRecognitionMutatorConfig";
                C55756q qVar = (C55756q) C55760u.f147139f.createBuilder();
                int i = 0;
                while (i < bVar.f146981c.size()) {
                    C55697ae aeVar = (C55697ae) C55698af.f146937e.createBuilder();
                    String str3 = (String) bVar.f146981c.get(i);
                    aeVar.copyOnWrite();
                    str3.getClass();
                    ((C55698af) aeVar.instance).f146939a = str3;
                    String str4 = (String) bVar.f146982d.get(i);
                    aeVar.copyOnWrite();
                    str4.getClass();
                    ((C55698af) aeVar.instance).f146940b = str4;
                    aeVar.copyOnWrite();
                    C55698af afVar = (C55698af) aeVar.instance;
                    afVar.f146941c = ".";
                    C55700ah ahVar = afVar.f146942d;
                    if (ahVar == null) {
                        ahVar = C55700ah.f146943d;
                    }
                    C55699ag agVar = (C55699ag) ahVar.toBuilder();
                    agVar.copyOnWrite();
                    C55700ah ahVar2 = (C55700ah) agVar.instance;
                    ahVar2.f146945a |= 2;
                    ahVar2.f146946b = (double) bVar.f146991m;
                    double d = (double) bVar.f146983e.mo58859d(i);
                    agVar.copyOnWrite();
                    C55700ah ahVar3 = (C55700ah) agVar.instance;
                    ahVar3.f146945a |= 4;
                    ahVar3.f146947c = d;
                    aeVar.copyOnWrite();
                    C55700ah ahVar4 = (C55700ah) agVar.build();
                    ahVar4.getClass();
                    ((C55698af) aeVar.instance).f146942d = ahVar4;
                    C58495hd hdVar = f75872g;
                    String str5 = (String) hdVar.get((String) bVar.f146990l.get(i));
                    if (str5 != null) {
                        C55757r rVar = (C55757r) C55758s.f147134c.createBuilder();
                        C55752m mVar = (C55752m) C55753n.f147125d.createBuilder();
                        mVar.copyOnWrite();
                        ((C55753n) mVar.instance).f147129c = "PhotoOcrLineRecognizer";
                        C63062g gVar2 = (C63062g) C63070h.f170215c.createBuilder();
                        gVar2.copyOnWrite();
                        ((C63070h) gVar2.instance).f170217a = "type.googleapis.com/google_ocr.PhotoOcrLineRecognizerConfig";
                        C63088z byteString = ((C55698af) aeVar.build()).toByteString();
                        gVar2.copyOnWrite();
                        byteString.getClass();
                        ((C63070h) gVar2.instance).f170218b = byteString;
                        C63070h hVar = (C63070h) gVar2.build();
                        mVar.copyOnWrite();
                        C55753n nVar = (C55753n) mVar.instance;
                        hVar.getClass();
                        nVar.f147128b = hVar;
                        nVar.f147127a = 2;
                        rVar.copyOnWrite();
                        C55758s sVar = (C55758s) rVar.instance;
                        C55753n nVar2 = (C55753n) mVar.build();
                        nVar2.getClass();
                        sVar.f147137b = nVar2;
                        sVar.f147136a = 1;
                        C55758s sVar2 = (C55758s) rVar.build();
                        qVar.mo54276a(str5, sVar2);
                        if ("Deva".equals(str5)) {
                            qVar.mo54276a("Beng", sVar2);
                        }
                        i++;
                    } else {
                        throw new NullPointerException(((String) bVar.f146990l.get(i)) + " not in known scripts: " + String.valueOf(hdVar));
                    }
                }
                qVar.copyOnWrite();
                ((C55760u) qVar.instance).f147143c = false;
                qVar.copyOnWrite();
                ((C55760u) qVar.instance).f147144d = 60000;
                qVar.copyOnWrite();
                C55760u uVar = (C55760u) qVar.instance;
                uVar.f147145e = 1;
                C65885b bVar2 = uVar.f147142b;
                if (bVar2 == null) {
                    bVar2 = C65885b.f179198c;
                }
                C65884a aVar = (C65884a) bVar2.toBuilder();
                aVar.copyOnWrite();
                ((C65885b) aVar.instance).f179200a = "LanguageBasedLineRecognizerConfigSelector";
                aVar.copyOnWrite();
                ((C65885b) aVar.instance).f179201b = "Latn";
                C65885b bVar3 = (C65885b) aVar.build();
                qVar.copyOnWrite();
                bVar3.getClass();
                ((C55760u) qVar.instance).f147142b = bVar3;
                C63088z byteString2 = ((C55760u) qVar.build()).toByteString();
                gVar.copyOnWrite();
                byteString2.getClass();
                ((C63070h) gVar.instance).f170218b = byteString2;
                C63088z byteString3 = ((C63070h) gVar.build()).toByteString();
                C63062g gVar3 = (C63062g) C63070h.f170215c.createBuilder();
                gVar3.copyOnWrite();
                ((C63070h) gVar3.instance).f170217a = "type.googleapis.com/google_ocr.PhotoOcrTextDetectionMutatorConfig";
                C55709aq aqVar = (C55709aq) C55710ar.f146965f.createBuilder();
                String str6 = bVar.f146979a;
                aqVar.copyOnWrite();
                str6.getClass();
                ((C55710ar) aqVar.instance).f146967a = str6;
                String str7 = bVar.f146980b;
                aqVar.copyOnWrite();
                str7.getClass();
                ((C55710ar) aqVar.instance).f146968b = str7;
                aqVar.copyOnWrite();
                ((C55710ar) aqVar.instance).f146969c = ".";
                aqVar.copyOnWrite();
                ((C55710ar) aqVar.instance).f146970d = true;
                aqVar.copyOnWrite();
                ((C55710ar) aqVar.instance).f146971e = true;
                C63088z byteString4 = ((C55710ar) aqVar.build()).toByteString();
                gVar3.copyOnWrite();
                byteString4.getClass();
                ((C63070h) gVar3.instance).f170218b = byteString4;
                C63088z byteString5 = ((C63070h) gVar3.build()).toByteString();
                C63062g gVar4 = (C63062g) C63070h.f170215c.createBuilder();
                gVar4.copyOnWrite();
                ((C63070h) gVar4.instance).f170217a = "type.googleapis.com/google_ocr.PhotoOcrScriptIdentificationMutatorConfig";
                C55705am amVar = (C55705am) C55706an.f146955d.createBuilder();
                String str8 = bVar.f146989k;
                amVar.copyOnWrite();
                str8.getClass();
                ((C55706an) amVar.instance).f146957a = str8;
                amVar.copyOnWrite();
                ((C55706an) amVar.instance).f146958b = "und-Latn";
                amVar.copyOnWrite();
                ((C55706an) amVar.instance).f146959c = ".";
                C63088z byteString6 = ((C55706an) amVar.build()).toByteString();
                gVar4.copyOnWrite();
                byteString6.getClass();
                ((C63070h) gVar4.instance).f170218b = byteString6;
                C63088z byteString7 = ((C63070h) gVar4.build()).toByteString();
                C63062g gVar5 = (C63062g) C63070h.f170215c.createBuilder();
                gVar5.copyOnWrite();
                ((C63070h) gVar5.instance).f170217a = "type.googleapis.com/google_ocr.LineSelectionMutatorConfig";
                C55754o oVar = (C55754o) C55755p.f147130c.createBuilder();
                oVar.copyOnWrite();
                ((C55755p) oVar.instance).f147132a = 0.25d;
                oVar.copyOnWrite();
                ((C55755p) oVar.instance).f147133b = "weight_Latn=0.1";
                C63088z byteString8 = ((C55755p) oVar.build()).toByteString();
                gVar5.copyOnWrite();
                byteString8.getClass();
                ((C63070h) gVar5.instance).f170218b = byteString8;
                C63088z byteString9 = ((C63070h) gVar5.build()).toByteString();
                C63062g gVar6 = (C63062g) C63070h.f170215c.createBuilder();
                gVar6.copyOnWrite();
                ((C63070h) gVar6.instance).f170217a = "type.googleapis.com/google_ocr.PhotoOcrPageLayoutAnalysisMutatorConfig";
                C55701ai aiVar = (C55701ai) C55702aj.f146948b.createBuilder();
                C55703ak akVar = (C55703ak) C55704al.f146951c.createBuilder();
                C55722k kVar = (C55722k) C55723l.f147032f.createBuilder();
                float f = bVar.f146984f;
                kVar.copyOnWrite();
                C55723l lVar = (C55723l) kVar.instance;
                lVar.f147034a |= 1;
                lVar.f147035b = f;
                float f2 = bVar.f146985g;
                kVar.copyOnWrite();
                C55723l lVar2 = (C55723l) kVar.instance;
                lVar2.f147034a |= 32;
                lVar2.f147038e = f2;
                float f3 = (float) bVar.f146992n;
                kVar.copyOnWrite();
                C55723l lVar3 = (C55723l) kVar.instance;
                lVar3.f147034a |= 16;
                lVar3.f147037d = f3;
                float f4 = bVar.f146988j;
                kVar.copyOnWrite();
                C55723l lVar4 = (C55723l) kVar.instance;
                lVar4.f147034a |= 8;
                lVar4.f147036c = f4;
                akVar.copyOnWrite();
                C55723l lVar5 = (C55723l) kVar.build();
                lVar5.getClass();
                ((C55704al) akVar.instance).f146954b = lVar5;
                C55724m mVar2 = (C55724m) C55725n.f147039h.createBuilder();
                C55726o oVar2 = (C55726o) C55727p.f147048f.createBuilder();
                boolean z = bVar.f146994p;
                oVar2.copyOnWrite();
                C55727p pVar = (C55727p) oVar2.instance;
                axVar2 = axVar;
                pVar.f147050a |= 8192;
                pVar.f147054e = z;
                mVar2.copyOnWrite();
                C55725n nVar3 = (C55725n) mVar2.instance;
                C55727p pVar2 = (C55727p) oVar2.build();
                pVar2.getClass();
                nVar3.f147042b = pVar2;
                nVar3.f147041a |= 1;
                boolean z2 = bVar.f146993o;
                mVar2.copyOnWrite();
                C55725n nVar4 = (C55725n) mVar2.instance;
                nVar4.f147041a |= 2;
                nVar4.f147043c = z2;
                float f5 = bVar.f146991m;
                mVar2.copyOnWrite();
                C55725n nVar5 = (C55725n) mVar2.instance;
                nVar5.f147041a |= 8;
                nVar5.f147044d = f5;
                boolean z3 = bVar.f146987i;
                mVar2.copyOnWrite();
                C55725n nVar6 = (C55725n) mVar2.instance;
                nVar6.f147041a |= 16;
                nVar6.f147045e = z3;
                boolean z4 = bVar.f146986h;
                mVar2.copyOnWrite();
                C55725n nVar7 = (C55725n) mVar2.instance;
                nVar7.f147041a |= 64;
                nVar7.f147046f = z4;
                mVar2.copyOnWrite();
                C55725n nVar8 = (C55725n) mVar2.instance;
                nVar8.f147041a |= 128;
                nVar8.f147047g = true;
                akVar.copyOnWrite();
                C55725n nVar9 = (C55725n) mVar2.build();
                nVar9.getClass();
                ((C55704al) akVar.instance).f146953a = nVar9;
                aiVar.copyOnWrite();
                C55704al alVar = (C55704al) akVar.build();
                alVar.getClass();
                ((C55702aj) aiVar.instance).f146950a = alVar;
                C63088z byteString10 = ((C55702aj) aiVar.build()).toByteString();
                gVar6.copyOnWrite();
                byteString10.getClass();
                ((C63070h) gVar6.instance).f170218b = byteString10;
                map.put(str2, new C27813aa(byteString3, byteString5, byteString7, byteString9, ((C63070h) gVar6.build()).toByteString()));
            } catch (Exception e2) {
                throw new IllegalArgumentException("Failing to convert config.", e2);
            } catch (Throwable th8) {
                C27843z.m51865a(th, th8);
            }
        } else {
            axVar2 = axVar;
        }
        return C58833ax.m90833j((C27813aa) f75873h.get(axVar2.mo56107c()));
        throw th;
        throw th4;
    }
}
