package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35843be;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.assistant.performer.p2767j.C36190l;
import com.google.android.libraries.search.assistant.performer.p2767j.C36193o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51064fa;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51102gl;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bl */
/* compiled from: PG */
public final class C35916bl implements C35472h {

    /* renamed from: a */
    public static final C59071e f94061a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.bl");

    /* renamed from: b */
    public final C35470f f94062b;

    /* renamed from: c */
    public final Context f94063c;

    /* renamed from: d */
    private final PackageManager f94064d;

    /* renamed from: e */
    private final C35843be f94065e;

    /* renamed from: f */
    private final C35918bn f94066f;

    /* renamed from: g */
    private final Executor f94067g;

    /* renamed from: h */
    private final C36193o f94068h;

    public C35916bl(PackageManager packageManager, Context context, C35843be beVar, Executor executor, C36193o oVar, C35918bn bnVar, C35470f fVar) {
        this.f94062b = fVar;
        this.f94064d = packageManager;
        this.f94063c = context;
        this.f94065e = beVar;
        this.f94066f = bnVar;
        this.f94067g = executor;
        this.f94068h = oVar;
    }

    /* renamed from: b */
    private static Intent m64305b(String str) {
        try {
            return Intent.parseUri(str, 0);
        } catch (URISyntaxException e) {
            throw new C35471g((Throwable) e);
        }
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C51058ev evVar;
        Intent intent;
        C51064fa faVar;
        if (dyVar.f135936b.equals("provider.OPEN")) {
            ada ada = (ada) C36183e.m64584b(dyVar, "open_provider_args", ada.f134865f.getParserForType());
            C51098gh ghVar = ada.f134868b;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 1) {
                C51098gh ghVar2 = ada.f134868b;
                if (ghVar2 == null) {
                    ghVar2 = C51098gh.f133009e;
                }
                if (ghVar2.f133012b == 1) {
                    evVar = (C51058ev) ghVar2.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                if (!evVar.f132956n.isEmpty()) {
                    return C60856cj.m92900i(this.f94065e.mo39867a(evVar.f132956n, evVar.f132944b));
                }
                PackageManager packageManager = this.f94064d;
                Optional of = (evVar.f132943a & 1) != 0 ? Optional.m71637of(evVar.f132944b) : Optional.empty();
                if ((evVar.f132943a & 32) != 0) {
                    intent = m64305b(evVar.f132949g);
                } else if (!of.isEmpty()) {
                    intent = (Intent) Optional.ofNullable(this.f94066f.mo39889a().booleanValue() ? packageManager.getLeanbackLaunchIntentForPackage((String) of.get()) : null).orElse(packageManager.getLaunchIntentForPackage((String) of.get()));
                } else {
                    throw new C35471g("Unable to open provider: no package name found.");
                }
                if (of.isPresent() && intent != null) {
                    intent.setPackage((String) of.get());
                }
                if (intent == null) {
                    return C60856cj.m92900i(C36180b.m64578b(C52235kf.NOT_FOUND));
                }
                C36193o oVar = this.f94068h;
                ((C59052c) ((C59052c) C36193o.f94556a.mo56224b()).mo56372aa(52204)).mo56386p("Attempting to add user identity to intent.");
                C60870cx a = oVar.mo40005a(intent, dyVar, new C36190l(intent));
                if (!evVar.f132954l) {
                    C51102gl glVar = ada.f134869c;
                    if (glVar == null) {
                        glVar = C51102gl.f133019c;
                    }
                    if (glVar.f133021a == 1) {
                        faVar = (C51064fa) glVar.f133022b;
                    } else {
                        faVar = C51064fa.f132965d;
                    }
                    return C47633f.m84733g(a).mo51516i(new C35911bg(this, faVar.f132968b), this.f94067g).mo51515h(new C35912bh(ada.f134871e), this.f94067g).mo51513e(ActivityNotFoundException.class, C35913bi.f94057a, this.f94067g).mo51513e(Exception.class, C35914bj.f94058a, this.f94067g);
                }
                return C60922j.m93044g(a, C47810es.m84963c(new C35915bk(this, ada.f134871e)), this.f94067g);
            }
            throw new C35471g("Unable to open provider: no app info found.");
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"provider.OPEN", dyVar.f135936b}));
    }
}
