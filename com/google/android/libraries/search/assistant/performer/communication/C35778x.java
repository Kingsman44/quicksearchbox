package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import com.google.android.apps.p8928i.p8929a.p8930a.C119145a;
import com.google.android.apps.p8928i.p8929a.p8930a.C119146b;
import com.google.android.apps.p8928i.p8929a.p8930a.C119147c;
import com.google.android.apps.p8928i.p8929a.p8930a.C119148d;
import com.google.android.apps.p8928i.p8932c.p8933a.C119150a;
import com.google.android.apps.p8928i.p8932c.p8933a.C119154e;
import com.google.android.apps.p8928i.p8932c.p8933a.C119155f;
import com.google.android.apps.p8928i.p8932c.p8933a.C119156g;
import com.google.android.libraries.search.assistant.performer.communication.p2732a.C35490a;
import com.google.android.libraries.search.assistant.performer.communication.p2735c.C35569a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36188j;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52288me;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Collections;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5369g.p5373b.p5374a.C68754r;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.x */
/* compiled from: PG */
public final class C35778x {

    /* renamed from: a */
    public static final C59071e f93719a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.x");

    /* renamed from: b */
    public final C39226b f93720b;

    /* renamed from: c */
    public final Context f93721c;

    /* renamed from: d */
    public final C60888db f93722d;

    /* renamed from: e */
    public final PackageManager f93723e;

    /* renamed from: f */
    public final C35569a f93724f;

    /* renamed from: g */
    public final Optional f93725g;

    /* renamed from: h */
    public boolean f93726h;

    /* renamed from: i */
    private final C46877q f93727i;

    /* renamed from: j */
    private final C36197b f93728j;

    /* renamed from: k */
    private final C68754r f93729k;

