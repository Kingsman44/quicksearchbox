package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.c */
/* compiled from: PG */
public final class C129665c {
    /* JADX WARNING: type inference failed for: r9v3, types: [com.google.protobuf.MessageLite] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129669g m211717a(android.os.Bundle r9) {
        /*
            java.lang.String r0 = "bundle"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.g r1 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.g
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "host"
            r4 = 33
            if (r2 < r4) goto L_0x0018
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            java.lang.Object r2 = r9.getParcelable(r3, r2)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            goto L_0x001c
        L_0x0018:
            android.os.Parcelable r2 = r9.getParcelable(r3)
        L_0x001c:
            if (r2 == 0) goto L_0x00ac
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.aa r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa.f355591c
            java.lang.String r5 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.protobuf.MessageLite r2 = com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128622a.m209916a(r9, r3, r2)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.aa r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa) r2
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "destination_content"
            if (r3 < r4) goto L_0x003a
            java.lang.Class<android.os.Parcelable> r3 = android.os.Parcelable.class
            java.lang.Object r3 = r9.getParcelable(r6, r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            goto L_0x003e
        L_0x003a:
            android.os.Parcelable r3 = r9.getParcelable(r6)
        L_0x003e:
            if (r3 == 0) goto L_0x00a4
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r3 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j.f355890c
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            com.google.protobuf.MessageLite r3 = com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128622a.m209916a(r9, r6, r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j) r3
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            java.lang.String r0 = "source"
            android.os.IBinder r0 = androidx.core.app.C1826m.m5004a(r9, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0060
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.m r6 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.m
            r6.<init>((android.os.IBinder) r0)
            goto L_0x0061
        L_0x0060:
            r6 = r5
        L_0x0061:
            if (r6 == 0) goto L_0x0080
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition
            java.lang.String r7 = "transition_type"
            r8 = -1
            int r7 = r9.getInt(r7, r8)
            if (r7 == r8) goto L_0x0078
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.f[] r8 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129668f.values()
            r7 = r8[r7]
            r0.<init>(r6, r7)
            goto L_0x0081
        L_0x0078:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bundle with source must contain transition type"
            r9.<init>(r0)
            throw r9
        L_0x0080:
            r0 = r5
        L_0x0081:
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = "invocation_token"
            if (r6 < r4) goto L_0x0090
            java.lang.Class<android.os.Parcelable> r4 = android.os.Parcelable.class
            java.lang.Object r4 = r9.getParcelable(r7, r4)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            goto L_0x0094
        L_0x0090:
            android.os.Parcelable r4 = r9.getParcelable(r7)
        L_0x0094:
            if (r4 != 0) goto L_0x0097
            goto L_0x00a0
        L_0x0097:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
            com.google.protobuf.MessageLite r9 = com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128622a.m209916a(r9, r7, r4)
            r5 = r9
            com.google.android.libraries.search.assistant.invocation.o.a.bp r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r5
        L_0x00a0:
            r1.<init>(r2, r3, r0, r5)
            return r1
        L_0x00a4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bundle must contain destination content"
            r9.<init>(r0)
            throw r9
        L_0x00ac:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bundle must contain a host"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129665c.m211717a(android.os.Bundle):com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.g");
    }
}
