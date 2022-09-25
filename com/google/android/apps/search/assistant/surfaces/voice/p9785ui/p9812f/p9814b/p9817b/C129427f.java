package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.input.chips.lens.LensInputChipContent$shouldShowChip$1", mo61344c = "LensInputChipContent.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.b.f */
/* compiled from: PG */
final class C129427f extends C69572j implements C69630p {

    /* renamed from: a */
    int f355381a;

    /* renamed from: b */
    final /* synthetic */ C129428g f355382b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129427f(C129428g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f355382b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129427f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a A[Catch:{ RuntimeException -> 0x0096, all -> 0x000c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f355381a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000f
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x000c }
            goto L_0x002a
        L_0x000c:
            r7 = move-exception
            goto L_0x00ab
        L_0x000f:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.b.g r7 = r6.f355382b
            boolean r1 = r7.f355386d
            if (r1 != 0) goto L_0x001b
        L_0x0018:
            r2 = 0
            goto L_0x00cb
        L_0x001b:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.a r7 = r7.f355387e     // Catch:{ all -> 0x000c }
            com.google.common.util.concurrent.cx r7 = r7.mo109107a()     // Catch:{ all -> 0x000c }
            r6.f355381a = r2     // Catch:{ all -> 0x000c }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r6)     // Catch:{ all -> 0x000c }
            if (r7 != r0) goto L_0x002a
            return r0
        L_0x002a:
            com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult r7 = (com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult) r7     // Catch:{ all -> 0x000c }
            android.app.assist.AssistStructure r0 = r7.f89683b     // Catch:{ all -> 0x000c }
            android.app.assist.AssistContent r7 = r7.f89684c     // Catch:{ all -> 0x000c }
            j$.util.Optional r7 = com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9886b.C130352d.m212808e(r0, r7)     // Catch:{ all -> 0x000c }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x000c }
            if (r0 != 0) goto L_0x0018
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.b.g r0 = r6.f355382b     // Catch:{ all -> 0x000c }
            android.content.Context r0 = r0.f355384b     // Catch:{ all -> 0x000c }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x000c }
            android.content.ComponentName r7 = (android.content.ComponentName) r7     // Catch:{ all -> 0x000c }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x000c }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x000c }
            java.lang.String r4 = "android.intent.action.MAIN"
            r1.<init>(r4)     // Catch:{ all -> 0x000c }
            java.lang.String r4 = "android.intent.category.HOME"
            r1.addCategory(r4)     // Catch:{ all -> 0x000c }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ RuntimeException -> 0x0096 }
            r4 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r1, r4)     // Catch:{ RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x007a
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b.C129422a.f355368a     // Catch:{ RuntimeException -> 0x0096 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ RuntimeException -> 0x0096 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ RuntimeException -> 0x0096 }
            r4 = 38546(0x9692, float:5.4014E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ RuntimeException -> 0x0096 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ RuntimeException -> 0x0096 }
            java.lang.String r4 = "Get launcher package: %s"
            android.content.pm.ActivityInfo r5 = r0.activityInfo     // Catch:{ RuntimeException -> 0x0096 }
            java.lang.String r5 = r5.packageName     // Catch:{ RuntimeException -> 0x0096 }
            r1.mo56389s(r4, r5)     // Catch:{ RuntimeException -> 0x0096 }
        L_0x007a:
            if (r0 != 0) goto L_0x008b
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b.C129422a.f355368a     // Catch:{ all -> 0x000c }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x000c }
            java.lang.String r0 = "Getting launcher as null"
            r1 = 38547(0x9693, float:5.4016E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x000c }
            goto L_0x0018
        L_0x008b:
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ all -> 0x000c }
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x000c }
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x000c }
            if (r7 == 0) goto L_0x00cb
            goto L_0x0018
        L_0x0096:
            r7 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b.C129422a.f355368a     // Catch:{ all -> 0x000c }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x000c }
            java.lang.String r1 = "Exception at getting launcher: %s"
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x000c }
            r2 = 38548(0x9694, float:5.4017E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r7)     // Catch:{ all -> 0x000c }
            goto L_0x0018
        L_0x00ab:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b.C129428g.f355383a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r7 = r0.mo56382g(r7)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 38554(0x969a, float:5.4026E-41)
            r0.<init>(r1)
            r7.mo56379ah(r0)
            java.lang.String r0 = "Couldn't show Lens chip."
            r7.mo56386p(r0)
            goto L_0x0018
        L_0x00cb:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b.C129427f.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129427f(this.f355382b, gVar);
    }
}
