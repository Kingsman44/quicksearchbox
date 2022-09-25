package com.google.android.apps.search.fedora.p10104h;

import android.text.TextUtils;
import com.google.android.apps.search.fedora.p10099e.C132791av;
import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132804l;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19410n;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19411o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62995dn;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63262g;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j;
import com.google.speech.p5199c.p5200a.C66463h;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.fedora.h.r */
/* compiled from: PG */
public final /* synthetic */ class C132909r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132910s f362555a;

    /* renamed from: b */
    public final /* synthetic */ C66463h f362556b;

    /* renamed from: c */
    public final /* synthetic */ C63262g f362557c;

    /* renamed from: d */
    public final /* synthetic */ C58495hd f362558d;

    /* renamed from: e */
    public final /* synthetic */ String f362559e;

    /* renamed from: f */
    public final /* synthetic */ File f362560f;

    /* renamed from: g */
    public final /* synthetic */ C132791av f362561g;

    public /* synthetic */ C132909r(C132910s sVar, C66463h hVar, C63262g gVar, C58495hd hdVar, String str, File file, C132791av avVar) {
        this.f362555a = sVar;
        this.f362556b = hVar;
        this.f362557c = gVar;
        this.f362558d = hdVar;
        this.f362559e = str;
        this.f362560f = file;
        this.f362561g = avVar;
    }

    public final C60870cx apply(Object obj) {
        C132910s sVar = this.f362555a;
        C66463h hVar = this.f362556b;
        C63262g gVar = this.f362557c;
        C58495hd hdVar = this.f362558d;
        String str = this.f362559e;
        File file = this.f362560f;
        C132791av avVar = this.f362561g;
        C132804l lVar = (C132804l) obj;
        String str2 = lVar.f362342b;
        if (TextUtils.isEmpty(str2)) {
            ((C59052c) ((C59052c) C132910s.f362562a.mo56224b()).mo56372aa(39917)).mo56386p("User signed out. Ignoring the fine tuning model.");
            sVar.mo110935c(hVar, false);
            sVar.mo110936d(gVar);
            C19410n c = C19411o.m37043c();
            c.mo24554b(true);
            return C60856cj.m92900i(c.mo24553a());
        } else if (!hdVar.containsKey("acceptance_decision") || ((Float) hdVar.get("acceptance_decision")).floatValue() <= 0.0f) {
            ((C59052c) ((C59052c) C132910s.f362562a.mo56224b()).mo56372aa(39916)).mo56389s("Fine tuning model rejected for %s.", str);
            sVar.mo110936d(gVar);
            return sVar.mo110934a(str2, str, file, hVar);
        } else {
            ((C59052c) ((C59052c) C132910s.f362562a.mo56224b()).mo56372aa(39914)).mo56389s("Fine tuning model accepted for %s.", str);
            C132798f fVar = C132798f.f362315o;
            str2.getClass();
            C62995dn dnVar = lVar.f362343c;
            if (dnVar.containsKey(str2)) {
                fVar = (C132798f) dnVar.get(str2);
            }
            int i = avVar.f362298c;
            if (i > 0) {
                C132797e eVar = fVar.f362325i;
                if (eVar == null) {
                    eVar = C132797e.f362307g;
                }
                if (i != eVar.f362311c) {
                    ((C59052c) ((C59052c) C132910s.f362562a.mo56224b()).mo56372aa(39915)).mo56386p("Soda LP changed during the training. Ignoring the current run.");
                    gVar.copyOnWrite();
                    C63265j jVar = (C63265j) gVar.instance;
                    C63265j jVar2 = C63265j.f170990j;
                    jVar.f170992a |= 256;
                    jVar.f171000i = false;
                    sVar.mo110936d(gVar);
                    return sVar.mo110934a(str2, str, file, hVar);
                }
            }
            ((C59052c) ((C59052c) C132910s.f362562a.mo56224b()).mo56372aa(39900)).mo56386p("handleAcceptedResourceSave().");
            File file2 = new File(C60790c.m92793a(sVar.f362563b.mo110932a(str2).getAbsolutePath(), "accepted", "artifacts"));
            File file3 = new File(C60790c.m92793a(sVar.f362563b.mo110932a(str2).getAbsolutePath(), "accepted", "metrics", str));
            C132797e eVar2 = fVar.f362325i;
            if (eVar2 == null) {
                eVar2 = C132797e.f362307g;
            }
            if (eVar2.f362311c > 0) {
                C132797e eVar3 = fVar.f362325i;
                int i2 = (eVar3 == null ? C132797e.f362307g : eVar3).f362311c;
                if (eVar3 == null) {
                    eVar3 = C132797e.f362307g;
                }
                if (i2 != eVar3.f362314f) {
                    ((C59052c) ((C59052c) C132910s.f362562a.mo56224b()).mo56372aa(39902)).mo56386p("New Soda LP. Cleaning up the obsolete p13n resources.");
                    C132910s.m215886b(file2);
                    C132910s.m215886b(file3);
                }
            }
            try {
                if (file.exists()) {
                    file.getAbsolutePath();
                    file2.getAbsolutePath();
                    C132904m.m215882b(file, file2, C132902k.f362544a);
                    sVar.f362563b.mo110933c(file, file3);
                    return C47633f.m84733g(sVar.f362565d.f331355a.mo46039a(new C132906o(file2, fVar), sVar.f362564c)).mo51515h(new C132907p(sVar, hVar, gVar), C60826bg.f164896a);
                }
                ((C59052c) ((C59052c) C132904m.f362546a.mo56225c()).mo56372aa(39892)).mo56386p("Brella out dir is absent");
                file.getAbsolutePath();
                throw new IOException("Brella out dir doesn't exist.");
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C132910s.f362562a.mo56226d()).mo56382g(e)).mo56372aa(39901)).mo56354G("Failed moving personalized files from %s to the accepted model directory %s", file, file2);
                sVar.mo110935c(hVar, false);
                gVar.copyOnWrite();
                C63265j jVar3 = (C63265j) gVar.instance;
                C63265j jVar4 = C63265j.f170990j;
                jVar3.f170992a |= 256;
                jVar3.f171000i = false;
                sVar.mo110936d(gVar);
                C19410n c2 = C19411o.m37043c();
                c2.mo24554b(false);
                return C60856cj.m92900i(c2.mo24553a());
            }
        }
    }
}
