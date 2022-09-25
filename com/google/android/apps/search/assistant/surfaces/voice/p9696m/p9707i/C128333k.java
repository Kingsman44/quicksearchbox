package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17506i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17510m;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17518u;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35609ab;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.k */
/* compiled from: PG */
public final class C128333k implements C35609ab {

    /* renamed from: a */
    public static final C59071e f352953a = C59071e.m91331h();

    /* renamed from: b */
    public static final C17508k f352954b;

    /* renamed from: d */
    private static final C58528ij f352955d = new C58759qy("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE");

    /* renamed from: c */
    public final C17362b f352956c;

    /* renamed from: e */
    private final Context f352957e;

    /* renamed from: f */
    private final C71422aw f352958f;

    /* renamed from: g */
    private final NotificationManager f352959g;

    /* renamed from: h */
    private final C121090b f352960h;

    static {
        C17506i iVar = (C17506i) C17508k.f50521c.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C17510m a = C69664n.m101061g(iVar, "builder");
        C17518u uVar = C17518u.f50532a;
        C69664n.m101060f(uVar, "getDefaultInstance()");
        a.mo23377c(uVar);
        f352954b = a.mo23375a();
    }

    public C128333k(Context context, C71422aw awVar, NotificationManager notificationManager, C17362b bVar, C121090b bVar2) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(notificationManager, "notificationManager");
        C69664n.m101061g(bVar2, "mobileLocaleSettingsReadAccessor");
        this.f352957e = context;
        this.f352958f = awVar;
        this.f352959g = notificationManager;
        this.f352956c = bVar;
        this.f352960h = bVar2;
    }

    /* renamed from: a */
    public final C60870cx mo39740a(aet aet) {
        C69664n.m101061g(aet, "source");
        if (aet == aet.ALTERNATIVE) {
            return C60856cj.m92900i(C58733pz.f156496a);
        }
        if (C36619a.m65149e(this.f352957e)) {
            return C60856cj.m92900i(C58733pz.f156496a);
        }
        return C71663i.m104692e(this.f352958f, (C71424ay) null, new C128332j(this, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.speech.k.a.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.speech.k.a.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.speech.k.a.ae} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108395b(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128329g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.m.i.g r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128329g) r0
            int r1 = r0.f352941d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f352941d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.m.i.g r0 = new com.google.android.apps.search.assistant.surfaces.voice.m.i.g
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f352939b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f352941d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f352938a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0071
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            android.content.Context r7 = r6.f352957e
            r2 = 2132084042(0x7f15054a, float:1.9808243E38)
            java.lang.String r7 = r7.getString(r2)
            java.lang.String r2 = "context.getString(R.stri…ification_permission_tts)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            com.google.speech.k.a.ah r2 = com.google.speech.p5224k.p5225a.C67190ah.f182619q
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.speech.k.a.ae r2 = (com.google.speech.p5224k.p5225a.C67187ae) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.speech.k.a.ah r4 = (com.google.speech.p5224k.p5225a.C67190ah) r4
            r7.getClass()
            int r5 = r4.f182622a
            r5 = r5 | r3
            r4.f182622a = r5
            r4.f182625d = r7
            com.google.android.apps.search.assistant.platform.h.f.b r7 = r6.f352960h
            com.google.common.util.concurrent.cx r7 = r7.mo105044b()
            java.lang.String r4 = "mobileLocaleSettingsRead…or.primaryAssistantLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r4)
            r0.f352938a = r2
            r0.f352941d = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 == r1) goto L_0x0128
            r0 = r2
        L_0x0071:
            java.lang.String r1 = "mobileLocaleSettingsRead…ryAssistantLocale.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            java.util.Locale r7 = (java.util.Locale) r7
            java.lang.String r1 = r7.getCountry()
            java.lang.String r2 = "locale.country"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            int r1 = r1.length()
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r4 = "locale.language"
            java.lang.String r5 = "US"
            if (r1 != 0) goto L_0x00a1
            java.lang.String r7 = r7.getLanguage()
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r4)
            java.util.Locale r1 = java.util.Locale.US
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            java.lang.String r7 = r7.toLowerCase(r1)
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            goto L_0x00dd
        L_0x00a1:
            java.lang.String r1 = r7.getLanguage()
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            java.util.Locale r4 = java.util.Locale.US
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.lang.String r1 = r1.toLowerCase(r4)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            java.lang.String r7 = r7.getCountry()
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            java.util.Locale r2 = java.util.Locale.US
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.lang.String r7 = r7.toUpperCase(r2)
            java.lang.String r2 = "this as java.lang.String).toUpperCase(locale)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "-"
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
        L_0x00dd:
            r1 = r0
            com.google.protobuf.bn r1 = (com.google.protobuf.C62934bn) r1
            r1.copyOnWrite()
            com.google.speech.k.a.ae r0 = (com.google.speech.p5224k.p5225a.C67187ae) r0
            com.google.protobuf.bv r0 = r0.instance
            com.google.speech.k.a.ah r0 = (com.google.speech.p5224k.p5225a.C67190ah) r0
            com.google.speech.k.a.ah r2 = com.google.speech.p5224k.p5225a.C67190ah.f182619q
            r7.getClass()
            int r2 = r0.f182622a
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r0.f182622a = r2
            r0.f182632k = r7
            com.google.protobuf.bv r7 = r1.build()
            java.lang.String r0 = "newBuilder()\n        .se…       )\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            com.google.speech.k.a.ah r7 = (com.google.speech.p5224k.p5225a.C67190ah) r7
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.jz r0 = (com.google.assistant.p3897e.p3921j.C52228jz) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.assistant.e.j.adu r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            java.lang.String r1 = "speech.s3.TtsServiceRequest"
            r0.mo53678c(r1)
            com.google.protobuf.z r7 = r7.toByteString()
            java.lang.String r1 = "ttsServiceRequest.toByteString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            r0.mo53677b(r7)
            com.google.assistant.e.j.ka r7 = r0.mo53676a()
            return r7
        L_0x0128:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128333k.mo108395b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108396c(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128331i
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.voice.m.i.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128331i) r0
            int r1 = r0.f352950c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f352950c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.m.i.i r0 = new com.google.android.apps.search.assistant.surfaces.voice.m.i.i
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f352948a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f352950c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r9)
            goto L_0x00d1
        L_0x0028:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0030:
            p5462h.C69714l.m101134b(r9)
            kotlinx.coroutines.aw r9 = r8.f352958f
            com.google.android.apps.search.assistant.surfaces.voice.m.i.h r2 = new com.google.android.apps.search.assistant.surfaces.voice.m.i.h
            r4 = 0
            r2.<init>(r8, r4)
            r5 = 3
            kotlinx.coroutines.be r9 = kotlinx.coroutines.C71803m.m105042c(r9, r4, r4, r2, r5)
            android.app.NotificationManager r2 = r8.f352959g
            java.lang.String r4 = "MA_NOTIFICATION_SETTINGS"
            android.app.NotificationChannel r2 = r2.getNotificationChannel(r4)
            if (r2 != 0) goto L_0x005e
            android.app.NotificationChannel r2 = new android.app.NotificationChannel
            android.content.Context r5 = r8.f352957e
            r6 = 2132084039(0x7f150547, float:1.9808237E38)
            java.lang.String r5 = r5.getString(r6)
            r6 = 4
            r2.<init>(r4, r5, r6)
            android.app.NotificationManager r5 = r8.f352959g
            r5.createNotificationChannel(r2)
        L_0x005e:
            android.content.Context r2 = r8.f352957e
            android.content.Intent r5 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65146b(r2)
            r6 = 201326592(0xc000000, float:9.8607613E-32)
            r7 = 0
            android.content.Intent r5 = com.google.android.libraries.p11029ao.p11030a.C147798a.m240896b(r5, r6, r7)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r7, r5, r6)
            androidx.core.app.r r5 = new androidx.core.app.r
            android.content.Context r6 = r8.f352957e
            r7 = 2132084038(0x7f150546, float:1.9808235E38)
            java.lang.String r6 = r6.getString(r7)
            r5.<init>(r6, r2)
            androidx.core.app.s r5 = r5.mo5008a()
            androidx.core.app.z r6 = new androidx.core.app.z
            android.content.Context r7 = r8.f352957e
            r6.<init>(r7, r4)
            android.content.Context r4 = r8.f352957e
            r7 = 2132084041(0x7f150549, float:1.9808241E38)
            java.lang.String r4 = r4.getString(r7)
            java.lang.CharSequence r4 = androidx.core.app.C1839z.m5037c(r4)
            r6.f5685e = r4
            android.content.Context r4 = r8.f352957e
            r7 = 2132084040(0x7f150548, float:1.980824E38)
            java.lang.String r4 = r4.getString(r7)
            java.lang.CharSequence r4 = androidx.core.app.C1839z.m5037c(r4)
            r6.f5686f = r4
            r6.f5687g = r2
            r2 = 16
            r6.mo5015d(r2, r3)
            r6.mo5017f(r5)
            android.app.Notification r2 = r6.f5679J
            r4 = 2131234424(0x7f080e78, float:1.8085013E38)
            r2.icon = r4
            android.app.Notification r2 = r6.mo5013a()
            java.lang.String r4 = "Builder(context, NOTIFIC…heme_24)\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            android.app.NotificationManager r4 = r8.f352959g
            r5 = 327689(0x50009, float:4.5919E-40)
            r4.notify(r5, r2)
            r0.f352950c = r3
            java.lang.Object r9 = r9.mo62825a(r0)
            if (r9 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            com.google.common.b.ij r9 = f352955d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128333k.mo108396c(h.c.g):java.lang.Object");
    }
}
