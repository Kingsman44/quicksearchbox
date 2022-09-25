package com.google.android.libraries.search.assistant.performer.communication;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.TelecomManager;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35466b;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.v */
/* compiled from: PG */
public final /* synthetic */ class C35776v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35778x f93716a;

    /* renamed from: b */
    public final /* synthetic */ C52289mf f93717b;

    /* renamed from: c */
    public final /* synthetic */ C35470f f93718c;

    public /* synthetic */ C35776v(C35778x xVar, C52289mf mfVar, C35470f fVar) {
        this.f93716a = xVar;
        this.f93717b = mfVar;
        this.f93718c = fVar;
    }

    public final C60870cx apply(Object obj) {
        C51098gh ghVar;
        C51098gh ghVar2;
        C51098gh ghVar3;
        Uri uri;
        C35778x xVar = this.f93716a;
        C52289mf mfVar = this.f93717b;
        C35470f fVar = this.f93718c;
        xVar.f93724f.mo39717k();
        if (!((Boolean) obj).booleanValue()) {
            ((C59052c) ((C59052c) C35778x.f93719a.mo56224b()).mo56372aa(51604)).mo56386p("Permission denied");
            xVar.f93724f.mo39715i(C62722b.PERMISSION_DENIED);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.PERMISSION_DENIED));
        }
        try {
            if (mfVar.f137268i) {
                if (mfVar.f137260a == 6) {
                    ghVar2 = (C51098gh) mfVar.f137261b;
                } else {
                    ghVar2 = C51098gh.f133009e;
                }
                if (!C35517aj.m63880c(ghVar2)) {
                    if (mfVar.f137260a == 6) {
                        ghVar3 = (C51098gh) mfVar.f137261b;
                    } else {
                        ghVar3 = C51098gh.f133009e;
                    }
                    if (!C35517aj.m63879b(ghVar3)) {
                        if ("VOICEMAIL".equals(mfVar.f137263d)) {
                            uri = Uri.parse("voicemail:".concat(String.valueOf(mfVar.f137262c)));
                        } else {
                            uri = Uri.parse("tel:".concat(String.valueOf(mfVar.f137262c)));
                        }
                        Bundle bundle = new Bundle();
                        if (mfVar.f137264e) {
                            bundle.putBoolean("android.telecom.extra.START_CALL_WITH_SPEAKERPHONE", true);
                        }
                        ((C59052c) ((C59052c) C35778x.f93719a.mo56224b()).mo56372aa(51601)).mo56386p("Placing call with TelecomManager");
                        xVar.f93724f.mo39718l();
                        TelecomManager telecomManager = (TelecomManager) C39239a.m68666a(xVar.f93721c, xVar.f93720b).getSystemService(TelecomManager.class);
                        if (telecomManager == null) {
                            C34819a c = C34819a.m63580c(C35548bg.f93351a, C35550bi.CALL_PERFORMER_NO_TELECOM_MANAGER);
                            xVar.f93724f.mo39716j(c.mo39520a(), c.mo39522e());
                            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "no telecom manager service"));
                        }
                        if (xVar.mo39836e()) {
                            xVar.mo39835d(mfVar);
                        }
                        telecomManager.placeCall(uri, bundle);
                        xVar.f93724f.mo39715i(C62722b.OK);
                        return C60856cj.m92900i(C36180b.f94544a);
                    }
                }
            }
            PackageManager packageManager = xVar.f93723e;
            if (mfVar.f137260a == 6) {
                ghVar = (C51098gh) mfVar.f137261b;
            } else {
                ghVar = C51098gh.f133009e;
            }
            if (!C35517aj.m63881d(packageManager, ghVar)) {
                C60870cx b = xVar.mo39833b(xVar.f93721c, xVar.f93723e, mfVar);
                C35772r rVar = new C35772r(xVar, mfVar, fVar);
                return C60922j.m93045h(b, C47810es.m84966f(rVar), xVar.f93722d);
            } else if (fVar instanceof C35466b) {
                C60870cx b2 = xVar.mo39833b(xVar.f93721c, xVar.f93723e, mfVar);
                C35768n nVar = new C35768n(xVar, mfVar, (C35466b) fVar);
                return C60922j.m93045h(b2, C47810es.m84966f(nVar), xVar.f93722d);
            } else {
                ((C59052c) ((C59052c) C35778x.f93719a.mo56225c()).mo56372aa(51606)).mo56386p("The client op requires an activity-based intent starter.");
                xVar.f93724f.mo39715i(C62722b.UNAVAILABLE);
                return C60856cj.m92900i(C36180b.m64578b(C52235kf.UNAVAILABLE));
            }
        } catch (C35471g unused) {
            ((C59052c) ((C59052c) C35778x.f93719a.mo56225c()).mo56372aa(51602)).mo56386p("Invalid data in call args");
            xVar.f93724f.mo39715i(C62722b.INVALID_ARGUMENT);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INTERNAL));
        } catch (PackageManager.NameNotFoundException unused2) {
            ((C59052c) ((C59052c) C35778x.f93719a.mo56225c()).mo56372aa(51603)).mo56386p("Failed to get package information");
            C34819a c2 = C34819a.m63580c(C35548bg.f93351a, C35550bi.CALL_PERFORMER_TELECOM_PACKAGE_MISSING);
            xVar.f93724f.mo39716j(c2.mo39520a(), c2.mo39522e());
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INTERNAL));
        }
    }
}
