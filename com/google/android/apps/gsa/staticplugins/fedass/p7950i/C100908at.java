package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19420x;
import com.google.android.libraries.search.integrations.p3021e.C38511a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5218j.C66999hh;
import java.io.File;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.at */
/* compiled from: PG */
public final class C100908at implements C100900al, C19420x {

    /* renamed from: a */
    public static final C59071e f281924a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.i.at");

    /* renamed from: b */
    public final C100719ab f281925b;

    /* renamed from: c */
    public final C100934q f281926c;

    /* renamed from: d */
    public final Executor f281927d;

    /* renamed from: e */
    private final Context f281928e;

    public C100908at(Context context, C100719ab abVar, C100934q qVar, Executor executor) {
        this.f281928e = context;
        this.f281925b = abVar;
        this.f281926c = qVar;
        this.f281927d = executor;
    }

    /* renamed from: f */
    public static void m167136f(File file) {
        File[] listFiles;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m167136f(file2);
                }
                if (file2.isFile() && !file2.getName().endsWith(".pb")) {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo92088a(String str) {
        C60870cx c = this.f281925b.mo92019c(str);
        C100902an anVar = new C100902an(this, str);
        return C60922j.m93045h(c, C47810es.m84966f(anVar), this.f281927d);
    }

    /* renamed from: b */
    public final Optional mo92089b(C132800h hVar) {
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        C132797e eVar = fVar.f362325i;
        if (eVar == null) {
            eVar = C132797e.f362307g;
        }
        if ((eVar.f362309a & 1) != 0) {
            String str = eVar.f362310b;
            if (!TextUtils.isEmpty(str)) {
                return Optional.m71637of(new File(str));
            }
            ((C59052c) ((C59052c) f281924a.mo56224b()).mo56372aa(19709)).mo56386p("Soda Lp dir not available yet.");
            return Optional.empty();
        }
        ((C59052c) ((C59052c) f281924a.mo56224b()).mo56372aa(19710)).mo56386p("Soda Lp dir not available yet.");
        return Optional.empty();
    }

    /* renamed from: c */
    public final File mo92090c() {
        return new File(C60790c.m92793a(C38511a.m67760a(this.f281928e, "fedora").getAbsolutePath(), "sheldon/p13n/asr_p13n/brella"));
    }

    /* renamed from: d */
    public final File mo92091d() {
        return new File(C60790c.m92793a(C38511a.m67760a(this.f281928e, "fedora").getAbsolutePath(), "sheldon/p13n/lm_p13n/brella"));
    }

    /* renamed from: e */
    public final C60870cx mo24612e(C66999hh hhVar) {
        return C100742h.m166944c(this.f281925b.mo92020d()).mo92034d(new C100903ao(this, hhVar)).f281631a;
    }
}
