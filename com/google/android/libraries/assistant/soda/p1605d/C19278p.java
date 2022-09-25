package com.google.android.libraries.assistant.soda.p1605d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59653bg;
import com.google.common.p4552o.C59654bh;
import com.google.common.p4552o.C59664br;
import com.google.common.p4552o.C59665bs;
import com.google.common.p4552o.C59687cb;
import com.google.speech.p5218j.C66922el;
import com.google.speech.p5218j.C66934ex;
import com.google.speech.p5218j.C66935ey;
import dagger.C68214a;
import java.util.Collections;

/* renamed from: com.google.android.libraries.assistant.soda.d.p */
/* compiled from: PG */
public final class C19278p implements C19270h {

    /* renamed from: a */
    private static final C59071e f53996a = C59071e.m91332i("com.google.android.libraries.assistant.soda.d.p");

    /* renamed from: b */
    private final C68214a f53997b;

    /* renamed from: c */
    private final C68214a f53998c;

    /* renamed from: d */
    private final C79853ak f53999d;

    /* renamed from: e */
    private String f54000e = BuildConfig.FLAVOR;

    public C19278p(C68214a aVar, C68214a aVar2, C79853ak akVar) {
        this.f53997b = aVar;
        this.f53998c = aVar2;
        this.f53999d = akVar;
    }

