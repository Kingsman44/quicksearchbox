package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9564p;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127353a;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127355c;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127362j;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2714o.C34919e;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.p.e */
/* compiled from: PG */
public final class C127255e implements C127369n {

    /* renamed from: a */
    public static final C33476a f350445a = new C33476a("assistant.api.params.DisplayContextParams", C51379fn.f133814i);

    /* renamed from: b */
    public static final C32836cd f350446b;

    /* renamed from: c */
    public static final String f350447c = "com.google.android.feature.PIXEL_EXPERIENCE";

    /* renamed from: d */
    public final Context f350448d;

    /* renamed from: e */
    public final C68214a f350449e;

    /* renamed from: f */
    public final C34919e f350450f;

    /* renamed from: g */
    public final C127353a f350451g;

    /* renamed from: h */
    public final C127355c f350452h;

    /* renamed from: i */
    public final C127362j f350453i;

    /* renamed from: j */
    private final C71422aw f350454j;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.display.context.params");
        a.mo38319b(a2.mo38298a());
        f350446b = a.mo38318a();
    }

    public C127255e(Context context, C68214a aVar, C34919e eVar, C127353a aVar2, C127355c cVar, C71422aw awVar, C127362j jVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "displayParamsFetcher");
        C69664n.m101061g(aVar2, "canvasStateStore");
        C69664n.m101061g(cVar, "conversationStateStore");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(jVar, "opaqueTokenStore");
        this.f350448d = context;
        this.f350449e = aVar;
        this.f350450f = eVar;
        this.f350451g = aVar2;
        this.f350452h = cVar;
        this.f350454j = awVar;
        this.f350453i = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350454j, (C71424ay) null, new C127251a(this, (C69577g) null), 3);
    }
}
