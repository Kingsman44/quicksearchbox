package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129569a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.C129411a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.f */
/* compiled from: PG */
public final class C129436f implements C129411a {

    /* renamed from: b */
    public static final /* synthetic */ int f355404b = 0;

    /* renamed from: c */
    private static final List f355405c = C69540x.m100947e("com.android.chrome", "com.chrome.beta", "com.chrome.canary", "com.google.android.apps.chrome_dev", "com.chrome.dev", "com.google.android.apps.chrome");

    /* renamed from: d */
    private static final C59071e f355406d = C59071e.m91331h();

    /* renamed from: a */
    public final Context f355407a;

    /* renamed from: e */
    private final C129569a f355408e;

    /* renamed from: f */
    private final C71422aw f355409f;

    public C129436f(Context context, C129569a aVar, C71422aw awVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "assistDataAccessor");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f355407a = context;
        this.f355408e = aVar;
        this.f355409f = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo109028a() {
        return C71663i.m104692e(this.f355409f, (C71424ay) null, new C129433c(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[Catch:{ Exception -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109033b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c.C129434d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.d r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c.C129434d) r0
            int r1 = r0.f355400c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355400c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.d r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f355398a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355400c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            p5462h.C69714l.m101134b(r6)     // Catch:{ Exception -> 0x0028 }
            goto L_0x0044
        L_0x0028:
            r6 = move-exception
            goto L_0x004f
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.a r6 = r5.f355408e     // Catch:{ Exception -> 0x0028 }
            com.google.common.util.concurrent.cx r6 = r6.mo109107a()     // Catch:{ Exception -> 0x0028 }
            r0.f355400c = r4     // Catch:{ Exception -> 0x0028 }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ Exception -> 0x0028 }
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult r6 = (com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult) r6     // Catch:{ Exception -> 0x0028 }
            android.app.assist.AssistStructure r6 = r6.f89683b     // Catch:{ Exception -> 0x0028 }
            if (r6 == 0) goto L_0x004e
            android.content.ComponentName r3 = r6.getActivityComponent()     // Catch:{ Exception -> 0x0028 }
        L_0x004e:
            return r3
        L_0x004f:
            com.google.common.f.e r0 = f355406d
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r6 = r0.mo56382g(r6)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 38560(0x96a0, float:5.4034E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Failed to fetch foreground activity"
            r6.mo56386p(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c.C129436f.mo109033b(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109034c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c.C129435e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c.C129435e) r0
            int r1 = r0.f355403c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355403c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.e r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.e
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f355401a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355403c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x003a
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            r0.f355403c = r3
            java.lang.Object r5 = r4.mo109033b(r0)
            if (r5 == r1) goto L_0x005e
        L_0x003a:
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            r0 = 0
            if (r5 == 0) goto L_0x0058
            java.util.List r1 = f355405c
            java.lang.String r2 = r5.getPackageName()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "org.chromium.chrome.browser.ChromeTabbedActivity"
            java.lang.String r5 = r5.getClassName()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c.C129436f.mo109034c(h.c.g):java.lang.Object");
    }
}