    /* renamed from: b */
    private static C59687cb m36772b(C66935ey eyVar) {
        C59664br brVar = (C59664br) C59665bs.f159989f.createBuilder();
        C66922el elVar = eyVar.f181940b;
        if (elVar == null) {
            elVar = C66922el.f181915b;
        }
        if (elVar.f181917a.containsKey("mode")) {
            C66922el elVar2 = eyVar.f181940b;
            if (elVar2 == null) {
                elVar2 = C66922el.f181915b;
            }
            String str = (String) Collections.unmodifiableMap(elVar2.f181917a).get("mode");
            try {
                int parseInt = Integer.parseInt(str);
                brVar.copyOnWrite();
                C59665bs bsVar = (C59665bs) brVar.instance;
                bsVar.f159991a |= 1;
                bsVar.f159992b = parseInt;
            } catch (NumberFormatException e) {
                ((C59052c) ((C59052c) ((C59052c) f53996a.mo56226d()).mo56382g(e)).mo56372aa(47689)).mo56389s("Error converting hybrid mode value '%s' to int.", str);
            }
        }
        C66922el elVar3 = eyVar.f181940b;
        if (elVar3 == null) {
            elVar3 = C66922el.f181915b;
        }
        if (elVar3.f181917a.containsKey("source")) {
            C66922el elVar4 = eyVar.f181940b;
            if (elVar4 == null) {
                elVar4 = C66922el.f181915b;
            }
            String str2 = (String) Collections.unmodifiableMap(elVar4.f181917a).get("source");
            try {
                int parseInt2 = Integer.parseInt(str2);
                brVar.copyOnWrite();
                C59665bs bsVar2 = (C59665bs) brVar.instance;
                bsVar2.f159991a |= 2;
                bsVar2.f159993c = parseInt2;
            } catch (NumberFormatException e2) {
                ((C59052c) ((C59052c) ((C59052c) f53996a.mo56226d()).mo56382g(e2)).mo56372aa(47688)).mo56389s("Error converting hybrid source value '%s' to int.", str2);
            }
        }
        C66922el elVar5 = eyVar.f181940b;
        if (elVar5 == null) {
            elVar5 = C66922el.f181915b;
        }
        if (elVar5.f181917a.containsKey("on_device_hypothesis_length")) {
            C66922el elVar6 = eyVar.f181940b;
            if (elVar6 == null) {
                elVar6 = C66922el.f181915b;
            }
            String str3 = (String) Collections.unmodifiableMap(elVar6.f181917a).get("on_device_hypothesis_length");
            try {
                C59654bh bhVar = ((C59665bs) brVar.instance).f159994d;
                if (bhVar == null) {
                    bhVar = C59654bh.f159962d;
                }
                C59653bg bgVar = (C59653bg) bhVar.toBuilder();
                int parseInt3 = Integer.parseInt(str3);
                bgVar.copyOnWrite();
                C59654bh bhVar2 = (C59654bh) bgVar.instance;
                bhVar2.f159964a |= 2;
                bhVar2.f159966c = parseInt3;
                brVar.copyOnWrite();
                C59665bs bsVar3 = (C59665bs) brVar.instance;
                C59654bh bhVar3 = (C59654bh) bgVar.build();
                bhVar3.getClass();
                bsVar3.f159994d = bhVar3;
                bsVar3.f159991a |= 4;
            } catch (NumberFormatException e3) {
                ((C59052c) ((C59052c) ((C59052c) f53996a.mo56226d()).mo56382g(e3)).mo56372aa(47687)).mo56389s("Error converting on device hypothesis length value '%s' to int.", str3);
            }
        }
        C66922el elVar7 = eyVar.f181940b;
        if (elVar7 == null) {
            elVar7 = C66922el.f181915b;
        }
        if (elVar7.f181917a.containsKey("on_device_asr_result_type")) {
            C66922el elVar8 = eyVar.f181940b;
            if (elVar8 == null) {
                elVar8 = C66922el.f181915b;
            }
            String str4 = (String) Collections.unmodifiableMap(elVar8.f181917a).get("on_device_asr_result_type");
            int e4 = m36775e(str4);
            if (e4 != 1) {
                C59654bh bhVar4 = ((C59665bs) brVar.instance).f159994d;
                if (bhVar4 == null) {
                    bhVar4 = C59654bh.f159962d;
                }
                C59653bg bgVar2 = (C59653bg) bhVar4.toBuilder();
                bgVar2.copyOnWrite();
                C59654bh bhVar5 = (C59654bh) bgVar2.instance;
                bhVar5.f159965b = e4 - 1;
                bhVar5.f159964a |= 1;
                brVar.copyOnWrite();
                C59665bs bsVar4 = (C59665bs) brVar.instance;
                C59654bh bhVar6 = (C59654bh) bgVar2.build();
                bhVar6.getClass();
                bsVar4.f159994d = bhVar6;
                bsVar4.f159991a |= 4;
            } else {
                ((C59052c) ((C59052c) f53996a.mo56226d()).mo56372aa(47686)).mo56389s("Error converting on-device ASR result type '%s' to enum.", str4);
            }
        }
        C66922el elVar9 = eyVar.f181940b;
        if (elVar9 == null) {
            elVar9 = C66922el.f181915b;
        }
        if (elVar9.f181917a.containsKey("server_hypothesis_length")) {
            C66922el elVar10 = eyVar.f181940b;
            if (elVar10 == null) {
                elVar10 = C66922el.f181915b;
            }
            String str5 = (String) Collections.unmodifiableMap(elVar10.f181917a).get("server_hypothesis_length");
            try {
                C59654bh bhVar7 = ((C59665bs) brVar.instance).f159995e;
                if (bhVar7 == null) {
                    bhVar7 = C59654bh.f159962d;
                }
                C59653bg bgVar3 = (C59653bg) bhVar7.toBuilder();
                int parseInt4 = Integer.parseInt(str5);
                bgVar3.copyOnWrite();
                C59654bh bhVar8 = (C59654bh) bgVar3.instance;
                bhVar8.f159964a |= 2;
                bhVar8.f159966c = parseInt4;
                brVar.copyOnWrite();
                C59665bs bsVar5 = (C59665bs) brVar.instance;
                C59654bh bhVar9 = (C59654bh) bgVar3.build();
                bhVar9.getClass();
                bsVar5.f159995e = bhVar9;
                bsVar5.f159991a |= 8;
            } catch (NumberFormatException e5) {
                ((C59052c) ((C59052c) ((C59052c) f53996a.mo56226d()).mo56382g(e5)).mo56372aa(47685)).mo56389s("Error converting server hypothesis length value '%s' to int.", str5);
            }
        }
        C66922el elVar11 = eyVar.f181940b;
        if (elVar11 == null) {
            elVar11 = C66922el.f181915b;
        }
        if (elVar11.f181917a.containsKey("server_asr_result_type")) {
            C66922el elVar12 = eyVar.f181940b;
            if (elVar12 == null) {
                elVar12 = C66922el.f181915b;
            }
            String str6 = (String) Collections.unmodifiableMap(elVar12.f181917a).get("server_asr_result_type");
            int e6 = m36775e(str6);
            if (e6 != 1) {
                C59654bh bhVar10 = ((C59665bs) brVar.instance).f159995e;
                if (bhVar10 == null) {
                    bhVar10 = C59654bh.f159962d;
                }
                C59653bg bgVar4 = (C59653bg) bhVar10.toBuilder();
                bgVar4.copyOnWrite();
                C59654bh bhVar11 = (C59654bh) bgVar4.instance;
                bhVar11.f159965b = e6 - 1;
                bhVar11.f159964a |= 1;
                brVar.copyOnWrite();
                C59665bs bsVar6 = (C59665bs) brVar.instance;
                C59654bh bhVar12 = (C59654bh) bgVar4.build();
                bhVar12.getClass();
                bsVar6.f159995e = bhVar12;
                bsVar6.f159991a |= 8;
            } else {
                ((C59052c) ((C59052c) f53996a.mo56226d()).mo56372aa(47684)).mo56389s("Error converting server ASR result type '%s' to enum.", str6);
            }
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59665bs bsVar7 = (C59665bs) brVar.build();
        bsVar7.getClass();
        cbVar.f160073aK = bsVar7;
        cbVar.f160123d |= 8;
        return (C59687cb) ajVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r2.f53999d.mo74223h((com.google.android.apps.gsa.nga.shared.p6407v.C83320io) r0.get());
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m36773c() {
        /*
            r2 = this;
            dagger.a r0 = r2.f53998c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.assistant.soda.d.t r0 = (com.google.android.libraries.assistant.soda.p1605d.C19282t) r0
            j$.util.Optional r0 = r0.mo24439e()
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x0021
            com.google.android.apps.gsa.nga.engine.x.ak r1 = r2.f53999d
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.nga.shared.v.io r0 = (com.google.android.apps.gsa.nga.shared.p6407v.C83320io) r0
            java.lang.String r0 = r1.mo74223h(r0)
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.p1605d.C19278p.m36773c():java.lang.String");
    }

    /* renamed from: d */
    private final void m36774d(C89849ae aeVar, C59687cb cbVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = cbVar;
        ((C89859i) this.f53997b.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m36775e(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -506039817(0xffffffffe1d671f7, float:-4.944769E20)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -74951327(0xfffffffffb885561, float:-1.4157681E36)
            if (r0 == r1) goto L_0x0020
            r1 = 66898262(0x3fcc956, float:1.4857453E-36)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "FINAL"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "PARTIAL"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "PREFETCH"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0040
            if (r4 == r3) goto L_0x003e
            if (r4 == r2) goto L_0x003c
            return r3
        L_0x003c:
            r4 = 4
            return r4
        L_0x003e:
            r4 = 3
            return r4
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.p1605d.C19278p.m36775e(java.lang.String):int");
    }

    /* renamed from: a */
    public final void mo24434a(C66935ey eyVar) {
        int b = C66934ex.m97386b(eyVar.f181939a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        switch (b - 1) {
            case 1:
                this.f54000e = m36773c();
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_START_ASR);
                return;
            case 2:
                this.f54000e = m36773c();
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_START_ASR_ON_HOTWORD);
                return;
            case 3:
                if (!this.f54000e.isEmpty()) {
                    C89849ae aeVar = C89849ae.SODA_STOP_ASR;
                    C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                    String str = this.f54000e;
                    ajVar.copyOnWrite();
                    C59687cb cbVar = (C59687cb) ajVar.instance;
                    str.getClass();
                    cbVar.f160062a |= 4;
                    cbVar.f160127h = str;
                    m36774d(aeVar, (C59687cb) ajVar.build());
                    this.f54000e = BuildConfig.FLAVOR;
                    return;
                }
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_STOP_ASR);
                return;
            case 4:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_RESTART_ASR);
                return;
            case 5:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_ON_DEVICE_ASR_START);
                return;
            case 6:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_ON_DEVICE_ASR_END);
                return;
            case 7:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_ON_DEVICE_ASR_CANCEL);
                return;
            case 8:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_ON_DEVICE_ASR_PARTIAL);
                return;
            case 9:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_ON_DEVICE_ASR_PREFETCH);
                return;
            case 10:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_ON_DEVICE_ASR_FINAL);
                return;
            case 11:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_SERVER_ASR_START);
                return;
            case 12:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_SERVER_ASR_END);
                return;
            case 13:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_SERVER_ASR_PARTIAL);
                return;
            case 14:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_SERVER_ASR_PREFETCH);
                return;
            case 15:
                ((C89859i) this.f53997b.mo27525b()).mo83702b(C89849ae.SODA_SERVER_ASR_FINAL);
                return;
            case 16:
                m36774d(C89849ae.SODA_HYBRID_SESSION_START, m36772b(eyVar));
                return;
            case 17:
                m36774d(C89849ae.SODA_HYBRID_SESSION_END, m36772b(eyVar));
                return;
            case 18:
                m36774d(C89849ae.SODA_HYBRID_PARTIAL_SELECTION, m36772b(eyVar));
                return;
            case 19:
                m36774d(C89849ae.SODA_HYBRID_PREFETCH_SELECTION, m36772b(eyVar));
                return;
            case 20:
                m36774d(C89849ae.SODA_HYBRID_FINAL_SELECTION, m36772b(eyVar));
                return;
            default:
                C59052c cVar = (C59052c) ((C59052c) f53996a.mo56226d()).mo56372aa(47690);
                int b2 = C66934ex.m97386b(eyVar.f181939a);
                if (b2 != 0) {
                    i = b2;
                }
                cVar.mo56389s("Unhandled AppFlow event: %s", C66934ex.m97385a(i));
                return;
        }
    }
}
