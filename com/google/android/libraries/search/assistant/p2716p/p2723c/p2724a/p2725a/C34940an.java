package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import android.provider.ContactsContract;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35733aa;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35740h;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35741i;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35745m;
import com.google.android.libraries.search.assistant.performer.communication.p2741f.C35756x;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.an */
/* compiled from: PG */
public final /* synthetic */ class C34940an implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C34942ap f92607a;

    /* renamed from: b */
    public final /* synthetic */ long f92608b;

    /* renamed from: c */
    public final /* synthetic */ C58490gz f92609c;

    public /* synthetic */ C34940an(C34942ap apVar, long j, C58490gz gzVar) {
        this.f92607a = apVar;
        this.f92608b = j;
        this.f92609c = gzVar;
    }

    public final void accept(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        Object obj2;
        C34942ap apVar = this.f92607a;
        long j = this.f92608b;
        C58490gz gzVar = this.f92609c;
        String str = (String) obj;
        if ("com.google.android.apps.messaging".equals(str)) {
            C35733aa aaVar = apVar.f92612c;
            C46463o a = aaVar.f93652c.mo39825a(ContactsContract.Contacts.CONTENT_URI, new String[]{"name_raw_contact_id"}, "_id = ?", new String[]{Long.toString(j)}, "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
            if (a == null) {
                obj2 = C60856cj.m92900i(C58485gu.m89845m());
            } else {
                obj2 = a.f121591a.mo57272e(C47810es.m84970j(C35745m.f93672a), aaVar.f93653d).mo57275g();
            }
            gzVar.mo55429h(str, obj2);
        } else if ("com.whatsapp".equals(str)) {
            C35733aa aaVar2 = apVar.f92612c;
            C46463o a2 = aaVar2.f93652c.mo39825a(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, "account_type = ? AND contact_id = ?", new String[]{"com.whatsapp", Long.toString(j)}, "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
            if (a2 == null) {
                cxVar2 = C60856cj.m92900i(Optional.empty());
            } else {
                cxVar2 = a2.f121591a.mo57272e(C47810es.m84970j(C35741i.f93668a), aaVar2.f93653d).mo57275g();
            }
            C35756x xVar = new C35756x(aaVar2);
            C60870cx h = C60922j.m93045h(cxVar2, C47810es.m84966f(xVar), aaVar2.f93654e);
            C34935ai aiVar = C34935ai.f92602a;
            gzVar.mo55429h(str, C60922j.m93044g(h, C47810es.m84963c(aiVar), apVar.f92611b));
        } else if ("jp.naver.line.android".equals(str)) {
            C35733aa aaVar3 = apVar.f92612c;
            C46463o a3 = aaVar3.f93652c.mo39825a(ContactsContract.Data.CONTENT_URI, new String[]{"data1"}, "contact_id = ? AND mimetype = ?", new String[]{Long.toString(j), "vnd.android.cursor.item/vnd.jp.naver.line.android.profile"}, "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
            if (a3 == null) {
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                cxVar = a3.f121591a.mo57272e(C47810es.m84970j(C35740h.f93667a), aaVar3.f93653d).mo57275g();
            }
            C34936aj ajVar = C34936aj.f92603a;
            gzVar.mo55429h(str, C60922j.m93044g(cxVar, C47810es.m84963c(ajVar), apVar.f92611b));
        } else {
            ((C59052c) ((C59052c) C34942ap.f92610a.mo56226d()).mo56372aa(51211)).mo56389s("Currently Unsupported app: %s", str);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
