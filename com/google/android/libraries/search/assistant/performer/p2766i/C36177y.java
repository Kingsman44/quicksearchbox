package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.assistant.p3897e.p3921j.p3924c.C51745p;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.y */
/* compiled from: PG */
public final /* synthetic */ class C36177y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36178z f94535a;

    /* renamed from: b */
    public final /* synthetic */ C51745p f94536b;

    public /* synthetic */ C36177y(C36178z zVar, C51745p pVar) {
        this.f94535a = zVar;
        this.f94536b = pVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.libraries.search.assistant.performer.i.z r0 = r5.f94535a
            com.google.assistant.e.j.c.p r1 = r5.f94536b
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            com.google.android.libraries.search.assistant.performer.i.ah r2 = r0.f94541e     // Catch:{ RuntimeException -> 0x0077 }
            com.google.android.gms.reminders.i r6 = r2.mo39979a(r6)     // Catch:{ RuntimeException -> 0x0077 }
            com.google.protobuf.cq r1 = r1.f135757a     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
            com.google.assistant.e.j.c.o r1 = (com.google.assistant.p3897e.p3921j.p3924c.C51744o) r1     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
            java.lang.String r2 = ""
            int r3 = r1.f135753a     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
            r4 = 1
            if (r3 != r4) goto L_0x0024
            java.lang.Object r1 = r1.f135754b     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
        L_0x0024:
            com.google.android.gms.reminders.model.TaskIdEntity r1 = new com.google.android.gms.reminders.model.TaskIdEntity     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
            r3 = 0
            r1.<init>(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
            com.google.android.gms.tasks.ab r6 = r6.mo121953c(r1)     // Catch:{ IllegalArgumentException -> 0x0063, IllegalStateException -> 0x004f }
            com.google.common.util.concurrent.cx r6 = com.google.android.libraries.p3339v.C43205e.m76192b(r6)
            com.google.common.util.concurrent.bs r6 = com.google.common.util.concurrent.C60838bs.m92859i(r6)
            com.google.android.libraries.search.assistant.performer.i.v r1 = new com.google.android.libraries.search.assistant.performer.i.v
            r1.<init>(r0)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60922j.m93044g(r6, r1, r2)
            com.google.android.libraries.search.assistant.performer.i.w r1 = new com.google.android.libraries.search.assistant.performer.i.w
            r1.<init>(r0)
            java.lang.Class<java.lang.Exception> r0 = java.lang.Exception.class
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60846c.m92878g(r6, r0, r1, r2)
            goto L_0x008a
        L_0x004f:
            com.google.android.libraries.search.logging.d.kp r6 = r0.f94540d
            java.lang.String r0 = "FAILED_TO_CALL_ARP_CREATION"
            r6.mo41705t(r0)
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r0 = "Failed to delete reminder on ARP due to illegal state."
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r6, r0)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            goto L_0x008a
        L_0x0063:
            com.google.android.libraries.search.logging.d.kp r6 = r0.f94540d
            java.lang.String r0 = "INVALID_CLIENT_OP_ARGS"
            r6.mo41705t(r0)
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r0 = "Failed to delete reminder on ARP due to illegal arguments."
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r6, r0)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            goto L_0x008a
        L_0x0077:
            com.google.android.libraries.search.logging.d.kp r6 = r0.f94540d
            java.lang.String r0 = "FAILED_TO_GET_ARP_INSTANCE"
            r6.mo41705t(r0)
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r0 = "Failed to get ARP instance"
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r6, r0)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
        L_0x008a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2766i.C36177y.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
