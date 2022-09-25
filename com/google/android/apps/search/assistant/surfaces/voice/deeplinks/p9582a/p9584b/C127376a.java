package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.p9584b;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127372a;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127375b;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.C127379d;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9582a.p9583a.C127373a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127414a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127415b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127416c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127417d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127418e;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.apb;
import com.google.assistant.p3897e.p3921j.apc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b.a */
/* compiled from: PG */
public final class C127376a implements C127373a {

    /* renamed from: a */
    private static final C59071e f350750a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.deeplinks.a.b.a");

    /* renamed from: b */
    private final boolean f350751b;

    public C127376a(boolean z) {
        this.f350751b = z;
    }

    /* renamed from: a */
    public final C127375b mo108038a(C127379d dVar) {
        String str = dVar.f350764c;
        ((C59052c) ((C59052c) f350750a.mo56224b()).mo56372aa(37404)).mo56389s("AssistantLinksDeeplinkDataConverterImpl is processing the link, deeplink url: %s", dVar.f350764c);
        C127372a aVar = (C127372a) C127375b.f350745c.createBuilder();
        C127417d dVar2 = (C127417d) C127418e.f350849g.createBuilder();
        String str2 = dVar.f350763b;
        apb apb = (apb) apc.f135542e.createBuilder();
        apb.copyOnWrite();
        apc apc = (apc) apb.instance;
        str.getClass();
        apc.f135544a |= 1;
        apc.f135545b = str;
        if (str2 != null) {
            apb.copyOnWrite();
            apc apc2 = (apc) apb.instance;
            apc2.f135544a |= 4;
            apc2.f135546c = str2;
        }
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.UrlIntentInput";
        C63088z byteString = ((apc) apb.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "url.INTENT";
        dsVar.mo53729a("url_intent_input", (C52230ka) jzVar.build());
        C51805du duVar2 = (C51805du) dsVar.build();
        dVar2.copyOnWrite();
        C127418e eVar = (C127418e) dVar2.instance;
        duVar2.getClass();
        eVar.f350853c = duVar2;
        eVar.f350852b = 1;
        C127414a aVar2 = (C127414a) C127416c.f350845c.createBuilder();
        C127415b bVar = C127415b.DEEPLINK;
        aVar2.copyOnWrite();
        C127416c cVar = (C127416c) aVar2.instance;
        cVar.f350848b = bVar.getNumber();
        cVar.f350847a |= 1;
        dVar2.copyOnWrite();
        C127418e eVar2 = (C127418e) dVar2.instance;
        C127416c cVar2 = (C127416c) aVar2.build();
        cVar2.getClass();
        eVar2.f350855e = cVar2;
        eVar2.f350851a |= 2;
        aVar.copyOnWrite();
        C127375b bVar2 = (C127375b) aVar.instance;
        C127418e eVar3 = (C127418e) dVar2.build();
        eVar3.getClass();
        bVar2.f350748b = eVar3;
        bVar2.f350747a = 1;
        return (C127375b) aVar.build();
    }

    /* renamed from: b */
    public final boolean mo108039b(Uri uri) {
        if (!this.f350751b) {
            ((C59052c) ((C59052c) f350750a.mo56226d()).mo56372aa(37406)).mo56386p("Flag AssistantLinkDeeplink -> ma_deeplinks_enabled_for_assistant_links not enabled");
            return false;
        } else if ("mobile-assistant.google.com".equals(uri.getHost()) && ((String) Optional.ofNullable(uri.getPath()).orElse(BuildConfig.FLAVOR)).startsWith("/services/invoke") && ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))) {
            return true;
        } else {
            ((C59052c) ((C59052c) f350750a.mo56226d()).mo56372aa(37405)).mo56389s("Passed in assistant link is not valid. Deeplink: %s", uri);
            return false;
        }
    }
}