    public C35778x(C46877q qVar, Context context, C60888db dbVar, PackageManager packageManager, Optional optional, C68754r rVar, C39226b bVar, C36197b bVar2, C35569a aVar) {
        Optional optional2;
        this.f93727i = qVar;
        this.f93721c = context;
        this.f93722d = dbVar;
        this.f93723e = packageManager;
        this.f93729k = rVar;
        this.f93720b = bVar;
        this.f93724f = aVar;
        this.f93728j = bVar2;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            optional2 = optional.map(new C35765k(telephonyManager, aVar));
        } else {
            optional2 = Optional.empty();
        }
        this.f93725g = optional2;
    }

    /* renamed from: f */
    private static void m64159f(boolean z, String str) {
        if (!z) {
            ((C59052c) ((C59052c) f93719a.mo56225c()).mo56372aa(51608)).mo56389s("%s", str);
            throw new C35471g(str);
        }
    }

    /* renamed from: a */
    public final C52070ec mo39832a(C62722b bVar, C52235kf kfVar) {
        this.f93724f.mo39715i(bVar);
        return C36180b.m64578b(kfVar);
    }

    /* renamed from: b */
    public final C60870cx mo39833b(Context context, PackageManager packageManager, C52289mf mfVar) {
        C51098gh ghVar;
        C51098gh ghVar2;
        C51098gh ghVar3;
        C51058ev evVar;
        C51058ev evVar2;
        C51098gh ghVar4;
        C51058ev evVar3;
        C51098gh ghVar5;
        C51058ev evVar4;
        String str;
        if (mfVar.f137260a == 6) {
            ghVar = (C51098gh) mfVar.f137261b;
        } else {
            ghVar = C51098gh.f133009e;
        }
        if (C35517aj.m63879b(ghVar)) {
            m64159f(mfVar.f137263d.equals("PHONE_NUMBER"), "Only phone number is supported.");
            String str2 = mfVar.f137262c;
            m64159f(!str2.isEmpty(), "Missing phone number");
            C119154e d = C119155f.m197863d();
            d.mo104210c(true);
            d.mo104225e(str2);
            C119145a aVar = (C119145a) C119148d.f332313c.createBuilder();
            C52288me meVar = mfVar.f137266g;
            if (meVar == null) {
                meVar = C52288me.f137255b;
            }
            if (!meVar.f137257a.isEmpty()) {
                C52288me meVar2 = mfVar.f137266g;
                if (meVar2 == null) {
                    meVar2 = C52288me.f137255b;
                }
                String str3 = meVar2.f137257a;
                C119146b bVar = (C119146b) C119147c.f332310b.createBuilder();
                bVar.copyOnWrite();
                str3.getClass();
                ((C119147c) bVar.instance).f332312a = str3;
                aVar.copyOnWrite();
                C119147c cVar = (C119147c) bVar.build();
                cVar.getClass();
                ((C119148d) aVar.instance).f332316b = cVar;
            }
            for (C52374pj pjVar : mfVar.f137267h) {
                if (pjVar.f137437b == 4) {
                    aVar.mo104207a(C35517aj.m63878a((String) pjVar.f137438c));
                }
            }
            if (!Collections.unmodifiableList(((C119148d) aVar.instance).f332315a).isEmpty()) {
                ((C119150a) d).f332317a = C58833ax.m90834k((C119148d) aVar.build());
            }
            return C60856cj.m92900i(C119156g.m197867a(d.mo104224d(), context));
        }
        if (mfVar.f137260a == 6) {
            ghVar2 = (C51098gh) mfVar.f137261b;
        } else {
            ghVar2 = C51098gh.f133009e;
        }
        if (C35517aj.m63880c(ghVar2)) {
            C46877q qVar = this.f93727i;
            if (mfVar.f137263d.equals("APP_UNIQUE_ENDPOINT")) {
                str = mfVar.f137262c;
            } else {
                str = C35760fb.m64144b(mfVar.f137262c);
            }
            C60870cx a = C35760fb.m64143a(qVar, str, "vnd.android.cursor.item/vnd.com.whatsapp.voip.call");
            C35774t tVar = new C35774t(mfVar);
            return C60922j.m93044g(a, C47810es.m84963c(tVar), C60826bg.f164896a);
        }
        if (mfVar.f137260a == 6) {
            ghVar3 = (C51098gh) mfVar.f137261b;
        } else {
            ghVar3 = C51098gh.f133009e;
        }
        if (ghVar3.f133012b == 1) {
            evVar = (C51058ev) ghVar3.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if (!evVar.f132944b.isEmpty()) {
            if (ghVar3.f133012b == 1) {
                evVar2 = (C51058ev) ghVar3.f133013c;
            } else {
                evVar2 = C51058ev.f132941o;
            }
            if ((evVar2.f132943a & 1024) != 0) {
                C46877q qVar2 = this.f93727i;
                String str4 = mfVar.f137262c;
                int i = mfVar.f137260a;
                if (i == 6) {
                    ghVar4 = (C51098gh) mfVar.f137261b;
                } else {
                    ghVar4 = C51098gh.f133009e;
                }
                if (ghVar4.f133012b == 1) {
                    evVar3 = (C51058ev) ghVar4.f133013c;
                } else {
                    evVar3 = C51058ev.f132941o;
                }
                String str5 = evVar3.f132953k;
                if (i == 6) {
                    ghVar5 = (C51098gh) mfVar.f137261b;
                } else {
                    ghVar5 = C51098gh.f133009e;
                }
                if (ghVar5.f133012b == 1) {
                    evVar4 = (C51058ev) ghVar5.f133013c;
                } else {
                    evVar4 = C51058ev.f132941o;
                }
                C60870cx a2 = C35710ef.m64102a(qVar2, str4, str5, evVar4.f132944b);
                C35775u uVar = new C35775u(mfVar);
                return C60922j.m93044g(a2, C47810es.m84963c(uVar), C60826bg.f164896a);
            }
        }
        if ((mfVar.f137263d.equals("PHONE_NUMBER") || mfVar.f137263d.equals("EMERGENCY")) && !mfVar.f137262c.isEmpty()) {
            if (mfVar.f137263d.equals("EMERGENCY") || PhoneNumberUtils.isEmergencyNumber(mfVar.f137262c)) {
                Intent intent = new Intent("android.intent.action.CALL_PRIVILEGED");
                intent.setData(Uri.parse("tel:".concat(String.valueOf(mfVar.f137262c))));
                if (mfVar.f137264e) {
                    intent.putExtra("android.telecom.extra.START_CALL_WITH_SPEAKERPHONE", true);
                }
                if (!C36188j.m64589a(C36188j.m64590b(intent, packageManager), packageManager).isEmpty()) {
                    return C60856cj.m92900i(intent);
                }
                throw new C35471g("Unable to call emergency number. CALL_PRIVILEGED intent is not supported");
            }
            Intent intent2 = new Intent("android.intent.action.CALL");
            try {
                this.f93723e.getPackageInfo("com.android.server.telecom", 0);
                intent2.setPackage("com.android.server.telecom");
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (mfVar.f137264e) {
                intent2.putExtra("android.telecom.extra.START_CALL_WITH_SPEAKERPHONE", true);
            }
            intent2.setData(Uri.parse("tel:".concat(String.valueOf(mfVar.f137262c))));
            return C60856cj.m92900i(intent2);
        } else if (mfVar.f137263d.equals("VOICEMAIL")) {
            Intent intent3 = new Intent("android.intent.action.CALL");
            if (mfVar.f137264e) {
                intent3.putExtra("android.telecom.extra.START_CALL_WITH_SPEAKERPHONE", true);
            }
            intent3.setData(Uri.parse("voicemail:"));
            return C60856cj.m92900i(intent3);
        } else {
            throw new C35471g("Unsupported CallArgs");
        }
    }

    /* renamed from: c */
    public final C60870cx mo39834c(C52289mf mfVar, C35470f fVar) {
        C51098gh ghVar;
        C60870cx cxVar;
        if (mfVar.f137260a == 6) {
            ghVar = (C51098gh) mfVar.f137261b;
        } else {
            ghVar = C51098gh.f133009e;
        }
        if (C35517aj.m63879b(ghVar) || (!mfVar.f137263d.equals("PHONE_NUMBER") && !mfVar.f137263d.equals("EMERGENCY") && !mfVar.f137263d.equals("VOICEMAIL"))) {
            cxVar = C60856cj.m92900i(true);
        } else if (C36196a.m64596a("android.permission.CALL_PHONE", this.f93721c)) {
            cxVar = C60856cj.m92900i(true);
        } else {
            cxVar = this.f93728j.mo20788a(fVar, new String[]{"android.permission.CALL_PHONE"});
        }
        C35776v vVar = new C35776v(this, mfVar, fVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(vVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo39835d(C52289mf mfVar) {
        C51098gh ghVar;
        C51058ev evVar;
        if (this.f93725g.isPresent()) {
            if (mfVar.f137260a == 6) {
                ghVar = (C51098gh) mfVar.f137261b;
            } else {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            if (evVar.f132944b.isEmpty() && mfVar.f137263d.equals("PHONE_NUMBER")) {
                ((C35490a) this.f93725g.get()).mo39667b(mfVar.f137262c);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo39836e() {
        return this.f93726h || ((C46897i) this.f93729k.f184849a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45370888").mo50907f();
    }
}
