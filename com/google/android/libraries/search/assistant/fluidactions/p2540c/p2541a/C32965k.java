package com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.Slice;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32954a;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32971d;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32975h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.a.k */
/* compiled from: PG */
public final class C32965k {

    /* renamed from: a */
    public static final C59071e f88325a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.c.a.k");

    /* renamed from: b */
    public final Context f88326b;

    /* renamed from: c */
    public final C60888db f88327c;

    /* renamed from: d */
    public final Executor f88328d;

    /* renamed from: e */
    public final ConcurrentMap f88329e = new ConcurrentHashMap();

    /* renamed from: f */
    public final ConcurrentMap f88330f = new ConcurrentHashMap();

    /* renamed from: g */
    private final C4114m f88331g;

    /* renamed from: h */
    private final C32975h f88332h;

    public C32965k(Context context, C60888db dbVar, C4114m mVar, C32975h hVar) {
        this.f88326b = context;
        this.f88327c = dbVar;
        this.f88328d = new C60904dr(dbVar);
        this.f88331g = mVar;
        this.f88332h = hVar;
    }

    /* renamed from: a */
    public final Optional mo38409a(C32971d dVar) {
        Uri parse = Uri.parse((String) ((C32954a) dVar).f88288b.get());
        C32964j jVar = new C32964j(this, dVar);
        this.f88330f.put(dVar.toString(), jVar);
        try {
            this.f88331g.mo8628c(parse, jVar);
            return Optional.ofNullable(this.f88331g.mo8626a(parse));
        } catch (Resources.NotFoundException | IllegalArgumentException | NullPointerException | SecurityException e) {
            C59104x d = f88325a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SliceSettingMonitor");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(50676)).mo56386p("Can't access slice URI.");
            mo38411c(dVar);
            return Optional.empty();
        }
    }

    /* renamed from: c */
    public final void mo38411c(C32971d dVar) {
        C58976aa aaVar = C58975e.f156826a;
        Uri parse = Uri.parse((String) ((C32954a) dVar).f88288b.get());
        if (parse == null || this.f88331g == null) {
            C59104x d = f88325a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SliceSettingMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(50683)).mo56386p("Unable to unregisterCallback: sliceUri or sliceManager is null.");
            return;
        }
        C4113l lVar = (C4113l) this.f88330f.get(dVar.toString());
        if (lVar != null) {
            this.f88331g.mo8630e(parse, lVar);
            this.f88330f.remove(dVar.toString());
        }
        if (this.f88329e.containsKey(dVar.toString())) {
            this.f88329e.remove(dVar.toString());
        }
    }

    /* renamed from: d */
    public final void mo38412d(C32971d dVar, Slice slice) {
        C58976aa aaVar = C58975e.f156826a;
        this.f88329e.put(dVar.toString(), slice);
        mo38410b(dVar, slice);
    }

    /* renamed from: e */
    public final C60870cx mo38413e(C32971d dVar, int i) {
        if (i > 5) {
            C59104x d = f88325a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SliceSettingMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(50675)).mo56386p("Failed to load the slice, reached max attempts.");
            return C60856cj.m92900i(Optional.empty());
        }
        C58976aa aaVar = C58975e.f156826a;
        C32963i iVar = new C32963i(this, dVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(iVar), this.f88328d);
        C32961g gVar = new C32961g(this, dVar, i);
        return C60922j.m93045h(m, C47810es.m84966f(gVar), this.f88328d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.libraries.search.assistant.fluidactions.c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.google.android.libraries.search.assistant.fluidactions.c.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: com.google.android.libraries.search.assistant.fluidactions.c.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.libraries.search.assistant.fluidactions.c.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38410b(com.google.android.libraries.search.assistant.fluidactions.p2540c.C32971d r8, androidx.slice.Slice r9) {
        /*
            r7 = this;
            com.google.android.libraries.search.assistant.fluidactions.c.h r0 = r7.f88332h
            if (r0 == 0) goto L_0x0080
            android.content.Context r0 = r7.f88326b
            if (r9 != 0) goto L_0x0009
            goto L_0x0039
        L_0x0009:
            androidx.slice.i r1 = new androidx.slice.i
            r1.<init>(r0, r9)
            java.util.List r0 = r1.mo8619h()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0039
            android.content.Context r0 = r7.f88326b
            j$.util.Optional r9 = com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a.C32967m.m61035c(r9, r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r9 = r9.orElse(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r6 = r9.booleanValue()
            com.google.android.libraries.search.assistant.fluidactions.c.c r9 = new com.google.android.libraries.search.assistant.fluidactions.c.c
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x0075
        L_0x0039:
            android.content.Context r0 = r7.f88326b
            r1 = -1
            if (r9 != 0) goto L_0x0040
        L_0x003e:
            r0 = -1
            goto L_0x0053
        L_0x0040:
            androidx.slice.i r2 = new androidx.slice.i
            r2.<init>(r0, r9)
            androidx.core.i.e r0 = r2.mo8615d()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r0.f5888a
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0053:
            android.content.Context r2 = r7.f88326b
            if (r9 != 0) goto L_0x0058
            goto L_0x006b
        L_0x0058:
            androidx.slice.i r3 = new androidx.slice.i
            r3.<init>(r2, r9)
            androidx.core.i.e r2 = r3.mo8615d()
            if (r2 == 0) goto L_0x006b
            java.lang.Object r1 = r2.f5889b
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x006b:
            android.content.Context r2 = r7.f88326b
            int r9 = com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a.C32967m.m61033a(r9, r2)
            com.google.android.libraries.search.assistant.fluidactions.c.f r9 = com.google.android.libraries.search.assistant.fluidactions.p2540c.C32973f.m61046g(r8, r0, r1, r9)
        L_0x0075:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.search.assistant.fluidactions.c.h r0 = r7.f88332h
            java.lang.String r8 = r8.toString()
            r0.mo38406b(r8, r9)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a.C32965k.mo38410b(com.google.android.libraries.search.assistant.fluidactions.c.d, androidx.slice.Slice):void");
    }
}
