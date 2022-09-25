package com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c;

import android.content.ContentResolver;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125909d;
import com.google.common.p4526f.C59071e;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.c */
/* compiled from: PG */
public final class C125908c {

    /* renamed from: c */
    private static final C59071e f346991c = C59071e.m91331h();

    /* renamed from: a */
    public final ContentResolver f346992a;

    /* renamed from: b */
    public final InputMethodManager f346993b;

    /* renamed from: d */
    private final C125909d f346994d;

    /* renamed from: e */
    private final C69585o f346995e;

    public C125908c(ContentResolver contentResolver, InputMethodManager inputMethodManager, C125909d dVar, C69585o oVar) {
        C69664n.m101061g(contentResolver, "contentResolver");
        C69664n.m101061g(inputMethodManager, "inputMethodManager");
        C69664n.m101061g(oVar, "backgroundContext");
        this.f346992a = contentResolver;
        this.f346993b = inputMethodManager;
        this.f346994d = dVar;
        this.f346995e = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107161a(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.C125903a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.a r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.C125903a) r0
            int r1 = r0.f346984d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346984d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.a r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f346982b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346984d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            java.lang.Object r0 = r0.f346981a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0047
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            p5462h.C69714l.m101134b(r6)
            r0.f346981a = r5
            r0.f346984d = r3
            h.c.o r6 = r5.f346995e
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.b r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.b
            r2.<init>(r5, r4)
            java.lang.Object r6 = kotlinx.coroutines.C71803m.m105040a(r6, r2, r0)
            if (r6 == r1) goto L_0x00d9
            r0 = r5
        L_0x0047:
            android.view.inputmethod.InputMethodInfo r6 = (android.view.inputmethod.InputMethodInfo) r6
            if (r6 != 0) goto L_0x0064
            com.google.common.f.e r6 = f346991c
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36753(0x8f91, float:5.1502E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "No active system input method! [SD]"
            r6.mo56386p(r0)
            return r4
        L_0x0064:
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.c r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.C125908c) r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.d r0 = r0.f346994d
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r2 = "activeKeyboardInfo.packageName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            boolean r0 = r0.mo107163b(r1)
            if (r0 != 0) goto L_0x0098
            com.google.common.f.e r0 = f346991c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r6 = r6.getPackageName()
            com.google.frameworks.client.a.a.b r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r6)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 36752(0x8f90, float:5.15E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Active keyboard (%s) not supported [SD]"
            r0.mo56389s(r1, r6)
            return r4
        L_0x0098:
            com.google.android.apps.search.assistant.surfaces.dictation.a.bv r0 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125094bv.f345092c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.surfaces.dictation.a.bu r0 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125093bu) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.String r1 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            java.lang.String r6 = r6.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.bv r1 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125094bv) r1
            r6.getClass()
            r1.f345094a = r6
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.search.assistant.surfaces.dictation.a.bv r6 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125094bv) r6
            java.lang.String r1 = "com.google.android.apps.inputmethod.libs.nga.impl.KeyboardDictationService"
            r6.f345095b = r1
            com.google.protobuf.bv r6 = r0.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            com.google.android.apps.search.assistant.surfaces.dictation.a.bv r6 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125094bv) r6
            return r6
        L_0x00d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.C125908c.mo107161a(h.c.g):java.lang.Object");
    }
}
