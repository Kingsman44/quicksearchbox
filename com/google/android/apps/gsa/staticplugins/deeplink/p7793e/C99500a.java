package com.google.android.apps.gsa.staticplugins.deeplink.p7793e;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84645a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.logger.C89839b;
import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.android.gms.common.C143701ac;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52453sh;
import com.google.assistant.p3897e.p3921j.C52454si;
import com.google.assistant.p3897e.p3921j.C52455sj;
import com.google.assistant.p3897e.p3921j.C52456sk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.e.a */
/* compiled from: PG */
public final class C99500a extends C86734a implements C84645a {

    /* renamed from: a */
    private static final C59071e f278425a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.e.a");

    /* renamed from: b */
    private final Context f278426b;

    /* renamed from: c */
    private final C85005h f278427c;

    /* renamed from: f */
    private final C68214a f278428f;

    /* renamed from: g */
    private final C86124t f278429g;

    public C99500a(Context context, C85005h hVar, C68214a aVar, C86124t tVar) {
        super(C118575h.WORKER_DEEPLINK, "communicationdeeplink");
        this.f278426b = context;
        this.f278427c = hVar;
        this.f278428f = aVar;
        this.f278429g = tVar;
    }

    /* renamed from: c */
    private static int m165022c(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("deeplink_id");
            if (queryParameter != null) {
                return Integer.parseInt(queryParameter);
            }
            return 13228;
        } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
            C59104x c = f278425a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CommsDeeplinkWorker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19237)).mo56389s("Failed to parse communication deeplink id. deeplink[%s]", uri);
            return 13228;
        }
    }

    /* renamed from: e */
    private final void m165023e(String str) {
        C87565h hVar = new C87565h();
        hVar.f236523a = "and.opa.conversation.deeplink";
        hVar.f236497A = false;
        hVar.f236560f = 2;
        Bundle a = hVar.mo81685a();
        a.putBoolean("from_trusted_google_app_promo", true);
        a.putString("opa_trusted_google_app_promo_suggestion_id", str);
        this.f278427c.mo78612H(a, false);
    }

    /* renamed from: f */
    private final boolean m165024f(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("name");
            String queryParameter2 = uri.getQueryParameter("phonenumber");
            String queryParameter3 = uri.getQueryParameter("callId");
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                if (!TextUtils.isEmpty(queryParameter3)) {
                    C87565h hVar = new C87565h();
                    hVar.f236523a = "and.opa.conversation.deeplink";
                    hVar.f236497A = false;
                    hVar.f236560f = 3;
                    C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                    jzVar.copyOnWrite();
                    C52230ka kaVar = (C52230ka) jzVar.instance;
                    kaVar.f137059a |= 1;
                    kaVar.f137060b = "assistant.api.client_input.DialerSmartReplyInput";
                    C52453sh shVar = (C52453sh) C52456sk.f137703e.createBuilder();
                    C52454si siVar = (C52454si) C52455sj.f137698d.createBuilder();
                    siVar.copyOnWrite();
                    queryParameter.getClass();
                    ((C52455sj) siVar.instance).f137700a = queryParameter;
                    siVar.copyOnWrite();
                    queryParameter2.getClass();
                    ((C52455sj) siVar.instance).f137701b = queryParameter2;
                    siVar.copyOnWrite();
                    ((C52455sj) siVar.instance).f137702c = 1;
                    C52455sj sjVar = (C52455sj) siVar.build();
                    shVar.copyOnWrite();
                    sjVar.getClass();
                    ((C52456sk) shVar.instance).f137708d = sjVar;
                    shVar.copyOnWrite();
                    ((C52456sk) shVar.instance).f137707c = 1;
                    shVar.copyOnWrite();
                    C52456sk skVar = (C52456sk) shVar.instance;
                    queryParameter3.getClass();
                    skVar.f137705a = 3;
                    skVar.f137706b = queryParameter3;
                    C63088z byteString = ((C52456sk) shVar.build()).toByteString();
                    jzVar.copyOnWrite();
                    C52230ka kaVar2 = (C52230ka) jzVar.instance;
                    byteString.getClass();
                    kaVar2.f137059a |= 2;
                    kaVar2.f137061c = byteString;
                    C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                    dsVar.copyOnWrite();
                    C51805du duVar = (C51805du) dsVar.instance;
                    duVar.f135926a |= 1;
                    duVar.f135927b = "communication.DIALER_SMART_REPLY";
                    dsVar.mo53729a("dialer_smart_reply_input", (C52230ka) jzVar.build());
                    hVar.f236517U = ((C51805du) dsVar.build()).toByteArray();
                    this.f278427c.mo78612H(hVar.mo81685a(), false);
                    return true;
                }
            }
            C59104x c = f278425a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CommsDeeplinkWorker");
            ((C59052c) ((C59052c) c).mo56372aa(19245)).mo56386p("Error while retrieving query parameters. Contact Name or Phone Number is empty.");
            return false;
        } catch (NullPointerException | UnsupportedOperationException e) {
            C59104x c2 = f278425a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "CommsDeeplinkWorker");
            ((C59052c) ((C59052c) c2).mo56372aa(19246)).mo56389s("Error while retrieving query parameters: %s", e.getMessage());
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m165025g(android.net.Uri r8) {
        /*
            r0 = 1
            java.lang.String r1 = "id"
            java.lang.String r1 = r8.getQueryParameter(r1)     // Catch:{ IllegalArgumentException -> 0x0073, NullPointerException -> 0x0071, UnsupportedOperationException -> 0x006f }
            if (r1 == 0) goto L_0x0088
            int r2 = r1.hashCode()     // Catch:{ IllegalArgumentException -> 0x0073, NullPointerException -> 0x0071, UnsupportedOperationException -> 0x006f }
            r3 = 4
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 6
            switch(r2) {
                case -1890474813: goto L_0x0052;
                case -1702096251: goto L_0x0048;
                case -1120917961: goto L_0x003e;
                case -213404087: goto L_0x0034;
                case -99449966: goto L_0x002a;
                case 433141802: goto L_0x0020;
                case 1505680243: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x005c
        L_0x0016:
            java.lang.String r2 = "SEND_MESSAGE_SUGGESTION"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 4
            goto L_0x005d
        L_0x0020:
            java.lang.String r2 = "UNKNOWN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 0
            goto L_0x005d
        L_0x002a:
            java.lang.String r2 = "DIALER_SMART_REPLY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 5
            goto L_0x005d
        L_0x0034:
            java.lang.String r2 = "CALL_DIALOG"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x003e:
            java.lang.String r2 = "SEND_MESSAGE_DIALOG"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 3
            goto L_0x005d
        L_0x0048:
            java.lang.String r2 = "CALL_SUGGESTION"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 2
            goto L_0x005d
        L_0x0052:
            java.lang.String r2 = "DUO_VIDEO_CALL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005c
            r1 = 6
            goto L_0x005d
        L_0x005c:
            r1 = -1
        L_0x005d:
            switch(r1) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0069;
                case 2: goto L_0x0068;
                case 3: goto L_0x0067;
                case 4: goto L_0x0066;
                case 5: goto L_0x0065;
                case 6: goto L_0x0063;
                default: goto L_0x0060;
            }
        L_0x0060:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0073, NullPointerException -> 0x0071, UnsupportedOperationException -> 0x006f }
            goto L_0x006b
        L_0x0063:
            r8 = 7
            return r8
        L_0x0065:
            return r7
        L_0x0066:
            return r4
        L_0x0067:
            return r3
        L_0x0068:
            return r5
        L_0x0069:
            return r6
        L_0x006a:
            return r0
        L_0x006b:
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0073, NullPointerException -> 0x0071, UnsupportedOperationException -> 0x006f }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0073, NullPointerException -> 0x0071, UnsupportedOperationException -> 0x006f }
        L_0x006f:
            r1 = move-exception
            goto L_0x0074
        L_0x0071:
            r1 = move-exception
            goto L_0x0074
        L_0x0073:
            r1 = move-exception
        L_0x0074:
            com.google.common.f.e r2 = f278425a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "CommsDeeplinkWorker"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Failed to parse communication deeplink id. deeplink[%s]"
            r4 = 19238(0x4b26, float:2.6958E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56389s(r3, r8)
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.deeplink.p7793e.C99500a.m165025g(android.net.Uri):int");
    }

    /* renamed from: a */
    public final void mo78400a(Uri uri, String str) {
        if (!this.f278429g.mo79746e(C89968ag.f246504d)) {
            C59104x d = f278425a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CommsDeeplinkWorker");
            ((C59052c) ((C59052c) d).mo56372aa(19244)).mo56386p("Communication deeplink is disabled.");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (str == null || !this.f278429g.mo79745c(C89968ag.f246501a).contains(str) || !((C143701ac) this.f278428f.mo27525b()).mo119084c(str)) {
            C59104x c = f278425a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CommsDeeplinkWorker");
            ((C59052c) ((C59052c) c).mo56372aa(19243)).mo56354G("Communication deeplink triggered from untrusted app. deeplink[%s], callingPackage[%s]", uri, str);
            C89839b.m146269a(false, 13228, 3);
            return;
        }
        String host = uri.getHost();
        if (host == null || !host.equals("assistant.google.com")) {
            C59104x d2 = f278425a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "CommsDeeplinkWorker");
            ((C59052c) ((C59052c) d2).mo56372aa(19240)).mo56389s("Deeplink is missing communication host: %s. Ignoring.", uri);
            C89839b.m146269a(false, 13228, 2);
            return;
        }
        String path = uri.getPath();
        if (path == null || !path.equals("/communication")) {
            C59104x d3 = f278425a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "CommsDeeplinkWorker");
            ((C59052c) ((C59052c) d3).mo56372aa(19241)).mo56389s("Deeplink is missing communication path prefix: %s. Ignoring.", uri);
            C89839b.m146269a(false, 13228, 2);
            return;
        }
        int g = m165025g(uri);
        int c2 = m165022c(uri);
        int i = g - 1;
        if (i != 0) {
            if (i == 1) {
                C87565h hVar = new C87565h();
                hVar.f236523a = "and.opa.conversation.deeplink";
                hVar.f236497A = false;
                hVar.f236560f = 3;
                hVar.f236568n = this.f278426b.getString(R.string.dialer_promo_deeplink_call_query);
                this.f278427c.mo78612H(hVar.mo81685a(), false);
            } else if (i == 2) {
                m165023e("suggestion_make_call");
            } else if (i == 3) {
                C87565h hVar2 = new C87565h();
                hVar2.f236523a = "and.opa.conversation.deeplink";
                hVar2.f236497A = false;
                hVar2.f236560f = 3;
                hVar2.f236568n = this.f278426b.getString(R.string.android_messages_promo_deeplink_send_a_message_query);
                this.f278427c.mo78612H(hVar2.mo81685a(), false);
            } else if (i == 4) {
                m165023e("suggestion_send_message");
            } else if (i != 5) {
                C87565h hVar3 = new C87565h();
                hVar3.f236523a = "and.opa.conversation.deeplink";
                hVar3.f236497A = false;
                hVar3.f236560f = 3;
                hVar3.f236568n = this.f278426b.getString(R.string.duo_promo_deeplink_video_call_query);
                this.f278427c.mo78612H(hVar3.mo81685a(), false);
            } else if (!m165024f(uri)) {
                C89839b.m146269a(false, c2, 2);
                return;
            }
            C89839b.m146269a(true, c2, 0);
            return;
        }
        C59104x c3 = f278425a.mo56225c();
        c3.mo56378ag(C58975e.f156826a, "CommsDeeplinkWorker");
        ((C59052c) ((C59052c) c3).mo56372aa(19242)).mo56386p("Unknown feature id in communication deeplink.");
        C89839b.m146269a(false, c2, 2);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
